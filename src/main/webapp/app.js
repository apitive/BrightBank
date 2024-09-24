/*
 * Use App.getDependency for Dependency Injection
 * eg: var DialogService = App.getDependency('DialogService');
 */

/* perform any action on the variables within this block(on-page-load) */
App.onAppVariablesReady = function() {
    /*
     * variables can be accessed through 'App.Variables' property here
     * e.g. App.Variables.staticVariable1.getData()
     */
    window.OpcUxSecureClient.init("qUhpchEnlRYBeqOUIIAADQ==");
};

/* perform any action on session timeout here, e.g clearing some data, etc */
App.onSessionTimeout = function() {
    /*
     * NOTE:
     * On re-login after session timeout:
     * if the same user logs in(through login dialog), app will retain its state
     * if a different user logs in, app will be reloaded and user is redirected to respective landing page configured in Security.
     */
};

/*
 * This application level callback function will be invoked after the invocation of PAGE level onPageReady function.
 * Use this function to write common logic across the pages in the application.
 * activePageName : name of the page
 * activePageScope: scope of the page
 * $activePageEl  : page jQuery element
 */
App.onPageReady = function(activePageName, activePageScope, $activePageEl) {

};

/*
 * This application level callback function will be invoked after a Variable receives an error from the target service.
 * Use this function to write common error handling logic across the application.
 * errorMsg:    The error message returned by the target service. This message will be displayed through appNotification variable
 *              You can change this though App.Variables.appNotification.setMessage(YOUR_CUSTOM_MESSAGE)
 * xhrObj:      The xhrObject used to make the service call
 *              This object contains useful information like statusCode, url, request/response body.
 */
App.onServiceError = function(errorMsg, xhrObj) {

};

App.loginActiononSuccess = function(variable, data) {
    debugger
    App.Variables.getSecurityInfo.invoke();
    if (App.Variables.loggedInUser.dataSet.userAttributes.userType == "NEW") {
        App.Variables.consumerRootUserMobileVerificationCodeSend.invoke({}, function(data) {
            console.log(data);
        });
    } else {
        App.Actions.goToPage_Dashboard.navigate();
    }
};

App.onBeforeServiceCall = function(requestParams) {
    if (requestParams.url.includes('j_spring_security_check')) {
        debugger
        var dataset = App.Variables.AddedConsumerInfo.dataSet;
        if (dataset.data != "") {
            //Adding this for newly created user
            requestParams.headers.set("UserId", dataset.endUserId);
        }
    } else if (requestParams.url.includes('/services/weavrLogin') && !requestParams.url.includes('/verification/email')) {
        debugger
        requestParams.headers.set("authorization", App.Variables.loggedInUser.dataSet.userAttributes.authtoken);
    } else if (requestParams.url.includes('ApplyManagedCard/weavr')) {
        debugger
        requestParams.headers.set("authorization", App.Variables.loggedInUser.dataSet.userAttributes.authtoken);
    } else if (requestParams.url.includes('/wvrCards/managed_cards') || requestParams.url.includes('manageCards/allManagedCards')) {
        debugger
        requestParams.headers.set("api-key", "vrdO4T5327wBeqOUIIABDQ==");
        requestParams.headers.set("authorization", App.Variables.loggedInUser.dataSet.userAttributes.authtoken);
    }
    return requestParams;
};

App.GetConsumerKyconSuccess = function(variable, data) {
    debugger
    if (data.fullDueDiligence == "APPROVED") {
        App.Actions.goToPage_Dashboard.navigate();
    }
};