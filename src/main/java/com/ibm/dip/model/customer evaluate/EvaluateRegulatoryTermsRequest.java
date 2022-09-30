package com.ibm.dip.model.customer evaluate;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.ibm.dip.model.customer evaluate.EvaluateLegalTermsRequestCustomerAgreement;
import com.ibm.dip.model.customer evaluate.EvaluateRegulatoryTermsRequestRegulatoryTerms;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * EvaluateRegulatoryTermsRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-09-30T07:16:51.997Z[GMT]")

public class EvaluateRegulatoryTermsRequest   {
  @JsonProperty("CustomerAgreement")
  private EvaluateLegalTermsRequestCustomerAgreement customerAgreement;

  @JsonProperty("RegulatoryTerms")
  private EvaluateRegulatoryTermsRequestRegulatoryTerms regulatoryTerms;

  public EvaluateRegulatoryTermsRequest customerAgreement(EvaluateLegalTermsRequestCustomerAgreement customerAgreement) {
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

  public EvaluateRegulatoryTermsRequest regulatoryTerms(EvaluateRegulatoryTermsRequestRegulatoryTerms regulatoryTerms) {
    this.regulatoryTerms = regulatoryTerms;
    return this;
  }

  /**
   * Get regulatoryTerms
   * @return regulatoryTerms
  */
  @ApiModelProperty(value = "")

  @Valid

  public EvaluateRegulatoryTermsRequestRegulatoryTerms getRegulatoryTerms() {
    return regulatoryTerms;
  }

  public void setRegulatoryTerms(EvaluateRegulatoryTermsRequestRegulatoryTerms regulatoryTerms) {
    this.regulatoryTerms = regulatoryTerms;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EvaluateRegulatoryTermsRequest evaluateRegulatoryTermsRequest = (EvaluateRegulatoryTermsRequest) o;
    return Objects.equals(this.customerAgreement, evaluateRegulatoryTermsRequest.customerAgreement) &&
        Objects.equals(this.regulatoryTerms, evaluateRegulatoryTermsRequest.regulatoryTerms);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customerAgreement, regulatoryTerms);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EvaluateRegulatoryTermsRequest {\n");
    
    sb.append("    customerAgreement: ").append(toIndentedString(customerAgreement)).append("\n");
    sb.append("    regulatoryTerms: ").append(toIndentedString(regulatoryTerms)).append("\n");
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

