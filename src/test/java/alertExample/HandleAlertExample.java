package alertExample;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HandleAlertExample extends BaseTest{
	
	
	
	@Test
	public void promptAlert() throws Exception {
		
		System.out.println("===========Prompt alert example===============");
		
		//click on button -
		driver.findElement(By.xpath("//*[contains(text(),'Prompt')]")).click();
		
		
		Thread.sleep(3000);
		
		//Alert/Window/frame    ----- driver.switchTo()
		
		
		
		//handle an alert
		
		Alert promptAlert = driver.switchTo().alert();
		
		
		
		//perform action on alert
//		
//		getText
//		accept	---------   ok
//		dismiss ---------   cancel
//		sendKeys 
		
		
		
		String alertText = promptAlert.getText();
		
		System.out.println("Alert Text: " + alertText);
		//validate alert text   ---- Your Name Please
		
		Assert.assertEquals(alertText, "Your Name Please");
		
		Thread.sleep(3000);
		System.out.println("=============enter some value into prompt==================");
		Thread.sleep(3000);
		//enter some value into prompt
		String name = "abhishek";
		
		promptAlert.sendKeys(name);
		
		
		
		Thread.sleep(3000);
		
		promptAlert.accept();			//=====ok button
		
//		promptAlert.dismiss();			//=====cancel button
		
		
		
		
		
	}

}
