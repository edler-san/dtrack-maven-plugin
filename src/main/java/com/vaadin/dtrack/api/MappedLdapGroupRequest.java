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
 * MappedLdapGroupRequest
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2025-03-12T17:49:40.645296700+01:00[Europe/Berlin]")

public class MappedLdapGroupRequest {
  @SerializedName("team")
  private String team = null;

  @SerializedName("dn")
  private String dn = null;

  public MappedLdapGroupRequest team(String team) {
    this.team = team;
    return this;
  }

   /**
   * Get team
   * @return team
  **/
  @Schema(required = true, description = "")
  public String getTeam() {
    return team;
  }

  public void setTeam(String team) {
    this.team = team;
  }

  public MappedLdapGroupRequest dn(String dn) {
    this.dn = dn;
    return this;
  }

   /**
   * Get dn
   * @return dn
  **/
  @Schema(required = true, description = "")
  public String getDn() {
    return dn;
  }

  public void setDn(String dn) {
    this.dn = dn;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MappedLdapGroupRequest mappedLdapGroupRequest = (MappedLdapGroupRequest) o;
    return Objects.equals(this.team, mappedLdapGroupRequest.team) &&
        Objects.equals(this.dn, mappedLdapGroupRequest.dn);
  }

  @Override
  public int hashCode() {
    return Objects.hash(team, dn);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MappedLdapGroupRequest {\n");
    
    sb.append("    team: ").append(toIndentedString(team)).append("\n");
    sb.append("    dn: ").append(toIndentedString(dn)).append("\n");
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
