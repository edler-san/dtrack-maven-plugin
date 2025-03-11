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
/**
 * ExternalReference
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2025-03-11T11:08:28.654737800+01:00[Europe/Berlin]")

public class ExternalReference {
  /**
   * Gets or Sets type
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    @SerializedName("vcs")
    VCS("vcs"),
    @SerializedName("issue-tracker")
    ISSUE_TRACKER("issue-tracker"),
    @SerializedName("website")
    WEBSITE("website"),
    @SerializedName("advisories")
    ADVISORIES("advisories"),
    @SerializedName("bom")
    BOM("bom"),
    @SerializedName("mailing-list")
    MAILING_LIST("mailing-list"),
    @SerializedName("social")
    SOCIAL("social"),
    @SerializedName("chat")
    CHAT("chat"),
    @SerializedName("documentation")
    DOCUMENTATION("documentation"),
    @SerializedName("support")
    SUPPORT("support"),
    @SerializedName("source-distribution")
    SOURCE_DISTRIBUTION("source-distribution"),
    @SerializedName("distribution")
    DISTRIBUTION("distribution"),
    @SerializedName("distribution-intake")
    DISTRIBUTION_INTAKE("distribution-intake"),
    @SerializedName("license")
    LICENSE("license"),
    @SerializedName("build-meta")
    BUILD_META("build-meta"),
    @SerializedName("build-system")
    BUILD_SYSTEM("build-system"),
    @SerializedName("release-notes")
    RELEASE_NOTES("release-notes"),
    @SerializedName("security-contact")
    SECURITY_CONTACT("security-contact"),
    @SerializedName("model_card")
    MODEL_CARD("model_card"),
    @SerializedName("attestation")
    ATTESTATION("attestation"),
    @SerializedName("threat-model")
    THREAT_MODEL("threat-model"),
    @SerializedName("adversary-model")
    ADVERSARY_MODEL("adversary-model"),
    @SerializedName("risk-assessment")
    RISK_ASSESSMENT("risk-assessment"),
    @SerializedName("vulnerability-assertion")
    VULNERABILITY_ASSERTION("vulnerability-assertion"),
    @SerializedName("exploitability-statement")
    EXPLOITABILITY_STATEMENT("exploitability-statement"),
    @SerializedName("pentest-report")
    PENTEST_REPORT("pentest-report"),
    @SerializedName("static-analysis-report")
    STATIC_ANALYSIS_REPORT("static-analysis-report"),
    @SerializedName("dynamic-analysis-report")
    DYNAMIC_ANALYSIS_REPORT("dynamic-analysis-report"),
    @SerializedName("runtime-analysis-report")
    RUNTIME_ANALYSIS_REPORT("runtime-analysis-report"),
    @SerializedName("component-analysis-report")
    COMPONENT_ANALYSIS_REPORT("component-analysis-report"),
    @SerializedName("maturity-report")
    MATURITY_REPORT("maturity-report"),
    @SerializedName("certification-report")
    CERTIFICATION_REPORT("certification-report"),
    @SerializedName("codified-infrastructure")
    CODIFIED_INFRASTRUCTURE("codified-infrastructure"),
    @SerializedName("quality-metrics")
    QUALITY_METRICS("quality-metrics"),
    @SerializedName("log")
    LOG("log"),
    @SerializedName("configuration")
    CONFIGURATION("configuration"),
    @SerializedName("evidence")
    EVIDENCE("evidence"),
    @SerializedName("formulation")
    FORMULATION("formulation"),
    @SerializedName("rfc-9116")
    RFC_9116("rfc-9116"),
    @SerializedName("electronic-signature")
    ELECTRONIC_SIGNATURE("electronic-signature"),
    @SerializedName("digital-signature")
    DIGITAL_SIGNATURE("digital-signature"),
    @SerializedName("other")
    OTHER("other");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static TypeEnum fromValue(String input) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<TypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TypeEnum enumeration) throws IOException {
        jsonWriter.value(String.valueOf(enumeration.getValue()));
      }

      @Override
      public TypeEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return TypeEnum.fromValue((String)(value));
      }
    }
  }  @SerializedName("type")
  private TypeEnum type = null;

  @SerializedName("url")
  private String url = null;

  @SerializedName("comment")
  private String comment = null;

  public ExternalReference type(TypeEnum type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @Schema(description = "")
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public ExternalReference url(String url) {
    this.url = url;
    return this;
  }

   /**
   * Get url
   * @return url
  **/
  @Schema(required = true, description = "")
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public ExternalReference comment(String comment) {
    this.comment = comment;
    return this;
  }

   /**
   * Get comment
   * @return comment
  **/
  @Schema(description = "")
  public String getComment() {
    return comment;
  }

  public void setComment(String comment) {
    this.comment = comment;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExternalReference externalReference = (ExternalReference) o;
    return Objects.equals(this.type, externalReference.type) &&
        Objects.equals(this.url, externalReference.url) &&
        Objects.equals(this.comment, externalReference.comment);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, url, comment);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExternalReference {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    comment: ").append(toIndentedString(comment)).append("\n");
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
