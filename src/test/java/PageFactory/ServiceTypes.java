package PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ServiceTypes {
	private WebDriver driver;
	public ServiceTypes(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);
	}
     @FindBy(xpath="//*[@id=\"username\"]")
     private  WebElement username;
     @FindBy(xpath="//*[@id=\"password\"]")
     private WebElement password;
     @FindBy(xpath="//*[@id=\"Inpatient Ward\"]")
     private WebElement locator;
     @FindBy(xpath="//*[@id=\"loginButton\"]")
     private WebElement loginbutton;
     @FindBy(xpath="//*[@id=\"appointmentschedulingui-homeAppLink-appointmentschedulingui-homeAppLink-extension\"]")
     private WebElement appointmentscheduling;
     @FindBy(xpath="//*[@id=\"appointmentschedulingui-manageAppointmentTypes-app\"]")
     private WebElement ManageServiceTypes;
     @FindBy (xpath="//*[@id=\"content\"]/div/div[1]/button")
     private WebElement Newservicetypes;
     @FindBy (xpath="//*[@id=\"name-field\"]")
     private WebElement Name;
     @FindBy (xpath="//*[@id=\"duration-field\"]")
     private WebElement Duration;
     @FindBy (xpath="//*[@id=\"save-button\"]")
     private WebElement Save;
     
     public void navigateToUrl(String Url) {
    	 driver.get(Url);
     }
     public void enterUsername(String Username) {
    	username.sendKeys(Username);
     }
     public void enterPassword(String Password) {
    	 password.sendKeys(Password);
     }
     public void selectLocator() {
    	locator.click();
     }
     public void loginbutton() {
    	 loginbutton.click();
    	 
     }
     public void navigateToAppoinmentScheduling() {
    	 appointmentscheduling .click();
    	 }
     public void navigateToManageServiceType() {
    	 ManageServiceTypes .click();
    	 }
     public void navigateToNewservicetypes() {
    	 Newservicetypes .click();
    	 }
     public void navigateToName() {
    	 Name .sendKeys("dentist");
    	 }
     public void navigateToDuration() {
    	 Duration .sendKeys("20");
    	 }
     public void navigateToSave() {
    	 Save .click();
    	 }
}
