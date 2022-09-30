package com.ibm.dip.model.direct debit;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Reporting
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-09-30T07:16:56.597Z[GMT]")

public class Reporting   {
  @JsonProperty("ReportingPreconditions")
  private String reportingPreconditions;

  @JsonProperty("ReportingFeatureSchedule")
  private String reportingFeatureSchedule;

  @JsonProperty("BusinessService")
  private Object businessService;

  @JsonProperty("ReportingPostconditions")
  private String reportingPostconditions;

  @JsonProperty("ReportingServiceType")
  private String reportingServiceType;

  @JsonProperty("ReportingServiceDescription")
  private String reportingServiceDescription;

  @JsonProperty("ReportingServiceInputsandOuputs")
  private String reportingServiceInputsandOuputs;

  @JsonProperty("ReportingServiceWorkProduct")
  private String reportingServiceWorkProduct;

  @JsonProperty("ReportingServiceName")
  private String reportingServiceName;

  public Reporting reportingPreconditions(String reportingPreconditions) {
    this.reportingPreconditions = reportingPreconditions;
    return this;
  }

  /**
   * Get reportingPreconditions
   * @return reportingPreconditions
  */
  @ApiModelProperty(value = "")


  public String getReportingPreconditions() {
    return reportingPreconditions;
  }

  public void setReportingPreconditions(String reportingPreconditions) {
    this.reportingPreconditions = reportingPreconditions;
  }

  public Reporting reportingFeatureSchedule(String reportingFeatureSchedule) {
    this.reportingFeatureSchedule = reportingFeatureSchedule;
    return this;
  }

  /**
   * Get reportingFeatureSchedule
   * @return reportingFeatureSchedule
  */
  @ApiModelProperty(value = "")


  public String getReportingFeatureSchedule() {
    return reportingFeatureSchedule;
  }

  public void setReportingFeatureSchedule(String reportingFeatureSchedule) {
    this.reportingFeatureSchedule = reportingFeatureSchedule;
  }

  public Reporting businessService(Object businessService) {
    this.businessService = businessService;
    return this;
  }

  /**
   * Get businessService
   * @return businessService
  */
  @ApiModelProperty(value = "")

  @Valid

  public Object getBusinessService() {
    return businessService;
  }

  public void setBusinessService(Object businessService) {
    this.businessService = businessService;
  }

  public Reporting reportingPostconditions(String reportingPostconditions) {
    this.reportingPostconditions = reportingPostconditions;
    return this;
  }

  /**
   * Get reportingPostconditions
   * @return reportingPostconditions
  */
  @ApiModelProperty(value = "")


  public String getReportingPostconditions() {
    return reportingPostconditions;
  }

  public void setReportingPostconditions(String reportingPostconditions) {
    this.reportingPostconditions = reportingPostconditions;
  }

  public Reporting reportingServiceType(String reportingServiceType) {
    this.reportingServiceType = reportingServiceType;
    return this;
  }

  /**
   * Get reportingServiceType
   * @return reportingServiceType
  */
  @ApiModelProperty(value = "")


  public String getReportingServiceType() {
    return reportingServiceType;
  }

  public void setReportingServiceType(String reportingServiceType) {
    this.reportingServiceType = reportingServiceType;
  }

  public Reporting reportingServiceDescription(String reportingServiceDescription) {
    this.reportingServiceDescription = reportingServiceDescription;
    return this;
  }

  /**
   * Get reportingServiceDescription
   * @return reportingServiceDescription
  */
  @ApiModelProperty(value = "")


  public String getReportingServiceDescription() {
    return reportingServiceDescription;
  }

  public void setReportingServiceDescription(String reportingServiceDescription) {
    this.reportingServiceDescription = reportingServiceDescription;
  }

  public Reporting reportingServiceInputsandOuputs(String reportingServiceInputsandOuputs) {
    this.reportingServiceInputsandOuputs = reportingServiceInputsandOuputs;
    return this;
  }

  /**
   * Get reportingServiceInputsandOuputs
   * @return reportingServiceInputsandOuputs
  */
  @ApiModelProperty(value = "")


  public String getReportingServiceInputsandOuputs() {
    return reportingServiceInputsandOuputs;
  }

  public void setReportingServiceInputsandOuputs(String reportingServiceInputsandOuputs) {
    this.reportingServiceInputsandOuputs = reportingServiceInputsandOuputs;
  }

  public Reporting reportingServiceWorkProduct(String reportingServiceWorkProduct) {
    this.reportingServiceWorkProduct = reportingServiceWorkProduct;
    return this;
  }

  /**
   * Get reportingServiceWorkProduct
   * @return reportingServiceWorkProduct
  */
  @ApiModelProperty(value = "")


  public String getReportingServiceWorkProduct() {
    return reportingServiceWorkProduct;
  }

  public void setReportingServiceWorkProduct(String reportingServiceWorkProduct) {
    this.reportingServiceWorkProduct = reportingServiceWorkProduct;
  }

  public Reporting reportingServiceName(String reportingServiceName) {
    this.reportingServiceName = reportingServiceName;
    return this;
  }

  /**
   * Get reportingServiceName
   * @return reportingServiceName
  */
  @ApiModelProperty(value = "")


  public String getReportingServiceName() {
    return reportingServiceName;
  }

  public void setReportingServiceName(String reportingServiceName) {
    this.reportingServiceName = reportingServiceName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Reporting reporting = (Reporting) o;
    return Objects.equals(this.reportingPreconditions, reporting.reportingPreconditions) &&
        Objects.equals(this.reportingFeatureSchedule, reporting.reportingFeatureSchedule) &&
        Objects.equals(this.businessService, reporting.businessService) &&
        Objects.equals(this.reportingPostconditions, reporting.reportingPostconditions) &&
        Objects.equals(this.reportingServiceType, reporting.reportingServiceType) &&
        Objects.equals(this.reportingServiceDescription, reporting.reportingServiceDescription) &&
        Objects.equals(this.reportingServiceInputsandOuputs, reporting.reportingServiceInputsandOuputs) &&
        Objects.equals(this.reportingServiceWorkProduct, reporting.reportingServiceWorkProduct) &&
        Objects.equals(this.reportingServiceName, reporting.reportingServiceName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(reportingPreconditions, reportingFeatureSchedule, businessService, reportingPostconditions, reportingServiceType, reportingServiceDescription, reportingServiceInputsandOuputs, reportingServiceWorkProduct, reportingServiceName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Reporting {\n");
    
    sb.append("    reportingPreconditions: ").append(toIndentedString(reportingPreconditions)).append("\n");
    sb.append("    reportingFeatureSchedule: ").append(toIndentedString(reportingFeatureSchedule)).append("\n");
    sb.append("    businessService: ").append(toIndentedString(businessService)).append("\n");
    sb.append("    reportingPostconditions: ").append(toIndentedString(reportingPostconditions)).append("\n");
    sb.append("    reportingServiceType: ").append(toIndentedString(reportingServiceType)).append("\n");
    sb.append("    reportingServiceDescription: ").append(toIndentedString(reportingServiceDescription)).append("\n");
    sb.append("    reportingServiceInputsandOuputs: ").append(toIndentedString(reportingServiceInputsandOuputs)).append("\n");
    sb.append("    reportingServiceWorkProduct: ").append(toIndentedString(reportingServiceWorkProduct)).append("\n");
    sb.append("    reportingServiceName: ").append(toIndentedString(reportingServiceName)).append("\n");
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

