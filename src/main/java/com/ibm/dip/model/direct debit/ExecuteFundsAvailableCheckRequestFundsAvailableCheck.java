package com.ibm.dip.model.direct debit;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ExecuteFundsAvailableCheckRequestFundsAvailableCheck
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-09-30T07:16:56.597Z[GMT]")

public class ExecuteFundsAvailableCheckRequestFundsAvailableCheck   {
  @JsonProperty("FundsAvailableCheckPreconditions")
  private String fundsAvailableCheckPreconditions;

  @JsonProperty("FundsAvailableCheckFeatureSchedule")
  private String fundsAvailableCheckFeatureSchedule;

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

  public ExecuteFundsAvailableCheckRequestFundsAvailableCheck fundsAvailableCheckPreconditions(String fundsAvailableCheckPreconditions) {
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

  public ExecuteFundsAvailableCheckRequestFundsAvailableCheck fundsAvailableCheckFeatureSchedule(String fundsAvailableCheckFeatureSchedule) {
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

  public ExecuteFundsAvailableCheckRequestFundsAvailableCheck fundsAvailableCheckPostconditions(String fundsAvailableCheckPostconditions) {
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

  public ExecuteFundsAvailableCheckRequestFundsAvailableCheck fundsAvailableCheckFundsAvailableCheckServiceType(String fundsAvailableCheckFundsAvailableCheckServiceType) {
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

  public ExecuteFundsAvailableCheckRequestFundsAvailableCheck fundsAvailableCheckFundsAvailableCheckServiceDescription(String fundsAvailableCheckFundsAvailableCheckServiceDescription) {
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

  public ExecuteFundsAvailableCheckRequestFundsAvailableCheck fundsAvailableCheckFundsAvailableCheckServiceInputsandOuputs(String fundsAvailableCheckFundsAvailableCheckServiceInputsandOuputs) {
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

  public ExecuteFundsAvailableCheckRequestFundsAvailableCheck fundsAvailableCheckFundsAvailableCheckServiceWorkProduct(String fundsAvailableCheckFundsAvailableCheckServiceWorkProduct) {
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

  public ExecuteFundsAvailableCheckRequestFundsAvailableCheck fundsAvailableCheckFundsAvailableCheckServiceName(String fundsAvailableCheckFundsAvailableCheckServiceName) {
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
    ExecuteFundsAvailableCheckRequestFundsAvailableCheck executeFundsAvailableCheckRequestFundsAvailableCheck = (ExecuteFundsAvailableCheckRequestFundsAvailableCheck) o;
    return Objects.equals(this.fundsAvailableCheckPreconditions, executeFundsAvailableCheckRequestFundsAvailableCheck.fundsAvailableCheckPreconditions) &&
        Objects.equals(this.fundsAvailableCheckFeatureSchedule, executeFundsAvailableCheckRequestFundsAvailableCheck.fundsAvailableCheckFeatureSchedule) &&
        Objects.equals(this.fundsAvailableCheckPostconditions, executeFundsAvailableCheckRequestFundsAvailableCheck.fundsAvailableCheckPostconditions) &&
        Objects.equals(this.fundsAvailableCheckFundsAvailableCheckServiceType, executeFundsAvailableCheckRequestFundsAvailableCheck.fundsAvailableCheckFundsAvailableCheckServiceType) &&
        Objects.equals(this.fundsAvailableCheckFundsAvailableCheckServiceDescription, executeFundsAvailableCheckRequestFundsAvailableCheck.fundsAvailableCheckFundsAvailableCheckServiceDescription) &&
        Objects.equals(this.fundsAvailableCheckFundsAvailableCheckServiceInputsandOuputs, executeFundsAvailableCheckRequestFundsAvailableCheck.fundsAvailableCheckFundsAvailableCheckServiceInputsandOuputs) &&
        Objects.equals(this.fundsAvailableCheckFundsAvailableCheckServiceWorkProduct, executeFundsAvailableCheckRequestFundsAvailableCheck.fundsAvailableCheckFundsAvailableCheckServiceWorkProduct) &&
        Objects.equals(this.fundsAvailableCheckFundsAvailableCheckServiceName, executeFundsAvailableCheckRequestFundsAvailableCheck.fundsAvailableCheckFundsAvailableCheckServiceName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fundsAvailableCheckPreconditions, fundsAvailableCheckFeatureSchedule, fundsAvailableCheckPostconditions, fundsAvailableCheckFundsAvailableCheckServiceType, fundsAvailableCheckFundsAvailableCheckServiceDescription, fundsAvailableCheckFundsAvailableCheckServiceInputsandOuputs, fundsAvailableCheckFundsAvailableCheckServiceWorkProduct, fundsAvailableCheckFundsAvailableCheckServiceName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExecuteFundsAvailableCheckRequestFundsAvailableCheck {\n");
    
    sb.append("    fundsAvailableCheckPreconditions: ").append(toIndentedString(fundsAvailableCheckPreconditions)).append("\n");
    sb.append("    fundsAvailableCheckFeatureSchedule: ").append(toIndentedString(fundsAvailableCheckFeatureSchedule)).append("\n");
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

