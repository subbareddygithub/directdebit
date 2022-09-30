package com.ibm.dip.model.direct debit;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.ibm.dip.model.direct debit.ExecuteFundsAvailableCheckRequestFundsAvailableCheck;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * RetrieveFundsAvailableCheckResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-09-30T07:16:56.597Z[GMT]")

public class RetrieveFundsAvailableCheckResponse   {
  @JsonProperty("FundsAvailableCheck")
  private ExecuteFundsAvailableCheckRequestFundsAvailableCheck fundsAvailableCheck;

  public RetrieveFundsAvailableCheckResponse fundsAvailableCheck(ExecuteFundsAvailableCheckRequestFundsAvailableCheck fundsAvailableCheck) {
    this.fundsAvailableCheck = fundsAvailableCheck;
    return this;
  }

  /**
   * Get fundsAvailableCheck
   * @return fundsAvailableCheck
  */
  @ApiModelProperty(value = "")

  @Valid

  public ExecuteFundsAvailableCheckRequestFundsAvailableCheck getFundsAvailableCheck() {
    return fundsAvailableCheck;
  }

  public void setFundsAvailableCheck(ExecuteFundsAvailableCheckRequestFundsAvailableCheck fundsAvailableCheck) {
    this.fundsAvailableCheck = fundsAvailableCheck;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RetrieveFundsAvailableCheckResponse retrieveFundsAvailableCheckResponse = (RetrieveFundsAvailableCheckResponse) o;
    return Objects.equals(this.fundsAvailableCheck, retrieveFundsAvailableCheckResponse.fundsAvailableCheck);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fundsAvailableCheck);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RetrieveFundsAvailableCheckResponse {\n");
    
    sb.append("    fundsAvailableCheck: ").append(toIndentedString(fundsAvailableCheck)).append("\n");
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

