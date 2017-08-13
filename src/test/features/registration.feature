Feature: Registration
 @Reg
 Scenario: register new user
    Given I enter url "https://www.easyjet.com/en/register"
    And I enter email address is "testqa13@hotmail.com"
   And I enter confirm email address is "testqa13@hotmail.com"
    And I enter password "Password123"
    And I enter confirm password "Password123"
#    And I enter Title as "Mr"
#    And I enter First name as "testqa"
#    And I enter Surname as "qa123"
#    And I enter Address "no: 123"
#    And I enter town or city as "Kent"
#    And I enter postcode "RG427WS"
#    And I select Country "United Kingdom"
#    And I enter Mobile telephone number "07955567889"
#    And I clicked terms and conditions checkbox
#        When I click Register Now button
#        Then I should see "My account details" text
#        And I should see name as "Mr testqa qa123"
#        And I should see Edit button
#        And I should see Sing Out button