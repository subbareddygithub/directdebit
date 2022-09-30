package com.ibm.dip.model.customer evaluate;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.ibm.dip.model.customer evaluate.EvaluateCustomerAgreementRequestCustomerAgreement;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * EvaluateCustomerAgreementRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-09-30T07:16:51.997Z[GMT]")

public class EvaluateCustomerAgreementRequest   {
  @JsonProperty("CustomerAgreement")
  private EvaluateCustomerAgreementRequestCustomerAgreement customerAgreement;

  public EvaluateCustomerAgreementRequest customerAgreement(EvaluateCustomerAgreementRequestCustomerAgreement customerAgreement) {
    this.customerAgreement = customerAgreement;
    return this;
  }

  /**
   * Get customerAgreement
   * @return customerAgreement
  */
  @ApiModelProperty(value = "")

  @Valid

  public EvaluateCustomerAgreementRequestCustomerAgreement getCustomerAgreement() {
    return customerAgreement;
  }

  public void setCustomerAgreement(EvaluateCustomerAgreementRequestCustomerAgreement customerAgreement) {
    this.customerAgreement = customerAgreement;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EvaluateCustomerAgreementRequest evaluateCustomerAgreementRequest = (EvaluateCustomerAgreementRequest) o;
    return Objects.equals(this.customerAgreement, evaluateCustomerAgreementRequest.customerAgreement);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customerAgreement);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EvaluateCustomerAgreementRequest {\n");
    
    sb.append("    customerAgreement: ").append(toIndentedString(customerAgreement)).append("\n");
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

