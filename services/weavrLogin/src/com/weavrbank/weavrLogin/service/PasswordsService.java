package com.weavrbank.weavrLogin.service;


import com.weavrbank.weavrLogin.model.*;
import com.weavrbank.weavrLogin.model.Error;
import com.weavrbank.weavrLogin.model.InlineResponse20010;
import com.weavrbank.weavrLogin.model.InlineResponse2006;
import com.weavrbank.weavrLogin.model.InlineResponse40910;
import com.weavrbank.weavrLogin.model.InlineResponse40924;
import com.weavrbank.weavrLogin.model.InlineResponse40933;
import com.weavrbank.weavrLogin.model.InlineResponse40934;
import com.weavrbank.weavrLogin.model.InlineResponse40944;
import com.weavrbank.weavrLogin.model.LostPasswordResumeBody;
import com.weavrbank.weavrLogin.model.LostPasswordStartBody;
import com.weavrbank.weavrLogin.model.PasswordsUpdateBody;
import com.weavrbank.weavrLogin.model.PasswordsValidateBody;
import com.weavrbank.weavrLogin.model.TokenResponse;
import com.weavrbank.weavrLogin.model.UserIdCreateBody;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.lang.Object;
import org.springframework.util.MultiValueMap;
import feign.*;

public interface PasswordsService {

  /**
   * Initiate lost password process
   * Initiate the lost password process.  If the email address provided is associated with an active user, an email will be sent, containing a URL that redirects the user to change their password. The URL contains request parameters for all of the parameters required to change the password for the user via the &#x60;/passwords/lost_password/resume&#x60; POST endpoint. 
    * @param body  (required)
    * @param idempotency_ref A unique call reference generated by the caller that, taking into consideration the payload as well as the operation itself, helps avoid duplicate operations.  Idempotency reference uniqueness is maintained for at least 24 hours. (optional)
   */
  @RequestLine("POST /passwords/lost_password/start")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
    "idempotency-ref: {idempotency_ref}"  })
  void lostPasswordInitiate(LostPasswordStartBody body, @Param("idempotency_ref") String idempotency_ref);

  /**
   * Resume lost password process
   * This is the second and final step in updating the password of a user who forgot their password.
    * @param body  (required)
    * @param idempotency_ref A unique call reference generated by the caller that, taking into consideration the payload as well as the operation itself, helps avoid duplicate operations.  Idempotency reference uniqueness is maintained for at least 24 hours. (optional)
   * @return TokenResponse
   */
  @RequestLine("POST /passwords/lost_password/resume")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
    "idempotency-ref: {idempotency_ref}"  })
  TokenResponse lostPasswordResume(LostPasswordResumeBody body, @Param("idempotency_ref") String idempotency_ref);

  /**
   * Create password
   * Create a new password for the user identified by the &#x60;user_id&#x60; path parameter.
    * @param body  (required)
    * @param user_id The user Id for which this password is to be created. (required)
    * @param idempotency_ref A unique call reference generated by the caller that, taking into consideration the payload as well as the operation itself, helps avoid duplicate operations.  Idempotency reference uniqueness is maintained for at least 24 hours. (optional)
   * @return InlineResponse20010
   */
  @RequestLine("POST /passwords/{user_id}/create")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
    "idempotency-ref: {idempotency_ref}"  })
  InlineResponse20010 passwordCreate(UserIdCreateBody body, @Param("user_id") String user_id, @Param("idempotency_ref") String idempotency_ref);

  /**
   * Update password
   * Update the password for the logged-in user.
    * @param body  (required)
    * @param idempotency_ref A unique call reference generated by the caller that, taking into consideration the payload as well as the operation itself, helps avoid duplicate operations.  Idempotency reference uniqueness is maintained for at least 24 hours. (optional)
   * @return InlineResponse2006
   */
  @RequestLine("POST /passwords/update")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
    "idempotency-ref: {idempotency_ref}"  })
  InlineResponse2006 passwordUpdate(PasswordsUpdateBody body, @Param("idempotency_ref") String idempotency_ref);

  /**
   * Validate password
   * Check that a password adheres to all complexity checks.
    * @param body  (required)
    * @param idempotency_ref A unique call reference generated by the caller that, taking into consideration the payload as well as the operation itself, helps avoid duplicate operations.  Idempotency reference uniqueness is maintained for at least 24 hours. (optional)
   */
  @RequestLine("POST /passwords/validate")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
    "idempotency-ref: {idempotency_ref}"  })
  void passwordValidate(PasswordsValidateBody body, @Param("idempotency_ref") String idempotency_ref);

}
