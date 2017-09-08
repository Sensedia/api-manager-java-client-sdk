
# AccessToken

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**apis** | [**List&lt;APISimpleBean&gt;**](APISimpleBean.md) |  |  [optional]
**app** | [**AppTokenSimpleBean**](AppTokenSimpleBean.md) |  |  [optional]
**code** | **String** |  |  [optional]
**creationDate** | [**DateTime**](DateTime.md) |  |  [optional]
**expiredDate** | [**DateTime**](DateTime.md) |  |  [optional]
**expiresIn** | **Long** |  |  [optional]
**extraInfo** | **Object** |  |  [optional]
**id** | **Long** |  |  [optional]
**owner** | **String** |  |  [optional]
**planIds** | **List&lt;Long&gt;** |  |  [optional]
**refreshToken** | **String** |  |  [optional]
**scope** | **String** |  |  [optional]
**status** | [**StatusEnum**](#StatusEnum) |  |  [optional]


<a name="StatusEnum"></a>
## Enum: StatusEnum
Name | Value
---- | -----
ACTIVE | &quot;ACTIVE&quot;
REVOKED | &quot;REVOKED&quot;
EXPIRED | &quot;EXPIRED&quot;



