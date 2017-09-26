
# InterceptorBean

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**content** | **String** |  |  [optional]
**executionPoint** | [**ExecutionPointEnum**](#ExecutionPointEnum) |  |  [optional]
**id** | **Long** |  |  [optional]
**idTemp** | **Long** |  |  [optional]
**operation** | [**APIComponentSimpleBean**](APIComponentSimpleBean.md) |  |  [optional]
**parent** | [**InterceptorReferenceBean**](InterceptorReferenceBean.md) |  |  [optional]
**parentType** | [**ParentTypeEnum**](#ParentTypeEnum) |  |  [optional]
**planId** | **Long** |  |  [optional]
**position** | **Integer** |  |  [optional]
**resource** | [**APIComponentSimpleBean**](APIComponentSimpleBean.md) |  |  [optional]
**revision** | [**APIComponentSimpleBean**](APIComponentSimpleBean.md) |  |  [optional]
**status** | [**StatusEnum**](#StatusEnum) |  |  [optional]
**type** | **String** |  |  [optional]


<a name="ExecutionPointEnum"></a>
## Enum: ExecutionPointEnum
Name | Value
---- | -----
FIRST | &quot;FIRST&quot;
SECOND | &quot;SECOND&quot;
THIRD | &quot;THIRD&quot;
ANY | &quot;ANY&quot;


<a name="ParentTypeEnum"></a>
## Enum: ParentTypeEnum
Name | Value
---- | -----
REVISION | &quot;REVISION&quot;
RESOURCE | &quot;RESOURCE&quot;
OPERATION | &quot;OPERATION&quot;
PLAN | &quot;PLAN&quot;


<a name="StatusEnum"></a>
## Enum: StatusEnum
Name | Value
---- | -----
CHANGED_VALUE | &quot;CHANGED_VALUE&quot;
REFERENCE | &quot;REFERENCE&quot;
REMOVED | &quot;REMOVED&quot;



