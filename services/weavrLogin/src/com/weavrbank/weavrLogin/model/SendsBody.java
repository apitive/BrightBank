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
 * SendsBody
 */

public class SendsBody {
  @JsonProperty("profileId")
  private String profileId = null;

  @JsonProperty("destination")
  private InstrumentId destination = null;

  @JsonProperty("tag")
  private String tag = null;

  @JsonProperty("source")
  private InstrumentId source = null;

  @JsonProperty("destinationAmount")
  private CurrencyAmount destinationAmount = null;

  public SendsBody profileId(String profileId) {
    this.profileId = profileId;
    return this;
  }

   /**
   * The Send Profile Id to be used to create the send transaction.  Profiles contain configuration and determine behavioral aspects of the newly created transaction, for example, fees that may apply.  You can have one or more profiles linked to your application, and these can be used to drive different behaviors according to your product&#x27;s needs.  Profile Ids can be found in the Multi Portal, in the API Credentials page. 
   * @return profileId
  **/
  public String getProfileId() {
    return profileId;
  }

  public void setProfileId(String profileId) {
    this.profileId = profileId;
  }

  public SendsBody destination(InstrumentId destination) {
    this.destination = destination;
    return this;
  }

   /**
   * Get destination
   * @return destination
  **/
  public InstrumentId getDestination() {
    return destination;
  }

  public void setDestination(InstrumentId destination) {
    this.destination = destination;
  }

  public SendsBody tag(String tag) {
    this.tag = tag;
    return this;
  }

   /**
   * Get tag
   * @return tag
  **/
  public String getTag() {
    return tag;
  }

  public void setTag(String tag) {
    this.tag = tag;
  }

  public SendsBody source(InstrumentId source) {
    this.source = source;
    return this;
  }

   /**
   * Get source
   * @return source
  **/
  public InstrumentId getSource() {
    return source;
  }

  public void setSource(InstrumentId source) {
    this.source = source;
  }

  public SendsBody destinationAmount(CurrencyAmount destinationAmount) {
    this.destinationAmount = destinationAmount;
    return this;
  }

   /**
   * Get destinationAmount
   * @return destinationAmount
  **/
  public CurrencyAmount getDestinationAmount() {
    return destinationAmount;
  }

  public void setDestinationAmount(CurrencyAmount destinationAmount) {
    this.destinationAmount = destinationAmount;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SendsBody sends_body = (SendsBody) o;
    return Objects.equals(this.profileId, sends_body.profileId) &&
        Objects.equals(this.destination, sends_body.destination) &&
        Objects.equals(this.tag, sends_body.tag) &&
        Objects.equals(this.source, sends_body.source) &&
        Objects.equals(this.destinationAmount, sends_body.destinationAmount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(profileId, destination, tag, source, destinationAmount);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SendsBody {\n");
    
    sb.append("    profileId: ").append(toIndentedString(profileId)).append("\n");
    sb.append("    destination: ").append(toIndentedString(destination)).append("\n");
    sb.append("    tag: ").append(toIndentedString(tag)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    destinationAmount: ").append(toIndentedString(destinationAmount)).append("\n");
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
