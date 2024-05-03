package SeleniumBasicConcept;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {
	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", 
			"./drivers/chromedriver.exe");
	ChromeDriver driver =  new ChromeDriver();
	driver = new ChromeDriver();
	driver.get("https://www.flipkart.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.findElementByXPath("//button[.='✕']").click();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	WebElement ele = driver.findElementByXPath("//div[@class='xtXmba' and text()='Electronics']");
	Actions builder = new Actions(driver);
	builder.moveToElement(ele).perform();
}
}
