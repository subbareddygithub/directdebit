package com.ibm.dip.model.customer evaluate;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.ibm.dip.model.customer evaluate.EvaluateLegalTermsRequestCustomerAgreement;
import com.ibm.dip.model.customer evaluate.RetrieveLegalTermsResponseLegalTerms;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * RetrieveLegalTermsResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-09-30T07:16:51.997Z[GMT]")

public class RetrieveLegalTermsResponse   {
  @JsonProperty("CustomerAgreement")
  private EvaluateLegalTermsRequestCustomerAgreement customerAgreement;

  @JsonProperty("LegalTerms")
  private RetrieveLegalTermsResponseLegalTerms legalTerms;

  public RetrieveLegalTermsResponse customerAgreement(EvaluateLegalTermsRequestCustomerAgreement customerAgreement) {
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

  public RetrieveLegalTermsResponse legalTerms(RetrieveLegalTermsResponseLegalTerms legalTerms) {
    this.legalTerms = legalTerms;
    return this;
  }

  /**
   * Get legalTerms
   * @return legalTerms
  */
  @ApiModelProperty(value = "")

  @Valid

  public RetrieveLegalTermsResponseLegalTerms getLegalTerms() {
    return legalTerms;
  }

  public void setLegalTerms(RetrieveLegalTermsResponseLegalTerms legalTerms) {
    this.legalTerms = legalTerms;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RetrieveLegalTermsResponse retrieveLegalTermsResponse = (RetrieveLegalTermsResponse) o;
    return Objects.equals(this.customerAgreement, retrieveLegalTermsResponse.customerAgreement) &&
        Objects.equals(this.legalTerms, retrieveLegalTermsResponse.legalTerms);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customerAgreement, legalTerms);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RetrieveLegalTermsResponse {\n");
    
    sb.append("    customerAgreement: ").append(toIndentedString(customerAgreement)).append("\n");
    sb.append("    legalTerms: ").append(toIndentedString(legalTerms)).append("\n");
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

