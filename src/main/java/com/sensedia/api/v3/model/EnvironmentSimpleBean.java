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
import com.sensedia.api.v3.model.DeploymentSimpleBean;
import com.sensedia.api.v3.model.EvironmentUserBean;
import com.sensedia.api.v3.model.TeamBean;
import com.sensedia.api.v3.model.UserBean;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

/**
 * EnvironmentSimpleBean
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-09-25T23:40:42.718-03:00")
public class EnvironmentSimpleBean {
  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("inboundUrl")
  private String inboundUrl = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("owner")
  private UserBean owner = null;

  @JsonProperty("revisionDeployed")
  private DeploymentSimpleBean revisionDeployed = null;

  @JsonProperty("teamVisibility")
  private TeamBean teamVisibility = null;

  @JsonProperty("users")
  private List<EvironmentUserBean> users = null;

  /**
   * Gets or Sets visibilityType
   */
  public enum VisibilityTypeEnum {
    ORGANIZATION("ORGANIZATION"),
    
    TEAM("TEAM"),
    
    ME("ME");

    private String value;

    VisibilityTypeEnum(String value) {
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
    public static VisibilityTypeEnum fromValue(String text) {
      for (VisibilityTypeEnum b : VisibilityTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("visibilityType")
  private VisibilityTypeEnum visibilityType = null;

  public EnvironmentSimpleBean id(Long id) {
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

  public EnvironmentSimpleBean inboundUrl(String inboundUrl) {
    this.inboundUrl = inboundUrl;
    return this;
  }

   /**
   * Get inboundUrl
   * @return inboundUrl
  **/
  @ApiModelProperty(value = "")
  public String getInboundUrl() {
    return inboundUrl;
  }

  public void setInboundUrl(String inboundUrl) {
    this.inboundUrl = inboundUrl;
  }

  public EnvironmentSimpleBean name(String name) {
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

  public EnvironmentSimpleBean owner(UserBean owner) {
    this.owner = owner;
    return this;
  }

   /**
   * Get owner
   * @return owner
  **/
  @ApiModelProperty(value = "")
  public UserBean getOwner() {
    return owner;
  }

  public void setOwner(UserBean owner) {
    this.owner = owner;
  }

  public EnvironmentSimpleBean revisionDeployed(DeploymentSimpleBean revisionDeployed) {
    this.revisionDeployed = revisionDeployed;
    return this;
  }

   /**
   * Get revisionDeployed
   * @return revisionDeployed
  **/
  @ApiModelProperty(value = "")
  public DeploymentSimpleBean getRevisionDeployed() {
    return revisionDeployed;
  }

  public void setRevisionDeployed(DeploymentSimpleBean revisionDeployed) {
    this.revisionDeployed = revisionDeployed;
  }

  public EnvironmentSimpleBean teamVisibility(TeamBean teamVisibility) {
    this.teamVisibility = teamVisibility;
    return this;
  }

   /**
   * Get teamVisibility
   * @return teamVisibility
  **/
  @ApiModelProperty(value = "")
  public TeamBean getTeamVisibility() {
    return teamVisibility;
  }

  public void setTeamVisibility(TeamBean teamVisibility) {
    this.teamVisibility = teamVisibility;
  }

  public EnvironmentSimpleBean users(List<EvironmentUserBean> users) {
    this.users = users;
    return this;
  }

  public EnvironmentSimpleBean addUsersItem(EvironmentUserBean usersItem) {
    if (this.users == null) {
      this.users = new ArrayList<EvironmentUserBean>();
    }
    this.users.add(usersItem);
    return this;
  }

   /**
   * Get users
   * @return users
  **/
  @ApiModelProperty(value = "")
  public List<EvironmentUserBean> getUsers() {
    return users;
  }

  public void setUsers(List<EvironmentUserBean> users) {
    this.users = users;
  }

  public EnvironmentSimpleBean visibilityType(VisibilityTypeEnum visibilityType) {
    this.visibilityType = visibilityType;
    return this;
  }

   /**
   * Get visibilityType
   * @return visibilityType
  **/
  @ApiModelProperty(value = "")
  public VisibilityTypeEnum getVisibilityType() {
    return visibilityType;
  }

  public void setVisibilityType(VisibilityTypeEnum visibilityType) {
    this.visibilityType = visibilityType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EnvironmentSimpleBean environmentSimpleBean = (EnvironmentSimpleBean) o;
    return Objects.equals(this.id, environmentSimpleBean.id) &&
        Objects.equals(this.inboundUrl, environmentSimpleBean.inboundUrl) &&
        Objects.equals(this.name, environmentSimpleBean.name) &&
        Objects.equals(this.owner, environmentSimpleBean.owner) &&
        Objects.equals(this.revisionDeployed, environmentSimpleBean.revisionDeployed) &&
        Objects.equals(this.teamVisibility, environmentSimpleBean.teamVisibility) &&
        Objects.equals(this.users, environmentSimpleBean.users) &&
        Objects.equals(this.visibilityType, environmentSimpleBean.visibilityType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, inboundUrl, name, owner, revisionDeployed, teamVisibility, users, visibilityType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EnvironmentSimpleBean {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    inboundUrl: ").append(toIndentedString(inboundUrl)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
    sb.append("    revisionDeployed: ").append(toIndentedString(revisionDeployed)).append("\n");
    sb.append("    teamVisibility: ").append(toIndentedString(teamVisibility)).append("\n");
    sb.append("    users: ").append(toIndentedString(users)).append("\n");
    sb.append("    visibilityType: ").append(toIndentedString(visibilityType)).append("\n");
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

