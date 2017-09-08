
# ChangeLog

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**action** | [**ActionEnum**](#ActionEnum) |  |  [optional]
**creationDate** | [**DateTime**](DateTime.md) |  |  [optional]
**credentialId** | **Long** |  |  [optional]
**credentialLogin** | **String** |  |  [optional]
**credentialName** | **String** |  |  [optional]
**id** | **Long** |  |  [optional]
**jsonAfter** | **String** |  |  [optional]
**jsonBefore** | **String** |  |  [optional]
**objectId** | **Long** |  |  [optional]
**objectType** | [**ObjectTypeEnum**](#ObjectTypeEnum) |  |  [optional]
**parent** | [**ChangeLog**](ChangeLog.md) |  |  [optional]


<a name="ActionEnum"></a>
## Enum: ActionEnum
Name | Value
---- | -----
CREATED | &quot;CREATED&quot;
UPDATED | &quot;UPDATED&quot;
DELETED | &quot;DELETED&quot;


<a name="ObjectTypeEnum"></a>
## Enum: ObjectTypeEnum
Name | Value
---- | -----
APP_TOKEN | &quot;APP_TOKEN&quot;
AUTH_TOKEN | &quot;AUTH_TOKEN&quot;
API_DEFINITION | &quot;API_DEFINITION&quot;
USER_ACCOUNT | &quot;USER_ACCOUNT&quot;
ACCESS_CREDENTIAL | &quot;ACCESS_CREDENTIAL&quot;
EXTERNAL_LISTENER | &quot;EXTERNAL_LISTENER&quot;
APICOMPONENTINTERCEPTOR | &quot;APICOMPONENTINTERCEPTOR&quot;
PLANINTERCEPTOR | &quot;PLANINTERCEPTOR&quot;
PLAN | &quot;PLAN&quot;
CUSTOM_INTERCEPTOR | &quot;CUSTOM_INTERCEPTOR&quot;
CUSTOM_JAVA_INTERCEPTOR | &quot;CUSTOM_JAVA_INTERCEPTOR&quot;
BAAS | &quot;BAAS&quot;
ENVIRONMENT | &quot;ENVIRONMENT&quot;
REVISION | &quot;REVISION&quot;
TEAM | &quot;TEAM&quot;
DEPLOYMENT | &quot;DEPLOYMENT&quot;
GATEWAY | &quot;GATEWAY&quot;



