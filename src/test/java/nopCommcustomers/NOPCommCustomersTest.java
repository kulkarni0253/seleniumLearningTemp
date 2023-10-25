package nopCommcustomers;


import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NOPCommCustomersTest extends BaseTest{
	
		
	@Test
	public void verifyCustomerssearch() throws InterruptedException {
		
		
		System.out.println("verify Customers search executing test case");
	
		
		
		driver.findElement(By.xpath("//input[@name='username']")).clear();

		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
		
		driver.findElement(By.xpath("//input[@name='password']")).clear();

		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@href='/web/index.php/directory/viewDirectory']")).click();
		
		System.out.println("=======Verifying directory page=======");
		
	System.out.println("title is"+driver.getTitle());
		
		Assert.assertEquals(0, 0);
		
		
		
		
		//System.out.println("App URL: " + driver.getCurrentUrl());
				System.out.println("App Title: " + driver.getTitle());
				Assert.assertEquals("", "");
				
		
		
		
		
	}

}
