# AccessTokensApi

All URIs are relative to *https://localhost/api-manager/api/v3*

Method | HTTP request | Description
------------- | ------------- | -------------
[**accessTokenCount1**](AccessTokensApi.md#accessTokenCount1) | **GET** /access-tokens/count | Retrieve access token total
[**createAccessToken1**](AccessTokensApi.md#createAccessToken1) | **POST** /access-tokens | Create a new access token
[**getAccessToken1**](AccessTokensApi.md#getAccessToken1) | **GET** /access-tokens | Find access token list by filters
[**getChangeLogByAccessTokenId1**](AccessTokensApi.md#getChangeLogByAccessTokenId1) | **GET** /access-tokens/{id}/changelog | Retrive changelog per access token id
[**getTokenByCode1**](AccessTokensApi.md#getTokenByCode1) | **GET** /access-tokens/{code} | Find access token by code
[**removeAccessToken1**](AccessTokensApi.md#removeAccessToken1) | **DELETE** /access-tokens/{id} | Remove a access token
[**updateAccesstoken1**](AccessTokensApi.md#updateAccesstoken1) | **PUT** /access-tokens/{id} | Update a access token
[**validatePartialAccessToken1**](AccessTokensApi.md#validatePartialAccessToken1) | **POST** /access-tokens/validate | Validate partial access token


<a name="accessTokenCount1"></a>
# **accessTokenCount1**
> Long accessTokenCount1(sensediaAuth)

Retrieve access token total

### Example
```java
// Import classes:
//import com.sensedia.api.v3.client.ApiException;
//import com.sensedia.api.v3.AccessTokensApi;


AccessTokensApi apiInstance = new AccessTokensApi();
String sensediaAuth = "sensediaAuth_example"; // String | Sensedia-Auth
try {
    Long result = apiInstance.accessTokenCount1(sensediaAuth);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccessTokensApi#accessTokenCount1");
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

<a name="createAccessToken1"></a>
# **createAccessToken1**
> AccessToken createAccessToken1(sensediaAuth, bean)

Create a new access token

### Example
```java
// Import classes:
//import com.sensedia.api.v3.client.ApiException;
//import com.sensedia.api.v3.AccessTokensApi;


AccessTokensApi apiInstance = new AccessTokensApi();
String sensediaAuth = "sensediaAuth_example"; // String | Sensedia-Auth
AccessToken bean = new AccessToken(); // AccessToken | Access token json to create a new access token.
try {
    AccessToken result = apiInstance.createAccessToken1(sensediaAuth, bean);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccessTokensApi#createAccessToken1");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sensediaAuth** | **String**| Sensedia-Auth | [optional]
 **bean** | [**AccessToken**](AccessToken.md)| Access token json to create a new access token. | [optional]

### Return type

[**AccessToken**](AccessToken.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getAccessToken1"></a>
# **getAccessToken1**
> List&lt;AccessToken&gt; getAccessToken1(sensediaAuth, code, owner, status, expiresIn, refreshToken, scope, keyword, actualPage, pageSize, authIds, beginDate, endDate, extraFields)

Find access token list by filters

### Example
```java
// Import classes:
//import com.sensedia.api.v3.client.ApiException;
//import com.sensedia.api.v3.AccessTokensApi;


AccessTokensApi apiInstance = new AccessTokensApi();
String sensediaAuth = "sensediaAuth_example"; // String | Sensedia-Auth
String code = "code_example"; // String | code
String owner = "owner_example"; // String | owner
String status = "status_example"; // String | staus(ACTIVE, REVOKED, EXPIRED)
Long expiresIn = 789L; // Long | Expires in millisecond
String refreshToken = "refreshToken_example"; // String | Refresh code
String scope = "scope_example"; // String | Scope
String keyword = "keyword_example"; // String | Keyword to find between code or owner
Integer actualPage = 56; // Integer | Number of the page in pagination. The starting page number is zero.
Integer pageSize = 56; // Integer | Define the size of the returned list of developers.
String authIds = "authIds_example"; // String | Id access token separated by space. Ex:(1 3 6 8)
String beginDate = "beginDate_example"; // String | Begin date
String endDate = "endDate_example"; // String | End date
String extraFields = "extraFields_example"; // String | Extra field separated by comma
try {
    List<AccessToken> result = apiInstance.getAccessToken1(sensediaAuth, code, owner, status, expiresIn, refreshToken, scope, keyword, actualPage, pageSize, authIds, beginDate, endDate, extraFields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccessTokensApi#getAccessToken1");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sensediaAuth** | **String**| Sensedia-Auth | [optional]
 **code** | **String**| code | [optional]
 **owner** | **String**| owner | [optional]
 **status** | **String**| staus(ACTIVE, REVOKED, EXPIRED) | [optional]
 **expiresIn** | **Long**| Expires in millisecond | [optional]
 **refreshToken** | **String**| Refresh code | [optional]
 **scope** | **String**| Scope | [optional]
 **keyword** | **String**| Keyword to find between code or owner | [optional]
 **actualPage** | **Integer**| Number of the page in pagination. The starting page number is zero. | [optional]
 **pageSize** | **Integer**| Define the size of the returned list of developers. | [optional]
 **authIds** | **String**| Id access token separated by space. Ex:(1 3 6 8) | [optional]
 **beginDate** | **String**| Begin date | [optional]
 **endDate** | **String**| End date | [optional]
 **extraFields** | **String**| Extra field separated by comma | [optional]

### Return type

[**List&lt;AccessToken&gt;**](AccessToken.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getChangeLogByAccessTokenId1"></a>
# **getChangeLogByAccessTokenId1**
> List&lt;ChangeLogBean&gt; getChangeLogByAccessTokenId1(id, sensediaAuth)

Retrive changelog per access token id

### Example
```java
// Import classes:
//import com.sensedia.api.v3.client.ApiException;
//import com.sensedia.api.v3.AccessTokensApi;


AccessTokensApi apiInstance = new AccessTokensApi();
Long id = 789L; // Long | Access token id
String sensediaAuth = "sensediaAuth_example"; // String | Sensedia-Auth
try {
    List<ChangeLogBean> result = apiInstance.getChangeLogByAccessTokenId1(id, sensediaAuth);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccessTokensApi#getChangeLogByAccessTokenId1");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| Access token id |
 **sensediaAuth** | **String**| Sensedia-Auth | [optional]

### Return type

[**List&lt;ChangeLogBean&gt;**](ChangeLogBean.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="getTokenByCode1"></a>
# **getTokenByCode1**
> AccessToken getTokenByCode1(code, sensediaAuth)

Find access token by code

### Example
```java
// Import classes:
//import com.sensedia.api.v3.client.ApiException;
//import com.sensedia.api.v3.AccessTokensApi;


AccessTokensApi apiInstance = new AccessTokensApi();
String code = "code_example"; // String | Code
String sensediaAuth = "sensediaAuth_example"; // String | Sensedia-Auth
try {
    AccessToken result = apiInstance.getTokenByCode1(code, sensediaAuth);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccessTokensApi#getTokenByCode1");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **code** | **String**| Code |
 **sensediaAuth** | **String**| Sensedia-Auth | [optional]

### Return type

[**AccessToken**](AccessToken.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="removeAccessToken1"></a>
# **removeAccessToken1**
> removeAccessToken1(id, sensediaAuth)

Remove a access token

### Example
```java
// Import classes:
//import com.sensedia.api.v3.client.ApiException;
//import com.sensedia.api.v3.AccessTokensApi;


AccessTokensApi apiInstance = new AccessTokensApi();
String id = "id_example"; // String | App id
String sensediaAuth = "sensediaAuth_example"; // String | Sensedia-Auth
try {
    apiInstance.removeAccessToken1(id, sensediaAuth);
} catch (ApiException e) {
    System.err.println("Exception when calling AccessTokensApi#removeAccessToken1");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| App id |
 **sensediaAuth** | **String**| Sensedia-Auth | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="updateAccesstoken1"></a>
# **updateAccesstoken1**
> AccessTokenResponse updateAccesstoken1(id, sensediaAuth, bean)

Update a access token

### Example
```java
// Import classes:
//import com.sensedia.api.v3.client.ApiException;
//import com.sensedia.api.v3.AccessTokensApi;


AccessTokensApi apiInstance = new AccessTokensApi();
String id = "id_example"; // String | Access token id
String sensediaAuth = "sensediaAuth_example"; // String | Sensedia-Auth
AccessToken bean = new AccessToken(); // AccessToken | Access token json to update a access token.
try {
    AccessTokenResponse result = apiInstance.updateAccesstoken1(id, sensediaAuth, bean);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccessTokensApi#updateAccesstoken1");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Access token id |
 **sensediaAuth** | **String**| Sensedia-Auth | [optional]
 **bean** | [**AccessToken**](AccessToken.md)| Access token json to update a access token. | [optional]

### Return type

[**AccessTokenResponse**](AccessTokenResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="validatePartialAccessToken1"></a>
# **validatePartialAccessToken1**
> Object validatePartialAccessToken1(sensediaAuth, bean)

Validate partial access token

### Example
```java
// Import classes:
//import com.sensedia.api.v3.client.ApiException;
//import com.sensedia.api.v3.AccessTokensApi;


AccessTokensApi apiInstance = new AccessTokensApi();
String sensediaAuth = "sensediaAuth_example"; // String | Sensedia-Auth
AccessToken bean = new AccessToken(); // AccessToken | Access token json to validate a access token.
try {
    Object result = apiInstance.validatePartialAccessToken1(sensediaAuth, bean);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccessTokensApi#validatePartialAccessToken1");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sensediaAuth** | **String**| Sensedia-Auth | [optional]
 **bean** | [**AccessToken**](AccessToken.md)| Access token json to validate a access token. | [optional]

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

