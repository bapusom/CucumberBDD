package stepDefinations;

import junit.framework.Assert;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginStepDefination {

	
	    WebDriver driver;
	    
	 
	 	
	 	 @Given("^user is already on Login Page$")
	 	 public void user_already_on_login_page(){
	 	 System.setProperty("webdriver.chrome.driver","D://SeleniumDriver//chromedriver_win32//chromedriver.exe");
	 	 driver = new ChromeDriver();
	 	 driver.get("https://www.freecrm.com/index.html");
	 	 }
	 	
	 	
	 	 @When("^title of login page is Free CRM$")
	 	 public void title_of_login_page_is_free_CRM(){
	 	 String title = driver.getTitle();
	 	 System.out.println(title);
	 	 Assert.assertEquals("#1 Free CRM software in the cloud for sales and service", title);
	 	 }
	 	 
	 	 
	 	@Then("^user enters \"([^\"]*)\" and \"([^\"]*)\"$")
	 	public void user_enters_and(String arg1, String arg2) throws Throwable {
	 		driver.findElement(By.name("username")).sendKeys("naveenk");
 		    driver.findElement(By.name("password")).sendKeys("test@123");
	 	}

	 	@Then("^user clicks on login button$")
	 	public void user_clicks_on_login_button() throws Throwable {
	 		 WebElement loginBtn =
	 		 driver.findElement(By.xpath("//input[@type='submit']"));
	 		 JavascriptExecutor js = (JavascriptExecutor)driver;
	 		 js.executeScript("arguments[0].click();", loginBtn);
	 	}

	 	@Then("^user is on home page$")
	 	public void user_is_on_home_page() throws Throwable {
	 		String title = driver.getTitle();
	 		System.out.println("Home Page title ::"+ title);
 		    Assert.assertEquals("CRMPRO", title);
 		   driver.quit();
	 	}
	 	
	 	
	 	
	 	
}

