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

    var googlePlacesUrl = "https://maps.googleapis.com/maps/api/js?key=" + Prefab.apikey + "&libraries=places";

    if (!(typeof google !== "undefined" && google !== null ? google.maps : void 0)) {
        jQuery.cachedScript(googlePlacesUrl).then(initAutocomplete);
    } else {
        initAutocomplete();
    }

};

function initAutocomplete() {
    var autocomplete = new google.maps.places.Autocomplete($('[name=street_formWidget')[1]);

    autocomplete.addListener('place_changed', function() {

        // $('.pac-container').css('z-index', 2000);

        var place = autocomplete.getPlace();
        var streetAddr = "";
        Prefab.Widgets.AddressDetailsForm1.formWidgets.postalCode.datavalue = "";
        Prefab.Widgets.AddressDetailsForm1.formWidgets.country.datavalue = "";
        Prefab.Widgets.AddressDetailsForm1.formWidgets.city.datavalue = "";
        Prefab.Widgets.AddressDetailsForm1.formWidgets.state.datavalue = "";
        Prefab.Widgets.AddressDetailsForm1.formWidgets.buildingOrAddressLine2.datavalue = "";
        Prefab.Widgets.AddressDetailsForm1.formWidgets.street.datavalue = "";
        if (place.address_components) {
            for (var i = 0; i < place.address_components.length; i++) {

                var addr = place.address_components[i];

                if (addr.types.includes("postal_code")) {
                    Prefab.Widgets.AddressDetailsForm1.formWidgets.postalCode.datavalue = addr.short_name;
                }

                if (addr.types.includes("country")) {
                    Prefab.Widgets.AddressDetailsForm1.formWidgets.country.datavalue = addr.short_name;
                }

                if (addr.types.includes("locality") || addr.types.includes("postal_town")) {
                    Prefab.Widgets.AddressDetailsForm1.formWidgets.city.datavalue = addr.short_name;
                }

                if (addr.types.includes("administrative_area_level_1")) {
                    Prefab.Widgets.AddressDetailsForm1.formWidgets.state.datavalue = addr.long_name;
                }
                if (addr.types.includes("street_number")) {
                    streetAddr = streetAddr == "" ? streetAddr + addr.short_name : streetAddr + ', ' + addr.short_name;
                    Prefab.Widgets.AddressDetailsForm1.formWidgets.buildingOrAddressLine2.datavalue = addr.short_name;
                }
                if (addr.types.includes("route")) {
                    streetAddr = streetAddr == "" ? streetAddr + addr.short_name : streetAddr + ', ' + addr.short_name;
                }
                if (addr.types.includes("sublocality_level_1")) {
                    streetAddr = streetAddr == "" ? streetAddr + addr.short_name : streetAddr + ', ' + addr.short_name;
                }
                if (addr.types.includes("sublocality_level_2")) {
                    streetAddr = streetAddr == "" ? streetAddr + addr.short_name : streetAddr + ', ' + addr.short_name;
                }
                if (addr.types.includes("sublocality_level_3")) {
                    streetAddr = streetAddr == "" ? streetAddr + addr.short_name : streetAddr + ', ' + addr.short_name;
                }

                Prefab.Widgets.AddressDetailsForm1.formWidgets.street.datavalue = streetAddr;
            }
        }
    });
}
Prefab.streetFocus = function($event, widget) {
    setTimeout(function() {
        $('.pac-container').attr('style', 'z-index: 2000;');
    });
};

Prefab.streetClick = function($event, widget) {
    setTimeout(function() {
        $('.pac-container').attr('style', 'z-index: 2000;');
    });
};