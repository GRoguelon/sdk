/*
 * ORY Oathkeeper
 * ORY Oathkeeper is a reverse proxy that checks the HTTP Authorization for validity against a set of rules. This service uses Hydra to validate access tokens and policies.
 *
 * The version of the OpenAPI document: v0.38.15-beta.1
 * Contact: hi@ory.am
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package sh.ory.oathkeeper.model;

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
import java.util.ArrayList;
import java.util.List;
import sh.ory.oathkeeper.model.RuleHandler;
import sh.ory.oathkeeper.model.RuleMatch;
import sh.ory.oathkeeper.model.Upstream;

/**
 * Rule
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-08-28T18:48:50.365673766Z[Etc/UTC]")
public class Rule {
  public static final String SERIALIZED_NAME_AUTHENTICATORS = "authenticators";
  @SerializedName(SERIALIZED_NAME_AUTHENTICATORS)
  private List<RuleHandler> authenticators = null;

  public static final String SERIALIZED_NAME_AUTHORIZER = "authorizer";
  @SerializedName(SERIALIZED_NAME_AUTHORIZER)
  private RuleHandler authorizer;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_MATCH = "match";
  @SerializedName(SERIALIZED_NAME_MATCH)
  private RuleMatch match;

  public static final String SERIALIZED_NAME_MUTATORS = "mutators";
  @SerializedName(SERIALIZED_NAME_MUTATORS)
  private List<RuleHandler> mutators = null;

  public static final String SERIALIZED_NAME_UPSTREAM = "upstream";
  @SerializedName(SERIALIZED_NAME_UPSTREAM)
  private Upstream upstream;


  public Rule authenticators(List<RuleHandler> authenticators) {
    
    this.authenticators = authenticators;
    return this;
  }

  public Rule addAuthenticatorsItem(RuleHandler authenticatorsItem) {
    if (this.authenticators == null) {
      this.authenticators = new ArrayList<>();
    }
    this.authenticators.add(authenticatorsItem);
    return this;
  }

   /**
   * Authenticators is a list of authentication handlers that will try and authenticate the provided credentials. Authenticators are checked iteratively from index 0 to n and if the first authenticator to return a positive result will be the one used.  If you want the rule to first check a specific authenticator  before \&quot;falling back\&quot; to others, have that authenticator as the first item in the array.
   * @return authenticators
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Authenticators is a list of authentication handlers that will try and authenticate the provided credentials. Authenticators are checked iteratively from index 0 to n and if the first authenticator to return a positive result will be the one used.  If you want the rule to first check a specific authenticator  before \"falling back\" to others, have that authenticator as the first item in the array.")

  public List<RuleHandler> getAuthenticators() {
    return authenticators;
  }


  public void setAuthenticators(List<RuleHandler> authenticators) {
    this.authenticators = authenticators;
  }


  public Rule authorizer(RuleHandler authorizer) {
    
    this.authorizer = authorizer;
    return this;
  }

   /**
   * Get authorizer
   * @return authorizer
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public RuleHandler getAuthorizer() {
    return authorizer;
  }


  public void setAuthorizer(RuleHandler authorizer) {
    this.authorizer = authorizer;
  }


  public Rule description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * Description is a human readable description of this rule.
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Description is a human readable description of this rule.")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public Rule id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * ID is the unique id of the rule. It can be at most 190 characters long, but the layout of the ID is up to you. You will need this ID later on to update or delete the rule.
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "ID is the unique id of the rule. It can be at most 190 characters long, but the layout of the ID is up to you. You will need this ID later on to update or delete the rule.")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public Rule match(RuleMatch match) {
    
    this.match = match;
    return this;
  }

   /**
   * Get match
   * @return match
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public RuleMatch getMatch() {
    return match;
  }


  public void setMatch(RuleMatch match) {
    this.match = match;
  }


  public Rule mutators(List<RuleHandler> mutators) {
    
    this.mutators = mutators;
    return this;
  }

  public Rule addMutatorsItem(RuleHandler mutatorsItem) {
    if (this.mutators == null) {
      this.mutators = new ArrayList<>();
    }
    this.mutators.add(mutatorsItem);
    return this;
  }

   /**
   * Mutators is a list of mutation handlers that transform the HTTP request. A common use case is generating a new set of credentials (e.g. JWT) which then will be forwarded to the upstream server.  Mutations are performed iteratively from index 0 to n and should all succeed in order for the HTTP request to be forwarded.
   * @return mutators
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Mutators is a list of mutation handlers that transform the HTTP request. A common use case is generating a new set of credentials (e.g. JWT) which then will be forwarded to the upstream server.  Mutations are performed iteratively from index 0 to n and should all succeed in order for the HTTP request to be forwarded.")

  public List<RuleHandler> getMutators() {
    return mutators;
  }


  public void setMutators(List<RuleHandler> mutators) {
    this.mutators = mutators;
  }


  public Rule upstream(Upstream upstream) {
    
    this.upstream = upstream;
    return this;
  }

   /**
   * Get upstream
   * @return upstream
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Upstream getUpstream() {
    return upstream;
  }


  public void setUpstream(Upstream upstream) {
    this.upstream = upstream;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Rule rule = (Rule) o;
    return Objects.equals(this.authenticators, rule.authenticators) &&
        Objects.equals(this.authorizer, rule.authorizer) &&
        Objects.equals(this.description, rule.description) &&
        Objects.equals(this.id, rule.id) &&
        Objects.equals(this.match, rule.match) &&
        Objects.equals(this.mutators, rule.mutators) &&
        Objects.equals(this.upstream, rule.upstream);
  }

  @Override
  public int hashCode() {
    return Objects.hash(authenticators, authorizer, description, id, match, mutators, upstream);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Rule {\n");
    sb.append("    authenticators: ").append(toIndentedString(authenticators)).append("\n");
    sb.append("    authorizer: ").append(toIndentedString(authorizer)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    match: ").append(toIndentedString(match)).append("\n");
    sb.append("    mutators: ").append(toIndentedString(mutators)).append("\n");
    sb.append("    upstream: ").append(toIndentedString(upstream)).append("\n");
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

