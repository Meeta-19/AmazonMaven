package eCommerceProjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Ajio {
  @Test
  public void aJioTest() throws InterruptedException 
  {
	  WebDriver driver=new ChromeDriver();
	  Reporter.log("Opening AJio", true);
	  driver.get("https://www.ajio.com/");
	 // Assert.fail();
	  Thread.sleep(3000);
	  driver.close();
  }
}
