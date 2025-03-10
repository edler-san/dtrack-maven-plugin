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
import com.github.fluorumlabs.dtrack.model.Permission;
import com.github.fluorumlabs.dtrack.model.Team;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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
 * OidcUser
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-03-04T15:50:33.163133100+01:00[Europe/Berlin]", comments = "Generator version: 7.12.0")
public class OidcUser {
  public static final String SERIALIZED_NAME_USERNAME = "username";
  @SerializedName(SERIALIZED_NAME_USERNAME)
  @javax.annotation.Nonnull
  private String username;

  public static final String SERIALIZED_NAME_SUBJECT_IDENTIFIER = "subjectIdentifier";
  @SerializedName(SERIALIZED_NAME_SUBJECT_IDENTIFIER)
  @javax.annotation.Nullable
  private String subjectIdentifier;

  public static final String SERIALIZED_NAME_EMAIL = "email";
  @SerializedName(SERIALIZED_NAME_EMAIL)
  @javax.annotation.Nullable
  private String email;

  public static final String SERIALIZED_NAME_TEAMS = "teams";
  @SerializedName(SERIALIZED_NAME_TEAMS)
  @javax.annotation.Nullable
  private List<Team> teams = new ArrayList<>();

  public static final String SERIALIZED_NAME_PERMISSIONS = "permissions";
  @SerializedName(SERIALIZED_NAME_PERMISSIONS)
  @javax.annotation.Nullable
  private List<Permission> permissions = new ArrayList<>();

  public OidcUser() {
  }

  public OidcUser username(@javax.annotation.Nonnull String username) {
    this.username = username;
    return this;
  }

  /**
   * Get username
   * @return username
   */
  @javax.annotation.Nonnull
  public String getUsername() {
    return username;
  }

  public void setUsername(@javax.annotation.Nonnull String username) {
    this.username = username;
  }


  public OidcUser subjectIdentifier(@javax.annotation.Nullable String subjectIdentifier) {
    this.subjectIdentifier = subjectIdentifier;
    return this;
  }

  /**
   * Get subjectIdentifier
   * @return subjectIdentifier
   */
  @javax.annotation.Nullable
  public String getSubjectIdentifier() {
    return subjectIdentifier;
  }

  public void setSubjectIdentifier(@javax.annotation.Nullable String subjectIdentifier) {
    this.subjectIdentifier = subjectIdentifier;
  }


  public OidcUser email(@javax.annotation.Nullable String email) {
    this.email = email;
    return this;
  }

  /**
   * Get email
   * @return email
   */
  @javax.annotation.Nullable
  public String getEmail() {
    return email;
  }

  public void setEmail(@javax.annotation.Nullable String email) {
    this.email = email;
  }


  public OidcUser teams(@javax.annotation.Nullable List<Team> teams) {
    this.teams = teams;
    return this;
  }

  public OidcUser addTeamsItem(Team teamsItem) {
    if (this.teams == null) {
      this.teams = new ArrayList<>();
    }
    this.teams.add(teamsItem);
    return this;
  }

  /**
   * Get teams
   * @return teams
   */
  @javax.annotation.Nullable
  public List<Team> getTeams() {
    return teams;
  }

  public void setTeams(@javax.annotation.Nullable List<Team> teams) {
    this.teams = teams;
  }


  public OidcUser permissions(@javax.annotation.Nullable List<Permission> permissions) {
    this.permissions = permissions;
    return this;
  }

  public OidcUser addPermissionsItem(Permission permissionsItem) {
    if (this.permissions == null) {
      this.permissions = new ArrayList<>();
    }
    this.permissions.add(permissionsItem);
    return this;
  }

  /**
   * Get permissions
   * @return permissions
   */
  @javax.annotation.Nullable
  public List<Permission> getPermissions() {
    return permissions;
  }

  public void setPermissions(@javax.annotation.Nullable List<Permission> permissions) {
    this.permissions = permissions;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OidcUser oidcUser = (OidcUser) o;
    return Objects.equals(this.username, oidcUser.username) &&
        Objects.equals(this.subjectIdentifier, oidcUser.subjectIdentifier) &&
        Objects.equals(this.email, oidcUser.email) &&
        Objects.equals(this.teams, oidcUser.teams) &&
        Objects.equals(this.permissions, oidcUser.permissions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(username, subjectIdentifier, email, teams, permissions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OidcUser {\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
    sb.append("    subjectIdentifier: ").append(toIndentedString(subjectIdentifier)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    teams: ").append(toIndentedString(teams)).append("\n");
    sb.append("    permissions: ").append(toIndentedString(permissions)).append("\n");
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
    openapiFields.add("username");
    openapiFields.add("subjectIdentifier");
    openapiFields.add("email");
    openapiFields.add("teams");
    openapiFields.add("permissions");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("username");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to OidcUser
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!OidcUser.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in OidcUser is not found in the empty JSON string", OidcUser.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!OidcUser.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `OidcUser` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : OidcUser.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("username").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `username` to be a primitive type in the JSON string but got `%s`", jsonObj.get("username").toString()));
      }
      if ((jsonObj.get("subjectIdentifier") != null && !jsonObj.get("subjectIdentifier").isJsonNull()) && !jsonObj.get("subjectIdentifier").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `subjectIdentifier` to be a primitive type in the JSON string but got `%s`", jsonObj.get("subjectIdentifier").toString()));
      }
      if ((jsonObj.get("email") != null && !jsonObj.get("email").isJsonNull()) && !jsonObj.get("email").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `email` to be a primitive type in the JSON string but got `%s`", jsonObj.get("email").toString()));
      }
      if (jsonObj.get("teams") != null && !jsonObj.get("teams").isJsonNull()) {
        JsonArray jsonArrayteams = jsonObj.getAsJsonArray("teams");
        if (jsonArrayteams != null) {
          // ensure the json data is an array
          if (!jsonObj.get("teams").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `teams` to be an array in the JSON string but got `%s`", jsonObj.get("teams").toString()));
          }

          // validate the optional field `teams` (array)
          for (int i = 0; i < jsonArrayteams.size(); i++) {
            Team.validateJsonElement(jsonArrayteams.get(i));
          };
        }
      }
      if (jsonObj.get("permissions") != null && !jsonObj.get("permissions").isJsonNull()) {
        JsonArray jsonArraypermissions = jsonObj.getAsJsonArray("permissions");
        if (jsonArraypermissions != null) {
          // ensure the json data is an array
          if (!jsonObj.get("permissions").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `permissions` to be an array in the JSON string but got `%s`", jsonObj.get("permissions").toString()));
          }

          // validate the optional field `permissions` (array)
          for (int i = 0; i < jsonArraypermissions.size(); i++) {
            Permission.validateJsonElement(jsonArraypermissions.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!OidcUser.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'OidcUser' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<OidcUser> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(OidcUser.class));

       return (TypeAdapter<T>) new TypeAdapter<OidcUser>() {
           @Override
           public void write(JsonWriter out, OidcUser value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public OidcUser read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of OidcUser given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of OidcUser
   * @throws IOException if the JSON string is invalid with respect to OidcUser
   */
  public static OidcUser fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, OidcUser.class);
  }

  /**
   * Convert an instance of OidcUser to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

