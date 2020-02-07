Feature: This feature will contain Login page tests

@test3
Scenario: Login Functionality Validation1
When Open Browser
When Open Application
When Wait For Username
When Enter Username
When Wait For Password
When Enter Password
When Wait For Login
When Click On Login
When wait For Logout
When Click On Logout
When Wait For OK 
When Click On OK
When CloseBrowser

@test4
Scenario: Login Functionality Validation2
When Open Browser
When Open Application
When Wait For Username
When Enter Username
When Wait For Password
When Enter Password
When Wait For Login
When Click On Login
When wait For Logout
When Click On Logout
When Wait For OK 
When Click On OK
When CloseBrowser

@test5
Scenario Outline: Supplier Functionality Validation
When Open Browser
When Open Application
When Wait For Username
When Enter Username
When Wait For Password
When Enter Password
When Wait For Login
When Click On Login
When Wait For Supplier
When Click On Supplier
When Wait For AddButton
When Click On AddButton
When Wait For SupplierNumber
Then Capture Data
When Wait For SupplierName
When Enter in "<SupplierName>" with "id" and "x_Supplier_Name" 
When Wait For Address
When Enter in "<address>" with "xpath" and "//*[@id='x_Address']" 
When Wait For City
When Enter in "<city>" with "xpath" and "//*[@id='x_City']" 
When Wait For Country
When Enter in "<country>" with "xpath" and "//*[@id='x_Country']" 
When Wait For Contact Person
When Enter in "<cperson>" with "xpath" and "//*[@id='x_Contact_Person']" 
When Wait For Ph Number
When Enter in "<pnumber>" with "xpath" and "//*[@id='x_Phone_Number']" 
When Wait For Email
When Enter in "<mail>" with "xpath" and "//*[@id='x__Email']" 
When Wait For Mobile Number
When Enter in "<mnumber>" with "xpath" and "//*[@id='x_Mobile_Number']"
When Wait For Notes
When Enter in "<note>" with "xpath" and "//*[@id='x_Notes']"
When Wait For Add Button
When Click On AddButton after adding notes
When Wait For Ok Button
When Click On Ok Button with "xpath" and "(//*[text()='OK!'])[1]"
When Wait For Alert
When Click On Alert
Then user validate the supplier table
When user closes the browser

Examples:
|SupplierName|address|city|country|cperson|pnumber|mail|mnumber|note|
|Akhilesh1|srnagar1|Hyderabad1|India|Rangapappasani1|1234567|test@gmail.com|8765432|iam purchasing mobile1|
|Akhilesh2|srnagar2|Hyderabad2|India|Rangapappasani2|1234568|test@gmail.com|8765433|iam purchasing mobile2|







