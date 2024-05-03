package SeleniumBasicConcept;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calender {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", 
				"./drivers/chromedriver.exe");
		ChromeDriver driver =  new ChromeDriver();
		driver = new ChromeDriver();
		driver.get("https://leafground.com/calendar.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement ClickNext = driver.findElementByXPath("//button[text() = \"Next\"]");
		ClickNext.click();
		driver.findElementByXPath("//a[text() = \"10\"]").click();
	
	}

}
