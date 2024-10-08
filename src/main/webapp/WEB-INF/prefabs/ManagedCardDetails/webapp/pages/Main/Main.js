/*
 * Use App.getDependency for Dependency Injection
 * eg: var DialogService = App.getDependency('DialogService');
 */

/*
 * This function will be invoked when any of this prefab's property is changed
 * @key: property name
 * @newVal: new value of the property
 * @oldVal: old value of the property
 */
Prefab.onPropertyChange = function(key, newVal, oldVal) {
    /*
    switch (key) {
        case "prop1":
            // do something with newVal for property 'prop1'
            break;
        case "prop2":
            // do something with newVal for property 'prop2'
            break;
    }
    */
};

Prefab.onReady = function() {
    // this method will be triggered post initialization of the prefab.
    // window.OpcUxSecureClient.init(Prefab.uikey);
};

Prefab.calculateExpiryDate = function(expiryDate) {
    return expiryDate.substring(0, 2) + '/' + expiryDate.substring(2, 4);
};
Prefab.getAllManagedCardsList1Render = function(widget, $data) {
    debugger
    if (Prefab.servicehost == "APIVendor(W)") {
        $('[name="card1"]').css('box-shadow', 'none');
        var token = "Bearer " + Prefab.authtoken;
        window.OpcUxSecureClient.associate(token,
            function() {
                console.log('associate success');

                // Create an instance of a CVV UI component
                // Replace the {{cvv_token}} with the tokenised CVV received using the server-side API call
                var span = window.OpcUxSecureClient.span("cvv", $data[0].cardCVV);

                // Embed the CVV component in the HTML element where you want
                // the CVV to be shown
                span.mount(document.getElementById('cvv'));
            },

            // Handle errors
            function(e) {
                console.error('associate failed ' + e);
            }
        );

        window.OpcUxSecureClient.associate(token,
            function() {
                console.log('associate success');

                // Create an instance of a card number component
                // Replace the {{cardnumber_token}} with the tokenised card number received using 
                // the server-side API call
                var span = window.OpcUxSecureClient.span("cardNumber", $data[0].cardNumber, {
                    style: {
                        fontSize: '20.2px',
                        fontFamily: 'monospace'
                    }
                });

                // Embed the card number component in the HTML element where you want
                // the card number to be shown
                span.mount(document.getElementById('cardNumber'));
            },

            // Handle errors
            function(e) {
                console.error('associate failed ' + e);
            }
        );
    }
};
Prefab.buttonFundCardClick = function($event, widget) {
    Prefab.onFundcardclick();
};
Prefab.buttonTransferFundsClick = function($event, widget) {
    Prefab.onFundcardclick();
};
Prefab.buttonChangeSpendLimitClick = function($event, widget) {
    Prefab.onChangespendlimit();
};

/*
 * Refresh card details after funding the card
 */
Prefab.refreshCards = function() {
    Prefab.Variables.getManagedCardById.invoke();
};