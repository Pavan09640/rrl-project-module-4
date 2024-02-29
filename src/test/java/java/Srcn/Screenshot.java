//package java.Srcn;
//import java.io.File;
//import java.io.IOException;
//
//import org.apache.commons.io.FileUtils;
//import org.openqa.selenium.OutputType;
//import org.openqa.selenium.TakesScreenshot;
//import org.openqa.selenium.WebDriver;
//
//
//
//public class Screenshot {
//public String takeScreenshot(String testName,WebDriver driver) throws IOException {
//		
//		File sourceScreenshotFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//		File destinationScreenshotFile = new File(System.getProperty("user.dir")+"\\Screenshots\\"+testName+".png");
//		FileUtils.copyFile(sourceScreenshotFile,destinationScreenshotFile);
//		return testName;
//		
//		
//		
//	}
//
//
//
//}
