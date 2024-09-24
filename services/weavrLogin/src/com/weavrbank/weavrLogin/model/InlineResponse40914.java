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
 * InlineResponse40914
 */

public class InlineResponse40914 {
  /**
   * Gets or Sets errorCode
   */
  public enum ErrorCodeEnum {
    PROFILE_INACTIVE("PROFILE_INACTIVE"),
    MODEL_CONSTRAINTS_VIOLATED("MODEL_CONSTRAINTS_VIOLATED"),
    INTERCEPTOR_DENIED_TRANSACTION("INTERCEPTOR_DENIED_TRANSACTION"),
    INSTRUMENT_DENIED_TRANSACTION("INSTRUMENT_DENIED_TRANSACTION"),
    FOREX_TRADE_DENIED_TRANSACTION("FOREX_TRADE_DENIED_TRANSACTION"),
    CURRENCY_MISMATCH("CURRENCY_MISMATCH"),
    SOURCE_INSTRUMENT_BLOCKED("SOURCE_INSTRUMENT_BLOCKED"),
    DESTINATION_INSTRUMENT_BLOCKED("DESTINATION_INSTRUMENT_BLOCKED"),
    SOURCE_NOT_FOUND("SOURCE_NOT_FOUND"),
    DESTINATION_NOT_FOUND("DESTINATION_NOT_FOUND"),
    FEE_NOT_CONFIGURED_FOR_CURRENCY("FEE_NOT_CONFIGURED_FOR_CURRENCY"),
    DESTINATION_LIMIT_EXCEEDED("DESTINATION_LIMIT_EXCEEDED"),
    FUNDS_INSUFFICIENT("FUNDS_INSUFFICIENT"),
    AMOUNT_INVALID("AMOUNT_INVALID"),
    SOURCE_CANNOT_BE_DEBIT_MODE_CARD("SOURCE_CANNOT_BE_DEBIT_MODE_CARD"),
    DESTINATION_CANNOT_BE_DEBIT_MODE_CARD("DESTINATION_CANNOT_BE_DEBIT_MODE_CARD"),
    SEND_TO_INSTRUMENT_UNSUPPORTED("SEND_TO_INSTRUMENT_UNSUPPORTED"),
    SOURCE_INSTRUMENT_DESTROYED("SOURCE_INSTRUMENT_DESTROYED"),
    DESTINATION_INSTRUMENT_DESTROYED("DESTINATION_INSTRUMENT_DESTROYED"),
    SOURCE_AND_DESTINATION_MUST_BE_DIFFERENT("SOURCE_AND_DESTINATION_MUST_BE_DIFFERENT");

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

  public InlineResponse40914 errorCode(ErrorCodeEnum errorCode) {
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
    InlineResponse40914 inline_response_409_14 = (InlineResponse40914) o;
    return Objects.equals(this.errorCode, inline_response_409_14.errorCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(errorCode);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse40914 {\n");
    
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
