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
import com.sensedia.api.v3.model.RoleBean;
import com.sensedia.api.v3.model.TeamBean;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

/**
 * UserBean
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-09-06T11:21:38.562-03:00")
public class UserBean {
  @JsonProperty("email")
  private String email = null;

  @JsonProperty("hasAllPermissions")
  private Boolean hasAllPermissions = null;

  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("image")
  private String image = null;

  @JsonProperty("login")
  private String login = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("password")
  private String password = null;

  @JsonProperty("passwordConfirm")
  private String passwordConfirm = null;

  @JsonProperty("roles")
  private List<RoleBean> roles = null;

  @JsonProperty("teamUserId")
  private Long teamUserId = null;

  @JsonProperty("teams")
  private List<TeamBean> teams = null;

  /**
   * Gets or Sets userType
   */
  public enum UserTypeEnum {
    DATABASE("DATABASE"),
    
    LDAP("LDAP");

    private String value;

    UserTypeEnum(String value) {
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
    public static UserTypeEnum fromValue(String text) {
      for (UserTypeEnum b : UserTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("userType")
  private UserTypeEnum userType = null;

  public UserBean email(String email) {
    this.email = email;
    return this;
  }

   /**
   * Get email
   * @return email
  **/
  @ApiModelProperty(value = "")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public UserBean hasAllPermissions(Boolean hasAllPermissions) {
    this.hasAllPermissions = hasAllPermissions;
    return this;
  }

   /**
   * Get hasAllPermissions
   * @return hasAllPermissions
  **/
  @ApiModelProperty(value = "")
  public Boolean getHasAllPermissions() {
    return hasAllPermissions;
  }

  public void setHasAllPermissions(Boolean hasAllPermissions) {
    this.hasAllPermissions = hasAllPermissions;
  }

  public UserBean id(Long id) {
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

  public UserBean image(String image) {
    this.image = image;
    return this;
  }

   /**
   * Get image
   * @return image
  **/
  @ApiModelProperty(value = "")
  public String getImage() {
    return image;
  }

  public void setImage(String image) {
    this.image = image;
  }

  public UserBean login(String login) {
    this.login = login;
    return this;
  }

   /**
   * Get login
   * @return login
  **/
  @ApiModelProperty(value = "")
  public String getLogin() {
    return login;
  }

  public void setLogin(String login) {
    this.login = login;
  }

  public UserBean name(String name) {
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

  public UserBean password(String password) {
    this.password = password;
    return this;
  }

   /**
   * Get password
   * @return password
  **/
  @ApiModelProperty(value = "")
  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public UserBean passwordConfirm(String passwordConfirm) {
    this.passwordConfirm = passwordConfirm;
    return this;
  }

   /**
   * Get passwordConfirm
   * @return passwordConfirm
  **/
  @ApiModelProperty(value = "")
  public String getPasswordConfirm() {
    return passwordConfirm;
  }

  public void setPasswordConfirm(String passwordConfirm) {
    this.passwordConfirm = passwordConfirm;
  }

  public UserBean roles(List<RoleBean> roles) {
    this.roles = roles;
    return this;
  }

  public UserBean addRolesItem(RoleBean rolesItem) {
    if (this.roles == null) {
      this.roles = new ArrayList<RoleBean>();
    }
    this.roles.add(rolesItem);
    return this;
  }

   /**
   * Get roles
   * @return roles
  **/
  @ApiModelProperty(value = "")
  public List<RoleBean> getRoles() {
    return roles;
  }

  public void setRoles(List<RoleBean> roles) {
    this.roles = roles;
  }

  public UserBean teamUserId(Long teamUserId) {
    this.teamUserId = teamUserId;
    return this;
  }

   /**
   * Get teamUserId
   * @return teamUserId
  **/
  @ApiModelProperty(value = "")
  public Long getTeamUserId() {
    return teamUserId;
  }

  public void setTeamUserId(Long teamUserId) {
    this.teamUserId = teamUserId;
  }

  public UserBean teams(List<TeamBean> teams) {
    this.teams = teams;
    return this;
  }

  public UserBean addTeamsItem(TeamBean teamsItem) {
    if (this.teams == null) {
      this.teams = new ArrayList<TeamBean>();
    }
    this.teams.add(teamsItem);
    return this;
  }

   /**
   * Get teams
   * @return teams
  **/
  @ApiModelProperty(value = "")
  public List<TeamBean> getTeams() {
    return teams;
  }

  public void setTeams(List<TeamBean> teams) {
    this.teams = teams;
  }

  public UserBean userType(UserTypeEnum userType) {
    this.userType = userType;
    return this;
  }

   /**
   * Get userType
   * @return userType
  **/
  @ApiModelProperty(value = "")
  public UserTypeEnum getUserType() {
    return userType;
  }

  public void setUserType(UserTypeEnum userType) {
    this.userType = userType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserBean userBean = (UserBean) o;
    return Objects.equals(this.email, userBean.email) &&
        Objects.equals(this.hasAllPermissions, userBean.hasAllPermissions) &&
        Objects.equals(this.id, userBean.id) &&
        Objects.equals(this.image, userBean.image) &&
        Objects.equals(this.login, userBean.login) &&
        Objects.equals(this.name, userBean.name) &&
        Objects.equals(this.password, userBean.password) &&
        Objects.equals(this.passwordConfirm, userBean.passwordConfirm) &&
        Objects.equals(this.roles, userBean.roles) &&
        Objects.equals(this.teamUserId, userBean.teamUserId) &&
        Objects.equals(this.teams, userBean.teams) &&
        Objects.equals(this.userType, userBean.userType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(email, hasAllPermissions, id, image, login, name, password, passwordConfirm, roles, teamUserId, teams, userType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserBean {\n");
    
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    hasAllPermissions: ").append(toIndentedString(hasAllPermissions)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    image: ").append(toIndentedString(image)).append("\n");
    sb.append("    login: ").append(toIndentedString(login)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    passwordConfirm: ").append(toIndentedString(passwordConfirm)).append("\n");
    sb.append("    roles: ").append(toIndentedString(roles)).append("\n");
    sb.append("    teamUserId: ").append(toIndentedString(teamUserId)).append("\n");
    sb.append("    teams: ").append(toIndentedString(teams)).append("\n");
    sb.append("    userType: ").append(toIndentedString(userType)).append("\n");
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

