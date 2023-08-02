package eCommerceProjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class flipKart {
  @Test
  public void FlipkartTest() throws InterruptedException 
  {
	  WebDriver driver=new ChromeDriver();
	  Reporter.log("Opening FlipKart", true);
	  driver.get("https://www.flipkart.com/");
	  Thread.sleep(3000);
	  driver.close();
  }
}
