package SeleniumBasicConcept;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiveElement {
	//https://bookcart.azurewebsites.net/login
	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", 
			"./drivers/chromedriver.exe");

	ChromeDriver driver =  new ChromeDriver();
	driver = new ChromeDriver();
	driver.get("https://bookcart.azurewebsites.net/login");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	WebElement form = driver.findElementByXPath("//input[@formcontrolname ='username']");
	form.sendKeys("bhavani",Keys.TAB, "Canpositive@1", Keys.ENTER);


}
}
