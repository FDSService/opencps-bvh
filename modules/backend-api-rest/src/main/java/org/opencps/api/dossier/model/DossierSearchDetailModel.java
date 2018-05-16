//
//This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
//See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
//Any modifications to this file will be lost upon recompilation of the source schema. 
//Generated on: 2017.10.23 at 09:44:18 AM ICT 
//


package org.opencps.api.dossier.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
* <p>Java class for anonymous complex type.
* 
* <p>The following schema fragment specifies the expected content contained within this class.
* 
* <pre>
* &lt;complexType>
*   &lt;complexContent>
*     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
*       &lt;sequence>
*         &lt;element name="dossierId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
*         &lt;element name="userId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
*         &lt;element name="userName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
*         &lt;element name="createDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
*         &lt;element name="modifiedDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
*         &lt;element name="referenceUid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
*         &lt;element name="counter" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
*         &lt;element name="serviceCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
*         &lt;element name="serviceName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
*         &lt;element name="govAgencyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
*         &lt;element name="govAgencyName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
*         &lt;element name="dossierTemplateNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
*         &lt;element name="applicantName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
*         &lt;element name="applicantIdType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
*         &lt;element name="applicantIdNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
*         &lt;element name="applicantIdDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
*         &lt;element name="address" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
*         &lt;element name="cityCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
*         &lt;element name="cityName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
*         &lt;element name="districtCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
*         &lt;element name="districtName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
*         &lt;element name="wardCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
*         &lt;element name="wardName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
*         &lt;element name="contactName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
*         &lt;element name="contactTelNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
*         &lt;element name="contactEmail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
*         &lt;element name="dossierNote" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
*         &lt;element name="submissionNote" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
*         &lt;element name="briefNote" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
*         &lt;element name="dossierNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
*         &lt;element name="submitting" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
*         &lt;element name="submitDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
*         &lt;element name="receiveDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
*         &lt;element name="dueDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
*         &lt;element name="releaseDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
*         &lt;element name="finishDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
*         &lt;element name="cancellingDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
*         &lt;element name="correctingDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
*         &lt;element name="dossierStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
*         &lt;element name="dossierStatusText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
*         &lt;element name="dossierSubStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
*         &lt;element name="dossierSubStatusText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
*         &lt;element name="viaPostal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
*         &lt;element name="postalAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
*         &lt;element name="postalCityCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
*         &lt;element name="postalCityName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
*         &lt;element name="postalTelNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
*         &lt;element name="permission" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
*         &lt;element name="lastActionDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
*         &lt;element name="lastActionCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
*         &lt;element name="lastActionName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
*         &lt;element name="lastActionUser" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
*         &lt;element name="lastActionNote" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
*         &lt;element name="stepCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
*         &lt;element name="stepName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
*         &lt;element name="stepInstruction" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
*         &lt;element name="stepDuedate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
*         &lt;element name="stepOverdue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
*         &lt;element name="visited" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
*         &lt;element name="pending" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
*         &lt;element name="applicantNote" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
*         &lt;element name="notification" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
*         &lt;element name="online" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
*       &lt;/sequence>
*     &lt;/restriction>
*   &lt;/complexContent>
* &lt;/complexType>
* </pre>
* 
* 
*/
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
 "dossierIdCTN",
 "userName",
 "serviceName",
 "govAgencyName",
 "dossierNo",
 "submitDate",
 "dueDate"
})
@XmlRootElement(name = "DossierDetailModel")
public class DossierSearchDetailModel {
	protected String dossierIdCTN;
	protected String userName;
	protected String govAgencyName;
	protected String dossierNo;
	protected String submitDate;
	protected String dueDate;

	public String getDossierIdCTN() {
		return dossierIdCTN;
	}

	public void setDossierIdCTN(String dossierIdCTN) {
		this.dossierIdCTN = dossierIdCTN;
	}

 /**
  * Gets the value of the userName property.
  * 
  * @return
  *     possible object is
  *     {@link String }
  *     
  */
 public String getUserName() {
     return userName;
 }

 /**
  * Sets the value of the userName property.
  * 
  * @param value
  *     allowed object is
  *     {@link String }
  *     
  */
 public void setUserName(String value) {
     this.userName = value;
 }

 /**
  * Gets the value of the govAgencyName property.
  * 
  * @return
  *     possible object is
  *     {@link String }
  *     
  */
 public String getGovAgencyName() {
     return govAgencyName;
 }

 /**
  * Sets the value of the govAgencyName property.
  * 
  * @param value
  *     allowed object is
  *     {@link String }
  *     
  */
 public void setGovAgencyName(String value) {
     this.govAgencyName = value;
 }

 /**
  * Gets the value of the dossierNo property.
  * 
  * @return
  *     possible object is
  *     {@link String }
  *     
  */
 public String getDossierNo() {
     return dossierNo;
 }

 /**
  * Sets the value of the dossierNo property.
  * 
  * @param value
  *     allowed object is
  *     {@link String }
  *     
  */
 public void setDossierNo(String value) {
     this.dossierNo = value;
 }

 /**
  * Gets the value of the submitDate property.
  * 
  * @return
  *     possible object is
  *     {@link String }
  *     
  */
 public String getSubmitDate() {
     return submitDate;
 }

 /**
  * Sets the value of the submitDate property.
  * 
  * @param value
  *     allowed object is
  *     {@link String }
  *     
  */
 public void setSubmitDate(String value) {
     this.submitDate = value;
 }

 /**
  * Gets the value of the dueDate property.
  * 
  * @return
  *     possible object is
  *     {@link String }
  *     
  */
 public String getDueDate() {
     return dueDate;
 }

 /**
  * Sets the value of the dueDate property.
  * 
  * @param value
  *     allowed object is
  *     {@link String }
  *     
  */
 public void setDueDate(String value) {
     this.dueDate = value;
 }

}
