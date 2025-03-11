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

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.UUID;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

import io.swagger.v3.oas.annotations.media.Schema;
/**
 * Component
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2025-03-11T11:08:28.654737800+01:00[Europe/Berlin]")

public class Component {
  @SerializedName("authors")
  private List<OrganizationalContact> authors = null;

  @SerializedName("publisher")
  private String publisher = null;

  @SerializedName("supplier")
  private OrganizationalEntity supplier = null;

  @SerializedName("group")
  private String group = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("version")
  private String version = null;

  /**
   * Gets or Sets classifier
   */
  @JsonAdapter(ClassifierEnum.Adapter.class)
  public enum ClassifierEnum {
    @SerializedName("APPLICATION")
    APPLICATION("APPLICATION"),
    @SerializedName("FRAMEWORK")
    FRAMEWORK("FRAMEWORK"),
    @SerializedName("LIBRARY")
    LIBRARY("LIBRARY"),
    @SerializedName("CONTAINER")
    CONTAINER("CONTAINER"),
    @SerializedName("OPERATING_SYSTEM")
    OPERATING_SYSTEM("OPERATING_SYSTEM"),
    @SerializedName("DEVICE")
    DEVICE("DEVICE"),
    @SerializedName("FIRMWARE")
    FIRMWARE("FIRMWARE"),
    @SerializedName("FILE")
    FILE("FILE"),
    @SerializedName("PLATFORM")
    PLATFORM("PLATFORM"),
    @SerializedName("DEVICE_DRIVER")
    DEVICE_DRIVER("DEVICE_DRIVER"),
    @SerializedName("MACHINE_LEARNING_MODEL")
    MACHINE_LEARNING_MODEL("MACHINE_LEARNING_MODEL"),
    @SerializedName("DATA")
    DATA("DATA");

    private String value;

    ClassifierEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static ClassifierEnum fromValue(String input) {
      for (ClassifierEnum b : ClassifierEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<ClassifierEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ClassifierEnum enumeration) throws IOException {
        jsonWriter.value(String.valueOf(enumeration.getValue()));
      }

      @Override
      public ClassifierEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return ClassifierEnum.fromValue((String)(value));
      }
    }
  }  @SerializedName("classifier")
  private ClassifierEnum classifier = null;

  @SerializedName("filename")
  private String filename = null;

  @SerializedName("extension")
  private String extension = null;

  @SerializedName("md5")
  private String md5 = null;

  @SerializedName("sha1")
  private String sha1 = null;

  @SerializedName("sha256")
  private String sha256 = null;

  @SerializedName("sha384")
  private String sha384 = null;

  @SerializedName("sha512")
  private String sha512 = null;

  @SerializedName("sha3_256")
  private String sha3256 = null;

  @SerializedName("sha3_384")
  private String sha3384 = null;

  @SerializedName("sha3_512")
  private String sha3512 = null;

  @SerializedName("blake2b_256")
  private String blake2b256 = null;

  @SerializedName("blake2b_384")
  private String blake2b384 = null;

  @SerializedName("blake2b_512")
  private String blake2b512 = null;

  @SerializedName("blake3")
  private String blake3 = null;

  @SerializedName("cpe")
  private String cpe = null;

  @SerializedName("purl")
  private String purl = null;

  @SerializedName("purlCoordinates")
  private String purlCoordinates = null;

  @SerializedName("swidTagId")
  private String swidTagId = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("copyright")
  private String copyright = null;

  @SerializedName("license")
  private String license = null;

  @SerializedName("licenseExpression")
  private String licenseExpression = null;

  @SerializedName("licenseUrl")
  private String licenseUrl = null;

  @SerializedName("resolvedLicense")
  private License resolvedLicense = null;

  @SerializedName("directDependencies")
  private String directDependencies = null;

  @SerializedName("externalReferences")
  private List<ExternalReference> externalReferences = null;

  @SerializedName("parent")
  private Component parent = null;

  @SerializedName("children")
  private List<Component> children = null;

  @SerializedName("properties")
  private List<ComponentProperty> properties = null;

  @SerializedName("vulnerabilities")
  private List<Vulnerability> vulnerabilities = null;

  @SerializedName("project")
  private Project project = null;

  @SerializedName("lastInheritedRiskScore")
  private Double lastInheritedRiskScore = null;

  @SerializedName("notes")
  private String notes = null;

  @SerializedName("uuid")
  private UUID uuid = null;

  @SerializedName("author")
  private String author = null;

  @SerializedName("metrics")
  private DependencyMetrics metrics = null;

  @SerializedName("repositoryMeta")
  private RepositoryMetaComponent repositoryMeta = null;

  @SerializedName("dependencyGraph")
  private List<String> dependencyGraph = null;

  @SerializedName("expandDependencyGraph")
  private Boolean expandDependencyGraph = null;

  @SerializedName("isInternal")
  private Boolean isInternal = null;

  public Component authors(List<OrganizationalContact> authors) {
    this.authors = authors;
    return this;
  }

  public Component addAuthorsItem(OrganizationalContact authorsItem) {
    if (this.authors == null) {
      this.authors = new ArrayList<OrganizationalContact>();
    }
    this.authors.add(authorsItem);
    return this;
  }

   /**
   * Get authors
   * @return authors
  **/
  @Schema(description = "")
  public List<OrganizationalContact> getAuthors() {
    return authors;
  }

  public void setAuthors(List<OrganizationalContact> authors) {
    this.authors = authors;
  }

  public Component publisher(String publisher) {
    this.publisher = publisher;
    return this;
  }

   /**
   * Get publisher
   * @return publisher
  **/
  @Schema(description = "")
  public String getPublisher() {
    return publisher;
  }

  public void setPublisher(String publisher) {
    this.publisher = publisher;
  }

  public Component supplier(OrganizationalEntity supplier) {
    this.supplier = supplier;
    return this;
  }

   /**
   * Get supplier
   * @return supplier
  **/
  @Schema(description = "")
  public OrganizationalEntity getSupplier() {
    return supplier;
  }

  public void setSupplier(OrganizationalEntity supplier) {
    this.supplier = supplier;
  }

  public Component group(String group) {
    this.group = group;
    return this;
  }

   /**
   * Get group
   * @return group
  **/
  @Schema(description = "")
  public String getGroup() {
    return group;
  }

  public void setGroup(String group) {
    this.group = group;
  }

  public Component name(String name) {
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

  public Component version(String version) {
    this.version = version;
    return this;
  }

   /**
   * Get version
   * @return version
  **/
  @Schema(description = "")
  public String getVersion() {
    return version;
  }

  public void setVersion(String version) {
    this.version = version;
  }

  public Component classifier(ClassifierEnum classifier) {
    this.classifier = classifier;
    return this;
  }

   /**
   * Get classifier
   * @return classifier
  **/
  @Schema(description = "")
  public ClassifierEnum getClassifier() {
    return classifier;
  }

  public void setClassifier(ClassifierEnum classifier) {
    this.classifier = classifier;
  }

  public Component filename(String filename) {
    this.filename = filename;
    return this;
  }

   /**
   * Get filename
   * @return filename
  **/
  @Schema(description = "")
  public String getFilename() {
    return filename;
  }

  public void setFilename(String filename) {
    this.filename = filename;
  }

  public Component extension(String extension) {
    this.extension = extension;
    return this;
  }

   /**
   * Get extension
   * @return extension
  **/
  @Schema(description = "")
  public String getExtension() {
    return extension;
  }

  public void setExtension(String extension) {
    this.extension = extension;
  }

  public Component md5(String md5) {
    this.md5 = md5;
    return this;
  }

   /**
   * Get md5
   * @return md5
  **/
  @Schema(description = "")
  public String getMd5() {
    return md5;
  }

  public void setMd5(String md5) {
    this.md5 = md5;
  }

  public Component sha1(String sha1) {
    this.sha1 = sha1;
    return this;
  }

   /**
   * Get sha1
   * @return sha1
  **/
  @Schema(description = "")
  public String getSha1() {
    return sha1;
  }

  public void setSha1(String sha1) {
    this.sha1 = sha1;
  }

  public Component sha256(String sha256) {
    this.sha256 = sha256;
    return this;
  }

   /**
   * Get sha256
   * @return sha256
  **/
  @Schema(description = "")
  public String getSha256() {
    return sha256;
  }

  public void setSha256(String sha256) {
    this.sha256 = sha256;
  }

  public Component sha384(String sha384) {
    this.sha384 = sha384;
    return this;
  }

   /**
   * Get sha384
   * @return sha384
  **/
  @Schema(description = "")
  public String getSha384() {
    return sha384;
  }

  public void setSha384(String sha384) {
    this.sha384 = sha384;
  }

  public Component sha512(String sha512) {
    this.sha512 = sha512;
    return this;
  }

   /**
   * Get sha512
   * @return sha512
  **/
  @Schema(description = "")
  public String getSha512() {
    return sha512;
  }

  public void setSha512(String sha512) {
    this.sha512 = sha512;
  }

  public Component sha3256(String sha3256) {
    this.sha3256 = sha3256;
    return this;
  }

   /**
   * Get sha3256
   * @return sha3256
  **/
  @Schema(description = "")
  public String getSha3256() {
    return sha3256;
  }

  public void setSha3256(String sha3256) {
    this.sha3256 = sha3256;
  }

  public Component sha3384(String sha3384) {
    this.sha3384 = sha3384;
    return this;
  }

   /**
   * Get sha3384
   * @return sha3384
  **/
  @Schema(description = "")
  public String getSha3384() {
    return sha3384;
  }

  public void setSha3384(String sha3384) {
    this.sha3384 = sha3384;
  }

  public Component sha3512(String sha3512) {
    this.sha3512 = sha3512;
    return this;
  }

   /**
   * Get sha3512
   * @return sha3512
  **/
  @Schema(description = "")
  public String getSha3512() {
    return sha3512;
  }

  public void setSha3512(String sha3512) {
    this.sha3512 = sha3512;
  }

  public Component blake2b256(String blake2b256) {
    this.blake2b256 = blake2b256;
    return this;
  }

   /**
   * Get blake2b256
   * @return blake2b256
  **/
  @Schema(description = "")
  public String getBlake2b256() {
    return blake2b256;
  }

  public void setBlake2b256(String blake2b256) {
    this.blake2b256 = blake2b256;
  }

  public Component blake2b384(String blake2b384) {
    this.blake2b384 = blake2b384;
    return this;
  }

   /**
   * Get blake2b384
   * @return blake2b384
  **/
  @Schema(description = "")
  public String getBlake2b384() {
    return blake2b384;
  }

  public void setBlake2b384(String blake2b384) {
    this.blake2b384 = blake2b384;
  }

  public Component blake2b512(String blake2b512) {
    this.blake2b512 = blake2b512;
    return this;
  }

   /**
   * Get blake2b512
   * @return blake2b512
  **/
  @Schema(description = "")
  public String getBlake2b512() {
    return blake2b512;
  }

  public void setBlake2b512(String blake2b512) {
    this.blake2b512 = blake2b512;
  }

  public Component blake3(String blake3) {
    this.blake3 = blake3;
    return this;
  }

   /**
   * Get blake3
   * @return blake3
  **/
  @Schema(description = "")
  public String getBlake3() {
    return blake3;
  }

  public void setBlake3(String blake3) {
    this.blake3 = blake3;
  }

  public Component cpe(String cpe) {
    this.cpe = cpe;
    return this;
  }

   /**
   * Get cpe
   * @return cpe
  **/
  @Schema(description = "")
  public String getCpe() {
    return cpe;
  }

  public void setCpe(String cpe) {
    this.cpe = cpe;
  }

  public Component purl(String purl) {
    this.purl = purl;
    return this;
  }

   /**
   * Get purl
   * @return purl
  **/
  @Schema(description = "")
  public String getPurl() {
    return purl;
  }

  public void setPurl(String purl) {
    this.purl = purl;
  }

   /**
   * Get purlCoordinates
   * @return purlCoordinates
  **/
  @Schema(description = "")
  public String getPurlCoordinates() {
    return purlCoordinates;
  }

  public Component swidTagId(String swidTagId) {
    this.swidTagId = swidTagId;
    return this;
  }

   /**
   * Get swidTagId
   * @return swidTagId
  **/
  @Schema(description = "")
  public String getSwidTagId() {
    return swidTagId;
  }

  public void setSwidTagId(String swidTagId) {
    this.swidTagId = swidTagId;
  }

  public Component description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @Schema(description = "")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Component copyright(String copyright) {
    this.copyright = copyright;
    return this;
  }

   /**
   * Get copyright
   * @return copyright
  **/
  @Schema(description = "")
  public String getCopyright() {
    return copyright;
  }

  public void setCopyright(String copyright) {
    this.copyright = copyright;
  }

  public Component license(String license) {
    this.license = license;
    return this;
  }

   /**
   * Get license
   * @return license
  **/
  @Schema(description = "")
  public String getLicense() {
    return license;
  }

  public void setLicense(String license) {
    this.license = license;
  }

  public Component licenseExpression(String licenseExpression) {
    this.licenseExpression = licenseExpression;
    return this;
  }

   /**
   * Get licenseExpression
   * @return licenseExpression
  **/
  @Schema(description = "")
  public String getLicenseExpression() {
    return licenseExpression;
  }

  public void setLicenseExpression(String licenseExpression) {
    this.licenseExpression = licenseExpression;
  }

  public Component licenseUrl(String licenseUrl) {
    this.licenseUrl = licenseUrl;
    return this;
  }

   /**
   * Get licenseUrl
   * @return licenseUrl
  **/
  @Schema(description = "")
  public String getLicenseUrl() {
    return licenseUrl;
  }

  public void setLicenseUrl(String licenseUrl) {
    this.licenseUrl = licenseUrl;
  }

  public Component resolvedLicense(License resolvedLicense) {
    this.resolvedLicense = resolvedLicense;
    return this;
  }

   /**
   * Get resolvedLicense
   * @return resolvedLicense
  **/
  @Schema(description = "")
  public License getResolvedLicense() {
    return resolvedLicense;
  }

  public void setResolvedLicense(License resolvedLicense) {
    this.resolvedLicense = resolvedLicense;
  }

  public Component directDependencies(String directDependencies) {
    this.directDependencies = directDependencies;
    return this;
  }

   /**
   * Get directDependencies
   * @return directDependencies
  **/
  @Schema(description = "")
  public String getDirectDependencies() {
    return directDependencies;
  }

  public void setDirectDependencies(String directDependencies) {
    this.directDependencies = directDependencies;
  }

  public Component externalReferences(List<ExternalReference> externalReferences) {
    this.externalReferences = externalReferences;
    return this;
  }

  public Component addExternalReferencesItem(ExternalReference externalReferencesItem) {
    if (this.externalReferences == null) {
      this.externalReferences = new ArrayList<ExternalReference>();
    }
    this.externalReferences.add(externalReferencesItem);
    return this;
  }

   /**
   * Get externalReferences
   * @return externalReferences
  **/
  @Schema(description = "")
  public List<ExternalReference> getExternalReferences() {
    return externalReferences;
  }

  public void setExternalReferences(List<ExternalReference> externalReferences) {
    this.externalReferences = externalReferences;
  }

  public Component parent(Component parent) {
    this.parent = parent;
    return this;
  }

   /**
   * Get parent
   * @return parent
  **/
  @Schema(description = "")
  public Component getParent() {
    return parent;
  }

  public void setParent(Component parent) {
    this.parent = parent;
  }

  public Component children(List<Component> children) {
    this.children = children;
    return this;
  }

  public Component addChildrenItem(Component childrenItem) {
    if (this.children == null) {
      this.children = new ArrayList<Component>();
    }
    this.children.add(childrenItem);
    return this;
  }

   /**
   * Get children
   * @return children
  **/
  @Schema(description = "")
  public List<Component> getChildren() {
    return children;
  }

  public void setChildren(List<Component> children) {
    this.children = children;
  }

  public Component properties(List<ComponentProperty> properties) {
    this.properties = properties;
    return this;
  }

  public Component addPropertiesItem(ComponentProperty propertiesItem) {
    if (this.properties == null) {
      this.properties = new ArrayList<ComponentProperty>();
    }
    this.properties.add(propertiesItem);
    return this;
  }

   /**
   * Get properties
   * @return properties
  **/
  @Schema(description = "")
  public List<ComponentProperty> getProperties() {
    return properties;
  }

  public void setProperties(List<ComponentProperty> properties) {
    this.properties = properties;
  }

  public Component vulnerabilities(List<Vulnerability> vulnerabilities) {
    this.vulnerabilities = vulnerabilities;
    return this;
  }

  public Component addVulnerabilitiesItem(Vulnerability vulnerabilitiesItem) {
    if (this.vulnerabilities == null) {
      this.vulnerabilities = new ArrayList<Vulnerability>();
    }
    this.vulnerabilities.add(vulnerabilitiesItem);
    return this;
  }

   /**
   * Get vulnerabilities
   * @return vulnerabilities
  **/
  @Schema(description = "")
  public List<Vulnerability> getVulnerabilities() {
    return vulnerabilities;
  }

  public void setVulnerabilities(List<Vulnerability> vulnerabilities) {
    this.vulnerabilities = vulnerabilities;
  }

  public Component project(Project project) {
    this.project = project;
    return this;
  }

   /**
   * Get project
   * @return project
  **/
  @Schema(required = true, description = "")
  public Project getProject() {
    return project;
  }

  public void setProject(Project project) {
    this.project = project;
  }

  public Component lastInheritedRiskScore(Double lastInheritedRiskScore) {
    this.lastInheritedRiskScore = lastInheritedRiskScore;
    return this;
  }

   /**
   * Get lastInheritedRiskScore
   * @return lastInheritedRiskScore
  **/
  @Schema(description = "")
  public Double getLastInheritedRiskScore() {
    return lastInheritedRiskScore;
  }

  public void setLastInheritedRiskScore(Double lastInheritedRiskScore) {
    this.lastInheritedRiskScore = lastInheritedRiskScore;
  }

  public Component notes(String notes) {
    this.notes = notes;
    return this;
  }

   /**
   * Get notes
   * @return notes
  **/
  @Schema(description = "")
  public String getNotes() {
    return notes;
  }

  public void setNotes(String notes) {
    this.notes = notes;
  }

  public Component uuid(UUID uuid) {
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

  public Component author(String author) {
    this.author = author;
    return this;
  }

   /**
   * Get author
   * @return author
  **/
  @Schema(description = "")
  public String getAuthor() {
    return author;
  }

  public void setAuthor(String author) {
    this.author = author;
  }

  public Component metrics(DependencyMetrics metrics) {
    this.metrics = metrics;
    return this;
  }

   /**
   * Get metrics
   * @return metrics
  **/
  @Schema(description = "")
  public DependencyMetrics getMetrics() {
    return metrics;
  }

  public void setMetrics(DependencyMetrics metrics) {
    this.metrics = metrics;
  }

  public Component repositoryMeta(RepositoryMetaComponent repositoryMeta) {
    this.repositoryMeta = repositoryMeta;
    return this;
  }

   /**
   * Get repositoryMeta
   * @return repositoryMeta
  **/
  @Schema(description = "")
  public RepositoryMetaComponent getRepositoryMeta() {
    return repositoryMeta;
  }

  public void setRepositoryMeta(RepositoryMetaComponent repositoryMeta) {
    this.repositoryMeta = repositoryMeta;
  }

  public Component dependencyGraph(List<String> dependencyGraph) {
    this.dependencyGraph = dependencyGraph;
    return this;
  }

  public Component addDependencyGraphItem(String dependencyGraphItem) {
    if (this.dependencyGraph == null) {
      this.dependencyGraph = new ArrayList<String>();
    }
    this.dependencyGraph.add(dependencyGraphItem);
    return this;
  }

   /**
   * Get dependencyGraph
   * @return dependencyGraph
  **/
  @Schema(description = "")
  public List<String> getDependencyGraph() {
    return dependencyGraph;
  }

  public void setDependencyGraph(List<String> dependencyGraph) {
    this.dependencyGraph = dependencyGraph;
  }

  public Component expandDependencyGraph(Boolean expandDependencyGraph) {
    this.expandDependencyGraph = expandDependencyGraph;
    return this;
  }

   /**
   * Get expandDependencyGraph
   * @return expandDependencyGraph
  **/
  @Schema(description = "")
  public Boolean isExpandDependencyGraph() {
    return expandDependencyGraph;
  }

  public void setExpandDependencyGraph(Boolean expandDependencyGraph) {
    this.expandDependencyGraph = expandDependencyGraph;
  }

  public Component isInternal(Boolean isInternal) {
    this.isInternal = isInternal;
    return this;
  }

   /**
   * Get isInternal
   * @return isInternal
  **/
  @Schema(description = "")
  public Boolean isIsInternal() {
    return isInternal;
  }

  public void setIsInternal(Boolean isInternal) {
    this.isInternal = isInternal;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Component component = (Component) o;
    return Objects.equals(this.authors, component.authors) &&
        Objects.equals(this.publisher, component.publisher) &&
        Objects.equals(this.supplier, component.supplier) &&
        Objects.equals(this.group, component.group) &&
        Objects.equals(this.name, component.name) &&
        Objects.equals(this.version, component.version) &&
        Objects.equals(this.classifier, component.classifier) &&
        Objects.equals(this.filename, component.filename) &&
        Objects.equals(this.extension, component.extension) &&
        Objects.equals(this.md5, component.md5) &&
        Objects.equals(this.sha1, component.sha1) &&
        Objects.equals(this.sha256, component.sha256) &&
        Objects.equals(this.sha384, component.sha384) &&
        Objects.equals(this.sha512, component.sha512) &&
        Objects.equals(this.sha3256, component.sha3256) &&
        Objects.equals(this.sha3384, component.sha3384) &&
        Objects.equals(this.sha3512, component.sha3512) &&
        Objects.equals(this.blake2b256, component.blake2b256) &&
        Objects.equals(this.blake2b384, component.blake2b384) &&
        Objects.equals(this.blake2b512, component.blake2b512) &&
        Objects.equals(this.blake3, component.blake3) &&
        Objects.equals(this.cpe, component.cpe) &&
        Objects.equals(this.purl, component.purl) &&
        Objects.equals(this.purlCoordinates, component.purlCoordinates) &&
        Objects.equals(this.swidTagId, component.swidTagId) &&
        Objects.equals(this.description, component.description) &&
        Objects.equals(this.copyright, component.copyright) &&
        Objects.equals(this.license, component.license) &&
        Objects.equals(this.licenseExpression, component.licenseExpression) &&
        Objects.equals(this.licenseUrl, component.licenseUrl) &&
        Objects.equals(this.resolvedLicense, component.resolvedLicense) &&
        Objects.equals(this.directDependencies, component.directDependencies) &&
        Objects.equals(this.externalReferences, component.externalReferences) &&
        Objects.equals(this.parent, component.parent) &&
        Objects.equals(this.children, component.children) &&
        Objects.equals(this.properties, component.properties) &&
        Objects.equals(this.vulnerabilities, component.vulnerabilities) &&
        Objects.equals(this.project, component.project) &&
        Objects.equals(this.lastInheritedRiskScore, component.lastInheritedRiskScore) &&
        Objects.equals(this.notes, component.notes) &&
        Objects.equals(this.uuid, component.uuid) &&
        Objects.equals(this.author, component.author) &&
        Objects.equals(this.metrics, component.metrics) &&
        Objects.equals(this.repositoryMeta, component.repositoryMeta) &&
        Objects.equals(this.dependencyGraph, component.dependencyGraph) &&
        Objects.equals(this.expandDependencyGraph, component.expandDependencyGraph) &&
        Objects.equals(this.isInternal, component.isInternal);
  }

  @Override
  public int hashCode() {
    return Objects.hash(authors, publisher, supplier, group, name, version, classifier, filename, extension, md5, sha1, sha256, sha384, sha512, sha3256, sha3384, sha3512, blake2b256, blake2b384, blake2b512, blake3, cpe, purl, purlCoordinates, swidTagId, description, copyright, license, licenseExpression, licenseUrl, resolvedLicense, directDependencies, externalReferences, parent, children, properties, vulnerabilities, project, lastInheritedRiskScore, notes, uuid, author, metrics, repositoryMeta, dependencyGraph, expandDependencyGraph, isInternal);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Component {\n");
    
    sb.append("    authors: ").append(toIndentedString(authors)).append("\n");
    sb.append("    publisher: ").append(toIndentedString(publisher)).append("\n");
    sb.append("    supplier: ").append(toIndentedString(supplier)).append("\n");
    sb.append("    group: ").append(toIndentedString(group)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    classifier: ").append(toIndentedString(classifier)).append("\n");
    sb.append("    filename: ").append(toIndentedString(filename)).append("\n");
    sb.append("    extension: ").append(toIndentedString(extension)).append("\n");
    sb.append("    md5: ").append(toIndentedString(md5)).append("\n");
    sb.append("    sha1: ").append(toIndentedString(sha1)).append("\n");
    sb.append("    sha256: ").append(toIndentedString(sha256)).append("\n");
    sb.append("    sha384: ").append(toIndentedString(sha384)).append("\n");
    sb.append("    sha512: ").append(toIndentedString(sha512)).append("\n");
    sb.append("    sha3256: ").append(toIndentedString(sha3256)).append("\n");
    sb.append("    sha3384: ").append(toIndentedString(sha3384)).append("\n");
    sb.append("    sha3512: ").append(toIndentedString(sha3512)).append("\n");
    sb.append("    blake2b256: ").append(toIndentedString(blake2b256)).append("\n");
    sb.append("    blake2b384: ").append(toIndentedString(blake2b384)).append("\n");
    sb.append("    blake2b512: ").append(toIndentedString(blake2b512)).append("\n");
    sb.append("    blake3: ").append(toIndentedString(blake3)).append("\n");
    sb.append("    cpe: ").append(toIndentedString(cpe)).append("\n");
    sb.append("    purl: ").append(toIndentedString(purl)).append("\n");
    sb.append("    purlCoordinates: ").append(toIndentedString(purlCoordinates)).append("\n");
    sb.append("    swidTagId: ").append(toIndentedString(swidTagId)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    copyright: ").append(toIndentedString(copyright)).append("\n");
    sb.append("    license: ").append(toIndentedString(license)).append("\n");
    sb.append("    licenseExpression: ").append(toIndentedString(licenseExpression)).append("\n");
    sb.append("    licenseUrl: ").append(toIndentedString(licenseUrl)).append("\n");
    sb.append("    resolvedLicense: ").append(toIndentedString(resolvedLicense)).append("\n");
    sb.append("    directDependencies: ").append(toIndentedString(directDependencies)).append("\n");
    sb.append("    externalReferences: ").append(toIndentedString(externalReferences)).append("\n");
    sb.append("    parent: ").append(toIndentedString(parent)).append("\n");
    sb.append("    children: ").append(toIndentedString(children)).append("\n");
    sb.append("    properties: ").append(toIndentedString(properties)).append("\n");
    sb.append("    vulnerabilities: ").append(toIndentedString(vulnerabilities)).append("\n");
    sb.append("    project: ").append(toIndentedString(project)).append("\n");
    sb.append("    lastInheritedRiskScore: ").append(toIndentedString(lastInheritedRiskScore)).append("\n");
    sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
    sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
    sb.append("    author: ").append(toIndentedString(author)).append("\n");
    sb.append("    metrics: ").append(toIndentedString(metrics)).append("\n");
    sb.append("    repositoryMeta: ").append(toIndentedString(repositoryMeta)).append("\n");
    sb.append("    dependencyGraph: ").append(toIndentedString(dependencyGraph)).append("\n");
    sb.append("    expandDependencyGraph: ").append(toIndentedString(expandDependencyGraph)).append("\n");
    sb.append("    isInternal: ").append(toIndentedString(isInternal)).append("\n");
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
