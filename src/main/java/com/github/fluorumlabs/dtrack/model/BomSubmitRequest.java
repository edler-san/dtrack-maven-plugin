/*
 * Copyright 2021 Artem Godin.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

/*
 * Dependency-Track API
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: 4.2.1
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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * BomSubmitRequest
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-05-21T09:42:21.596Z")
public class BomSubmitRequest {
  @SerializedName("project")
  private String project = null;

  @SerializedName("projectName")
  private String projectName = null;

  @SerializedName("projectVersion")
  private String projectVersion = null;

  @SerializedName("autoCreate")
  private Boolean autoCreate = null;

  @SerializedName("bom")
  private String bom = null;

  public BomSubmitRequest project(String project) {
    this.project = project;
    return this;
  }

   /**
   * Get project
   * @return project
  **/
  @ApiModelProperty(required = true, value = "")
  public String getProject() {
    return project;
  }

  public void setProject(String project) {
    this.project = project;
  }

  public BomSubmitRequest projectName(String projectName) {
    this.projectName = projectName;
    return this;
  }

   /**
   * Get projectName
   * @return projectName
  **/
  @ApiModelProperty(value = "")
  public String getProjectName() {
    return projectName;
  }

  public void setProjectName(String projectName) {
    this.projectName = projectName;
  }

  public BomSubmitRequest projectVersion(String projectVersion) {
    this.projectVersion = projectVersion;
    return this;
  }

   /**
   * Get projectVersion
   * @return projectVersion
  **/
  @ApiModelProperty(value = "")
  public String getProjectVersion() {
    return projectVersion;
  }

  public void setProjectVersion(String projectVersion) {
    this.projectVersion = projectVersion;
  }

  public BomSubmitRequest autoCreate(Boolean autoCreate) {
    this.autoCreate = autoCreate;
    return this;
  }

   /**
   * Get autoCreate
   * @return autoCreate
  **/
  @ApiModelProperty(value = "")
  public Boolean isAutoCreate() {
    return autoCreate;
  }

  public void setAutoCreate(Boolean autoCreate) {
    this.autoCreate = autoCreate;
  }

  public BomSubmitRequest bom(String bom) {
    this.bom = bom;
    return this;
  }

   /**
   * Get bom
   * @return bom
  **/
  @ApiModelProperty(required = true, value = "")
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
    BomSubmitRequest bomSubmitRequest = (BomSubmitRequest) o;
    return Objects.equals(this.project, bomSubmitRequest.project) &&
        Objects.equals(this.projectName, bomSubmitRequest.projectName) &&
        Objects.equals(this.projectVersion, bomSubmitRequest.projectVersion) &&
        Objects.equals(this.autoCreate, bomSubmitRequest.autoCreate) &&
        Objects.equals(this.bom, bomSubmitRequest.bom);
  }

  @Override
  public int hashCode() {
    return Objects.hash(project, projectName, projectVersion, autoCreate, bom);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BomSubmitRequest {\n");
    
    sb.append("    project: ").append(toIndentedString(project)).append("\n");
    sb.append("    projectName: ").append(toIndentedString(projectName)).append("\n");
    sb.append("    projectVersion: ").append(toIndentedString(projectVersion)).append("\n");
    sb.append("    autoCreate: ").append(toIndentedString(autoCreate)).append("\n");
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

