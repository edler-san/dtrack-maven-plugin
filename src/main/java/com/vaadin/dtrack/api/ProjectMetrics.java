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
 * ProjectMetrics
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2025-03-12T17:49:40.645296700+01:00[Europe/Berlin]")

public class ProjectMetrics {
  @SerializedName("critical")
  private Integer critical = null;

  @SerializedName("high")
  private Integer high = null;

  @SerializedName("medium")
  private Integer medium = null;

  @SerializedName("low")
  private Integer low = null;

  @SerializedName("unassigned")
  private Integer unassigned = null;

  @SerializedName("vulnerabilities")
  private Long vulnerabilities = null;

  @SerializedName("vulnerableComponents")
  private Integer vulnerableComponents = null;

  @SerializedName("components")
  private Integer components = null;

  @SerializedName("suppressed")
  private Integer suppressed = null;

  @SerializedName("findingsTotal")
  private Integer findingsTotal = null;

  @SerializedName("findingsAudited")
  private Integer findingsAudited = null;

  @SerializedName("findingsUnaudited")
  private Integer findingsUnaudited = null;

  @SerializedName("inheritedRiskScore")
  private Double inheritedRiskScore = null;

  @SerializedName("policyViolationsFail")
  private Integer policyViolationsFail = null;

  @SerializedName("policyViolationsWarn")
  private Integer policyViolationsWarn = null;

  @SerializedName("policyViolationsInfo")
  private Integer policyViolationsInfo = null;

  @SerializedName("policyViolationsTotal")
  private Integer policyViolationsTotal = null;

  @SerializedName("policyViolationsAudited")
  private Integer policyViolationsAudited = null;

  @SerializedName("policyViolationsUnaudited")
  private Integer policyViolationsUnaudited = null;

  @SerializedName("policyViolationsSecurityTotal")
  private Integer policyViolationsSecurityTotal = null;

  @SerializedName("policyViolationsSecurityAudited")
  private Integer policyViolationsSecurityAudited = null;

  @SerializedName("policyViolationsSecurityUnaudited")
  private Integer policyViolationsSecurityUnaudited = null;

  @SerializedName("policyViolationsLicenseTotal")
  private Integer policyViolationsLicenseTotal = null;

  @SerializedName("policyViolationsLicenseAudited")
  private Integer policyViolationsLicenseAudited = null;

  @SerializedName("policyViolationsLicenseUnaudited")
  private Integer policyViolationsLicenseUnaudited = null;

  @SerializedName("policyViolationsOperationalTotal")
  private Integer policyViolationsOperationalTotal = null;

  @SerializedName("policyViolationsOperationalAudited")
  private Integer policyViolationsOperationalAudited = null;

  @SerializedName("policyViolationsOperationalUnaudited")
  private Integer policyViolationsOperationalUnaudited = null;

  @SerializedName("firstOccurrence")
  private Long firstOccurrence = null;

  @SerializedName("lastOccurrence")
  private Long lastOccurrence = null;

  public ProjectMetrics critical(Integer critical) {
    this.critical = critical;
    return this;
  }

   /**
   * Get critical
   * @return critical
  **/
  @Schema(required = true, description = "")
  public Integer getCritical() {
    return critical;
  }

  public void setCritical(Integer critical) {
    this.critical = critical;
  }

  public ProjectMetrics high(Integer high) {
    this.high = high;
    return this;
  }

   /**
   * Get high
   * @return high
  **/
  @Schema(required = true, description = "")
  public Integer getHigh() {
    return high;
  }

  public void setHigh(Integer high) {
    this.high = high;
  }

  public ProjectMetrics medium(Integer medium) {
    this.medium = medium;
    return this;
  }

   /**
   * Get medium
   * @return medium
  **/
  @Schema(required = true, description = "")
  public Integer getMedium() {
    return medium;
  }

  public void setMedium(Integer medium) {
    this.medium = medium;
  }

  public ProjectMetrics low(Integer low) {
    this.low = low;
    return this;
  }

   /**
   * Get low
   * @return low
  **/
  @Schema(required = true, description = "")
  public Integer getLow() {
    return low;
  }

  public void setLow(Integer low) {
    this.low = low;
  }

  public ProjectMetrics unassigned(Integer unassigned) {
    this.unassigned = unassigned;
    return this;
  }

   /**
   * Get unassigned
   * @return unassigned
  **/
  @Schema(description = "")
  public Integer getUnassigned() {
    return unassigned;
  }

  public void setUnassigned(Integer unassigned) {
    this.unassigned = unassigned;
  }

  public ProjectMetrics vulnerabilities(Long vulnerabilities) {
    this.vulnerabilities = vulnerabilities;
    return this;
  }

   /**
   * Get vulnerabilities
   * @return vulnerabilities
  **/
  @Schema(description = "")
  public Long getVulnerabilities() {
    return vulnerabilities;
  }

  public void setVulnerabilities(Long vulnerabilities) {
    this.vulnerabilities = vulnerabilities;
  }

  public ProjectMetrics vulnerableComponents(Integer vulnerableComponents) {
    this.vulnerableComponents = vulnerableComponents;
    return this;
  }

   /**
   * Get vulnerableComponents
   * @return vulnerableComponents
  **/
  @Schema(description = "")
  public Integer getVulnerableComponents() {
    return vulnerableComponents;
  }

  public void setVulnerableComponents(Integer vulnerableComponents) {
    this.vulnerableComponents = vulnerableComponents;
  }

  public ProjectMetrics components(Integer components) {
    this.components = components;
    return this;
  }

   /**
   * Get components
   * @return components
  **/
  @Schema(description = "")
  public Integer getComponents() {
    return components;
  }

  public void setComponents(Integer components) {
    this.components = components;
  }

  public ProjectMetrics suppressed(Integer suppressed) {
    this.suppressed = suppressed;
    return this;
  }

   /**
   * Get suppressed
   * @return suppressed
  **/
  @Schema(description = "")
  public Integer getSuppressed() {
    return suppressed;
  }

  public void setSuppressed(Integer suppressed) {
    this.suppressed = suppressed;
  }

  public ProjectMetrics findingsTotal(Integer findingsTotal) {
    this.findingsTotal = findingsTotal;
    return this;
  }

   /**
   * Get findingsTotal
   * @return findingsTotal
  **/
  @Schema(description = "")
  public Integer getFindingsTotal() {
    return findingsTotal;
  }

  public void setFindingsTotal(Integer findingsTotal) {
    this.findingsTotal = findingsTotal;
  }

  public ProjectMetrics findingsAudited(Integer findingsAudited) {
    this.findingsAudited = findingsAudited;
    return this;
  }

   /**
   * Get findingsAudited
   * @return findingsAudited
  **/
  @Schema(description = "")
  public Integer getFindingsAudited() {
    return findingsAudited;
  }

  public void setFindingsAudited(Integer findingsAudited) {
    this.findingsAudited = findingsAudited;
  }

  public ProjectMetrics findingsUnaudited(Integer findingsUnaudited) {
    this.findingsUnaudited = findingsUnaudited;
    return this;
  }

   /**
   * Get findingsUnaudited
   * @return findingsUnaudited
  **/
  @Schema(description = "")
  public Integer getFindingsUnaudited() {
    return findingsUnaudited;
  }

  public void setFindingsUnaudited(Integer findingsUnaudited) {
    this.findingsUnaudited = findingsUnaudited;
  }

  public ProjectMetrics inheritedRiskScore(Double inheritedRiskScore) {
    this.inheritedRiskScore = inheritedRiskScore;
    return this;
  }

   /**
   * Get inheritedRiskScore
   * @return inheritedRiskScore
  **/
  @Schema(description = "")
  public Double getInheritedRiskScore() {
    return inheritedRiskScore;
  }

  public void setInheritedRiskScore(Double inheritedRiskScore) {
    this.inheritedRiskScore = inheritedRiskScore;
  }

  public ProjectMetrics policyViolationsFail(Integer policyViolationsFail) {
    this.policyViolationsFail = policyViolationsFail;
    return this;
  }

   /**
   * Get policyViolationsFail
   * @return policyViolationsFail
  **/
  @Schema(description = "")
  public Integer getPolicyViolationsFail() {
    return policyViolationsFail;
  }

  public void setPolicyViolationsFail(Integer policyViolationsFail) {
    this.policyViolationsFail = policyViolationsFail;
  }

  public ProjectMetrics policyViolationsWarn(Integer policyViolationsWarn) {
    this.policyViolationsWarn = policyViolationsWarn;
    return this;
  }

   /**
   * Get policyViolationsWarn
   * @return policyViolationsWarn
  **/
  @Schema(description = "")
  public Integer getPolicyViolationsWarn() {
    return policyViolationsWarn;
  }

  public void setPolicyViolationsWarn(Integer policyViolationsWarn) {
    this.policyViolationsWarn = policyViolationsWarn;
  }

  public ProjectMetrics policyViolationsInfo(Integer policyViolationsInfo) {
    this.policyViolationsInfo = policyViolationsInfo;
    return this;
  }

   /**
   * Get policyViolationsInfo
   * @return policyViolationsInfo
  **/
  @Schema(description = "")
  public Integer getPolicyViolationsInfo() {
    return policyViolationsInfo;
  }

  public void setPolicyViolationsInfo(Integer policyViolationsInfo) {
    this.policyViolationsInfo = policyViolationsInfo;
  }

  public ProjectMetrics policyViolationsTotal(Integer policyViolationsTotal) {
    this.policyViolationsTotal = policyViolationsTotal;
    return this;
  }

   /**
   * Get policyViolationsTotal
   * @return policyViolationsTotal
  **/
  @Schema(description = "")
  public Integer getPolicyViolationsTotal() {
    return policyViolationsTotal;
  }

  public void setPolicyViolationsTotal(Integer policyViolationsTotal) {
    this.policyViolationsTotal = policyViolationsTotal;
  }

  public ProjectMetrics policyViolationsAudited(Integer policyViolationsAudited) {
    this.policyViolationsAudited = policyViolationsAudited;
    return this;
  }

   /**
   * Get policyViolationsAudited
   * @return policyViolationsAudited
  **/
  @Schema(description = "")
  public Integer getPolicyViolationsAudited() {
    return policyViolationsAudited;
  }

  public void setPolicyViolationsAudited(Integer policyViolationsAudited) {
    this.policyViolationsAudited = policyViolationsAudited;
  }

  public ProjectMetrics policyViolationsUnaudited(Integer policyViolationsUnaudited) {
    this.policyViolationsUnaudited = policyViolationsUnaudited;
    return this;
  }

   /**
   * Get policyViolationsUnaudited
   * @return policyViolationsUnaudited
  **/
  @Schema(description = "")
  public Integer getPolicyViolationsUnaudited() {
    return policyViolationsUnaudited;
  }

  public void setPolicyViolationsUnaudited(Integer policyViolationsUnaudited) {
    this.policyViolationsUnaudited = policyViolationsUnaudited;
  }

  public ProjectMetrics policyViolationsSecurityTotal(Integer policyViolationsSecurityTotal) {
    this.policyViolationsSecurityTotal = policyViolationsSecurityTotal;
    return this;
  }

   /**
   * Get policyViolationsSecurityTotal
   * @return policyViolationsSecurityTotal
  **/
  @Schema(description = "")
  public Integer getPolicyViolationsSecurityTotal() {
    return policyViolationsSecurityTotal;
  }

  public void setPolicyViolationsSecurityTotal(Integer policyViolationsSecurityTotal) {
    this.policyViolationsSecurityTotal = policyViolationsSecurityTotal;
  }

  public ProjectMetrics policyViolationsSecurityAudited(Integer policyViolationsSecurityAudited) {
    this.policyViolationsSecurityAudited = policyViolationsSecurityAudited;
    return this;
  }

   /**
   * Get policyViolationsSecurityAudited
   * @return policyViolationsSecurityAudited
  **/
  @Schema(description = "")
  public Integer getPolicyViolationsSecurityAudited() {
    return policyViolationsSecurityAudited;
  }

  public void setPolicyViolationsSecurityAudited(Integer policyViolationsSecurityAudited) {
    this.policyViolationsSecurityAudited = policyViolationsSecurityAudited;
  }

  public ProjectMetrics policyViolationsSecurityUnaudited(Integer policyViolationsSecurityUnaudited) {
    this.policyViolationsSecurityUnaudited = policyViolationsSecurityUnaudited;
    return this;
  }

   /**
   * Get policyViolationsSecurityUnaudited
   * @return policyViolationsSecurityUnaudited
  **/
  @Schema(description = "")
  public Integer getPolicyViolationsSecurityUnaudited() {
    return policyViolationsSecurityUnaudited;
  }

  public void setPolicyViolationsSecurityUnaudited(Integer policyViolationsSecurityUnaudited) {
    this.policyViolationsSecurityUnaudited = policyViolationsSecurityUnaudited;
  }

  public ProjectMetrics policyViolationsLicenseTotal(Integer policyViolationsLicenseTotal) {
    this.policyViolationsLicenseTotal = policyViolationsLicenseTotal;
    return this;
  }

   /**
   * Get policyViolationsLicenseTotal
   * @return policyViolationsLicenseTotal
  **/
  @Schema(description = "")
  public Integer getPolicyViolationsLicenseTotal() {
    return policyViolationsLicenseTotal;
  }

  public void setPolicyViolationsLicenseTotal(Integer policyViolationsLicenseTotal) {
    this.policyViolationsLicenseTotal = policyViolationsLicenseTotal;
  }

  public ProjectMetrics policyViolationsLicenseAudited(Integer policyViolationsLicenseAudited) {
    this.policyViolationsLicenseAudited = policyViolationsLicenseAudited;
    return this;
  }

   /**
   * Get policyViolationsLicenseAudited
   * @return policyViolationsLicenseAudited
  **/
  @Schema(description = "")
  public Integer getPolicyViolationsLicenseAudited() {
    return policyViolationsLicenseAudited;
  }

  public void setPolicyViolationsLicenseAudited(Integer policyViolationsLicenseAudited) {
    this.policyViolationsLicenseAudited = policyViolationsLicenseAudited;
  }

  public ProjectMetrics policyViolationsLicenseUnaudited(Integer policyViolationsLicenseUnaudited) {
    this.policyViolationsLicenseUnaudited = policyViolationsLicenseUnaudited;
    return this;
  }

   /**
   * Get policyViolationsLicenseUnaudited
   * @return policyViolationsLicenseUnaudited
  **/
  @Schema(description = "")
  public Integer getPolicyViolationsLicenseUnaudited() {
    return policyViolationsLicenseUnaudited;
  }

  public void setPolicyViolationsLicenseUnaudited(Integer policyViolationsLicenseUnaudited) {
    this.policyViolationsLicenseUnaudited = policyViolationsLicenseUnaudited;
  }

  public ProjectMetrics policyViolationsOperationalTotal(Integer policyViolationsOperationalTotal) {
    this.policyViolationsOperationalTotal = policyViolationsOperationalTotal;
    return this;
  }

   /**
   * Get policyViolationsOperationalTotal
   * @return policyViolationsOperationalTotal
  **/
  @Schema(description = "")
  public Integer getPolicyViolationsOperationalTotal() {
    return policyViolationsOperationalTotal;
  }

  public void setPolicyViolationsOperationalTotal(Integer policyViolationsOperationalTotal) {
    this.policyViolationsOperationalTotal = policyViolationsOperationalTotal;
  }

  public ProjectMetrics policyViolationsOperationalAudited(Integer policyViolationsOperationalAudited) {
    this.policyViolationsOperationalAudited = policyViolationsOperationalAudited;
    return this;
  }

   /**
   * Get policyViolationsOperationalAudited
   * @return policyViolationsOperationalAudited
  **/
  @Schema(description = "")
  public Integer getPolicyViolationsOperationalAudited() {
    return policyViolationsOperationalAudited;
  }

  public void setPolicyViolationsOperationalAudited(Integer policyViolationsOperationalAudited) {
    this.policyViolationsOperationalAudited = policyViolationsOperationalAudited;
  }

  public ProjectMetrics policyViolationsOperationalUnaudited(Integer policyViolationsOperationalUnaudited) {
    this.policyViolationsOperationalUnaudited = policyViolationsOperationalUnaudited;
    return this;
  }

   /**
   * Get policyViolationsOperationalUnaudited
   * @return policyViolationsOperationalUnaudited
  **/
  @Schema(description = "")
  public Integer getPolicyViolationsOperationalUnaudited() {
    return policyViolationsOperationalUnaudited;
  }

  public void setPolicyViolationsOperationalUnaudited(Integer policyViolationsOperationalUnaudited) {
    this.policyViolationsOperationalUnaudited = policyViolationsOperationalUnaudited;
  }

  public ProjectMetrics firstOccurrence(Long firstOccurrence) {
    this.firstOccurrence = firstOccurrence;
    return this;
  }

   /**
   * UNIX epoch timestamp in milliseconds
   * @return firstOccurrence
  **/
  @Schema(required = true, description = "UNIX epoch timestamp in milliseconds")
  public Long getFirstOccurrence() {
    return firstOccurrence;
  }

  public void setFirstOccurrence(Long firstOccurrence) {
    this.firstOccurrence = firstOccurrence;
  }

  public ProjectMetrics lastOccurrence(Long lastOccurrence) {
    this.lastOccurrence = lastOccurrence;
    return this;
  }

   /**
   * UNIX epoch timestamp in milliseconds
   * @return lastOccurrence
  **/
  @Schema(required = true, description = "UNIX epoch timestamp in milliseconds")
  public Long getLastOccurrence() {
    return lastOccurrence;
  }

  public void setLastOccurrence(Long lastOccurrence) {
    this.lastOccurrence = lastOccurrence;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProjectMetrics projectMetrics = (ProjectMetrics) o;
    return Objects.equals(this.critical, projectMetrics.critical) &&
        Objects.equals(this.high, projectMetrics.high) &&
        Objects.equals(this.medium, projectMetrics.medium) &&
        Objects.equals(this.low, projectMetrics.low) &&
        Objects.equals(this.unassigned, projectMetrics.unassigned) &&
        Objects.equals(this.vulnerabilities, projectMetrics.vulnerabilities) &&
        Objects.equals(this.vulnerableComponents, projectMetrics.vulnerableComponents) &&
        Objects.equals(this.components, projectMetrics.components) &&
        Objects.equals(this.suppressed, projectMetrics.suppressed) &&
        Objects.equals(this.findingsTotal, projectMetrics.findingsTotal) &&
        Objects.equals(this.findingsAudited, projectMetrics.findingsAudited) &&
        Objects.equals(this.findingsUnaudited, projectMetrics.findingsUnaudited) &&
        Objects.equals(this.inheritedRiskScore, projectMetrics.inheritedRiskScore) &&
        Objects.equals(this.policyViolationsFail, projectMetrics.policyViolationsFail) &&
        Objects.equals(this.policyViolationsWarn, projectMetrics.policyViolationsWarn) &&
        Objects.equals(this.policyViolationsInfo, projectMetrics.policyViolationsInfo) &&
        Objects.equals(this.policyViolationsTotal, projectMetrics.policyViolationsTotal) &&
        Objects.equals(this.policyViolationsAudited, projectMetrics.policyViolationsAudited) &&
        Objects.equals(this.policyViolationsUnaudited, projectMetrics.policyViolationsUnaudited) &&
        Objects.equals(this.policyViolationsSecurityTotal, projectMetrics.policyViolationsSecurityTotal) &&
        Objects.equals(this.policyViolationsSecurityAudited, projectMetrics.policyViolationsSecurityAudited) &&
        Objects.equals(this.policyViolationsSecurityUnaudited, projectMetrics.policyViolationsSecurityUnaudited) &&
        Objects.equals(this.policyViolationsLicenseTotal, projectMetrics.policyViolationsLicenseTotal) &&
        Objects.equals(this.policyViolationsLicenseAudited, projectMetrics.policyViolationsLicenseAudited) &&
        Objects.equals(this.policyViolationsLicenseUnaudited, projectMetrics.policyViolationsLicenseUnaudited) &&
        Objects.equals(this.policyViolationsOperationalTotal, projectMetrics.policyViolationsOperationalTotal) &&
        Objects.equals(this.policyViolationsOperationalAudited, projectMetrics.policyViolationsOperationalAudited) &&
        Objects.equals(this.policyViolationsOperationalUnaudited, projectMetrics.policyViolationsOperationalUnaudited) &&
        Objects.equals(this.firstOccurrence, projectMetrics.firstOccurrence) &&
        Objects.equals(this.lastOccurrence, projectMetrics.lastOccurrence);
  }

  @Override
  public int hashCode() {
    return Objects.hash(critical, high, medium, low, unassigned, vulnerabilities, vulnerableComponents, components, suppressed, findingsTotal, findingsAudited, findingsUnaudited, inheritedRiskScore, policyViolationsFail, policyViolationsWarn, policyViolationsInfo, policyViolationsTotal, policyViolationsAudited, policyViolationsUnaudited, policyViolationsSecurityTotal, policyViolationsSecurityAudited, policyViolationsSecurityUnaudited, policyViolationsLicenseTotal, policyViolationsLicenseAudited, policyViolationsLicenseUnaudited, policyViolationsOperationalTotal, policyViolationsOperationalAudited, policyViolationsOperationalUnaudited, firstOccurrence, lastOccurrence);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProjectMetrics {\n");
    
    sb.append("    critical: ").append(toIndentedString(critical)).append("\n");
    sb.append("    high: ").append(toIndentedString(high)).append("\n");
    sb.append("    medium: ").append(toIndentedString(medium)).append("\n");
    sb.append("    low: ").append(toIndentedString(low)).append("\n");
    sb.append("    unassigned: ").append(toIndentedString(unassigned)).append("\n");
    sb.append("    vulnerabilities: ").append(toIndentedString(vulnerabilities)).append("\n");
    sb.append("    vulnerableComponents: ").append(toIndentedString(vulnerableComponents)).append("\n");
    sb.append("    components: ").append(toIndentedString(components)).append("\n");
    sb.append("    suppressed: ").append(toIndentedString(suppressed)).append("\n");
    sb.append("    findingsTotal: ").append(toIndentedString(findingsTotal)).append("\n");
    sb.append("    findingsAudited: ").append(toIndentedString(findingsAudited)).append("\n");
    sb.append("    findingsUnaudited: ").append(toIndentedString(findingsUnaudited)).append("\n");
    sb.append("    inheritedRiskScore: ").append(toIndentedString(inheritedRiskScore)).append("\n");
    sb.append("    policyViolationsFail: ").append(toIndentedString(policyViolationsFail)).append("\n");
    sb.append("    policyViolationsWarn: ").append(toIndentedString(policyViolationsWarn)).append("\n");
    sb.append("    policyViolationsInfo: ").append(toIndentedString(policyViolationsInfo)).append("\n");
    sb.append("    policyViolationsTotal: ").append(toIndentedString(policyViolationsTotal)).append("\n");
    sb.append("    policyViolationsAudited: ").append(toIndentedString(policyViolationsAudited)).append("\n");
    sb.append("    policyViolationsUnaudited: ").append(toIndentedString(policyViolationsUnaudited)).append("\n");
    sb.append("    policyViolationsSecurityTotal: ").append(toIndentedString(policyViolationsSecurityTotal)).append("\n");
    sb.append("    policyViolationsSecurityAudited: ").append(toIndentedString(policyViolationsSecurityAudited)).append("\n");
    sb.append("    policyViolationsSecurityUnaudited: ").append(toIndentedString(policyViolationsSecurityUnaudited)).append("\n");
    sb.append("    policyViolationsLicenseTotal: ").append(toIndentedString(policyViolationsLicenseTotal)).append("\n");
    sb.append("    policyViolationsLicenseAudited: ").append(toIndentedString(policyViolationsLicenseAudited)).append("\n");
    sb.append("    policyViolationsLicenseUnaudited: ").append(toIndentedString(policyViolationsLicenseUnaudited)).append("\n");
    sb.append("    policyViolationsOperationalTotal: ").append(toIndentedString(policyViolationsOperationalTotal)).append("\n");
    sb.append("    policyViolationsOperationalAudited: ").append(toIndentedString(policyViolationsOperationalAudited)).append("\n");
    sb.append("    policyViolationsOperationalUnaudited: ").append(toIndentedString(policyViolationsOperationalUnaudited)).append("\n");
    sb.append("    firstOccurrence: ").append(toIndentedString(firstOccurrence)).append("\n");
    sb.append("    lastOccurrence: ").append(toIndentedString(lastOccurrence)).append("\n");
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
