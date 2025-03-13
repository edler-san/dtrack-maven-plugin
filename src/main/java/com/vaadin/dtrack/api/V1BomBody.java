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
 * V1BomBody
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2025-03-12T17:49:40.645296700+01:00[Europe/Berlin]")

public class V1BomBody {
  @SerializedName("project")
  private String project = null;

  @SerializedName("autoCreate")
  private Boolean autoCreate = false;

  @SerializedName("projectName")
  private String projectName = null;

  @SerializedName("projectVersion")
  private String projectVersion = null;

  @SerializedName("projectTags")
  private String projectTags = null;

  @SerializedName("parentName")
  private String parentName = null;

  @SerializedName("parentVersion")
  private String parentVersion = null;

  @SerializedName("parentUUID")
  private String parentUUID = null;

  @SerializedName("isLatest")
  private Boolean isLatest = false;

  @SerializedName("bom")
  private String bom = null;

  public V1BomBody project(String project) {
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

  public V1BomBody autoCreate(Boolean autoCreate) {
    this.autoCreate = autoCreate;
    return this;
  }

   /**
   * Get autoCreate
   * @return autoCreate
  **/
  @Schema(description = "")
  public Boolean isAutoCreate() {
    return autoCreate;
  }

  public void setAutoCreate(Boolean autoCreate) {
    this.autoCreate = autoCreate;
  }

  public V1BomBody projectName(String projectName) {
    this.projectName = projectName;
    return this;
  }

   /**
   * Get projectName
   * @return projectName
  **/
  @Schema(description = "")
  public String getProjectName() {
    return projectName;
  }

  public void setProjectName(String projectName) {
    this.projectName = projectName;
  }

  public V1BomBody projectVersion(String projectVersion) {
    this.projectVersion = projectVersion;
    return this;
  }

   /**
   * Get projectVersion
   * @return projectVersion
  **/
  @Schema(description = "")
  public String getProjectVersion() {
    return projectVersion;
  }

  public void setProjectVersion(String projectVersion) {
    this.projectVersion = projectVersion;
  }

  public V1BomBody projectTags(String projectTags) {
    this.projectTags = projectTags;
    return this;
  }

   /**
   * Get projectTags
   * @return projectTags
  **/
  @Schema(description = "")
  public String getProjectTags() {
    return projectTags;
  }

  public void setProjectTags(String projectTags) {
    this.projectTags = projectTags;
  }

  public V1BomBody parentName(String parentName) {
    this.parentName = parentName;
    return this;
  }

   /**
   * Get parentName
   * @return parentName
  **/
  @Schema(description = "")
  public String getParentName() {
    return parentName;
  }

  public void setParentName(String parentName) {
    this.parentName = parentName;
  }

  public V1BomBody parentVersion(String parentVersion) {
    this.parentVersion = parentVersion;
    return this;
  }

   /**
   * Get parentVersion
   * @return parentVersion
  **/
  @Schema(description = "")
  public String getParentVersion() {
    return parentVersion;
  }

  public void setParentVersion(String parentVersion) {
    this.parentVersion = parentVersion;
  }

  public V1BomBody parentUUID(String parentUUID) {
    this.parentUUID = parentUUID;
    return this;
  }

   /**
   * Get parentUUID
   * @return parentUUID
  **/
  @Schema(description = "")
  public String getParentUUID() {
    return parentUUID;
  }

  public void setParentUUID(String parentUUID) {
    this.parentUUID = parentUUID;
  }

  public V1BomBody isLatest(Boolean isLatest) {
    this.isLatest = isLatest;
    return this;
  }

   /**
   * Get isLatest
   * @return isLatest
  **/
  @Schema(description = "")
  public Boolean isIsLatest() {
    return isLatest;
  }

  public void setIsLatest(Boolean isLatest) {
    this.isLatest = isLatest;
  }

  public V1BomBody bom(String bom) {
    this.bom = bom;
    return this;
  }

   /**
   * Get bom
   * @return bom
  **/
  @Schema(description = "")
  public String getBom() {
    return bom;
  }

  public void setBom(String bom) {
    this.bom = bom;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1BomBody v1BomBody = (V1BomBody) o;
    return Objects.equals(this.project, v1BomBody.project) &&
        Objects.equals(this.autoCreate, v1BomBody.autoCreate) &&
        Objects.equals(this.projectName, v1BomBody.projectName) &&
        Objects.equals(this.projectVersion, v1BomBody.projectVersion) &&
        Objects.equals(this.projectTags, v1BomBody.projectTags) &&
        Objects.equals(this.parentName, v1BomBody.parentName) &&
        Objects.equals(this.parentVersion, v1BomBody.parentVersion) &&
        Objects.equals(this.parentUUID, v1BomBody.parentUUID) &&
        Objects.equals(this.isLatest, v1BomBody.isLatest) &&
        Objects.equals(this.bom, v1BomBody.bom);
  }

  @Override
  public int hashCode() {
    return Objects.hash(project, autoCreate, projectName, projectVersion, projectTags, parentName, parentVersion, parentUUID, isLatest, bom);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1BomBody {\n");
    
    sb.append("    project: ").append(toIndentedString(project)).append("\n");
    sb.append("    autoCreate: ").append(toIndentedString(autoCreate)).append("\n");
    sb.append("    projectName: ").append(toIndentedString(projectName)).append("\n");
    sb.append("    projectVersion: ").append(toIndentedString(projectVersion)).append("\n");
    sb.append("    projectTags: ").append(toIndentedString(projectTags)).append("\n");
    sb.append("    parentName: ").append(toIndentedString(parentName)).append("\n");
    sb.append("    parentVersion: ").append(toIndentedString(parentVersion)).append("\n");
    sb.append("    parentUUID: ").append(toIndentedString(parentUUID)).append("\n");
    sb.append("    isLatest: ").append(toIndentedString(isLatest)).append("\n");
    sb.append("    bom: ").append(toIndentedString(bom)).append("\n");
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
