package com.sensedia.api.v3;

import com.sensedia.api.v3.client.ApiException;
import com.sensedia.api.v3.client.ApiClient;
import com.sensedia.api.v3.client.Configuration;
import com.sensedia.api.v3.client.Pair;

import javax.ws.rs.core.GenericType;

import com.sensedia.api.v3.model.AccessToken;
import com.sensedia.api.v3.model.AccessTokenResponse;
import com.sensedia.api.v3.model.ChangeLogBean;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-09-25T23:40:42.718-03:00")
public class AccessTokensApi {
  private ApiClient apiClient;

  public AccessTokensApi() {
    this(Configuration.getDefaultApiClient());
  }

  public AccessTokensApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Retrieve access token total
   * 
   * @param sensediaAuth Sensedia-Auth (required)
   * @return Long
   * @throws ApiException if fails to make API call
   */
  public Long accessTokenCount1(String sensediaAuth) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'sensediaAuth' is set
    if (sensediaAuth == null) {
      throw new ApiException(400, "Missing the required parameter 'sensediaAuth' when calling accessTokenCount1");
    }
    
    // create path and map variables
    String localVarPath = "/access-tokens/count";

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
   * Create a new access token
   * 
   * @param sensediaAuth Sensedia-Auth (required)
   * @param bean Access token json to create a new access token. (optional)
   * @return AccessToken
   * @throws ApiException if fails to make API call
   */
  public AccessToken createAccessToken1(String sensediaAuth, AccessToken bean) throws ApiException {
    Object localVarPostBody = bean;
    
    // verify the required parameter 'sensediaAuth' is set
    if (sensediaAuth == null) {
      throw new ApiException(400, "Missing the required parameter 'sensediaAuth' when calling createAccessToken1");
    }
    
    // create path and map variables
    String localVarPath = "/access-tokens";

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

    GenericType<AccessToken> localVarReturnType = new GenericType<AccessToken>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Find access token list by filters
   * 
   * @param sensediaAuth Sensedia-Auth (required)
   * @param code code (optional)
   * @param owner owner (optional)
   * @param status staus(ACTIVE, REVOKED, EXPIRED) (optional)
   * @param expiresIn Expires in millisecond (optional)
   * @param refreshToken Refresh code (optional)
   * @param scope Scope (optional)
   * @param keyword Keyword to find between code or owner (optional)
   * @param actualPage Number of the page in pagination. The starting page number is zero. (optional)
   * @param pageSize Define the size of the returned list of developers. (optional)
   * @param authIds Id access token separated by space. Ex:(1 3 6 8) (optional)
   * @param beginDate Begin date (optional)
   * @param endDate End date (optional)
   * @param extraFields Extra field separated by comma (optional)
   * @return List&lt;AccessToken&gt;
   * @throws ApiException if fails to make API call
   */
  public List<AccessToken> getAccessToken1(String sensediaAuth, String code, String owner, String status, Long expiresIn, String refreshToken, String scope, String keyword, Integer actualPage, Integer pageSize, String authIds, String beginDate, String endDate, String extraFields) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'sensediaAuth' is set
    if (sensediaAuth == null) {
      throw new ApiException(400, "Missing the required parameter 'sensediaAuth' when calling getAccessToken1");
    }
    
    // create path and map variables
    String localVarPath = "/access-tokens";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "code", code));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "owner", owner));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "status", status));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "expiresIn", expiresIn));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "refreshToken", refreshToken));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "scope", scope));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "keyword", keyword));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "actualPage", actualPage));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "pageSize", pageSize));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "authIds", authIds));
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

    GenericType<List<AccessToken>> localVarReturnType = new GenericType<List<AccessToken>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Retrive changelog per access token id
   * 
   * @param sensediaAuth Sensedia-Auth (required)
   * @param id Access token id (required)
   * @return List&lt;ChangeLogBean&gt;
   * @throws ApiException if fails to make API call
   */
  public List<ChangeLogBean> getChangeLogByAccessTokenId1(String sensediaAuth, Long id) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'sensediaAuth' is set
    if (sensediaAuth == null) {
      throw new ApiException(400, "Missing the required parameter 'sensediaAuth' when calling getChangeLogByAccessTokenId1");
    }
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling getChangeLogByAccessTokenId1");
    }
    
    // create path and map variables
    String localVarPath = "/access-tokens/{id}/changelog"
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

    GenericType<List<ChangeLogBean>> localVarReturnType = new GenericType<List<ChangeLogBean>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Find access token by code
   * 
   * @param sensediaAuth Sensedia-Auth (required)
   * @param code Code (required)
   * @return AccessToken
   * @throws ApiException if fails to make API call
   */
  public AccessToken getTokenByCode1(String sensediaAuth, String code) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'sensediaAuth' is set
    if (sensediaAuth == null) {
      throw new ApiException(400, "Missing the required parameter 'sensediaAuth' when calling getTokenByCode1");
    }
    
    // verify the required parameter 'code' is set
    if (code == null) {
      throw new ApiException(400, "Missing the required parameter 'code' when calling getTokenByCode1");
    }
    
    // create path and map variables
    String localVarPath = "/access-tokens/{code}"
      .replaceAll("\\{" + "code" + "\\}", apiClient.escapeString(code.toString()));

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

    GenericType<AccessToken> localVarReturnType = new GenericType<AccessToken>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Remove a access token
   * 
   * @param sensediaAuth Sensedia-Auth (required)
   * @param id App id (required)
   * @throws ApiException if fails to make API call
   */
  public void removeAccessToken1(String sensediaAuth, String id) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'sensediaAuth' is set
    if (sensediaAuth == null) {
      throw new ApiException(400, "Missing the required parameter 'sensediaAuth' when calling removeAccessToken1");
    }
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling removeAccessToken1");
    }
    
    // create path and map variables
    String localVarPath = "/access-tokens/{id}"
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


    apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
  }
  /**
   * Update a access token
   * 
   * @param sensediaAuth Sensedia-Auth (required)
   * @param id Access token id (required)
   * @param bean Access token json to update a access token. (optional)
   * @return AccessTokenResponse
   * @throws ApiException if fails to make API call
   */
  public AccessTokenResponse updateAccesstoken1(String sensediaAuth, String id, AccessToken bean) throws ApiException {
    Object localVarPostBody = bean;
    
    // verify the required parameter 'sensediaAuth' is set
    if (sensediaAuth == null) {
      throw new ApiException(400, "Missing the required parameter 'sensediaAuth' when calling updateAccesstoken1");
    }
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling updateAccesstoken1");
    }
    
    // create path and map variables
    String localVarPath = "/access-tokens/{id}"
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

    GenericType<AccessTokenResponse> localVarReturnType = new GenericType<AccessTokenResponse>() {};
    return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Validate partial access token
   * 
   * @param sensediaAuth Sensedia-Auth (required)
   * @param bean Access token json to validate a access token. (optional)
   * @return Object
   * @throws ApiException if fails to make API call
   */
  public Object validatePartialAccessToken1(String sensediaAuth, AccessToken bean) throws ApiException {
    Object localVarPostBody = bean;
    
    // verify the required parameter 'sensediaAuth' is set
    if (sensediaAuth == null) {
      throw new ApiException(400, "Missing the required parameter 'sensediaAuth' when calling validatePartialAccessToken1");
    }
    
    // create path and map variables
    String localVarPath = "/access-tokens/validate";

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
