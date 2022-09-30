package com.ibm.dip.model.direct debit;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * FundsAvailableCheck
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-09-30T07:16:56.597Z[GMT]")

public class FundsAvailableCheck   {
  @JsonProperty("FundsAvailableCheckPreconditions")
  private String fundsAvailableCheckPreconditions;

  @JsonProperty("FundsAvailableCheckFeatureSchedule")
  private String fundsAvailableCheckFeatureSchedule;

  @JsonProperty("FundsAvailableCheck")
  private Object fundsAvailableCheck;

  @JsonProperty("FundsAvailableCheckPostconditions")
  private String fundsAvailableCheckPostconditions;

  @JsonProperty("FundsAvailableCheckFundsAvailableCheckServiceType")
  private String fundsAvailableCheckFundsAvailableCheckServiceType;

  @JsonProperty("FundsAvailableCheckFundsAvailableCheckServiceDescription")
  private String fundsAvailableCheckFundsAvailableCheckServiceDescription;

  @JsonProperty("FundsAvailableCheckFundsAvailableCheckServiceInputsandOuputs")
  private String fundsAvailableCheckFundsAvailableCheckServiceInputsandOuputs;

  @JsonProperty("FundsAvailableCheckFundsAvailableCheckServiceWorkProduct")
  private String fundsAvailableCheckFundsAvailableCheckServiceWorkProduct;

  @JsonProperty("FundsAvailableCheckFundsAvailableCheckServiceName")
  private String fundsAvailableCheckFundsAvailableCheckServiceName;

  public FundsAvailableCheck fundsAvailableCheckPreconditions(String fundsAvailableCheckPreconditions) {
    this.fundsAvailableCheckPreconditions = fundsAvailableCheckPreconditions;
    return this;
  }

  /**
   * Get fundsAvailableCheckPreconditions
   * @return fundsAvailableCheckPreconditions
  */
  @ApiModelProperty(value = "")


  public String getFundsAvailableCheckPreconditions() {
    return fundsAvailableCheckPreconditions;
  }

  public void setFundsAvailableCheckPreconditions(String fundsAvailableCheckPreconditions) {
    this.fundsAvailableCheckPreconditions = fundsAvailableCheckPreconditions;
  }

  public FundsAvailableCheck fundsAvailableCheckFeatureSchedule(String fundsAvailableCheckFeatureSchedule) {
    this.fundsAvailableCheckFeatureSchedule = fundsAvailableCheckFeatureSchedule;
    return this;
  }

  /**
   * Get fundsAvailableCheckFeatureSchedule
   * @return fundsAvailableCheckFeatureSchedule
  */
  @ApiModelProperty(value = "")


  public String getFundsAvailableCheckFeatureSchedule() {
    return fundsAvailableCheckFeatureSchedule;
  }

  public void setFundsAvailableCheckFeatureSchedule(String fundsAvailableCheckFeatureSchedule) {
    this.fundsAvailableCheckFeatureSchedule = fundsAvailableCheckFeatureSchedule;
  }

  public FundsAvailableCheck fundsAvailableCheck(Object fundsAvailableCheck) {
    this.fundsAvailableCheck = fundsAvailableCheck;
    return this;
  }

  /**
   * Get fundsAvailableCheck
   * @return fundsAvailableCheck
  */
  @ApiModelProperty(value = "")

  @Valid

  public Object getFundsAvailableCheck() {
    return fundsAvailableCheck;
  }

  public void setFundsAvailableCheck(Object fundsAvailableCheck) {
    this.fundsAvailableCheck = fundsAvailableCheck;
  }

  public FundsAvailableCheck fundsAvailableCheckPostconditions(String fundsAvailableCheckPostconditions) {
    this.fundsAvailableCheckPostconditions = fundsAvailableCheckPostconditions;
    return this;
  }

  /**
   * Get fundsAvailableCheckPostconditions
   * @return fundsAvailableCheckPostconditions
  */
  @ApiModelProperty(value = "")


  public String getFundsAvailableCheckPostconditions() {
    return fundsAvailableCheckPostconditions;
  }

  public void setFundsAvailableCheckPostconditions(String fundsAvailableCheckPostconditions) {
    this.fundsAvailableCheckPostconditions = fundsAvailableCheckPostconditions;
  }

  public FundsAvailableCheck fundsAvailableCheckFundsAvailableCheckServiceType(String fundsAvailableCheckFundsAvailableCheckServiceType) {
    this.fundsAvailableCheckFundsAvailableCheckServiceType = fundsAvailableCheckFundsAvailableCheckServiceType;
    return this;
  }

  /**
   * Get fundsAvailableCheckFundsAvailableCheckServiceType
   * @return fundsAvailableCheckFundsAvailableCheckServiceType
  */
  @ApiModelProperty(value = "")


  public String getFundsAvailableCheckFundsAvailableCheckServiceType() {
    return fundsAvailableCheckFundsAvailableCheckServiceType;
  }

  public void setFundsAvailableCheckFundsAvailableCheckServiceType(String fundsAvailableCheckFundsAvailableCheckServiceType) {
    this.fundsAvailableCheckFundsAvailableCheckServiceType = fundsAvailableCheckFundsAvailableCheckServiceType;
  }

  public FundsAvailableCheck fundsAvailableCheckFundsAvailableCheckServiceDescription(String fundsAvailableCheckFundsAvailableCheckServiceDescription) {
    this.fundsAvailableCheckFundsAvailableCheckServiceDescription = fundsAvailableCheckFundsAvailableCheckServiceDescription;
    return this;
  }

  /**
   * Get fundsAvailableCheckFundsAvailableCheckServiceDescription
   * @return fundsAvailableCheckFundsAvailableCheckServiceDescription
  */
  @ApiModelProperty(value = "")


  public String getFundsAvailableCheckFundsAvailableCheckServiceDescription() {
    return fundsAvailableCheckFundsAvailableCheckServiceDescription;
  }

  public void setFundsAvailableCheckFundsAvailableCheckServiceDescription(String fundsAvailableCheckFundsAvailableCheckServiceDescription) {
    this.fundsAvailableCheckFundsAvailableCheckServiceDescription = fundsAvailableCheckFundsAvailableCheckServiceDescription;
  }

  public FundsAvailableCheck fundsAvailableCheckFundsAvailableCheckServiceInputsandOuputs(String fundsAvailableCheckFundsAvailableCheckServiceInputsandOuputs) {
    this.fundsAvailableCheckFundsAvailableCheckServiceInputsandOuputs = fundsAvailableCheckFundsAvailableCheckServiceInputsandOuputs;
    return this;
  }

  /**
   * Get fundsAvailableCheckFundsAvailableCheckServiceInputsandOuputs
   * @return fundsAvailableCheckFundsAvailableCheckServiceInputsandOuputs
  */
  @ApiModelProperty(value = "")


  public String getFundsAvailableCheckFundsAvailableCheckServiceInputsandOuputs() {
    return fundsAvailableCheckFundsAvailableCheckServiceInputsandOuputs;
  }

  public void setFundsAvailableCheckFundsAvailableCheckServiceInputsandOuputs(String fundsAvailableCheckFundsAvailableCheckServiceInputsandOuputs) {
    this.fundsAvailableCheckFundsAvailableCheckServiceInputsandOuputs = fundsAvailableCheckFundsAvailableCheckServiceInputsandOuputs;
  }

  public FundsAvailableCheck fundsAvailableCheckFundsAvailableCheckServiceWorkProduct(String fundsAvailableCheckFundsAvailableCheckServiceWorkProduct) {
    this.fundsAvailableCheckFundsAvailableCheckServiceWorkProduct = fundsAvailableCheckFundsAvailableCheckServiceWorkProduct;
    return this;
  }

  /**
   * Get fundsAvailableCheckFundsAvailableCheckServiceWorkProduct
   * @return fundsAvailableCheckFundsAvailableCheckServiceWorkProduct
  */
  @ApiModelProperty(value = "")


  public String getFundsAvailableCheckFundsAvailableCheckServiceWorkProduct() {
    return fundsAvailableCheckFundsAvailableCheckServiceWorkProduct;
  }

  public void setFundsAvailableCheckFundsAvailableCheckServiceWorkProduct(String fundsAvailableCheckFundsAvailableCheckServiceWorkProduct) {
    this.fundsAvailableCheckFundsAvailableCheckServiceWorkProduct = fundsAvailableCheckFundsAvailableCheckServiceWorkProduct;
  }

  public FundsAvailableCheck fundsAvailableCheckFundsAvailableCheckServiceName(String fundsAvailableCheckFundsAvailableCheckServiceName) {
    this.fundsAvailableCheckFundsAvailableCheckServiceName = fundsAvailableCheckFundsAvailableCheckServiceName;
    return this;
  }

  /**
   * Get fundsAvailableCheckFundsAvailableCheckServiceName
   * @return fundsAvailableCheckFundsAvailableCheckServiceName
  */
  @ApiModelProperty(value = "")


  public String getFundsAvailableCheckFundsAvailableCheckServiceName() {
    return fundsAvailableCheckFundsAvailableCheckServiceName;
  }

  public void setFundsAvailableCheckFundsAvailableCheckServiceName(String fundsAvailableCheckFundsAvailableCheckServiceName) {
    this.fundsAvailableCheckFundsAvailableCheckServiceName = fundsAvailableCheckFundsAvailableCheckServiceName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FundsAvailableCheck fundsAvailableCheck = (FundsAvailableCheck) o;
    return Objects.equals(this.fundsAvailableCheckPreconditions, fundsAvailableCheck.fundsAvailableCheckPreconditions) &&
        Objects.equals(this.fundsAvailableCheckFeatureSchedule, fundsAvailableCheck.fundsAvailableCheckFeatureSchedule) &&
        Objects.equals(this.fundsAvailableCheck, fundsAvailableCheck.fundsAvailableCheck) &&
        Objects.equals(this.fundsAvailableCheckPostconditions, fundsAvailableCheck.fundsAvailableCheckPostconditions) &&
        Objects.equals(this.fundsAvailableCheckFundsAvailableCheckServiceType, fundsAvailableCheck.fundsAvailableCheckFundsAvailableCheckServiceType) &&
        Objects.equals(this.fundsAvailableCheckFundsAvailableCheckServiceDescription, fundsAvailableCheck.fundsAvailableCheckFundsAvailableCheckServiceDescription) &&
        Objects.equals(this.fundsAvailableCheckFundsAvailableCheckServiceInputsandOuputs, fundsAvailableCheck.fundsAvailableCheckFundsAvailableCheckServiceInputsandOuputs) &&
        Objects.equals(this.fundsAvailableCheckFundsAvailableCheckServiceWorkProduct, fundsAvailableCheck.fundsAvailableCheckFundsAvailableCheckServiceWorkProduct) &&
        Objects.equals(this.fundsAvailableCheckFundsAvailableCheckServiceName, fundsAvailableCheck.fundsAvailableCheckFundsAvailableCheckServiceName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fundsAvailableCheckPreconditions, fundsAvailableCheckFeatureSchedule, fundsAvailableCheck, fundsAvailableCheckPostconditions, fundsAvailableCheckFundsAvailableCheckServiceType, fundsAvailableCheckFundsAvailableCheckServiceDescription, fundsAvailableCheckFundsAvailableCheckServiceInputsandOuputs, fundsAvailableCheckFundsAvailableCheckServiceWorkProduct, fundsAvailableCheckFundsAvailableCheckServiceName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FundsAvailableCheck {\n");
    
    sb.append("    fundsAvailableCheckPreconditions: ").append(toIndentedString(fundsAvailableCheckPreconditions)).append("\n");
    sb.append("    fundsAvailableCheckFeatureSchedule: ").append(toIndentedString(fundsAvailableCheckFeatureSchedule)).append("\n");
    sb.append("    fundsAvailableCheck: ").append(toIndentedString(fundsAvailableCheck)).append("\n");
    sb.append("    fundsAvailableCheckPostconditions: ").append(toIndentedString(fundsAvailableCheckPostconditions)).append("\n");
    sb.append("    fundsAvailableCheckFundsAvailableCheckServiceType: ").append(toIndentedString(fundsAvailableCheckFundsAvailableCheckServiceType)).append("\n");
    sb.append("    fundsAvailableCheckFundsAvailableCheckServiceDescription: ").append(toIndentedString(fundsAvailableCheckFundsAvailableCheckServiceDescription)).append("\n");
    sb.append("    fundsAvailableCheckFundsAvailableCheckServiceInputsandOuputs: ").append(toIndentedString(fundsAvailableCheckFundsAvailableCheckServiceInputsandOuputs)).append("\n");
    sb.append("    fundsAvailableCheckFundsAvailableCheckServiceWorkProduct: ").append(toIndentedString(fundsAvailableCheckFundsAvailableCheckServiceWorkProduct)).append("\n");
    sb.append("    fundsAvailableCheckFundsAvailableCheckServiceName: ").append(toIndentedString(fundsAvailableCheckFundsAvailableCheckServiceName)).append("\n");
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

