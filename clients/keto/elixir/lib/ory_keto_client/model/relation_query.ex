# NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
# https://openapi-generator.tech
# Do not edit the class manually.

defmodule OryKetoClient.Model.RelationQuery do
  @moduledoc """
  
  """

  @derive [Poison.Encoder]
  defstruct [
    :"namespace",
    :"object",
    :"relation",
    :"subject_id",
    :"subject_set"
  ]

  @type t :: %__MODULE__{
    :"namespace" => String.t,
    :"object" => String.t | nil,
    :"relation" => String.t | nil,
    :"subject_id" => String.t | nil,
    :"subject_set" => OryKetoClient.Model.SubjectSet.t | nil
  }
end

defimpl Poison.Decoder, for: OryKetoClient.Model.RelationQuery do
  import OryKetoClient.Deserializer
  def decode(value, options) do
    value
    |> deserialize(:"subject_set", :struct, OryKetoClient.Model.SubjectSet, options)
  end
end

