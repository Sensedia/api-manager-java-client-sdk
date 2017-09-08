/*
 * API Manager Portal
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: 2.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.sensedia.api.v3.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.sensedia.api.v3.model.CacheMetricItem;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

/**
 * CacheMetric
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-09-06T11:21:38.562-03:00")
public class CacheMetric {
  @JsonProperty("itens")
  private List<CacheMetricItem> itens = null;

  @JsonProperty("limit")
  private Long limit = null;

  public CacheMetric itens(List<CacheMetricItem> itens) {
    this.itens = itens;
    return this;
  }

  public CacheMetric addItensItem(CacheMetricItem itensItem) {
    if (this.itens == null) {
      this.itens = new ArrayList<CacheMetricItem>();
    }
    this.itens.add(itensItem);
    return this;
  }

   /**
   * Get itens
   * @return itens
  **/
  @ApiModelProperty(value = "")
  public List<CacheMetricItem> getItens() {
    return itens;
  }

  public void setItens(List<CacheMetricItem> itens) {
    this.itens = itens;
  }

  public CacheMetric limit(Long limit) {
    this.limit = limit;
    return this;
  }

   /**
   * Get limit
   * @return limit
  **/
  @ApiModelProperty(value = "")
  public Long getLimit() {
    return limit;
  }

  public void setLimit(Long limit) {
    this.limit = limit;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CacheMetric cacheMetric = (CacheMetric) o;
    return Objects.equals(this.itens, cacheMetric.itens) &&
        Objects.equals(this.limit, cacheMetric.limit);
  }

  @Override
  public int hashCode() {
    return Objects.hash(itens, limit);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CacheMetric {\n");
    
    sb.append("    itens: ").append(toIndentedString(itens)).append("\n");
    sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
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

