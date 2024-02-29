package utilities;


	

	import java.io.File;
	import java.io.IOException;

	import org.apache.commons.io.FileUtils;
	import org.openqa.selenium.By;
	import org.openqa.selenium.OutputType;
	import org.openqa.selenium.TakesScreenshot;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;

	import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
	import org.testng.annotations.BeforeMethod;
	import org.testng.annotations.Listeners;
	import org.testng.annotations.Test;

	@Listeners(utilities.Mylistener.class)
	public class Listener<TakeScreenshot> {
		static WebDriver driver;
		String siteUrl="https://demo.openmrs.org/openmrs/login.htm";
		@BeforeMethod
		public void setup() {
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.get(siteUrl);
		}
		
		@Test
		public void LoginFailTest() {
			driver.findElement(By.id("username")).sendKeys("admin");
			driver.findElement(By.id("password")).sendKeys("Admin123");
			driver.findElement(By.xpath("//*[@id=\"Inpatient Ward\"]")).click();
			driver.findElement(By.xpath("\"//*[@id=\\\"loginButton\\\"]\"")).click();
			
			String expectedUrl = "Login | Opem MRS";
			String actualUrl =  driver.getTitle();
			System.out.println(actualUrl);
			Assert.assertNotEquals(actualUrl, expectedUrl);
			
			
		}
		
		public  void captureScreenshot(String testName) {
			
			TakesScreenshot takesscreenshot = (TakesScreenshot) driver;
			File file = takesscreenshot.getScreenshotAs(OutputType.FILE);
			File destfile = new File("./Screenshots/"+testName+".png");
			
			try {
				FileUtils.copyFile(file, destfile);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Screenshot saved successfully");
		}
		@AfterMethod
		public void tearDown() {
			driver.quit();
		}

		public void onTestStart(ITestResult result) {
			// TODO Auto-generated method stub
			
		}
		
	}
