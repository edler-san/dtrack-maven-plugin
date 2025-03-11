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
import java.util.UUID;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

import io.swagger.v3.oas.annotations.media.Schema;
/**
 * FindingAttribution
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2025-03-11T11:08:28.654737800+01:00[Europe/Berlin]")

public class FindingAttribution {
  @SerializedName("attributedOn")
  private Long attributedOn = null;

  /**
   * Gets or Sets analyzerIdentity
   */
  @JsonAdapter(AnalyzerIdentityEnum.Adapter.class)
  public enum AnalyzerIdentityEnum {
    @SerializedName("INTERNAL_ANALYZER")
    INTERNAL_ANALYZER("INTERNAL_ANALYZER"),
    @SerializedName("OSSINDEX_ANALYZER")
    OSSINDEX_ANALYZER("OSSINDEX_ANALYZER"),
    @SerializedName("NPM_AUDIT_ANALYZER")
    NPM_AUDIT_ANALYZER("NPM_AUDIT_ANALYZER"),
    @SerializedName("VULNDB_ANALYZER")
    VULNDB_ANALYZER("VULNDB_ANALYZER"),
    @SerializedName("SNYK_ANALYZER")
    SNYK_ANALYZER("SNYK_ANALYZER"),
    @SerializedName("TRIVY_ANALYZER")
    TRIVY_ANALYZER("TRIVY_ANALYZER"),
    @SerializedName("NONE")
    NONE("NONE");

    private String value;

    AnalyzerIdentityEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static AnalyzerIdentityEnum fromValue(String input) {
      for (AnalyzerIdentityEnum b : AnalyzerIdentityEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<AnalyzerIdentityEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final AnalyzerIdentityEnum enumeration) throws IOException {
        jsonWriter.value(String.valueOf(enumeration.getValue()));
      }

      @Override
      public AnalyzerIdentityEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return AnalyzerIdentityEnum.fromValue((String)(value));
      }
    }
  }  @SerializedName("analyzerIdentity")
  private AnalyzerIdentityEnum analyzerIdentity = null;

  @SerializedName("component")
  private Component component = null;

  @SerializedName("vulnerability")
  private Vulnerability vulnerability = null;

  @SerializedName("alternateIdentifier")
  private String alternateIdentifier = null;

  @SerializedName("referenceUrl")
  private String referenceUrl = null;

  @SerializedName("uuid")
  private UUID uuid = null;

  public FindingAttribution attributedOn(Long attributedOn) {
    this.attributedOn = attributedOn;
    return this;
  }

   /**
   * UNIX epoch timestamp in milliseconds
   * @return attributedOn
  **/
  @Schema(required = true, description = "UNIX epoch timestamp in milliseconds")
  public Long getAttributedOn() {
    return attributedOn;
  }

  public void setAttributedOn(Long attributedOn) {
    this.attributedOn = attributedOn;
  }

  public FindingAttribution analyzerIdentity(AnalyzerIdentityEnum analyzerIdentity) {
    this.analyzerIdentity = analyzerIdentity;
    return this;
  }

   /**
   * Get analyzerIdentity
   * @return analyzerIdentity
  **/
  @Schema(description = "")
  public AnalyzerIdentityEnum getAnalyzerIdentity() {
    return analyzerIdentity;
  }

  public void setAnalyzerIdentity(AnalyzerIdentityEnum analyzerIdentity) {
    this.analyzerIdentity = analyzerIdentity;
  }

  public FindingAttribution component(Component component) {
    this.component = component;
    return this;
  }

   /**
   * Get component
   * @return component
  **/
  @Schema(required = true, description = "")
  public Component getComponent() {
    return component;
  }

  public void setComponent(Component component) {
    this.component = component;
  }

  public FindingAttribution vulnerability(Vulnerability vulnerability) {
    this.vulnerability = vulnerability;
    return this;
  }

   /**
   * Get vulnerability
   * @return vulnerability
  **/
  @Schema(required = true, description = "")
  public Vulnerability getVulnerability() {
    return vulnerability;
  }

  public void setVulnerability(Vulnerability vulnerability) {
    this.vulnerability = vulnerability;
  }

  public FindingAttribution alternateIdentifier(String alternateIdentifier) {
    this.alternateIdentifier = alternateIdentifier;
    return this;
  }

   /**
   * Get alternateIdentifier
   * @return alternateIdentifier
  **/
  @Schema(description = "")
  public String getAlternateIdentifier() {
    return alternateIdentifier;
  }

  public void setAlternateIdentifier(String alternateIdentifier) {
    this.alternateIdentifier = alternateIdentifier;
  }

  public FindingAttribution referenceUrl(String referenceUrl) {
    this.referenceUrl = referenceUrl;
    return this;
  }

   /**
   * Get referenceUrl
   * @return referenceUrl
  **/
  @Schema(description = "")
  public String getReferenceUrl() {
    return referenceUrl;
  }

  public void setReferenceUrl(String referenceUrl) {
    this.referenceUrl = referenceUrl;
  }

  public FindingAttribution uuid(UUID uuid) {
    this.uuid = uuid;
    return this;
  }

   /**
   * Get uuid
   * @return uuid
  **/
  @Schema(required = true, description = "")
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
    FindingAttribution findingAttribution = (FindingAttribution) o;
    return Objects.equals(this.attributedOn, findingAttribution.attributedOn) &&
        Objects.equals(this.analyzerIdentity, findingAttribution.analyzerIdentity) &&
        Objects.equals(this.component, findingAttribution.component) &&
        Objects.equals(this.vulnerability, findingAttribution.vulnerability) &&
        Objects.equals(this.alternateIdentifier, findingAttribution.alternateIdentifier) &&
        Objects.equals(this.referenceUrl, findingAttribution.referenceUrl) &&
        Objects.equals(this.uuid, findingAttribution.uuid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attributedOn, analyzerIdentity, component, vulnerability, alternateIdentifier, referenceUrl, uuid);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FindingAttribution {\n");
    
    sb.append("    attributedOn: ").append(toIndentedString(attributedOn)).append("\n");
    sb.append("    analyzerIdentity: ").append(toIndentedString(analyzerIdentity)).append("\n");
    sb.append("    component: ").append(toIndentedString(component)).append("\n");
    sb.append("    vulnerability: ").append(toIndentedString(vulnerability)).append("\n");
    sb.append("    alternateIdentifier: ").append(toIndentedString(alternateIdentifier)).append("\n");
    sb.append("    referenceUrl: ").append(toIndentedString(referenceUrl)).append("\n");
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
