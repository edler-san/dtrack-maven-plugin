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

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import com.google.gson.annotations.SerializedName;

import io.swagger.v3.oas.annotations.media.Schema;
/**
 * OrganizationalEntity
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2025-03-12T17:49:40.645296700+01:00[Europe/Berlin]")

public class OrganizationalEntity {
  @SerializedName("name")
  private String name = null;

  @SerializedName("urls")
  private List<String> urls = null;

  @SerializedName("contacts")
  private List<OrganizationalContact> contacts = null;

  public OrganizationalEntity name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @Schema(description = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public OrganizationalEntity urls(List<String> urls) {
    this.urls = urls;
    return this;
  }

  public OrganizationalEntity addUrlsItem(String urlsItem) {
    if (this.urls == null) {
      this.urls = new ArrayList<String>();
    }
    this.urls.add(urlsItem);
    return this;
  }

   /**
   * Get urls
   * @return urls
  **/
  @Schema(description = "")
  public List<String> getUrls() {
    return urls;
  }

  public void setUrls(List<String> urls) {
    this.urls = urls;
  }

  public OrganizationalEntity contacts(List<OrganizationalContact> contacts) {
    this.contacts = contacts;
    return this;
  }

  public OrganizationalEntity addContactsItem(OrganizationalContact contactsItem) {
    if (this.contacts == null) {
      this.contacts = new ArrayList<OrganizationalContact>();
    }
    this.contacts.add(contactsItem);
    return this;
  }

   /**
   * Get contacts
   * @return contacts
  **/
  @Schema(description = "")
  public List<OrganizationalContact> getContacts() {
    return contacts;
  }

  public void setContacts(List<OrganizationalContact> contacts) {
    this.contacts = contacts;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrganizationalEntity organizationalEntity = (OrganizationalEntity) o;
    return Objects.equals(this.name, organizationalEntity.name) &&
        Objects.equals(this.urls, organizationalEntity.urls) &&
        Objects.equals(this.contacts, organizationalEntity.contacts);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, urls, contacts);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrganizationalEntity {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    urls: ").append(toIndentedString(urls)).append("\n");
    sb.append("    contacts: ").append(toIndentedString(contacts)).append("\n");
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
