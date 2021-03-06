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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.joda.time.DateTime;

/**
 * OperationMetric
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-09-25T23:40:42.718-03:00")
public class OperationMetric {
  @JsonProperty("avgLatency")
  private Double avgLatency = null;

  @JsonProperty("cacheCount")
  private Long cacheCount = null;

  @JsonProperty("count")
  private Long count = null;

  @JsonProperty("date")
  private DateTime date = null;

  @JsonProperty("hitsWithCache")
  private Long hitsWithCache = null;

  @JsonProperty("hitsWithoutCache")
  private Long hitsWithoutCache = null;

  public OperationMetric avgLatency(Double avgLatency) {
    this.avgLatency = avgLatency;
    return this;
  }

   /**
   * Get avgLatency
   * @return avgLatency
  **/
  @ApiModelProperty(value = "")
  public Double getAvgLatency() {
    return avgLatency;
  }

  public void setAvgLatency(Double avgLatency) {
    this.avgLatency = avgLatency;
  }

  public OperationMetric cacheCount(Long cacheCount) {
    this.cacheCount = cacheCount;
    return this;
  }

   /**
   * Get cacheCount
   * @return cacheCount
  **/
  @ApiModelProperty(value = "")
  public Long getCacheCount() {
    return cacheCount;
  }

  public void setCacheCount(Long cacheCount) {
    this.cacheCount = cacheCount;
  }

  public OperationMetric count(Long count) {
    this.count = count;
    return this;
  }

   /**
   * Get count
   * @return count
  **/
  @ApiModelProperty(value = "")
  public Long getCount() {
    return count;
  }

  public void setCount(Long count) {
    this.count = count;
  }

  public OperationMetric date(DateTime date) {
    this.date = date;
    return this;
  }

   /**
   * Get date
   * @return date
  **/
  @ApiModelProperty(value = "")
  public DateTime getDate() {
    return date;
  }

  public void setDate(DateTime date) {
    this.date = date;
  }

  public OperationMetric hitsWithCache(Long hitsWithCache) {
    this.hitsWithCache = hitsWithCache;
    return this;
  }

   /**
   * Get hitsWithCache
   * @return hitsWithCache
  **/
  @ApiModelProperty(value = "")
  public Long getHitsWithCache() {
    return hitsWithCache;
  }

  public void setHitsWithCache(Long hitsWithCache) {
    this.hitsWithCache = hitsWithCache;
  }

  public OperationMetric hitsWithoutCache(Long hitsWithoutCache) {
    this.hitsWithoutCache = hitsWithoutCache;
    return this;
  }

   /**
   * Get hitsWithoutCache
   * @return hitsWithoutCache
  **/
  @ApiModelProperty(value = "")
  public Long getHitsWithoutCache() {
    return hitsWithoutCache;
  }

  public void setHitsWithoutCache(Long hitsWithoutCache) {
    this.hitsWithoutCache = hitsWithoutCache;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OperationMetric operationMetric = (OperationMetric) o;
    return Objects.equals(this.avgLatency, operationMetric.avgLatency) &&
        Objects.equals(this.cacheCount, operationMetric.cacheCount) &&
        Objects.equals(this.count, operationMetric.count) &&
        Objects.equals(this.date, operationMetric.date) &&
        Objects.equals(this.hitsWithCache, operationMetric.hitsWithCache) &&
        Objects.equals(this.hitsWithoutCache, operationMetric.hitsWithoutCache);
  }

  @Override
  public int hashCode() {
    return Objects.hash(avgLatency, cacheCount, count, date, hitsWithCache, hitsWithoutCache);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OperationMetric {\n");
    
    sb.append("    avgLatency: ").append(toIndentedString(avgLatency)).append("\n");
    sb.append("    cacheCount: ").append(toIndentedString(cacheCount)).append("\n");
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    hitsWithCache: ").append(toIndentedString(hitsWithCache)).append("\n");
    sb.append("    hitsWithoutCache: ").append(toIndentedString(hitsWithoutCache)).append("\n");
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

