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
    App.Variables.consumerGet.invoke();
    debugger
    if (Partial.Viewport.isMobileType) {
        Partial.Widgets.listAccounts.pagesize = 1;
        Partial.Widgets.listCards.pagesize = 1;
    }
};

Partial.getGreetingTime = function() {
    var ndate = new Date();
    var hours = ndate.getHours();
    var message = hours < 12 ? 'Good Morning!' : hours < 18 ? 'Good Afternoon!' : 'Good Evening!';
    return message;
};

Partial.maskAccountNumber = function(accountNumber) {
    var num = accountNumber.substring(0, 10);
    return num.replace(new RegExp("[0-9]{0,1}", "g"), "X") + '-' + accountNumber.substring(14, 18);
};

Partial.getCurrencyAmount = function(item) {
    var amount = Math.abs(item.transactionAmount.amount);
    if (item.transactionAmount.currency == 'GBP') {
        return "£ " + amount + ".00";
    } else {
        if (item.transactionAmount.currency == 'USD') {
            return "$ " + amount + ".00";
        } else {
            return "€ " + amount + ".00";
        }
    }
};
Partial.listAccountsSelect = function(widget, $data) {

    App.Actions.goToPage_AccountTransactions.invoke({
        data: {
            accountId: $data.id
        }
    });
};