package com.orangeSteps;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import com.orangePage.OrangePage29;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;



public class StepsOrange {
	WebDriver driver;
	OrangePage29 obj;
	@Given("^User go to OrangeHRM home home page$")
	public void user_go_to_OrangeHRM_home_home_page() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "/Users/efat/Desktop/chromedriver");
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		obj = new OrangePage29(driver);
	}

	@When("^User type the user name$")
	public void user_type_the_user_name() throws Throwable {
		//driver.findElement(By.id("txtUsername")).sendKeys("Admin");
				obj.getUsername().sendKeys("Admin");
	}

	@When("^User also type the passward$")
	public void user_also_type_the_passward() throws Throwable {
		//driver.findElement(By.id("txtPassword")).sendKeys("admin123");
				obj.getPassward().sendKeys("admin123");
	}

	@Then("^User click on the login button$")
	public void user_click_on_the_login_button() throws Throwable {
		//driver.findElement(By.id("btnLogin")).click();
				obj.getLoginBtn().click();
	}

	@Then("^User Varify the welcome screen$")
	public void user_Varify_the_welcome_screen() throws Throwable {
		String expected = "Welcome";
		//String actual = driver.findElement(By.id("welcome")).getText();
		String actual = obj.getWecomeText().getText();
		Assert.assertTrue("Welcome is not found", actual.contains(expected));
	}


	
}
