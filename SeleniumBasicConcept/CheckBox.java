package SeleniumBasicConcept;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", 
				"./drivers/chromedriver.exe");
		ChromeDriver driver =  new ChromeDriver();
		driver = new ChromeDriver();
		driver.get("https://leafground.com/checkbox.xhtml;jsessionid=node06fg22y5s99a2isl0yhnqj694212294.node0");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//Basic CheckBox
		
		WebElement basicCheckBox = driver.findElementByXPath("//span[text()=\"Basic\"]/preceding::div[1]");
		basicCheckBox.click();
		//Notification
		
		WebElement notification = driver.findElementByXPath("//span[text() = \"Ajax\"]/preceding::div[1]");
		notification.click();
		String ToolTipText = notification.getAttribute("Title");
		System.out.println("ToolTipText is : "+ToolTipText);
		//Multiple CheckBox
		
		WebElement Box1 = driver.findElementByXPath("//table[@id=\"j_idt87:basic\"]//td[1]//label");
		Box1.click();
		String name1 = Box1.getAttribute("text");
		System.out.println("Box1 is "+name1);
		WebElement Box2 = driver.findElementByXPath("//table[@id=\"j_idt87:basic\"]//td[3]");
		Box2.click();
		String name2 = Box1.getAttribute("text");
		System.out.println("Box2 is "+name2);

	}

}
