# APIsApi

All URIs are relative to *https://localhost/api-manager/api/v3*

Method | HTTP request | Description
------------- | ------------- | -------------
[**cloneApi1**](APIsApi.md#cloneApi1) | **POST** /apis/{id}/clone | Clone a API
[**createApi1**](APIsApi.md#createApi1) | **POST** /apis | Create a new API
[**createNewVersion1**](APIsApi.md#createNewVersion1) | **POST** /apis/{id}/versions | Create new version
[**getApiById1**](APIsApi.md#getApiById1) | **GET** /apis/{apiId} | Find API by id
[**getApis1**](APIsApi.md#getApis1) | **GET** /apis | Return all APIs
[**getChangeLogByApiId1**](APIsApi.md#getChangeLogByApiId1) | **GET** /apis/{id}/changelog | Retrive changelog per API id
[**getLastRevisionByApi1**](APIsApi.md#getLastRevisionByApi1) | **GET** /apis/{id}/revisions | Find last revision by API id
[**getVersionsByApi1**](APIsApi.md#getVersionsByApi1) | **GET** /apis/{id}/versions | Find version by API id
[**removeApi1**](APIsApi.md#removeApi1) | **DELETE** /apis/{id} | Delete a API
[**removeLinkEnvironmentWithApi1**](APIsApi.md#removeLinkEnvironmentWithApi1) | **DELETE** /apis/{id}/environments/{environmentId} | Delete environment link with API
[**updateApi1**](APIsApi.md#updateApi1) | **PUT** /apis/{id} | Update a API
[**validatePartialApi1**](APIsApi.md#validatePartialApi1) | **POST** /apis/validate | Validate partial a API


<a name="cloneApi1"></a>
# **cloneApi1**
> ModelAPIResponse cloneApi1(sensediaAuth, id, apiBean)

Clone a API

### Example
```java
// Import classes:
//import com.sensedia.api.v3.client.ApiException;
//import com.sensedia.api.v3.APIsApi;


APIsApi apiInstance = new APIsApi();
String sensediaAuth = "sensediaAuth_example"; // String | Sensedia-Auth
String id = "id_example"; // String | API id
API apiBean = new API(); // API | API json to update a api
try {
    ModelAPIResponse result = apiInstance.cloneApi1(sensediaAuth, id, apiBean);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling APIsApi#cloneApi1");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sensediaAuth** | **String**| Sensedia-Auth |
 **id** | **String**| API id |
 **apiBean** | [**API**](API.md)| API json to update a api | [optional]

### Return type

[**ModelAPIResponse**](ModelAPIResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="createApi1"></a>
# **createApi1**
> ModelAPIResponse createApi1(sensediaAuth, bean)

Create a new API

### Example
```java
// Import classes:
//import com.sensedia.api.v3.client.ApiException;
//import com.sensedia.api.v3.APIsApi;


APIsApi apiInstance = new APIsApi();
String sensediaAuth = "sensediaAuth_example"; // String | Sensedia-Auth
APICreateBean bean = new APICreateBean(); // APICreateBean | API json to create a API
try {
    ModelAPIResponse result = apiInstance.createApi1(sensediaAuth, bean);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling APIsApi#createApi1");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sensediaAuth** | **String**| Sensedia-Auth |
 **bean** | [**APICreateBean**](APICreateBean.md)| API json to create a API | [optional]

### Return type

[**ModelAPIResponse**](ModelAPIResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="createNewVersion1"></a>
# **createNewVersion1**
> ModelAPIResponse createNewVersion1(sensediaAuth, id, apiBean)

Create new version

### Example
```java
// Import classes:
//import com.sensedia.api.v3.client.ApiException;
//import com.sensedia.api.v3.APIsApi;


APIsApi apiInstance = new APIsApi();
String sensediaAuth = "sensediaAuth_example"; // String | Sensedia-Auth
String id = "id_example"; // String | API id
API apiBean = new API(); // API | API json to update a api
try {
    ModelAPIResponse result = apiInstance.createNewVersion1(sensediaAuth, id, apiBean);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling APIsApi#createNewVersion1");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sensediaAuth** | **String**| Sensedia-Auth |
 **id** | **String**| API id |
 **apiBean** | [**API**](API.md)| API json to update a api | [optional]

### Return type

[**ModelAPIResponse**](ModelAPIResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getApiById1"></a>
# **getApiById1**
> API getApiById1(sensediaAuth, apiId, filter)

Find API by id

### Example
```java
// Import classes:
//import com.sensedia.api.v3.client.ApiException;
//import com.sensedia.api.v3.APIsApi;


APIsApi apiInstance = new APIsApi();
String sensediaAuth = "sensediaAuth_example"; // String | Sensedia-Auth
String apiId = "apiId_example"; // String | API id
String filter = "filter_example"; // String | Filter type searched
try {
    API result = apiInstance.getApiById1(sensediaAuth, apiId, filter);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling APIsApi#getApiById1");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sensediaAuth** | **String**| Sensedia-Auth |
 **apiId** | **String**| API id |
 **filter** | **String**| Filter type searched | [optional] [enum: BASIC, BASIC_WITHOUT_INTERCEPTORS, BASIC_TO_DASHBOARD, BASIC_WITH_LAST_REVISION]

### Return type

[**API**](API.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getApis1"></a>
# **getApis1**
> List&lt;API&gt; getApis1(sensediaAuth, privateAPI, filter)

Return all APIs

### Example
```java
// Import classes:
//import com.sensedia.api.v3.client.ApiException;
//import com.sensedia.api.v3.APIsApi;


APIsApi apiInstance = new APIsApi();
String sensediaAuth = "sensediaAuth_example"; // String | Sensedia-Auth
Boolean privateAPI = true; // Boolean | Private API
String filter = "filter_example"; // String | Filter type searched
try {
    List<API> result = apiInstance.getApis1(sensediaAuth, privateAPI, filter);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling APIsApi#getApis1");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sensediaAuth** | **String**| Sensedia-Auth |
 **privateAPI** | **Boolean**| Private API | [optional]
 **filter** | **String**| Filter type searched | [optional] [enum: BASIC, BASIC_WITHOUT_INTERCEPTORS, BASIC_TO_DASHBOARD, BASIC_WITH_LAST_REVISION]

### Return type

[**List&lt;API&gt;**](API.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getChangeLogByApiId1"></a>
# **getChangeLogByApiId1**
> List&lt;ChangeLog&gt; getChangeLogByApiId1(sensediaAuth, id)

Retrive changelog per API id

### Example
```java
// Import classes:
//import com.sensedia.api.v3.client.ApiException;
//import com.sensedia.api.v3.APIsApi;


APIsApi apiInstance = new APIsApi();
String sensediaAuth = "sensediaAuth_example"; // String | Sensedia-Auth
Long id = 789L; // Long | API id
try {
    List<ChangeLog> result = apiInstance.getChangeLogByApiId1(sensediaAuth, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling APIsApi#getChangeLogByApiId1");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sensediaAuth** | **String**| Sensedia-Auth |
 **id** | **Long**| API id |

### Return type

[**List&lt;ChangeLog&gt;**](ChangeLog.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getLastRevisionByApi1"></a>
# **getLastRevisionByApi1**
> RevisionBean getLastRevisionByApi1(sensediaAuth, id)

Find last revision by API id

### Example
```java
// Import classes:
//import com.sensedia.api.v3.client.ApiException;
//import com.sensedia.api.v3.APIsApi;


APIsApi apiInstance = new APIsApi();
String sensediaAuth = "sensediaAuth_example"; // String | Sensedia-Auth
Long id = 789L; // Long | id
try {
    RevisionBean result = apiInstance.getLastRevisionByApi1(sensediaAuth, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling APIsApi#getLastRevisionByApi1");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sensediaAuth** | **String**| Sensedia-Auth |
 **id** | **Long**| id |

### Return type

[**RevisionBean**](RevisionBean.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getVersionsByApi1"></a>
# **getVersionsByApi1**
> List&lt;API&gt; getVersionsByApi1(sensediaAuth, id)

Find version by API id

### Example
```java
// Import classes:
//import com.sensedia.api.v3.client.ApiException;
//import com.sensedia.api.v3.APIsApi;


APIsApi apiInstance = new APIsApi();
String sensediaAuth = "sensediaAuth_example"; // String | Sensedia-Auth
String id = "id_example"; // String | API id
try {
    List<API> result = apiInstance.getVersionsByApi1(sensediaAuth, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling APIsApi#getVersionsByApi1");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sensediaAuth** | **String**| Sensedia-Auth |
 **id** | **String**| API id |

### Return type

[**List&lt;API&gt;**](API.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="removeApi1"></a>
# **removeApi1**
> ResponseEntity removeApi1(sensediaAuth, id)

Delete a API

### Example
```java
// Import classes:
//import com.sensedia.api.v3.client.ApiException;
//import com.sensedia.api.v3.APIsApi;


APIsApi apiInstance = new APIsApi();
String sensediaAuth = "sensediaAuth_example"; // String | Sensedia-Auth
String id = "id_example"; // String | API id
try {
    ResponseEntity result = apiInstance.removeApi1(sensediaAuth, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling APIsApi#removeApi1");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sensediaAuth** | **String**| Sensedia-Auth |
 **id** | **String**| API id |

### Return type

[**ResponseEntity**](ResponseEntity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="removeLinkEnvironmentWithApi1"></a>
# **removeLinkEnvironmentWithApi1**
> ResponseEntity removeLinkEnvironmentWithApi1(sensediaAuth, id, environmentId)

Delete environment link with API

### Example
```java
// Import classes:
//import com.sensedia.api.v3.client.ApiException;
//import com.sensedia.api.v3.APIsApi;


APIsApi apiInstance = new APIsApi();
String sensediaAuth = "sensediaAuth_example"; // String | Sensedia-Auth
String id = "id_example"; // String | id
String environmentId = "environmentId_example"; // String | environmentId
try {
    ResponseEntity result = apiInstance.removeLinkEnvironmentWithApi1(sensediaAuth, id, environmentId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling APIsApi#removeLinkEnvironmentWithApi1");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sensediaAuth** | **String**| Sensedia-Auth |
 **id** | **String**| id |
 **environmentId** | **String**| environmentId |

### Return type

[**ResponseEntity**](ResponseEntity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="updateApi1"></a>
# **updateApi1**
> ModelAPIResponse updateApi1(sensediaAuth, id, apiBean)

Update a API

### Example
```java
// Import classes:
//import com.sensedia.api.v3.client.ApiException;
//import com.sensedia.api.v3.APIsApi;


APIsApi apiInstance = new APIsApi();
String sensediaAuth = "sensediaAuth_example"; // String | Sensedia-Auth
String id = "id_example"; // String | API id
API apiBean = new API(); // API | API json to update a api
try {
    ModelAPIResponse result = apiInstance.updateApi1(sensediaAuth, id, apiBean);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling APIsApi#updateApi1");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sensediaAuth** | **String**| Sensedia-Auth |
 **id** | **String**| API id |
 **apiBean** | [**API**](API.md)| API json to update a api | [optional]

### Return type

[**ModelAPIResponse**](ModelAPIResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="validatePartialApi1"></a>
# **validatePartialApi1**
> ResponseEntity validatePartialApi1(sensediaAuth, bean)

Validate partial a API

### Example
```java
// Import classes:
//import com.sensedia.api.v3.client.ApiException;
//import com.sensedia.api.v3.APIsApi;


APIsApi apiInstance = new APIsApi();
String sensediaAuth = "sensediaAuth_example"; // String | Sensedia-Auth
API bean = new API(); // API | API json to validate a API
try {
    ResponseEntity result = apiInstance.validatePartialApi1(sensediaAuth, bean);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling APIsApi#validatePartialApi1");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sensediaAuth** | **String**| Sensedia-Auth |
 **bean** | [**API**](API.md)| API json to validate a API | [optional]

### Return type

[**ResponseEntity**](ResponseEntity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

