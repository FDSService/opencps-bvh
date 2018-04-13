package org.opencps.dossiermgt.listenner;

import java.util.List;

import org.opencps.dossiermgt.model.DossierAction;
import org.opencps.dossiermgt.model.DossierFile;
import org.opencps.dossiermgt.model.DossierLog;
import org.opencps.dossiermgt.model.ProcessAction;
import org.opencps.dossiermgt.service.DossierFileLocalServiceUtil;
import org.opencps.dossiermgt.service.DossierLogLocalServiceUtil;
import org.opencps.dossiermgt.service.ProcessActionLocalServiceUtil;
import org.opencps.dossiermgt.service.impl.ProcessActionLocalServiceImpl;
import org.opencps.usermgt.action.impl.EmployeeActions;
import org.opencps.usermgt.action.impl.JobposActions;
import org.opencps.usermgt.model.Employee;
import org.opencps.usermgt.model.JobPos;
import org.osgi.service.component.annotations.Component;

import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.exception.ModelListenerException;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.json.JSONArray;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.model.BaseModelListener;
import com.liferay.portal.kernel.model.ModelListener;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.Validator;

import backend.utils.APIDateTimeUtils;

@Component(immediate = true, service = ModelListener.class)
public class DossierActionListenner extends BaseModelListener<DossierAction> {
	@Override
	public void onAfterCreate(DossierAction model) throws ModelListenerException {

		if (true) {

			ServiceContext serviceContext = new ServiceContext();

			EmployeeActions employeeActions = new EmployeeActions();

			JobposActions jobposActions = new JobposActions();

			try {

				long userId = model.getUserId();

				Employee employee = employeeActions.getEmployeeByMappingUserId(model.getGroupId(), userId);

				long mainJobposId = employee != null ? employee.getMainJobPostId() : 0;

				long dossierId = model.getDossierId();

				String jobPosName = StringPool.BLANK;

				if (mainJobposId > 0) {

					JobPos jobPos = jobposActions.getJobPos(mainJobposId);

					jobPosName = (jobPos != null && Validator.isNotNull(jobPos.getTitle())) ? jobPos.getTitle()
							: StringPool.BLANK;
				}

				String content = model.getActionNote();

				JSONObject payload = JSONFactoryUtil.createJSONObject();

				JSONArray files = JSONFactoryUtil.createJSONArray();

				if (dossierId > 0) {

					List<DossierLog> dossierLogs = DossierLogLocalServiceUtil.getByDossierAndType(dossierId,
							DossierFileListenerMessageKeys.DOSSIER_LOG_CREATE_TYPE, QueryUtil.ALL_POS,
							QueryUtil.ALL_POS);

					for (DossierLog log : dossierLogs) {
						long dossierFileId = 0;

						try {
							JSONObject payloadFile = JSONFactoryUtil.createJSONObject(log.getPayload());

							dossierFileId = GetterUtil.getLong(payloadFile.get("dossierFileId"));
						} catch (Exception e) {

						}

						if (dossierFileId != 0) {
							DossierFile dossierFile = DossierFileLocalServiceUtil.fetchDossierFile(dossierFileId);

							if (Validator.isNotNull(dossierFile)) {
								JSONObject file = JSONFactoryUtil.createJSONObject();

								file.put("dossierFileId", dossierFile.getDossierFileId());
								file.put("fileName", dossierFile.getDisplayName());
								file.put("createDate", APIDateTimeUtils.convertDateToString(dossierFile.getCreateDate(),
										APIDateTimeUtils._TIMESTAMP));
								files.put(file);
							}
						}

						DossierLogLocalServiceUtil.deleteDossierLog(log);

					}

<<<<<<< HEAD
					}
=======
				}
>>>>>>> refs/remotes/upstream/develop-bvh

				payload.put("jobPosName", jobPosName);
				payload.put("stepName", model.getActionName());
				payload.put("stepInstruction", model.getStepInstruction());
				payload.put("files", files);

				serviceContext.setCompanyId(model.getCompanyId());
				serviceContext.setUserId(userId);

				ProcessAction processAction = ProcessActionLocalServiceUtil
						.getByNameActionNo(model.getServiceProcessId(), model.getActionCode(), model.getActionName());

				boolean ok = true;

				if (Validator.isNotNull(processAction)) {
					if (processAction.getPreCondition().contains("cancelling")
							|| processAction.getPreCondition().contains("correcting")
							|| processAction.getPreCondition().contains("submit")) {
						ok = false;
						
						_log.info("CHECK CONDITION OK ********** ....." + ok);

					}
				} else {
					_log.info("CANT GET DOSSIER ACTION ********** .....");
				}
				
				
				if (ok) {
<<<<<<< HEAD
				DossierLogLocalServiceUtil.addDossierLog(model.getGroupId(), model.getDossierId(),
						model.getActionUser(), content, "PROCESS_TYPE", payload.toString(), serviceContext);
=======
					DossierLogLocalServiceUtil.addDossierLog(model.getGroupId(), model.getDossierId(),
							model.getActionUser(), content, "PROCESS_TYPE", payload.toString(), serviceContext);
>>>>>>> refs/remotes/upstream/develop-bvh
				}

			} catch (SystemException | PortalException e) {
				_log.error(e);
			}
		}

		if (Validator.isNotNull(model.getSyncActionCode()) && model.getSyncActionCode().length() != 0) {
			String content = "On DossiserAction Created";
			String notificationType = "";
			String payload = "";

			ServiceContext serviceContext = new ServiceContext();
			serviceContext.setCompanyId(model.getCompanyId());
			serviceContext.setUserId(model.getUserId());

			try {
				DossierLogLocalServiceUtil.addDossierLog(model.getGroupId(), model.getDossierId(), model.getUserName(),
						content, notificationType, payload, serviceContext);
			} catch (SystemException | PortalException e) {
				_log.error(e);
			}
		}
	}

	private Log _log = LogFactoryUtil.getLog(DossierActionListenner.class.getName());
}
