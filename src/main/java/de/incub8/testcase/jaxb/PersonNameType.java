//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.09.07 at 01:27:28 PM CEST 
//


package de.incub8.testcase.jaxb;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * This provides name information for a person.
 * 
 * <p>Java class for PersonNameType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PersonNameType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="NamePrefix" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to16" maxOccurs="3" minOccurs="0"/&gt;
 *         &lt;element name="GivenName" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to64" maxOccurs="5" minOccurs="0"/&gt;
 *         &lt;element name="MiddleName" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to64" maxOccurs="3" minOccurs="0"/&gt;
 *         &lt;element name="SurnamePrefix" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to16" minOccurs="0"/&gt;
 *         &lt;element name="Surname" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to64"/&gt;
 *         &lt;element name="NameSuffix" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to16" maxOccurs="3" minOccurs="0"/&gt;
 *         &lt;element name="NameTitle" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to16" maxOccurs="5" minOccurs="0"/&gt;
 *         &lt;element name="Document" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;attribute name="DocID" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to32" /&gt;
 *                 &lt;attribute name="DocType" type="{http://www.opentravel.org/OTA/2003/05}OTA_CodeType" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}PrivacyGroup"/&gt;
 *       &lt;attribute name="NameType" type="{http://www.opentravel.org/OTA/2003/05}OTA_CodeType" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PersonNameType", propOrder = {
    "namePrefixes",
    "givenNames",
    "middleNames",
    "surnamePrefix",
    "surname",
    "nameSuffixes",
    "nameTitles",
    "document"
})
public class PersonNameType {

    @XmlElement(name = "NamePrefix")
    protected List<String> namePrefixes;
    @XmlElement(name = "GivenName")
    protected List<String> givenNames;
    @XmlElement(name = "MiddleName")
    protected List<String> middleNames;
    @XmlElement(name = "SurnamePrefix")
    protected String surnamePrefix;
    @XmlElement(name = "Surname", required = true)
    protected String surname;
    @XmlElement(name = "NameSuffix")
    protected List<String> nameSuffixes;
    @XmlElement(name = "NameTitle")
    protected List<String> nameTitles;
    @XmlElement(name = "Document")
    protected PersonNameType.Document document;
    @XmlAttribute(name = "NameType")
    protected String nameType;
    @XmlAttribute(name = "ShareSynchInd")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String shareSynchInd;
    @XmlAttribute(name = "ShareMarketInd")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String shareMarketInd;

    /**
     * Gets the value of the namePrefixes property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the namePrefixes property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNamePrefixes().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     *
     *
     */
    public List<String> getNamePrefixes() {
        if (namePrefixes == null) {
            namePrefixes = new ArrayList<String>();
        }
        return this.namePrefixes;
    }

    /**
     * Gets the value of the givenNames property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the givenNames property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGivenNames().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     *
     *
     */
    public List<String> getGivenNames() {
        if (givenNames == null) {
            givenNames = new ArrayList<String>();
        }
        return this.givenNames;
    }

    /**
     * Gets the value of the middleNames property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the middleNames property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMiddleNames().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     *
     *
     */
    public List<String> getMiddleNames() {
        if (middleNames == null) {
            middleNames = new ArrayList<String>();
        }
        return this.middleNames;
    }

    /**
     * Gets the value of the surnamePrefix property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getSurnamePrefix() {
        return surnamePrefix;
    }

    /**
     * Sets the value of the surnamePrefix property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setSurnamePrefix(String value) {
        this.surnamePrefix = value;
    }

    /**
     * Gets the value of the surname property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getSurname() {
        return surname;
    }

    /**
     * Sets the value of the surname property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setSurname(String value) {
        this.surname = value;
    }

    /**
     * Gets the value of the nameSuffixes property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the nameSuffixes property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNameSuffixes().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     *
     *
     */
    public List<String> getNameSuffixes() {
        if (nameSuffixes == null) {
            nameSuffixes = new ArrayList<String>();
        }
        return this.nameSuffixes;
    }

    /**
     * Gets the value of the nameTitles property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the nameTitles property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNameTitles().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     *
     *
     */
    public List<String> getNameTitles() {
        if (nameTitles == null) {
            nameTitles = new ArrayList<String>();
        }
        return this.nameTitles;
    }

    /**
     * Gets the value of the document property.
     *
     * @return
     *     possible object is
     *     {@link PersonNameType.Document }
     *
     */
    public PersonNameType.Document getDocument() {
        return document;
    }

    /**
     * Sets the value of the document property.
     *
     * @param value
     *     allowed object is
     *     {@link PersonNameType.Document }
     *
     */
    public void setDocument(PersonNameType.Document value) {
        this.document = value;
    }

    /**
     * Gets the value of the nameType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNameType() {
        return nameType;
    }

    /**
     * Sets the value of the nameType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNameType(String value) {
        this.nameType = value;
    }

    /**
     * Gets the value of the shareSynchInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShareSynchInd() {
        return shareSynchInd;
    }

    /**
     * Sets the value of the shareSynchInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShareSynchInd(String value) {
        this.shareSynchInd = value;
    }

    /**
     * Gets the value of the shareMarketInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShareMarketInd() {
        return shareMarketInd;
    }

    /**
     * Sets the value of the shareMarketInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShareMarketInd(String value) {
        this.shareMarketInd = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;attribute name="DocID" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to32" /&gt;
     *       &lt;attribute name="DocType" type="{http://www.opentravel.org/OTA/2003/05}OTA_CodeType" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Document {

        @XmlAttribute(name = "DocID")
        protected String docID;
        @XmlAttribute(name = "DocType")
        protected String docType;

        /**
         * Gets the value of the docID property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDocID() {
            return docID;
        }

        /**
         * Sets the value of the docID property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDocID(String value) {
            this.docID = value;
        }

        /**
         * Gets the value of the docType property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDocType() {
            return docType;
        }

        /**
         * Sets the value of the docType property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDocType(String value) {
            this.docType = value;
        }

    }

}
