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
import com.github.fluorumlabs.dtrack.model.ApiKey;
import com.github.fluorumlabs.dtrack.model.LdapUser;
import com.github.fluorumlabs.dtrack.model.ManagedUser;
import com.github.fluorumlabs.dtrack.model.MappedLdapGroup;
import com.github.fluorumlabs.dtrack.model.MappedOidcGroup;
import com.github.fluorumlabs.dtrack.model.OidcUser;
import com.github.fluorumlabs.dtrack.model.Permission;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
/**
 * Team
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2025-03-11T11:08:28.654737800+01:00[Europe/Berlin]")

public class Team {
  @SerializedName("uuid")
  private UUID uuid = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("apiKeys")
  private List<ApiKey> apiKeys = null;

  @SerializedName("ldapUsers")
  private List<LdapUser> ldapUsers = null;

  @SerializedName("managedUsers")
  private List<ManagedUser> managedUsers = null;

  @SerializedName("oidcUsers")
  private List<OidcUser> oidcUsers = null;

  @SerializedName("mappedLdapGroups")
  private List<MappedLdapGroup> mappedLdapGroups = null;

  @SerializedName("mappedOidcGroups")
  private List<MappedOidcGroup> mappedOidcGroups = null;

  @SerializedName("permissions")
  private List<Permission> permissions = null;

  public Team uuid(UUID uuid) {
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

  public Team name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @Schema(required = true, description = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Team apiKeys(List<ApiKey> apiKeys) {
    this.apiKeys = apiKeys;
    return this;
  }

  public Team addApiKeysItem(ApiKey apiKeysItem) {
    if (this.apiKeys == null) {
      this.apiKeys = new ArrayList<ApiKey>();
    }
    this.apiKeys.add(apiKeysItem);
    return this;
  }

   /**
   * Get apiKeys
   * @return apiKeys
  **/
  @Schema(description = "")
  public List<ApiKey> getApiKeys() {
    return apiKeys;
  }

  public void setApiKeys(List<ApiKey> apiKeys) {
    this.apiKeys = apiKeys;
  }

  public Team ldapUsers(List<LdapUser> ldapUsers) {
    this.ldapUsers = ldapUsers;
    return this;
  }

  public Team addLdapUsersItem(LdapUser ldapUsersItem) {
    if (this.ldapUsers == null) {
      this.ldapUsers = new ArrayList<LdapUser>();
    }
    this.ldapUsers.add(ldapUsersItem);
    return this;
  }

   /**
   * Get ldapUsers
   * @return ldapUsers
  **/
  @Schema(description = "")
  public List<LdapUser> getLdapUsers() {
    return ldapUsers;
  }

  public void setLdapUsers(List<LdapUser> ldapUsers) {
    this.ldapUsers = ldapUsers;
  }

  public Team managedUsers(List<ManagedUser> managedUsers) {
    this.managedUsers = managedUsers;
    return this;
  }

  public Team addManagedUsersItem(ManagedUser managedUsersItem) {
    if (this.managedUsers == null) {
      this.managedUsers = new ArrayList<ManagedUser>();
    }
    this.managedUsers.add(managedUsersItem);
    return this;
  }

   /**
   * Get managedUsers
   * @return managedUsers
  **/
  @Schema(description = "")
  public List<ManagedUser> getManagedUsers() {
    return managedUsers;
  }

  public void setManagedUsers(List<ManagedUser> managedUsers) {
    this.managedUsers = managedUsers;
  }

  public Team oidcUsers(List<OidcUser> oidcUsers) {
    this.oidcUsers = oidcUsers;
    return this;
  }

  public Team addOidcUsersItem(OidcUser oidcUsersItem) {
    if (this.oidcUsers == null) {
      this.oidcUsers = new ArrayList<OidcUser>();
    }
    this.oidcUsers.add(oidcUsersItem);
    return this;
  }

   /**
   * Get oidcUsers
   * @return oidcUsers
  **/
  @Schema(description = "")
  public List<OidcUser> getOidcUsers() {
    return oidcUsers;
  }

  public void setOidcUsers(List<OidcUser> oidcUsers) {
    this.oidcUsers = oidcUsers;
  }

  public Team mappedLdapGroups(List<MappedLdapGroup> mappedLdapGroups) {
    this.mappedLdapGroups = mappedLdapGroups;
    return this;
  }

  public Team addMappedLdapGroupsItem(MappedLdapGroup mappedLdapGroupsItem) {
    if (this.mappedLdapGroups == null) {
      this.mappedLdapGroups = new ArrayList<MappedLdapGroup>();
    }
    this.mappedLdapGroups.add(mappedLdapGroupsItem);
    return this;
  }

   /**
   * Get mappedLdapGroups
   * @return mappedLdapGroups
  **/
  @Schema(description = "")
  public List<MappedLdapGroup> getMappedLdapGroups() {
    return mappedLdapGroups;
  }

  public void setMappedLdapGroups(List<MappedLdapGroup> mappedLdapGroups) {
    this.mappedLdapGroups = mappedLdapGroups;
  }

  public Team mappedOidcGroups(List<MappedOidcGroup> mappedOidcGroups) {
    this.mappedOidcGroups = mappedOidcGroups;
    return this;
  }

  public Team addMappedOidcGroupsItem(MappedOidcGroup mappedOidcGroupsItem) {
    if (this.mappedOidcGroups == null) {
      this.mappedOidcGroups = new ArrayList<MappedOidcGroup>();
    }
    this.mappedOidcGroups.add(mappedOidcGroupsItem);
    return this;
  }

   /**
   * Get mappedOidcGroups
   * @return mappedOidcGroups
  **/
  @Schema(description = "")
  public List<MappedOidcGroup> getMappedOidcGroups() {
    return mappedOidcGroups;
  }

  public void setMappedOidcGroups(List<MappedOidcGroup> mappedOidcGroups) {
    this.mappedOidcGroups = mappedOidcGroups;
  }

  public Team permissions(List<Permission> permissions) {
    this.permissions = permissions;
    return this;
  }

  public Team addPermissionsItem(Permission permissionsItem) {
    if (this.permissions == null) {
      this.permissions = new ArrayList<Permission>();
    }
    this.permissions.add(permissionsItem);
    return this;
  }

   /**
   * Get permissions
   * @return permissions
  **/
  @Schema(description = "")
  public List<Permission> getPermissions() {
    return permissions;
  }

  public void setPermissions(List<Permission> permissions) {
    this.permissions = permissions;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Team team = (Team) o;
    return Objects.equals(this.uuid, team.uuid) &&
        Objects.equals(this.name, team.name) &&
        Objects.equals(this.apiKeys, team.apiKeys) &&
        Objects.equals(this.ldapUsers, team.ldapUsers) &&
        Objects.equals(this.managedUsers, team.managedUsers) &&
        Objects.equals(this.oidcUsers, team.oidcUsers) &&
        Objects.equals(this.mappedLdapGroups, team.mappedLdapGroups) &&
        Objects.equals(this.mappedOidcGroups, team.mappedOidcGroups) &&
        Objects.equals(this.permissions, team.permissions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(uuid, name, apiKeys, ldapUsers, managedUsers, oidcUsers, mappedLdapGroups, mappedOidcGroups, permissions);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Team {\n");
    
    sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    apiKeys: ").append(toIndentedString(apiKeys)).append("\n");
    sb.append("    ldapUsers: ").append(toIndentedString(ldapUsers)).append("\n");
    sb.append("    managedUsers: ").append(toIndentedString(managedUsers)).append("\n");
    sb.append("    oidcUsers: ").append(toIndentedString(oidcUsers)).append("\n");
    sb.append("    mappedLdapGroups: ").append(toIndentedString(mappedLdapGroups)).append("\n");
    sb.append("    mappedOidcGroups: ").append(toIndentedString(mappedOidcGroups)).append("\n");
    sb.append("    permissions: ").append(toIndentedString(permissions)).append("\n");
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
