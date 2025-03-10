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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.net.URI;
import java.util.Arrays;

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
 * An RFC 9457 problem object
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-03-04T15:50:33.163133100+01:00[Europe/Berlin]", comments = "Generator version: 7.12.0")
public class ProblemDetails {
  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  @javax.annotation.Nullable
  private URI type;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  @javax.annotation.Nonnull
  private Integer status;

  public static final String SERIALIZED_NAME_TITLE = "title";
  @SerializedName(SERIALIZED_NAME_TITLE)
  @javax.annotation.Nonnull
  private String title;

  public static final String SERIALIZED_NAME_DETAIL = "detail";
  @SerializedName(SERIALIZED_NAME_DETAIL)
  @javax.annotation.Nonnull
  private String detail;

  public static final String SERIALIZED_NAME_INSTANCE = "instance";
  @SerializedName(SERIALIZED_NAME_INSTANCE)
  @javax.annotation.Nullable
  private URI instance;

  public ProblemDetails() {
  }

  public ProblemDetails type(@javax.annotation.Nullable URI type) {
    this.type = type;
    return this;
  }

  /**
   * A URI reference that identifies the problem type
   * @return type
   */
  @javax.annotation.Nullable
  public URI getType() {
    return type;
  }

  public void setType(@javax.annotation.Nullable URI type) {
    this.type = type;
  }


  public ProblemDetails status(@javax.annotation.Nonnull Integer status) {
    this.status = status;
    return this;
  }

  /**
   * HTTP status code generated by the origin server for this occurrence of the problem
   * @return status
   */
  @javax.annotation.Nonnull
  public Integer getStatus() {
    return status;
  }

  public void setStatus(@javax.annotation.Nonnull Integer status) {
    this.status = status;
  }


  public ProblemDetails title(@javax.annotation.Nonnull String title) {
    this.title = title;
    return this;
  }

  /**
   * Short, human-readable summary of the problem type
   * @return title
   */
  @javax.annotation.Nonnull
  public String getTitle() {
    return title;
  }

  public void setTitle(@javax.annotation.Nonnull String title) {
    this.title = title;
  }


  public ProblemDetails detail(@javax.annotation.Nonnull String detail) {
    this.detail = detail;
    return this;
  }

  /**
   * Human-readable explanation specific to this occurrence of the problem
   * @return detail
   */
  @javax.annotation.Nonnull
  public String getDetail() {
    return detail;
  }

  public void setDetail(@javax.annotation.Nonnull String detail) {
    this.detail = detail;
  }


  public ProblemDetails instance(@javax.annotation.Nullable URI instance) {
    this.instance = instance;
    return this;
  }

  /**
   * Reference URI that identifies the specific occurrence of the problem
   * @return instance
   */
  @javax.annotation.Nullable
  public URI getInstance() {
    return instance;
  }

  public void setInstance(@javax.annotation.Nullable URI instance) {
    this.instance = instance;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProblemDetails problemDetails = (ProblemDetails) o;
    return Objects.equals(this.type, problemDetails.type) &&
        Objects.equals(this.status, problemDetails.status) &&
        Objects.equals(this.title, problemDetails.title) &&
        Objects.equals(this.detail, problemDetails.detail) &&
        Objects.equals(this.instance, problemDetails.instance);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, status, title, detail, instance);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProblemDetails {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    detail: ").append(toIndentedString(detail)).append("\n");
    sb.append("    instance: ").append(toIndentedString(instance)).append("\n");
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
    openapiFields.add("type");
    openapiFields.add("status");
    openapiFields.add("title");
    openapiFields.add("detail");
    openapiFields.add("instance");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("status");
    openapiRequiredFields.add("title");
    openapiRequiredFields.add("detail");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to ProblemDetails
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ProblemDetails.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ProblemDetails is not found in the empty JSON string", ProblemDetails.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ProblemDetails.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ProblemDetails` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ProblemDetails.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("type") != null && !jsonObj.get("type").isJsonNull()) && !jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
      if (!jsonObj.get("title").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `title` to be a primitive type in the JSON string but got `%s`", jsonObj.get("title").toString()));
      }
      if (!jsonObj.get("detail").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `detail` to be a primitive type in the JSON string but got `%s`", jsonObj.get("detail").toString()));
      }
      if ((jsonObj.get("instance") != null && !jsonObj.get("instance").isJsonNull()) && !jsonObj.get("instance").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `instance` to be a primitive type in the JSON string but got `%s`", jsonObj.get("instance").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ProblemDetails.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ProblemDetails' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ProblemDetails> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ProblemDetails.class));

       return (TypeAdapter<T>) new TypeAdapter<ProblemDetails>() {
           @Override
           public void write(JsonWriter out, ProblemDetails value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ProblemDetails read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of ProblemDetails given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of ProblemDetails
   * @throws IOException if the JSON string is invalid with respect to ProblemDetails
   */
  public static ProblemDetails fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ProblemDetails.class);
  }

  /**
   * Convert an instance of ProblemDetails to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

