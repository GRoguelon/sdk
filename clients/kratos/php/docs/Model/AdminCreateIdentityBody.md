# # AdminCreateIdentityBody

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**schemaId** | **string** | SchemaID is the ID of the JSON Schema to be used for validating the identity&#39;s traits. |
**state** | [**\Ory\Kratos\Client\Model\IdentityState**](IdentityState.md) |  | [optional]
**traits** | **object** | Traits represent an identity&#39;s traits. The identity is able to create, modify, and delete traits in a self-service manner. The input will always be validated against the JSON Schema defined in &#x60;schema_url&#x60;. |

[[Back to Model list]](../../README.md#models) [[Back to API list]](../../README.md#endpoints) [[Back to README]](../../README.md)
