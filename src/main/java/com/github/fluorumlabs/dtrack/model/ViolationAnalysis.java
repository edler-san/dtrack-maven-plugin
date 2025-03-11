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
import com.github.fluorumlabs.dtrack.model.ViolationAnalysisComment;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * ViolationAnalysis
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2025-03-11T11:08:28.654737800+01:00[Europe/Berlin]")

public class ViolationAnalysis {
  /**
   * Gets or Sets analysisState
   */
  @JsonAdapter(AnalysisStateEnum.Adapter.class)
  public enum AnalysisStateEnum {
    @SerializedName("APPROVED")
    APPROVED("APPROVED"),
    @SerializedName("REJECTED")
    REJECTED("REJECTED"),
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

  @SerializedName("analysisComments")
  private List<ViolationAnalysisComment> analysisComments = null;

  /**
   * Gets or Sets violationAnalysisState
   */
  @JsonAdapter(ViolationAnalysisStateEnum.Adapter.class)
  public enum ViolationAnalysisStateEnum {
    @SerializedName("APPROVED")
    APPROVED("APPROVED"),
    @SerializedName("REJECTED")
    REJECTED("REJECTED"),
    @SerializedName("NOT_SET")
    NOT_SET("NOT_SET");

    private String value;

    ViolationAnalysisStateEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static ViolationAnalysisStateEnum fromValue(String input) {
      for (ViolationAnalysisStateEnum b : ViolationAnalysisStateEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<ViolationAnalysisStateEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ViolationAnalysisStateEnum enumeration) throws IOException {
        jsonWriter.value(String.valueOf(enumeration.getValue()));
      }

      @Override
      public ViolationAnalysisStateEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return ViolationAnalysisStateEnum.fromValue((String)(value));
      }
    }
  }  @SerializedName("violationAnalysisState")
  private ViolationAnalysisStateEnum violationAnalysisState = null;

  @SerializedName("isSuppressed")
  private Boolean isSuppressed = null;

  public ViolationAnalysis analysisState(AnalysisStateEnum analysisState) {
    this.analysisState = analysisState;
    return this;
  }

   /**
   * Get analysisState
   * @return analysisState
  **/
  @Schema(required = true, description = "")
  public AnalysisStateEnum getAnalysisState() {
    return analysisState;
  }

  public void setAnalysisState(AnalysisStateEnum analysisState) {
    this.analysisState = analysisState;
  }

  public ViolationAnalysis analysisComments(List<ViolationAnalysisComment> analysisComments) {
    this.analysisComments = analysisComments;
    return this;
  }

  public ViolationAnalysis addAnalysisCommentsItem(ViolationAnalysisComment analysisCommentsItem) {
    if (this.analysisComments == null) {
      this.analysisComments = new ArrayList<ViolationAnalysisComment>();
    }
    this.analysisComments.add(analysisCommentsItem);
    return this;
  }

   /**
   * Get analysisComments
   * @return analysisComments
  **/
  @Schema(description = "")
  public List<ViolationAnalysisComment> getAnalysisComments() {
    return analysisComments;
  }

  public void setAnalysisComments(List<ViolationAnalysisComment> analysisComments) {
    this.analysisComments = analysisComments;
  }

  public ViolationAnalysis violationAnalysisState(ViolationAnalysisStateEnum violationAnalysisState) {
    this.violationAnalysisState = violationAnalysisState;
    return this;
  }

   /**
   * Get violationAnalysisState
   * @return violationAnalysisState
  **/
  @Schema(description = "")
  public ViolationAnalysisStateEnum getViolationAnalysisState() {
    return violationAnalysisState;
  }

  public void setViolationAnalysisState(ViolationAnalysisStateEnum violationAnalysisState) {
    this.violationAnalysisState = violationAnalysisState;
  }

  public ViolationAnalysis isSuppressed(Boolean isSuppressed) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ViolationAnalysis violationAnalysis = (ViolationAnalysis) o;
    return Objects.equals(this.analysisState, violationAnalysis.analysisState) &&
        Objects.equals(this.analysisComments, violationAnalysis.analysisComments) &&
        Objects.equals(this.violationAnalysisState, violationAnalysis.violationAnalysisState) &&
        Objects.equals(this.isSuppressed, violationAnalysis.isSuppressed);
  }

  @Override
  public int hashCode() {
    return Objects.hash(analysisState, analysisComments, violationAnalysisState, isSuppressed);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ViolationAnalysis {\n");
    
    sb.append("    analysisState: ").append(toIndentedString(analysisState)).append("\n");
    sb.append("    analysisComments: ").append(toIndentedString(analysisComments)).append("\n");
    sb.append("    violationAnalysisState: ").append(toIndentedString(violationAnalysisState)).append("\n");
    sb.append("    isSuppressed: ").append(toIndentedString(isSuppressed)).append("\n");
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
