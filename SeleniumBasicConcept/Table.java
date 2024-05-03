package SeleniumBasicConcept;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Table {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", 
				"./drivers/chromedriver.exe");
		ChromeDriver driver =  new ChromeDriver();
		driver = new ChromeDriver();
		driver.get("https://leafground.com/dynamicgrid.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		List<WebElement> columnCount = driver.findElementsByTagName("th");
		int count1 = columnCount.size();
		System.out.println("Column Count is :"+count1);
		List<WebElement> RowCount = driver.findElementsByTagName("tr");
		int count2 = RowCount.size();
		System.out.println("Column Count is :"+count2);
		
	}

}
