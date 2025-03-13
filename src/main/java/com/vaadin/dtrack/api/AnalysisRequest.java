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

package com.vaadin.dtrack.api;

import java.io.IOException;
import java.util.Objects;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

import io.swagger.v3.oas.annotations.media.Schema;
/**
 * AnalysisRequest
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2025-03-12T17:49:40.645296700+01:00[Europe/Berlin]")

public class AnalysisRequest {
  @SerializedName("project")
  private String project = null;

  @SerializedName("component")
  private String component = null;

  @SerializedName("vulnerability")
  private String vulnerability = null;

  /**
   * Gets or Sets analysisState
   */
  @JsonAdapter(AnalysisStateEnum.Adapter.class)
  public enum AnalysisStateEnum {
    @SerializedName("EXPLOITABLE")
    EXPLOITABLE("EXPLOITABLE"),
    @SerializedName("IN_TRIAGE")
    IN_TRIAGE("IN_TRIAGE"),
    @SerializedName("FALSE_POSITIVE")
    FALSE_POSITIVE("FALSE_POSITIVE"),
    @SerializedName("NOT_AFFECTED")
    NOT_AFFECTED("NOT_AFFECTED"),
    @SerializedName("RESOLVED")
    RESOLVED("RESOLVED"),
    @SerializedName("NOT_SET")
    NOT_SET("NOT_SET");

    private String value;

    AnalysisStateEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static AnalysisStateEnum fromValue(String input) {
      for (AnalysisStateEnum b : AnalysisStateEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<AnalysisStateEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final AnalysisStateEnum enumeration) throws IOException {
        jsonWriter.value(String.valueOf(enumeration.getValue()));
      }

      @Override
      public AnalysisStateEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return AnalysisStateEnum.fromValue((String)(value));
      }
    }
  }  @SerializedName("analysisState")
  private AnalysisStateEnum analysisState = null;

  /**
   * Gets or Sets analysisJustification
   */
  @JsonAdapter(AnalysisJustificationEnum.Adapter.class)
  public enum AnalysisJustificationEnum {
    @SerializedName("CODE_NOT_PRESENT")
    CODE_NOT_PRESENT("CODE_NOT_PRESENT"),
    @SerializedName("CODE_NOT_REACHABLE")
    CODE_NOT_REACHABLE("CODE_NOT_REACHABLE"),
    @SerializedName("REQUIRES_CONFIGURATION")
    REQUIRES_CONFIGURATION("REQUIRES_CONFIGURATION"),
    @SerializedName("REQUIRES_DEPENDENCY")
    REQUIRES_DEPENDENCY("REQUIRES_DEPENDENCY"),
    @SerializedName("REQUIRES_ENVIRONMENT")
    REQUIRES_ENVIRONMENT("REQUIRES_ENVIRONMENT"),
    @SerializedName("PROTECTED_BY_COMPILER")
    PROTECTED_BY_COMPILER("PROTECTED_BY_COMPILER"),
    @SerializedName("PROTECTED_AT_RUNTIME")
    PROTECTED_AT_RUNTIME("PROTECTED_AT_RUNTIME"),
    @SerializedName("PROTECTED_AT_PERIMETER")
    PROTECTED_AT_PERIMETER("PROTECTED_AT_PERIMETER"),
    @SerializedName("PROTECTED_BY_MITIGATING_CONTROL")
    PROTECTED_BY_MITIGATING_CONTROL("PROTECTED_BY_MITIGATING_CONTROL"),
    @SerializedName("NOT_SET")
    NOT_SET("NOT_SET");

    private String value;

    AnalysisJustificationEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static AnalysisJustificationEnum fromValue(String input) {
      for (AnalysisJustificationEnum b : AnalysisJustificationEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<AnalysisJustificationEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final AnalysisJustificationEnum enumeration) throws IOException {
        jsonWriter.value(String.valueOf(enumeration.getValue()));
      }

      @Override
      public AnalysisJustificationEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return AnalysisJustificationEnum.fromValue((String)(value));
      }
    }
  }  @SerializedName("analysisJustification")
  private AnalysisJustificationEnum analysisJustification = null;

  /**
   * Gets or Sets analysisResponse
   */
  @JsonAdapter(AnalysisResponseEnum.Adapter.class)
  public enum AnalysisResponseEnum {
    @SerializedName("CAN_NOT_FIX")
    CAN_NOT_FIX("CAN_NOT_FIX"),
    @SerializedName("WILL_NOT_FIX")
    WILL_NOT_FIX("WILL_NOT_FIX"),
    @SerializedName("UPDATE")
    UPDATE("UPDATE"),
    @SerializedName("ROLLBACK")
    ROLLBACK("ROLLBACK"),
    @SerializedName("WORKAROUND_AVAILABLE")
    WORKAROUND_AVAILABLE("WORKAROUND_AVAILABLE"),
    @SerializedName("NOT_SET")
    NOT_SET("NOT_SET");

    private String value;

    AnalysisResponseEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static AnalysisResponseEnum fromValue(String input) {
      for (AnalysisResponseEnum b : AnalysisResponseEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<AnalysisResponseEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final AnalysisResponseEnum enumeration) throws IOException {
        jsonWriter.value(String.valueOf(enumeration.getValue()));
      }

      @Override
      public AnalysisResponseEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return AnalysisResponseEnum.fromValue((String)(value));
      }
    }
  }  @SerializedName("analysisResponse")
  private AnalysisResponseEnum analysisResponse = null;

  @SerializedName("analysisDetails")
  private String analysisDetails = null;

  @SerializedName("comment")
  private String comment = null;

  @SerializedName("isSuppressed")
  private Boolean isSuppressed = null;

  @SerializedName("suppressed")
  private Boolean suppressed = null;

  public AnalysisRequest project(String project) {
    this.project = project;
    return this;
  }

   /**
   * Get project
   * @return project
  **/
  @Schema(description = "")
  public String getProject() {
    return project;
  }

  public void setProject(String project) {
    this.project = project;
  }

  public AnalysisRequest component(String component) {
    this.component = component;
    return this;
  }

   /**
   * Get component
   * @return component
  **/
  @Schema(required = true, description = "")
  public String getComponent() {
    return component;
  }

  public void setComponent(String component) {
    this.component = component;
  }

  public AnalysisRequest vulnerability(String vulnerability) {
    this.vulnerability = vulnerability;
    return this;
  }

   /**
   * Get vulnerability
   * @return vulnerability
  **/
  @Schema(required = true, description = "")
  public String getVulnerability() {
    return vulnerability;
  }

  public void setVulnerability(String vulnerability) {
    this.vulnerability = vulnerability;
  }

  public AnalysisRequest analysisState(AnalysisStateEnum analysisState) {
    this.analysisState = analysisState;
    return this;
  }

   /**
   * Get analysisState
   * @return analysisState
  **/
  @Schema(description = "")
  public AnalysisStateEnum getAnalysisState() {
    return analysisState;
  }

  public void setAnalysisState(AnalysisStateEnum analysisState) {
    this.analysisState = analysisState;
  }

  public AnalysisRequest analysisJustification(AnalysisJustificationEnum analysisJustification) {
    this.analysisJustification = analysisJustification;
    return this;
  }

   /**
   * Get analysisJustification
   * @return analysisJustification
  **/
  @Schema(description = "")
  public AnalysisJustificationEnum getAnalysisJustification() {
    return analysisJustification;
  }

  public void setAnalysisJustification(AnalysisJustificationEnum analysisJustification) {
    this.analysisJustification = analysisJustification;
  }

  public AnalysisRequest analysisResponse(AnalysisResponseEnum analysisResponse) {
    this.analysisResponse = analysisResponse;
    return this;
  }

   /**
   * Get analysisResponse
   * @return analysisResponse
  **/
  @Schema(description = "")
  public AnalysisResponseEnum getAnalysisResponse() {
    return analysisResponse;
  }

  public void setAnalysisResponse(AnalysisResponseEnum analysisResponse) {
    this.analysisResponse = analysisResponse;
  }

  public AnalysisRequest analysisDetails(String analysisDetails) {
    this.analysisDetails = analysisDetails;
    return this;
  }

   /**
   * Get analysisDetails
   * @return analysisDetails
  **/
  @Schema(description = "")
  public String getAnalysisDetails() {
    return analysisDetails;
  }

  public void setAnalysisDetails(String analysisDetails) {
    this.analysisDetails = analysisDetails;
  }

  public AnalysisRequest comment(String comment) {
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

  public AnalysisRequest isSuppressed(Boolean isSuppressed) {
    this.isSuppressed = isSuppressed;
    return this;
  }

   /**
   * Get isSuppressed
   * @return isSuppressed
  **/
  @Schema(description = "")
  public Boolean isIsSuppressed() {
    return isSuppressed;
  }

  public void setIsSuppressed(Boolean isSuppressed) {
    this.isSuppressed = isSuppressed;
  }

  public AnalysisRequest suppressed(Boolean suppressed) {
    this.suppressed = suppressed;
    return this;
  }

   /**
   * Get suppressed
   * @return suppressed
  **/
  @Schema(description = "")
  public Boolean isSuppressed() {
    return suppressed;
  }

  public void setSuppressed(Boolean suppressed) {
    this.suppressed = suppressed;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AnalysisRequest analysisRequest = (AnalysisRequest) o;
    return Objects.equals(this.project, analysisRequest.project) &&
        Objects.equals(this.component, analysisRequest.component) &&
        Objects.equals(this.vulnerability, analysisRequest.vulnerability) &&
        Objects.equals(this.analysisState, analysisRequest.analysisState) &&
        Objects.equals(this.analysisJustification, analysisRequest.analysisJustification) &&
        Objects.equals(this.analysisResponse, analysisRequest.analysisResponse) &&
        Objects.equals(this.analysisDetails, analysisRequest.analysisDetails) &&
        Objects.equals(this.comment, analysisRequest.comment) &&
        Objects.equals(this.isSuppressed, analysisRequest.isSuppressed) &&
        Objects.equals(this.suppressed, analysisRequest.suppressed);
  }

  @Override
  public int hashCode() {
    return Objects.hash(project, component, vulnerability, analysisState, analysisJustification, analysisResponse, analysisDetails, comment, isSuppressed, suppressed);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AnalysisRequest {\n");
    
    sb.append("    project: ").append(toIndentedString(project)).append("\n");
    sb.append("    component: ").append(toIndentedString(component)).append("\n");
    sb.append("    vulnerability: ").append(toIndentedString(vulnerability)).append("\n");
    sb.append("    analysisState: ").append(toIndentedString(analysisState)).append("\n");
    sb.append("    analysisJustification: ").append(toIndentedString(analysisJustification)).append("\n");
    sb.append("    analysisResponse: ").append(toIndentedString(analysisResponse)).append("\n");
    sb.append("    analysisDetails: ").append(toIndentedString(analysisDetails)).append("\n");
    sb.append("    comment: ").append(toIndentedString(comment)).append("\n");
    sb.append("    isSuppressed: ").append(toIndentedString(isSuppressed)).append("\n");
    sb.append("    suppressed: ").append(toIndentedString(suppressed)).append("\n");
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
