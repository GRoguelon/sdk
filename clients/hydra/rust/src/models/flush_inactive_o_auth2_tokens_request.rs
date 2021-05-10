/*
 * ORY Hydra
 *
 * Welcome to the ORY Hydra HTTP API documentation. You will find documentation for all HTTP APIs here.
 *
 * The version of the OpenAPI document: v1.10.4-alpha.1
 * 
 * Generated by: https://openapi-generator.tech
 */




#[derive(Clone, Debug, PartialEq, Serialize, Deserialize)]
pub struct FlushInactiveOAuth2TokensRequest {
    /// NotAfter sets after which point tokens should not be flushed. This is useful when you want to keep a history of recently issued tokens for auditing.
    #[serde(rename = "notAfter", skip_serializing_if = "Option::is_none")]
    pub not_after: Option<String>,
}

impl FlushInactiveOAuth2TokensRequest {
    pub fn new() -> FlushInactiveOAuth2TokensRequest {
        FlushInactiveOAuth2TokensRequest {
            not_after: None,
        }
    }
}


