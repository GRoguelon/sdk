/*
 * ORY Hydra
 *
 * Welcome to the ORY Hydra HTTP API documentation. You will find documentation for all HTTP APIs here.
 *
 * The version of the OpenAPI document: v1.10.4-alpha.1
 * Generated by: https://github.com/openapitools/openapi-generator.git
 */


using System;
using System.Collections;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Linq;
using System.IO;
using System.Runtime.Serialization;
using System.Text;
using System.Text.RegularExpressions;
using Newtonsoft.Json;
using Newtonsoft.Json.Converters;
using Newtonsoft.Json.Linq;
using System.ComponentModel.DataAnnotations;
using OpenAPIDateConverter = Ory.Hydra.Client.Client.OpenAPIDateConverter;

namespace Ory.Hydra.Client.Model
{
    /// <summary>
    /// PluginConfigRootfs plugin config rootfs
    /// </summary>
    [DataContract(Name = "PluginConfigRootfs")]
    public partial class HydraPluginConfigRootfs : IEquatable<HydraPluginConfigRootfs>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="HydraPluginConfigRootfs" /> class.
        /// </summary>
        /// <param name="diffIds">diff ids.</param>
        /// <param name="type">type.</param>
        public HydraPluginConfigRootfs(List<string> diffIds = default(List<string>), string type = default(string))
        {
            this.DiffIds = diffIds;
            this.Type = type;
            this.AdditionalProperties = new Dictionary<string, object>();
        }

        /// <summary>
        /// diff ids
        /// </summary>
        /// <value>diff ids</value>
        [DataMember(Name = "diff_ids", EmitDefaultValue = false)]
        public List<string> DiffIds { get; set; }

        /// <summary>
        /// type
        /// </summary>
        /// <value>type</value>
        [DataMember(Name = "type", EmitDefaultValue = false)]
        public string Type { get; set; }

        /// <summary>
        /// Gets or Sets additional properties
        /// </summary>
        [JsonExtensionData]
        public IDictionary<string, object> AdditionalProperties { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class HydraPluginConfigRootfs {\n");
            sb.Append("  DiffIds: ").Append(DiffIds).Append("\n");
            sb.Append("  Type: ").Append(Type).Append("\n");
            sb.Append("  AdditionalProperties: ").Append(AdditionalProperties).Append("\n");
            sb.Append("}\n");
            return sb.ToString();
        }

        /// <summary>
        /// Returns the JSON string presentation of the object
        /// </summary>
        /// <returns>JSON string presentation of the object</returns>
        public virtual string ToJson()
        {
            return Newtonsoft.Json.JsonConvert.SerializeObject(this, Newtonsoft.Json.Formatting.Indented);
        }

        /// <summary>
        /// Returns true if objects are equal
        /// </summary>
        /// <param name="input">Object to be compared</param>
        /// <returns>Boolean</returns>
        public override bool Equals(object input)
        {
            return this.Equals(input as HydraPluginConfigRootfs);
        }

        /// <summary>
        /// Returns true if HydraPluginConfigRootfs instances are equal
        /// </summary>
        /// <param name="input">Instance of HydraPluginConfigRootfs to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(HydraPluginConfigRootfs input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.DiffIds == input.DiffIds ||
                    this.DiffIds != null &&
                    input.DiffIds != null &&
                    this.DiffIds.SequenceEqual(input.DiffIds)
                ) && 
                (
                    this.Type == input.Type ||
                    (this.Type != null &&
                    this.Type.Equals(input.Type))
                )
                && (this.AdditionalProperties.Count == input.AdditionalProperties.Count && !this.AdditionalProperties.Except(input.AdditionalProperties).Any());
        }

        /// <summary>
        /// Gets the hash code
        /// </summary>
        /// <returns>Hash code</returns>
        public override int GetHashCode()
        {
            unchecked // Overflow is fine, just wrap
            {
                int hashCode = 41;
                if (this.DiffIds != null)
                    hashCode = hashCode * 59 + this.DiffIds.GetHashCode();
                if (this.Type != null)
                    hashCode = hashCode * 59 + this.Type.GetHashCode();
                if (this.AdditionalProperties != null)
                    hashCode = hashCode * 59 + this.AdditionalProperties.GetHashCode();
                return hashCode;
            }
        }

        /// <summary>
        /// To validate all properties of the instance
        /// </summary>
        /// <param name="validationContext">Validation context</param>
        /// <returns>Validation Result</returns>
        IEnumerable<System.ComponentModel.DataAnnotations.ValidationResult> IValidatableObject.Validate(ValidationContext validationContext)
        {
            yield break;
        }
    }

}
