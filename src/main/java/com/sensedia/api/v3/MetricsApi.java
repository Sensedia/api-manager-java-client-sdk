package com.sensedia.api.v3;

import com.sensedia.api.v3.client.ApiException;
import com.sensedia.api.v3.client.ApiClient;
import com.sensedia.api.v3.client.Configuration;
import com.sensedia.api.v3.client.Pair;

import javax.ws.rs.core.GenericType;

import com.sensedia.api.v3.model.CacheMetric;
import com.sensedia.api.v3.model.CallsMetric;
import com.sensedia.api.v3.model.LatencyMetric;
import com.sensedia.api.v3.model.OperationHealth;
import com.sensedia.api.v3.model.OperationMetric;
import com.sensedia.api.v3.model.TokensMetric;
import com.sensedia.api.v3.model.TopAccessToken;
import com.sensedia.api.v3.model.TopApp;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-09-25T23:40:42.718-03:00")
public class MetricsApi {
  private ApiClient apiClient;

  public MetricsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public MetricsApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Find access token consolited by month
   * 
   * @param sensediaAuth Sensedia-Auth (required)
   * @param beginDate Begin date (optional)
   * @param endDate End date (optional)
   * @param resolution Metric resolution (optional)
   * @return List&lt;TokensMetric&gt;
   * @throws ApiException if fails to make API call
   */
  public List<TokensMetric> getAccessTokensByMonth1(String sensediaAuth, String beginDate, String endDate, String resolution) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'sensediaAuth' is set
    if (sensediaAuth == null) {
      throw new ApiException(400, "Missing the required parameter 'sensediaAuth' when calling getAccessTokensByMonth1");
    }
    
    // create path and map variables
    String localVarPath = "/metrics/access-tokens";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "beginDate", beginDate));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "endDate", endDate));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "resolution", resolution));

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

    GenericType<List<TokensMetric>> localVarReturnType = new GenericType<List<TokensMetric>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Find apps consolited by month
   * 
   * @param sensediaAuth Sensedia-Auth (required)
   * @param beginDate Begin date (optional)
   * @param endDate End date (optional)
   * @param resolution Metric resolution (optional)
   * @return List&lt;TokensMetric&gt;
   * @throws ApiException if fails to make API call
   */
  public List<TokensMetric> getAppsByMonth1(String sensediaAuth, String beginDate, String endDate, String resolution) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'sensediaAuth' is set
    if (sensediaAuth == null) {
      throw new ApiException(400, "Missing the required parameter 'sensediaAuth' when calling getAppsByMonth1");
    }
    
    // create path and map variables
    String localVarPath = "/metrics/apps";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "beginDate", beginDate));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "endDate", endDate));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "resolution", resolution));

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

    GenericType<List<TokensMetric>> localVarReturnType = new GenericType<List<TokensMetric>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Find cache
   * 
   * @param sensediaAuth Sensedia-Auth (required)
   * @param apiId API id (optional)
   * @param revisionId Revision id (optional)
   * @param operationId Operation id (optional)
   * @param environmentId Environment id (optional)
   * @param beginDate Begin date (optional)
   * @param endDate End date (optional)
   * @param resolution Metric resolution (optional)
   * @return List&lt;OperationMetric&gt;
   * @throws ApiException if fails to make API call
   */
  public List<OperationMetric> getCache1(String sensediaAuth, Long apiId, Long revisionId, Long operationId, Long environmentId, String beginDate, String endDate, String resolution) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'sensediaAuth' is set
    if (sensediaAuth == null) {
      throw new ApiException(400, "Missing the required parameter 'sensediaAuth' when calling getCache1");
    }
    
    // create path and map variables
    String localVarPath = "/metrics/cache";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "apiId", apiId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "revisionId", revisionId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "operationId", operationId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "environmentId", environmentId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "beginDate", beginDate));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "endDate", endDate));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "resolution", resolution));

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

    GenericType<List<OperationMetric>> localVarReturnType = new GenericType<List<OperationMetric>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Find cache latency
   * 
   * @param sensediaAuth Sensedia-Auth (required)
   * @param apiId API id (optional)
   * @param revisionId Revision id (optional)
   * @param operationId Operation id (optional)
   * @param environmentId Environment id (optional)
   * @param beginDate Begin date (optional)
   * @param endDate End date (optional)
   * @param resolution Metric resolution (optional)
   * @return List&lt;OperationMetric&gt;
   * @throws ApiException if fails to make API call
   */
  public List<OperationMetric> getCacheLatency1(String sensediaAuth, Long apiId, Long revisionId, Long operationId, Long environmentId, String beginDate, String endDate, String resolution) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'sensediaAuth' is set
    if (sensediaAuth == null) {
      throw new ApiException(400, "Missing the required parameter 'sensediaAuth' when calling getCacheLatency1");
    }
    
    // create path and map variables
    String localVarPath = "/metrics/cache/latency";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "apiId", apiId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "revisionId", revisionId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "operationId", operationId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "environmentId", environmentId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "beginDate", beginDate));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "endDate", endDate));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "resolution", resolution));

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

    GenericType<List<OperationMetric>> localVarReturnType = new GenericType<List<OperationMetric>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Retrive cache size
   * 
   * @param sensediaAuth Sensedia-Auth (required)
   * @param apiId API id (optional)
   * @param revisionId Revision id (optional)
   * @param operationId Operation id (optional)
   * @param environmentId Environment id (optional)
   * @return CacheMetric
   * @throws ApiException if fails to make API call
   */
  public CacheMetric getCacheSize1(String sensediaAuth, Long apiId, Long revisionId, Long operationId, Long environmentId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'sensediaAuth' is set
    if (sensediaAuth == null) {
      throw new ApiException(400, "Missing the required parameter 'sensediaAuth' when calling getCacheSize1");
    }
    
    // create path and map variables
    String localVarPath = "/metrics/cache/size";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "apiId", apiId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "revisionId", revisionId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "operationId", operationId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "environmentId", environmentId));

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

    GenericType<CacheMetric> localVarReturnType = new GenericType<CacheMetric>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Find calls by month
   * 
   * @param sensediaAuth Sensedia-Auth (required)
   * @param beginDate Begin date (optional)
   * @param endDate End date (optional)
   * @param resolution Metric resolution (optional)
   * @param environmentId Environment id (optional)
   * @param apiId API id (optional)
   * @param revisionId Revision id (optional)
   * @return List&lt;CallsMetric&gt;
   * @throws ApiException if fails to make API call
   */
  public List<CallsMetric> getCallsByMonth1(String sensediaAuth, String beginDate, String endDate, String resolution, Long environmentId, Long apiId, Long revisionId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'sensediaAuth' is set
    if (sensediaAuth == null) {
      throw new ApiException(400, "Missing the required parameter 'sensediaAuth' when calling getCallsByMonth1");
    }
    
    // create path and map variables
    String localVarPath = "/metrics/calls";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "beginDate", beginDate));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "endDate", endDate));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "resolution", resolution));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "environmentId", environmentId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "apiId", apiId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "revisionId", revisionId));

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

    GenericType<List<CallsMetric>> localVarReturnType = new GenericType<List<CallsMetric>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Find Health
   * 
   * @param sensediaAuth Sensedia-Auth (required)
   * @param healthPortal Health Portal (optional)
   * @return List&lt;OperationHealth&gt;
   * @throws ApiException if fails to make API call
   */
  public List<OperationHealth> getHealth1(String sensediaAuth, Boolean healthPortal) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'sensediaAuth' is set
    if (sensediaAuth == null) {
      throw new ApiException(400, "Missing the required parameter 'sensediaAuth' when calling getHealth1");
    }
    
    // create path and map variables
    String localVarPath = "/metrics/health";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "healthPortal", healthPortal));

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

    GenericType<List<OperationHealth>> localVarReturnType = new GenericType<List<OperationHealth>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Find latency by month
   * 
   * @param sensediaAuth Sensedia-Auth (required)
   * @param beginDate Begin date (optional)
   * @param endDate End date (optional)
   * @param resolution Metric resolution (optional)
   * @return List&lt;LatencyMetric&gt;
   * @throws ApiException if fails to make API call
   */
  public List<LatencyMetric> getLatencyByMonth1(String sensediaAuth, String beginDate, String endDate, String resolution) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'sensediaAuth' is set
    if (sensediaAuth == null) {
      throw new ApiException(400, "Missing the required parameter 'sensediaAuth' when calling getLatencyByMonth1");
    }
    
    // create path and map variables
    String localVarPath = "/metrics/latency";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "beginDate", beginDate));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "endDate", endDate));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "resolution", resolution));

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

    GenericType<List<LatencyMetric>> localVarReturnType = new GenericType<List<LatencyMetric>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Retrive Status Error
   * 
   * @param sensediaAuth Sensedia-Auth (required)
   * @return Integer
   * @throws ApiException if fails to make API call
   */
  public Integer getStatusError1(String sensediaAuth) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'sensediaAuth' is set
    if (sensediaAuth == null) {
      throw new ApiException(400, "Missing the required parameter 'sensediaAuth' when calling getStatusError1");
    }
    
    // create path and map variables
    String localVarPath = "/metrics/statusError";

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

    GenericType<Integer> localVarReturnType = new GenericType<Integer>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Find top access token
   * 
   * @param sensediaAuth Sensedia-Auth (required)
   * @param howMany How many (required)
   * @param beginDate Begin date (optional)
   * @param endDate End date (optional)
   * @param status Metric status (optional)
   * @param resolution Metric resolution (optional)
   * @return List&lt;TopAccessToken&gt;
   * @throws ApiException if fails to make API call
   */
  public List<TopAccessToken> getTopAccessTokens1(String sensediaAuth, Integer howMany, String beginDate, String endDate, String status, String resolution) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'sensediaAuth' is set
    if (sensediaAuth == null) {
      throw new ApiException(400, "Missing the required parameter 'sensediaAuth' when calling getTopAccessTokens1");
    }
    
    // verify the required parameter 'howMany' is set
    if (howMany == null) {
      throw new ApiException(400, "Missing the required parameter 'howMany' when calling getTopAccessTokens1");
    }
    
    // create path and map variables
    String localVarPath = "/metrics/top-access-tokens/{howMany}"
      .replaceAll("\\{" + "howMany" + "\\}", apiClient.escapeString(howMany.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "beginDate", beginDate));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "endDate", endDate));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "status", status));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "resolution", resolution));

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

    GenericType<List<TopAccessToken>> localVarReturnType = new GenericType<List<TopAccessToken>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Find top apps
   * 
   * @param sensediaAuth Sensedia-Auth (required)
   * @param howMany How many (required)
   * @param beginDate Begin date (optional)
   * @param endDate End date (optional)
   * @param status Metric status (optional)
   * @param resolution Metric resolution (optional)
   * @return List&lt;TopApp&gt;
   * @throws ApiException if fails to make API call
   */
  public List<TopApp> getTopApps1(String sensediaAuth, Integer howMany, String beginDate, String endDate, String status, String resolution) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'sensediaAuth' is set
    if (sensediaAuth == null) {
      throw new ApiException(400, "Missing the required parameter 'sensediaAuth' when calling getTopApps1");
    }
    
    // verify the required parameter 'howMany' is set
    if (howMany == null) {
      throw new ApiException(400, "Missing the required parameter 'howMany' when calling getTopApps1");
    }
    
    // create path and map variables
    String localVarPath = "/metrics/top-apps/{howMany}"
      .replaceAll("\\{" + "howMany" + "\\}", apiClient.escapeString(howMany.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "beginDate", beginDate));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "endDate", endDate));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "status", status));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "resolution", resolution));

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

    GenericType<List<TopApp>> localVarReturnType = new GenericType<List<TopApp>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
}
