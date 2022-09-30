package com.ibm.dip.model.direct debit;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.ibm.dip.model.direct debit.ControlDirectDebitFacilityResponseDirectDebitFacility;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * UpdateDirectDebitFacilityResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-09-30T07:16:56.597Z[GMT]")

public class UpdateDirectDebitFacilityResponse   {
  @JsonProperty("DirectDebitFacility")
  private ControlDirectDebitFacilityResponseDirectDebitFacility directDebitFacility;

  public UpdateDirectDebitFacilityResponse directDebitFacility(ControlDirectDebitFacilityResponseDirectDebitFacility directDebitFacility) {
    this.directDebitFacility = directDebitFacility;
    return this;
  }

  /**
   * Get directDebitFacility
   * @return directDebitFacility
  */
  @ApiModelProperty(value = "")

  @Valid

  public ControlDirectDebitFacilityResponseDirectDebitFacility getDirectDebitFacility() {
    return directDebitFacility;
  }

  public void setDirectDebitFacility(ControlDirectDebitFacilityResponseDirectDebitFacility directDebitFacility) {
    this.directDebitFacility = directDebitFacility;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateDirectDebitFacilityResponse updateDirectDebitFacilityResponse = (UpdateDirectDebitFacilityResponse) o;
    return Objects.equals(this.directDebitFacility, updateDirectDebitFacilityResponse.directDebitFacility);
  }

  @Override
  public int hashCode() {
    return Objects.hash(directDebitFacility);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateDirectDebitFacilityResponse {\n");
    
    sb.append("    directDebitFacility: ").append(toIndentedString(directDebitFacility)).append("\n");
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

