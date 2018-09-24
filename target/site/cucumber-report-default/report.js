$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("PaymentFunction.feature");
formatter.feature({
  "line": 2,
  "name": "PAYMENT FEATURE",
  "description": "As an Automation Tester\nI want to check payment process\nSo that I can make sure this function work well",
  "id": "payment-feature",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@payment"
    }
  ]
});
formatter.scenario({
  "line": 7,
  "name": "[PRE-DATA] - REGISTER/ LOGIN",
  "description": "",
  "id": "payment-feature;[pre-data]---register/-login",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 8,
  "name": "I input to \"uid\" textbox with data \"mngr152935\"",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "I input to \"password\" textbox with data \"heqamYg \"",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "I click to \"btnLogin\" button",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "I verify Homepage displayed with message \"Welcome To Manager\u0027s Page of Guru99 Bank\"",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "uid",
      "offset": 12
    },
    {
      "val": "mngr152935",
      "offset": 36
    }
  ],
  "location": "AbstractPageSteps.iInputToTextboxWithData(String,String)"
});
formatter.result({
  "duration": 12126558514,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "password",
      "offset": 12
    },
    {
      "val": "heqamYg ",
      "offset": 41
    }
  ],
  "location": "AbstractPageSteps.iInputToTextboxWithData(String,String)"
});
formatter.result({
  "duration": 75352048,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "btnLogin",
      "offset": 12
    }
  ],
  "location": "AbstractPageSteps.clickToDynamicButton(String)"
});
formatter.result({
  "duration": 1220722049,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Welcome To Manager\u0027s Page of Guru99 Bank",
      "offset": 42
    }
  ],
  "location": "HomePageSteps.iVerifyHomepageDisplayedWithMessage(String)"
});
formatter.result({
  "duration": 2095187535,
  "status": "passed"
});
formatter.scenarioOutline({
  "line": 13,
  "name": "[TC_01] - CREATE NEW CUSTOMER",
  "description": "",
  "id": "payment-feature;[tc-01]---create-new-customer",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 14,
  "name": "I open \"New Customer\" page",
  "keyword": "Given "
});
formatter.step({
  "line": 15,
  "name": "I input to \"name\" textbox with data \"\u003cCustomerName\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 16,
  "name": "I click to \"\u003cGender\u003e\" radio button",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "I input to \"dob\" textbox with data \"\u003cDateOfBirth\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "I input to \"addr\" text area with data \"\u003cAddress\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "I input to \"city\" textbox with data \"\u003cCity\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "I input to \"state\" textbox with data \"\u003cState\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "I input to \"pinno\" textbox with data \"\u003cPin\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "I input to \"telephoneno\" textbox with data \"\u003cPhone\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "I input to \"emailid\" textbox with random data \"\u003cEmail\u003e@gmail.com\"",
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "I input to \"password\" textbox with data \"\u003cPassword\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 25,
  "name": "I click to \"sub\" button",
  "keyword": "And "
});
formatter.step({
  "line": 26,
  "name": "I get infor of Customer ID",
  "keyword": "And "
});
formatter.step({
  "line": 27,
  "name": "Verify created successfully with message \"Customer Registered Successfully!!!\"",
  "keyword": "Then "
});
formatter.step({
  "line": 28,
  "name": "I verify expected data at \"Customer Name\" text in table with actual data \"\u003cCustomerName\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 29,
  "name": "I verify expected data at \"Birthdate\" text in table with actual data \"\u003cDateOfBirth\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 30,
  "name": "I verify expected data at \"Address\" text in table with actual data \"\u003cAddress\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 31,
  "name": "I verify expected data at \"City\" text in table with actual data \"\u003cCity\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 32,
  "name": "I verify expected data at \"State\" text in table with actual data \"\u003cState\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 33,
  "name": "I verify expected data at \"Pin\" text in table with actual data \"\u003cPin\u003e\"",
  "keyword": "And "
});
formatter.examples({
  "line": 35,
  "name": "",
  "description": "",
  "id": "payment-feature;[tc-01]---create-new-customer;",
  "rows": [
    {
      "cells": [
        "CustomerName",
        "Gender",
        "DateOfBirth",
        "Address",
        "City",
        "State",
        "Pin",
        "Phone",
        "Email",
        "Password"
      ],
      "line": 36,
      "id": "payment-feature;[tc-01]---create-new-customer;;1"
    },
    {
      "cells": [
        "Auto Test",
        "m",
        "1989-10-10",
        "123 Address",
        "Binh Duong",
        "Thu Dau",
        "123321",
        "0123456987",
        "automation",
        "123456"
      ],
      "line": 37,
      "id": "payment-feature;[tc-01]---create-new-customer;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 37,
  "name": "[TC_01] - CREATE NEW CUSTOMER",
  "description": "",
  "id": "payment-feature;[tc-01]---create-new-customer;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@payment"
    }
  ]
});
formatter.step({
  "line": 14,
  "name": "I open \"New Customer\" page",
  "keyword": "Given "
});
formatter.step({
  "line": 15,
  "name": "I input to \"name\" textbox with data \"Auto Test\"",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 16,
  "name": "I click to \"m\" radio button",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "I input to \"dob\" textbox with data \"1989-10-10\"",
  "matchedColumns": [
    2
  ],
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "I input to \"addr\" text area with data \"123 Address\"",
  "matchedColumns": [
    3
  ],
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "I input to \"city\" textbox with data \"Binh Duong\"",
  "matchedColumns": [
    4
  ],
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "I input to \"state\" textbox with data \"Thu Dau\"",
  "matchedColumns": [
    5
  ],
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "I input to \"pinno\" textbox with data \"123321\"",
  "matchedColumns": [
    6
  ],
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "I input to \"telephoneno\" textbox with data \"0123456987\"",
  "matchedColumns": [
    7
  ],
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "I input to \"emailid\" textbox with random data \"automation@gmail.com\"",
  "matchedColumns": [
    8
  ],
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "I input to \"password\" textbox with data \"123456\"",
  "matchedColumns": [
    9
  ],
  "keyword": "And "
});
formatter.step({
  "line": 25,
  "name": "I click to \"sub\" button",
  "keyword": "And "
});
formatter.step({
  "line": 26,
  "name": "I get infor of Customer ID",
  "keyword": "And "
});
formatter.step({
  "line": 27,
  "name": "Verify created successfully with message \"Customer Registered Successfully!!!\"",
  "keyword": "Then "
});
formatter.step({
  "line": 28,
  "name": "I verify expected data at \"Customer Name\" text in table with actual data \"Auto Test\"",
  "matchedColumns": [
    0
  ],
  "keyword": "And "
});
formatter.step({
  "line": 29,
  "name": "I verify expected data at \"Birthdate\" text in table with actual data \"1989-10-10\"",
  "matchedColumns": [
    2
  ],
  "keyword": "And "
});
formatter.step({
  "line": 30,
  "name": "I verify expected data at \"Address\" text in table with actual data \"123 Address\"",
  "matchedColumns": [
    3
  ],
  "keyword": "And "
});
formatter.step({
  "line": 31,
  "name": "I verify expected data at \"City\" text in table with actual data \"Binh Duong\"",
  "matchedColumns": [
    4
  ],
  "keyword": "And "
});
formatter.step({
  "line": 32,
  "name": "I verify expected data at \"State\" text in table with actual data \"Thu Dau\"",
  "matchedColumns": [
    5
  ],
  "keyword": "And "
});
formatter.step({
  "line": 33,
  "name": "I verify expected data at \"Pin\" text in table with actual data \"123321\"",
  "matchedColumns": [
    6
  ],
  "keyword": "And "
});
formatter.match({
  "arguments": [
    {
      "val": "New Customer",
      "offset": 8
    }
  ],
  "location": "AbstractPageSteps.iOpenDynamicPage(String)"
});
formatter.result({
  "duration": 95745223,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "name",
      "offset": 12
    },
    {
      "val": "Auto Test",
      "offset": 37
    }
  ],
  "location": "AbstractPageSteps.iInputToTextboxWithData(String,String)"
});
formatter.result({
  "duration": 1768775522,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "m",
      "offset": 12
    }
  ],
  "location": "AbstractPageSteps.iClickToRadioButton(String)"
});
formatter.result({
  "duration": 431182944,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "dob",
      "offset": 12
    },
    {
      "val": "1989-10-10",
      "offset": 36
    }
  ],
  "location": "AbstractPageSteps.iInputToTextboxWithData(String,String)"
});
formatter.result({
  "duration": 73187750,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "addr",
      "offset": 12
    },
    {
      "val": "123 Address",
      "offset": 39
    }
  ],
  "location": "AbstractPageSteps.iInputToTextAreaWithData(String,String)"
});
formatter.result({
  "duration": 73456966,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "city",
      "offset": 12
    },
    {
      "val": "Binh Duong",
      "offset": 37
    }
  ],
  "location": "AbstractPageSteps.iInputToTextboxWithData(String,String)"
});
formatter.result({
  "duration": 255132560,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "state",
      "offset": 12
    },
    {
      "val": "Thu Dau",
      "offset": 38
    }
  ],
  "location": "AbstractPageSteps.iInputToTextboxWithData(String,String)"
});
formatter.result({
  "duration": 67054317,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "pinno",
      "offset": 12
    },
    {
      "val": "123321",
      "offset": 38
    }
  ],
  "location": "AbstractPageSteps.iInputToTextboxWithData(String,String)"
});
formatter.result({
  "duration": 60400576,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "telephoneno",
      "offset": 12
    },
    {
      "val": "0123456987",
      "offset": 44
    }
  ],
  "location": "AbstractPageSteps.iInputToTextboxWithData(String,String)"
});
formatter.result({
  "duration": 398459845,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "emailid",
      "offset": 12
    },
    {
      "val": "automation@gmail.com",
      "offset": 47
    }
  ],
  "location": "AbstractPageSteps.iInputToTextboxWithRandomData(String,String)"
});
formatter.result({
  "duration": 110627597,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "password",
      "offset": 12
    },
    {
      "val": "123456",
      "offset": 41
    }
  ],
  "location": "AbstractPageSteps.iInputToTextboxWithData(String,String)"
});
formatter.result({
  "duration": 81535322,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "sub",
      "offset": 12
    }
  ],
  "location": "AbstractPageSteps.clickToDynamicButton(String)"
});
formatter.result({
  "duration": 1564190928,
  "status": "passed"
});
formatter.match({
  "location": "NewCustomerSteps.iGetInforOfCustomerID()"
});
formatter.result({
  "duration": 460737002,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Customer Registered Successfully!!!",
      "offset": 42
    }
  ],
  "location": "AbstractPageSteps.verifyCreatedOrEditedSuccessfullyWithMessage(String)"
});
formatter.result({
  "duration": 22678299,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Customer Name",
      "offset": 27
    },
    {
      "val": "Auto Test",
      "offset": 74
    }
  ],
  "location": "AbstractPageSteps.iVerifyExpectedDataAtTextInTableWithActualData(String,String)"
});
formatter.result({
  "duration": 328832688,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Birthdate",
      "offset": 27
    },
    {
      "val": "1989-10-10",
      "offset": 70
    }
  ],
  "location": "AbstractPageSteps.iVerifyExpectedDataAtTextInTableWithActualData(String,String)"
});
formatter.result({
  "duration": 16160487,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Address",
      "offset": 27
    },
    {
      "val": "123 Address",
      "offset": 68
    }
  ],
  "location": "AbstractPageSteps.iVerifyExpectedDataAtTextInTableWithActualData(String,String)"
});
formatter.result({
  "duration": 22250122,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "City",
      "offset": 27
    },
    {
      "val": "Binh Duong",
      "offset": 65
    }
  ],
  "location": "AbstractPageSteps.iVerifyExpectedDataAtTextInTableWithActualData(String,String)"
});
formatter.result({
  "duration": 17086694,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "State",
      "offset": 27
    },
    {
      "val": "Thu Dau",
      "offset": 66
    }
  ],
  "location": "AbstractPageSteps.iVerifyExpectedDataAtTextInTableWithActualData(String,String)"
});
formatter.result({
  "duration": 24210524,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Pin",
      "offset": 27
    },
    {
      "val": "123321",
      "offset": 64
    }
  ],
  "location": "AbstractPageSteps.iVerifyExpectedDataAtTextInTableWithActualData(String,String)"
});
formatter.result({
  "duration": 15151212,
  "status": "passed"
});
formatter.scenarioOutline({
  "line": 39,
  "name": "[TC_02] - CREATE 2 NEW ACCOUNTs",
  "description": "",
  "id": "payment-feature;[tc-02]---create-2-new-accounts",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 40,
  "name": "I open \"New Account\" page",
  "keyword": "When "
});
formatter.step({
  "line": 41,
  "name": "I input to Customer ID",
  "keyword": "When "
});
formatter.step({
  "line": 42,
  "name": "I select value is \"\u003cAccountType\u003e\" in dropdown list \"selaccount\"",
  "keyword": "And "
});
formatter.step({
  "line": 43,
  "name": "I input to \"inideposit\" textbox with data \"\u003cDepositAmount\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 44,
  "name": "I click to \"button2\" button",
  "keyword": "And "
});
formatter.step({
  "line": 45,
  "name": "Verify created successfully with message \"Account Generated Successfully!!!\"",
  "keyword": "Then "
});
formatter.step({
  "line": 46,
  "name": "I get infor of first account",
  "keyword": "And "
});
formatter.step({
  "line": 47,
  "name": "I open \"New Account\" page",
  "keyword": "When "
});
formatter.step({
  "line": 48,
  "name": "I input to Customer ID",
  "keyword": "When "
});
formatter.step({
  "line": 49,
  "name": "I select value is \"\u003cAccountType\u003e\" in dropdown list \"selaccount\"",
  "keyword": "And "
});
formatter.step({
  "line": 50,
  "name": "I input to \"inideposit\" textbox with data \"\u003cDepositAmount\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 51,
  "name": "I click to \"button2\" button",
  "keyword": "And "
});
formatter.step({
  "line": 52,
  "name": "Verify created successfully with message \"Account Generated Successfully!!!\"",
  "keyword": "Then "
});
formatter.step({
  "line": 53,
  "name": "I get infor of second account",
  "keyword": "And "
});
formatter.examples({
  "line": 55,
  "name": "",
  "description": "",
  "id": "payment-feature;[tc-02]---create-2-new-accounts;",
  "rows": [
    {
      "cells": [
        "AccountType",
        "DepositAmount"
      ],
      "line": 56,
      "id": "payment-feature;[tc-02]---create-2-new-accounts;;1"
    },
    {
      "cells": [
        "Current",
        "50000"
      ],
      "line": 57,
      "id": "payment-feature;[tc-02]---create-2-new-accounts;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 57,
  "name": "[TC_02] - CREATE 2 NEW ACCOUNTs",
  "description": "",
  "id": "payment-feature;[tc-02]---create-2-new-accounts;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@payment"
    }
  ]
});
formatter.step({
  "line": 40,
  "name": "I open \"New Account\" page",
  "keyword": "When "
});
formatter.step({
  "line": 41,
  "name": "I input to Customer ID",
  "keyword": "When "
});
formatter.step({
  "line": 42,
  "name": "I select value is \"Current\" in dropdown list \"selaccount\"",
  "matchedColumns": [
    0
  ],
  "keyword": "And "
});
formatter.step({
  "line": 43,
  "name": "I input to \"inideposit\" textbox with data \"50000\"",
  "matchedColumns": [
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 44,
  "name": "I click to \"button2\" button",
  "keyword": "And "
});
formatter.step({
  "line": 45,
  "name": "Verify created successfully with message \"Account Generated Successfully!!!\"",
  "keyword": "Then "
});
formatter.step({
  "line": 46,
  "name": "I get infor of first account",
  "keyword": "And "
});
formatter.step({
  "line": 47,
  "name": "I open \"New Account\" page",
  "keyword": "When "
});
formatter.step({
  "line": 48,
  "name": "I input to Customer ID",
  "keyword": "When "
});
formatter.step({
  "line": 49,
  "name": "I select value is \"Current\" in dropdown list \"selaccount\"",
  "matchedColumns": [
    0
  ],
  "keyword": "And "
});
formatter.step({
  "line": 50,
  "name": "I input to \"inideposit\" textbox with data \"50000\"",
  "matchedColumns": [
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 51,
  "name": "I click to \"button2\" button",
  "keyword": "And "
});
formatter.step({
  "line": 52,
  "name": "Verify created successfully with message \"Account Generated Successfully!!!\"",
  "keyword": "Then "
});
formatter.step({
  "line": 53,
  "name": "I get infor of second account",
  "keyword": "And "
});
formatter.match({
  "arguments": [
    {
      "val": "New Account",
      "offset": 8
    }
  ],
  "location": "AbstractPageSteps.iOpenDynamicPage(String)"
});
formatter.result({
  "duration": 1233034226,
  "status": "passed"
});
formatter.match({
  "location": "EditCustomerSteps.iInputToCustomerID()"
});
formatter.result({
  "duration": 82921423,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Current",
      "offset": 19
    },
    {
      "val": "selaccount",
      "offset": 46
    }
  ],
  "location": "AbstractPageSteps.iSelectValueIsInDropdownList(String,String)"
});
formatter.result({
  "duration": 484010368,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "inideposit",
      "offset": 12
    },
    {
      "val": "50000",
      "offset": 43
    }
  ],
  "location": "AbstractPageSteps.iInputToTextboxWithData(String,String)"
});
formatter.result({
  "duration": 706196678,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "button2",
      "offset": 12
    }
  ],
  "location": "AbstractPageSteps.clickToDynamicButton(String)"
});
formatter.result({
  "duration": 2391604098,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Account Generated Successfully!!!",
      "offset": 42
    }
  ],
  "location": "AbstractPageSteps.verifyCreatedOrEditedSuccessfullyWithMessage(String)"
});
formatter.result({
  "duration": 33281164,
  "status": "passed"
});
formatter.match({
  "location": "NewAccountSteps.iGetInforOfFirstAccount()"
});
formatter.result({
  "duration": 19370307,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "New Account",
      "offset": 8
    }
  ],
  "location": "AbstractPageSteps.iOpenDynamicPage(String)"
});
formatter.result({
  "duration": 89870055,
  "status": "passed"
});
formatter.match({
  "location": "EditCustomerSteps.iInputToCustomerID()"
});
formatter.result({
  "duration": 1437243127,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Current",
      "offset": 19
    },
    {
      "val": "selaccount",
      "offset": 46
    }
  ],
  "location": "AbstractPageSteps.iSelectValueIsInDropdownList(String,String)"
});
formatter.result({
  "duration": 433762203,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "inideposit",
      "offset": 12
    },
    {
      "val": "50000",
      "offset": 43
    }
  ],
  "location": "AbstractPageSteps.iInputToTextboxWithData(String,String)"
});
formatter.result({
  "duration": 71074805,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "button2",
      "offset": 12
    }
  ],
  "location": "AbstractPageSteps.clickToDynamicButton(String)"
});
formatter.result({
  "duration": 1532829010,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Account Generated Successfully!!!",
      "offset": 42
    }
  ],
  "location": "AbstractPageSteps.verifyCreatedOrEditedSuccessfullyWithMessage(String)"
});
formatter.result({
  "duration": 321229707,
  "status": "passed"
});
formatter.match({
  "location": "NewAccountSteps.iGetInforOfFirstAccount()"
});
formatter.result({
  "duration": 13238007,
  "status": "passed"
});
formatter.scenarioOutline({
  "line": 59,
  "name": "[TC_03] - DEPOSIT TO ACCOUNT",
  "description": "",
  "id": "payment-feature;[tc-03]---deposit-to-account",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 60,
  "name": "I open \"Deposit\" page",
  "keyword": "When "
});
formatter.step({
  "line": 61,
  "name": "I input to first account number",
  "keyword": "When "
});
formatter.step({
  "line": 62,
  "name": "I input to \"ammount\" textbox with data \"\u003cFisrtAmount\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 63,
  "name": "I input to \"desc\" textbox with data \"\u003cDepositDes\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 64,
  "name": "I click to \"AccSubmit\" button",
  "keyword": "And "
});
formatter.step({
  "line": 65,
  "name": "Verify transfer successfully with message \"Transaction details of Deposit for Account\"",
  "keyword": "Then "
});
formatter.examples({
  "line": 67,
  "name": "",
  "description": "",
  "id": "payment-feature;[tc-03]---deposit-to-account;",
  "rows": [
    {
      "cells": [
        "FisrtAmount",
        "DepositDes"
      ],
      "line": 68,
      "id": "payment-feature;[tc-03]---deposit-to-account;;1"
    },
    {
      "cells": [
        "50000",
        "Deposit"
      ],
      "line": 69,
      "id": "payment-feature;[tc-03]---deposit-to-account;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 69,
  "name": "[TC_03] - DEPOSIT TO ACCOUNT",
  "description": "",
  "id": "payment-feature;[tc-03]---deposit-to-account;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@payment"
    }
  ]
});
formatter.step({
  "line": 60,
  "name": "I open \"Deposit\" page",
  "keyword": "When "
});
formatter.step({
  "line": 61,
  "name": "I input to first account number",
  "keyword": "When "
});
formatter.step({
  "line": 62,
  "name": "I input to \"ammount\" textbox with data \"50000\"",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 63,
  "name": "I input to \"desc\" textbox with data \"Deposit\"",
  "matchedColumns": [
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 64,
  "name": "I click to \"AccSubmit\" button",
  "keyword": "And "
});
formatter.step({
  "line": 65,
  "name": "Verify transfer successfully with message \"Transaction details of Deposit for Account\"",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "Deposit",
      "offset": 8
    }
  ],
  "location": "AbstractPageSteps.iOpenDynamicPage(String)"
});
formatter.result({
  "duration": 1593307746,
  "status": "passed"
});
formatter.match({
  "location": "DepositPageSteps.iInputToFirstAccountNumber()"
});
formatter.result({
  "duration": 58016149,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "ammount",
      "offset": 12
    },
    {
      "val": "50000",
      "offset": 40
    }
  ],
  "location": "AbstractPageSteps.iInputToTextboxWithData(String,String)"
});
formatter.result({
  "duration": 62173698,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "desc",
      "offset": 12
    },
    {
      "val": "Deposit",
      "offset": 37
    }
  ],
  "location": "AbstractPageSteps.iInputToTextboxWithData(String,String)"
});
formatter.result({
  "duration": 65341985,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "AccSubmit",
      "offset": 12
    }
  ],
  "location": "AbstractPageSteps.clickToDynamicButton(String)"
});
formatter.result({
  "duration": 2162636047,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Transaction details of Deposit for Account",
      "offset": 43
    }
  ],
  "location": "DepositPageSteps.verifyTransactionSuccessMessage(String)"
});
formatter.result({
  "duration": 331065705,
  "status": "passed"
});
});