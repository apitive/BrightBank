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
import com.weavrbank.weavrLogin.model.ConsumersRootUser;
/**
 * ConsumersBody
 */

public class ConsumersBody {
  @JsonProperty("rootUser")
  private ConsumersRootUser rootUser = null;

  @JsonProperty("sourceOfFundsOther")
  private String sourceOfFundsOther = null;

  @JsonProperty("acceptedTerms")
  private Boolean acceptedTerms = null;

  @JsonProperty("profileId")
  private String profileId = null;

  @JsonProperty("ipAddress")
  private String ipAddress = null;

  @JsonProperty("sourceOfFunds")
  private Object sourceOfFunds = null;

  @JsonProperty("tag")
  private String tag = null;

  @JsonProperty("feeGroup")
  private String feeGroup = null;

  @JsonProperty("baseCurrency")
  private String baseCurrency = null;

  public ConsumersBody rootUser(ConsumersRootUser rootUser) {
    this.rootUser = rootUser;
    return this;
  }

   /**
   * Get rootUser
   * @return rootUser
  **/
  public ConsumersRootUser getRootUser() {
    return rootUser;
  }

  public void setRootUser(ConsumersRootUser rootUser) {
    this.rootUser = rootUser;
  }

  public ConsumersBody sourceOfFundsOther(String sourceOfFundsOther) {
    this.sourceOfFundsOther = sourceOfFundsOther;
    return this;
  }

   /**
   * Description of source of funds in case &#x60;OTHER&#x60; was chosen.
   * @return sourceOfFundsOther
  **/
  public String getSourceOfFundsOther() {
    return sourceOfFundsOther;
  }

  public void setSourceOfFundsOther(String sourceOfFundsOther) {
    this.sourceOfFundsOther = sourceOfFundsOther;
  }

  public ConsumersBody acceptedTerms(Boolean acceptedTerms) {
    this.acceptedTerms = acceptedTerms;
    return this;
  }

   /**
   * Must be set to *true* to indicate that the consumer has accepted the terms and conditions.
   * @return acceptedTerms
  **/
  public Boolean isAcceptedTerms() {
    return acceptedTerms;
  }

  public void setAcceptedTerms(Boolean acceptedTerms) {
    this.acceptedTerms = acceptedTerms;
  }

  public ConsumersBody profileId(String profileId) {
    this.profileId = profileId;
    return this;
  }

   /**
   * The Consumer Profile Id to be used to create the Consumer.  Profiles contain configuration and determine behavioral aspects of the newly created Consumer, for example, fees that may apply.  You can have one or more profiles linked to your application, and these can be used to drive different behaviors according to your product&#x27;s needs.  Profile Ids can be found in the Multi Portal, in the API Credentials page. 
   * @return profileId
  **/
  public String getProfileId() {
    return profileId;
  }

  public void setProfileId(String profileId) {
    this.profileId = profileId;
  }

  public ConsumersBody ipAddress(String ipAddress) {
    this.ipAddress = ipAddress;
    return this;
  }

   /**
   * The IP address of the user doing the registration.
   * @return ipAddress
  **/
  public String getIpAddress() {
    return ipAddress;
  }

  public void setIpAddress(String ipAddress) {
    this.ipAddress = ipAddress;
  }

  public ConsumersBody sourceOfFunds(Object sourceOfFunds) {
    this.sourceOfFunds = sourceOfFunds;
    return this;
  }

   /**
   * Get sourceOfFunds
   * @return sourceOfFunds
  **/
  public Object getSourceOfFunds() {
    return sourceOfFunds;
  }

  public void setSourceOfFunds(Object sourceOfFunds) {
    this.sourceOfFunds = sourceOfFunds;
  }

  public ConsumersBody tag(String tag) {
    this.tag = tag;
    return this;
  }

   /**
   * The tag field is a custom field that can be used to search and filter.
   * @return tag
  **/
  public String getTag() {
    return tag;
  }

  public void setTag(String tag) {
    this.tag = tag;
  }

  public ConsumersBody feeGroup(String feeGroup) {
    this.feeGroup = feeGroup;
    return this;
  }

   /**
   * The fee group which the consumer is bound to. Fee groups provide the possibility of different fees to users under the same profile. If fee groups are not required, ignore this field.
   * @return feeGroup
  **/
  public String getFeeGroup() {
    return feeGroup;
  }

  public void setFeeGroup(String feeGroup) {
    this.feeGroup = feeGroup;
  }

  public ConsumersBody baseCurrency(String baseCurrency) {
    this.baseCurrency = baseCurrency;
    return this;
  }

   /**
   * The default currency of the consumer.
   * @return baseCurrency
  **/
  public String getBaseCurrency() {
    return baseCurrency;
  }

  public void setBaseCurrency(String baseCurrency) {
    this.baseCurrency = baseCurrency;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConsumersBody consumers_body = (ConsumersBody) o;
    return Objects.equals(this.rootUser, consumers_body.rootUser) &&
        Objects.equals(this.sourceOfFundsOther, consumers_body.sourceOfFundsOther) &&
        Objects.equals(this.acceptedTerms, consumers_body.acceptedTerms) &&
        Objects.equals(this.profileId, consumers_body.profileId) &&
        Objects.equals(this.ipAddress, consumers_body.ipAddress) &&
        Objects.equals(this.sourceOfFunds, consumers_body.sourceOfFunds) &&
        Objects.equals(this.tag, consumers_body.tag) &&
        Objects.equals(this.feeGroup, consumers_body.feeGroup) &&
        Objects.equals(this.baseCurrency, consumers_body.baseCurrency);
  }

  @Override
  public int hashCode() {
    return Objects.hash(rootUser, sourceOfFundsOther, acceptedTerms, profileId, ipAddress, sourceOfFunds, tag, feeGroup, baseCurrency);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConsumersBody {\n");
    
    sb.append("    rootUser: ").append(toIndentedString(rootUser)).append("\n");
    sb.append("    sourceOfFundsOther: ").append(toIndentedString(sourceOfFundsOther)).append("\n");
    sb.append("    acceptedTerms: ").append(toIndentedString(acceptedTerms)).append("\n");
    sb.append("    profileId: ").append(toIndentedString(profileId)).append("\n");
    sb.append("    ipAddress: ").append(toIndentedString(ipAddress)).append("\n");
    sb.append("    sourceOfFunds: ").append(toIndentedString(sourceOfFunds)).append("\n");
    sb.append("    tag: ").append(toIndentedString(tag)).append("\n");
    sb.append("    feeGroup: ").append(toIndentedString(feeGroup)).append("\n");
    sb.append("    baseCurrency: ").append(toIndentedString(baseCurrency)).append("\n");
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
