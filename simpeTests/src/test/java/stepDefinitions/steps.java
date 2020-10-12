package stepDefinitions;

import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;
import junit.framework.Assert;
import pageObject.MainPage;

public class steps {

	public WebDriver driver;
	public MainPage mp;
	
	@Given("User Launch Chrome browser")
	public void user_Launch_Chrome_Browser() {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user")+"//Drivers/chromedriver.exe");
		driver = new ChromeDriver();
		mp = new MainPage(driver);
	}
	
	@When("User opens URL {string}")
	public void user_opens_url(String url) {	    
	    driver.get(url);
	}
	
	@And("Click on Sign in")
	public void click_On_Sign_In() {
		mp.clickSignIn();
	}
	
	@Then("Page TITLE should be {string}")
	public void page_title_should_be(String title) {
	    Assert.assertEquals(driver.getTitle(), title);
	}
	
	@Then("User Eneter Random Email")
	public void user_eneter_random_email() {
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		Random randomGenerator = new Random();  
		int randomInt = randomGenerator.nextInt(1000);  
	    mp.enterEneterEmail("username"+ randomInt +"@gmail.com");
	}

	@Then("Click on Create An Account")
	public void click_on_create_an_account() {
	    mp.clickCreateAccount();
	    driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
	}
	
	@Then("Enter First Name {string}")
	public void enter_first_name(String name) {
	   mp.enterFirstName(name);
	}

	@Then("Enter Last Name {string}")
	public void enter_last_name(String name) {
	    mp.enterLastName(name);
	}

	@Then("Enter Password {string}")
	public void enter_password(String pass) {
	    mp.enterPassowrd(pass);
	}

	@Then("Enter Address {string}")
	public void enter_address(String address) {
	    mp.enterAddress(address);
	}

	@Then("Enter City {string}")
	public void enter_city(String city) {
	    mp.enterCity(city);
	}


	@Then("Enter Zip Code {string}")
	public void enter_zip_code(String code) {
	    mp.enterZipCode(code);
	}
	
	@Then("Enter State")
	public void enter_state() {
	    mp.enterState();
	}

	@Then("Enter Mobile Phone {string}")
	public void enter_mobile_phone(String number) {
	    mp.enterMobiPhone(number);
	}
	
	@Then("Click Register Buttton")
	public void click_register_button() {
			mp.clickRegister();
	}
	
	@Then("User Enter Old Email {string}")
	public void user_enter_old_email(String email) {
	    mp.enterOldEmail(email);
	}

	@Then("User Enter Old Password {string}")
	public void user_enter_old_password(String pass) {
	    mp.enterOldPass(pass);
	}
	
	@Then("Click Women")
	public void click_women() {
	    mp.clickWomen();
	}

	@Then("Click On Sign Button")
	public void click_on_sign_button() {
	    mp.clickSignButton();
	}
	
	
	@And("close browser")
	public void close_Browser() {
		driver.close();
	}
}
