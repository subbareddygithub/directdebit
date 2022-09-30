package com.ibm.dip.model.direct debit;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * DirectDebitOutcome
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-09-30T07:16:56.597Z[GMT]")

public class DirectDebitOutcome   {
  @JsonProperty("DirectDebitFinancialFacility")
  private String directDebitFinancialFacility;

  @JsonProperty("DirectDebitWorkProduct")
  private String directDebitWorkProduct;

  public DirectDebitOutcome directDebitFinancialFacility(String directDebitFinancialFacility) {
    this.directDebitFinancialFacility = directDebitFinancialFacility;
    return this;
  }

  /**
   * Get directDebitFinancialFacility
   * @return directDebitFinancialFacility
  */
  @ApiModelProperty(value = "")


  public String getDirectDebitFinancialFacility() {
    return directDebitFinancialFacility;
  }

  public void setDirectDebitFinancialFacility(String directDebitFinancialFacility) {
    this.directDebitFinancialFacility = directDebitFinancialFacility;
  }

  public DirectDebitOutcome directDebitWorkProduct(String directDebitWorkProduct) {
    this.directDebitWorkProduct = directDebitWorkProduct;
    return this;
  }

  /**
   * Get directDebitWorkProduct
   * @return directDebitWorkProduct
  */
  @ApiModelProperty(value = "")


  public String getDirectDebitWorkProduct() {
    return directDebitWorkProduct;
  }

  public void setDirectDebitWorkProduct(String directDebitWorkProduct) {
    this.directDebitWorkProduct = directDebitWorkProduct;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DirectDebitOutcome directDebitOutcome = (DirectDebitOutcome) o;
    return Objects.equals(this.directDebitFinancialFacility, directDebitOutcome.directDebitFinancialFacility) &&
        Objects.equals(this.directDebitWorkProduct, directDebitOutcome.directDebitWorkProduct);
  }

  @Override
  public int hashCode() {
    return Objects.hash(directDebitFinancialFacility, directDebitWorkProduct);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DirectDebitOutcome {\n");
    
    sb.append("    directDebitFinancialFacility: ").append(toIndentedString(directDebitFinancialFacility)).append("\n");
    sb.append("    directDebitWorkProduct: ").append(toIndentedString(directDebitWorkProduct)).append("\n");
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

