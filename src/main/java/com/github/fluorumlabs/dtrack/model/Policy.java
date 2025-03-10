/*
 * OWASP Dependency-Track
 * REST API of OWASP Dependency-Track
 *
 * The version of the OpenAPI document: 4.12.6
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.github.fluorumlabs.dtrack.model;

import java.util.Objects;
import com.github.fluorumlabs.dtrack.model.PolicyCondition;
import com.github.fluorumlabs.dtrack.model.Project;
import com.github.fluorumlabs.dtrack.model.Tag;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.github.fluorumlabs.dtrack.JSON;

/**
 * Policy
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-03-04T15:50:33.163133100+01:00[Europe/Berlin]", comments = "Generator version: 7.12.0")
public class Policy {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  @javax.annotation.Nonnull
  private String name;

  /**
   * Gets or Sets operator
   */
  @JsonAdapter(OperatorEnum.Adapter.class)
  public enum OperatorEnum {
    ALL("ALL"),
    
    ANY("ANY");

    private String value;

    OperatorEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static OperatorEnum fromValue(String value) {
      for (OperatorEnum b : OperatorEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<OperatorEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final OperatorEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public OperatorEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return OperatorEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      OperatorEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_OPERATOR = "operator";
  @SerializedName(SERIALIZED_NAME_OPERATOR)
  @javax.annotation.Nonnull
  private OperatorEnum operator;

  /**
   * Gets or Sets violationState
   */
  @JsonAdapter(ViolationStateEnum.Adapter.class)
  public enum ViolationStateEnum {
    INFO("INFO"),
    
    WARN("WARN"),
    
    FAIL("FAIL");

    private String value;

    ViolationStateEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ViolationStateEnum fromValue(String value) {
      for (ViolationStateEnum b : ViolationStateEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<ViolationStateEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ViolationStateEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ViolationStateEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return ViolationStateEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      ViolationStateEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_VIOLATION_STATE = "violationState";
  @SerializedName(SERIALIZED_NAME_VIOLATION_STATE)
  @javax.annotation.Nonnull
  private ViolationStateEnum violationState;

  public static final String SERIALIZED_NAME_POLICY_CONDITIONS = "policyConditions";
  @SerializedName(SERIALIZED_NAME_POLICY_CONDITIONS)
  @javax.annotation.Nullable
  private List<PolicyCondition> policyConditions = new ArrayList<>();

  public static final String SERIALIZED_NAME_PROJECTS = "projects";
  @SerializedName(SERIALIZED_NAME_PROJECTS)
  @javax.annotation.Nullable
  private List<Project> projects = new ArrayList<>();

  public static final String SERIALIZED_NAME_TAGS = "tags";
  @SerializedName(SERIALIZED_NAME_TAGS)
  @javax.annotation.Nullable
  private List<Tag> tags = new ArrayList<>();

  public static final String SERIALIZED_NAME_UUID = "uuid";
  @SerializedName(SERIALIZED_NAME_UUID)
  @javax.annotation.Nonnull
  private UUID uuid;

  public static final String SERIALIZED_NAME_INCLUDE_CHILDREN = "includeChildren";
  @SerializedName(SERIALIZED_NAME_INCLUDE_CHILDREN)
  @javax.annotation.Nullable
  private Boolean includeChildren;

  public static final String SERIALIZED_NAME_ONLY_LATEST_PROJECT_VERSION = "onlyLatestProjectVersion";
  @SerializedName(SERIALIZED_NAME_ONLY_LATEST_PROJECT_VERSION)
  @javax.annotation.Nullable
  private Boolean onlyLatestProjectVersion;

  public static final String SERIALIZED_NAME_GLOBAL = "global";
  @SerializedName(SERIALIZED_NAME_GLOBAL)
  @javax.annotation.Nullable
  private Boolean global;

  public Policy() {
  }

  public Policy name(@javax.annotation.Nonnull String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
   */
  @javax.annotation.Nonnull
  public String getName() {
    return name;
  }

  public void setName(@javax.annotation.Nonnull String name) {
    this.name = name;
  }


  public Policy operator(@javax.annotation.Nonnull OperatorEnum operator) {
    this.operator = operator;
    return this;
  }

  /**
   * Get operator
   * @return operator
   */
  @javax.annotation.Nonnull
  public OperatorEnum getOperator() {
    return operator;
  }

  public void setOperator(@javax.annotation.Nonnull OperatorEnum operator) {
    this.operator = operator;
  }


  public Policy violationState(@javax.annotation.Nonnull ViolationStateEnum violationState) {
    this.violationState = violationState;
    return this;
  }

  /**
   * Get violationState
   * @return violationState
   */
  @javax.annotation.Nonnull
  public ViolationStateEnum getViolationState() {
    return violationState;
  }

  public void setViolationState(@javax.annotation.Nonnull ViolationStateEnum violationState) {
    this.violationState = violationState;
  }


  public Policy policyConditions(@javax.annotation.Nullable List<PolicyCondition> policyConditions) {
    this.policyConditions = policyConditions;
    return this;
  }

  public Policy addPolicyConditionsItem(PolicyCondition policyConditionsItem) {
    if (this.policyConditions == null) {
      this.policyConditions = new ArrayList<>();
    }
    this.policyConditions.add(policyConditionsItem);
    return this;
  }

  /**
   * Get policyConditions
   * @return policyConditions
   */
  @javax.annotation.Nullable
  public List<PolicyCondition> getPolicyConditions() {
    return policyConditions;
  }

  public void setPolicyConditions(@javax.annotation.Nullable List<PolicyCondition> policyConditions) {
    this.policyConditions = policyConditions;
  }


  public Policy projects(@javax.annotation.Nullable List<Project> projects) {
    this.projects = projects;
    return this;
  }

  public Policy addProjectsItem(Project projectsItem) {
    if (this.projects == null) {
      this.projects = new ArrayList<>();
    }
    this.projects.add(projectsItem);
    return this;
  }

  /**
   * Get projects
   * @return projects
   */
  @javax.annotation.Nullable
  public List<Project> getProjects() {
    return projects;
  }

  public void setProjects(@javax.annotation.Nullable List<Project> projects) {
    this.projects = projects;
  }


  public Policy tags(@javax.annotation.Nullable List<Tag> tags) {
    this.tags = tags;
    return this;
  }

  public Policy addTagsItem(Tag tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<>();
    }
    this.tags.add(tagsItem);
    return this;
  }

  /**
   * Get tags
   * @return tags
   */
  @javax.annotation.Nullable
  public List<Tag> getTags() {
    return tags;
  }

  public void setTags(@javax.annotation.Nullable List<Tag> tags) {
    this.tags = tags;
  }


  public Policy uuid(@javax.annotation.Nonnull UUID uuid) {
    this.uuid = uuid;
    return this;
  }

  /**
   * Get uuid
   * @return uuid
   */
  @javax.annotation.Nonnull
  public UUID getUuid() {
    return uuid;
  }

  public void setUuid(@javax.annotation.Nonnull UUID uuid) {
    this.uuid = uuid;
  }


  public Policy includeChildren(@javax.annotation.Nullable Boolean includeChildren) {
    this.includeChildren = includeChildren;
    return this;
  }

  /**
   * Get includeChildren
   * @return includeChildren
   */
  @javax.annotation.Nullable
  public Boolean getIncludeChildren() {
    return includeChildren;
  }

  public void setIncludeChildren(@javax.annotation.Nullable Boolean includeChildren) {
    this.includeChildren = includeChildren;
  }


  public Policy onlyLatestProjectVersion(@javax.annotation.Nullable Boolean onlyLatestProjectVersion) {
    this.onlyLatestProjectVersion = onlyLatestProjectVersion;
    return this;
  }

  /**
   * Get onlyLatestProjectVersion
   * @return onlyLatestProjectVersion
   */
  @javax.annotation.Nullable
  public Boolean getOnlyLatestProjectVersion() {
    return onlyLatestProjectVersion;
  }

  public void setOnlyLatestProjectVersion(@javax.annotation.Nullable Boolean onlyLatestProjectVersion) {
    this.onlyLatestProjectVersion = onlyLatestProjectVersion;
  }


  public Policy global(@javax.annotation.Nullable Boolean global) {
    this.global = global;
    return this;
  }

  /**
   * Get global
   * @return global
   */
  @javax.annotation.Nullable
  public Boolean getGlobal() {
    return global;
  }

  public void setGlobal(@javax.annotation.Nullable Boolean global) {
    this.global = global;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Policy policy = (Policy) o;
    return Objects.equals(this.name, policy.name) &&
        Objects.equals(this.operator, policy.operator) &&
        Objects.equals(this.violationState, policy.violationState) &&
        Objects.equals(this.policyConditions, policy.policyConditions) &&
        Objects.equals(this.projects, policy.projects) &&
        Objects.equals(this.tags, policy.tags) &&
        Objects.equals(this.uuid, policy.uuid) &&
        Objects.equals(this.includeChildren, policy.includeChildren) &&
        Objects.equals(this.onlyLatestProjectVersion, policy.onlyLatestProjectVersion) &&
        Objects.equals(this.global, policy.global);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, operator, violationState, policyConditions, projects, tags, uuid, includeChildren, onlyLatestProjectVersion, global);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Policy {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    operator: ").append(toIndentedString(operator)).append("\n");
    sb.append("    violationState: ").append(toIndentedString(violationState)).append("\n");
    sb.append("    policyConditions: ").append(toIndentedString(policyConditions)).append("\n");
    sb.append("    projects: ").append(toIndentedString(projects)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
    sb.append("    includeChildren: ").append(toIndentedString(includeChildren)).append("\n");
    sb.append("    onlyLatestProjectVersion: ").append(toIndentedString(onlyLatestProjectVersion)).append("\n");
    sb.append("    global: ").append(toIndentedString(global)).append("\n");
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


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("name");
    openapiFields.add("operator");
    openapiFields.add("violationState");
    openapiFields.add("policyConditions");
    openapiFields.add("projects");
    openapiFields.add("tags");
    openapiFields.add("uuid");
    openapiFields.add("includeChildren");
    openapiFields.add("onlyLatestProjectVersion");
    openapiFields.add("global");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("name");
    openapiRequiredFields.add("operator");
    openapiRequiredFields.add("violationState");
    openapiRequiredFields.add("uuid");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to Policy
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Policy.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Policy is not found in the empty JSON string", Policy.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Policy.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Policy` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : Policy.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if (!jsonObj.get("operator").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `operator` to be a primitive type in the JSON string but got `%s`", jsonObj.get("operator").toString()));
      }
      // validate the required field `operator`
      OperatorEnum.validateJsonElement(jsonObj.get("operator"));
      if (!jsonObj.get("violationState").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `violationState` to be a primitive type in the JSON string but got `%s`", jsonObj.get("violationState").toString()));
      }
      // validate the required field `violationState`
      ViolationStateEnum.validateJsonElement(jsonObj.get("violationState"));
      if (jsonObj.get("policyConditions") != null && !jsonObj.get("policyConditions").isJsonNull()) {
        JsonArray jsonArraypolicyConditions = jsonObj.getAsJsonArray("policyConditions");
        if (jsonArraypolicyConditions != null) {
          // ensure the json data is an array
          if (!jsonObj.get("policyConditions").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `policyConditions` to be an array in the JSON string but got `%s`", jsonObj.get("policyConditions").toString()));
          }

          // validate the optional field `policyConditions` (array)
          for (int i = 0; i < jsonArraypolicyConditions.size(); i++) {
            PolicyCondition.validateJsonElement(jsonArraypolicyConditions.get(i));
          };
        }
      }
      if (jsonObj.get("projects") != null && !jsonObj.get("projects").isJsonNull()) {
        JsonArray jsonArrayprojects = jsonObj.getAsJsonArray("projects");
        if (jsonArrayprojects != null) {
          // ensure the json data is an array
          if (!jsonObj.get("projects").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `projects` to be an array in the JSON string but got `%s`", jsonObj.get("projects").toString()));
          }

          // validate the optional field `projects` (array)
          for (int i = 0; i < jsonArrayprojects.size(); i++) {
            Project.validateJsonElement(jsonArrayprojects.get(i));
          };
        }
      }
      if (jsonObj.get("tags") != null && !jsonObj.get("tags").isJsonNull()) {
        JsonArray jsonArraytags = jsonObj.getAsJsonArray("tags");
        if (jsonArraytags != null) {
          // ensure the json data is an array
          if (!jsonObj.get("tags").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `tags` to be an array in the JSON string but got `%s`", jsonObj.get("tags").toString()));
          }

          // validate the optional field `tags` (array)
          for (int i = 0; i < jsonArraytags.size(); i++) {
            Tag.validateJsonElement(jsonArraytags.get(i));
          };
        }
      }
      if (!jsonObj.get("uuid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `uuid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("uuid").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Policy.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Policy' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Policy> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Policy.class));

       return (TypeAdapter<T>) new TypeAdapter<Policy>() {
           @Override
           public void write(JsonWriter out, Policy value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Policy read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of Policy given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of Policy
   * @throws IOException if the JSON string is invalid with respect to Policy
   */
  public static Policy fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Policy.class);
  }

  /**
   * Convert an instance of Policy to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

