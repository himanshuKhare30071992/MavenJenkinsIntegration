package mavenJenkinsIntegration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class VerifyTitle {
 
@Test
  public void test_1() 
  {
		WebDriver driver  = new ChromeDriver();
		driver.get("http://www.google.co.in");
		Assert.assertTrue(driver.getTitle().contains("Google"));
		System.out.println("===Test Case Pass===");
		driver.close();
  }
}
