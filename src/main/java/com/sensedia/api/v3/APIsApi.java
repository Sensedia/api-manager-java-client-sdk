package com.sensedia.api.v3;

import com.sensedia.api.v3.client.ApiException;
import com.sensedia.api.v3.client.ApiClient;
import com.sensedia.api.v3.client.Configuration;
import com.sensedia.api.v3.client.Pair;

import javax.ws.rs.core.GenericType;

import com.sensedia.api.v3.model.API;
import com.sensedia.api.v3.model.APICreateBean;
import com.sensedia.api.v3.model.ChangeLog;
import com.sensedia.api.v3.model.ModelAPIResponse;
import com.sensedia.api.v3.model.ResponseEntity;
import com.sensedia.api.v3.model.RevisionBean;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-09-06T11:21:38.562-03:00")
public class APIsApi {
  private ApiClient apiClient;

  public APIsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public APIsApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Clone a API
   * 
   * @param id API id (required)
   * @param sensediaAuth Sensedia-Auth (optional)
   * @param apiBean API json to update a api (optional)
   * @return ModelAPIResponse
   * @throws ApiException if fails to make API call
   */
  public ModelAPIResponse cloneApi1(String id, String sensediaAuth, API apiBean) throws ApiException {
    Object localVarPostBody = apiBean;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling cloneApi1");
    }
    
    // create path and map variables
    String localVarPath = "/apis/{id}/clone"
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    if (sensediaAuth != null)
      localVarHeaderParams.put("Sensedia-Auth", apiClient.parameterToString(sensediaAuth));

    
    final String[] localVarAccepts = {
      "*/*"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<ModelAPIResponse> localVarReturnType = new GenericType<ModelAPIResponse>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Create a new API
   * 
   * @param sensediaAuth Sensedia-Auth (optional)
   * @param bean API json to create a API (optional)
   * @return ModelAPIResponse
   * @throws ApiException if fails to make API call
   */
  public ModelAPIResponse createApi1(String sensediaAuth, APICreateBean bean) throws ApiException {
    Object localVarPostBody = bean;
    
    // create path and map variables
    String localVarPath = "/apis";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    if (sensediaAuth != null)
      localVarHeaderParams.put("Sensedia-Auth", apiClient.parameterToString(sensediaAuth));

    
    final String[] localVarAccepts = {
      "*/*"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<ModelAPIResponse> localVarReturnType = new GenericType<ModelAPIResponse>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Create new version
   * 
   * @param id API id (required)
   * @param sensediaAuth Sensedia-Auth (optional)
   * @param apiBean API json to update a api (optional)
   * @return ModelAPIResponse
   * @throws ApiException if fails to make API call
   */
  public ModelAPIResponse createNewVersion1(String id, String sensediaAuth, API apiBean) throws ApiException {
    Object localVarPostBody = apiBean;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling createNewVersion1");
    }
    
    // create path and map variables
    String localVarPath = "/apis/{id}/versions"
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    if (sensediaAuth != null)
      localVarHeaderParams.put("Sensedia-Auth", apiClient.parameterToString(sensediaAuth));

    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<ModelAPIResponse> localVarReturnType = new GenericType<ModelAPIResponse>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Find API by id
   * 
   * @param apiId API id (required)
   * @param sensediaAuth Sensedia-Auth (optional)
   * @param filter Filter type searched (optional)
   * @return API
   * @throws ApiException if fails to make API call
   */
  public API getApiById1(String apiId, String sensediaAuth, String filter) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'apiId' is set
    if (apiId == null) {
      throw new ApiException(400, "Missing the required parameter 'apiId' when calling getApiById1");
    }
    
    // create path and map variables
    String localVarPath = "/apis/{apiId}"
      .replaceAll("\\{" + "apiId" + "\\}", apiClient.escapeString(apiId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter", filter));

    if (sensediaAuth != null)
      localVarHeaderParams.put("Sensedia-Auth", apiClient.parameterToString(sensediaAuth));

    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<API> localVarReturnType = new GenericType<API>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Return all APIs
   * 
   * @param sensediaAuth Sensedia-Auth (optional)
   * @param privateAPI Private API (optional)
   * @param filter Filter type searched (optional)
   * @return List&lt;API&gt;
   * @throws ApiException if fails to make API call
   */
  public List<API> getApis1(String sensediaAuth, Boolean privateAPI, String filter) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/apis";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "privateAPI", privateAPI));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter", filter));

    if (sensediaAuth != null)
      localVarHeaderParams.put("Sensedia-Auth", apiClient.parameterToString(sensediaAuth));

    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<List<API>> localVarReturnType = new GenericType<List<API>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Retrive changelog per API id
   * 
   * @param id API id (required)
   * @param sensediaAuth Sensedia-Auth (optional)
   * @return List&lt;ChangeLog&gt;
   * @throws ApiException if fails to make API call
   */
  public List<ChangeLog> getChangeLogByApiId1(Long id, String sensediaAuth) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling getChangeLogByApiId1");
    }
    
    // create path and map variables
    String localVarPath = "/apis/{id}/changelog"
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    if (sensediaAuth != null)
      localVarHeaderParams.put("Sensedia-Auth", apiClient.parameterToString(sensediaAuth));

    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<List<ChangeLog>> localVarReturnType = new GenericType<List<ChangeLog>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Find last revision by API id
   * 
   * @param id id (required)
   * @param sensediaAuth Sensedia-Auth (optional)
   * @return RevisionBean
   * @throws ApiException if fails to make API call
   */
  public RevisionBean getLastRevisionByApi1(Long id, String sensediaAuth) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling getLastRevisionByApi1");
    }
    
    // create path and map variables
    String localVarPath = "/apis/{id}/revisions"
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    if (sensediaAuth != null)
      localVarHeaderParams.put("Sensedia-Auth", apiClient.parameterToString(sensediaAuth));

    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<RevisionBean> localVarReturnType = new GenericType<RevisionBean>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Find version by API id
   * 
   * @param id API id (required)
   * @param sensediaAuth Sensedia-Auth (optional)
   * @return List&lt;API&gt;
   * @throws ApiException if fails to make API call
   */
  public List<API> getVersionsByApi1(String id, String sensediaAuth) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling getVersionsByApi1");
    }
    
    // create path and map variables
    String localVarPath = "/apis/{id}/versions"
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    if (sensediaAuth != null)
      localVarHeaderParams.put("Sensedia-Auth", apiClient.parameterToString(sensediaAuth));

    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<List<API>> localVarReturnType = new GenericType<List<API>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Delete a API
   * 
   * @param id API id (required)
   * @param sensediaAuth Sensedia-Auth (optional)
   * @return ResponseEntity
   * @throws ApiException if fails to make API call
   */
  public ResponseEntity removeApi1(String id, String sensediaAuth) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling removeApi1");
    }
    
    // create path and map variables
    String localVarPath = "/apis/{id}"
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    if (sensediaAuth != null)
      localVarHeaderParams.put("Sensedia-Auth", apiClient.parameterToString(sensediaAuth));

    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<ResponseEntity> localVarReturnType = new GenericType<ResponseEntity>() {};
    return apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Delete environment link with API
   * 
   * @param id id (required)
   * @param environmentId environmentId (required)
   * @param sensediaAuth Sensedia-Auth (optional)
   * @return ResponseEntity
   * @throws ApiException if fails to make API call
   */
  public ResponseEntity removeLinkEnvironmentWithApi1(String id, String environmentId, String sensediaAuth) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling removeLinkEnvironmentWithApi1");
    }
    
    // verify the required parameter 'environmentId' is set
    if (environmentId == null) {
      throw new ApiException(400, "Missing the required parameter 'environmentId' when calling removeLinkEnvironmentWithApi1");
    }
    
    // create path and map variables
    String localVarPath = "/apis/{id}/environments/{environmentId}"
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()))
      .replaceAll("\\{" + "environmentId" + "\\}", apiClient.escapeString(environmentId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    if (sensediaAuth != null)
      localVarHeaderParams.put("Sensedia-Auth", apiClient.parameterToString(sensediaAuth));

    
    final String[] localVarAccepts = {
      "*/*"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<ResponseEntity> localVarReturnType = new GenericType<ResponseEntity>() {};
    return apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Update a API
   * 
   * @param id API id (required)
   * @param sensediaAuth Sensedia-Auth (optional)
   * @param apiBean API json to update a api (optional)
   * @return ModelAPIResponse
   * @throws ApiException if fails to make API call
   */
  public ModelAPIResponse updateApi1(String id, String sensediaAuth, API apiBean) throws ApiException {
    Object localVarPostBody = apiBean;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling updateApi1");
    }
    
    // create path and map variables
    String localVarPath = "/apis/{id}"
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    if (sensediaAuth != null)
      localVarHeaderParams.put("Sensedia-Auth", apiClient.parameterToString(sensediaAuth));

    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<ModelAPIResponse> localVarReturnType = new GenericType<ModelAPIResponse>() {};
    return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Validate partial a API
   * 
   * @param sensediaAuth Sensedia-Auth (optional)
   * @param bean API json to validate a API (optional)
   * @return ResponseEntity
   * @throws ApiException if fails to make API call
   */
  public ResponseEntity validatePartialApi1(String sensediaAuth, API bean) throws ApiException {
    Object localVarPostBody = bean;
    
    // create path and map variables
    String localVarPath = "/apis/validate";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    if (sensediaAuth != null)
      localVarHeaderParams.put("Sensedia-Auth", apiClient.parameterToString(sensediaAuth));

    
    final String[] localVarAccepts = {
      "*/*"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<ResponseEntity> localVarReturnType = new GenericType<ResponseEntity>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
}
