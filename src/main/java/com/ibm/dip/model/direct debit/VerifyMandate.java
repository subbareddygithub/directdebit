package com.ibm.dip.model.direct debit;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * VerifyMandate
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-09-30T07:16:56.597Z[GMT]")

public class VerifyMandate   {
  @JsonProperty("VerifyMandatePreconditions")
  private String verifyMandatePreconditions;

  @JsonProperty("VerifyMandateFeatureSchedule")
  private String verifyMandateFeatureSchedule;

  @JsonProperty("DirectDebitMandateCheck")
  private Object directDebitMandateCheck;

  @JsonProperty("VerifyMandatePostconditions")
  private String verifyMandatePostconditions;

  @JsonProperty("VerifyMandateDirectDebitMandateCheckServiceType")
  private String verifyMandateDirectDebitMandateCheckServiceType;

  @JsonProperty("VerifyMandateDirectDebitMandateCheckServiceDescription")
  private String verifyMandateDirectDebitMandateCheckServiceDescription;

  @JsonProperty("VerifyMandateDirectDebitMandateCheckServiceInputsandOuputs")
  private String verifyMandateDirectDebitMandateCheckServiceInputsandOuputs;

  @JsonProperty("VerifyMandateDirectDebitMandateCheckServiceWorkProduct")
  private String verifyMandateDirectDebitMandateCheckServiceWorkProduct;

  @JsonProperty("VerifyMandateDirectDebitMandateCheckServiceName")
  private String verifyMandateDirectDebitMandateCheckServiceName;

  public VerifyMandate verifyMandatePreconditions(String verifyMandatePreconditions) {
    this.verifyMandatePreconditions = verifyMandatePreconditions;
    return this;
  }

  /**
   * Get verifyMandatePreconditions
   * @return verifyMandatePreconditions
  */
  @ApiModelProperty(value = "")


  public String getVerifyMandatePreconditions() {
    return verifyMandatePreconditions;
  }

  public void setVerifyMandatePreconditions(String verifyMandatePreconditions) {
    this.verifyMandatePreconditions = verifyMandatePreconditions;
  }

  public VerifyMandate verifyMandateFeatureSchedule(String verifyMandateFeatureSchedule) {
    this.verifyMandateFeatureSchedule = verifyMandateFeatureSchedule;
    return this;
  }

  /**
   * Get verifyMandateFeatureSchedule
   * @return verifyMandateFeatureSchedule
  */
  @ApiModelProperty(value = "")


  public String getVerifyMandateFeatureSchedule() {
    return verifyMandateFeatureSchedule;
  }

  public void setVerifyMandateFeatureSchedule(String verifyMandateFeatureSchedule) {
    this.verifyMandateFeatureSchedule = verifyMandateFeatureSchedule;
  }

  public VerifyMandate directDebitMandateCheck(Object directDebitMandateCheck) {
    this.directDebitMandateCheck = directDebitMandateCheck;
    return this;
  }

  /**
   * Get directDebitMandateCheck
   * @return directDebitMandateCheck
  */
  @ApiModelProperty(value = "")

  @Valid

  public Object getDirectDebitMandateCheck() {
    return directDebitMandateCheck;
  }

  public void setDirectDebitMandateCheck(Object directDebitMandateCheck) {
    this.directDebitMandateCheck = directDebitMandateCheck;
  }

  public VerifyMandate verifyMandatePostconditions(String verifyMandatePostconditions) {
    this.verifyMandatePostconditions = verifyMandatePostconditions;
    return this;
  }

  /**
   * Get verifyMandatePostconditions
   * @return verifyMandatePostconditions
  */
  @ApiModelProperty(value = "")


  public String getVerifyMandatePostconditions() {
    return verifyMandatePostconditions;
  }

  public void setVerifyMandatePostconditions(String verifyMandatePostconditions) {
    this.verifyMandatePostconditions = verifyMandatePostconditions;
  }

  public VerifyMandate verifyMandateDirectDebitMandateCheckServiceType(String verifyMandateDirectDebitMandateCheckServiceType) {
    this.verifyMandateDirectDebitMandateCheckServiceType = verifyMandateDirectDebitMandateCheckServiceType;
    return this;
  }

  /**
   * Get verifyMandateDirectDebitMandateCheckServiceType
   * @return verifyMandateDirectDebitMandateCheckServiceType
  */
  @ApiModelProperty(value = "")


  public String getVerifyMandateDirectDebitMandateCheckServiceType() {
    return verifyMandateDirectDebitMandateCheckServiceType;
  }

  public void setVerifyMandateDirectDebitMandateCheckServiceType(String verifyMandateDirectDebitMandateCheckServiceType) {
    this.verifyMandateDirectDebitMandateCheckServiceType = verifyMandateDirectDebitMandateCheckServiceType;
  }

  public VerifyMandate verifyMandateDirectDebitMandateCheckServiceDescription(String verifyMandateDirectDebitMandateCheckServiceDescription) {
    this.verifyMandateDirectDebitMandateCheckServiceDescription = verifyMandateDirectDebitMandateCheckServiceDescription;
    return this;
  }

  /**
   * Get verifyMandateDirectDebitMandateCheckServiceDescription
   * @return verifyMandateDirectDebitMandateCheckServiceDescription
  */
  @ApiModelProperty(value = "")


  public String getVerifyMandateDirectDebitMandateCheckServiceDescription() {
    return verifyMandateDirectDebitMandateCheckServiceDescription;
  }

  public void setVerifyMandateDirectDebitMandateCheckServiceDescription(String verifyMandateDirectDebitMandateCheckServiceDescription) {
    this.verifyMandateDirectDebitMandateCheckServiceDescription = verifyMandateDirectDebitMandateCheckServiceDescription;
  }

  public VerifyMandate verifyMandateDirectDebitMandateCheckServiceInputsandOuputs(String verifyMandateDirectDebitMandateCheckServiceInputsandOuputs) {
    this.verifyMandateDirectDebitMandateCheckServiceInputsandOuputs = verifyMandateDirectDebitMandateCheckServiceInputsandOuputs;
    return this;
  }

  /**
   * Get verifyMandateDirectDebitMandateCheckServiceInputsandOuputs
   * @return verifyMandateDirectDebitMandateCheckServiceInputsandOuputs
  */
  @ApiModelProperty(value = "")


  public String getVerifyMandateDirectDebitMandateCheckServiceInputsandOuputs() {
    return verifyMandateDirectDebitMandateCheckServiceInputsandOuputs;
  }

  public void setVerifyMandateDirectDebitMandateCheckServiceInputsandOuputs(String verifyMandateDirectDebitMandateCheckServiceInputsandOuputs) {
    this.verifyMandateDirectDebitMandateCheckServiceInputsandOuputs = verifyMandateDirectDebitMandateCheckServiceInputsandOuputs;
  }

  public VerifyMandate verifyMandateDirectDebitMandateCheckServiceWorkProduct(String verifyMandateDirectDebitMandateCheckServiceWorkProduct) {
    this.verifyMandateDirectDebitMandateCheckServiceWorkProduct = verifyMandateDirectDebitMandateCheckServiceWorkProduct;
    return this;
  }

  /**
   * Get verifyMandateDirectDebitMandateCheckServiceWorkProduct
   * @return verifyMandateDirectDebitMandateCheckServiceWorkProduct
  */
  @ApiModelProperty(value = "")


  public String getVerifyMandateDirectDebitMandateCheckServiceWorkProduct() {
    return verifyMandateDirectDebitMandateCheckServiceWorkProduct;
  }

  public void setVerifyMandateDirectDebitMandateCheckServiceWorkProduct(String verifyMandateDirectDebitMandateCheckServiceWorkProduct) {
    this.verifyMandateDirectDebitMandateCheckServiceWorkProduct = verifyMandateDirectDebitMandateCheckServiceWorkProduct;
  }

  public VerifyMandate verifyMandateDirectDebitMandateCheckServiceName(String verifyMandateDirectDebitMandateCheckServiceName) {
    this.verifyMandateDirectDebitMandateCheckServiceName = verifyMandateDirectDebitMandateCheckServiceName;
    return this;
  }

  /**
   * Get verifyMandateDirectDebitMandateCheckServiceName
   * @return verifyMandateDirectDebitMandateCheckServiceName
  */
  @ApiModelProperty(value = "")


  public String getVerifyMandateDirectDebitMandateCheckServiceName() {
    return verifyMandateDirectDebitMandateCheckServiceName;
  }

  public void setVerifyMandateDirectDebitMandateCheckServiceName(String verifyMandateDirectDebitMandateCheckServiceName) {
    this.verifyMandateDirectDebitMandateCheckServiceName = verifyMandateDirectDebitMandateCheckServiceName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VerifyMandate verifyMandate = (VerifyMandate) o;
    return Objects.equals(this.verifyMandatePreconditions, verifyMandate.verifyMandatePreconditions) &&
        Objects.equals(this.verifyMandateFeatureSchedule, verifyMandate.verifyMandateFeatureSchedule) &&
        Objects.equals(this.directDebitMandateCheck, verifyMandate.directDebitMandateCheck) &&
        Objects.equals(this.verifyMandatePostconditions, verifyMandate.verifyMandatePostconditions) &&
        Objects.equals(this.verifyMandateDirectDebitMandateCheckServiceType, verifyMandate.verifyMandateDirectDebitMandateCheckServiceType) &&
        Objects.equals(this.verifyMandateDirectDebitMandateCheckServiceDescription, verifyMandate.verifyMandateDirectDebitMandateCheckServiceDescription) &&
        Objects.equals(this.verifyMandateDirectDebitMandateCheckServiceInputsandOuputs, verifyMandate.verifyMandateDirectDebitMandateCheckServiceInputsandOuputs) &&
        Objects.equals(this.verifyMandateDirectDebitMandateCheckServiceWorkProduct, verifyMandate.verifyMandateDirectDebitMandateCheckServiceWorkProduct) &&
        Objects.equals(this.verifyMandateDirectDebitMandateCheckServiceName, verifyMandate.verifyMandateDirectDebitMandateCheckServiceName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(verifyMandatePreconditions, verifyMandateFeatureSchedule, directDebitMandateCheck, verifyMandatePostconditions, verifyMandateDirectDebitMandateCheckServiceType, verifyMandateDirectDebitMandateCheckServiceDescription, verifyMandateDirectDebitMandateCheckServiceInputsandOuputs, verifyMandateDirectDebitMandateCheckServiceWorkProduct, verifyMandateDirectDebitMandateCheckServiceName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VerifyMandate {\n");
    
    sb.append("    verifyMandatePreconditions: ").append(toIndentedString(verifyMandatePreconditions)).append("\n");
    sb.append("    verifyMandateFeatureSchedule: ").append(toIndentedString(verifyMandateFeatureSchedule)).append("\n");
    sb.append("    directDebitMandateCheck: ").append(toIndentedString(directDebitMandateCheck)).append("\n");
    sb.append("    verifyMandatePostconditions: ").append(toIndentedString(verifyMandatePostconditions)).append("\n");
    sb.append("    verifyMandateDirectDebitMandateCheckServiceType: ").append(toIndentedString(verifyMandateDirectDebitMandateCheckServiceType)).append("\n");
    sb.append("    verifyMandateDirectDebitMandateCheckServiceDescription: ").append(toIndentedString(verifyMandateDirectDebitMandateCheckServiceDescription)).append("\n");
    sb.append("    verifyMandateDirectDebitMandateCheckServiceInputsandOuputs: ").append(toIndentedString(verifyMandateDirectDebitMandateCheckServiceInputsandOuputs)).append("\n");
    sb.append("    verifyMandateDirectDebitMandateCheckServiceWorkProduct: ").append(toIndentedString(verifyMandateDirectDebitMandateCheckServiceWorkProduct)).append("\n");
    sb.append("    verifyMandateDirectDebitMandateCheckServiceName: ").append(toIndentedString(verifyMandateDirectDebitMandateCheckServiceName)).append("\n");
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

