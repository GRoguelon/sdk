/*
 * ORY Hydra
 * Welcome to the ORY Hydra HTTP API documentation. You will find documentation for all HTTP APIs here.
 *
 * The version of the OpenAPI document: v1.10.4-alpha.1
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package sh.ory.hydra.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import sh.ory.hydra.model.VolumeUsageData;

/**
 * Volume volume
 */
@ApiModel(description = "Volume volume")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-05-10T19:45:37.207961+02:00[Europe/Berlin]")
public class Volume {
  public static final String SERIALIZED_NAME_CREATED_AT = "CreatedAt";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private String createdAt;

  public static final String SERIALIZED_NAME_DRIVER = "Driver";
  @SerializedName(SERIALIZED_NAME_DRIVER)
  private String driver;

  public static final String SERIALIZED_NAME_LABELS = "Labels";
  @SerializedName(SERIALIZED_NAME_LABELS)
  private Map<String, String> labels = new HashMap<>();

  public static final String SERIALIZED_NAME_MOUNTPOINT = "Mountpoint";
  @SerializedName(SERIALIZED_NAME_MOUNTPOINT)
  private String mountpoint;

  public static final String SERIALIZED_NAME_NAME = "Name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_OPTIONS = "Options";
  @SerializedName(SERIALIZED_NAME_OPTIONS)
  private Map<String, String> options = new HashMap<>();

  public static final String SERIALIZED_NAME_SCOPE = "Scope";
  @SerializedName(SERIALIZED_NAME_SCOPE)
  private String scope;

  public static final String SERIALIZED_NAME_STATUS = "Status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private Object status;

  public static final String SERIALIZED_NAME_USAGE_DATA = "UsageData";
  @SerializedName(SERIALIZED_NAME_USAGE_DATA)
  private VolumeUsageData usageData;


  public Volume createdAt(String createdAt) {
    
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Date/Time the volume was created.
   * @return createdAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Date/Time the volume was created.")

  public String getCreatedAt() {
    return createdAt;
  }


  public void setCreatedAt(String createdAt) {
    this.createdAt = createdAt;
  }


  public Volume driver(String driver) {
    
    this.driver = driver;
    return this;
  }

   /**
   * Name of the volume driver used by the volume.
   * @return driver
  **/
  @ApiModelProperty(required = true, value = "Name of the volume driver used by the volume.")

  public String getDriver() {
    return driver;
  }


  public void setDriver(String driver) {
    this.driver = driver;
  }


  public Volume labels(Map<String, String> labels) {
    
    this.labels = labels;
    return this;
  }

  public Volume putLabelsItem(String key, String labelsItem) {
    this.labels.put(key, labelsItem);
    return this;
  }

   /**
   * User-defined key/value metadata.
   * @return labels
  **/
  @ApiModelProperty(required = true, value = "User-defined key/value metadata.")

  public Map<String, String> getLabels() {
    return labels;
  }


  public void setLabels(Map<String, String> labels) {
    this.labels = labels;
  }


  public Volume mountpoint(String mountpoint) {
    
    this.mountpoint = mountpoint;
    return this;
  }

   /**
   * Mount path of the volume on the host.
   * @return mountpoint
  **/
  @ApiModelProperty(required = true, value = "Mount path of the volume on the host.")

  public String getMountpoint() {
    return mountpoint;
  }


  public void setMountpoint(String mountpoint) {
    this.mountpoint = mountpoint;
  }


  public Volume name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Name of the volume.
   * @return name
  **/
  @ApiModelProperty(required = true, value = "Name of the volume.")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public Volume options(Map<String, String> options) {
    
    this.options = options;
    return this;
  }

  public Volume putOptionsItem(String key, String optionsItem) {
    this.options.put(key, optionsItem);
    return this;
  }

   /**
   * The driver specific options used when creating the volume.
   * @return options
  **/
  @ApiModelProperty(required = true, value = "The driver specific options used when creating the volume.")

  public Map<String, String> getOptions() {
    return options;
  }


  public void setOptions(Map<String, String> options) {
    this.options = options;
  }


  public Volume scope(String scope) {
    
    this.scope = scope;
    return this;
  }

   /**
   * The level at which the volume exists. Either &#x60;global&#x60; for cluster-wide, or &#x60;local&#x60; for machine level.
   * @return scope
  **/
  @ApiModelProperty(required = true, value = "The level at which the volume exists. Either `global` for cluster-wide, or `local` for machine level.")

  public String getScope() {
    return scope;
  }


  public void setScope(String scope) {
    this.scope = scope;
  }


  public Volume status(Object status) {
    
    this.status = status;
    return this;
  }

   /**
   * Low-level details about the volume, provided by the volume driver. Details are returned as a map with key/value pairs: &#x60;{\&quot;key\&quot;:\&quot;value\&quot;,\&quot;key2\&quot;:\&quot;value2\&quot;}&#x60;.  The &#x60;Status&#x60; field is optional, and is omitted if the volume driver does not support this feature.
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Low-level details about the volume, provided by the volume driver. Details are returned as a map with key/value pairs: `{\"key\":\"value\",\"key2\":\"value2\"}`.  The `Status` field is optional, and is omitted if the volume driver does not support this feature.")

  public Object getStatus() {
    return status;
  }


  public void setStatus(Object status) {
    this.status = status;
  }


  public Volume usageData(VolumeUsageData usageData) {
    
    this.usageData = usageData;
    return this;
  }

   /**
   * Get usageData
   * @return usageData
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public VolumeUsageData getUsageData() {
    return usageData;
  }


  public void setUsageData(VolumeUsageData usageData) {
    this.usageData = usageData;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Volume volume = (Volume) o;
    return Objects.equals(this.createdAt, volume.createdAt) &&
        Objects.equals(this.driver, volume.driver) &&
        Objects.equals(this.labels, volume.labels) &&
        Objects.equals(this.mountpoint, volume.mountpoint) &&
        Objects.equals(this.name, volume.name) &&
        Objects.equals(this.options, volume.options) &&
        Objects.equals(this.scope, volume.scope) &&
        Objects.equals(this.status, volume.status) &&
        Objects.equals(this.usageData, volume.usageData);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createdAt, driver, labels, mountpoint, name, options, scope, status, usageData);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Volume {\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    driver: ").append(toIndentedString(driver)).append("\n");
    sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
    sb.append("    mountpoint: ").append(toIndentedString(mountpoint)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    options: ").append(toIndentedString(options)).append("\n");
    sb.append("    scope: ").append(toIndentedString(scope)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    usageData: ").append(toIndentedString(usageData)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

