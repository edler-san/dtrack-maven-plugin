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

import java.util.Objects;

import com.google.gson.annotations.SerializedName;

import io.swagger.v3.oas.annotations.media.Schema;
/**
 * CloneProjectRequest
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2025-03-12T17:49:40.645296700+01:00[Europe/Berlin]")

public class CloneProjectRequest {
  @SerializedName("project")
  private String project = null;

  @SerializedName("version")
  private String version = null;

  @SerializedName("includeTags")
  private Boolean includeTags = null;

  @SerializedName("includeProperties")
  private Boolean includeProperties = null;

  @SerializedName("includeDependencies")
  private Boolean includeDependencies = null;

  @SerializedName("includeComponents")
  private Boolean includeComponents = null;

  @SerializedName("includeServices")
  private Boolean includeServices = null;

  @SerializedName("includeAuditHistory")
  private Boolean includeAuditHistory = null;

  @SerializedName("includeACL")
  private Boolean includeACL = null;

  @SerializedName("includePolicyViolations")
  private Boolean includePolicyViolations = null;

  @SerializedName("makeCloneLatest")
  private Boolean makeCloneLatest = null;

  public CloneProjectRequest project(String project) {
    this.project = project;
    return this;
  }

   /**
   * Get project
   * @return project
  **/
  @Schema(required = true, description = "")
  public String getProject() {
    return project;
  }

  public void setProject(String project) {
    this.project = project;
  }

  public CloneProjectRequest version(String version) {
    this.version = version;
    return this;
  }

   /**
   * Get version
   * @return version
  **/
  @Schema(required = true, description = "")
  public String getVersion() {
    return version;
  }

  public void setVersion(String version) {
    this.version = version;
  }

  public CloneProjectRequest includeTags(Boolean includeTags) {
    this.includeTags = includeTags;
    return this;
  }

   /**
   * Get includeTags
   * @return includeTags
  **/
  @Schema(description = "")
  public Boolean isIncludeTags() {
    return includeTags;
  }

  public void setIncludeTags(Boolean includeTags) {
    this.includeTags = includeTags;
  }

  public CloneProjectRequest includeProperties(Boolean includeProperties) {
    this.includeProperties = includeProperties;
    return this;
  }

   /**
   * Get includeProperties
   * @return includeProperties
  **/
  @Schema(description = "")
  public Boolean isIncludeProperties() {
    return includeProperties;
  }

  public void setIncludeProperties(Boolean includeProperties) {
    this.includeProperties = includeProperties;
  }

  public CloneProjectRequest includeDependencies(Boolean includeDependencies) {
    this.includeDependencies = includeDependencies;
    return this;
  }

   /**
   * Get includeDependencies
   * @return includeDependencies
  **/
  @Schema(description = "")
  public Boolean isIncludeDependencies() {
    return includeDependencies;
  }

  public void setIncludeDependencies(Boolean includeDependencies) {
    this.includeDependencies = includeDependencies;
  }

  public CloneProjectRequest includeComponents(Boolean includeComponents) {
    this.includeComponents = includeComponents;
    return this;
  }

   /**
   * Get includeComponents
   * @return includeComponents
  **/
  @Schema(description = "")
  public Boolean isIncludeComponents() {
    return includeComponents;
  }

  public void setIncludeComponents(Boolean includeComponents) {
    this.includeComponents = includeComponents;
  }

  public CloneProjectRequest includeServices(Boolean includeServices) {
    this.includeServices = includeServices;
    return this;
  }

   /**
   * Get includeServices
   * @return includeServices
  **/
  @Schema(description = "")
  public Boolean isIncludeServices() {
    return includeServices;
  }

  public void setIncludeServices(Boolean includeServices) {
    this.includeServices = includeServices;
  }

  public CloneProjectRequest includeAuditHistory(Boolean includeAuditHistory) {
    this.includeAuditHistory = includeAuditHistory;
    return this;
  }

   /**
   * Get includeAuditHistory
   * @return includeAuditHistory
  **/
  @Schema(description = "")
  public Boolean isIncludeAuditHistory() {
    return includeAuditHistory;
  }

  public void setIncludeAuditHistory(Boolean includeAuditHistory) {
    this.includeAuditHistory = includeAuditHistory;
  }

  public CloneProjectRequest includeACL(Boolean includeACL) {
    this.includeACL = includeACL;
    return this;
  }

   /**
   * Get includeACL
   * @return includeACL
  **/
  @Schema(description = "")
  public Boolean isIncludeACL() {
    return includeACL;
  }

  public void setIncludeACL(Boolean includeACL) {
    this.includeACL = includeACL;
  }

  public CloneProjectRequest includePolicyViolations(Boolean includePolicyViolations) {
    this.includePolicyViolations = includePolicyViolations;
    return this;
  }

   /**
   * Get includePolicyViolations
   * @return includePolicyViolations
  **/
  @Schema(description = "")
  public Boolean isIncludePolicyViolations() {
    return includePolicyViolations;
  }

  public void setIncludePolicyViolations(Boolean includePolicyViolations) {
    this.includePolicyViolations = includePolicyViolations;
  }

  public CloneProjectRequest makeCloneLatest(Boolean makeCloneLatest) {
    this.makeCloneLatest = makeCloneLatest;
    return this;
  }

   /**
   * Get makeCloneLatest
   * @return makeCloneLatest
  **/
  @Schema(description = "")
  public Boolean isMakeCloneLatest() {
    return makeCloneLatest;
  }

  public void setMakeCloneLatest(Boolean makeCloneLatest) {
    this.makeCloneLatest = makeCloneLatest;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CloneProjectRequest cloneProjectRequest = (CloneProjectRequest) o;
    return Objects.equals(this.project, cloneProjectRequest.project) &&
        Objects.equals(this.version, cloneProjectRequest.version) &&
        Objects.equals(this.includeTags, cloneProjectRequest.includeTags) &&
        Objects.equals(this.includeProperties, cloneProjectRequest.includeProperties) &&
        Objects.equals(this.includeDependencies, cloneProjectRequest.includeDependencies) &&
        Objects.equals(this.includeComponents, cloneProjectRequest.includeComponents) &&
        Objects.equals(this.includeServices, cloneProjectRequest.includeServices) &&
        Objects.equals(this.includeAuditHistory, cloneProjectRequest.includeAuditHistory) &&
        Objects.equals(this.includeACL, cloneProjectRequest.includeACL) &&
        Objects.equals(this.includePolicyViolations, cloneProjectRequest.includePolicyViolations) &&
        Objects.equals(this.makeCloneLatest, cloneProjectRequest.makeCloneLatest);
  }

  @Override
  public int hashCode() {
    return Objects.hash(project, version, includeTags, includeProperties, includeDependencies, includeComponents, includeServices, includeAuditHistory, includeACL, includePolicyViolations, makeCloneLatest);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CloneProjectRequest {\n");
    
    sb.append("    project: ").append(toIndentedString(project)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    includeTags: ").append(toIndentedString(includeTags)).append("\n");
    sb.append("    includeProperties: ").append(toIndentedString(includeProperties)).append("\n");
    sb.append("    includeDependencies: ").append(toIndentedString(includeDependencies)).append("\n");
    sb.append("    includeComponents: ").append(toIndentedString(includeComponents)).append("\n");
    sb.append("    includeServices: ").append(toIndentedString(includeServices)).append("\n");
    sb.append("    includeAuditHistory: ").append(toIndentedString(includeAuditHistory)).append("\n");
    sb.append("    includeACL: ").append(toIndentedString(includeACL)).append("\n");
    sb.append("    includePolicyViolations: ").append(toIndentedString(includePolicyViolations)).append("\n");
    sb.append("    makeCloneLatest: ").append(toIndentedString(makeCloneLatest)).append("\n");
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
