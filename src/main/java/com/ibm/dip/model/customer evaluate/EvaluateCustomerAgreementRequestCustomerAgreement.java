package com.ibm.dip.model.customer evaluate;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * EvaluateCustomerAgreementRequestCustomerAgreement
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-09-30T07:16:51.997Z[GMT]")

public class EvaluateCustomerAgreementRequestCustomerAgreement   {
  @JsonProperty("CustomerReference")
  private Object customerReference;

  @JsonProperty("LegalEntityReference")
  private Object legalEntityReference;

  @JsonProperty("AgreementType")
  private String agreementType;

  @JsonProperty("AgreementValidFromOrToDate")
  private String agreementValidFromOrToDate;

  @JsonProperty("AgreementSignatoriesOrResponsibleParties")
  private String agreementSignatoriesOrResponsibleParties;

  @JsonProperty("DocumentDirectoryEntryInstanceReference")
  private Object documentDirectoryEntryInstanceReference;

  @JsonProperty("SalesProductAgreementReference")
  private Object salesProductAgreementReference;

  @JsonProperty("PartyLife-cycleManagementReference")
  private Object partyLifeCycleManagementReference;

  public EvaluateCustomerAgreementRequestCustomerAgreement customerReference(Object customerReference) {
    this.customerReference = customerReference;
    return this;
  }

  /**
   * Get customerReference
   * @return customerReference
  */
  @ApiModelProperty(value = "")

  @Valid

  public Object getCustomerReference() {
    return customerReference;
  }

  public void setCustomerReference(Object customerReference) {
    this.customerReference = customerReference;
  }

  public EvaluateCustomerAgreementRequestCustomerAgreement legalEntityReference(Object legalEntityReference) {
    this.legalEntityReference = legalEntityReference;
    return this;
  }

  /**
   * Get legalEntityReference
   * @return legalEntityReference
  */
  @ApiModelProperty(value = "")

  @Valid

  public Object getLegalEntityReference() {
    return legalEntityReference;
  }

  public void setLegalEntityReference(Object legalEntityReference) {
    this.legalEntityReference = legalEntityReference;
  }

  public EvaluateCustomerAgreementRequestCustomerAgreement agreementType(String agreementType) {
    this.agreementType = agreementType;
    return this;
  }

  /**
   * Get agreementType
   * @return agreementType
  */
  @ApiModelProperty(value = "")


  public String getAgreementType() {
    return agreementType;
  }

  public void setAgreementType(String agreementType) {
    this.agreementType = agreementType;
  }

  public EvaluateCustomerAgreementRequestCustomerAgreement agreementValidFromOrToDate(String agreementValidFromOrToDate) {
    this.agreementValidFromOrToDate = agreementValidFromOrToDate;
    return this;
  }

  /**
   * Get agreementValidFromOrToDate
   * @return agreementValidFromOrToDate
  */
  @ApiModelProperty(value = "")


  public String getAgreementValidFromOrToDate() {
    return agreementValidFromOrToDate;
  }

  public void setAgreementValidFromOrToDate(String agreementValidFromOrToDate) {
    this.agreementValidFromOrToDate = agreementValidFromOrToDate;
  }

  public EvaluateCustomerAgreementRequestCustomerAgreement agreementSignatoriesOrResponsibleParties(String agreementSignatoriesOrResponsibleParties) {
    this.agreementSignatoriesOrResponsibleParties = agreementSignatoriesOrResponsibleParties;
    return this;
  }

  /**
   * Get agreementSignatoriesOrResponsibleParties
   * @return agreementSignatoriesOrResponsibleParties
  */
  @ApiModelProperty(value = "")


  public String getAgreementSignatoriesOrResponsibleParties() {
    return agreementSignatoriesOrResponsibleParties;
  }

  public void setAgreementSignatoriesOrResponsibleParties(String agreementSignatoriesOrResponsibleParties) {
    this.agreementSignatoriesOrResponsibleParties = agreementSignatoriesOrResponsibleParties;
  }

  public EvaluateCustomerAgreementRequestCustomerAgreement documentDirectoryEntryInstanceReference(Object documentDirectoryEntryInstanceReference) {
    this.documentDirectoryEntryInstanceReference = documentDirectoryEntryInstanceReference;
    return this;
  }

  /**
   * Get documentDirectoryEntryInstanceReference
   * @return documentDirectoryEntryInstanceReference
  */
  @ApiModelProperty(value = "")

  @Valid

  public Object getDocumentDirectoryEntryInstanceReference() {
    return documentDirectoryEntryInstanceReference;
  }

  public void setDocumentDirectoryEntryInstanceReference(Object documentDirectoryEntryInstanceReference) {
    this.documentDirectoryEntryInstanceReference = documentDirectoryEntryInstanceReference;
  }

  public EvaluateCustomerAgreementRequestCustomerAgreement salesProductAgreementReference(Object salesProductAgreementReference) {
    this.salesProductAgreementReference = salesProductAgreementReference;
    return this;
  }

  /**
   * Get salesProductAgreementReference
   * @return salesProductAgreementReference
  */
  @ApiModelProperty(value = "")

  @Valid

  public Object getSalesProductAgreementReference() {
    return salesProductAgreementReference;
  }

  public void setSalesProductAgreementReference(Object salesProductAgreementReference) {
    this.salesProductAgreementReference = salesProductAgreementReference;
  }

  public EvaluateCustomerAgreementRequestCustomerAgreement partyLifeCycleManagementReference(Object partyLifeCycleManagementReference) {
    this.partyLifeCycleManagementReference = partyLifeCycleManagementReference;
    return this;
  }

  /**
   * Get partyLifeCycleManagementReference
   * @return partyLifeCycleManagementReference
  */
  @ApiModelProperty(value = "")

  @Valid

  public Object getPartyLifeCycleManagementReference() {
    return partyLifeCycleManagementReference;
  }

  public void setPartyLifeCycleManagementReference(Object partyLifeCycleManagementReference) {
    this.partyLifeCycleManagementReference = partyLifeCycleManagementReference;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EvaluateCustomerAgreementRequestCustomerAgreement evaluateCustomerAgreementRequestCustomerAgreement = (EvaluateCustomerAgreementRequestCustomerAgreement) o;
    return Objects.equals(this.customerReference, evaluateCustomerAgreementRequestCustomerAgreement.customerReference) &&
        Objects.equals(this.legalEntityReference, evaluateCustomerAgreementRequestCustomerAgreement.legalEntityReference) &&
        Objects.equals(this.agreementType, evaluateCustomerAgreementRequestCustomerAgreement.agreementType) &&
        Objects.equals(this.agreementValidFromOrToDate, evaluateCustomerAgreementRequestCustomerAgreement.agreementValidFromOrToDate) &&
        Objects.equals(this.agreementSignatoriesOrResponsibleParties, evaluateCustomerAgreementRequestCustomerAgreement.agreementSignatoriesOrResponsibleParties) &&
        Objects.equals(this.documentDirectoryEntryInstanceReference, evaluateCustomerAgreementRequestCustomerAgreement.documentDirectoryEntryInstanceReference) &&
        Objects.equals(this.salesProductAgreementReference, evaluateCustomerAgreementRequestCustomerAgreement.salesProductAgreementReference) &&
        Objects.equals(this.partyLifeCycleManagementReference, evaluateCustomerAgreementRequestCustomerAgreement.partyLifeCycleManagementReference);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customerReference, legalEntityReference, agreementType, agreementValidFromOrToDate, agreementSignatoriesOrResponsibleParties, documentDirectoryEntryInstanceReference, salesProductAgreementReference, partyLifeCycleManagementReference);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EvaluateCustomerAgreementRequestCustomerAgreement {\n");
    
    sb.append("    customerReference: ").append(toIndentedString(customerReference)).append("\n");
    sb.append("    legalEntityReference: ").append(toIndentedString(legalEntityReference)).append("\n");
    sb.append("    agreementType: ").append(toIndentedString(agreementType)).append("\n");
    sb.append("    agreementValidFromOrToDate: ").append(toIndentedString(agreementValidFromOrToDate)).append("\n");
    sb.append("    agreementSignatoriesOrResponsibleParties: ").append(toIndentedString(agreementSignatoriesOrResponsibleParties)).append("\n");
    sb.append("    documentDirectoryEntryInstanceReference: ").append(toIndentedString(documentDirectoryEntryInstanceReference)).append("\n");
    sb.append("    salesProductAgreementReference: ").append(toIndentedString(salesProductAgreementReference)).append("\n");
    sb.append("    partyLifeCycleManagementReference: ").append(toIndentedString(partyLifeCycleManagementReference)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

