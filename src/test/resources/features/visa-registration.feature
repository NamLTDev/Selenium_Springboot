#Feature: Customer visa registration feature
#
#  Scenario Outline: I should be able to submit visa form
#    Given I am on Visa registration form
#    When I select my from country "<fromCountry>" and to country "<toCountry>"
#    And I enter my dob as "<dateOfBirth>"
#    And I enter my name as "<firstName>" and "<lastName>"
#    And I enter my contact details as "<email>" and "<phone>"
#    And I enter the comment "<comments>"
#    And I submit the form
#    Then I should see get the confirmation number
#    Examples:
#      | fromCountry | toCountry | dateOfBirth | firstName | lastName | email            | phone          | comments |
#      | Isle of Man | Mali      | 2011-05-31  | Kraig     | Wiza     | Kraig@nobody.com | 1-000-884-1373 | comment1 |
#
