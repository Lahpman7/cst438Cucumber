Feature: Bank Value
  To compare passed bank account balances and charge them for no reason at all

  Scenario: Check, Deduct and Verify bank balances
    Given I have value in an account
    When  I deduct money from a bank account
    Then I will verify the deduction has occured correctly

