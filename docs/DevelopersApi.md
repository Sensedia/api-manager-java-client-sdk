# DevelopersApi

All URIs are relative to *https://localhost/api-manager/api/v3*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createOrUpdateDeveloper1**](DevelopersApi.md#createOrUpdateDeveloper1) | **PUT** /developers/{login} | Create or update developer
[**developersCount1**](DevelopersApi.md#developersCount1) | **GET** /developers/count | Retrieve developers total
[**removeDeveloper1**](DevelopersApi.md#removeDeveloper1) | **DELETE** /developers/{login} | Delete developer
[**retriveChangeLogByUsername1**](DevelopersApi.md#retriveChangeLogByUsername1) | **GET** /developers/{username}/changelog | Retrive audit developer per username
[**retriveDeveloperByLogin1**](DevelopersApi.md#retriveDeveloperByLogin1) | **GET** /developers/{login} | Retrive developer per Login
[**retriveDevelopers1**](DevelopersApi.md#retriveDevelopers1) | **GET** /developers | Retrive developers


<a name="createOrUpdateDeveloper1"></a>
# **createOrUpdateDeveloper1**
> Developer createOrUpdateDeveloper1(login, bean, sensediaAuth)

Create or update developer

### Example
```java
// Import classes:
//import com.sensedia.api.v3.client.ApiException;
//import com.sensedia.api.v3.DevelopersApi;


DevelopersApi apiInstance = new DevelopersApi();
String login = "login_example"; // String | Developer Login
Developer bean = new Developer(); // Developer | bean
String sensediaAuth = "sensediaAuth_example"; // String | Sensedia-Auth
try {
    Developer result = apiInstance.createOrUpdateDeveloper1(login, bean, sensediaAuth);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DevelopersApi#createOrUpdateDeveloper1");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **login** | **String**| Developer Login |
 **bean** | [**Developer**](Developer.md)| bean |
 **sensediaAuth** | **String**| Sensedia-Auth | [optional]

### Return type

[**Developer**](Developer.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="developersCount1"></a>
# **developersCount1**
> Long developersCount1(sensediaAuth)

Retrieve developers total

### Example
```java
// Import classes:
//import com.sensedia.api.v3.client.ApiException;
//import com.sensedia.api.v3.DevelopersApi;


DevelopersApi apiInstance = new DevelopersApi();
String sensediaAuth = "sensediaAuth_example"; // String | Sensedia-Auth
try {
    Long result = apiInstance.developersCount1(sensediaAuth);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DevelopersApi#developersCount1");
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

<a name="removeDeveloper1"></a>
# **removeDeveloper1**
> removeDeveloper1(login, sensediaAuth)

Delete developer

### Example
```java
// Import classes:
//import com.sensedia.api.v3.client.ApiException;
//import com.sensedia.api.v3.DevelopersApi;


DevelopersApi apiInstance = new DevelopersApi();
String login = "login_example"; // String | Developer Login
String sensediaAuth = "sensediaAuth_example"; // String | Sensedia-Auth
try {
    apiInstance.removeDeveloper1(login, sensediaAuth);
} catch (ApiException e) {
    System.err.println("Exception when calling DevelopersApi#removeDeveloper1");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **login** | **String**| Developer Login |
 **sensediaAuth** | **String**| Sensedia-Auth | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="retriveChangeLogByUsername1"></a>
# **retriveChangeLogByUsername1**
> List&lt;ChangeLogBean&gt; retriveChangeLogByUsername1(username, sensediaAuth)

Retrive audit developer per username

### Example
```java
// Import classes:
//import com.sensedia.api.v3.client.ApiException;
//import com.sensedia.api.v3.DevelopersApi;


DevelopersApi apiInstance = new DevelopersApi();
String username = "username_example"; // String | Developer username
String sensediaAuth = "sensediaAuth_example"; // String | Sensedia-Auth
try {
    List<ChangeLogBean> result = apiInstance.retriveChangeLogByUsername1(username, sensediaAuth);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DevelopersApi#retriveChangeLogByUsername1");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **username** | **String**| Developer username |
 **sensediaAuth** | **String**| Sensedia-Auth | [optional]

### Return type

[**List&lt;ChangeLogBean&gt;**](ChangeLogBean.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="retriveDeveloperByLogin1"></a>
# **retriveDeveloperByLogin1**
> Developer retriveDeveloperByLogin1(login, sensediaAuth)

Retrive developer per Login

### Example
```java
// Import classes:
//import com.sensedia.api.v3.client.ApiException;
//import com.sensedia.api.v3.DevelopersApi;


DevelopersApi apiInstance = new DevelopersApi();
String login = "login_example"; // String | Developer Login
String sensediaAuth = "sensediaAuth_example"; // String | Sensedia-Auth
try {
    Developer result = apiInstance.retriveDeveloperByLogin1(login, sensediaAuth);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DevelopersApi#retriveDeveloperByLogin1");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **login** | **String**| Developer Login |
 **sensediaAuth** | **String**| Sensedia-Auth | [optional]

### Return type

[**Developer**](Developer.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="retriveDevelopers1"></a>
# **retriveDevelopers1**
> List&lt;Developer&gt; retriveDevelopers1(sensediaAuth, loginOrEmail, name, email, actualPage, pageSize)

Retrive developers

### Example
```java
// Import classes:
//import com.sensedia.api.v3.client.ApiException;
//import com.sensedia.api.v3.DevelopersApi;


DevelopersApi apiInstance = new DevelopersApi();
String sensediaAuth = "sensediaAuth_example"; // String | Sensedia-Auth
String loginOrEmail = "loginOrEmail_example"; // String | Login or E-mail
String name = "name_example"; // String | Developer Name
String email = "email_example"; // String | Developer E-mail
Integer actualPage = 56; // Integer | Number of the page in pagination. The starting page number is zero.
Integer pageSize = 56; // Integer | Define the size of the returned list of developers.
try {
    List<Developer> result = apiInstance.retriveDevelopers1(sensediaAuth, loginOrEmail, name, email, actualPage, pageSize);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DevelopersApi#retriveDevelopers1");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sensediaAuth** | **String**| Sensedia-Auth | [optional]
 **loginOrEmail** | **String**| Login or E-mail | [optional]
 **name** | **String**| Developer Name | [optional]
 **email** | **String**| Developer E-mail | [optional]
 **actualPage** | **Integer**| Number of the page in pagination. The starting page number is zero. | [optional]
 **pageSize** | **Integer**| Define the size of the returned list of developers. | [optional]

### Return type

[**List&lt;Developer&gt;**](Developer.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

