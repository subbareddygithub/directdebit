package com.ibm.dip.model.customer evaluate;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.ibm.dip.model.customer evaluate.UpdateLegalTermsRequestLegalTerms;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * UpdateLegalTermsRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-09-30T07:16:51.997Z[GMT]")

public class UpdateLegalTermsRequest   {
  @JsonProperty("LegalTerms")
  private UpdateLegalTermsRequestLegalTerms legalTerms;

  public UpdateLegalTermsRequest legalTerms(UpdateLegalTermsRequestLegalTerms legalTerms) {
    this.legalTerms = legalTerms;
    return this;
  }

  /**
   * Get legalTerms
   * @return legalTerms
  */
  @ApiModelProperty(value = "")

  @Valid

  public UpdateLegalTermsRequestLegalTerms getLegalTerms() {
    return legalTerms;
  }

  public void setLegalTerms(UpdateLegalTermsRequestLegalTerms legalTerms) {
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
    UpdateLegalTermsRequest updateLegalTermsRequest = (UpdateLegalTermsRequest) o;
    return Objects.equals(this.legalTerms, updateLegalTermsRequest.legalTerms);
  }

  @Override
  public int hashCode() {
    return Objects.hash(legalTerms);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateLegalTermsRequest {\n");
    
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

