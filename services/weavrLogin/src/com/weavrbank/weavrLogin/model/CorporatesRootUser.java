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
 * The root user needs to be a director or a legal representative of the corporate that is being onboarded - this user cannot be deactivated.  Root users need to verify their email address and mobile number, as well as complete KYC as part of the Corporate&#x27;s due diligence process. 
 */

public class CorporatesRootUser {
  @JsonProperty("companyPosition")
  private String companyPosition = null;

  @JsonProperty("surname")
  private String surname = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("mobile")
  private Mobile mobile = null;

  @JsonProperty("email")
  private String email = null;

  public CorporatesRootUser companyPosition(String companyPosition) {
    this.companyPosition = companyPosition;
    return this;
  }

   /**
   * The company position of the root user (e.g. Director, CEO, Product Manager, etc.).
   * @return companyPosition
  **/
  public String getCompanyPosition() {
    return companyPosition;
  }

  public void setCompanyPosition(String companyPosition) {
    this.companyPosition = companyPosition;
  }

  public CorporatesRootUser surname(String surname) {
    this.surname = surname;
    return this;
  }

   /**
   * The last name of the root user.
   * @return surname
  **/
  public String getSurname() {
    return surname;
  }

  public void setSurname(String surname) {
    this.surname = surname;
  }

  public CorporatesRootUser name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The first name of the root user.
   * @return name
  **/
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public CorporatesRootUser mobile(Mobile mobile) {
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

  public CorporatesRootUser email(String email) {
    this.email = email;
    return this;
  }

   /**
   * Valid email address of the root user - this will be verified.
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
    CorporatesRootUser corporates_rootUser = (CorporatesRootUser) o;
    return Objects.equals(this.companyPosition, corporates_rootUser.companyPosition) &&
        Objects.equals(this.surname, corporates_rootUser.surname) &&
        Objects.equals(this.name, corporates_rootUser.name) &&
        Objects.equals(this.mobile, corporates_rootUser.mobile) &&
        Objects.equals(this.email, corporates_rootUser.email);
  }

  @Override
  public int hashCode() {
    return Objects.hash(companyPosition, surname, name, mobile, email);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CorporatesRootUser {\n");
    
    sb.append("    companyPosition: ").append(toIndentedString(companyPosition)).append("\n");
    sb.append("    surname: ").append(toIndentedString(surname)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    mobile: ").append(toIndentedString(mobile)).append("\n");
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
