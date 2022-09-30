package com.ibm.dip.model.customer evaluate;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * EvaluateLegalTermsRequestCustomerAgreement
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-09-30T07:16:51.997Z[GMT]")

public class EvaluateLegalTermsRequestCustomerAgreement   {
  @JsonProperty("CustomerReference")
  private Object customerReference;

  @JsonProperty("LegalEntityReference")
  private Object legalEntityReference;

  @JsonProperty("AgreementType")
  private String agreementType;

  @JsonProperty("AgreementJurisdiction")
  private String agreementJurisdiction;

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

  public EvaluateLegalTermsRequestCustomerAgreement customerReference(Object customerReference) {
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

  public EvaluateLegalTermsRequestCustomerAgreement legalEntityReference(Object legalEntityReference) {
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

  public EvaluateLegalTermsRequestCustomerAgreement agreementType(String agreementType) {
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

  public EvaluateLegalTermsRequestCustomerAgreement agreementJurisdiction(String agreementJurisdiction) {
    this.agreementJurisdiction = agreementJurisdiction;
    return this;
  }

  /**
   * Get agreementJurisdiction
   * @return agreementJurisdiction
  */
  @ApiModelProperty(value = "")


  public String getAgreementJurisdiction() {
    return agreementJurisdiction;
  }

  public void setAgreementJurisdiction(String agreementJurisdiction) {
    this.agreementJurisdiction = agreementJurisdiction;
  }

  public EvaluateLegalTermsRequestCustomerAgreement agreementValidFromOrToDate(String agreementValidFromOrToDate) {
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

  public EvaluateLegalTermsRequestCustomerAgreement agreementSignatoriesOrResponsibleParties(String agreementSignatoriesOrResponsibleParties) {
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

  public EvaluateLegalTermsRequestCustomerAgreement documentDirectoryEntryInstanceReference(Object documentDirectoryEntryInstanceReference) {
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

  public EvaluateLegalTermsRequestCustomerAgreement salesProductAgreementReference(Object salesProductAgreementReference) {
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

  public EvaluateLegalTermsRequestCustomerAgreement partyLifeCycleManagementReference(Object partyLifeCycleManagementReference) {
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
    EvaluateLegalTermsRequestCustomerAgreement evaluateLegalTermsRequestCustomerAgreement = (EvaluateLegalTermsRequestCustomerAgreement) o;
    return Objects.equals(this.customerReference, evaluateLegalTermsRequestCustomerAgreement.customerReference) &&
        Objects.equals(this.legalEntityReference, evaluateLegalTermsRequestCustomerAgreement.legalEntityReference) &&
        Objects.equals(this.agreementType, evaluateLegalTermsRequestCustomerAgreement.agreementType) &&
        Objects.equals(this.agreementJurisdiction, evaluateLegalTermsRequestCustomerAgreement.agreementJurisdiction) &&
        Objects.equals(this.agreementValidFromOrToDate, evaluateLegalTermsRequestCustomerAgreement.agreementValidFromOrToDate) &&
        Objects.equals(this.agreementSignatoriesOrResponsibleParties, evaluateLegalTermsRequestCustomerAgreement.agreementSignatoriesOrResponsibleParties) &&
        Objects.equals(this.documentDirectoryEntryInstanceReference, evaluateLegalTermsRequestCustomerAgreement.documentDirectoryEntryInstanceReference) &&
        Objects.equals(this.salesProductAgreementReference, evaluateLegalTermsRequestCustomerAgreement.salesProductAgreementReference) &&
        Objects.equals(this.partyLifeCycleManagementReference, evaluateLegalTermsRequestCustomerAgreement.partyLifeCycleManagementReference);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customerReference, legalEntityReference, agreementType, agreementJurisdiction, agreementValidFromOrToDate, agreementSignatoriesOrResponsibleParties, documentDirectoryEntryInstanceReference, salesProductAgreementReference, partyLifeCycleManagementReference);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EvaluateLegalTermsRequestCustomerAgreement {\n");
    
    sb.append("    customerReference: ").append(toIndentedString(customerReference)).append("\n");
    sb.append("    legalEntityReference: ").append(toIndentedString(legalEntityReference)).append("\n");
    sb.append("    agreementType: ").append(toIndentedString(agreementType)).append("\n");
    sb.append("    agreementJurisdiction: ").append(toIndentedString(agreementJurisdiction)).append("\n");
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

