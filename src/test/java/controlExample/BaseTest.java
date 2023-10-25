package controlExample;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import utility.Constants;

public class BaseTest {

	WebDriver driver;

	@Before
	public void launchapp() throws Exception {
		System.out.println("===============launch application===============");

		System.out.println("executing test on chrome browser");
		driver = new ChromeDriver();

		driver.get("http://only-testing-blog.blogspot.com/2013/11/new-test.html");
		driver.manage().window().maximize();
		
		Thread.sleep(7000);

	}

	
	@After
	public void closeApp() throws Exception {
		System.out.println("===============close application===============");
		Thread.sleep(7000);
		driver.close();
	}

}
