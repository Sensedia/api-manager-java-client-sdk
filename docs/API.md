
# API

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**accessTokenExpiresIn** | **Long** |  |  [optional]
**appsCount** | **Long** |  |  [optional]
**basePath** | **String** |  |  [optional]
**creationDate** | [**DateTime**](DateTime.md) |  |  [optional]
**description** | **String** |  |  [optional]
**environments** | [**List&lt;EnvironmentSimpleBean&gt;**](EnvironmentSimpleBean.md) |  |  [optional]
**icon** | **String** |  |  [optional]
**id** | **Long** |  |  [optional]
**lastRevision** | [**RevisionSimpleBean**](RevisionSimpleBean.md) |  |  [optional]
**lastVersion** | **Boolean** |  |  [optional]
**name** | **String** |  |  [optional]
**owner** | [**UserBean**](UserBean.md) |  |  [optional]
**parentId** | **Long** |  |  [optional]
**plans** | [**List&lt;PlanSimpleBean&gt;**](PlanSimpleBean.md) |  |  [optional]
**privateAPI** | **Boolean** |  |  [optional]
**releaseNotes** | **String** |  |  [optional]
**revisions** | [**List&lt;RevisionSimpleBean&gt;**](RevisionSimpleBean.md) |  |  [optional]
**teamVisibility** | [**TeamBean**](TeamBean.md) |  |  [optional]
**users** | [**List&lt;APIUserBean&gt;**](APIUserBean.md) |  |  [optional]
**version** | **String** |  |  [optional]
**visibilityType** | [**VisibilityTypeEnum**](#VisibilityTypeEnum) |  |  [optional]


<a name="VisibilityTypeEnum"></a>
## Enum: VisibilityTypeEnum
Name | Value
---- | -----
ORGANIZATION | &quot;ORGANIZATION&quot;
TEAM | &quot;TEAM&quot;
ME | &quot;ME&quot;



