# NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
# https://openapi-generator.tech
# Do not edit the class manually.

defmodule OryKetoClient.Api.Health do
  @moduledoc """
  API calls for all endpoints tagged `Health`.
  """

  alias OryKetoClient.Connection
  import OryKetoClient.RequestBuilder


  @doc """
  Check alive status
  This endpoint returns a 200 status code when the HTTP server is up running. This status does currently not include checks whether the database connection is working.  If the service supports TLS Edge Termination, this endpoint does not require the `X-Forwarded-Proto` header to be set.  Be aware that if you are running multiple nodes of this service, the health status will never refer to the cluster state, only to a single instance.

  ## Parameters

  - connection (OryKetoClient.Connection): Connection to server
  - opts (KeywordList): [optional] Optional parameters
  ## Returns

  {:ok, OryKetoClient.Model.HealthStatus.t} on success
  {:error, Tesla.Env.t} on failure
  """
  @spec is_instance_alive(Tesla.Env.client, keyword()) :: {:ok, OryKetoClient.Model.HealthStatus.t} | {:ok, OryKetoClient.Model.InlineResponse400.t} | {:error, Tesla.Env.t}
  def is_instance_alive(connection, _opts \\ []) do
    %{}
    |> method(:get)
    |> url("/health/alive")
    |> Enum.into([])
    |> (&Connection.request(connection, &1)).()
    |> evaluate_response([
      { 200, %OryKetoClient.Model.HealthStatus{}},
      { 500, %OryKetoClient.Model.InlineResponse400{}}
    ])
  end

  @doc """
  Check readiness status
  This endpoint returns a 200 status code when the HTTP server is up running and the environment dependencies (e.g. the database) are responsive as well.  If the service supports TLS Edge Termination, this endpoint does not require the `X-Forwarded-Proto` header to be set.  Be aware that if you are running multiple nodes of this service, the health status will never refer to the cluster state, only to a single instance.

  ## Parameters

  - connection (OryKetoClient.Connection): Connection to server
  - opts (KeywordList): [optional] Optional parameters
  ## Returns

  {:ok, OryKetoClient.Model.HealthStatus.t} on success
  {:error, Tesla.Env.t} on failure
  """
  @spec is_instance_ready(Tesla.Env.client, keyword()) :: {:ok, OryKetoClient.Model.HealthNotReadyStatus.t} | {:ok, OryKetoClient.Model.HealthStatus.t} | {:error, Tesla.Env.t}
  def is_instance_ready(connection, _opts \\ []) do
    %{}
    |> method(:get)
    |> url("/health/ready")
    |> Enum.into([])
    |> (&Connection.request(connection, &1)).()
    |> evaluate_response([
      { 200, %OryKetoClient.Model.HealthStatus{}},
      { 503, %OryKetoClient.Model.HealthNotReadyStatus{}}
    ])
  end
end
