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
import com.sensedia.api.v3.model.DeploymentScheduleBean;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.joda.time.DateTime;

/**
 * DeploymentBean
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-09-06T11:21:38.562-03:00")
public class DeploymentBean {
  @JsonProperty("apiDescription")
  private String apiDescription = null;

  @JsonProperty("apiId")
  private Long apiId = null;

  @JsonProperty("apiName")
  private String apiName = null;

  @JsonProperty("deployDate")
  private DateTime deployDate = null;

  @JsonProperty("deploymentSchedule")
  private DeploymentScheduleBean deploymentSchedule = null;

  @JsonProperty("environmentId")
  private Long environmentId = null;

  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("revisionId")
  private Long revisionId = null;

  @JsonProperty("revisionNumber")
  private Integer revisionNumber = null;

  /**
   * Gets or Sets status
   */
  public enum StatusEnum {
    DEPLOYED("DEPLOYED"),
    
    UNDEPLOYED("UNDEPLOYED");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static StatusEnum fromValue(String text) {
      for (StatusEnum b : StatusEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("status")
  private StatusEnum status = null;

  public DeploymentBean apiDescription(String apiDescription) {
    this.apiDescription = apiDescription;
    return this;
  }

   /**
   * Get apiDescription
   * @return apiDescription
  **/
  @ApiModelProperty(value = "")
  public String getApiDescription() {
    return apiDescription;
  }

  public void setApiDescription(String apiDescription) {
    this.apiDescription = apiDescription;
  }

  public DeploymentBean apiId(Long apiId) {
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

  public DeploymentBean apiName(String apiName) {
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

  public DeploymentBean deployDate(DateTime deployDate) {
    this.deployDate = deployDate;
    return this;
  }

   /**
   * Get deployDate
   * @return deployDate
  **/
  @ApiModelProperty(value = "")
  public DateTime getDeployDate() {
    return deployDate;
  }

  public void setDeployDate(DateTime deployDate) {
    this.deployDate = deployDate;
  }

  public DeploymentBean deploymentSchedule(DeploymentScheduleBean deploymentSchedule) {
    this.deploymentSchedule = deploymentSchedule;
    return this;
  }

   /**
   * Get deploymentSchedule
   * @return deploymentSchedule
  **/
  @ApiModelProperty(value = "")
  public DeploymentScheduleBean getDeploymentSchedule() {
    return deploymentSchedule;
  }

  public void setDeploymentSchedule(DeploymentScheduleBean deploymentSchedule) {
    this.deploymentSchedule = deploymentSchedule;
  }

  public DeploymentBean environmentId(Long environmentId) {
    this.environmentId = environmentId;
    return this;
  }

   /**
   * Get environmentId
   * @return environmentId
  **/
  @ApiModelProperty(value = "")
  public Long getEnvironmentId() {
    return environmentId;
  }

  public void setEnvironmentId(Long environmentId) {
    this.environmentId = environmentId;
  }

  public DeploymentBean id(Long id) {
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

  public DeploymentBean revisionId(Long revisionId) {
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

  public DeploymentBean revisionNumber(Integer revisionNumber) {
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

  public DeploymentBean status(StatusEnum status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @ApiModelProperty(value = "")
  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeploymentBean deploymentBean = (DeploymentBean) o;
    return Objects.equals(this.apiDescription, deploymentBean.apiDescription) &&
        Objects.equals(this.apiId, deploymentBean.apiId) &&
        Objects.equals(this.apiName, deploymentBean.apiName) &&
        Objects.equals(this.deployDate, deploymentBean.deployDate) &&
        Objects.equals(this.deploymentSchedule, deploymentBean.deploymentSchedule) &&
        Objects.equals(this.environmentId, deploymentBean.environmentId) &&
        Objects.equals(this.id, deploymentBean.id) &&
        Objects.equals(this.revisionId, deploymentBean.revisionId) &&
        Objects.equals(this.revisionNumber, deploymentBean.revisionNumber) &&
        Objects.equals(this.status, deploymentBean.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(apiDescription, apiId, apiName, deployDate, deploymentSchedule, environmentId, id, revisionId, revisionNumber, status);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeploymentBean {\n");
    
    sb.append("    apiDescription: ").append(toIndentedString(apiDescription)).append("\n");
    sb.append("    apiId: ").append(toIndentedString(apiId)).append("\n");
    sb.append("    apiName: ").append(toIndentedString(apiName)).append("\n");
    sb.append("    deployDate: ").append(toIndentedString(deployDate)).append("\n");
    sb.append("    deploymentSchedule: ").append(toIndentedString(deploymentSchedule)).append("\n");
    sb.append("    environmentId: ").append(toIndentedString(environmentId)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    revisionId: ").append(toIndentedString(revisionId)).append("\n");
    sb.append("    revisionNumber: ").append(toIndentedString(revisionNumber)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

