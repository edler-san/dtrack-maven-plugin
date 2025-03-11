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
import java.util.UUID;
/**
 * MappedLdapGroup
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2025-03-11T11:08:28.654737800+01:00[Europe/Berlin]")

public class MappedLdapGroup {
  @SerializedName("dn")
  private String dn = null;

  @SerializedName("uuid")
  private UUID uuid = null;

  public MappedLdapGroup dn(String dn) {
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

  public MappedLdapGroup uuid(UUID uuid) {
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
    MappedLdapGroup mappedLdapGroup = (MappedLdapGroup) o;
    return Objects.equals(this.dn, mappedLdapGroup.dn) &&
        Objects.equals(this.uuid, mappedLdapGroup.uuid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dn, uuid);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MappedLdapGroup {\n");
    
    sb.append("    dn: ").append(toIndentedString(dn)).append("\n");
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
