Feature: Bank Value
  As a bank member, I want to check bank balance, get money stolen from me and then verify that the money is stolen.
  Scenario: Check, Deduct and Verify bank balances
    Given I have value in an account
    When  I deduct money from a bank account
    Then I will verify the deduction has occured correctly

