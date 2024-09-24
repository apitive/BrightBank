/*
 * Weavr Multi Product API
 * Weavr Multi API provides a simple and flexible way to issue cards and accounts to your customers.  By integrating Weavr Multi API in your application you can embed banking capabilities within your app and provide a seamless experience for our customers.   # Authentication Each request to the Multi API needs to be signed with an `api_key` that represents your account. You can obtain an API Key by registering for a Multi account [here](https://portal.weavr.io).  Almost all endpoints require a secondary authentication token `Authorization` that represents the user for whom the request is being executed.   <!-- ReDoc-Inject: <security-definitions> --> 
 *
 * OpenAPI spec version: 3.2.1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.weavrbank.weavrLogin.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
/**
 * CorporateRootUser
 */

public class CorporateRootUser {
  @JsonProperty("emailVerified")
  private Boolean emailVerified = null;

  @JsonProperty("companyPosition")
  private String companyPosition = null;

  @JsonProperty("surname")
  private String surname = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("mobile")
  private Mobile mobile = null;

  @JsonProperty("active")
  private Boolean active = null;

  @JsonProperty("mobileNumberVerified")
  private Boolean mobileNumberVerified = null;

  @JsonProperty("id")
  private IdentityId id = null;

  @JsonProperty("email")
  private String email = null;

  public CorporateRootUser emailVerified(Boolean emailVerified) {
    this.emailVerified = emailVerified;
    return this;
  }

   /**
   * Indicates if the root user&#x27;s email has been verified.
   * @return emailVerified
  **/
  public Boolean isEmailVerified() {
    return emailVerified;
  }

  public void setEmailVerified(Boolean emailVerified) {
    this.emailVerified = emailVerified;
  }

  public CorporateRootUser companyPosition(String companyPosition) {
    this.companyPosition = companyPosition;
    return this;
  }

   /**
   * The company position of the root user (e.g. Director, CEO, Product Manager, etc..).
   * @return companyPosition
  **/
  public String getCompanyPosition() {
    return companyPosition;
  }

  public void setCompanyPosition(String companyPosition) {
    this.companyPosition = companyPosition;
  }

  public CorporateRootUser surname(String surname) {
    this.surname = surname;
    return this;
  }

   /**
   * Last name of the root user.
   * @return surname
  **/
  public String getSurname() {
    return surname;
  }

  public void setSurname(String surname) {
    this.surname = surname;
  }

  public CorporateRootUser name(String name) {
    this.name = name;
    return this;
  }

   /**
   * First name of the root user.
   * @return name
  **/
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public CorporateRootUser mobile(Mobile mobile) {
    this.mobile = mobile;
    return this;
  }

   /**
   * Get mobile
   * @return mobile
  **/
  public Mobile getMobile() {
    return mobile;
  }

  public void setMobile(Mobile mobile) {
    this.mobile = mobile;
  }

  public CorporateRootUser active(Boolean active) {
    this.active = active;
    return this;
  }

   /**
   * The state of the root user. If false, then the user will not be able to log in.
   * @return active
  **/
  public Boolean isActive() {
    return active;
  }

  public void setActive(Boolean active) {
    this.active = active;
  }

  public CorporateRootUser mobileNumberVerified(Boolean mobileNumberVerified) {
    this.mobileNumberVerified = mobileNumberVerified;
    return this;
  }

   /**
   * Indicates if the root user&#x27;s mobile number has been verified.
   * @return mobileNumberVerified
  **/
  public Boolean isMobileNumberVerified() {
    return mobileNumberVerified;
  }

  public void setMobileNumberVerified(Boolean mobileNumberVerified) {
    this.mobileNumberVerified = mobileNumberVerified;
  }

  public CorporateRootUser id(IdentityId id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  public IdentityId getId() {
    return id;
  }

  public void setId(IdentityId id) {
    this.id = id;
  }

  public CorporateRootUser email(String email) {
    this.email = email;
    return this;
  }

   /**
   * The email address of the root user. When logging in, the email is used as the username of the user.
   * @return email
  **/
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CorporateRootUser CorporateRootUser = (CorporateRootUser) o;
    return Objects.equals(this.emailVerified, CorporateRootUser.emailVerified) &&
        Objects.equals(this.companyPosition, CorporateRootUser.companyPosition) &&
        Objects.equals(this.surname, CorporateRootUser.surname) &&
        Objects.equals(this.name, CorporateRootUser.name) &&
        Objects.equals(this.mobile, CorporateRootUser.mobile) &&
        Objects.equals(this.active, CorporateRootUser.active) &&
        Objects.equals(this.mobileNumberVerified, CorporateRootUser.mobileNumberVerified) &&
        Objects.equals(this.id, CorporateRootUser.id) &&
        Objects.equals(this.email, CorporateRootUser.email);
  }

  @Override
  public int hashCode() {
    return Objects.hash(emailVerified, companyPosition, surname, name, mobile, active, mobileNumberVerified, id, email);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CorporateRootUser {\n");
    
    sb.append("    emailVerified: ").append(toIndentedString(emailVerified)).append("\n");
    sb.append("    companyPosition: ").append(toIndentedString(companyPosition)).append("\n");
    sb.append("    surname: ").append(toIndentedString(surname)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    mobile: ").append(toIndentedString(mobile)).append("\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    mobileNumberVerified: ").append(toIndentedString(mobileNumberVerified)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
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
