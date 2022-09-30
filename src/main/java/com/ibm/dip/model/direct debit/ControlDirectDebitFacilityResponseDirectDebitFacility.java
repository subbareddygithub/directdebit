package com.ibm.dip.model.direct debit;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ControlDirectDebitFacilityResponseDirectDebitFacility
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-09-30T07:16:56.597Z[GMT]")

public class ControlDirectDebitFacilityResponseDirectDebitFacility   {
  @JsonProperty("DirectDebitFacilityParameterType")
  private String directDebitFacilityParameterType;

  @JsonProperty("DirectDebitFacilitySelectedOption")
  private String directDebitFacilitySelectedOption;

  @JsonProperty("DirectDebitFacilitySchedule")
  private String directDebitFacilitySchedule;

  @JsonProperty("DirectDebitFacilityStatus")
  private String directDebitFacilityStatus;

  public ControlDirectDebitFacilityResponseDirectDebitFacility directDebitFacilityParameterType(String directDebitFacilityParameterType) {
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

  public ControlDirectDebitFacilityResponseDirectDebitFacility directDebitFacilitySelectedOption(String directDebitFacilitySelectedOption) {
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

  public ControlDirectDebitFacilityResponseDirectDebitFacility directDebitFacilitySchedule(String directDebitFacilitySchedule) {
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

  public ControlDirectDebitFacilityResponseDirectDebitFacility directDebitFacilityStatus(String directDebitFacilityStatus) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ControlDirectDebitFacilityResponseDirectDebitFacility controlDirectDebitFacilityResponseDirectDebitFacility = (ControlDirectDebitFacilityResponseDirectDebitFacility) o;
    return Objects.equals(this.directDebitFacilityParameterType, controlDirectDebitFacilityResponseDirectDebitFacility.directDebitFacilityParameterType) &&
        Objects.equals(this.directDebitFacilitySelectedOption, controlDirectDebitFacilityResponseDirectDebitFacility.directDebitFacilitySelectedOption) &&
        Objects.equals(this.directDebitFacilitySchedule, controlDirectDebitFacilityResponseDirectDebitFacility.directDebitFacilitySchedule) &&
        Objects.equals(this.directDebitFacilityStatus, controlDirectDebitFacilityResponseDirectDebitFacility.directDebitFacilityStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(directDebitFacilityParameterType, directDebitFacilitySelectedOption, directDebitFacilitySchedule, directDebitFacilityStatus);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ControlDirectDebitFacilityResponseDirectDebitFacility {\n");
    
    sb.append("    directDebitFacilityParameterType: ").append(toIndentedString(directDebitFacilityParameterType)).append("\n");
    sb.append("    directDebitFacilitySelectedOption: ").append(toIndentedString(directDebitFacilitySelectedOption)).append("\n");
    sb.append("    directDebitFacilitySchedule: ").append(toIndentedString(directDebitFacilitySchedule)).append("\n");
    sb.append("    directDebitFacilityStatus: ").append(toIndentedString(directDebitFacilityStatus)).append("\n");
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

