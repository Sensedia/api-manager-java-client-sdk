# CallsApi

All URIs are relative to *https://localhost/api-manager/api/v3*

Method | HTTP request | Description
------------- | ------------- | -------------
[**retriveCallById1**](CallsApi.md#retriveCallById1) | **GET** /calls/{id} | Retrive call by id
[**retriveCallsWithFiltrs1**](CallsApi.md#retriveCallsWithFiltrs1) | **GET** /calls | Retrive calls with filters
[**retriveTotalCallsByDate1**](CallsApi.md#retriveTotalCallsByDate1) | **GET** /calls/count/{date} | Retrive calls total by date


<a name="retriveCallById1"></a>
# **retriveCallById1**
> Call retriveCallById1(sensediaAuth, id)

Retrive call by id

### Example
```java
// Import classes:
//import com.sensedia.api.v3.client.ApiException;
//import com.sensedia.api.v3.CallsApi;


CallsApi apiInstance = new CallsApi();
String sensediaAuth = "sensediaAuth_example"; // String | Sensedia-Auth
String id = "id_example"; // String | Call id
try {
    Call result = apiInstance.retriveCallById1(sensediaAuth, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CallsApi#retriveCallById1");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sensediaAuth** | **String**| Sensedia-Auth |
 **id** | **String**| Call id |

### Return type

[**Call**](Call.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="retriveCallsWithFiltrs1"></a>
# **retriveCallsWithFiltrs1**
> CallResponse retriveCallsWithFiltrs1(sensediaAuth, actualPage, baseUris, appTokenCode, pageSize, appTokenName, authTokenOwner, apiId, operationId, resourceId, environmentId, revisionId, uri, customSearch, method, httpStatusFrom, httpStatusTo, beginDate, endDate, appDeveloper, forceDownload)

Retrive calls with filters

### Example
```java
// Import classes:
//import com.sensedia.api.v3.client.ApiException;
//import com.sensedia.api.v3.CallsApi;


CallsApi apiInstance = new CallsApi();
String sensediaAuth = "sensediaAuth_example"; // String | Sensedia-Auth
Integer actualPage = 56; // Integer | Number of the page in pagination. The starting page number is zero.
String baseUris = "baseUris_example"; // String | Base uris
String appTokenCode = "appTokenCode_example"; // String | Code app token
Integer pageSize = 56; // Integer | Define the size of the returned list of developers.
String appTokenName = "appTokenName_example"; // String | Name app token
String authTokenOwner = "authTokenOwner_example"; // String | Owner auth token
Long apiId = 789L; // Long | API id
Long operationId = 789L; // Long | Operation id
Long resourceId = 789L; // Long | Resource id
Long environmentId = 789L; // Long | Environment id
Long revisionId = 789L; // Long | Revision id
String uri = "uri_example"; // String | URI
String customSearch = "customSearch_example"; // String | Custom search
String method = "method_example"; // String | HTTP Method (GET, POST, PUT, DELETE, PATCH, OPTIONS, HEAD)
Integer httpStatusFrom = 56; // Integer | HTTP status from
Integer httpStatusTo = 56; // Integer | HTTP status to
String beginDate = "beginDate_example"; // String | Begin date
String endDate = "endDate_example"; // String | End date
String appDeveloper = "appDeveloper_example"; // String | APP Developer
String forceDownload = "forceDownload_example"; // String | Force archive download
try {
    CallResponse result = apiInstance.retriveCallsWithFiltrs1(sensediaAuth, actualPage, baseUris, appTokenCode, pageSize, appTokenName, authTokenOwner, apiId, operationId, resourceId, environmentId, revisionId, uri, customSearch, method, httpStatusFrom, httpStatusTo, beginDate, endDate, appDeveloper, forceDownload);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CallsApi#retriveCallsWithFiltrs1");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sensediaAuth** | **String**| Sensedia-Auth |
 **actualPage** | **Integer**| Number of the page in pagination. The starting page number is zero. | [optional]
 **baseUris** | **String**| Base uris | [optional]
 **appTokenCode** | **String**| Code app token | [optional]
 **pageSize** | **Integer**| Define the size of the returned list of developers. | [optional]
 **appTokenName** | **String**| Name app token | [optional]
 **authTokenOwner** | **String**| Owner auth token | [optional]
 **apiId** | **Long**| API id | [optional]
 **operationId** | **Long**| Operation id | [optional]
 **resourceId** | **Long**| Resource id | [optional]
 **environmentId** | **Long**| Environment id | [optional]
 **revisionId** | **Long**| Revision id | [optional]
 **uri** | **String**| URI | [optional]
 **customSearch** | **String**| Custom search | [optional]
 **method** | **String**| HTTP Method (GET, POST, PUT, DELETE, PATCH, OPTIONS, HEAD) | [optional]
 **httpStatusFrom** | **Integer**| HTTP status from | [optional]
 **httpStatusTo** | **Integer**| HTTP status to | [optional]
 **beginDate** | **String**| Begin date | [optional]
 **endDate** | **String**| End date | [optional]
 **appDeveloper** | **String**| APP Developer | [optional]
 **forceDownload** | **String**| Force archive download | [optional]

### Return type

[**CallResponse**](CallResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="retriveTotalCallsByDate1"></a>
# **retriveTotalCallsByDate1**
> Long retriveTotalCallsByDate1(sensediaAuth, date, apiId)

Retrive calls total by date

### Example
```java
// Import classes:
//import com.sensedia.api.v3.client.ApiException;
//import com.sensedia.api.v3.CallsApi;


CallsApi apiInstance = new CallsApi();
String sensediaAuth = "sensediaAuth_example"; // String | Sensedia-Auth
String date = "date_example"; // String | Date searched
Long apiId = 789L; // Long | API id
try {
    Long result = apiInstance.retriveTotalCallsByDate1(sensediaAuth, date, apiId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CallsApi#retriveTotalCallsByDate1");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sensediaAuth** | **String**| Sensedia-Auth |
 **date** | **String**| Date searched |
 **apiId** | **Long**| API id | [optional]

### Return type

**Long**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

