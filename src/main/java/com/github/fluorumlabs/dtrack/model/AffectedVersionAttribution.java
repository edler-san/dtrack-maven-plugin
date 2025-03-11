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

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.UUID;
/**
 * AffectedVersionAttribution
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2025-03-11T11:08:28.654737800+01:00[Europe/Berlin]")

public class AffectedVersionAttribution {
  @SerializedName("firstSeen")
  private Long firstSeen = null;

  @SerializedName("lastSeen")
  private Long lastSeen = null;

  /**
   * Gets or Sets source
   */
  @JsonAdapter(SourceEnum.Adapter.class)
  public enum SourceEnum {
    @SerializedName("NVD")
    NVD("NVD"),
    @SerializedName("NPM")
    NPM("NPM"),
    @SerializedName("GITHUB")
    GITHUB("GITHUB"),
    @SerializedName("VULNDB")
    VULNDB("VULNDB"),
    @SerializedName("OSSINDEX")
    OSSINDEX("OSSINDEX"),
    @SerializedName("RETIREJS")
    RETIREJS("RETIREJS"),
    @SerializedName("INTERNAL")
    INTERNAL("INTERNAL"),
    @SerializedName("OSV")
    OSV("OSV"),
    @SerializedName("SNYK")
    SNYK("SNYK"),
    @SerializedName("TRIVY")
    TRIVY("TRIVY"),
    @SerializedName("UNKNOWN")
    UNKNOWN("UNKNOWN");

    private String value;

    SourceEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static SourceEnum fromValue(String input) {
      for (SourceEnum b : SourceEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<SourceEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final SourceEnum enumeration) throws IOException {
        jsonWriter.value(String.valueOf(enumeration.getValue()));
      }

      @Override
      public SourceEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return SourceEnum.fromValue((String)(value));
      }
    }
  }  @SerializedName("source")
  private SourceEnum source = null;

  @SerializedName("uuid")
  private UUID uuid = null;

  public AffectedVersionAttribution firstSeen(Long firstSeen) {
    this.firstSeen = firstSeen;
    return this;
  }

   /**
   * UNIX epoch timestamp in milliseconds
   * @return firstSeen
  **/
  @Schema(required = true, description = "UNIX epoch timestamp in milliseconds")
  public Long getFirstSeen() {
    return firstSeen;
  }

  public void setFirstSeen(Long firstSeen) {
    this.firstSeen = firstSeen;
  }

  public AffectedVersionAttribution lastSeen(Long lastSeen) {
    this.lastSeen = lastSeen;
    return this;
  }

   /**
   * UNIX epoch timestamp in milliseconds
   * @return lastSeen
  **/
  @Schema(required = true, description = "UNIX epoch timestamp in milliseconds")
  public Long getLastSeen() {
    return lastSeen;
  }

  public void setLastSeen(Long lastSeen) {
    this.lastSeen = lastSeen;
  }

  public AffectedVersionAttribution source(SourceEnum source) {
    this.source = source;
    return this;
  }

   /**
   * Get source
   * @return source
  **/
  @Schema(description = "")
  public SourceEnum getSource() {
    return source;
  }

  public void setSource(SourceEnum source) {
    this.source = source;
  }

  public AffectedVersionAttribution uuid(UUID uuid) {
    this.uuid = uuid;
    return this;
  }

   /**
   * Get uuid
   * @return uuid
  **/
  @Schema(description = "")
  public UUID getUuid() {
    return uuid;
  }

  public void setUuid(UUID uuid) {
    this.uuid = uuid;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AffectedVersionAttribution affectedVersionAttribution = (AffectedVersionAttribution) o;
    return Objects.equals(this.firstSeen, affectedVersionAttribution.firstSeen) &&
        Objects.equals(this.lastSeen, affectedVersionAttribution.lastSeen) &&
        Objects.equals(this.source, affectedVersionAttribution.source) &&
        Objects.equals(this.uuid, affectedVersionAttribution.uuid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(firstSeen, lastSeen, source, uuid);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AffectedVersionAttribution {\n");
    
    sb.append("    firstSeen: ").append(toIndentedString(firstSeen)).append("\n");
    sb.append("    lastSeen: ").append(toIndentedString(lastSeen)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
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
