package com.ibm.dip.model.direct debit;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * PaymentInitiation
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-09-30T07:16:56.597Z[GMT]")

public class PaymentInitiation   {
  @JsonProperty("PaymentInitiationPreconditions")
  private String paymentInitiationPreconditions;

  @JsonProperty("PaymentInitiationFeatureSchedule")
  private String paymentInitiationFeatureSchedule;

  @JsonProperty("DirectDebitPaymentInitiation")
  private Object directDebitPaymentInitiation;

  @JsonProperty("PaymentInitiationPostconditions")
  private String paymentInitiationPostconditions;

  @JsonProperty("PaymentInitiationDirectDebitPaymentInitiationServiceType")
  private String paymentInitiationDirectDebitPaymentInitiationServiceType;

  @JsonProperty("PaymentInitiationDirectDebitPaymentInitiationServiceDescription")
  private String paymentInitiationDirectDebitPaymentInitiationServiceDescription;

  @JsonProperty("PaymentInitiationDirectDebitPaymentInitiationServiceInputsandOuputs")
  private String paymentInitiationDirectDebitPaymentInitiationServiceInputsandOuputs;

  @JsonProperty("PaymentInitiationDirectDebitPaymentInitiationServiceWorkProduct")
  private String paymentInitiationDirectDebitPaymentInitiationServiceWorkProduct;

  @JsonProperty("PaymentInitiationDirectDebitPaymentInitiationServiceName")
  private String paymentInitiationDirectDebitPaymentInitiationServiceName;

  public PaymentInitiation paymentInitiationPreconditions(String paymentInitiationPreconditions) {
    this.paymentInitiationPreconditions = paymentInitiationPreconditions;
    return this;
  }

  /**
   * Get paymentInitiationPreconditions
   * @return paymentInitiationPreconditions
  */
  @ApiModelProperty(value = "")


  public String getPaymentInitiationPreconditions() {
    return paymentInitiationPreconditions;
  }

  public void setPaymentInitiationPreconditions(String paymentInitiationPreconditions) {
    this.paymentInitiationPreconditions = paymentInitiationPreconditions;
  }

  public PaymentInitiation paymentInitiationFeatureSchedule(String paymentInitiationFeatureSchedule) {
    this.paymentInitiationFeatureSchedule = paymentInitiationFeatureSchedule;
    return this;
  }

  /**
   * Get paymentInitiationFeatureSchedule
   * @return paymentInitiationFeatureSchedule
  */
  @ApiModelProperty(value = "")


  public String getPaymentInitiationFeatureSchedule() {
    return paymentInitiationFeatureSchedule;
  }

  public void setPaymentInitiationFeatureSchedule(String paymentInitiationFeatureSchedule) {
    this.paymentInitiationFeatureSchedule = paymentInitiationFeatureSchedule;
  }

  public PaymentInitiation directDebitPaymentInitiation(Object directDebitPaymentInitiation) {
    this.directDebitPaymentInitiation = directDebitPaymentInitiation;
    return this;
  }

  /**
   * Get directDebitPaymentInitiation
   * @return directDebitPaymentInitiation
  */
  @ApiModelProperty(value = "")

  @Valid

  public Object getDirectDebitPaymentInitiation() {
    return directDebitPaymentInitiation;
  }

  public void setDirectDebitPaymentInitiation(Object directDebitPaymentInitiation) {
    this.directDebitPaymentInitiation = directDebitPaymentInitiation;
  }

  public PaymentInitiation paymentInitiationPostconditions(String paymentInitiationPostconditions) {
    this.paymentInitiationPostconditions = paymentInitiationPostconditions;
    return this;
  }

  /**
   * Get paymentInitiationPostconditions
   * @return paymentInitiationPostconditions
  */
  @ApiModelProperty(value = "")


  public String getPaymentInitiationPostconditions() {
    return paymentInitiationPostconditions;
  }

  public void setPaymentInitiationPostconditions(String paymentInitiationPostconditions) {
    this.paymentInitiationPostconditions = paymentInitiationPostconditions;
  }

  public PaymentInitiation paymentInitiationDirectDebitPaymentInitiationServiceType(String paymentInitiationDirectDebitPaymentInitiationServiceType) {
    this.paymentInitiationDirectDebitPaymentInitiationServiceType = paymentInitiationDirectDebitPaymentInitiationServiceType;
    return this;
  }

  /**
   * Get paymentInitiationDirectDebitPaymentInitiationServiceType
   * @return paymentInitiationDirectDebitPaymentInitiationServiceType
  */
  @ApiModelProperty(value = "")


  public String getPaymentInitiationDirectDebitPaymentInitiationServiceType() {
    return paymentInitiationDirectDebitPaymentInitiationServiceType;
  }

  public void setPaymentInitiationDirectDebitPaymentInitiationServiceType(String paymentInitiationDirectDebitPaymentInitiationServiceType) {
    this.paymentInitiationDirectDebitPaymentInitiationServiceType = paymentInitiationDirectDebitPaymentInitiationServiceType;
  }

  public PaymentInitiation paymentInitiationDirectDebitPaymentInitiationServiceDescription(String paymentInitiationDirectDebitPaymentInitiationServiceDescription) {
    this.paymentInitiationDirectDebitPaymentInitiationServiceDescription = paymentInitiationDirectDebitPaymentInitiationServiceDescription;
    return this;
  }

  /**
   * Get paymentInitiationDirectDebitPaymentInitiationServiceDescription
   * @return paymentInitiationDirectDebitPaymentInitiationServiceDescription
  */
  @ApiModelProperty(value = "")


  public String getPaymentInitiationDirectDebitPaymentInitiationServiceDescription() {
    return paymentInitiationDirectDebitPaymentInitiationServiceDescription;
  }

  public void setPaymentInitiationDirectDebitPaymentInitiationServiceDescription(String paymentInitiationDirectDebitPaymentInitiationServiceDescription) {
    this.paymentInitiationDirectDebitPaymentInitiationServiceDescription = paymentInitiationDirectDebitPaymentInitiationServiceDescription;
  }

  public PaymentInitiation paymentInitiationDirectDebitPaymentInitiationServiceInputsandOuputs(String paymentInitiationDirectDebitPaymentInitiationServiceInputsandOuputs) {
    this.paymentInitiationDirectDebitPaymentInitiationServiceInputsandOuputs = paymentInitiationDirectDebitPaymentInitiationServiceInputsandOuputs;
    return this;
  }

  /**
   * Get paymentInitiationDirectDebitPaymentInitiationServiceInputsandOuputs
   * @return paymentInitiationDirectDebitPaymentInitiationServiceInputsandOuputs
  */
  @ApiModelProperty(value = "")


  public String getPaymentInitiationDirectDebitPaymentInitiationServiceInputsandOuputs() {
    return paymentInitiationDirectDebitPaymentInitiationServiceInputsandOuputs;
  }

  public void setPaymentInitiationDirectDebitPaymentInitiationServiceInputsandOuputs(String paymentInitiationDirectDebitPaymentInitiationServiceInputsandOuputs) {
    this.paymentInitiationDirectDebitPaymentInitiationServiceInputsandOuputs = paymentInitiationDirectDebitPaymentInitiationServiceInputsandOuputs;
  }

  public PaymentInitiation paymentInitiationDirectDebitPaymentInitiationServiceWorkProduct(String paymentInitiationDirectDebitPaymentInitiationServiceWorkProduct) {
    this.paymentInitiationDirectDebitPaymentInitiationServiceWorkProduct = paymentInitiationDirectDebitPaymentInitiationServiceWorkProduct;
    return this;
  }

  /**
   * Get paymentInitiationDirectDebitPaymentInitiationServiceWorkProduct
   * @return paymentInitiationDirectDebitPaymentInitiationServiceWorkProduct
  */
  @ApiModelProperty(value = "")


  public String getPaymentInitiationDirectDebitPaymentInitiationServiceWorkProduct() {
    return paymentInitiationDirectDebitPaymentInitiationServiceWorkProduct;
  }

  public void setPaymentInitiationDirectDebitPaymentInitiationServiceWorkProduct(String paymentInitiationDirectDebitPaymentInitiationServiceWorkProduct) {
    this.paymentInitiationDirectDebitPaymentInitiationServiceWorkProduct = paymentInitiationDirectDebitPaymentInitiationServiceWorkProduct;
  }

  public PaymentInitiation paymentInitiationDirectDebitPaymentInitiationServiceName(String paymentInitiationDirectDebitPaymentInitiationServiceName) {
    this.paymentInitiationDirectDebitPaymentInitiationServiceName = paymentInitiationDirectDebitPaymentInitiationServiceName;
    return this;
  }

  /**
   * Get paymentInitiationDirectDebitPaymentInitiationServiceName
   * @return paymentInitiationDirectDebitPaymentInitiationServiceName
  */
  @ApiModelProperty(value = "")


  public String getPaymentInitiationDirectDebitPaymentInitiationServiceName() {
    return paymentInitiationDirectDebitPaymentInitiationServiceName;
  }

  public void setPaymentInitiationDirectDebitPaymentInitiationServiceName(String paymentInitiationDirectDebitPaymentInitiationServiceName) {
    this.paymentInitiationDirectDebitPaymentInitiationServiceName = paymentInitiationDirectDebitPaymentInitiationServiceName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentInitiation paymentInitiation = (PaymentInitiation) o;
    return Objects.equals(this.paymentInitiationPreconditions, paymentInitiation.paymentInitiationPreconditions) &&
        Objects.equals(this.paymentInitiationFeatureSchedule, paymentInitiation.paymentInitiationFeatureSchedule) &&
        Objects.equals(this.directDebitPaymentInitiation, paymentInitiation.directDebitPaymentInitiation) &&
        Objects.equals(this.paymentInitiationPostconditions, paymentInitiation.paymentInitiationPostconditions) &&
        Objects.equals(this.paymentInitiationDirectDebitPaymentInitiationServiceType, paymentInitiation.paymentInitiationDirectDebitPaymentInitiationServiceType) &&
        Objects.equals(this.paymentInitiationDirectDebitPaymentInitiationServiceDescription, paymentInitiation.paymentInitiationDirectDebitPaymentInitiationServiceDescription) &&
        Objects.equals(this.paymentInitiationDirectDebitPaymentInitiationServiceInputsandOuputs, paymentInitiation.paymentInitiationDirectDebitPaymentInitiationServiceInputsandOuputs) &&
        Objects.equals(this.paymentInitiationDirectDebitPaymentInitiationServiceWorkProduct, paymentInitiation.paymentInitiationDirectDebitPaymentInitiationServiceWorkProduct) &&
        Objects.equals(this.paymentInitiationDirectDebitPaymentInitiationServiceName, paymentInitiation.paymentInitiationDirectDebitPaymentInitiationServiceName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(paymentInitiationPreconditions, paymentInitiationFeatureSchedule, directDebitPaymentInitiation, paymentInitiationPostconditions, paymentInitiationDirectDebitPaymentInitiationServiceType, paymentInitiationDirectDebitPaymentInitiationServiceDescription, paymentInitiationDirectDebitPaymentInitiationServiceInputsandOuputs, paymentInitiationDirectDebitPaymentInitiationServiceWorkProduct, paymentInitiationDirectDebitPaymentInitiationServiceName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentInitiation {\n");
    
    sb.append("    paymentInitiationPreconditions: ").append(toIndentedString(paymentInitiationPreconditions)).append("\n");
    sb.append("    paymentInitiationFeatureSchedule: ").append(toIndentedString(paymentInitiationFeatureSchedule)).append("\n");
    sb.append("    directDebitPaymentInitiation: ").append(toIndentedString(directDebitPaymentInitiation)).append("\n");
    sb.append("    paymentInitiationPostconditions: ").append(toIndentedString(paymentInitiationPostconditions)).append("\n");
    sb.append("    paymentInitiationDirectDebitPaymentInitiationServiceType: ").append(toIndentedString(paymentInitiationDirectDebitPaymentInitiationServiceType)).append("\n");
    sb.append("    paymentInitiationDirectDebitPaymentInitiationServiceDescription: ").append(toIndentedString(paymentInitiationDirectDebitPaymentInitiationServiceDescription)).append("\n");
    sb.append("    paymentInitiationDirectDebitPaymentInitiationServiceInputsandOuputs: ").append(toIndentedString(paymentInitiationDirectDebitPaymentInitiationServiceInputsandOuputs)).append("\n");
    sb.append("    paymentInitiationDirectDebitPaymentInitiationServiceWorkProduct: ").append(toIndentedString(paymentInitiationDirectDebitPaymentInitiationServiceWorkProduct)).append("\n");
    sb.append("    paymentInitiationDirectDebitPaymentInitiationServiceName: ").append(toIndentedString(paymentInitiationDirectDebitPaymentInitiationServiceName)).append("\n");
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

