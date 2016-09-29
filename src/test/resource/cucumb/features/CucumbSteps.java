package cucumb.features;

import static org.junit.Assert.*;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class CucumbSteps {
	int balance = 3000;
	
	@Given("^I have value in an account$")
	public void valueCheck(){
		System.out.println("Your balance is: "+balance);
	}
	@When("^I deduct money from a bank account$")
	public void stealMoney(){
		balance-=2999;
		System.out.println("Money has succesfully be stolen!!!" + balance);
	}
	@Then("^I will verify the deduction has occured correctly$")
	public void verifyStolen(){
		System.out.print("If money is stolen successfully, assert will be true (1) ");
		assertTrue(balance==1);
	}

}
