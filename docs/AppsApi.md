# AppsApi

All URIs are relative to *https://localhost/api-manager/api/v3*

Method | HTTP request | Description
------------- | ------------- | -------------
[**appsCount1**](AppsApi.md#appsCount1) | **GET** /apps/count | Retrieve App total
[**createApp1**](AppsApi.md#createApp1) | **POST** /apps | Create a new app
[**getAppTokenByAppGallery1**](AppsApi.md#getAppTokenByAppGallery1) | **GET** /apps/gallery | Return all apps
[**getAppTokenByFilter1**](AppsApi.md#getAppTokenByFilter1) | **GET** /apps | Find app list by filters
[**getAppTokenById1**](AppsApi.md#getAppTokenById1) | **GET** /apps/{code} | Find app by code
[**getChangeLogByAppId1**](AppsApi.md#getChangeLogByAppId1) | **GET** /apps/{code}/changelog | Retrive changelog per app id
[**removeApp1**](AppsApi.md#removeApp1) | **DELETE** /apps/{code} | Delete a app
[**updateApp1**](AppsApi.md#updateApp1) | **PUT** /apps/{id} | Update a app
[**validatePartialApp1**](AppsApi.md#validatePartialApp1) | **POST** /apps/validate | Validate partial app


<a name="appsCount1"></a>
# **appsCount1**
> Long appsCount1(sensediaAuth)

Retrieve App total

### Example
```java
// Import classes:
//import com.sensedia.api.v3.client.ApiException;
//import com.sensedia.api.v3.AppsApi;


AppsApi apiInstance = new AppsApi();
String sensediaAuth = "sensediaAuth_example"; // String | Sensedia-Auth
try {
    Long result = apiInstance.appsCount1(sensediaAuth);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AppsApi#appsCount1");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sensediaAuth** | **String**| Sensedia-Auth | [optional]

### Return type

**Long**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createApp1"></a>
# **createApp1**
> APPResponse createApp1(sensediaAuth, appTokenBean)

Create a new app

### Example
```java
// Import classes:
//import com.sensedia.api.v3.client.ApiException;
//import com.sensedia.api.v3.AppsApi;


AppsApi apiInstance = new AppsApi();
String sensediaAuth = "sensediaAuth_example"; // String | Sensedia-Auth
APP appTokenBean = new APP(); // APP | App json to create a new app.
try {
    APPResponse result = apiInstance.createApp1(sensediaAuth, appTokenBean);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AppsApi#createApp1");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sensediaAuth** | **String**| Sensedia-Auth | [optional]
 **appTokenBean** | [**APP**](APP.md)| App json to create a new app. | [optional]

### Return type

[**APPResponse**](APPResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="getAppTokenByAppGallery1"></a>
# **getAppTokenByAppGallery1**
> List&lt;APP&gt; getAppTokenByAppGallery1(sensediaAuth)

Return all apps

### Example
```java
// Import classes:
//import com.sensedia.api.v3.client.ApiException;
//import com.sensedia.api.v3.AppsApi;


AppsApi apiInstance = new AppsApi();
String sensediaAuth = "sensediaAuth_example"; // String | Sensedia-Auth
try {
    List<APP> result = apiInstance.getAppTokenByAppGallery1(sensediaAuth);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AppsApi#getAppTokenByAppGallery1");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sensediaAuth** | **String**| Sensedia-Auth | [optional]

### Return type

[**List&lt;APP&gt;**](APP.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getAppTokenByFilter1"></a>
# **getAppTokenByFilter1**
> List&lt;APP&gt; getAppTokenByFilter1(sensediaAuth, clientId, name, keyword, status, developer, actualPage, pageSize, appIds, beginDate, endDate, extraFields)

Find app list by filters

### Example
```java
// Import classes:
//import com.sensedia.api.v3.client.ApiException;
//import com.sensedia.api.v3.AppsApi;


AppsApi apiInstance = new AppsApi();
String sensediaAuth = "sensediaAuth_example"; // String | Sensedia-Auth
String clientId = "clientId_example"; // String | clientId
String name = "name_example"; // String | name
String keyword = "keyword_example"; // String | keyword
String status = "status_example"; // String | status
String developer = "developer_example"; // String | developer
Integer actualPage = 56; // Integer | actualPage
Integer pageSize = 56; // Integer | pageSize
String appIds = "appIds_example"; // String | appIds
String beginDate = "beginDate_example"; // String | beginDate
String endDate = "endDate_example"; // String | endDate
String extraFields = "extraFields_example"; // String | extraFields
try {
    List<APP> result = apiInstance.getAppTokenByFilter1(sensediaAuth, clientId, name, keyword, status, developer, actualPage, pageSize, appIds, beginDate, endDate, extraFields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AppsApi#getAppTokenByFilter1");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sensediaAuth** | **String**| Sensedia-Auth | [optional]
 **clientId** | **String**| clientId | [optional]
 **name** | **String**| name | [optional]
 **keyword** | **String**| keyword | [optional]
 **status** | **String**| status | [optional]
 **developer** | **String**| developer | [optional]
 **actualPage** | **Integer**| actualPage | [optional]
 **pageSize** | **Integer**| pageSize | [optional]
 **appIds** | **String**| appIds | [optional]
 **beginDate** | **String**| beginDate | [optional]
 **endDate** | **String**| endDate | [optional]
 **extraFields** | **String**| extraFields | [optional]

### Return type

[**List&lt;APP&gt;**](APP.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getAppTokenById1"></a>
# **getAppTokenById1**
> APP getAppTokenById1(code, sensediaAuth, limitAccessTokens, codeAccessTokens, filterAccessTokens)

Find app by code

### Example
```java
// Import classes:
//import com.sensedia.api.v3.client.ApiException;
//import com.sensedia.api.v3.AppsApi;


AppsApi apiInstance = new AppsApi();
String code = "code_example"; // String | Client ID
String sensediaAuth = "sensediaAuth_example"; // String | Sensedia-Auth
Integer limitAccessTokens = 56; // Integer | Limit the access token return
String codeAccessTokens = "codeAccessTokens_example"; // String | Code access token
Boolean filterAccessTokens = true; // Boolean | Filter access tokens
try {
    APP result = apiInstance.getAppTokenById1(code, sensediaAuth, limitAccessTokens, codeAccessTokens, filterAccessTokens);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AppsApi#getAppTokenById1");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **code** | **String**| Client ID |
 **sensediaAuth** | **String**| Sensedia-Auth | [optional]
 **limitAccessTokens** | **Integer**| Limit the access token return | [optional]
 **codeAccessTokens** | **String**| Code access token | [optional]
 **filterAccessTokens** | **Boolean**| Filter access tokens | [optional]

### Return type

[**APP**](APP.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getChangeLogByAppId1"></a>
# **getChangeLogByAppId1**
> List&lt;ChangeLogBean&gt; getChangeLogByAppId1(id, sensediaAuth)

Retrive changelog per app id

### Example
```java
// Import classes:
//import com.sensedia.api.v3.client.ApiException;
//import com.sensedia.api.v3.AppsApi;


AppsApi apiInstance = new AppsApi();
Long id = 789L; // Long | id
String sensediaAuth = "sensediaAuth_example"; // String | Sensedia-Auth
try {
    List<ChangeLogBean> result = apiInstance.getChangeLogByAppId1(id, sensediaAuth);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AppsApi#getChangeLogByAppId1");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| id |
 **sensediaAuth** | **String**| Sensedia-Auth | [optional]

### Return type

[**List&lt;ChangeLogBean&gt;**](ChangeLogBean.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="removeApp1"></a>
# **removeApp1**
> removeApp1(id, sensediaAuth)

Delete a app

### Example
```java
// Import classes:
//import com.sensedia.api.v3.client.ApiException;
//import com.sensedia.api.v3.AppsApi;


AppsApi apiInstance = new AppsApi();
String id = "id_example"; // String | id
String sensediaAuth = "sensediaAuth_example"; // String | Sensedia-Auth
try {
    apiInstance.removeApp1(id, sensediaAuth);
} catch (ApiException e) {
    System.err.println("Exception when calling AppsApi#removeApp1");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| id |
 **sensediaAuth** | **String**| Sensedia-Auth | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateApp1"></a>
# **updateApp1**
> APPResponse updateApp1(id, appTokenBean, sensediaAuth)

Update a app

### Example
```java
// Import classes:
//import com.sensedia.api.v3.client.ApiException;
//import com.sensedia.api.v3.AppsApi;


AppsApi apiInstance = new AppsApi();
String id = "id_example"; // String | App json to update a app.
APP appTokenBean = new APP(); // APP | appTokenBean
String sensediaAuth = "sensediaAuth_example"; // String | Sensedia-Auth
try {
    APPResponse result = apiInstance.updateApp1(id, appTokenBean, sensediaAuth);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AppsApi#updateApp1");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| App json to update a app. |
 **appTokenBean** | [**APP**](APP.md)| appTokenBean |
 **sensediaAuth** | **String**| Sensedia-Auth | [optional]

### Return type

[**APPResponse**](APPResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="validatePartialApp1"></a>
# **validatePartialApp1**
> Object validatePartialApp1(sensediaAuth, appTokenBean)

Validate partial app

### Example
```java
// Import classes:
//import com.sensedia.api.v3.client.ApiException;
//import com.sensedia.api.v3.AppsApi;


AppsApi apiInstance = new AppsApi();
String sensediaAuth = "sensediaAuth_example"; // String | Sensedia-Auth
APP appTokenBean = new APP(); // APP | App json to validate app
try {
    Object result = apiInstance.validatePartialApp1(sensediaAuth, appTokenBean);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AppsApi#validatePartialApp1");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sensediaAuth** | **String**| Sensedia-Auth | [optional]
 **appTokenBean** | [**APP**](APP.md)| App json to validate app | [optional]

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

