package SeleniumBasicConcept;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class DriverNavigation {

		public static void main(String[] args) {
			System.setProperty("webdriver.chrome.driver", 
					"./drivers/chromedriver.exe");
		
			ChromeDriver driver =  new ChromeDriver();
			driver = new ChromeDriver();
			driver.get("https://www.amazon.co.uk/");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.findElementByXPath("//input[@id='sp-cc-accept']").click();
			driver.findElementByXPath("//input[@id ='twotabsearchtextbox']").sendKeys("phone");
			driver.findElementByXPath("//input[@id='nav-search-submit-button']").click();
			System.out.println("CurrentURL: "+driver.getCurrentUrl());
		    driver.navigate().back();
			System.out.println("HomeURL: "+driver.getCurrentUrl());
		}
	}


