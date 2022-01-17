# NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
# https://openapi-generator.tech
# Do not edit the class manually.

defmodule OryKetoClient.Api.Write do
  @moduledoc """
  API calls for all endpoints tagged `Write`.
  """

  alias OryKetoClient.Connection
  import OryKetoClient.RequestBuilder


  @doc """
  Create a Relation Tuple
  Use this endpoint to create a relation tuple.

  ## Parameters

  - connection (OryKetoClient.Connection): Connection to server
  - opts (KeywordList): [optional] Optional parameters
    - :body (RelationQuery): 
  ## Returns

  {:ok, OryKetoClient.Model.RelationQuery.t} on success
  {:error, Tesla.Env.t} on failure
  """
  @spec create_relation_tuple(Tesla.Env.client, keyword()) :: {:ok, OryKetoClient.Model.RelationQuery.t} | {:ok, OryKetoClient.Model.InlineResponse400.t} | {:error, Tesla.Env.t}
  def create_relation_tuple(connection, opts \\ []) do
    optional_params = %{
      :body => :body
    }
    %{}
    |> method(:put)
    |> url("/relation-tuples")
    |> add_optional_params(optional_params, opts)
    |> ensure_body()
    |> Enum.into([])
    |> (&Connection.request(connection, &1)).()
    |> evaluate_response([
      { 201, %OryKetoClient.Model.RelationQuery{}},
      { 400, %OryKetoClient.Model.InlineResponse400{}},
      { 500, %OryKetoClient.Model.InlineResponse400{}}
    ])
  end

  @doc """
  Delete a Relation Tuple
  Use this endpoint to delete a relation tuple.

  ## Parameters

  - connection (OryKetoClient.Connection): Connection to server
  - namespace (String.t): Namespace of the Relation Tuple
  - object (String.t): Object of the Relation Tuple
  - relation (String.t): Relation of the Relation Tuple
  - opts (KeywordList): [optional] Optional parameters
    - :subject_id (String.t): SubjectID of the Relation Tuple
    - :subject_set_periodnamespace (String.t): Namespace of the Subject Set
    - :subject_set_periodobject (String.t): Object of the Subject Set
    - :subject_set_periodrelation (String.t): Relation of the Subject Set
  ## Returns

  {:ok, nil} on success
  {:error, Tesla.Env.t} on failure
  """
  @spec delete_relation_tuple(Tesla.Env.client, String.t, String.t, String.t, keyword()) :: {:ok, nil} | {:ok, OryKetoClient.Model.InlineResponse400.t} | {:error, Tesla.Env.t}
  def delete_relation_tuple(connection, namespace, object, relation, opts \\ []) do
    optional_params = %{
      :"subject_id" => :query,
      :"subject_set.namespace" => :query,
      :"subject_set.object" => :query,
      :"subject_set.relation" => :query
    }
    %{}
    |> method(:delete)
    |> url("/relation-tuples")
    |> add_param(:query, :"namespace", namespace)
    |> add_param(:query, :"object", object)
    |> add_param(:query, :"relation", relation)
    |> add_optional_params(optional_params, opts)
    |> Enum.into([])
    |> (&Connection.request(connection, &1)).()
    |> evaluate_response([
      { 204, false},
      { 400, %OryKetoClient.Model.InlineResponse400{}},
      { 500, %OryKetoClient.Model.InlineResponse400{}}
    ])
  end

  @doc """
  Patch Multiple Relation Tuples
  Use this endpoint to patch one or more relation tuples.

  ## Parameters

  - connection (OryKetoClient.Connection): Connection to server
  - opts (KeywordList): [optional] Optional parameters
    - :body ([OryKetoClient.Model.PatchDelta.t]): 
  ## Returns

  {:ok, nil} on success
  {:error, Tesla.Env.t} on failure
  """
  @spec patch_relation_tuples(Tesla.Env.client, keyword()) :: {:ok, nil} | {:ok, OryKetoClient.Model.InlineResponse400.t} | {:error, Tesla.Env.t}
  def patch_relation_tuples(connection, opts \\ []) do
    optional_params = %{
      :body => :body
    }
    %{}
    |> method(:patch)
    |> url("/relation-tuples")
    |> add_optional_params(optional_params, opts)
    |> ensure_body()
    |> Enum.into([])
    |> (&Connection.request(connection, &1)).()
    |> evaluate_response([
      { 204, false},
      { 400, %OryKetoClient.Model.InlineResponse400{}},
      { 404, %OryKetoClient.Model.InlineResponse400{}},
      { 500, %OryKetoClient.Model.InlineResponse400{}}
    ])
  end
end
