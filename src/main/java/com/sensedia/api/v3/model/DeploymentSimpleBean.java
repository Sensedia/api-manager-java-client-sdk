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
 * DeploymentSimpleBean
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-09-06T11:21:38.562-03:00")
public class DeploymentSimpleBean {
  @JsonProperty("apiId")
  private Long apiId = null;

  @JsonProperty("apiName")
  private String apiName = null;

  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("revisionId")
  private Long revisionId = null;

  @JsonProperty("revisionNumber")
  private Integer revisionNumber = null;

  public DeploymentSimpleBean apiId(Long apiId) {
    this.apiId = apiId;
    return this;
  }

   /**
   * Get apiId
   * @return apiId
  **/
  @ApiModelProperty(value = "")
  public Long getApiId() {
    return apiId;
  }

  public void setApiId(Long apiId) {
    this.apiId = apiId;
  }

  public DeploymentSimpleBean apiName(String apiName) {
    this.apiName = apiName;
    return this;
  }

   /**
   * Get apiName
   * @return apiName
  **/
  @ApiModelProperty(value = "")
  public String getApiName() {
    return apiName;
  }

  public void setApiName(String apiName) {
    this.apiName = apiName;
  }

  public DeploymentSimpleBean id(Long id) {
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

  public DeploymentSimpleBean revisionId(Long revisionId) {
    this.revisionId = revisionId;
    return this;
  }

   /**
   * Get revisionId
   * @return revisionId
  **/
  @ApiModelProperty(value = "")
  public Long getRevisionId() {
    return revisionId;
  }

  public void setRevisionId(Long revisionId) {
    this.revisionId = revisionId;
  }

  public DeploymentSimpleBean revisionNumber(Integer revisionNumber) {
    this.revisionNumber = revisionNumber;
    return this;
  }

   /**
   * Get revisionNumber
   * @return revisionNumber
  **/
  @ApiModelProperty(value = "")
  public Integer getRevisionNumber() {
    return revisionNumber;
  }

  public void setRevisionNumber(Integer revisionNumber) {
    this.revisionNumber = revisionNumber;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeploymentSimpleBean deploymentSimpleBean = (DeploymentSimpleBean) o;
    return Objects.equals(this.apiId, deploymentSimpleBean.apiId) &&
        Objects.equals(this.apiName, deploymentSimpleBean.apiName) &&
        Objects.equals(this.id, deploymentSimpleBean.id) &&
        Objects.equals(this.revisionId, deploymentSimpleBean.revisionId) &&
        Objects.equals(this.revisionNumber, deploymentSimpleBean.revisionNumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(apiId, apiName, id, revisionId, revisionNumber);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeploymentSimpleBean {\n");
    
    sb.append("    apiId: ").append(toIndentedString(apiId)).append("\n");
    sb.append("    apiName: ").append(toIndentedString(apiName)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    revisionId: ").append(toIndentedString(revisionId)).append("\n");
    sb.append("    revisionNumber: ").append(toIndentedString(revisionNumber)).append("\n");
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

