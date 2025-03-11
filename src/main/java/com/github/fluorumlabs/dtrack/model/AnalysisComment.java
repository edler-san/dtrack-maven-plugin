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
 * AnalysisComment
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2025-03-11T11:08:28.654737800+01:00[Europe/Berlin]")

public class AnalysisComment {
  @SerializedName("timestamp")
  private Long timestamp = null;

  @SerializedName("comment")
  private String comment = null;

  @SerializedName("commenter")
  private String commenter = null;

  public AnalysisComment timestamp(Long timestamp) {
    this.timestamp = timestamp;
    return this;
  }

   /**
   * UNIX epoch timestamp in milliseconds
   * @return timestamp
  **/
  @Schema(required = true, description = "UNIX epoch timestamp in milliseconds")
  public Long getTimestamp() {
    return timestamp;
  }

  public void setTimestamp(Long timestamp) {
    this.timestamp = timestamp;
  }

  public AnalysisComment comment(String comment) {
    this.comment = comment;
    return this;
  }

   /**
   * Get comment
   * @return comment
  **/
  @Schema(required = true, description = "")
  public String getComment() {
    return comment;
  }

  public void setComment(String comment) {
    this.comment = comment;
  }

  public AnalysisComment commenter(String commenter) {
    this.commenter = commenter;
    return this;
  }

   /**
   * Get commenter
   * @return commenter
  **/
  @Schema(description = "")
  public String getCommenter() {
    return commenter;
  }

  public void setCommenter(String commenter) {
    this.commenter = commenter;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AnalysisComment analysisComment = (AnalysisComment) o;
    return Objects.equals(this.timestamp, analysisComment.timestamp) &&
        Objects.equals(this.comment, analysisComment.comment) &&
        Objects.equals(this.commenter, analysisComment.commenter);
  }

  @Override
  public int hashCode() {
    return Objects.hash(timestamp, comment, commenter);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AnalysisComment {\n");
    
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
    sb.append("    comment: ").append(toIndentedString(comment)).append("\n");
    sb.append("    commenter: ").append(toIndentedString(commenter)).append("\n");
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
