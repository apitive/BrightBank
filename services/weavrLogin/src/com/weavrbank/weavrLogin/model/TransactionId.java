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
 * TransactionId
 */

public class TransactionId {
  @JsonProperty("id")
  private String id = null;

  /**
   * Gets or Sets type
   */
  public enum TypeEnum {
    INSTRUMENT_CREATE("INSTRUMENT_CREATE"),
    INSTRUMENT_BLOCK("INSTRUMENT_BLOCK"),
    INSTRUMENT_UNBLOCK("INSTRUMENT_UNBLOCK"),
    INSTRUMENT_DELETE("INSTRUMENT_DELETE"),
    AUTHORISATION("AUTHORISATION"),
    SETTLEMENT("SETTLEMENT"),
    MANUAL_TRANSACTION("MANUAL_TRANSACTION"),
    TRANSFER("TRANSFER"),
    SEND("SEND"),
    DEPOSIT("DEPOSIT"),
    AUTHORISATION_REVERSAL("AUTHORISATION_REVERSAL"),
    AUTHORISATION_EXPIRY("AUTHORISATION_EXPIRY"),
    AUTHORISATION_DECLINE("AUTHORISATION_DECLINE"),
    AUTHORISATION_MANUAL_CLOSE("AUTHORISATION_MANUAL_CLOSE"),
    MERCHANT_REFUND("MERCHANT_REFUND"),
    MERCHANT_REFUND_REVERSAL("MERCHANT_REFUND_REVERSAL"),
    ORIGINAL_CREDIT_TRANSACTION("ORIGINAL_CREDIT_TRANSACTION"),
    SETTLEMENT_REVERSAL("SETTLEMENT_REVERSAL"),
    ADJUSTMENT("ADJUSTMENT"),
    CHARGE_FEE("CHARGE_FEE"),
    WITHDRAWAL_RESERVE("WITHDRAWAL_RESERVE"),
    WITHDRAWAL_RELEASE("WITHDRAWAL_RELEASE"),
    FEE_REVERSAL("FEE_REVERSAL"),
    CARD_UPGRADE_TO_PHYSICAL("CARD_UPGRADE_TO_PHYSICAL"),
    ACTIVATE_PHYSICAL_CARD("ACTIVATE_PHYSICAL_CARD"),
    INSTRUMENT_REPLACE("INSTRUMENT_REPLACE"),
    OUTGOING_WIRE_TRANSFER("OUTGOING_WIRE_TRANSFER");

    private String value;

    TypeEnum(String value) {
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
    public static TypeEnum fromValue(String input) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }

  }  @JsonProperty("type")
  private TypeEnum type = null;

  public TransactionId id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public TransactionId type(TypeEnum type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TransactionId TransactionId = (TransactionId) o;
    return Objects.equals(this.id, TransactionId.id) &&
        Objects.equals(this.type, TransactionId.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, type);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransactionId {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
