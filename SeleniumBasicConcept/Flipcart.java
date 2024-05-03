package SeleniumBasicConcept;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class Flipcart {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", 
				"./drivers/chromedriver.exe");
		ChromeDriver driver =  new ChromeDriver();
		driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		https://bookcart.azurewebsites.net/
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElementByXPath("//button[@class='_2KpZ6l _2doB4z']").click();
		//driver.findElementByXPath("//a[@class='_1_3w1N']").click();
		driver.findElementByXPath("//div[@class='xtXmba' and text()='Travel']").click();
		String HomeURL = driver.getCurrentUrl();
		System.out.println("URL1: "+HomeURL);
		driver.navigate().back();
		System.out.println("URL2: "+driver.getCurrentUrl());
	}

}
