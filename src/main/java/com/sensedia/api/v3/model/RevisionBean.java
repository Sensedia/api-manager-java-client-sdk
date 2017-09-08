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
import com.sensedia.api.v3.model.API;
import com.sensedia.api.v3.model.DeploymentBean;
import com.sensedia.api.v3.model.InterceptorBean;
import com.sensedia.api.v3.model.ResourceBean;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.joda.time.DateTime;

/**
 * RevisionBean
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-09-06T11:21:38.562-03:00")
public class RevisionBean {
  @JsonProperty("api")
  private API api = null;

  @JsonProperty("apiBroken")
  private Boolean apiBroken = null;

  @JsonProperty("creationDate")
  private DateTime creationDate = null;

  @JsonProperty("deployments")
  private List<DeploymentBean> deployments = null;

  @JsonProperty("destination")
  private String destination = null;

  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("interceptors")
  private List<InterceptorBean> interceptors = null;

  /**
   * Gets or Sets lifeCycle
   */
  public enum LifeCycleEnum {
    DRAFT("DRAFT"),
    
    AVAILABLE("AVAILABLE"),
    
    RETIRED("RETIRED");

    private String value;

    LifeCycleEnum(String value) {
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
    public static LifeCycleEnum fromValue(String text) {
      for (LifeCycleEnum b : LifeCycleEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("lifeCycle")
  private LifeCycleEnum lifeCycle = null;

  @JsonProperty("resources")
  private List<ResourceBean> resources = null;

  @JsonProperty("revisionNumber")
  private Integer revisionNumber = null;

  @JsonProperty("timeout")
  private String timeout = null;

  public RevisionBean api(API api) {
    this.api = api;
    return this;
  }

   /**
   * Get api
   * @return api
  **/
  @ApiModelProperty(value = "")
  public API getApi() {
    return api;
  }

  public void setApi(API api) {
    this.api = api;
  }

  public RevisionBean apiBroken(Boolean apiBroken) {
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

  public RevisionBean creationDate(DateTime creationDate) {
    this.creationDate = creationDate;
    return this;
  }

   /**
   * Get creationDate
   * @return creationDate
  **/
  @ApiModelProperty(value = "")
  public DateTime getCreationDate() {
    return creationDate;
  }

  public void setCreationDate(DateTime creationDate) {
    this.creationDate = creationDate;
  }

  public RevisionBean deployments(List<DeploymentBean> deployments) {
    this.deployments = deployments;
    return this;
  }

  public RevisionBean addDeploymentsItem(DeploymentBean deploymentsItem) {
    if (this.deployments == null) {
      this.deployments = new ArrayList<DeploymentBean>();
    }
    this.deployments.add(deploymentsItem);
    return this;
  }

   /**
   * Get deployments
   * @return deployments
  **/
  @ApiModelProperty(value = "")
  public List<DeploymentBean> getDeployments() {
    return deployments;
  }

  public void setDeployments(List<DeploymentBean> deployments) {
    this.deployments = deployments;
  }

  public RevisionBean destination(String destination) {
    this.destination = destination;
    return this;
  }

   /**
   * Get destination
   * @return destination
  **/
  @ApiModelProperty(value = "")
  public String getDestination() {
    return destination;
  }

  public void setDestination(String destination) {
    this.destination = destination;
  }

  public RevisionBean id(Long id) {
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

  public RevisionBean interceptors(List<InterceptorBean> interceptors) {
    this.interceptors = interceptors;
    return this;
  }

  public RevisionBean addInterceptorsItem(InterceptorBean interceptorsItem) {
    if (this.interceptors == null) {
      this.interceptors = new ArrayList<InterceptorBean>();
    }
    this.interceptors.add(interceptorsItem);
    return this;
  }

   /**
   * Get interceptors
   * @return interceptors
  **/
  @ApiModelProperty(value = "")
  public List<InterceptorBean> getInterceptors() {
    return interceptors;
  }

  public void setInterceptors(List<InterceptorBean> interceptors) {
    this.interceptors = interceptors;
  }

  public RevisionBean lifeCycle(LifeCycleEnum lifeCycle) {
    this.lifeCycle = lifeCycle;
    return this;
  }

   /**
   * Get lifeCycle
   * @return lifeCycle
  **/
  @ApiModelProperty(value = "")
  public LifeCycleEnum getLifeCycle() {
    return lifeCycle;
  }

  public void setLifeCycle(LifeCycleEnum lifeCycle) {
    this.lifeCycle = lifeCycle;
  }

  public RevisionBean resources(List<ResourceBean> resources) {
    this.resources = resources;
    return this;
  }

  public RevisionBean addResourcesItem(ResourceBean resourcesItem) {
    if (this.resources == null) {
      this.resources = new ArrayList<ResourceBean>();
    }
    this.resources.add(resourcesItem);
    return this;
  }

   /**
   * Get resources
   * @return resources
  **/
  @ApiModelProperty(value = "")
  public List<ResourceBean> getResources() {
    return resources;
  }

  public void setResources(List<ResourceBean> resources) {
    this.resources = resources;
  }

  public RevisionBean revisionNumber(Integer revisionNumber) {
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

  public RevisionBean timeout(String timeout) {
    this.timeout = timeout;
    return this;
  }

   /**
   * Get timeout
   * @return timeout
  **/
  @ApiModelProperty(value = "")
  public String getTimeout() {
    return timeout;
  }

  public void setTimeout(String timeout) {
    this.timeout = timeout;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RevisionBean revisionBean = (RevisionBean) o;
    return Objects.equals(this.api, revisionBean.api) &&
        Objects.equals(this.apiBroken, revisionBean.apiBroken) &&
        Objects.equals(this.creationDate, revisionBean.creationDate) &&
        Objects.equals(this.deployments, revisionBean.deployments) &&
        Objects.equals(this.destination, revisionBean.destination) &&
        Objects.equals(this.id, revisionBean.id) &&
        Objects.equals(this.interceptors, revisionBean.interceptors) &&
        Objects.equals(this.lifeCycle, revisionBean.lifeCycle) &&
        Objects.equals(this.resources, revisionBean.resources) &&
        Objects.equals(this.revisionNumber, revisionBean.revisionNumber) &&
        Objects.equals(this.timeout, revisionBean.timeout);
  }

  @Override
  public int hashCode() {
    return Objects.hash(api, apiBroken, creationDate, deployments, destination, id, interceptors, lifeCycle, resources, revisionNumber, timeout);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RevisionBean {\n");
    
    sb.append("    api: ").append(toIndentedString(api)).append("\n");
    sb.append("    apiBroken: ").append(toIndentedString(apiBroken)).append("\n");
    sb.append("    creationDate: ").append(toIndentedString(creationDate)).append("\n");
    sb.append("    deployments: ").append(toIndentedString(deployments)).append("\n");
    sb.append("    destination: ").append(toIndentedString(destination)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    interceptors: ").append(toIndentedString(interceptors)).append("\n");
    sb.append("    lifeCycle: ").append(toIndentedString(lifeCycle)).append("\n");
    sb.append("    resources: ").append(toIndentedString(resources)).append("\n");
    sb.append("    revisionNumber: ").append(toIndentedString(revisionNumber)).append("\n");
    sb.append("    timeout: ").append(toIndentedString(timeout)).append("\n");
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

