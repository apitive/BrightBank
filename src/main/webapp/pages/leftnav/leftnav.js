/*
 * Use App.getDependency for Dependency Injection
 * eg: var DialogService = App.getDependency('DialogService');
 */

/* perform any action on widgets/variables within this block */
Partial.onReady = function() {
    /*
     * variables can be accessed through 'Partial.Variables' property here
     * e.g. to get dataSet in a staticVariable named 'loggedInUser' use following script
     * Partial.Variables.loggedInUser.getData()
     *
     * widgets can be accessed through 'Partial.Widgets' property here
     * e.g. to get value of text widget named 'username' use following script
     * 'Partial.Widgets.username.datavalue'
     */
    var activeEle = $('a.active').attr('name');
    if (activeEle.includes('dashboard')) {
        $('a.active .anchor-image-icon').attr('src', './resources/images/logos/icon-dashboard-active.png');
    } else if (activeEle.includes('order')) {
        $('a.active .anchor-image-icon').attr('src', './resources/images/logos/icon-accounts-active.png');
    } else if (activeEle.includes('support')) {
        $('a.active .anchor-image-icon').attr('src', './resources/images/logos/icons-cards-active.png');
    }
};
Partial.dashboardLinkMouseenter = function($event, widget) {
    Partial.Widgets.dashboardLink.iconurl = "./resources/images/logos/icon-dashboard-active.png";
};
Partial.dashboardLinkMouseleave = function($event, widget) {

    var activeEle = $('a.active').attr('name');
    if (activeEle.includes('dashboard')) {
        $('a.active .anchor-image-icon').attr('src', './resources/images/logos/icon-dashboard-active.png');
    } else {
        Partial.Widgets.dashboardLink.iconurl = "./resources/images/imagelists/icon-dashboard-normal.png";
    }
};
Partial.supportLinkMouseenter = function($event, widget) {
    Partial.Widgets.supportLink.iconurl = "./resources/images/logos/icons-cards-active.png";
};
Partial.supportLinkMouseleave = function($event, widget) {
    var activeEle = $('a.active').attr('name');
    if (activeEle.includes('support')) {
        $('a.active .anchor-image-icon').attr('src', './resources/images/logos/icons-cards-active.png');
    } else {
        Partial.Widgets.supportLink.iconurl = "./resources/images/imagelists/icons-cards-normal.png";
    }
};
Partial.orderLinkMouseenter = function($event, widget) {
    Partial.Widgets.orderLink.iconurl = "./resources/images/logos/icon-accounts-active.png";
};
Partial.orderLinkMouseleave = function($event, widget) {
    var activeEle = $('a.active').attr('name');
    if (activeEle.includes('order')) {
        $('a.active .anchor-image-icon').attr('src', './resources/images/logos/icon-accounts-active.png');
    } else {
        Partial.Widgets.orderLink.iconurl = "./resources/images/imagelists/icon-accounts-normal.png";
    }
};