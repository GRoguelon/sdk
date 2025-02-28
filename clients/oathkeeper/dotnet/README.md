# Ory.Oathkeeper.Client - the C# library for the ORY Oathkeeper

ORY Oathkeeper is a reverse proxy that checks the HTTP Authorization for validity against a set of rules. This service uses Hydra to validate access tokens and policies.

This C# SDK is automatically generated by the [OpenAPI Generator](https://openapi-generator.tech) project:

- API version: v0.38.15-beta.1
- SDK version: 0.38.15-beta.1
- Build package: org.openapitools.codegen.languages.CSharpNetCoreClientCodegen
    For more information, please visit [https://www.ory.am](https://www.ory.am)

<a name="frameworks-supported"></a>
## Frameworks supported

<a name="dependencies"></a>
## Dependencies

- [RestSharp](https://www.nuget.org/packages/RestSharp) - 106.11.7 or later
- [Json.NET](https://www.nuget.org/packages/Newtonsoft.Json/) - 12.0.3 or later
- [JsonSubTypes](https://www.nuget.org/packages/JsonSubTypes/) - 1.8.0 or later
- [System.ComponentModel.Annotations](https://www.nuget.org/packages/System.ComponentModel.Annotations) - 5.0.0 or later

The DLLs included in the package may not be the latest version. We recommend using [NuGet](https://docs.nuget.org/consume/installing-nuget) to obtain the latest version of the packages:
```
Install-Package RestSharp
Install-Package Newtonsoft.Json
Install-Package JsonSubTypes
Install-Package System.ComponentModel.Annotations
```

NOTE: RestSharp versions greater than 105.1.0 have a bug which causes file uploads to fail. See [RestSharp#742](https://github.com/restsharp/RestSharp/issues/742).
NOTE: RestSharp for .Net Core creates a new socket for each api call, which can lead to a socket exhaustion problem. See [RestSharp#1406](https://github.com/restsharp/RestSharp/issues/1406).

<a name="installation"></a>
## Installation
Run the following command to generate the DLL
- [Mac/Linux] `/bin/sh build.sh`
- [Windows] `build.bat`

Then include the DLL (under the `bin` folder) in the C# project, and use the namespaces:
```csharp
using Ory.Oathkeeper.Client.Api;
using Ory.Oathkeeper.Client.Client;
using Ory.Oathkeeper.Client.Model;
```
<a name="packaging"></a>
## Packaging

A `.nuspec` is included with the project. You can follow the Nuget quickstart to [create](https://docs.microsoft.com/en-us/nuget/quickstart/create-and-publish-a-package#create-the-package) and [publish](https://docs.microsoft.com/en-us/nuget/quickstart/create-and-publish-a-package#publish-the-package) packages.

This `.nuspec` uses placeholders from the `.csproj`, so build the `.csproj` directly:

```
nuget pack -Build -OutputDirectory out Ory.Oathkeeper.Client.csproj
```

Then, publish to a [local feed](https://docs.microsoft.com/en-us/nuget/hosting-packages/local-feeds) or [other host](https://docs.microsoft.com/en-us/nuget/hosting-packages/overview) and consume the new package via Nuget as usual.

<a name="usage"></a>
## Usage

To use the API client with a HTTP proxy, setup a `System.Net.WebProxy`
```csharp
Configuration c = new Configuration();
System.Net.WebProxy webProxy = new System.Net.WebProxy("http://myProxyUrl:80/");
webProxy.Credentials = System.Net.CredentialCache.DefaultCredentials;
c.Proxy = webProxy;
```

<a name="getting-started"></a>
## Getting Started

```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Ory.Oathkeeper.Client.Api;
using Ory.Oathkeeper.Client.Client;
using Ory.Oathkeeper.Client.Model;

namespace Example
{
    public class Example
    {
        public static void Main()
        {

            Configuration config = new Configuration();
            config.BasePath = "http://localhost";
            var apiInstance = new ApiApi(config);

            try
            {
                // Access Control Decision API
                apiInstance.Decisions();
            }
            catch (ApiException e)
            {
                Debug.Print("Exception when calling ApiApi.Decisions: " + e.Message );
                Debug.Print("Status Code: "+ e.ErrorCode);
                Debug.Print(e.StackTrace);
            }

        }
    }
}
```

<a name="documentation-for-api-endpoints"></a>
## Documentation for API Endpoints

All URIs are relative to *http://localhost*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*ApiApi* | [**Decisions**](docs/ApiApi.md#decisions) | **GET** /decisions | Access Control Decision API
*ApiApi* | [**GetRule**](docs/ApiApi.md#getrule) | **GET** /rules/{id} | Retrieve a rule
*ApiApi* | [**GetVersion**](docs/ApiApi.md#getversion) | **GET** /version | Get service version
*ApiApi* | [**GetWellKnownJSONWebKeys**](docs/ApiApi.md#getwellknownjsonwebkeys) | **GET** /.well-known/jwks.json | Lists cryptographic keys
*ApiApi* | [**IsInstanceAlive**](docs/ApiApi.md#isinstancealive) | **GET** /health/alive | Check alive status
*ApiApi* | [**IsInstanceReady**](docs/ApiApi.md#isinstanceready) | **GET** /health/ready | Check readiness status
*ApiApi* | [**ListRules**](docs/ApiApi.md#listrules) | **GET** /rules | List all rules


<a name="documentation-for-models"></a>
## Documentation for Models

 - [Model.OathkeeperHealthNotReadyStatus](docs/OathkeeperHealthNotReadyStatus.md)
 - [Model.OathkeeperHealthStatus](docs/OathkeeperHealthStatus.md)
 - [Model.OathkeeperInlineResponse500](docs/OathkeeperInlineResponse500.md)
 - [Model.OathkeeperJsonWebKey](docs/OathkeeperJsonWebKey.md)
 - [Model.OathkeeperJsonWebKeySet](docs/OathkeeperJsonWebKeySet.md)
 - [Model.OathkeeperRule](docs/OathkeeperRule.md)
 - [Model.OathkeeperRuleHandler](docs/OathkeeperRuleHandler.md)
 - [Model.OathkeeperRuleMatch](docs/OathkeeperRuleMatch.md)
 - [Model.OathkeeperUpstream](docs/OathkeeperUpstream.md)
 - [Model.OathkeeperVersion](docs/OathkeeperVersion.md)


<a name="documentation-for-authorization"></a>
## Documentation for Authorization

All endpoints do not require authorization.
