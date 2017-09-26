package com.sensedia.api.v3;

import com.sensedia.api.v3.client.ApiException;
import com.sensedia.api.v3.client.ApiClient;
import com.sensedia.api.v3.client.Configuration;
import com.sensedia.api.v3.client.Pair;

import javax.ws.rs.core.GenericType;

import com.sensedia.api.v3.model.APP;
import com.sensedia.api.v3.model.APPResponse;
import com.sensedia.api.v3.model.ChangeLogBean;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-09-25T23:40:42.718-03:00")
public class AppsApi {
  private ApiClient apiClient;

  public AppsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public AppsApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Retrieve App total
   * 
   * @param sensediaAuth Sensedia-Auth (required)
   * @return Long
   * @throws ApiException if fails to make API call
   */
  public Long appsCount1(String sensediaAuth) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'sensediaAuth' is set
    if (sensediaAuth == null) {
      throw new ApiException(400, "Missing the required parameter 'sensediaAuth' when calling appsCount1");
    }
    
    // create path and map variables
    String localVarPath = "/apps/count";

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

    GenericType<Long> localVarReturnType = new GenericType<Long>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Create a new app
   * 
   * @param sensediaAuth Sensedia-Auth (required)
   * @param appTokenBean App json to create a new app. (optional)
   * @return APPResponse
   * @throws ApiException if fails to make API call
   */
  public APPResponse createApp1(String sensediaAuth, APP appTokenBean) throws ApiException {
    Object localVarPostBody = appTokenBean;
    
    // verify the required parameter 'sensediaAuth' is set
    if (sensediaAuth == null) {
      throw new ApiException(400, "Missing the required parameter 'sensediaAuth' when calling createApp1");
    }
    
    // create path and map variables
    String localVarPath = "/apps";

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

    GenericType<APPResponse> localVarReturnType = new GenericType<APPResponse>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Return all apps
   * 
   * @param sensediaAuth Sensedia-Auth (required)
   * @return List&lt;APP&gt;
   * @throws ApiException if fails to make API call
   */
  public List<APP> getAppTokenByAppGallery1(String sensediaAuth) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'sensediaAuth' is set
    if (sensediaAuth == null) {
      throw new ApiException(400, "Missing the required parameter 'sensediaAuth' when calling getAppTokenByAppGallery1");
    }
    
    // create path and map variables
    String localVarPath = "/apps/gallery";

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

    GenericType<List<APP>> localVarReturnType = new GenericType<List<APP>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Find app list by filters
   * 
   * @param sensediaAuth Sensedia-Auth (required)
   * @param clientId clientId (optional)
   * @param name name (optional)
   * @param keyword keyword (optional)
   * @param status status (optional)
   * @param developer developer (optional)
   * @param actualPage actualPage (optional)
   * @param pageSize pageSize (optional)
   * @param appIds appIds (optional)
   * @param beginDate beginDate (optional)
   * @param endDate endDate (optional)
   * @param extraFields extraFields (optional)
   * @return List&lt;APP&gt;
   * @throws ApiException if fails to make API call
   */
  public List<APP> getAppTokenByFilter1(String sensediaAuth, String clientId, String name, String keyword, String status, String developer, Integer actualPage, Integer pageSize, String appIds, String beginDate, String endDate, String extraFields) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'sensediaAuth' is set
    if (sensediaAuth == null) {
      throw new ApiException(400, "Missing the required parameter 'sensediaAuth' when calling getAppTokenByFilter1");
    }
    
    // create path and map variables
    String localVarPath = "/apps";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "clientId", clientId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "name", name));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "keyword", keyword));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "status", status));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "developer", developer));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "actualPage", actualPage));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "pageSize", pageSize));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "appIds", appIds));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "beginDate", beginDate));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "endDate", endDate));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "extraFields", extraFields));

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

    GenericType<List<APP>> localVarReturnType = new GenericType<List<APP>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Find app by code
   * 
   * @param sensediaAuth Sensedia-Auth (required)
   * @param code Client ID (required)
   * @param limitAccessTokens Limit the access token return (optional)
   * @param codeAccessTokens Code access token (optional)
   * @param filterAccessTokens Filter access tokens (optional)
   * @return APP
   * @throws ApiException if fails to make API call
   */
  public APP getAppTokenById1(String sensediaAuth, String code, Integer limitAccessTokens, String codeAccessTokens, Boolean filterAccessTokens) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'sensediaAuth' is set
    if (sensediaAuth == null) {
      throw new ApiException(400, "Missing the required parameter 'sensediaAuth' when calling getAppTokenById1");
    }
    
    // verify the required parameter 'code' is set
    if (code == null) {
      throw new ApiException(400, "Missing the required parameter 'code' when calling getAppTokenById1");
    }
    
    // create path and map variables
    String localVarPath = "/apps/{code}"
      .replaceAll("\\{" + "code" + "\\}", apiClient.escapeString(code.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limitAccessTokens", limitAccessTokens));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "codeAccessTokens", codeAccessTokens));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filterAccessTokens", filterAccessTokens));

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

    GenericType<APP> localVarReturnType = new GenericType<APP>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Retrive changelog per app id
   * 
   * @param sensediaAuth Sensedia-Auth (required)
   * @param id id (required)
   * @return List&lt;ChangeLogBean&gt;
   * @throws ApiException if fails to make API call
   */
  public List<ChangeLogBean> getChangeLogByAppId1(String sensediaAuth, Long id) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'sensediaAuth' is set
    if (sensediaAuth == null) {
      throw new ApiException(400, "Missing the required parameter 'sensediaAuth' when calling getChangeLogByAppId1");
    }
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling getChangeLogByAppId1");
    }
    
    // create path and map variables
    String localVarPath = "/apps/{id}/changelog"
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

    GenericType<List<ChangeLogBean>> localVarReturnType = new GenericType<List<ChangeLogBean>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Delete a app
   * 
   * @param sensediaAuth Sensedia-Auth (required)
   * @param id id (required)
   * @throws ApiException if fails to make API call
   */
  public void removeApp1(String sensediaAuth, String id) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'sensediaAuth' is set
    if (sensediaAuth == null) {
      throw new ApiException(400, "Missing the required parameter 'sensediaAuth' when calling removeApp1");
    }
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling removeApp1");
    }
    
    // create path and map variables
    String localVarPath = "/apps/{id}"
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


    apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
  }
  /**
   * Update a app
   * 
   * @param sensediaAuth Sensedia-Auth (required)
   * @param id App json to update a app. (required)
   * @param appTokenBean appTokenBean (required)
   * @return APPResponse
   * @throws ApiException if fails to make API call
   */
  public APPResponse updateApp1(String sensediaAuth, String id, APP appTokenBean) throws ApiException {
    Object localVarPostBody = appTokenBean;
    
    // verify the required parameter 'sensediaAuth' is set
    if (sensediaAuth == null) {
      throw new ApiException(400, "Missing the required parameter 'sensediaAuth' when calling updateApp1");
    }
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling updateApp1");
    }
    
    // verify the required parameter 'appTokenBean' is set
    if (appTokenBean == null) {
      throw new ApiException(400, "Missing the required parameter 'appTokenBean' when calling updateApp1");
    }
    
    // create path and map variables
    String localVarPath = "/apps/{id}"
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

    GenericType<APPResponse> localVarReturnType = new GenericType<APPResponse>() {};
    return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Validate partial app
   * 
   * @param sensediaAuth Sensedia-Auth (required)
   * @param appTokenBean App json to validate app (optional)
   * @return Object
   * @throws ApiException if fails to make API call
   */
  public Object validatePartialApp1(String sensediaAuth, APP appTokenBean) throws ApiException {
    Object localVarPostBody = appTokenBean;
    
    // verify the required parameter 'sensediaAuth' is set
    if (sensediaAuth == null) {
      throw new ApiException(400, "Missing the required parameter 'sensediaAuth' when calling validatePartialApp1");
    }
    
    // create path and map variables
    String localVarPath = "/apps/validate";

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

    GenericType<Object> localVarReturnType = new GenericType<Object>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
}
