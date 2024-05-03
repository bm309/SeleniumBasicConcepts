package SeleniumBasicConcept;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Links {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", 
				"./drivers/chromedriver.exe");
		ChromeDriver driver =  new ChromeDriver();
		driver = new ChromeDriver();
		driver.get("https://leafground.com/link.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebElement NormalLink = driver.findElementByPartialLinkText("Go to Dash");
		NormalLink.click();
		driver.navigate().back();
		
		WebElement FindLink = driver.findElementByPartialLinkText("Find the URL without");
		String WhereToGo = FindLink.getAttribute("href");
		System.out.println("Find the link without click me " +WhereToGo);
		
		Thread.sleep(3000);
		WebElement BrokenLink = driver.findElementByPartialLinkText("Broken");
		BrokenLink.click();
		String Title = driver.getTitle();
		if (Title.contains("404")) {
			System.out.println("Ihe Link is broken");
		}
		driver.navigate().back();
		
		WebElement NormalLink1 = driver.findElementByPartialLinkText("Go to Dash");
		NormalLink1.click();
		driver.navigate().back();
		
		List<WebElement> TotalCountLinks = driver.findElementsByTagName("a");
		int count = TotalCountLinks.size();
		System.out.println("Total Link count is: "+count);
		
		
	}

}
