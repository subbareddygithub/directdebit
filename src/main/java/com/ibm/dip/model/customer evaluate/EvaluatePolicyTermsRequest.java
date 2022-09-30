package com.ibm.dip.model.customer evaluate;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.ibm.dip.model.customer evaluate.EvaluateLegalTermsRequestCustomerAgreement;
import com.ibm.dip.model.customer evaluate.EvaluatePolicyTermsRequestPolicyTerms;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * EvaluatePolicyTermsRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-09-30T07:16:51.997Z[GMT]")

public class EvaluatePolicyTermsRequest   {
  @JsonProperty("CustomerAgreement")
  private EvaluateLegalTermsRequestCustomerAgreement customerAgreement;

  @JsonProperty("PolicyTerms")
  private EvaluatePolicyTermsRequestPolicyTerms policyTerms;

  public EvaluatePolicyTermsRequest customerAgreement(EvaluateLegalTermsRequestCustomerAgreement customerAgreement) {
    this.customerAgreement = customerAgreement;
    return this;
  }

  /**
   * Get customerAgreement
   * @return customerAgreement
  */
  @ApiModelProperty(value = "")

  @Valid

  public EvaluateLegalTermsRequestCustomerAgreement getCustomerAgreement() {
    return customerAgreement;
  }

  public void setCustomerAgreement(EvaluateLegalTermsRequestCustomerAgreement customerAgreement) {
    this.customerAgreement = customerAgreement;
  }

  public EvaluatePolicyTermsRequest policyTerms(EvaluatePolicyTermsRequestPolicyTerms policyTerms) {
    this.policyTerms = policyTerms;
    return this;
  }

  /**
   * Get policyTerms
   * @return policyTerms
  */
  @ApiModelProperty(value = "")

  @Valid

  public EvaluatePolicyTermsRequestPolicyTerms getPolicyTerms() {
    return policyTerms;
  }

  public void setPolicyTerms(EvaluatePolicyTermsRequestPolicyTerms policyTerms) {
    this.policyTerms = policyTerms;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EvaluatePolicyTermsRequest evaluatePolicyTermsRequest = (EvaluatePolicyTermsRequest) o;
    return Objects.equals(this.customerAgreement, evaluatePolicyTermsRequest.customerAgreement) &&
        Objects.equals(this.policyTerms, evaluatePolicyTermsRequest.policyTerms);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customerAgreement, policyTerms);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EvaluatePolicyTermsRequest {\n");
    
    sb.append("    customerAgreement: ").append(toIndentedString(customerAgreement)).append("\n");
    sb.append("    policyTerms: ").append(toIndentedString(policyTerms)).append("\n");
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

