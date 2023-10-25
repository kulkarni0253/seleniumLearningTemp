package execiseJavaScriptExe;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class ToolQASubmitTest extends BaseTest {
	
	@Test
	public void clicksubmitTest(){
		
		System.out.println("==========clicking submit===========");
		WebElement btn_Submit = driver.findElement(By.id("submit"));
		
JavascriptExecutor JS = (JavascriptExecutor)driver;
		
		JS.executeScript("arguments[0].click();", btn_Submit);
	}

	
}
