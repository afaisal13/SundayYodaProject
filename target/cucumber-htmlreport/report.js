$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("NewtoursRegister.feature");
formatter.feature({
  "line": 2,
  "name": "Users ability to create account",
  "description": "",
  "id": "users-ability-to-create-account",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@newtour"
    },
    {
      "line": 1,
      "name": "@regression"
    }
  ]
});
formatter.scenarioOutline({
  "line": 4,
  "name": "User should able to create account using Register",
  "description": "",
  "id": "users-ability-to-create-account;user-should-able-to-create-account-using-register",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 6,
  "name": "Browse to Newtours homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "Navigate to Register page",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "Fill form with some basic information",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "Complete creating account \"\u003cUserName\u003e\" with \"\u003cPassword\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "Verify account created successfully",
  "keyword": "Then "
});
formatter.examples({
  "line": 12,
  "name": "",
  "description": "",
  "id": "users-ability-to-create-account;user-should-able-to-create-account-using-register;",
  "rows": [
    {
      "cells": [
        "UserName",
        "Password"
      ],
      "line": 13,
      "id": "users-ability-to-create-account;user-should-able-to-create-account-using-register;;1"
    },
    {
      "cells": [
        "Wasim",
        "Akram"
      ],
      "line": 14,
      "id": "users-ability-to-create-account;user-should-able-to-create-account-using-register;;2"
    },
    {
      "cells": [
        "Sachin",
        "Tendulkar"
      ],
      "line": 15,
      "id": "users-ability-to-create-account;user-should-able-to-create-account-using-register;;3"
    },
    {
      "cells": [
        "Mashrafe",
        "Mortaza"
      ],
      "line": 16,
      "id": "users-ability-to-create-account;user-should-able-to-create-account-using-register;;4"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 3238134868,
  "status": "passed"
});
formatter.scenario({
  "line": 14,
  "name": "User should able to create account using Register",
  "description": "",
  "id": "users-ability-to-create-account;user-should-able-to-create-account-using-register;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@regression"
    },
    {
      "line": 1,
      "name": "@newtour"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "Browse to Newtours homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "Navigate to Register page",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "Fill form with some basic information",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "Complete creating account \"Wasim\" with \"Akram\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "Verify account created successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "NewtoursRegisterSteps.browse_to_Newtours_homepage()"
});
formatter.result({
  "duration": 4733420165,
  "status": "passed"
});
formatter.match({
  "location": "NewtoursRegisterSteps.navigate_to_Register_page()"
});
formatter.result({
  "duration": 2769775608,
  "status": "passed"
});
formatter.match({
  "location": "NewtoursRegisterSteps.fill_form_with_some_basic_information()"
});
formatter.result({
  "duration": 6378972324,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Wasim",
      "offset": 27
    },
    {
      "val": "Akram",
      "offset": 40
    }
  ],
  "location": "NewtoursRegisterSteps.complete_creating_account_with(String,String)"
});
formatter.result({
  "duration": 1832253303,
  "status": "passed"
});
formatter.match({
  "location": "NewtoursRegisterSteps.verify_account_created_successfully()"
});
formatter.result({
  "duration": 1461988708,
  "status": "passed"
});
formatter.after({
  "duration": 696398090,
  "status": "passed"
});
formatter.before({
  "duration": 2589088142,
  "status": "passed"
});
formatter.scenario({
  "line": 15,
  "name": "User should able to create account using Register",
  "description": "",
  "id": "users-ability-to-create-account;user-should-able-to-create-account-using-register;;3",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@regression"
    },
    {
      "line": 1,
      "name": "@newtour"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "Browse to Newtours homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "Navigate to Register page",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "Fill form with some basic information",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "Complete creating account \"Sachin\" with \"Tendulkar\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "Verify account created successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "NewtoursRegisterSteps.browse_to_Newtours_homepage()"
});
formatter.result({
  "duration": 4432500177,
  "status": "passed"
});
formatter.match({
  "location": "NewtoursRegisterSteps.navigate_to_Register_page()"
});
formatter.result({
  "duration": 2742499229,
  "status": "passed"
});
formatter.match({
  "location": "NewtoursRegisterSteps.fill_form_with_some_basic_information()"
});
formatter.result({
  "duration": 3500037087,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Sachin",
      "offset": 27
    },
    {
      "val": "Tendulkar",
      "offset": 41
    }
  ],
  "location": "NewtoursRegisterSteps.complete_creating_account_with(String,String)"
});
formatter.result({
  "duration": 3205733497,
  "status": "passed"
});
formatter.match({
  "location": "NewtoursRegisterSteps.verify_account_created_successfully()"
});
formatter.result({
  "duration": 1585580979,
  "status": "passed"
});
formatter.after({
  "duration": 744438478,
  "status": "passed"
});
formatter.before({
  "duration": 3868016288,
  "status": "passed"
});
formatter.scenario({
  "line": 16,
  "name": "User should able to create account using Register",
  "description": "",
  "id": "users-ability-to-create-account;user-should-able-to-create-account-using-register;;4",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@regression"
    },
    {
      "line": 1,
      "name": "@newtour"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "Browse to Newtours homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "Navigate to Register page",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "Fill form with some basic information",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "Complete creating account \"Mashrafe\" with \"Mortaza\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "Verify account created successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "NewtoursRegisterSteps.browse_to_Newtours_homepage()"
});
formatter.result({
  "duration": 4177607153,
  "status": "passed"
});
formatter.match({
  "location": "NewtoursRegisterSteps.navigate_to_Register_page()"
});
formatter.result({
  "duration": 1322113180,
  "status": "passed"
});
formatter.match({
  "location": "NewtoursRegisterSteps.fill_form_with_some_basic_information()"
});
formatter.result({
  "duration": 5129009760,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Mashrafe",
      "offset": 27
    },
    {
      "val": "Mortaza",
      "offset": 43
    }
  ],
  "location": "NewtoursRegisterSteps.complete_creating_account_with(String,String)"
});
formatter.result({
  "duration": 1573609603,
  "status": "passed"
});
formatter.match({
  "location": "NewtoursRegisterSteps.verify_account_created_successfully()"
});
formatter.result({
  "duration": 1427068692,
  "status": "passed"
});
formatter.after({
  "duration": 731269124,
  "status": "passed"
});
});