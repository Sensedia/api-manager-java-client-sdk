
# RevisionBean

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**api** | [**API**](API.md) |  |  [optional]
**apiBroken** | **Boolean** |  |  [optional]
**creationDate** | [**DateTime**](DateTime.md) |  |  [optional]
**deployments** | [**List&lt;DeploymentBean&gt;**](DeploymentBean.md) |  |  [optional]
**destination** | **String** |  |  [optional]
**id** | **Long** |  |  [optional]
**interceptors** | [**List&lt;InterceptorBean&gt;**](InterceptorBean.md) |  |  [optional]
**lifeCycle** | [**LifeCycleEnum**](#LifeCycleEnum) |  |  [optional]
**resources** | [**List&lt;ResourceBean&gt;**](ResourceBean.md) |  |  [optional]
**revisionNumber** | **Integer** |  |  [optional]
**timeout** | **String** |  |  [optional]


<a name="LifeCycleEnum"></a>
## Enum: LifeCycleEnum
Name | Value
---- | -----
DRAFT | &quot;DRAFT&quot;
AVAILABLE | &quot;AVAILABLE&quot;
RETIRED | &quot;RETIRED&quot;



