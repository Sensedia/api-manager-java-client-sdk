
# EnvironmentSimpleBean

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Long** |  |  [optional]
**inboundUrl** | **String** |  |  [optional]
**name** | **String** |  |  [optional]
**owner** | [**UserBean**](UserBean.md) |  |  [optional]
**revisionDeployed** | [**DeploymentSimpleBean**](DeploymentSimpleBean.md) |  |  [optional]
**teamVisibility** | [**TeamBean**](TeamBean.md) |  |  [optional]
**users** | [**List&lt;EvironmentUserBean&gt;**](EvironmentUserBean.md) |  |  [optional]
**visibilityType** | [**VisibilityTypeEnum**](#VisibilityTypeEnum) |  |  [optional]


<a name="VisibilityTypeEnum"></a>
## Enum: VisibilityTypeEnum
Name | Value
---- | -----
ORGANIZATION | &quot;ORGANIZATION&quot;
TEAM | &quot;TEAM&quot;
ME | &quot;ME&quot;



