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
import com.sensedia.api.v3.model.PlanSimpleBean;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.joda.time.DateTime;

/**
 * APISimpleBean
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-09-25T23:40:42.718-03:00")
public class APISimpleBean {
  @JsonProperty("appsCount")
  private Long appsCount = null;

  @JsonProperty("creationDate")
  private DateTime creationDate = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("icon")
  private String icon = null;

  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("plans")
  private List<PlanSimpleBean> plans = null;

  @JsonProperty("version")
  private String version = null;

  public APISimpleBean appsCount(Long appsCount) {
    this.appsCount = appsCount;
    return this;
  }

   /**
   * Get appsCount
   * @return appsCount
  **/
  @ApiModelProperty(value = "")
  public Long getAppsCount() {
    return appsCount;
  }

  public void setAppsCount(Long appsCount) {
    this.appsCount = appsCount;
  }

  public APISimpleBean creationDate(DateTime creationDate) {
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

  public APISimpleBean description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @ApiModelProperty(value = "")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public APISimpleBean icon(String icon) {
    this.icon = icon;
    return this;
  }

   /**
   * Get icon
   * @return icon
  **/
  @ApiModelProperty(value = "")
  public String getIcon() {
    return icon;
  }

  public void setIcon(String icon) {
    this.icon = icon;
  }

  public APISimpleBean id(Long id) {
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

  public APISimpleBean name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public APISimpleBean plans(List<PlanSimpleBean> plans) {
    this.plans = plans;
    return this;
  }

  public APISimpleBean addPlansItem(PlanSimpleBean plansItem) {
    if (this.plans == null) {
      this.plans = new ArrayList<PlanSimpleBean>();
    }
    this.plans.add(plansItem);
    return this;
  }

   /**
   * Get plans
   * @return plans
  **/
  @ApiModelProperty(value = "")
  public List<PlanSimpleBean> getPlans() {
    return plans;
  }

  public void setPlans(List<PlanSimpleBean> plans) {
    this.plans = plans;
  }

  public APISimpleBean version(String version) {
    this.version = version;
    return this;
  }

   /**
   * Get version
   * @return version
  **/
  @ApiModelProperty(value = "")
  public String getVersion() {
    return version;
  }

  public void setVersion(String version) {
    this.version = version;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    APISimpleBean apISimpleBean = (APISimpleBean) o;
    return Objects.equals(this.appsCount, apISimpleBean.appsCount) &&
        Objects.equals(this.creationDate, apISimpleBean.creationDate) &&
        Objects.equals(this.description, apISimpleBean.description) &&
        Objects.equals(this.icon, apISimpleBean.icon) &&
        Objects.equals(this.id, apISimpleBean.id) &&
        Objects.equals(this.name, apISimpleBean.name) &&
        Objects.equals(this.plans, apISimpleBean.plans) &&
        Objects.equals(this.version, apISimpleBean.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(appsCount, creationDate, description, icon, id, name, plans, version);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class APISimpleBean {\n");
    
    sb.append("    appsCount: ").append(toIndentedString(appsCount)).append("\n");
    sb.append("    creationDate: ").append(toIndentedString(creationDate)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    icon: ").append(toIndentedString(icon)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    plans: ").append(toIndentedString(plans)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
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

