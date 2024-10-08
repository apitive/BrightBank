package com.weavrbank.weavrLogin.service;


import com.weavrbank.weavrLogin.model.*;
import com.weavrbank.weavrLogin.model.Error;
import com.weavrbank.weavrLogin.model.IdPhysicalBody;
import com.weavrbank.weavrLogin.model.InlineResponse20012;
import com.weavrbank.weavrLogin.model.InlineResponse2002;
import com.weavrbank.weavrLogin.model.InlineResponse4091;
import com.weavrbank.weavrLogin.model.InlineResponse40916;
import com.weavrbank.weavrLogin.model.InlineResponse40917;
import com.weavrbank.weavrLogin.model.InlineResponse40919;
import com.weavrbank.weavrLogin.model.InlineResponse40928;
import com.weavrbank.weavrLogin.model.InlineResponse40931;
import com.weavrbank.weavrLogin.model.InlineResponse40932;
import com.weavrbank.weavrLogin.model.InlineResponse40935;
import com.weavrbank.weavrLogin.model.InlineResponse40938;
import com.weavrbank.weavrLogin.model.InlineResponse40939;
import com.weavrbank.weavrLogin.model.InlineResponse4094;
import com.weavrbank.weavrLogin.model.InlineResponse40941;
import com.weavrbank.weavrLogin.model.InlineResponse40945;
import com.weavrbank.weavrLogin.model.InlineResponse4096;
import com.weavrbank.weavrLogin.model.InlineResponse4099;
import com.weavrbank.weavrLogin.model.ManagedCard;
import com.weavrbank.weavrLogin.model.ManagedCardRequest;
import com.weavrbank.weavrLogin.model.ManagedCardsAssignBody;
import com.weavrbank.weavrLogin.model.ManagedCardsIdBody;
import com.weavrbank.weavrLogin.model.ManagedCardsSpendRules;
import com.weavrbank.weavrLogin.model.PhysicalActivateBody;
import com.weavrbank.weavrLogin.model.PhysicalReplaceDamagedBody;
import com.weavrbank.weavrLogin.model.PhysicalReplaceLostStolenBody;
import com.weavrbank.weavrLogin.model.Statement;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.lang.Object;
import org.springframework.util.MultiValueMap;
import feign.*;

public interface ManagedCardsService {

  /**
   * Assign managed card
   * Assigns a previously created managed card from the innovator&#x27;s card pool to the consumer or corporate identity which is linked to a Managed Cards Profile.
    * @param body  (required)
    * @param idempotency_ref A unique call reference generated by the caller that, taking into consideration the payload as well as the operation itself, helps avoid duplicate operations.  Idempotency reference uniqueness is maintained for at least 24 hours. (optional)
   * @return ManagedCard
   */
  @RequestLine("POST /managed_cards/assign")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
    "idempotency-ref: {idempotency_ref}"  })
  ManagedCard managedCardAssign(ManagedCardsAssignBody body, @Param("idempotency_ref") String idempotency_ref);

  /**
   * Block managed card
   * Blocks the managed card identified by the &#x60;id&#x60; path parameter. This is a reversible action and the card can be unblocked using the _managedCardUnblock_ operation.
    * @param id The unique identifier of a managed card. (required)
    * @param idempotency_ref A unique call reference generated by the caller that, taking into consideration the payload as well as the operation itself, helps avoid duplicate operations.  Idempotency reference uniqueness is maintained for at least 24 hours. (optional)
   */
  @RequestLine("POST /managed_cards/{id}/block")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
    "idempotency-ref: {idempotency_ref}"  })
  void managedCardBlock(@Param("id") String id, @Param("idempotency_ref") String idempotency_ref);

  /**
   * Create managed card
   * Creates a managed card for the consumer or corporate identity. The Managed Card Profile (configured in the Multi Portal) specified determines the behaviour and restrictions that the managed card will have. 
    * @param body  (required)
    * @param idempotency_ref A unique call reference generated by the caller that, taking into consideration the payload as well as the operation itself, helps avoid duplicate operations.  Idempotency reference uniqueness is maintained for at least 24 hours. (optional)
   * @return ManagedCard
   */
  @RequestLine("POST /managed_cards")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
    "idempotency-ref: {idempotency_ref}"  })
  ManagedCard managedCardCreate(ManagedCardRequest body, @Param("idempotency_ref") String idempotency_ref);

  /**
   * Get managed card
   * Returns all details of the managed card identified by the &#x60;id&#x60; path parameter.
    * @param id The unique identifier of a card. (required)
    * @param idempotency_ref A unique call reference generated by the caller that, taking into consideration the payload as well as the operation itself, helps avoid duplicate operations.  Idempotency reference uniqueness is maintained for at least 24 hours. (optional)
   * @return ManagedCard
   */
  @RequestLine("GET /managed_cards/{id}")
  @Headers({
    "Accept: application/json",
    "idempotency-ref: {idempotency_ref}"  })
  ManagedCard managedCardGet(@Param("id") String id, @Param("idempotency_ref") String idempotency_ref);

  /**
   * Activate physical card
   * Activates the physical card identified by the &#x60;id&#x60; path paramter.
    * @param body  (required)
    * @param id  (required)
    * @param idempotency_ref A unique call reference generated by the caller that, taking into consideration the payload as well as the operation itself, helps avoid duplicate operations.  Idempotency reference uniqueness is maintained for at least 24 hours. (optional)
   * @return ManagedCard
   */
  @RequestLine("POST /managed_cards/{id}/physical/activate")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
    "idempotency-ref: {idempotency_ref}"  })
  ManagedCard managedCardPhysicalActivate(PhysicalActivateBody body, @Param("id") String id, @Param("idempotency_ref") String idempotency_ref);

  /**
   * Get physical card PIN
   * Retrieves the PIN of the physical card identified by the &#x60;id&#x60; path parameter.
    * @param id  (required)
    * @param idempotency_ref A unique call reference generated by the caller that, taking into consideration the payload as well as the operation itself, helps avoid duplicate operations.  Idempotency reference uniqueness is maintained for at least 24 hours. (optional)
   * @return InlineResponse20012
   */
  @RequestLine("GET /managed_cards/{id}/physical/pin")
  @Headers({
    "Accept: application/json",
    "idempotency-ref: {idempotency_ref}"  })
  InlineResponse20012 managedCardPhysicalPinGet(@Param("id") String id, @Param("idempotency_ref") String idempotency_ref);

  /**
   * Unblock physical card PIN
   * Physical cards can be marked as &#x60;pinBlocked&#x60; if there are too many failed PIN attempts.  Use this operation to unblock a PIN so that the card can be used again. 
    * @param id  (required)
    * @param idempotency_ref A unique call reference generated by the caller that, taking into consideration the payload as well as the operation itself, helps avoid duplicate operations.  Idempotency reference uniqueness is maintained for at least 24 hours. (optional)
   */
  @RequestLine("PATCH /managed_cards/{id}/physical/pin/unblock")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
    "idempotency-ref: {idempotency_ref}"  })
  void managedCardPhysicalPinUnBlock(@Param("id") String id, @Param("idempotency_ref") String idempotency_ref);

  /**
   * Replace damaged physical card
   * Report as damaged, and replace the physical card identified by the &#x60;id&#x60; path parameter.
    * @param body  (required)
    * @param id  (required)
    * @param idempotency_ref A unique call reference generated by the caller that, taking into consideration the payload as well as the operation itself, helps avoid duplicate operations.  Idempotency reference uniqueness is maintained for at least 24 hours. (optional)
   */
  @RequestLine("POST /managed_cards/{id}/physical/replace_damaged")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
    "idempotency-ref: {idempotency_ref}"  })
  void managedCardPhysicalReplaceDamaged(PhysicalReplaceDamagedBody body, @Param("id") String id, @Param("idempotency_ref") String idempotency_ref);

  /**
   * Replace lost or stolen physical card
   * Issue a replacement for the physical card, identified by the &#x60;id&#x60; path parameter, that has already been reported as lost or stolen.  Any funds (that are not blocked pending a purchase for a previous authorisation) remaining on the card will be automatically transferred to the new replacement card. 
    * @param body  (required)
    * @param id  (required)
    * @param idempotency_ref A unique call reference generated by the caller that, taking into consideration the payload as well as the operation itself, helps avoid duplicate operations.  Idempotency reference uniqueness is maintained for at least 24 hours. (optional)
   * @return ManagedCard
   */
  @RequestLine("POST /managed_cards/{id}/physical/replace_lost_stolen")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
    "idempotency-ref: {idempotency_ref}"  })
  ManagedCard managedCardPhysicalReplaceLostOrStolen(PhysicalReplaceLostStolenBody body, @Param("id") String id, @Param("idempotency_ref") String idempotency_ref);

  /**
   * Report physical card as lost
   * Report the physical card identified by the &#x60;id&#x60; path parameter as lost. This will deactivate the instrument and a new card will need to be requested.
    * @param id  (required)
    * @param idempotency_ref A unique call reference generated by the caller that, taking into consideration the payload as well as the operation itself, helps avoid duplicate operations.  Idempotency reference uniqueness is maintained for at least 24 hours. (optional)
   */
  @RequestLine("POST /managed_cards/{id}/physical/report_lost")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
    "idempotency-ref: {idempotency_ref}"  })
  void managedCardPhysicalReportLost(@Param("id") String id, @Param("idempotency_ref") String idempotency_ref);

  /**
   * Report physical card as stolen
   * Report the physical card identified by the &#x60;id&#x60; path parameter as stolen. This will destroy the instrument and a new replacement card will need to be requested.  Once a replacement is requested, any funds remaining on this destroyed card will be transferred to the replacement card.\&quot; 
    * @param id  (required)
    * @param idempotency_ref A unique call reference generated by the caller that, taking into consideration the payload as well as the operation itself, helps avoid duplicate operations.  Idempotency reference uniqueness is maintained for at least 24 hours. (optional)
   */
  @RequestLine("POST /managed_cards/{id}/physical/report_stolen")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
    "idempotency-ref: {idempotency_ref}"  })
  void managedCardPhysicalReportStolen(@Param("id") String id, @Param("idempotency_ref") String idempotency_ref);

  /**
   * Upgrade card to physical
   * Upgrades the virtual card identified by the &#x60;id&#x60; path parameter to physical.  Before cards can be upgraded, a physcial card programme must be set up and the card profile configuration updated accordingly. 
    * @param body  (required)
    * @param id  (required)
    * @param idempotency_ref A unique call reference generated by the caller that, taking into consideration the payload as well as the operation itself, helps avoid duplicate operations.  Idempotency reference uniqueness is maintained for at least 24 hours. (optional)
   * @return ManagedCard
   */
  @RequestLine("POST /managed_cards/{id}/physical")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
    "idempotency-ref: {idempotency_ref}"  })
  ManagedCard managedCardPhysicalUpgrade(IdPhysicalBody body, @Param("id") String id, @Param("idempotency_ref") String idempotency_ref);

  /**
   * Remove managed card
   * Destroys the managed card identified by the &#x60;id&#x60; path parameter. Unlike block, this action is not reversible.  A managed card must be empty before it can be destroyed using this operation. 
    * @param id The unique identifier of a managed card. (required)
    * @param idempotency_ref A unique call reference generated by the caller that, taking into consideration the payload as well as the operation itself, helps avoid duplicate operations.  Idempotency reference uniqueness is maintained for at least 24 hours. (optional)
   */
  @RequestLine("POST /managed_cards/{id}/remove")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
    "idempotency-ref: {idempotency_ref}"  })
  void managedCardRemove(@Param("id") String id, @Param("idempotency_ref") String idempotency_ref);

  /**
   * Get managed card spend rules
   * Fetch the list of spend rules associated with the managed card identified by the &#x60;id&#x60; path parameter.
    * @param id  (required)
    * @param idempotency_ref A unique call reference generated by the caller that, taking into consideration the payload as well as the operation itself, helps avoid duplicate operations.  Idempotency reference uniqueness is maintained for at least 24 hours. (optional)
   * @return ManagedCardsSpendRules
   */
  @RequestLine("GET /managed_cards/{id}/spend_rules")
  @Headers({
    "Accept: application/json",
    "idempotency-ref: {idempotency_ref}"  })
  ManagedCardsSpendRules managedCardSpendRulesGet(@Param("id") String id, @Param("idempotency_ref") String idempotency_ref);

  /**
   * Set managed card spend rules
   * Set the spend rules associated with the managed card identified by the &#x60;id&#x60; path parameter.
    * @param body  (required)
    * @param id  (required)
    * @param idempotency_ref A unique call reference generated by the caller that, taking into consideration the payload as well as the operation itself, helps avoid duplicate operations.  Idempotency reference uniqueness is maintained for at least 24 hours. (optional)
   * @return ManagedCardsSpendRules
   */
  @RequestLine("PUT /managed_cards/{id}/spend_rules")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
    "idempotency-ref: {idempotency_ref}"  })
  ManagedCardsSpendRules managedCardSpendRulesSet(ManagedCardsSpendRules body, @Param("id") String id, @Param("idempotency_ref") String idempotency_ref);

  /**
   * Get managed card statement
   * Returns a list of transactions against the managed card identified by the &#x60;id&#x60; path parameter, matching the criteria provided in the request.
    * @param id The unique identifier of a managed card. (required)
    * @param idempotency_ref A unique call reference generated by the caller that, taking into consideration the payload as well as the operation itself, helps avoid duplicate operations.  Idempotency reference uniqueness is maintained for at least 24 hours. (optional)
    * @param accept A request parameter specifying the type of response the client would like. In case this is not specified or specified incorrectly, the default response type (application/json) will be used. (optional)
    * @param paging The offset and number of results to return. Leave out to fetch the first page of results. (optional)
    * @param orderByTimestamp Orders the result in ascending or descending order.   - ASC: Ascending order, oldest transactions first.   - DESC: Descending order, most recent transactions first.  If not specified, the transactions will be returned in descending order.  (optional)
    * @param fromTimestamp Filter for transactions having transaction timestamp after &#x60;fromTimestamp&#x60;. Timestamp is expressed in Epoch timestamp using millisecond precision. (optional)
    * @param toTimestamp Filter for transactions having transaction timestamp before the &#x60;toTimestamp&#x60;. Timestamp is expressed in Epoch timestamp using millisecond precision. (optional)
   * @return Statement
   */
  @RequestLine("GET /managed_cards/{id}/statement?paging={paging}&orderByTimestamp={orderByTimestamp}&fromTimestamp={fromTimestamp}&toTimestamp={toTimestamp}")
  @Headers({
    "Accept: application/json",
    "idempotency-ref: {idempotency_ref}",

    "accept: {accept}"  })
  Statement managedCardStatement(@Param("id") String id, @Param("idempotency_ref") String idempotency_ref, @Param("accept") String accept, @Param("paging") Object paging, @Param("orderByTimestamp") String orderByTimestamp, @Param("fromTimestamp") Long fromTimestamp, @Param("toTimestamp") Long toTimestamp);


    /**
     * Get managed card statement
     * Returns a list of transactions against the managed card identified by the &#x60;id&#x60; path parameter, matching the criteria provided in the request.
     * Note, this is equivalent to the other <code>managedCardStatement</code> method,
     * but with the query parameters collected into a single Map parameter. This
     * is convenient for services with optional query parameters, especially when
     * used with the {@link ManagedCardStatementQueryParams} class that allows for
     * building up this map in a fluent style.
     * @param id The unique identifier of a managed card. (required)
     * @param idempotency_ref A unique call reference generated by the caller that, taking into consideration the payload as well as the operation itself, helps avoid duplicate operations.  Idempotency reference uniqueness is maintained for at least 24 hours. (optional)
     * @param accept A request parameter specifying the type of response the client would like. In case this is not specified or specified incorrectly, the default response type (application/json) will be used. (optional)
     * @param queryParams Map of query parameters as name-value pairs
     *   <p>The following elements may be specified in the query map:</p>
     *   <ul>
     *   <li>paging - The offset and number of results to return. Leave out to fetch the first page of results. (optional)</li>
     *   <li>orderByTimestamp - Orders the result in ascending or descending order.   - ASC: Ascending order, oldest transactions first.   - DESC: Descending order, most recent transactions first.  If not specified, the transactions will be returned in descending order.  (optional)</li>
     *   <li>fromTimestamp - Filter for transactions having transaction timestamp after &#x60;fromTimestamp&#x60;. Timestamp is expressed in Epoch timestamp using millisecond precision. (optional)</li>
     *   <li>toTimestamp - Filter for transactions having transaction timestamp before the &#x60;toTimestamp&#x60;. Timestamp is expressed in Epoch timestamp using millisecond precision. (optional)</li>
     *   </ul>
     * @return Statement
     */
    @RequestLine("GET /managed_cards/{id}/statement?paging={paging}&orderByTimestamp={orderByTimestamp}&fromTimestamp={fromTimestamp}&toTimestamp={toTimestamp}")
    @Headers({
    "Accept: application/json",
        "idempotency-ref: {idempotency_ref}",

        "accept: {accept}"    })
    Statement managedCardStatement
    (@Param("id") String id, @Param("idempotency_ref") String idempotency_ref, @Param("accept") String accept, @QueryMap(encoded=true)
    MultiValueMap<String, String> queryParams);

  /**
   * Unblock managed card
   * Unblocks the managed card identified by the &#x60;id&#x60; path parameter. The managed card must have &#x60;state.blockedReason&#x60; as &#x60;USER&#x60; so that it can be unblocked. If the managed card was blocked by &#x60;SYSTEM&#x60;, users cannot unblock it. 
    * @param id The unique identifier of the managed card. (required)
    * @param idempotency_ref A unique call reference generated by the caller that, taking into consideration the payload as well as the operation itself, helps avoid duplicate operations.  Idempotency reference uniqueness is maintained for at least 24 hours. (optional)
   */
  @RequestLine("POST /managed_cards/{id}/unblock")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
    "idempotency-ref: {idempotency_ref}"  })
  void managedCardUnblock(@Param("id") String id, @Param("idempotency_ref") String idempotency_ref);

  /**
   * Update managed card
   * Update the details of the managed card identified by the &#x60;id&#x60; path parameter.
    * @param body  (required)
    * @param id The unique identifier of a card. (required)
    * @param idempotency_ref A unique call reference generated by the caller that, taking into consideration the payload as well as the operation itself, helps avoid duplicate operations.  Idempotency reference uniqueness is maintained for at least 24 hours. (optional)
   * @return ManagedCard
   */
  @RequestLine("PATCH /managed_cards/{id}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
    "idempotency-ref: {idempotency_ref}"  })
  ManagedCard managedCardUpdate(ManagedCardsIdBody body, @Param("id") String id, @Param("idempotency_ref") String idempotency_ref);

  /**
   * Get managed cards
   * Fetch cards matching the search criteria provided.
    * @param idempotency_ref A unique call reference generated by the caller that, taking into consideration the payload as well as the operation itself, helps avoid duplicate operations.  Idempotency reference uniqueness is maintained for at least 24 hours. (optional)
    * @param paging The offset and number of results to return. Leave out to fetch the first page of results. (optional)
    * @param profileId Filter by the managed card profile. Leave out to fetch all managed cards. (optional)
    * @param friendlyName Filter by the managed card friendly name. Leave out to fetch all managed cards. The exact name must be provided, as wildcards are not supported. (optional)
    * @param state  (optional)
    * @param state_blockedReason  (optional)
    * @param state_destroyedReason  (optional)
    * @param currency Filter by the managed card currency. Currencies are expressed as an ISO 4217 code. Leave out to fetch all managed cards. (optional)
    * @param type Filter by the type of the card. (optional)
    * @param externalHandle Search by the card&#x27;s &#x60;externalHandle&#x60;. (optional)
    * @param cardNumberFirstSix Filter by first six digits of the card. (optional)
    * @param cardNumberLastFour Filter by last four digits of the card. (optional)
    * @param createdFrom Filter for managed cards created after &#x60;createdFrom&#x60; timestamp. Timestamp is expressed in Epoch timestamp using millisecond precision. Leave out to fetch all managed cards. (optional)
    * @param createdTo Filter for managed cards created before &#x60;createdTo&#x60; timestamp. Timestamp is expressed in Epoch timestamp using millisecond precision. Leave out to fetch all managed cards. (optional)
    * @param mode Filter by card mode (prepaid mode or debit mode). (optional)
    * @param tag Filter by the managed card tag. The exact tag must be provided, as wildcards are not supported. Leave out to fetch all managed cards. (optional)
    * @param parentManagedAccountId Filter by the Id of the parent managed account associated with the card. This is applicable only for debit mode cards. (optional)
    * @param manufacturingState  (optional)
   * @return InlineResponse2002
   */
  @RequestLine("GET /managed_cards?paging={paging}&profileId={profileId}&friendlyName={friendlyName}&state={state}&state.blockedReason={state_blockedReason}&state.destroyedReason={state_destroyedReason}&currency={currency}&type={type}&externalHandle={externalHandle}&cardNumberFirstSix={cardNumberFirstSix}&cardNumberLastFour={cardNumberLastFour}&createdFrom={createdFrom}&createdTo={createdTo}&mode={mode}&tag={tag}&parentManagedAccountId={parentManagedAccountId}&manufacturingState={manufacturingState}")
  @Headers({
    "Accept: application/json",
    "idempotency-ref: {idempotency_ref}"  })
  InlineResponse2002 managedCardsGet(@Param("idempotency_ref") String idempotency_ref, @Param("paging") Object paging, @Param("profileId") String profileId, @Param("friendlyName") String friendlyName, @Param("state") List state, @Param("state_blockedReason") List state_blockedReason, @Param("state_destroyedReason") List state_destroyedReason, @Param("currency") String currency, @Param("type") String type, @Param("externalHandle") String externalHandle, @Param("cardNumberFirstSix") String cardNumberFirstSix, @Param("cardNumberLastFour") String cardNumberLastFour, @Param("createdFrom") Long createdFrom, @Param("createdTo") Long createdTo, @Param("mode") String mode, @Param("tag") String tag, @Param("parentManagedAccountId") String parentManagedAccountId, @Param("manufacturingState") List manufacturingState);


    /**
     * Get managed cards
     * Fetch cards matching the search criteria provided.
     * Note, this is equivalent to the other <code>managedCardsGet</code> method,
     * but with the query parameters collected into a single Map parameter. This
     * is convenient for services with optional query parameters, especially when
     * used with the {@link ManagedCardsGetQueryParams} class that allows for
     * building up this map in a fluent style.
     * @param idempotency_ref A unique call reference generated by the caller that, taking into consideration the payload as well as the operation itself, helps avoid duplicate operations.  Idempotency reference uniqueness is maintained for at least 24 hours. (optional)
     * @param queryParams Map of query parameters as name-value pairs
     *   <p>The following elements may be specified in the query map:</p>
     *   <ul>
     *   <li>paging - The offset and number of results to return. Leave out to fetch the first page of results. (optional)</li>
     *   <li>profileId - Filter by the managed card profile. Leave out to fetch all managed cards. (optional)</li>
     *   <li>friendlyName - Filter by the managed card friendly name. Leave out to fetch all managed cards. The exact name must be provided, as wildcards are not supported. (optional)</li>
     *   <li>state -  (optional)</li>
     *   <li>state_blockedReason -  (optional)</li>
     *   <li>state_destroyedReason -  (optional)</li>
     *   <li>currency - Filter by the managed card currency. Currencies are expressed as an ISO 4217 code. Leave out to fetch all managed cards. (optional)</li>
     *   <li>type - Filter by the type of the card. (optional)</li>
     *   <li>externalHandle - Search by the card&#x27;s &#x60;externalHandle&#x60;. (optional)</li>
     *   <li>cardNumberFirstSix - Filter by first six digits of the card. (optional)</li>
     *   <li>cardNumberLastFour - Filter by last four digits of the card. (optional)</li>
     *   <li>createdFrom - Filter for managed cards created after &#x60;createdFrom&#x60; timestamp. Timestamp is expressed in Epoch timestamp using millisecond precision. Leave out to fetch all managed cards. (optional)</li>
     *   <li>createdTo - Filter for managed cards created before &#x60;createdTo&#x60; timestamp. Timestamp is expressed in Epoch timestamp using millisecond precision. Leave out to fetch all managed cards. (optional)</li>
     *   <li>mode - Filter by card mode (prepaid mode or debit mode). (optional)</li>
     *   <li>tag - Filter by the managed card tag. The exact tag must be provided, as wildcards are not supported. Leave out to fetch all managed cards. (optional)</li>
     *   <li>parentManagedAccountId - Filter by the Id of the parent managed account associated with the card. This is applicable only for debit mode cards. (optional)</li>
     *   <li>manufacturingState -  (optional)</li>
     *   </ul>
     * @return InlineResponse2002
     */
    @RequestLine("GET /managed_cards?paging={paging}&profileId={profileId}&friendlyName={friendlyName}&state={state}&state.blockedReason={state_blockedReason}&state.destroyedReason={state_destroyedReason}&currency={currency}&type={type}&externalHandle={externalHandle}&cardNumberFirstSix={cardNumberFirstSix}&cardNumberLastFour={cardNumberLastFour}&createdFrom={createdFrom}&createdTo={createdTo}&mode={mode}&tag={tag}&parentManagedAccountId={parentManagedAccountId}&manufacturingState={manufacturingState}")
    @Headers({
    "Accept: application/json",
        "idempotency-ref: {idempotency_ref}"    })
    InlineResponse2002 managedCardsGet
    (@Param("idempotency_ref") String idempotency_ref, @QueryMap(encoded=true)
    MultiValueMap<String, String> queryParams);

}
