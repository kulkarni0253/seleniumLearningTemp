package takeScreenshotExample;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class AmazonTakeScreenshotExample extends BaseTest {
	
	
	@Test
	public void verifySearchFeature() throws Exception {
		
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.cssSelector("#twotabsearchtextbox")));
		
		driver.findElement(By.cssSelector("#twotabsearchtextbox")).sendKeys("iphone 15 pro");;
		
		driver.findElement(By.cssSelector("[value=\"Go\"]")).click();
		
		Thread.sleep(4000);
		//take a screenshot
//		TakesScreenshot ts = (TakesScreenshot)driver;
		
		
		
//		File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);      //capture ---- base64 ----PNG  ---- external lib --- ashot
//		File targetLocation = new File("./screenshot/AmazonSearchItem_new.png");
//		
//		FileUtils.copyFile(screenshotFile, targetLocation);
		

		Thread.sleep(4000);
		getScreenshot("Screenshot_Amazon_verifySearchFeature");
		
		
		
	}
	
	
	public void getScreenshot(String fileName) throws Exception {
		
		File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);      //capture ---- base64 ----PNG  ---- external lib --- ashot
		File targetLocation = new File("./screenshot/"+fileName+".png");
		
		FileUtils.copyFile(screenshotFile, targetLocation);
	}

	
	
	
	
}
