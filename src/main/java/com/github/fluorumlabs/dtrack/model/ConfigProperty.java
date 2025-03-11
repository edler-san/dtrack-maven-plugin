/*
 * OWASP Dependency-Track
 * REST API of OWASP Dependency-Track
 *
 * OpenAPI spec version: 4.12.6
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.github.fluorumlabs.dtrack.model;

import java.io.IOException;
import java.util.Objects;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

import io.swagger.v3.oas.annotations.media.Schema;
/**
 * ConfigProperty
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2025-03-11T11:08:28.654737800+01:00[Europe/Berlin]")

public class ConfigProperty {
  @SerializedName("groupName")
  private String groupName = null;

  @SerializedName("propertyName")
  private String propertyName = null;

  @SerializedName("propertyValue")
  private String propertyValue = null;

  /**
   * Gets or Sets propertyType
   */
  @JsonAdapter(PropertyTypeEnum.Adapter.class)
  public enum PropertyTypeEnum {
    @SerializedName("BOOLEAN")
    BOOLEAN("BOOLEAN"),
    @SerializedName("INTEGER")
    INTEGER("INTEGER"),
    @SerializedName("NUMBER")
    NUMBER("NUMBER"),
    @SerializedName("STRING")
    STRING("STRING"),
    @SerializedName("ENCRYPTEDSTRING")
    ENCRYPTEDSTRING("ENCRYPTEDSTRING"),
    @SerializedName("TIMESTAMP")
    TIMESTAMP("TIMESTAMP"),
    @SerializedName("URL")
    URL("URL"),
    @SerializedName("UUID")
    UUID("UUID");

    private String value;

    PropertyTypeEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static PropertyTypeEnum fromValue(String input) {
      for (PropertyTypeEnum b : PropertyTypeEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<PropertyTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final PropertyTypeEnum enumeration) throws IOException {
        jsonWriter.value(String.valueOf(enumeration.getValue()));
      }

      @Override
      public PropertyTypeEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return PropertyTypeEnum.fromValue((String)(value));
      }
    }
  }  @SerializedName("propertyType")
  private PropertyTypeEnum propertyType = null;

  @SerializedName("description")
  private String description = null;

  public ConfigProperty groupName(String groupName) {
    this.groupName = groupName;
    return this;
  }

   /**
   * Get groupName
   * @return groupName
  **/
  @Schema(required = true, description = "")
  public String getGroupName() {
    return groupName;
  }

  public void setGroupName(String groupName) {
    this.groupName = groupName;
  }

  public ConfigProperty propertyName(String propertyName) {
    this.propertyName = propertyName;
    return this;
  }

   /**
   * Get propertyName
   * @return propertyName
  **/
  @Schema(required = true, description = "")
  public String getPropertyName() {
    return propertyName;
  }

  public void setPropertyName(String propertyName) {
    this.propertyName = propertyName;
  }

  public ConfigProperty propertyValue(String propertyValue) {
    this.propertyValue = propertyValue;
    return this;
  }

   /**
   * Get propertyValue
   * @return propertyValue
  **/
  @Schema(description = "")
  public String getPropertyValue() {
    return propertyValue;
  }

  public void setPropertyValue(String propertyValue) {
    this.propertyValue = propertyValue;
  }

  public ConfigProperty propertyType(PropertyTypeEnum propertyType) {
    this.propertyType = propertyType;
    return this;
  }

   /**
   * Get propertyType
   * @return propertyType
  **/
  @Schema(required = true, description = "")
  public PropertyTypeEnum getPropertyType() {
    return propertyType;
  }

  public void setPropertyType(PropertyTypeEnum propertyType) {
    this.propertyType = propertyType;
  }

  public ConfigProperty description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @Schema(description = "")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConfigProperty configProperty = (ConfigProperty) o;
    return Objects.equals(this.groupName, configProperty.groupName) &&
        Objects.equals(this.propertyName, configProperty.propertyName) &&
        Objects.equals(this.propertyValue, configProperty.propertyValue) &&
        Objects.equals(this.propertyType, configProperty.propertyType) &&
        Objects.equals(this.description, configProperty.description);
  }

  @Override
  public int hashCode() {
    return Objects.hash(groupName, propertyName, propertyValue, propertyType, description);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConfigProperty {\n");
    
    sb.append("    groupName: ").append(toIndentedString(groupName)).append("\n");
    sb.append("    propertyName: ").append(toIndentedString(propertyName)).append("\n");
    sb.append("    propertyValue: ").append(toIndentedString(propertyValue)).append("\n");
    sb.append("    propertyType: ").append(toIndentedString(propertyType)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
