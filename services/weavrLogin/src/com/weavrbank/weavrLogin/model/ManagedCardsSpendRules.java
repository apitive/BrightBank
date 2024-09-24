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
import java.util.ArrayList;
import java.util.List;
/**
 * ManagedCardsSpendRules
 */

public class ManagedCardsSpendRules {
  @JsonProperty("allowAtm")
  private Boolean allowAtm = null;

  @JsonProperty("allowECommerce")
  private Boolean allowECommerce = null;

  @JsonProperty("blockedMerchantCategories")
  private List<String> blockedMerchantCategories = new ArrayList<>();

  @JsonProperty("allowedMerchantIds")
  private List<String> allowedMerchantIds = new ArrayList<>();

  @JsonProperty("allowCashback")
  private Boolean allowCashback = null;

  @JsonProperty("spendLimit")
  private List<SpendLimit> spendLimit = new ArrayList<>();

  @JsonProperty("blockedMerchantIds")
  private List<String> blockedMerchantIds = new ArrayList<>();

  @JsonProperty("allowCreditAuthorisations")
  private Boolean allowCreditAuthorisations = null;

  @JsonProperty("allowedMerchantCategories")
  private List<String> allowedMerchantCategories = new ArrayList<>();

  @JsonProperty("allowContactless")
  private Boolean allowContactless = null;

  public ManagedCardsSpendRules allowAtm(Boolean allowAtm) {
    this.allowAtm = allowAtm;
    return this;
  }

   /**
   * Indicates if an ATM Withdrawal transaction is allowed on the card.
   * @return allowAtm
  **/
  public Boolean isAllowAtm() {
    return allowAtm;
  }

  public void setAllowAtm(Boolean allowAtm) {
    this.allowAtm = allowAtm;
  }

  public ManagedCardsSpendRules allowECommerce(Boolean allowECommerce) {
    this.allowECommerce = allowECommerce;
    return this;
  }

   /**
   * Indicates if an online transaction is allowed on the card.
   * @return allowECommerce
  **/
  public Boolean isAllowECommerce() {
    return allowECommerce;
  }

  public void setAllowECommerce(Boolean allowECommerce) {
    this.allowECommerce = allowECommerce;
  }

  public ManagedCardsSpendRules blockedMerchantCategories(List<String> blockedMerchantCategories) {
    this.blockedMerchantCategories = blockedMerchantCategories;
    return this;
  }

  public ManagedCardsSpendRules addBlockedMerchantCategoriesItem(String blockedMerchantCategoriesItem) {
    this.blockedMerchantCategories.add(blockedMerchantCategoriesItem);
    return this;
  }

   /**
   * Blacklist MCC: A list of disallowed merchant category codes (MCCs). If the MCC matches, then the transaction will be declined. If an MCC is also in the allowed list, the blocked list will take precedence.
   * @return blockedMerchantCategories
  **/
  public List<String> getBlockedMerchantCategories() {
    return blockedMerchantCategories;
  }

  public void setBlockedMerchantCategories(List<String> blockedMerchantCategories) {
    this.blockedMerchantCategories = blockedMerchantCategories;
  }

  public ManagedCardsSpendRules allowedMerchantIds(List<String> allowedMerchantIds) {
    this.allowedMerchantIds = allowedMerchantIds;
    return this;
  }

  public ManagedCardsSpendRules addAllowedMerchantIdsItem(String allowedMerchantIdsItem) {
    this.allowedMerchantIds.add(allowedMerchantIdsItem);
    return this;
  }

   /**
   * Whitelist Merchant Id: A list of allowed merchant IDs. If the Merchant Id does not match, then the transaction will be declined. If a Merchant Id is also provided in the blocked list, the blocked list will take precedence.
   * @return allowedMerchantIds
  **/
  public List<String> getAllowedMerchantIds() {
    return allowedMerchantIds;
  }

  public void setAllowedMerchantIds(List<String> allowedMerchantIds) {
    this.allowedMerchantIds = allowedMerchantIds;
  }

  public ManagedCardsSpendRules allowCashback(Boolean allowCashback) {
    this.allowCashback = allowCashback;
    return this;
  }

   /**
   * Indicates if a cashback transaction at a physical terminal is allowed on the card.
   * @return allowCashback
  **/
  public Boolean isAllowCashback() {
    return allowCashback;
  }

  public void setAllowCashback(Boolean allowCashback) {
    this.allowCashback = allowCashback;
  }

  public ManagedCardsSpendRules spendLimit(List<SpendLimit> spendLimit) {
    this.spendLimit = spendLimit;
    return this;
  }

  public ManagedCardsSpendRules addSpendLimitItem(SpendLimit spendLimitItem) {
    this.spendLimit.add(spendLimitItem);
    return this;
  }

   /**
   * The total amount of funds that can be spent using this card, in a given time interval.
   * @return spendLimit
  **/
  public List<SpendLimit> getSpendLimit() {
    return spendLimit;
  }

  public void setSpendLimit(List<SpendLimit> spendLimit) {
    this.spendLimit = spendLimit;
  }

  public ManagedCardsSpendRules blockedMerchantIds(List<String> blockedMerchantIds) {
    this.blockedMerchantIds = blockedMerchantIds;
    return this;
  }

  public ManagedCardsSpendRules addBlockedMerchantIdsItem(String blockedMerchantIdsItem) {
    this.blockedMerchantIds.add(blockedMerchantIdsItem);
    return this;
  }

   /**
   * Blacklist Merchant Id: A list of disallowed merchant IDs. If the Merchant Id matches, then the transaction will be declined. If a Marchant Id is also in the allowed list, the blocked list will take precedence.
   * @return blockedMerchantIds
  **/
  public List<String> getBlockedMerchantIds() {
    return blockedMerchantIds;
  }

  public void setBlockedMerchantIds(List<String> blockedMerchantIds) {
    this.blockedMerchantIds = blockedMerchantIds;
  }

  public ManagedCardsSpendRules allowCreditAuthorisations(Boolean allowCreditAuthorisations) {
    this.allowCreditAuthorisations = allowCreditAuthorisations;
    return this;
  }

   /**
   * Indicates if a the card can receive a credit transaction.
   * @return allowCreditAuthorisations
  **/
  public Boolean isAllowCreditAuthorisations() {
    return allowCreditAuthorisations;
  }

  public void setAllowCreditAuthorisations(Boolean allowCreditAuthorisations) {
    this.allowCreditAuthorisations = allowCreditAuthorisations;
  }

  public ManagedCardsSpendRules allowedMerchantCategories(List<String> allowedMerchantCategories) {
    this.allowedMerchantCategories = allowedMerchantCategories;
    return this;
  }

  public ManagedCardsSpendRules addAllowedMerchantCategoriesItem(String allowedMerchantCategoriesItem) {
    this.allowedMerchantCategories.add(allowedMerchantCategoriesItem);
    return this;
  }

   /**
   * Whitelist MCC: A list of allowed merchant category codes (MCCs). If the MCC does not match, then the transaction will be declined. If an MCC is also in the blocked list, the blocked list will take precedence.
   * @return allowedMerchantCategories
  **/
  public List<String> getAllowedMerchantCategories() {
    return allowedMerchantCategories;
  }

  public void setAllowedMerchantCategories(List<String> allowedMerchantCategories) {
    this.allowedMerchantCategories = allowedMerchantCategories;
  }

  public ManagedCardsSpendRules allowContactless(Boolean allowContactless) {
    this.allowContactless = allowContactless;
    return this;
  }

   /**
   * Indicates if a contactless transaction is allowed on the card.
   * @return allowContactless
  **/
  public Boolean isAllowContactless() {
    return allowContactless;
  }

  public void setAllowContactless(Boolean allowContactless) {
    this.allowContactless = allowContactless;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ManagedCardsSpendRules ManagedCardsSpendRules = (ManagedCardsSpendRules) o;
    return Objects.equals(this.allowAtm, ManagedCardsSpendRules.allowAtm) &&
        Objects.equals(this.allowECommerce, ManagedCardsSpendRules.allowECommerce) &&
        Objects.equals(this.blockedMerchantCategories, ManagedCardsSpendRules.blockedMerchantCategories) &&
        Objects.equals(this.allowedMerchantIds, ManagedCardsSpendRules.allowedMerchantIds) &&
        Objects.equals(this.allowCashback, ManagedCardsSpendRules.allowCashback) &&
        Objects.equals(this.spendLimit, ManagedCardsSpendRules.spendLimit) &&
        Objects.equals(this.blockedMerchantIds, ManagedCardsSpendRules.blockedMerchantIds) &&
        Objects.equals(this.allowCreditAuthorisations, ManagedCardsSpendRules.allowCreditAuthorisations) &&
        Objects.equals(this.allowedMerchantCategories, ManagedCardsSpendRules.allowedMerchantCategories) &&
        Objects.equals(this.allowContactless, ManagedCardsSpendRules.allowContactless);
  }

  @Override
  public int hashCode() {
    return Objects.hash(allowAtm, allowECommerce, blockedMerchantCategories, allowedMerchantIds, allowCashback, spendLimit, blockedMerchantIds, allowCreditAuthorisations, allowedMerchantCategories, allowContactless);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ManagedCardsSpendRules {\n");
    
    sb.append("    allowAtm: ").append(toIndentedString(allowAtm)).append("\n");
    sb.append("    allowECommerce: ").append(toIndentedString(allowECommerce)).append("\n");
    sb.append("    blockedMerchantCategories: ").append(toIndentedString(blockedMerchantCategories)).append("\n");
    sb.append("    allowedMerchantIds: ").append(toIndentedString(allowedMerchantIds)).append("\n");
    sb.append("    allowCashback: ").append(toIndentedString(allowCashback)).append("\n");
    sb.append("    spendLimit: ").append(toIndentedString(spendLimit)).append("\n");
    sb.append("    blockedMerchantIds: ").append(toIndentedString(blockedMerchantIds)).append("\n");
    sb.append("    allowCreditAuthorisations: ").append(toIndentedString(allowCreditAuthorisations)).append("\n");
    sb.append("    allowedMerchantCategories: ").append(toIndentedString(allowedMerchantCategories)).append("\n");
    sb.append("    allowContactless: ").append(toIndentedString(allowContactless)).append("\n");
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
