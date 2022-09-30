package com.ibm.dip.model.direct debit;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * PaymentTracking
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-09-30T07:16:56.597Z[GMT]")

public class PaymentTracking   {
  @JsonProperty("PaymentTrackingPreconditions")
  private String paymentTrackingPreconditions;

  @JsonProperty("PaymentTrackingFeatureSchedule")
  private String paymentTrackingFeatureSchedule;

  @JsonProperty("DirectDebitPaymentTracking")
  private Object directDebitPaymentTracking;

  @JsonProperty("PaymentTrackingPostconditions")
  private String paymentTrackingPostconditions;

  @JsonProperty("PaymentTrackingDirectDebitPaymentTrackingServiceType")
  private String paymentTrackingDirectDebitPaymentTrackingServiceType;

  @JsonProperty("PaymentTrackingDirectDebitPaymentTrackingServiceDescription")
  private String paymentTrackingDirectDebitPaymentTrackingServiceDescription;

  @JsonProperty("PaymentTrackingDirectDebitPaymentTrackingServiceInputsandOuputs")
  private String paymentTrackingDirectDebitPaymentTrackingServiceInputsandOuputs;

  @JsonProperty("PaymentTrackingDirectDebitPaymentTrackingServiceWorkProduct")
  private String paymentTrackingDirectDebitPaymentTrackingServiceWorkProduct;

  @JsonProperty("PaymentTrackingDirectDebitPaymentTrackingServiceName")
  private String paymentTrackingDirectDebitPaymentTrackingServiceName;

  public PaymentTracking paymentTrackingPreconditions(String paymentTrackingPreconditions) {
    this.paymentTrackingPreconditions = paymentTrackingPreconditions;
    return this;
  }

  /**
   * Get paymentTrackingPreconditions
   * @return paymentTrackingPreconditions
  */
  @ApiModelProperty(value = "")


  public String getPaymentTrackingPreconditions() {
    return paymentTrackingPreconditions;
  }

  public void setPaymentTrackingPreconditions(String paymentTrackingPreconditions) {
    this.paymentTrackingPreconditions = paymentTrackingPreconditions;
  }

  public PaymentTracking paymentTrackingFeatureSchedule(String paymentTrackingFeatureSchedule) {
    this.paymentTrackingFeatureSchedule = paymentTrackingFeatureSchedule;
    return this;
  }

  /**
   * Get paymentTrackingFeatureSchedule
   * @return paymentTrackingFeatureSchedule
  */
  @ApiModelProperty(value = "")


  public String getPaymentTrackingFeatureSchedule() {
    return paymentTrackingFeatureSchedule;
  }

  public void setPaymentTrackingFeatureSchedule(String paymentTrackingFeatureSchedule) {
    this.paymentTrackingFeatureSchedule = paymentTrackingFeatureSchedule;
  }

  public PaymentTracking directDebitPaymentTracking(Object directDebitPaymentTracking) {
    this.directDebitPaymentTracking = directDebitPaymentTracking;
    return this;
  }

  /**
   * Get directDebitPaymentTracking
   * @return directDebitPaymentTracking
  */
  @ApiModelProperty(value = "")

  @Valid

  public Object getDirectDebitPaymentTracking() {
    return directDebitPaymentTracking;
  }

  public void setDirectDebitPaymentTracking(Object directDebitPaymentTracking) {
    this.directDebitPaymentTracking = directDebitPaymentTracking;
  }

  public PaymentTracking paymentTrackingPostconditions(String paymentTrackingPostconditions) {
    this.paymentTrackingPostconditions = paymentTrackingPostconditions;
    return this;
  }

  /**
   * Get paymentTrackingPostconditions
   * @return paymentTrackingPostconditions
  */
  @ApiModelProperty(value = "")


  public String getPaymentTrackingPostconditions() {
    return paymentTrackingPostconditions;
  }

  public void setPaymentTrackingPostconditions(String paymentTrackingPostconditions) {
    this.paymentTrackingPostconditions = paymentTrackingPostconditions;
  }

  public PaymentTracking paymentTrackingDirectDebitPaymentTrackingServiceType(String paymentTrackingDirectDebitPaymentTrackingServiceType) {
    this.paymentTrackingDirectDebitPaymentTrackingServiceType = paymentTrackingDirectDebitPaymentTrackingServiceType;
    return this;
  }

  /**
   * Get paymentTrackingDirectDebitPaymentTrackingServiceType
   * @return paymentTrackingDirectDebitPaymentTrackingServiceType
  */
  @ApiModelProperty(value = "")


  public String getPaymentTrackingDirectDebitPaymentTrackingServiceType() {
    return paymentTrackingDirectDebitPaymentTrackingServiceType;
  }

  public void setPaymentTrackingDirectDebitPaymentTrackingServiceType(String paymentTrackingDirectDebitPaymentTrackingServiceType) {
    this.paymentTrackingDirectDebitPaymentTrackingServiceType = paymentTrackingDirectDebitPaymentTrackingServiceType;
  }

  public PaymentTracking paymentTrackingDirectDebitPaymentTrackingServiceDescription(String paymentTrackingDirectDebitPaymentTrackingServiceDescription) {
    this.paymentTrackingDirectDebitPaymentTrackingServiceDescription = paymentTrackingDirectDebitPaymentTrackingServiceDescription;
    return this;
  }

  /**
   * Get paymentTrackingDirectDebitPaymentTrackingServiceDescription
   * @return paymentTrackingDirectDebitPaymentTrackingServiceDescription
  */
  @ApiModelProperty(value = "")


  public String getPaymentTrackingDirectDebitPaymentTrackingServiceDescription() {
    return paymentTrackingDirectDebitPaymentTrackingServiceDescription;
  }

  public void setPaymentTrackingDirectDebitPaymentTrackingServiceDescription(String paymentTrackingDirectDebitPaymentTrackingServiceDescription) {
    this.paymentTrackingDirectDebitPaymentTrackingServiceDescription = paymentTrackingDirectDebitPaymentTrackingServiceDescription;
  }

  public PaymentTracking paymentTrackingDirectDebitPaymentTrackingServiceInputsandOuputs(String paymentTrackingDirectDebitPaymentTrackingServiceInputsandOuputs) {
    this.paymentTrackingDirectDebitPaymentTrackingServiceInputsandOuputs = paymentTrackingDirectDebitPaymentTrackingServiceInputsandOuputs;
    return this;
  }

  /**
   * Get paymentTrackingDirectDebitPaymentTrackingServiceInputsandOuputs
   * @return paymentTrackingDirectDebitPaymentTrackingServiceInputsandOuputs
  */
  @ApiModelProperty(value = "")


  public String getPaymentTrackingDirectDebitPaymentTrackingServiceInputsandOuputs() {
    return paymentTrackingDirectDebitPaymentTrackingServiceInputsandOuputs;
  }

  public void setPaymentTrackingDirectDebitPaymentTrackingServiceInputsandOuputs(String paymentTrackingDirectDebitPaymentTrackingServiceInputsandOuputs) {
    this.paymentTrackingDirectDebitPaymentTrackingServiceInputsandOuputs = paymentTrackingDirectDebitPaymentTrackingServiceInputsandOuputs;
  }

  public PaymentTracking paymentTrackingDirectDebitPaymentTrackingServiceWorkProduct(String paymentTrackingDirectDebitPaymentTrackingServiceWorkProduct) {
    this.paymentTrackingDirectDebitPaymentTrackingServiceWorkProduct = paymentTrackingDirectDebitPaymentTrackingServiceWorkProduct;
    return this;
  }

  /**
   * Get paymentTrackingDirectDebitPaymentTrackingServiceWorkProduct
   * @return paymentTrackingDirectDebitPaymentTrackingServiceWorkProduct
  */
  @ApiModelProperty(value = "")


  public String getPaymentTrackingDirectDebitPaymentTrackingServiceWorkProduct() {
    return paymentTrackingDirectDebitPaymentTrackingServiceWorkProduct;
  }

  public void setPaymentTrackingDirectDebitPaymentTrackingServiceWorkProduct(String paymentTrackingDirectDebitPaymentTrackingServiceWorkProduct) {
    this.paymentTrackingDirectDebitPaymentTrackingServiceWorkProduct = paymentTrackingDirectDebitPaymentTrackingServiceWorkProduct;
  }

  public PaymentTracking paymentTrackingDirectDebitPaymentTrackingServiceName(String paymentTrackingDirectDebitPaymentTrackingServiceName) {
    this.paymentTrackingDirectDebitPaymentTrackingServiceName = paymentTrackingDirectDebitPaymentTrackingServiceName;
    return this;
  }

  /**
   * Get paymentTrackingDirectDebitPaymentTrackingServiceName
   * @return paymentTrackingDirectDebitPaymentTrackingServiceName
  */
  @ApiModelProperty(value = "")


  public String getPaymentTrackingDirectDebitPaymentTrackingServiceName() {
    return paymentTrackingDirectDebitPaymentTrackingServiceName;
  }

  public void setPaymentTrackingDirectDebitPaymentTrackingServiceName(String paymentTrackingDirectDebitPaymentTrackingServiceName) {
    this.paymentTrackingDirectDebitPaymentTrackingServiceName = paymentTrackingDirectDebitPaymentTrackingServiceName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentTracking paymentTracking = (PaymentTracking) o;
    return Objects.equals(this.paymentTrackingPreconditions, paymentTracking.paymentTrackingPreconditions) &&
        Objects.equals(this.paymentTrackingFeatureSchedule, paymentTracking.paymentTrackingFeatureSchedule) &&
        Objects.equals(this.directDebitPaymentTracking, paymentTracking.directDebitPaymentTracking) &&
        Objects.equals(this.paymentTrackingPostconditions, paymentTracking.paymentTrackingPostconditions) &&
        Objects.equals(this.paymentTrackingDirectDebitPaymentTrackingServiceType, paymentTracking.paymentTrackingDirectDebitPaymentTrackingServiceType) &&
        Objects.equals(this.paymentTrackingDirectDebitPaymentTrackingServiceDescription, paymentTracking.paymentTrackingDirectDebitPaymentTrackingServiceDescription) &&
        Objects.equals(this.paymentTrackingDirectDebitPaymentTrackingServiceInputsandOuputs, paymentTracking.paymentTrackingDirectDebitPaymentTrackingServiceInputsandOuputs) &&
        Objects.equals(this.paymentTrackingDirectDebitPaymentTrackingServiceWorkProduct, paymentTracking.paymentTrackingDirectDebitPaymentTrackingServiceWorkProduct) &&
        Objects.equals(this.paymentTrackingDirectDebitPaymentTrackingServiceName, paymentTracking.paymentTrackingDirectDebitPaymentTrackingServiceName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(paymentTrackingPreconditions, paymentTrackingFeatureSchedule, directDebitPaymentTracking, paymentTrackingPostconditions, paymentTrackingDirectDebitPaymentTrackingServiceType, paymentTrackingDirectDebitPaymentTrackingServiceDescription, paymentTrackingDirectDebitPaymentTrackingServiceInputsandOuputs, paymentTrackingDirectDebitPaymentTrackingServiceWorkProduct, paymentTrackingDirectDebitPaymentTrackingServiceName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentTracking {\n");
    
    sb.append("    paymentTrackingPreconditions: ").append(toIndentedString(paymentTrackingPreconditions)).append("\n");
    sb.append("    paymentTrackingFeatureSchedule: ").append(toIndentedString(paymentTrackingFeatureSchedule)).append("\n");
    sb.append("    directDebitPaymentTracking: ").append(toIndentedString(directDebitPaymentTracking)).append("\n");
    sb.append("    paymentTrackingPostconditions: ").append(toIndentedString(paymentTrackingPostconditions)).append("\n");
    sb.append("    paymentTrackingDirectDebitPaymentTrackingServiceType: ").append(toIndentedString(paymentTrackingDirectDebitPaymentTrackingServiceType)).append("\n");
    sb.append("    paymentTrackingDirectDebitPaymentTrackingServiceDescription: ").append(toIndentedString(paymentTrackingDirectDebitPaymentTrackingServiceDescription)).append("\n");
    sb.append("    paymentTrackingDirectDebitPaymentTrackingServiceInputsandOuputs: ").append(toIndentedString(paymentTrackingDirectDebitPaymentTrackingServiceInputsandOuputs)).append("\n");
    sb.append("    paymentTrackingDirectDebitPaymentTrackingServiceWorkProduct: ").append(toIndentedString(paymentTrackingDirectDebitPaymentTrackingServiceWorkProduct)).append("\n");
    sb.append("    paymentTrackingDirectDebitPaymentTrackingServiceName: ").append(toIndentedString(paymentTrackingDirectDebitPaymentTrackingServiceName)).append("\n");
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

