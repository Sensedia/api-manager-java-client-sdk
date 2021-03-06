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
import com.sensedia.api.v3.model.InterceptorBean;
import com.sensedia.api.v3.model.OperationUrlBean;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

/**
 * OperationBean
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-09-25T23:40:42.718-03:00")
public class OperationBean {
  @JsonProperty("apiBroken")
  private Boolean apiBroken = null;

  @JsonProperty("async")
  private Boolean async = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("destination")
  private String destination = null;

  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("interceptors")
  private List<InterceptorBean> interceptors = null;

  @JsonProperty("method")
  private String method = null;

  @JsonProperty("path")
  private String path = null;

  @JsonProperty("timeout")
  private String timeout = null;

  @JsonProperty("urls")
  private List<OperationUrlBean> urls = null;

  public OperationBean apiBroken(Boolean apiBroken) {
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

  public OperationBean async(Boolean async) {
    this.async = async;
    return this;
  }

   /**
   * Get async
   * @return async
  **/
  @ApiModelProperty(value = "")
  public Boolean getAsync() {
    return async;
  }

  public void setAsync(Boolean async) {
    this.async = async;
  }

  public OperationBean description(String description) {
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

  public OperationBean destination(String destination) {
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

  public OperationBean id(Long id) {
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

  public OperationBean interceptors(List<InterceptorBean> interceptors) {
    this.interceptors = interceptors;
    return this;
  }

  public OperationBean addInterceptorsItem(InterceptorBean interceptorsItem) {
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

  public OperationBean method(String method) {
    this.method = method;
    return this;
  }

   /**
   * Get method
   * @return method
  **/
  @ApiModelProperty(value = "")
  public String getMethod() {
    return method;
  }

  public void setMethod(String method) {
    this.method = method;
  }

  public OperationBean path(String path) {
    this.path = path;
    return this;
  }

   /**
   * Get path
   * @return path
  **/
  @ApiModelProperty(value = "")
  public String getPath() {
    return path;
  }

  public void setPath(String path) {
    this.path = path;
  }

  public OperationBean timeout(String timeout) {
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

  public OperationBean urls(List<OperationUrlBean> urls) {
    this.urls = urls;
    return this;
  }

  public OperationBean addUrlsItem(OperationUrlBean urlsItem) {
    if (this.urls == null) {
      this.urls = new ArrayList<OperationUrlBean>();
    }
    this.urls.add(urlsItem);
    return this;
  }

   /**
   * Get urls
   * @return urls
  **/
  @ApiModelProperty(value = "")
  public List<OperationUrlBean> getUrls() {
    return urls;
  }

  public void setUrls(List<OperationUrlBean> urls) {
    this.urls = urls;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OperationBean operationBean = (OperationBean) o;
    return Objects.equals(this.apiBroken, operationBean.apiBroken) &&
        Objects.equals(this.async, operationBean.async) &&
        Objects.equals(this.description, operationBean.description) &&
        Objects.equals(this.destination, operationBean.destination) &&
        Objects.equals(this.id, operationBean.id) &&
        Objects.equals(this.interceptors, operationBean.interceptors) &&
        Objects.equals(this.method, operationBean.method) &&
        Objects.equals(this.path, operationBean.path) &&
        Objects.equals(this.timeout, operationBean.timeout) &&
        Objects.equals(this.urls, operationBean.urls);
  }

  @Override
  public int hashCode() {
    return Objects.hash(apiBroken, async, description, destination, id, interceptors, method, path, timeout, urls);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OperationBean {\n");
    
    sb.append("    apiBroken: ").append(toIndentedString(apiBroken)).append("\n");
    sb.append("    async: ").append(toIndentedString(async)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    destination: ").append(toIndentedString(destination)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    interceptors: ").append(toIndentedString(interceptors)).append("\n");
    sb.append("    method: ").append(toIndentedString(method)).append("\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    timeout: ").append(toIndentedString(timeout)).append("\n");
    sb.append("    urls: ").append(toIndentedString(urls)).append("\n");
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

