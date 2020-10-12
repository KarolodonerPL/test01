package pageObject;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class MainPage {
	
		public WebDriver mdriver;
		
		public MainPage(WebDriver rdriver) {
			mdriver = rdriver;
			PageFactory.initElements(rdriver,  this);
		}
		
		@FindBy(xpath="//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a")
		@CacheLookup
		WebElement btnSignIn;
		
		@FindBy(xpath="//*[@id=\"email_create\"]")
		@CacheLookup
		WebElement txtEmailAddress;
		
		@FindBy(xpath="//*[@id=\"SubmitCreate\"]")
		@CacheLookup
		WebElement btncreateAccount;
		
		@FindBy(xpath="//*[@id=\"customer_firstname\"]")
		@CacheLookup
		WebElement txtFirName;
		
		@FindBy(xpath="//*[@id=\"customer_lastname\"]")
		@CacheLookup
		WebElement txtLastName;
		
		@FindBy(xpath="//*[@id=\"address1\"]")
		@CacheLookup
		WebElement txtAddress;
		
		@FindBy(xpath="//*[@id=\"city\"]")
		@CacheLookup
		WebElement txtCity;
		
		@FindBy(xpath="//*[@id=\"id_state\"]")
		@CacheLookup
		WebElement selState;
				
		@FindBy(xpath="//*[@id=\"postcode\"]")
		@CacheLookup
		WebElement txtPostCode;
		
		@FindBy(xpath=" //*[@id=\"phone_mobile\"]")
		@CacheLookup
		WebElement txtMobi;
		
		@FindBy(xpath="//*[@id=\"passwd\"]")
		@CacheLookup
		WebElement txtPass;
		
		@FindBy(xpath="//*[@id=\"submitAccount\"]")
		@CacheLookup
		WebElement btnRegister;
		
		@FindBy(xpath="//*[@id=\"email\"]")
		@CacheLookup
		WebElement txtLogInEmail;
		
		@FindBy(xpath="//*[@id=\"passwd\"]")
		@CacheLookup
		WebElement txtLogInPass;
		
		@FindBy(xpath="//*[@id=\"SubmitLogin\"]")
		@CacheLookup
		WebElement btnSign;
		
		@FindBy(xpath="//*[@id=\"block_top_menu\"]/ul/li[1]/a")
		@CacheLookup
		WebElement btnWomen;
		
		public void enterOldEmail(String email) {
			txtLogInEmail.clear();
			txtLogInEmail.sendKeys(email);
		}
		
		public void enterOldPass(String pass) {
			txtLogInPass.clear();
			txtLogInPass.sendKeys(pass);
		}
		
		public void enterPassowrd(String pass) {
			txtPass.clear();
			txtPass.sendKeys(pass);
		}
		
		public void enterEneterEmail(String email) {
			txtEmailAddress.clear();
			txtEmailAddress.sendKeys(email);
		}
		
		public void enterFirstName(String name) {
			txtFirName.clear();
			txtFirName.sendKeys(name);
		}
		
		public void enterLastName(String name) {
			txtLastName.clear();
			txtLastName.sendKeys(name);
		}
		
		public void enterAddress(String address) {
			txtAddress.clear();
			txtAddress.sendKeys(address);
		}
		
		public void enterCity(String city) {
			txtCity.clear();
			txtCity.sendKeys(city);
		}
		
		public void enterState() {
			selState.click();
			selState.sendKeys("A");
			selState.sendKeys(Keys.ENTER);
		}
		
		public void enterZipCode(String code) {
			txtPostCode.clear();
			txtPostCode.sendKeys(code);
		}
		
		public void enterMobiPhone(String number) {
			txtMobi.clear();
			txtMobi.sendKeys(number);
		}
		
		public void clickCreateAccount() {
			btncreateAccount.click();
		}
	
		public void clickSignIn() {
			btnSignIn.click();
		}
		
		public void clickRegister() {
			btnRegister.click();
		}
		
		public void clickSignButton() {
			btnSign.click();
		}
		
		public void clickWomen() {
			btnWomen.click();
		}
}
