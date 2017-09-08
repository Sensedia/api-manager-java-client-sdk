# sensedia-client-jersey2

## Requirements

Building the API client library requires [Maven](https://maven.apache.org/) to be installed.

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn deploy
```

Refer to the [official documentation](https://maven.apache.org/plugins/maven-deploy-plugin/usage.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
    <groupId>com.sensedia</groupId>
    <artifactId>sensedia-client-jersey2</artifactId>
    <version>1.0.0</version>
    <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "com.sensedia:sensedia-client-jersey2:1.0.0"
```

### Others

At first generate the JAR by executing:

    mvn package

Then manually install the following JARs:

* target/sensedia-client-jersey2-1.0.0.jar
* target/lib/*.jar

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

import com.sensedia.api.v3.client.*;
import com.sensedia.api.v3.client.auth.*;
import com.sensedia.api.v3.model.*;
import com.sensedia.api.v3.APIsApi;

import java.io.File;
import java.util.*;

public class APIsApiExample {

    public static void main(String[] args) {
        
        APIsApi apiInstance = new APIsApi();
        String id = "id_example"; // String | API id
        String sensediaAuth = "sensediaAuth_example"; // String | Sensedia-Auth
        API apiBean = new API(); // API | API json to update a api
        try {
            ModelAPIResponse result = apiInstance.cloneApi1(id, sensediaAuth, apiBean);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling APIsApi#cloneApi1");
            e.printStackTrace();
        }
    }
}

```

## Documentation for API Endpoints

All URIs are relative to *https://localhost/api-manager/api/v3*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*APIsApi* | [**cloneApi1**](docs/APIsApi.md#cloneApi1) | **POST** /apis/{id}/clone | Clone a API
*APIsApi* | [**createApi1**](docs/APIsApi.md#createApi1) | **POST** /apis | Create a new API
*APIsApi* | [**createNewVersion1**](docs/APIsApi.md#createNewVersion1) | **POST** /apis/{id}/versions | Create new version
*APIsApi* | [**getApiById1**](docs/APIsApi.md#getApiById1) | **GET** /apis/{apiId} | Find API by id
*APIsApi* | [**getApis1**](docs/APIsApi.md#getApis1) | **GET** /apis | Return all APIs
*APIsApi* | [**getChangeLogByApiId1**](docs/APIsApi.md#getChangeLogByApiId1) | **GET** /apis/{id}/changelog | Retrive changelog per API id
*APIsApi* | [**getLastRevisionByApi1**](docs/APIsApi.md#getLastRevisionByApi1) | **GET** /apis/{id}/revisions | Find last revision by API id
*APIsApi* | [**getVersionsByApi1**](docs/APIsApi.md#getVersionsByApi1) | **GET** /apis/{id}/versions | Find version by API id
*APIsApi* | [**removeApi1**](docs/APIsApi.md#removeApi1) | **DELETE** /apis/{id} | Delete a API
*APIsApi* | [**removeLinkEnvironmentWithApi1**](docs/APIsApi.md#removeLinkEnvironmentWithApi1) | **DELETE** /apis/{id}/environments/{environmentId} | Delete environment link with API
*APIsApi* | [**updateApi1**](docs/APIsApi.md#updateApi1) | **PUT** /apis/{id} | Update a API
*APIsApi* | [**validatePartialApi1**](docs/APIsApi.md#validatePartialApi1) | **POST** /apis/validate | Validate partial a API
*AccessTokensApi* | [**accessTokenCount1**](docs/AccessTokensApi.md#accessTokenCount1) | **GET** /access-tokens/count | Retrieve access token total
*AccessTokensApi* | [**createAccessToken1**](docs/AccessTokensApi.md#createAccessToken1) | **POST** /access-tokens | Create a new access token
*AccessTokensApi* | [**getAccessToken1**](docs/AccessTokensApi.md#getAccessToken1) | **GET** /access-tokens | Find access token list by filters
*AccessTokensApi* | [**getChangeLogByAccessTokenId1**](docs/AccessTokensApi.md#getChangeLogByAccessTokenId1) | **GET** /access-tokens/{id}/changelog | Retrive changelog per access token id
*AccessTokensApi* | [**getTokenByCode1**](docs/AccessTokensApi.md#getTokenByCode1) | **GET** /access-tokens/{code} | Find access token by code
*AccessTokensApi* | [**removeAccessToken1**](docs/AccessTokensApi.md#removeAccessToken1) | **DELETE** /access-tokens/{id} | Remove a access token
*AccessTokensApi* | [**updateAccesstoken1**](docs/AccessTokensApi.md#updateAccesstoken1) | **PUT** /access-tokens/{id} | Update a access token
*AccessTokensApi* | [**validatePartialAccessToken1**](docs/AccessTokensApi.md#validatePartialAccessToken1) | **POST** /access-tokens/validate | Validate partial access token
*AppsApi* | [**appsCount1**](docs/AppsApi.md#appsCount1) | **GET** /apps/count | Retrieve App total
*AppsApi* | [**createApp1**](docs/AppsApi.md#createApp1) | **POST** /apps | Create a new app
*AppsApi* | [**getAppTokenByAppGallery1**](docs/AppsApi.md#getAppTokenByAppGallery1) | **GET** /apps/gallery | Return all apps
*AppsApi* | [**getAppTokenByFilter1**](docs/AppsApi.md#getAppTokenByFilter1) | **GET** /apps | Find app list by filters
*AppsApi* | [**getAppTokenById1**](docs/AppsApi.md#getAppTokenById1) | **GET** /apps/{code} | Find app by code
*AppsApi* | [**getChangeLogByAppId1**](docs/AppsApi.md#getChangeLogByAppId1) | **GET** /apps/{code}/changelog | Retrive changelog per app id
*AppsApi* | [**removeApp1**](docs/AppsApi.md#removeApp1) | **DELETE** /apps/{code} | Delete a app
*AppsApi* | [**updateApp1**](docs/AppsApi.md#updateApp1) | **PUT** /apps/{id} | Update a app
*AppsApi* | [**validatePartialApp1**](docs/AppsApi.md#validatePartialApp1) | **POST** /apps/validate | Validate partial app
*CallsApi* | [**retriveCallById1**](docs/CallsApi.md#retriveCallById1) | **GET** /calls/{id} | Retrive call by id
*CallsApi* | [**retriveCallsWithFiltrs1**](docs/CallsApi.md#retriveCallsWithFiltrs1) | **GET** /calls | Retrive calls with filters
*CallsApi* | [**retriveTotalCallsByDate1**](docs/CallsApi.md#retriveTotalCallsByDate1) | **GET** /calls/count/{date} | Retrive calls total by date
*DevelopersApi* | [**createOrUpdateDeveloper1**](docs/DevelopersApi.md#createOrUpdateDeveloper1) | **PUT** /developers/{login} | Create or update developer
*DevelopersApi* | [**developersCount1**](docs/DevelopersApi.md#developersCount1) | **GET** /developers/count | Retrieve developers total
*DevelopersApi* | [**removeDeveloper1**](docs/DevelopersApi.md#removeDeveloper1) | **DELETE** /developers/{login} | Delete developer
*DevelopersApi* | [**retriveChangeLogByUsername1**](docs/DevelopersApi.md#retriveChangeLogByUsername1) | **GET** /developers/{username}/changelog | Retrive audit developer per username
*DevelopersApi* | [**retriveDeveloperByLogin1**](docs/DevelopersApi.md#retriveDeveloperByLogin1) | **GET** /developers/{login} | Retrive developer per Login
*DevelopersApi* | [**retriveDevelopers1**](docs/DevelopersApi.md#retriveDevelopers1) | **GET** /developers | Retrive developers
*MetricsApi* | [**getAccessTokensByMonth1**](docs/MetricsApi.md#getAccessTokensByMonth1) | **GET** /metrics/access-tokens | Find access token consolited by month
*MetricsApi* | [**getAppsByMonth1**](docs/MetricsApi.md#getAppsByMonth1) | **GET** /metrics/apps | Find apps consolited by month
*MetricsApi* | [**getCache1**](docs/MetricsApi.md#getCache1) | **GET** /metrics/cache | Find cache
*MetricsApi* | [**getCacheLatency1**](docs/MetricsApi.md#getCacheLatency1) | **GET** /metrics/cache/latency | Find cache latency
*MetricsApi* | [**getCacheSize1**](docs/MetricsApi.md#getCacheSize1) | **GET** /metrics/cache/size | Retrive cache size
*MetricsApi* | [**getCallsByMonth1**](docs/MetricsApi.md#getCallsByMonth1) | **GET** /metrics/calls | Find calls by month
*MetricsApi* | [**getHealth1**](docs/MetricsApi.md#getHealth1) | **GET** /metrics/health | Find Health
*MetricsApi* | [**getLatencyByMonth1**](docs/MetricsApi.md#getLatencyByMonth1) | **GET** /metrics/latency | Find latency by month
*MetricsApi* | [**getStatusError1**](docs/MetricsApi.md#getStatusError1) | **GET** /metrics/statusError | Retrive Status Error
*MetricsApi* | [**getTopAccessTokens1**](docs/MetricsApi.md#getTopAccessTokens1) | **GET** /metrics/top-access-tokens/{howMany} | Find top access token
*MetricsApi* | [**getTopApps1**](docs/MetricsApi.md#getTopApps1) | **GET** /metrics/top-apps/{howMany} | Find top apps
*PlansApi* | [**clonePlan1**](docs/PlansApi.md#clonePlan1) | **POST** /plans/{id}/clone | Clone a plan
*PlansApi* | [**createPlan1**](docs/PlansApi.md#createPlan1) | **POST** /plans | Create a new plan
*PlansApi* | [**getAllPlan1**](docs/PlansApi.md#getAllPlan1) | **GET** /plans | Return all plan
*PlansApi* | [**getChangeLogByPlanId1**](docs/PlansApi.md#getChangeLogByPlanId1) | **GET** /plans/{id}/changelog | Retrive changelog per plan id
*PlansApi* | [**getPlanById1**](docs/PlansApi.md#getPlanById1) | **GET** /plans/{id} | Find plan by id
*PlansApi* | [**getPlanDefaultByApiId1**](docs/PlansApi.md#getPlanDefaultByApiId1) | **GET** /plans/{id}/defaultPlan | Find default plan by api id
*PlansApi* | [**plansCount1**](docs/PlansApi.md#plansCount1) | **GET** /plans/count | Retrieve plan total
*PlansApi* | [**removePlan1**](docs/PlansApi.md#removePlan1) | **DELETE** /plans/{id} | Delete a plan
*PlansApi* | [**updatePlan1**](docs/PlansApi.md#updatePlan1) | **PUT** /plans/{id} | Update a plan
*PlansApi* | [**validatePartialPlan1**](docs/PlansApi.md#validatePartialPlan1) | **POST** /plans/validate | Validate partial a plan


## Documentation for Models

 - [API](docs/API.md)
 - [APIComponentSimpleBean](docs/APIComponentSimpleBean.md)
 - [APICreateBean](docs/APICreateBean.md)
 - [APISimpleBean](docs/APISimpleBean.md)
 - [APIUserBean](docs/APIUserBean.md)
 - [APP](docs/APP.md)
 - [APPResponse](docs/APPResponse.md)
 - [AccessToken](docs/AccessToken.md)
 - [AccessTokenResponse](docs/AccessTokenResponse.md)
 - [AppTokenSimpleBean](docs/AppTokenSimpleBean.md)
 - [AuthTokenSimpleBean](docs/AuthTokenSimpleBean.md)
 - [CacheMetric](docs/CacheMetric.md)
 - [CacheMetricItem](docs/CacheMetricItem.md)
 - [Call](docs/Call.md)
 - [CallResponse](docs/CallResponse.md)
 - [CallsMetric](docs/CallsMetric.md)
 - [ChangeLog](docs/ChangeLog.md)
 - [ChangeLogBean](docs/ChangeLogBean.md)
 - [DeploymentBean](docs/DeploymentBean.md)
 - [DeploymentScheduleBean](docs/DeploymentScheduleBean.md)
 - [DeploymentSimpleBean](docs/DeploymentSimpleBean.md)
 - [Developer](docs/Developer.md)
 - [EnvironmentSimpleBean](docs/EnvironmentSimpleBean.md)
 - [EvironmentUserBean](docs/EvironmentUserBean.md)
 - [InterceptorBean](docs/InterceptorBean.md)
 - [InterceptorReferenceBean](docs/InterceptorReferenceBean.md)
 - [LatencyMetric](docs/LatencyMetric.md)
 - [ModelAPIResponse](docs/ModelAPIResponse.md)
 - [OperationBean](docs/OperationBean.md)
 - [OperationHealth](docs/OperationHealth.md)
 - [OperationMetric](docs/OperationMetric.md)
 - [OperationUrlBean](docs/OperationUrlBean.md)
 - [PlanResponse](docs/PlanResponse.md)
 - [PlanSimpleBean](docs/PlanSimpleBean.md)
 - [ResourceBean](docs/ResourceBean.md)
 - [ResponseEntity](docs/ResponseEntity.md)
 - [RevisionBean](docs/RevisionBean.md)
 - [RevisionSimpleBean](docs/RevisionSimpleBean.md)
 - [RoleBean](docs/RoleBean.md)
 - [RolePermissionBean](docs/RolePermissionBean.md)
 - [TeamBean](docs/TeamBean.md)
 - [TokensMetric](docs/TokensMetric.md)
 - [TopAccessToken](docs/TopAccessToken.md)
 - [TopApp](docs/TopApp.md)
 - [UserBean](docs/UserBean.md)


## Documentation for Authorization

All endpoints do not require authorization.
Authentication schemes defined for the API:

## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author



