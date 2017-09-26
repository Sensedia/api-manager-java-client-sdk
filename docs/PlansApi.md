# PlansApi

All URIs are relative to *https://localhost/api-manager/api/v3*

Method | HTTP request | Description
------------- | ------------- | -------------
[**clonePlan1**](PlansApi.md#clonePlan1) | **POST** /plans/{id}/clone | Clone a plan
[**createPlan1**](PlansApi.md#createPlan1) | **POST** /plans | Create a new plan
[**getAllPlan1**](PlansApi.md#getAllPlan1) | **GET** /plans | Return all plan
[**getChangeLogByPlanId1**](PlansApi.md#getChangeLogByPlanId1) | **GET** /plans/{id}/changelog | Retrive changelog per plan id
[**getPlanById1**](PlansApi.md#getPlanById1) | **GET** /plans/{id} | Find plan by id
[**getPlanDefaultByApiId1**](PlansApi.md#getPlanDefaultByApiId1) | **GET** /plans/{id}/defaultPlan | Find default plan by api id
[**plansCount1**](PlansApi.md#plansCount1) | **GET** /plans/count | Retrieve plan total
[**removePlan1**](PlansApi.md#removePlan1) | **DELETE** /plans/{id} | Delete a plan
[**updatePlan1**](PlansApi.md#updatePlan1) | **PUT** /plans/{id} | Update a plan
[**validatePartialPlan1**](PlansApi.md#validatePartialPlan1) | **POST** /plans/validate | Validate partial a plan


<a name="clonePlan1"></a>
# **clonePlan1**
> PlanResponse clonePlan1(sensediaAuth, id)

Clone a plan

### Example
```java
// Import classes:
//import com.sensedia.api.v3.client.ApiException;
//import com.sensedia.api.v3.PlansApi;


PlansApi apiInstance = new PlansApi();
String sensediaAuth = "sensediaAuth_example"; // String | Sensedia-Auth
String id = "id_example"; // String | Plan id
try {
    PlanResponse result = apiInstance.clonePlan1(sensediaAuth, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PlansApi#clonePlan1");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sensediaAuth** | **String**| Sensedia-Auth |
 **id** | **String**| Plan id |

### Return type

[**PlanResponse**](PlanResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="createPlan1"></a>
# **createPlan1**
> PlanResponse createPlan1(sensediaAuth, planBean)

Create a new plan

### Example
```java
// Import classes:
//import com.sensedia.api.v3.client.ApiException;
//import com.sensedia.api.v3.PlansApi;


PlansApi apiInstance = new PlansApi();
String sensediaAuth = "sensediaAuth_example"; // String | Sensedia-Auth
PlanResponse planBean = new PlanResponse(); // PlanResponse | planBean
try {
    PlanResponse result = apiInstance.createPlan1(sensediaAuth, planBean);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PlansApi#createPlan1");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sensediaAuth** | **String**| Sensedia-Auth |
 **planBean** | [**PlanResponse**](PlanResponse.md)| planBean |

### Return type

[**PlanResponse**](PlanResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="getAllPlan1"></a>
# **getAllPlan1**
> List&lt;PlanResponse&gt; getAllPlan1(sensediaAuth)

Return all plan

### Example
```java
// Import classes:
//import com.sensedia.api.v3.client.ApiException;
//import com.sensedia.api.v3.PlansApi;


PlansApi apiInstance = new PlansApi();
String sensediaAuth = "sensediaAuth_example"; // String | Sensedia-Auth
try {
    List<PlanResponse> result = apiInstance.getAllPlan1(sensediaAuth);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PlansApi#getAllPlan1");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sensediaAuth** | **String**| Sensedia-Auth |

### Return type

[**List&lt;PlanResponse&gt;**](PlanResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getChangeLogByPlanId1"></a>
# **getChangeLogByPlanId1**
> List&lt;ChangeLogBean&gt; getChangeLogByPlanId1(sensediaAuth, id)

Retrive changelog per plan id

### Example
```java
// Import classes:
//import com.sensedia.api.v3.client.ApiException;
//import com.sensedia.api.v3.PlansApi;


PlansApi apiInstance = new PlansApi();
String sensediaAuth = "sensediaAuth_example"; // String | Sensedia-Auth
Long id = 789L; // Long | id
try {
    List<ChangeLogBean> result = apiInstance.getChangeLogByPlanId1(sensediaAuth, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PlansApi#getChangeLogByPlanId1");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sensediaAuth** | **String**| Sensedia-Auth |
 **id** | **Long**| id |

### Return type

[**List&lt;ChangeLogBean&gt;**](ChangeLogBean.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getPlanById1"></a>
# **getPlanById1**
> PlanResponse getPlanById1(sensediaAuth, id)

Find plan by id

### Example
```java
// Import classes:
//import com.sensedia.api.v3.client.ApiException;
//import com.sensedia.api.v3.PlansApi;


PlansApi apiInstance = new PlansApi();
String sensediaAuth = "sensediaAuth_example"; // String | Sensedia-Auth
String id = "id_example"; // String | id
try {
    PlanResponse result = apiInstance.getPlanById1(sensediaAuth, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PlansApi#getPlanById1");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sensediaAuth** | **String**| Sensedia-Auth |
 **id** | **String**| id |

### Return type

[**PlanResponse**](PlanResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getPlanDefaultByApiId1"></a>
# **getPlanDefaultByApiId1**
> PlanResponse getPlanDefaultByApiId1(sensediaAuth, id)

Find default plan by api id

### Example
```java
// Import classes:
//import com.sensedia.api.v3.client.ApiException;
//import com.sensedia.api.v3.PlansApi;


PlansApi apiInstance = new PlansApi();
String sensediaAuth = "sensediaAuth_example"; // String | Sensedia-Auth
String id = "id_example"; // String | Api id
try {
    PlanResponse result = apiInstance.getPlanDefaultByApiId1(sensediaAuth, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PlansApi#getPlanDefaultByApiId1");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sensediaAuth** | **String**| Sensedia-Auth |
 **id** | **String**| Api id |

### Return type

[**PlanResponse**](PlanResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="plansCount1"></a>
# **plansCount1**
> Long plansCount1(sensediaAuth)

Retrieve plan total

### Example
```java
// Import classes:
//import com.sensedia.api.v3.client.ApiException;
//import com.sensedia.api.v3.PlansApi;


PlansApi apiInstance = new PlansApi();
String sensediaAuth = "sensediaAuth_example"; // String | Sensedia-Auth
try {
    Long result = apiInstance.plansCount1(sensediaAuth);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PlansApi#plansCount1");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sensediaAuth** | **String**| Sensedia-Auth |

### Return type

**Long**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="removePlan1"></a>
# **removePlan1**
> ResponseEntity removePlan1(sensediaAuth, id)

Delete a plan

### Example
```java
// Import classes:
//import com.sensedia.api.v3.client.ApiException;
//import com.sensedia.api.v3.PlansApi;


PlansApi apiInstance = new PlansApi();
String sensediaAuth = "sensediaAuth_example"; // String | Sensedia-Auth
String id = "id_example"; // String | Plan id
try {
    ResponseEntity result = apiInstance.removePlan1(sensediaAuth, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PlansApi#removePlan1");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sensediaAuth** | **String**| Sensedia-Auth |
 **id** | **String**| Plan id |

### Return type

[**ResponseEntity**](ResponseEntity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updatePlan1"></a>
# **updatePlan1**
> PlanResponse updatePlan1(sensediaAuth, id, planBean)

Update a plan

### Example
```java
// Import classes:
//import com.sensedia.api.v3.client.ApiException;
//import com.sensedia.api.v3.PlansApi;


PlansApi apiInstance = new PlansApi();
String sensediaAuth = "sensediaAuth_example"; // String | Sensedia-Auth
String id = "id_example"; // String | Plan id
PlanResponse planBean = new PlanResponse(); // PlanResponse | Plan json to update a plan
try {
    PlanResponse result = apiInstance.updatePlan1(sensediaAuth, id, planBean);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PlansApi#updatePlan1");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sensediaAuth** | **String**| Sensedia-Auth |
 **id** | **String**| Plan id |
 **planBean** | [**PlanResponse**](PlanResponse.md)| Plan json to update a plan | [optional]

### Return type

[**PlanResponse**](PlanResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="validatePartialPlan1"></a>
# **validatePartialPlan1**
> ResponseEntity validatePartialPlan1(sensediaAuth, planBean)

Validate partial a plan

### Example
```java
// Import classes:
//import com.sensedia.api.v3.client.ApiException;
//import com.sensedia.api.v3.PlansApi;


PlansApi apiInstance = new PlansApi();
String sensediaAuth = "sensediaAuth_example"; // String | Sensedia-Auth
PlanResponse planBean = new PlanResponse(); // PlanResponse | Plan json to validate a plan
try {
    ResponseEntity result = apiInstance.validatePartialPlan1(sensediaAuth, planBean);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PlansApi#validatePartialPlan1");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sensediaAuth** | **String**| Sensedia-Auth |
 **planBean** | [**PlanResponse**](PlanResponse.md)| Plan json to validate a plan | [optional]

### Return type

[**ResponseEntity**](ResponseEntity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

