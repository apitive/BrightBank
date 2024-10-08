/*
 * Use App.getDependency for Dependency Injection
 * eg: var DialogService = App.getDependency('DialogService');
 */

/* perform any action on widgets/variables within this block */
Page.onReady = function() {
    /*
     * variables can be accessed through 'Page.Variables' property here
     * e.g. to get dataSet in a staticVariable named 'loggedInUser' use following script
     * Page.Variables.loggedInUser.getData()
     *
     * widgets can be accessed through 'Page.Widgets' property here
     * e.g. to get value of text widget named 'username' use following script
     * 'Page.Widgets.username.datavalue'
     */
    Page.Variables.managedAccountsGet.invoke({}, function(data) {
        if (data.count > 0) {
            Page.Widgets.container4.content = "PartialExistingUserDashboard";
        } else {
            Page.Widgets.container4.content = "PartialNewUserDashboard";
            $('.app-page-content').addClass('login-screen');
        }
    });
};