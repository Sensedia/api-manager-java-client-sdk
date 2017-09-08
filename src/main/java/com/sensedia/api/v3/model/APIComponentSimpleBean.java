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

/**
 * APIComponentSimpleBean
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-09-06T11:21:38.562-03:00")
public class APIComponentSimpleBean {
  @JsonProperty("apiBroken")
  private Boolean apiBroken = null;

  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("planBroken")
  private Boolean planBroken = null;

  public APIComponentSimpleBean apiBroken(Boolean apiBroken) {
    this.apiBroken = apiBroken;
    return this;
  }

   /**
   * Get apiBroken
   * @return apiBroken
  **/
  @ApiModelProperty(value = "")
  public Boolean getApiBroken() {
    return apiBroken;
  }

  public void setApiBroken(Boolean apiBroken) {
    this.apiBroken = apiBroken;
  }

  public APIComponentSimpleBean id(Long id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(value = "")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public APIComponentSimpleBean planBroken(Boolean planBroken) {
    this.planBroken = planBroken;
    return this;
  }

   /**
   * Get planBroken
   * @return planBroken
  **/
  @ApiModelProperty(value = "")
  public Boolean getPlanBroken() {
    return planBroken;
  }

  public void setPlanBroken(Boolean planBroken) {
    this.planBroken = planBroken;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    APIComponentSimpleBean apIComponentSimpleBean = (APIComponentSimpleBean) o;
    return Objects.equals(this.apiBroken, apIComponentSimpleBean.apiBroken) &&
        Objects.equals(this.id, apIComponentSimpleBean.id) &&
        Objects.equals(this.planBroken, apIComponentSimpleBean.planBroken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(apiBroken, id, planBroken);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class APIComponentSimpleBean {\n");
    
    sb.append("    apiBroken: ").append(toIndentedString(apiBroken)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    planBroken: ").append(toIndentedString(planBroken)).append("\n");
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

