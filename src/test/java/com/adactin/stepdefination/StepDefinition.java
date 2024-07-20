package com.adactin.stepdefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.adactin.runner.Test_Runner;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class StepDefinition {
	
	WebDriver driver = Test_Runner.driver;
	  
	  @Given("^user Launch The Browser$") public void user_Launch_The_Browser()
	  throws Throwable { driver.get("https://adactinhotelapp.com/");
	  driver.manage().window().maximize(); }
	  
	  @When("^user Enter Their Username In Username Field$") public void
	  user_Enter_Their_Username_In_Username_Field() throws Throwable { WebElement
	  user = driver.findElement(By.id("username")); user.sendKeys("Bala112233"); }
	  
	  @When("^user Enter Their Password In Password Field$") public void
	  user_Enter_Their_Password_In_Password_Field() throws Throwable { WebElement
	  pass = driver.findElement(By.id("password")); pass.sendKeys("B953RN"); }
	  
	  @Then("^user Click The Login Button And It Navigates to Booking Page$")
	  public void user_Click_The_Login_Button_And_It_Navigates_to_Booking_Page()
	  throws Throwable { WebElement login = driver.findElement(By.id("login"));
	  login.click(); 
	  
	  }

}

