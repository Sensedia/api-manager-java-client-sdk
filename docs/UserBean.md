
# UserBean

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**email** | **String** |  |  [optional]
**hasAllPermissions** | **Boolean** |  |  [optional]
**id** | **Long** |  |  [optional]
**image** | **String** |  |  [optional]
**login** | **String** |  |  [optional]
**name** | **String** |  |  [optional]
**password** | **String** |  |  [optional]
**passwordConfirm** | **String** |  |  [optional]
**roles** | [**List&lt;RoleBean&gt;**](RoleBean.md) |  |  [optional]
**teamUserId** | **Long** |  |  [optional]
**teams** | [**List&lt;TeamBean&gt;**](TeamBean.md) |  |  [optional]
**userType** | [**UserTypeEnum**](#UserTypeEnum) |  |  [optional]


<a name="UserTypeEnum"></a>
## Enum: UserTypeEnum
Name | Value
---- | -----
DATABASE | &quot;DATABASE&quot;
LDAP | &quot;LDAP&quot;



