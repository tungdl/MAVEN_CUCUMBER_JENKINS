@payment
Feature: PAYMENT FEATURE
  As an Automation Tester
  I want to check payment process
  So that I can make sure this function work well

  Scenario: [PRE-DATA] - REGISTER/ LOGIN
    When I input to "uid" textbox with data "mngr152935"
    And I input to "password" textbox with data "heqamYg "
    And I click to "btnLogin" button
    Then I verify Homepage displayed with message "Welcome To Manager's Page of Guru99 Bank"

  Scenario Outline: [TC_01] - CREATE NEW CUSTOMER
    Given I open "New Customer" page
    When I input to "name" textbox with data "<CustomerName>"
    And I click to "<Gender>" radio button
    And I input to "dob" textbox with data "<DateOfBirth>"
    And I input to "addr" text area with data "<Address>"
    And I input to "city" textbox with data "<City>"
    And I input to "state" textbox with data "<State>"
    And I input to "pinno" textbox with data "<Pin>"
    And I input to "telephoneno" textbox with data "<Phone>"
    And I input to "emailid" textbox with random data "<Email>@gmail.com"
    And I input to "password" textbox with data "<Password>"
    And I click to "sub" button
    And I get infor of Customer ID
    Then Verify created successfully with message "Customer Registered Successfully!!!"
    And I verify expected data at "Customer Name" text in table with actual data "<CustomerName>"
    And I verify expected data at "Birthdate" text in table with actual data "<DateOfBirth>"
    And I verify expected data at "Address" text in table with actual data "<Address>"
    And I verify expected data at "City" text in table with actual data "<City>"
    And I verify expected data at "State" text in table with actual data "<State>"
    And I verify expected data at "Pin" text in table with actual data "<Pin>"

    Examples: 
      | CustomerName | Gender | DateOfBirth | Address     | City       | State   | Pin    | Phone      | Email      | Password |
      | Auto Test    | m      | 1989-10-10  | 123 Address | Binh Duong | Thu Dau | 123321 | 0123456987 | automation |   123456 |

  Scenario Outline: [TC_02] - CREATE 2 NEW ACCOUNTs
    When I open "New Account" page
    When I input to Customer ID
    And I select value is "<AccountType>" in dropdown list "selaccount"
    When I input to "inideposit" textbox with data "<DepositAmount>"
    And I click to "button2" button
    Then Verify created successfully with message "Account Generated Successfully!!!"
    And I get infor of first account
    When I open "New Account" page
    When I input to Customer ID
    And I select value is "<AccountType>" in dropdown list "selaccount"
    When I input to "inideposit" textbox with data "<DepositAmount>"
    And I click to "button2" button
    Then Verify created successfully with message "Account Generated Successfully!!!"
    And I get infor of second account

    Examples: 
      | AccountType | DepositAmount |
      | Current     |         50000 |

  Scenario Outline: [TC_03] - DEPOSIT TO ACCOUNT
    When I open "Deposit" page
    When I input to first account number
    When I input to "ammount" textbox with data "<FisrtAmount>"
    When I input to "desc" textbox with data "<DepositDes>"
    And I click to "AccSubmit" button
    Then Verify transfer successfully with message "Transaction details of Deposit for Account"

    Examples: 
      | FisrtAmount | DepositDes |
      |       50000 | Deposit    |
