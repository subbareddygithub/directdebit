package com.ibm.dip.model.direct debit;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * DirectDebitFacility
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-09-30T07:16:56.597Z[GMT]")

public class DirectDebitFacility   {
  @JsonProperty("DirectDebitFacilityParameterType")
  private String directDebitFacilityParameterType;

  @JsonProperty("DirectDebitFacilitySelectedOption")
  private String directDebitFacilitySelectedOption;

  @JsonProperty("DirectDebitFacilityType")
  private String directDebitFacilityType;

  @JsonProperty("DirectDebitFacilityReference")
  private Object directDebitFacilityReference;

  @JsonProperty("DirectDebitFacilitySchedule")
  private String directDebitFacilitySchedule;

  @JsonProperty("DirectDebitFacilityStatus")
  private String directDebitFacilityStatus;

  @JsonProperty("DirectDebitFacilityCurrency")
  private String directDebitFacilityCurrency;

  @JsonProperty("DirectDebitFacilityRegulationReference")
  private Object directDebitFacilityRegulationReference;

  @JsonProperty("DirectDebitFacilityRegulationType")
  private String directDebitFacilityRegulationType;

  @JsonProperty("DirectDebitFacilityJurisdiction")
  private String directDebitFacilityJurisdiction;

  @JsonProperty("DirectDebitFacilityBookingLocation")
  private String directDebitFacilityBookingLocation;

  @JsonProperty("DirectDebitFacilityAccountType")
  private String directDebitFacilityAccountType;

  @JsonProperty("DirectDebitFacilityAccountReference")
  private Object directDebitFacilityAccountReference;

  public DirectDebitFacility directDebitFacilityParameterType(String directDebitFacilityParameterType) {
    this.directDebitFacilityParameterType = directDebitFacilityParameterType;
    return this;
  }

  /**
   * Get directDebitFacilityParameterType
   * @return directDebitFacilityParameterType
  */
  @ApiModelProperty(value = "")


  public String getDirectDebitFacilityParameterType() {
    return directDebitFacilityParameterType;
  }

  public void setDirectDebitFacilityParameterType(String directDebitFacilityParameterType) {
    this.directDebitFacilityParameterType = directDebitFacilityParameterType;
  }

  public DirectDebitFacility directDebitFacilitySelectedOption(String directDebitFacilitySelectedOption) {
    this.directDebitFacilitySelectedOption = directDebitFacilitySelectedOption;
    return this;
  }

  /**
   * Get directDebitFacilitySelectedOption
   * @return directDebitFacilitySelectedOption
  */
  @ApiModelProperty(value = "")


  public String getDirectDebitFacilitySelectedOption() {
    return directDebitFacilitySelectedOption;
  }

  public void setDirectDebitFacilitySelectedOption(String directDebitFacilitySelectedOption) {
    this.directDebitFacilitySelectedOption = directDebitFacilitySelectedOption;
  }

  public DirectDebitFacility directDebitFacilityType(String directDebitFacilityType) {
    this.directDebitFacilityType = directDebitFacilityType;
    return this;
  }

  /**
   * Get directDebitFacilityType
   * @return directDebitFacilityType
  */
  @ApiModelProperty(value = "")


  public String getDirectDebitFacilityType() {
    return directDebitFacilityType;
  }

  public void setDirectDebitFacilityType(String directDebitFacilityType) {
    this.directDebitFacilityType = directDebitFacilityType;
  }

  public DirectDebitFacility directDebitFacilityReference(Object directDebitFacilityReference) {
    this.directDebitFacilityReference = directDebitFacilityReference;
    return this;
  }

  /**
   * Get directDebitFacilityReference
   * @return directDebitFacilityReference
  */
  @ApiModelProperty(value = "")

  @Valid

  public Object getDirectDebitFacilityReference() {
    return directDebitFacilityReference;
  }

  public void setDirectDebitFacilityReference(Object directDebitFacilityReference) {
    this.directDebitFacilityReference = directDebitFacilityReference;
  }

  public DirectDebitFacility directDebitFacilitySchedule(String directDebitFacilitySchedule) {
    this.directDebitFacilitySchedule = directDebitFacilitySchedule;
    return this;
  }

  /**
   * Get directDebitFacilitySchedule
   * @return directDebitFacilitySchedule
  */
  @ApiModelProperty(value = "")


  public String getDirectDebitFacilitySchedule() {
    return directDebitFacilitySchedule;
  }

  public void setDirectDebitFacilitySchedule(String directDebitFacilitySchedule) {
    this.directDebitFacilitySchedule = directDebitFacilitySchedule;
  }

  public DirectDebitFacility directDebitFacilityStatus(String directDebitFacilityStatus) {
    this.directDebitFacilityStatus = directDebitFacilityStatus;
    return this;
  }

  /**
   * Get directDebitFacilityStatus
   * @return directDebitFacilityStatus
  */
  @ApiModelProperty(value = "")


  public String getDirectDebitFacilityStatus() {
    return directDebitFacilityStatus;
  }

  public void setDirectDebitFacilityStatus(String directDebitFacilityStatus) {
    this.directDebitFacilityStatus = directDebitFacilityStatus;
  }

  public DirectDebitFacility directDebitFacilityCurrency(String directDebitFacilityCurrency) {
    this.directDebitFacilityCurrency = directDebitFacilityCurrency;
    return this;
  }

  /**
   * Get directDebitFacilityCurrency
   * @return directDebitFacilityCurrency
  */
  @ApiModelProperty(value = "")


  public String getDirectDebitFacilityCurrency() {
    return directDebitFacilityCurrency;
  }

  public void setDirectDebitFacilityCurrency(String directDebitFacilityCurrency) {
    this.directDebitFacilityCurrency = directDebitFacilityCurrency;
  }

  public DirectDebitFacility directDebitFacilityRegulationReference(Object directDebitFacilityRegulationReference) {
    this.directDebitFacilityRegulationReference = directDebitFacilityRegulationReference;
    return this;
  }

  /**
   * Get directDebitFacilityRegulationReference
   * @return directDebitFacilityRegulationReference
  */
  @ApiModelProperty(value = "")

  @Valid

  public Object getDirectDebitFacilityRegulationReference() {
    return directDebitFacilityRegulationReference;
  }

  public void setDirectDebitFacilityRegulationReference(Object directDebitFacilityRegulationReference) {
    this.directDebitFacilityRegulationReference = directDebitFacilityRegulationReference;
  }

  public DirectDebitFacility directDebitFacilityRegulationType(String directDebitFacilityRegulationType) {
    this.directDebitFacilityRegulationType = directDebitFacilityRegulationType;
    return this;
  }

  /**
   * Get directDebitFacilityRegulationType
   * @return directDebitFacilityRegulationType
  */
  @ApiModelProperty(value = "")


  public String getDirectDebitFacilityRegulationType() {
    return directDebitFacilityRegulationType;
  }

  public void setDirectDebitFacilityRegulationType(String directDebitFacilityRegulationType) {
    this.directDebitFacilityRegulationType = directDebitFacilityRegulationType;
  }

  public DirectDebitFacility directDebitFacilityJurisdiction(String directDebitFacilityJurisdiction) {
    this.directDebitFacilityJurisdiction = directDebitFacilityJurisdiction;
    return this;
  }

  /**
   * Get directDebitFacilityJurisdiction
   * @return directDebitFacilityJurisdiction
  */
  @ApiModelProperty(value = "")


  public String getDirectDebitFacilityJurisdiction() {
    return directDebitFacilityJurisdiction;
  }

  public void setDirectDebitFacilityJurisdiction(String directDebitFacilityJurisdiction) {
    this.directDebitFacilityJurisdiction = directDebitFacilityJurisdiction;
  }

  public DirectDebitFacility directDebitFacilityBookingLocation(String directDebitFacilityBookingLocation) {
    this.directDebitFacilityBookingLocation = directDebitFacilityBookingLocation;
    return this;
  }

  /**
   * Get directDebitFacilityBookingLocation
   * @return directDebitFacilityBookingLocation
  */
  @ApiModelProperty(value = "")


  public String getDirectDebitFacilityBookingLocation() {
    return directDebitFacilityBookingLocation;
  }

  public void setDirectDebitFacilityBookingLocation(String directDebitFacilityBookingLocation) {
    this.directDebitFacilityBookingLocation = directDebitFacilityBookingLocation;
  }

  public DirectDebitFacility directDebitFacilityAccountType(String directDebitFacilityAccountType) {
    this.directDebitFacilityAccountType = directDebitFacilityAccountType;
    return this;
  }

  /**
   * Get directDebitFacilityAccountType
   * @return directDebitFacilityAccountType
  */
  @ApiModelProperty(value = "")


  public String getDirectDebitFacilityAccountType() {
    return directDebitFacilityAccountType;
  }

  public void setDirectDebitFacilityAccountType(String directDebitFacilityAccountType) {
    this.directDebitFacilityAccountType = directDebitFacilityAccountType;
  }

  public DirectDebitFacility directDebitFacilityAccountReference(Object directDebitFacilityAccountReference) {
    this.directDebitFacilityAccountReference = directDebitFacilityAccountReference;
    return this;
  }

  /**
   * Get directDebitFacilityAccountReference
   * @return directDebitFacilityAccountReference
  */
  @ApiModelProperty(value = "")

  @Valid

  public Object getDirectDebitFacilityAccountReference() {
    return directDebitFacilityAccountReference;
  }

  public void setDirectDebitFacilityAccountReference(Object directDebitFacilityAccountReference) {
    this.directDebitFacilityAccountReference = directDebitFacilityAccountReference;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DirectDebitFacility directDebitFacility = (DirectDebitFacility) o;
    return Objects.equals(this.directDebitFacilityParameterType, directDebitFacility.directDebitFacilityParameterType) &&
        Objects.equals(this.directDebitFacilitySelectedOption, directDebitFacility.directDebitFacilitySelectedOption) &&
        Objects.equals(this.directDebitFacilityType, directDebitFacility.directDebitFacilityType) &&
        Objects.equals(this.directDebitFacilityReference, directDebitFacility.directDebitFacilityReference) &&
        Objects.equals(this.directDebitFacilitySchedule, directDebitFacility.directDebitFacilitySchedule) &&
        Objects.equals(this.directDebitFacilityStatus, directDebitFacility.directDebitFacilityStatus) &&
        Objects.equals(this.directDebitFacilityCurrency, directDebitFacility.directDebitFacilityCurrency) &&
        Objects.equals(this.directDebitFacilityRegulationReference, directDebitFacility.directDebitFacilityRegulationReference) &&
        Objects.equals(this.directDebitFacilityRegulationType, directDebitFacility.directDebitFacilityRegulationType) &&
        Objects.equals(this.directDebitFacilityJurisdiction, directDebitFacility.directDebitFacilityJurisdiction) &&
        Objects.equals(this.directDebitFacilityBookingLocation, directDebitFacility.directDebitFacilityBookingLocation) &&
        Objects.equals(this.directDebitFacilityAccountType, directDebitFacility.directDebitFacilityAccountType) &&
        Objects.equals(this.directDebitFacilityAccountReference, directDebitFacility.directDebitFacilityAccountReference);
  }

  @Override
  public int hashCode() {
    return Objects.hash(directDebitFacilityParameterType, directDebitFacilitySelectedOption, directDebitFacilityType, directDebitFacilityReference, directDebitFacilitySchedule, directDebitFacilityStatus, directDebitFacilityCurrency, directDebitFacilityRegulationReference, directDebitFacilityRegulationType, directDebitFacilityJurisdiction, directDebitFacilityBookingLocation, directDebitFacilityAccountType, directDebitFacilityAccountReference);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DirectDebitFacility {\n");
    
    sb.append("    directDebitFacilityParameterType: ").append(toIndentedString(directDebitFacilityParameterType)).append("\n");
    sb.append("    directDebitFacilitySelectedOption: ").append(toIndentedString(directDebitFacilitySelectedOption)).append("\n");
    sb.append("    directDebitFacilityType: ").append(toIndentedString(directDebitFacilityType)).append("\n");
    sb.append("    directDebitFacilityReference: ").append(toIndentedString(directDebitFacilityReference)).append("\n");
    sb.append("    directDebitFacilitySchedule: ").append(toIndentedString(directDebitFacilitySchedule)).append("\n");
    sb.append("    directDebitFacilityStatus: ").append(toIndentedString(directDebitFacilityStatus)).append("\n");
    sb.append("    directDebitFacilityCurrency: ").append(toIndentedString(directDebitFacilityCurrency)).append("\n");
    sb.append("    directDebitFacilityRegulationReference: ").append(toIndentedString(directDebitFacilityRegulationReference)).append("\n");
    sb.append("    directDebitFacilityRegulationType: ").append(toIndentedString(directDebitFacilityRegulationType)).append("\n");
    sb.append("    directDebitFacilityJurisdiction: ").append(toIndentedString(directDebitFacilityJurisdiction)).append("\n");
    sb.append("    directDebitFacilityBookingLocation: ").append(toIndentedString(directDebitFacilityBookingLocation)).append("\n");
    sb.append("    directDebitFacilityAccountType: ").append(toIndentedString(directDebitFacilityAccountType)).append("\n");
    sb.append("    directDebitFacilityAccountReference: ").append(toIndentedString(directDebitFacilityAccountReference)).append("\n");
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

