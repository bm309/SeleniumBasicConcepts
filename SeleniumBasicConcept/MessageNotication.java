package SeleniumBasicConcept;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MessageNotication {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", 
				"./drivers/chromedriver.exe");
		ChromeDriver driver =  new ChromeDriver();
		WebDriverWait Wait = new WebDriverWait(driver,30);

		driver = new ChromeDriver();
		driver.get("https://leafground.com/messages.xhtml");
		WebElement InfoButton = driver.findElementByXPath("//button[@id=\"j_idt94:j_idt95\"]");
		InfoButton.click();
		WebElement WarnButton = driver.findElementByXPath("//button[@id=\"j_idt94:j_idt96\"]");
		WarnButton.click();
		WebElement InfoNotificationClose = driver.findElementByXPath("//div[@class = \"ui-growl-icon-close ui-icon ui-icon-closethick\"]");
		InfoNotificationClose.click();
		//		Wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class=\\\"ui-growl-icon-close ui-icon ui-icon-closethick\\\"]")));
//		InfoNotificationClose.click();

	}

}
