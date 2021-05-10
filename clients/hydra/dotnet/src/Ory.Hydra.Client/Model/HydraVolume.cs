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
    /// Volume volume
    /// </summary>
    [DataContract(Name = "Volume")]
    public partial class HydraVolume : IEquatable<HydraVolume>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="HydraVolume" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected HydraVolume()
        {
            this.AdditionalProperties = new Dictionary<string, object>();
        }
        /// <summary>
        /// Initializes a new instance of the <see cref="HydraVolume" /> class.
        /// </summary>
        /// <param name="createdAt">Date/Time the volume was created..</param>
        /// <param name="driver">Name of the volume driver used by the volume. (required).</param>
        /// <param name="labels">User-defined key/value metadata. (required).</param>
        /// <param name="mountpoint">Mount path of the volume on the host. (required).</param>
        /// <param name="name">Name of the volume. (required).</param>
        /// <param name="options">The driver specific options used when creating the volume. (required).</param>
        /// <param name="scope">The level at which the volume exists. Either &#x60;global&#x60; for cluster-wide, or &#x60;local&#x60; for machine level. (required).</param>
        /// <param name="status">Low-level details about the volume, provided by the volume driver. Details are returned as a map with key/value pairs: &#x60;{\&quot;key\&quot;:\&quot;value\&quot;,\&quot;key2\&quot;:\&quot;value2\&quot;}&#x60;.  The &#x60;Status&#x60; field is optional, and is omitted if the volume driver does not support this feature..</param>
        /// <param name="usageData">usageData.</param>
        public HydraVolume(string createdAt = default(string), string driver = default(string), Dictionary<string, string> labels = default(Dictionary<string, string>), string mountpoint = default(string), string name = default(string), Dictionary<string, string> options = default(Dictionary<string, string>), string scope = default(string), Object status = default(Object), HydraVolumeUsageData usageData = default(HydraVolumeUsageData))
        {
            // to ensure "driver" is required (not null)
            this.Driver = driver ?? throw new ArgumentNullException("driver is a required property for HydraVolume and cannot be null");
            // to ensure "labels" is required (not null)
            this.Labels = labels ?? throw new ArgumentNullException("labels is a required property for HydraVolume and cannot be null");
            // to ensure "mountpoint" is required (not null)
            this.Mountpoint = mountpoint ?? throw new ArgumentNullException("mountpoint is a required property for HydraVolume and cannot be null");
            // to ensure "name" is required (not null)
            this.Name = name ?? throw new ArgumentNullException("name is a required property for HydraVolume and cannot be null");
            // to ensure "options" is required (not null)
            this.Options = options ?? throw new ArgumentNullException("options is a required property for HydraVolume and cannot be null");
            // to ensure "scope" is required (not null)
            this.Scope = scope ?? throw new ArgumentNullException("scope is a required property for HydraVolume and cannot be null");
            this.CreatedAt = createdAt;
            this.Status = status;
            this.UsageData = usageData;
            this.AdditionalProperties = new Dictionary<string, object>();
        }

        /// <summary>
        /// Date/Time the volume was created.
        /// </summary>
        /// <value>Date/Time the volume was created.</value>
        [DataMember(Name = "CreatedAt", EmitDefaultValue = false)]
        public string CreatedAt { get; set; }

        /// <summary>
        /// Name of the volume driver used by the volume.
        /// </summary>
        /// <value>Name of the volume driver used by the volume.</value>
        [DataMember(Name = "Driver", IsRequired = true, EmitDefaultValue = false)]
        public string Driver { get; set; }

        /// <summary>
        /// User-defined key/value metadata.
        /// </summary>
        /// <value>User-defined key/value metadata.</value>
        [DataMember(Name = "Labels", IsRequired = true, EmitDefaultValue = false)]
        public Dictionary<string, string> Labels { get; set; }

        /// <summary>
        /// Mount path of the volume on the host.
        /// </summary>
        /// <value>Mount path of the volume on the host.</value>
        [DataMember(Name = "Mountpoint", IsRequired = true, EmitDefaultValue = false)]
        public string Mountpoint { get; set; }

        /// <summary>
        /// Name of the volume.
        /// </summary>
        /// <value>Name of the volume.</value>
        [DataMember(Name = "Name", IsRequired = true, EmitDefaultValue = false)]
        public string Name { get; set; }

        /// <summary>
        /// The driver specific options used when creating the volume.
        /// </summary>
        /// <value>The driver specific options used when creating the volume.</value>
        [DataMember(Name = "Options", IsRequired = true, EmitDefaultValue = false)]
        public Dictionary<string, string> Options { get; set; }

        /// <summary>
        /// The level at which the volume exists. Either &#x60;global&#x60; for cluster-wide, or &#x60;local&#x60; for machine level.
        /// </summary>
        /// <value>The level at which the volume exists. Either &#x60;global&#x60; for cluster-wide, or &#x60;local&#x60; for machine level.</value>
        [DataMember(Name = "Scope", IsRequired = true, EmitDefaultValue = false)]
        public string Scope { get; set; }

        /// <summary>
        /// Low-level details about the volume, provided by the volume driver. Details are returned as a map with key/value pairs: &#x60;{\&quot;key\&quot;:\&quot;value\&quot;,\&quot;key2\&quot;:\&quot;value2\&quot;}&#x60;.  The &#x60;Status&#x60; field is optional, and is omitted if the volume driver does not support this feature.
        /// </summary>
        /// <value>Low-level details about the volume, provided by the volume driver. Details are returned as a map with key/value pairs: &#x60;{\&quot;key\&quot;:\&quot;value\&quot;,\&quot;key2\&quot;:\&quot;value2\&quot;}&#x60;.  The &#x60;Status&#x60; field is optional, and is omitted if the volume driver does not support this feature.</value>
        [DataMember(Name = "Status", EmitDefaultValue = false)]
        public Object Status { get; set; }

        /// <summary>
        /// Gets or Sets UsageData
        /// </summary>
        [DataMember(Name = "UsageData", EmitDefaultValue = false)]
        public HydraVolumeUsageData UsageData { get; set; }

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
            sb.Append("class HydraVolume {\n");
            sb.Append("  CreatedAt: ").Append(CreatedAt).Append("\n");
            sb.Append("  Driver: ").Append(Driver).Append("\n");
            sb.Append("  Labels: ").Append(Labels).Append("\n");
            sb.Append("  Mountpoint: ").Append(Mountpoint).Append("\n");
            sb.Append("  Name: ").Append(Name).Append("\n");
            sb.Append("  Options: ").Append(Options).Append("\n");
            sb.Append("  Scope: ").Append(Scope).Append("\n");
            sb.Append("  Status: ").Append(Status).Append("\n");
            sb.Append("  UsageData: ").Append(UsageData).Append("\n");
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
            return this.Equals(input as HydraVolume);
        }

        /// <summary>
        /// Returns true if HydraVolume instances are equal
        /// </summary>
        /// <param name="input">Instance of HydraVolume to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(HydraVolume input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.CreatedAt == input.CreatedAt ||
                    (this.CreatedAt != null &&
                    this.CreatedAt.Equals(input.CreatedAt))
                ) && 
                (
                    this.Driver == input.Driver ||
                    (this.Driver != null &&
                    this.Driver.Equals(input.Driver))
                ) && 
                (
                    this.Labels == input.Labels ||
                    this.Labels != null &&
                    input.Labels != null &&
                    this.Labels.SequenceEqual(input.Labels)
                ) && 
                (
                    this.Mountpoint == input.Mountpoint ||
                    (this.Mountpoint != null &&
                    this.Mountpoint.Equals(input.Mountpoint))
                ) && 
                (
                    this.Name == input.Name ||
                    (this.Name != null &&
                    this.Name.Equals(input.Name))
                ) && 
                (
                    this.Options == input.Options ||
                    this.Options != null &&
                    input.Options != null &&
                    this.Options.SequenceEqual(input.Options)
                ) && 
                (
                    this.Scope == input.Scope ||
                    (this.Scope != null &&
                    this.Scope.Equals(input.Scope))
                ) && 
                (
                    this.Status == input.Status ||
                    (this.Status != null &&
                    this.Status.Equals(input.Status))
                ) && 
                (
                    this.UsageData == input.UsageData ||
                    (this.UsageData != null &&
                    this.UsageData.Equals(input.UsageData))
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
                if (this.CreatedAt != null)
                    hashCode = hashCode * 59 + this.CreatedAt.GetHashCode();
                if (this.Driver != null)
                    hashCode = hashCode * 59 + this.Driver.GetHashCode();
                if (this.Labels != null)
                    hashCode = hashCode * 59 + this.Labels.GetHashCode();
                if (this.Mountpoint != null)
                    hashCode = hashCode * 59 + this.Mountpoint.GetHashCode();
                if (this.Name != null)
                    hashCode = hashCode * 59 + this.Name.GetHashCode();
                if (this.Options != null)
                    hashCode = hashCode * 59 + this.Options.GetHashCode();
                if (this.Scope != null)
                    hashCode = hashCode * 59 + this.Scope.GetHashCode();
                if (this.Status != null)
                    hashCode = hashCode * 59 + this.Status.GetHashCode();
                if (this.UsageData != null)
                    hashCode = hashCode * 59 + this.UsageData.GetHashCode();
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
