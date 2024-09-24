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
 * InlineResponse40943
 */

public class InlineResponse40943 {
  /**
   * Gets or Sets errorCode
   */
  public enum ErrorCodeEnum {
    PROFILE_NOT_FOUND("PROFILE_NOT_FOUND"),
    PROFILE_INACTIVE("PROFILE_INACTIVE"),
    MODEL_CONSTRAINTS_VIOLATED("MODEL_CONSTRAINTS_VIOLATED"),
    FRIENDLY_NAME_NOT_UNIQUE("FRIENDLY_NAME_NOT_UNIQUE"),
    CURRENCY_NOT_SUPPORTED_BY_PROFILE("CURRENCY_NOT_SUPPORTED_BY_PROFILE"),
    PROVIDER_NOT_SUPPORTED_BY_PROFILE("PROVIDER_NOT_SUPPORTED_BY_PROFILE"),
    INSTRUMENT_NOT_FOUND("INSTRUMENT_NOT_FOUND"),
    OWNER_IDENTITY_NOT_VERIFIED("OWNER_IDENTITY_NOT_VERIFIED"),
    IDENTITY_LIMITS_EXCEEDED("IDENTITY_LIMITS_EXCEEDED"),
    OWNER_ACCOUNT_LIMIT_EXCEEDED("OWNER_ACCOUNT_LIMIT_EXCEEDED"),
    PROGRAMME_LIMITS_EXCEEDED("PROGRAMME_LIMITS_EXCEEDED"),
    INNOVATOR_LIMITS_EXCEEDED("INNOVATOR_LIMITS_EXCEEDED"),
    SYSTEM_LIMITS_EXCEEDED("SYSTEM_LIMITS_EXCEEDED");

    private String value;

    ErrorCodeEnum(String value) {
      this.value = value;
    }
    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    @JsonCreator
    public static ErrorCodeEnum fromValue(String input) {
      for (ErrorCodeEnum b : ErrorCodeEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }

  }  @JsonProperty("errorCode")
  private ErrorCodeEnum errorCode = null;

  public InlineResponse40943 errorCode(ErrorCodeEnum errorCode) {
    this.errorCode = errorCode;
    return this;
  }

   /**
   * Get errorCode
   * @return errorCode
  **/
  public ErrorCodeEnum getErrorCode() {
    return errorCode;
  }

  public void setErrorCode(ErrorCodeEnum errorCode) {
    this.errorCode = errorCode;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse40943 inline_response_409_43 = (InlineResponse40943) o;
    return Objects.equals(this.errorCode, inline_response_409_43.errorCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(errorCode);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse40943 {\n");
    
    sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
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
