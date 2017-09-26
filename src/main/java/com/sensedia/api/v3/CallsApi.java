package com.sensedia.api.v3;

import com.sensedia.api.v3.client.ApiException;
import com.sensedia.api.v3.client.ApiClient;
import com.sensedia.api.v3.client.Configuration;
import com.sensedia.api.v3.client.Pair;

import javax.ws.rs.core.GenericType;

import com.sensedia.api.v3.model.Call;
import com.sensedia.api.v3.model.CallResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-09-25T23:40:42.718-03:00")
public class CallsApi {
  private ApiClient apiClient;

  public CallsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public CallsApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Retrive call by id
   * 
   * @param sensediaAuth Sensedia-Auth (required)
   * @param id Call id (required)
   * @return Call
   * @throws ApiException if fails to make API call
   */
  public Call retriveCallById1(String sensediaAuth, String id) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'sensediaAuth' is set
    if (sensediaAuth == null) {
      throw new ApiException(400, "Missing the required parameter 'sensediaAuth' when calling retriveCallById1");
    }
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling retriveCallById1");
    }
    
    // create path and map variables
    String localVarPath = "/calls/{id}"
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

    GenericType<Call> localVarReturnType = new GenericType<Call>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Retrive calls with filters
   * 
   * @param sensediaAuth Sensedia-Auth (required)
   * @param actualPage Number of the page in pagination. The starting page number is zero. (optional)
   * @param baseUris Base uris (optional)
   * @param appTokenCode Code app token (optional)
   * @param pageSize Define the size of the returned list of developers. (optional)
   * @param appTokenName Name app token (optional)
   * @param authTokenOwner Owner auth token (optional)
   * @param apiId API id (optional)
   * @param operationId Operation id (optional)
   * @param resourceId Resource id (optional)
   * @param environmentId Environment id (optional)
   * @param revisionId Revision id (optional)
   * @param uri URI (optional)
   * @param customSearch Custom search (optional)
   * @param method HTTP Method (GET, POST, PUT, DELETE, PATCH, OPTIONS, HEAD) (optional)
   * @param httpStatusFrom HTTP status from (optional)
   * @param httpStatusTo HTTP status to (optional)
   * @param beginDate Begin date (optional)
   * @param endDate End date (optional)
   * @param appDeveloper APP Developer (optional)
   * @param forceDownload Force archive download (optional)
   * @return CallResponse
   * @throws ApiException if fails to make API call
   */
  public CallResponse retriveCallsWithFiltrs1(String sensediaAuth, Integer actualPage, String baseUris, String appTokenCode, Integer pageSize, String appTokenName, String authTokenOwner, Long apiId, Long operationId, Long resourceId, Long environmentId, Long revisionId, String uri, String customSearch, String method, Integer httpStatusFrom, Integer httpStatusTo, String beginDate, String endDate, String appDeveloper, String forceDownload) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'sensediaAuth' is set
    if (sensediaAuth == null) {
      throw new ApiException(400, "Missing the required parameter 'sensediaAuth' when calling retriveCallsWithFiltrs1");
    }
    
    // create path and map variables
    String localVarPath = "/calls";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "actualPage", actualPage));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "baseUris", baseUris));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "appTokenCode", appTokenCode));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "pageSize", pageSize));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "appTokenName", appTokenName));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "authTokenOwner", authTokenOwner));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "apiId", apiId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "operationId", operationId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "resourceId", resourceId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "environmentId", environmentId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "revisionId", revisionId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "uri", uri));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "customSearch", customSearch));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "method", method));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "httpStatusFrom", httpStatusFrom));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "httpStatusTo", httpStatusTo));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "beginDate", beginDate));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "endDate", endDate));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "appDeveloper", appDeveloper));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "forceDownload", forceDownload));

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

    GenericType<CallResponse> localVarReturnType = new GenericType<CallResponse>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Retrive calls total by date
   * 
   * @param sensediaAuth Sensedia-Auth (required)
   * @param date Date searched (required)
   * @param apiId API id (optional)
   * @return Long
   * @throws ApiException if fails to make API call
   */
  public Long retriveTotalCallsByDate1(String sensediaAuth, String date, Long apiId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'sensediaAuth' is set
    if (sensediaAuth == null) {
      throw new ApiException(400, "Missing the required parameter 'sensediaAuth' when calling retriveTotalCallsByDate1");
    }
    
    // verify the required parameter 'date' is set
    if (date == null) {
      throw new ApiException(400, "Missing the required parameter 'date' when calling retriveTotalCallsByDate1");
    }
    
    // create path and map variables
    String localVarPath = "/calls/count/{date}"
      .replaceAll("\\{" + "date" + "\\}", apiClient.escapeString(date.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "apiId", apiId));

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

    GenericType<Long> localVarReturnType = new GenericType<Long>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
}
