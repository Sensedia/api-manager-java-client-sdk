# MetricsApi

All URIs are relative to *https://localhost/api-manager/api/v3*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getAccessTokensByMonth1**](MetricsApi.md#getAccessTokensByMonth1) | **GET** /metrics/access-tokens | Find access token consolited by month
[**getAppsByMonth1**](MetricsApi.md#getAppsByMonth1) | **GET** /metrics/apps | Find apps consolited by month
[**getCache1**](MetricsApi.md#getCache1) | **GET** /metrics/cache | Find cache
[**getCacheLatency1**](MetricsApi.md#getCacheLatency1) | **GET** /metrics/cache/latency | Find cache latency
[**getCacheSize1**](MetricsApi.md#getCacheSize1) | **GET** /metrics/cache/size | Retrive cache size
[**getCallsByMonth1**](MetricsApi.md#getCallsByMonth1) | **GET** /metrics/calls | Find calls by month
[**getHealth1**](MetricsApi.md#getHealth1) | **GET** /metrics/health | Find Health
[**getLatencyByMonth1**](MetricsApi.md#getLatencyByMonth1) | **GET** /metrics/latency | Find latency by month
[**getStatusError1**](MetricsApi.md#getStatusError1) | **GET** /metrics/statusError | Retrive Status Error
[**getTopAccessTokens1**](MetricsApi.md#getTopAccessTokens1) | **GET** /metrics/top-access-tokens/{howMany} | Find top access token
[**getTopApps1**](MetricsApi.md#getTopApps1) | **GET** /metrics/top-apps/{howMany} | Find top apps


<a name="getAccessTokensByMonth1"></a>
# **getAccessTokensByMonth1**
> List&lt;TokensMetric&gt; getAccessTokensByMonth1(sensediaAuth, beginDate, endDate, resolution)

Find access token consolited by month

### Example
```java
// Import classes:
//import com.sensedia.api.v3.client.ApiException;
//import com.sensedia.api.v3.MetricsApi;


MetricsApi apiInstance = new MetricsApi();
String sensediaAuth = "sensediaAuth_example"; // String | Sensedia-Auth
String beginDate = "beginDate_example"; // String | Begin date
String endDate = "endDate_example"; // String | End date
String resolution = "resolution_example"; // String | Metric resolution
try {
    List<TokensMetric> result = apiInstance.getAccessTokensByMonth1(sensediaAuth, beginDate, endDate, resolution);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MetricsApi#getAccessTokensByMonth1");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sensediaAuth** | **String**| Sensedia-Auth |
 **beginDate** | **String**| Begin date | [optional]
 **endDate** | **String**| End date | [optional]
 **resolution** | **String**| Metric resolution | [optional] [enum: months, days, hours, minutes]

### Return type

[**List&lt;TokensMetric&gt;**](TokensMetric.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="getAppsByMonth1"></a>
# **getAppsByMonth1**
> List&lt;TokensMetric&gt; getAppsByMonth1(sensediaAuth, beginDate, endDate, resolution)

Find apps consolited by month

### Example
```java
// Import classes:
//import com.sensedia.api.v3.client.ApiException;
//import com.sensedia.api.v3.MetricsApi;


MetricsApi apiInstance = new MetricsApi();
String sensediaAuth = "sensediaAuth_example"; // String | Sensedia-Auth
String beginDate = "beginDate_example"; // String | Begin date
String endDate = "endDate_example"; // String | End date
String resolution = "resolution_example"; // String | Metric resolution
try {
    List<TokensMetric> result = apiInstance.getAppsByMonth1(sensediaAuth, beginDate, endDate, resolution);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MetricsApi#getAppsByMonth1");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sensediaAuth** | **String**| Sensedia-Auth |
 **beginDate** | **String**| Begin date | [optional]
 **endDate** | **String**| End date | [optional]
 **resolution** | **String**| Metric resolution | [optional] [enum: months, days, hours, minutes]

### Return type

[**List&lt;TokensMetric&gt;**](TokensMetric.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="getCache1"></a>
# **getCache1**
> List&lt;OperationMetric&gt; getCache1(sensediaAuth, apiId, revisionId, operationId, environmentId, beginDate, endDate, resolution)

Find cache

### Example
```java
// Import classes:
//import com.sensedia.api.v3.client.ApiException;
//import com.sensedia.api.v3.MetricsApi;


MetricsApi apiInstance = new MetricsApi();
String sensediaAuth = "sensediaAuth_example"; // String | Sensedia-Auth
Long apiId = 789L; // Long | API id
Long revisionId = 789L; // Long | Revision id
Long operationId = 789L; // Long | Operation id
Long environmentId = 789L; // Long | Environment id
String beginDate = "beginDate_example"; // String | Begin date
String endDate = "endDate_example"; // String | End date
String resolution = "resolution_example"; // String | Metric resolution
try {
    List<OperationMetric> result = apiInstance.getCache1(sensediaAuth, apiId, revisionId, operationId, environmentId, beginDate, endDate, resolution);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MetricsApi#getCache1");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sensediaAuth** | **String**| Sensedia-Auth |
 **apiId** | **Long**| API id | [optional]
 **revisionId** | **Long**| Revision id | [optional]
 **operationId** | **Long**| Operation id | [optional]
 **environmentId** | **Long**| Environment id | [optional]
 **beginDate** | **String**| Begin date | [optional]
 **endDate** | **String**| End date | [optional]
 **resolution** | **String**| Metric resolution | [optional] [enum: months, days, hours, minutes]

### Return type

[**List&lt;OperationMetric&gt;**](OperationMetric.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="getCacheLatency1"></a>
# **getCacheLatency1**
> List&lt;OperationMetric&gt; getCacheLatency1(sensediaAuth, apiId, revisionId, operationId, environmentId, beginDate, endDate, resolution)

Find cache latency

### Example
```java
// Import classes:
//import com.sensedia.api.v3.client.ApiException;
//import com.sensedia.api.v3.MetricsApi;


MetricsApi apiInstance = new MetricsApi();
String sensediaAuth = "sensediaAuth_example"; // String | Sensedia-Auth
Long apiId = 789L; // Long | API id
Long revisionId = 789L; // Long | Revision id
Long operationId = 789L; // Long | Operation id
Long environmentId = 789L; // Long | Environment id
String beginDate = "beginDate_example"; // String | Begin date
String endDate = "endDate_example"; // String | End date
String resolution = "resolution_example"; // String | Metric resolution
try {
    List<OperationMetric> result = apiInstance.getCacheLatency1(sensediaAuth, apiId, revisionId, operationId, environmentId, beginDate, endDate, resolution);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MetricsApi#getCacheLatency1");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sensediaAuth** | **String**| Sensedia-Auth |
 **apiId** | **Long**| API id | [optional]
 **revisionId** | **Long**| Revision id | [optional]
 **operationId** | **Long**| Operation id | [optional]
 **environmentId** | **Long**| Environment id | [optional]
 **beginDate** | **String**| Begin date | [optional]
 **endDate** | **String**| End date | [optional]
 **resolution** | **String**| Metric resolution | [optional] [enum: months, days, hours, minutes]

### Return type

[**List&lt;OperationMetric&gt;**](OperationMetric.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="getCacheSize1"></a>
# **getCacheSize1**
> CacheMetric getCacheSize1(sensediaAuth, apiId, revisionId, operationId, environmentId)

Retrive cache size

### Example
```java
// Import classes:
//import com.sensedia.api.v3.client.ApiException;
//import com.sensedia.api.v3.MetricsApi;


MetricsApi apiInstance = new MetricsApi();
String sensediaAuth = "sensediaAuth_example"; // String | Sensedia-Auth
Long apiId = 789L; // Long | API id
Long revisionId = 789L; // Long | Revision id
Long operationId = 789L; // Long | Operation id
Long environmentId = 789L; // Long | Environment id
try {
    CacheMetric result = apiInstance.getCacheSize1(sensediaAuth, apiId, revisionId, operationId, environmentId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MetricsApi#getCacheSize1");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sensediaAuth** | **String**| Sensedia-Auth |
 **apiId** | **Long**| API id | [optional]
 **revisionId** | **Long**| Revision id | [optional]
 **operationId** | **Long**| Operation id | [optional]
 **environmentId** | **Long**| Environment id | [optional]

### Return type

[**CacheMetric**](CacheMetric.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="getCallsByMonth1"></a>
# **getCallsByMonth1**
> List&lt;CallsMetric&gt; getCallsByMonth1(sensediaAuth, beginDate, endDate, resolution, environmentId, apiId, revisionId)

Find calls by month

### Example
```java
// Import classes:
//import com.sensedia.api.v3.client.ApiException;
//import com.sensedia.api.v3.MetricsApi;


MetricsApi apiInstance = new MetricsApi();
String sensediaAuth = "sensediaAuth_example"; // String | Sensedia-Auth
String beginDate = "beginDate_example"; // String | Begin date
String endDate = "endDate_example"; // String | End date
String resolution = "resolution_example"; // String | Metric resolution
Long environmentId = 789L; // Long | Environment id
Long apiId = 789L; // Long | API id
Long revisionId = 789L; // Long | Revision id
try {
    List<CallsMetric> result = apiInstance.getCallsByMonth1(sensediaAuth, beginDate, endDate, resolution, environmentId, apiId, revisionId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MetricsApi#getCallsByMonth1");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sensediaAuth** | **String**| Sensedia-Auth |
 **beginDate** | **String**| Begin date | [optional]
 **endDate** | **String**| End date | [optional]
 **resolution** | **String**| Metric resolution | [optional] [enum: months, days, hours, minutes]
 **environmentId** | **Long**| Environment id | [optional]
 **apiId** | **Long**| API id | [optional]
 **revisionId** | **Long**| Revision id | [optional]

### Return type

[**List&lt;CallsMetric&gt;**](CallsMetric.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="getHealth1"></a>
# **getHealth1**
> List&lt;OperationHealth&gt; getHealth1(sensediaAuth, healthPortal)

Find Health

### Example
```java
// Import classes:
//import com.sensedia.api.v3.client.ApiException;
//import com.sensedia.api.v3.MetricsApi;


MetricsApi apiInstance = new MetricsApi();
String sensediaAuth = "sensediaAuth_example"; // String | Sensedia-Auth
Boolean healthPortal = true; // Boolean | Health Portal
try {
    List<OperationHealth> result = apiInstance.getHealth1(sensediaAuth, healthPortal);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MetricsApi#getHealth1");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sensediaAuth** | **String**| Sensedia-Auth |
 **healthPortal** | **Boolean**| Health Portal | [optional]

### Return type

[**List&lt;OperationHealth&gt;**](OperationHealth.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="getLatencyByMonth1"></a>
# **getLatencyByMonth1**
> List&lt;LatencyMetric&gt; getLatencyByMonth1(sensediaAuth, beginDate, endDate, resolution)

Find latency by month

### Example
```java
// Import classes:
//import com.sensedia.api.v3.client.ApiException;
//import com.sensedia.api.v3.MetricsApi;


MetricsApi apiInstance = new MetricsApi();
String sensediaAuth = "sensediaAuth_example"; // String | Sensedia-Auth
String beginDate = "beginDate_example"; // String | Begin date
String endDate = "endDate_example"; // String | End date
String resolution = "resolution_example"; // String | Metric resolution
try {
    List<LatencyMetric> result = apiInstance.getLatencyByMonth1(sensediaAuth, beginDate, endDate, resolution);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MetricsApi#getLatencyByMonth1");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sensediaAuth** | **String**| Sensedia-Auth |
 **beginDate** | **String**| Begin date | [optional]
 **endDate** | **String**| End date | [optional]
 **resolution** | **String**| Metric resolution | [optional] [enum: months, days, hours, minutes]

### Return type

[**List&lt;LatencyMetric&gt;**](LatencyMetric.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="getStatusError1"></a>
# **getStatusError1**
> Integer getStatusError1(sensediaAuth)

Retrive Status Error

### Example
```java
// Import classes:
//import com.sensedia.api.v3.client.ApiException;
//import com.sensedia.api.v3.MetricsApi;


MetricsApi apiInstance = new MetricsApi();
String sensediaAuth = "sensediaAuth_example"; // String | Sensedia-Auth
try {
    Integer result = apiInstance.getStatusError1(sensediaAuth);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MetricsApi#getStatusError1");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sensediaAuth** | **String**| Sensedia-Auth |

### Return type

**Integer**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="getTopAccessTokens1"></a>
# **getTopAccessTokens1**
> List&lt;TopAccessToken&gt; getTopAccessTokens1(sensediaAuth, howMany, beginDate, endDate, status, resolution)

Find top access token

### Example
```java
// Import classes:
//import com.sensedia.api.v3.client.ApiException;
//import com.sensedia.api.v3.MetricsApi;


MetricsApi apiInstance = new MetricsApi();
String sensediaAuth = "sensediaAuth_example"; // String | Sensedia-Auth
Integer howMany = 56; // Integer | How many
String beginDate = "beginDate_example"; // String | Begin date
String endDate = "endDate_example"; // String | End date
String status = "status_example"; // String | Metric status
String resolution = "resolution_example"; // String | Metric resolution
try {
    List<TopAccessToken> result = apiInstance.getTopAccessTokens1(sensediaAuth, howMany, beginDate, endDate, status, resolution);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MetricsApi#getTopAccessTokens1");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sensediaAuth** | **String**| Sensedia-Auth |
 **howMany** | **Integer**| How many |
 **beginDate** | **String**| Begin date | [optional]
 **endDate** | **String**| End date | [optional]
 **status** | **String**| Metric status | [optional] [enum: success, error, clientError, serverError, blocked]
 **resolution** | **String**| Metric resolution | [optional] [enum: months, days, hours, minutes]

### Return type

[**List&lt;TopAccessToken&gt;**](TopAccessToken.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="getTopApps1"></a>
# **getTopApps1**
> List&lt;TopApp&gt; getTopApps1(sensediaAuth, howMany, beginDate, endDate, status, resolution)

Find top apps

### Example
```java
// Import classes:
//import com.sensedia.api.v3.client.ApiException;
//import com.sensedia.api.v3.MetricsApi;


MetricsApi apiInstance = new MetricsApi();
String sensediaAuth = "sensediaAuth_example"; // String | Sensedia-Auth
Integer howMany = 56; // Integer | How many
String beginDate = "beginDate_example"; // String | Begin date
String endDate = "endDate_example"; // String | End date
String status = "status_example"; // String | Metric status
String resolution = "resolution_example"; // String | Metric resolution
try {
    List<TopApp> result = apiInstance.getTopApps1(sensediaAuth, howMany, beginDate, endDate, status, resolution);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MetricsApi#getTopApps1");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sensediaAuth** | **String**| Sensedia-Auth |
 **howMany** | **Integer**| How many |
 **beginDate** | **String**| Begin date | [optional]
 **endDate** | **String**| End date | [optional]
 **status** | **String**| Metric status | [optional] [enum: success, error, clientError, serverError, blocked]
 **resolution** | **String**| Metric resolution | [optional] [enum: months, days, hours, minutes]

### Return type

[**List&lt;TopApp&gt;**](TopApp.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

