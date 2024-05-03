package SeleniumBasicConcept;
import java.awt.AWTException;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandle {
	public static void main(String[] args) throws IOException, AWTException {

	System.setProperty("webdriver.chrome.driver", 
			"./drivers/chromedriver.exe");

	ChromeDriver driver =  new ChromeDriver();
	driver = new ChromeDriver();
	driver.get("https://leafground.com/window.xhtml");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	String mainWindow = driver.getWindowHandle();
	System.out.println("HomeWindow :" +mainWindow);
	System.out.println(driver.getCurrentUrl());
	WebElement buttonClick = driver.findElementByXPath("//button[@id=\"j_idt88:new\"]/span");
	buttonClick.click();
	Set<String> childWindow = driver.getWindowHandles();
	System.out.println("childWindow : " +childWindow);
	List<String> arrayList = new ArrayList< String>(childWindow);
	driver.switchTo().window(arrayList.get(1));
	System.out.println(driver.getCurrentUrl());
	driver.switchTo().window(arrayList.get(0)); //driver.switchTo().window(mainWindow);
	System.out.println(driver.getCurrentUrl());
	driver.close();
	Set<String> Handles2 = driver.getWindowHandles();
	arrayList.clear();
	arrayList.addAll(Handles2);
	driver.switchTo().window(arrayList.get(0));
	System.out.println(driver.getCurrentUrl());
	
	}
}