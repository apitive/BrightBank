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
 * UsersBody
 */

public class UsersBody {
  @JsonProperty("surname")
  private String surname = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("email")
  private String email = null;

  public UsersBody surname(String surname) {
    this.surname = surname;
    return this;
  }

   /**
   * The last name of the user.
   * @return surname
  **/
  public String getSurname() {
    return surname;
  }

  public void setSurname(String surname) {
    this.surname = surname;
  }

  public UsersBody name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The first name of the user.
   * @return name
  **/
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public UsersBody email(String email) {
    this.email = email;
    return this;
  }

   /**
   * The email address of the user.
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
    UsersBody users_body = (UsersBody) o;
    return Objects.equals(this.surname, users_body.surname) &&
        Objects.equals(this.name, users_body.name) &&
        Objects.equals(this.email, users_body.email);
  }

  @Override
  public int hashCode() {
    return Objects.hash(surname, name, email);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UsersBody {\n");
    
    sb.append("    surname: ").append(toIndentedString(surname)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
