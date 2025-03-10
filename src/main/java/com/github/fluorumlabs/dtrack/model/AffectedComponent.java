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
import com.github.fluorumlabs.dtrack.model.AffectedVersionAttribution;
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
 * AffectedComponent
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-03-04T15:50:33.163133100+01:00[Europe/Berlin]", comments = "Generator version: 7.12.0")
public class AffectedComponent {
  /**
   * Gets or Sets identityType
   */
  @JsonAdapter(IdentityTypeEnum.Adapter.class)
  public enum IdentityTypeEnum {
    CPE("CPE"),
    
    PURL("PURL");

    private String value;

    IdentityTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static IdentityTypeEnum fromValue(String value) {
      for (IdentityTypeEnum b : IdentityTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<IdentityTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final IdentityTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public IdentityTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return IdentityTypeEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      IdentityTypeEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_IDENTITY_TYPE = "identityType";
  @SerializedName(SERIALIZED_NAME_IDENTITY_TYPE)
  @javax.annotation.Nullable
  private IdentityTypeEnum identityType;

  public static final String SERIALIZED_NAME_IDENTITY = "identity";
  @SerializedName(SERIALIZED_NAME_IDENTITY)
  @javax.annotation.Nullable
  private String identity;

  /**
   * Gets or Sets versionType
   */
  @JsonAdapter(VersionTypeEnum.Adapter.class)
  public enum VersionTypeEnum {
    EXACT("EXACT"),
    
    RANGE("RANGE");

    private String value;

    VersionTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static VersionTypeEnum fromValue(String value) {
      for (VersionTypeEnum b : VersionTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<VersionTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final VersionTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public VersionTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return VersionTypeEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      VersionTypeEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_VERSION_TYPE = "versionType";
  @SerializedName(SERIALIZED_NAME_VERSION_TYPE)
  @javax.annotation.Nullable
  private VersionTypeEnum versionType;

  public static final String SERIALIZED_NAME_VERSION = "version";
  @SerializedName(SERIALIZED_NAME_VERSION)
  @javax.annotation.Nullable
  private String version;

  public static final String SERIALIZED_NAME_VERSION_END_EXCLUDING = "versionEndExcluding";
  @SerializedName(SERIALIZED_NAME_VERSION_END_EXCLUDING)
  @javax.annotation.Nullable
  private String versionEndExcluding;

  public static final String SERIALIZED_NAME_VERSION_END_INCLUDING = "versionEndIncluding";
  @SerializedName(SERIALIZED_NAME_VERSION_END_INCLUDING)
  @javax.annotation.Nullable
  private String versionEndIncluding;

  public static final String SERIALIZED_NAME_VERSION_START_EXCLUDING = "versionStartExcluding";
  @SerializedName(SERIALIZED_NAME_VERSION_START_EXCLUDING)
  @javax.annotation.Nullable
  private String versionStartExcluding;

  public static final String SERIALIZED_NAME_VERSION_START_INCLUDING = "versionStartIncluding";
  @SerializedName(SERIALIZED_NAME_VERSION_START_INCLUDING)
  @javax.annotation.Nullable
  private String versionStartIncluding;

  public static final String SERIALIZED_NAME_UUID = "uuid";
  @SerializedName(SERIALIZED_NAME_UUID)
  @javax.annotation.Nullable
  private UUID uuid;

  public static final String SERIALIZED_NAME_AFFECTED_VERSION_ATTRIBUTIONS = "affectedVersionAttributions";
  @SerializedName(SERIALIZED_NAME_AFFECTED_VERSION_ATTRIBUTIONS)
  @javax.annotation.Nullable
  private List<AffectedVersionAttribution> affectedVersionAttributions = new ArrayList<>();

  public AffectedComponent() {
  }

  public AffectedComponent identityType(@javax.annotation.Nullable IdentityTypeEnum identityType) {
    this.identityType = identityType;
    return this;
  }

  /**
   * Get identityType
   * @return identityType
   */
  @javax.annotation.Nullable
  public IdentityTypeEnum getIdentityType() {
    return identityType;
  }

  public void setIdentityType(@javax.annotation.Nullable IdentityTypeEnum identityType) {
    this.identityType = identityType;
  }


  public AffectedComponent identity(@javax.annotation.Nullable String identity) {
    this.identity = identity;
    return this;
  }

  /**
   * Get identity
   * @return identity
   */
  @javax.annotation.Nullable
  public String getIdentity() {
    return identity;
  }

  public void setIdentity(@javax.annotation.Nullable String identity) {
    this.identity = identity;
  }


  public AffectedComponent versionType(@javax.annotation.Nullable VersionTypeEnum versionType) {
    this.versionType = versionType;
    return this;
  }

  /**
   * Get versionType
   * @return versionType
   */
  @javax.annotation.Nullable
  public VersionTypeEnum getVersionType() {
    return versionType;
  }

  public void setVersionType(@javax.annotation.Nullable VersionTypeEnum versionType) {
    this.versionType = versionType;
  }


  public AffectedComponent version(@javax.annotation.Nullable String version) {
    this.version = version;
    return this;
  }

  /**
   * Get version
   * @return version
   */
  @javax.annotation.Nullable
  public String getVersion() {
    return version;
  }

  public void setVersion(@javax.annotation.Nullable String version) {
    this.version = version;
  }


  public AffectedComponent versionEndExcluding(@javax.annotation.Nullable String versionEndExcluding) {
    this.versionEndExcluding = versionEndExcluding;
    return this;
  }

  /**
   * Get versionEndExcluding
   * @return versionEndExcluding
   */
  @javax.annotation.Nullable
  public String getVersionEndExcluding() {
    return versionEndExcluding;
  }

  public void setVersionEndExcluding(@javax.annotation.Nullable String versionEndExcluding) {
    this.versionEndExcluding = versionEndExcluding;
  }


  public AffectedComponent versionEndIncluding(@javax.annotation.Nullable String versionEndIncluding) {
    this.versionEndIncluding = versionEndIncluding;
    return this;
  }

  /**
   * Get versionEndIncluding
   * @return versionEndIncluding
   */
  @javax.annotation.Nullable
  public String getVersionEndIncluding() {
    return versionEndIncluding;
  }

  public void setVersionEndIncluding(@javax.annotation.Nullable String versionEndIncluding) {
    this.versionEndIncluding = versionEndIncluding;
  }


  public AffectedComponent versionStartExcluding(@javax.annotation.Nullable String versionStartExcluding) {
    this.versionStartExcluding = versionStartExcluding;
    return this;
  }

  /**
   * Get versionStartExcluding
   * @return versionStartExcluding
   */
  @javax.annotation.Nullable
  public String getVersionStartExcluding() {
    return versionStartExcluding;
  }

  public void setVersionStartExcluding(@javax.annotation.Nullable String versionStartExcluding) {
    this.versionStartExcluding = versionStartExcluding;
  }


  public AffectedComponent versionStartIncluding(@javax.annotation.Nullable String versionStartIncluding) {
    this.versionStartIncluding = versionStartIncluding;
    return this;
  }

  /**
   * Get versionStartIncluding
   * @return versionStartIncluding
   */
  @javax.annotation.Nullable
  public String getVersionStartIncluding() {
    return versionStartIncluding;
  }

  public void setVersionStartIncluding(@javax.annotation.Nullable String versionStartIncluding) {
    this.versionStartIncluding = versionStartIncluding;
  }


  public AffectedComponent uuid(@javax.annotation.Nullable UUID uuid) {
    this.uuid = uuid;
    return this;
  }

  /**
   * Get uuid
   * @return uuid
   */
  @javax.annotation.Nullable
  public UUID getUuid() {
    return uuid;
  }

  public void setUuid(@javax.annotation.Nullable UUID uuid) {
    this.uuid = uuid;
  }


  public AffectedComponent affectedVersionAttributions(@javax.annotation.Nullable List<AffectedVersionAttribution> affectedVersionAttributions) {
    this.affectedVersionAttributions = affectedVersionAttributions;
    return this;
  }

  public AffectedComponent addAffectedVersionAttributionsItem(AffectedVersionAttribution affectedVersionAttributionsItem) {
    if (this.affectedVersionAttributions == null) {
      this.affectedVersionAttributions = new ArrayList<>();
    }
    this.affectedVersionAttributions.add(affectedVersionAttributionsItem);
    return this;
  }

  /**
   * Get affectedVersionAttributions
   * @return affectedVersionAttributions
   */
  @javax.annotation.Nullable
  public List<AffectedVersionAttribution> getAffectedVersionAttributions() {
    return affectedVersionAttributions;
  }

  public void setAffectedVersionAttributions(@javax.annotation.Nullable List<AffectedVersionAttribution> affectedVersionAttributions) {
    this.affectedVersionAttributions = affectedVersionAttributions;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AffectedComponent affectedComponent = (AffectedComponent) o;
    return Objects.equals(this.identityType, affectedComponent.identityType) &&
        Objects.equals(this.identity, affectedComponent.identity) &&
        Objects.equals(this.versionType, affectedComponent.versionType) &&
        Objects.equals(this.version, affectedComponent.version) &&
        Objects.equals(this.versionEndExcluding, affectedComponent.versionEndExcluding) &&
        Objects.equals(this.versionEndIncluding, affectedComponent.versionEndIncluding) &&
        Objects.equals(this.versionStartExcluding, affectedComponent.versionStartExcluding) &&
        Objects.equals(this.versionStartIncluding, affectedComponent.versionStartIncluding) &&
        Objects.equals(this.uuid, affectedComponent.uuid) &&
        Objects.equals(this.affectedVersionAttributions, affectedComponent.affectedVersionAttributions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(identityType, identity, versionType, version, versionEndExcluding, versionEndIncluding, versionStartExcluding, versionStartIncluding, uuid, affectedVersionAttributions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AffectedComponent {\n");
    sb.append("    identityType: ").append(toIndentedString(identityType)).append("\n");
    sb.append("    identity: ").append(toIndentedString(identity)).append("\n");
    sb.append("    versionType: ").append(toIndentedString(versionType)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    versionEndExcluding: ").append(toIndentedString(versionEndExcluding)).append("\n");
    sb.append("    versionEndIncluding: ").append(toIndentedString(versionEndIncluding)).append("\n");
    sb.append("    versionStartExcluding: ").append(toIndentedString(versionStartExcluding)).append("\n");
    sb.append("    versionStartIncluding: ").append(toIndentedString(versionStartIncluding)).append("\n");
    sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
    sb.append("    affectedVersionAttributions: ").append(toIndentedString(affectedVersionAttributions)).append("\n");
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
    openapiFields.add("identityType");
    openapiFields.add("identity");
    openapiFields.add("versionType");
    openapiFields.add("version");
    openapiFields.add("versionEndExcluding");
    openapiFields.add("versionEndIncluding");
    openapiFields.add("versionStartExcluding");
    openapiFields.add("versionStartIncluding");
    openapiFields.add("uuid");
    openapiFields.add("affectedVersionAttributions");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to AffectedComponent
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!AffectedComponent.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AffectedComponent is not found in the empty JSON string", AffectedComponent.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!AffectedComponent.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AffectedComponent` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("identityType") != null && !jsonObj.get("identityType").isJsonNull()) && !jsonObj.get("identityType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `identityType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("identityType").toString()));
      }
      // validate the optional field `identityType`
      if (jsonObj.get("identityType") != null && !jsonObj.get("identityType").isJsonNull()) {
        IdentityTypeEnum.validateJsonElement(jsonObj.get("identityType"));
      }
      if ((jsonObj.get("identity") != null && !jsonObj.get("identity").isJsonNull()) && !jsonObj.get("identity").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `identity` to be a primitive type in the JSON string but got `%s`", jsonObj.get("identity").toString()));
      }
      if ((jsonObj.get("versionType") != null && !jsonObj.get("versionType").isJsonNull()) && !jsonObj.get("versionType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `versionType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("versionType").toString()));
      }
      // validate the optional field `versionType`
      if (jsonObj.get("versionType") != null && !jsonObj.get("versionType").isJsonNull()) {
        VersionTypeEnum.validateJsonElement(jsonObj.get("versionType"));
      }
      if ((jsonObj.get("version") != null && !jsonObj.get("version").isJsonNull()) && !jsonObj.get("version").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `version` to be a primitive type in the JSON string but got `%s`", jsonObj.get("version").toString()));
      }
      if ((jsonObj.get("versionEndExcluding") != null && !jsonObj.get("versionEndExcluding").isJsonNull()) && !jsonObj.get("versionEndExcluding").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `versionEndExcluding` to be a primitive type in the JSON string but got `%s`", jsonObj.get("versionEndExcluding").toString()));
      }
      if ((jsonObj.get("versionEndIncluding") != null && !jsonObj.get("versionEndIncluding").isJsonNull()) && !jsonObj.get("versionEndIncluding").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `versionEndIncluding` to be a primitive type in the JSON string but got `%s`", jsonObj.get("versionEndIncluding").toString()));
      }
      if ((jsonObj.get("versionStartExcluding") != null && !jsonObj.get("versionStartExcluding").isJsonNull()) && !jsonObj.get("versionStartExcluding").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `versionStartExcluding` to be a primitive type in the JSON string but got `%s`", jsonObj.get("versionStartExcluding").toString()));
      }
      if ((jsonObj.get("versionStartIncluding") != null && !jsonObj.get("versionStartIncluding").isJsonNull()) && !jsonObj.get("versionStartIncluding").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `versionStartIncluding` to be a primitive type in the JSON string but got `%s`", jsonObj.get("versionStartIncluding").toString()));
      }
      if ((jsonObj.get("uuid") != null && !jsonObj.get("uuid").isJsonNull()) && !jsonObj.get("uuid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `uuid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("uuid").toString()));
      }
      if (jsonObj.get("affectedVersionAttributions") != null && !jsonObj.get("affectedVersionAttributions").isJsonNull()) {
        JsonArray jsonArrayaffectedVersionAttributions = jsonObj.getAsJsonArray("affectedVersionAttributions");
        if (jsonArrayaffectedVersionAttributions != null) {
          // ensure the json data is an array
          if (!jsonObj.get("affectedVersionAttributions").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `affectedVersionAttributions` to be an array in the JSON string but got `%s`", jsonObj.get("affectedVersionAttributions").toString()));
          }

          // validate the optional field `affectedVersionAttributions` (array)
          for (int i = 0; i < jsonArrayaffectedVersionAttributions.size(); i++) {
            AffectedVersionAttribution.validateJsonElement(jsonArrayaffectedVersionAttributions.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AffectedComponent.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AffectedComponent' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AffectedComponent> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AffectedComponent.class));

       return (TypeAdapter<T>) new TypeAdapter<AffectedComponent>() {
           @Override
           public void write(JsonWriter out, AffectedComponent value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AffectedComponent read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of AffectedComponent given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of AffectedComponent
   * @throws IOException if the JSON string is invalid with respect to AffectedComponent
   */
  public static AffectedComponent fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AffectedComponent.class);
  }

  /**
   * Convert an instance of AffectedComponent to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

