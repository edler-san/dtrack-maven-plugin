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

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

import com.google.gson.annotations.SerializedName;

import io.swagger.v3.oas.annotations.media.Schema;
/**
 * Finding
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2025-03-11T11:08:28.654737800+01:00[Europe/Berlin]")

public class Finding {
  @SerializedName("component")
  private Map<String, Object> component = null;

  @SerializedName("vulnerability")
  private Map<String, Object> vulnerability = null;

  @SerializedName("analysis")
  private Map<String, Object> analysis = null;

  @SerializedName("attribution")
  private Map<String, Object> attribution = null;

  @SerializedName("matrix")
  private String matrix = null;

  public Finding component(Map<String, Object> component) {
    this.component = component;
    return this;
  }

  public Finding putComponentItem(String key, Object componentItem) {
    if (this.component == null) {
      this.component = new HashMap<String, Object>();
    }
    this.component.put(key, componentItem);
    return this;
  }

   /**
   * Get component
   * @return component
  **/
  @Schema(description = "")
  public Map<String, Object> getComponent() {
    return component;
  }

  public void setComponent(Map<String, Object> component) {
    this.component = component;
  }

  public Finding vulnerability(Map<String, Object> vulnerability) {
    this.vulnerability = vulnerability;
    return this;
  }

  public Finding putVulnerabilityItem(String key, Object vulnerabilityItem) {
    if (this.vulnerability == null) {
      this.vulnerability = new HashMap<String, Object>();
    }
    this.vulnerability.put(key, vulnerabilityItem);
    return this;
  }

   /**
   * Get vulnerability
   * @return vulnerability
  **/
  @Schema(description = "")
  public Map<String, Object> getVulnerability() {
    return vulnerability;
  }

  public void setVulnerability(Map<String, Object> vulnerability) {
    this.vulnerability = vulnerability;
  }

  public Finding analysis(Map<String, Object> analysis) {
    this.analysis = analysis;
    return this;
  }

  public Finding putAnalysisItem(String key, Object analysisItem) {
    if (this.analysis == null) {
      this.analysis = new HashMap<String, Object>();
    }
    this.analysis.put(key, analysisItem);
    return this;
  }

   /**
   * Get analysis
   * @return analysis
  **/
  @Schema(description = "")
  public Map<String, Object> getAnalysis() {
    return analysis;
  }

  public void setAnalysis(Map<String, Object> analysis) {
    this.analysis = analysis;
  }

  public Finding attribution(Map<String, Object> attribution) {
    this.attribution = attribution;
    return this;
  }

  public Finding putAttributionItem(String key, Object attributionItem) {
    if (this.attribution == null) {
      this.attribution = new HashMap<String, Object>();
    }
    this.attribution.put(key, attributionItem);
    return this;
  }

   /**
   * Get attribution
   * @return attribution
  **/
  @Schema(description = "")
  public Map<String, Object> getAttribution() {
    return attribution;
  }

  public void setAttribution(Map<String, Object> attribution) {
    this.attribution = attribution;
  }

  public Finding matrix(String matrix) {
    this.matrix = matrix;
    return this;
  }

   /**
   * Get matrix
   * @return matrix
  **/
  @Schema(description = "")
  public String getMatrix() {
    return matrix;
  }

  public void setMatrix(String matrix) {
    this.matrix = matrix;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Finding finding = (Finding) o;
    return Objects.equals(this.component, finding.component) &&
        Objects.equals(this.vulnerability, finding.vulnerability) &&
        Objects.equals(this.analysis, finding.analysis) &&
        Objects.equals(this.attribution, finding.attribution) &&
        Objects.equals(this.matrix, finding.matrix);
  }

  @Override
  public int hashCode() {
    return Objects.hash(component, vulnerability, analysis, attribution, matrix);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Finding {\n");
    
    sb.append("    component: ").append(toIndentedString(component)).append("\n");
    sb.append("    vulnerability: ").append(toIndentedString(vulnerability)).append("\n");
    sb.append("    analysis: ").append(toIndentedString(analysis)).append("\n");
    sb.append("    attribution: ").append(toIndentedString(attribution)).append("\n");
    sb.append("    matrix: ").append(toIndentedString(matrix)).append("\n");
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
