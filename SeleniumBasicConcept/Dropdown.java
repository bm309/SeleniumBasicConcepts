package SeleniumBasicConcept;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
//import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Dropdown {

	//	static long maxWait = 30;
	//	static WebDriverWait wait = null;

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", 
				"./drivers/chromedriver.exe");
		ChromeDriver driver =  new ChromeDriver();
		WebDriverWait wait = new WebDriverWait(driver, 20);
		driver = new ChromeDriver();
		driver.get("https://leafground.com/select.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//select Tool
		WebElement dropdown1 = driver.findElementByXPath("//select[@class=\"ui-selectonemenu\"]");
		Select selectTool = new Select(dropdown1);
		selectTool.selectByVisibleText("Selenium");
		//select country
		WebElement dropdown2 = driver.findElementByXPath("//label[@id=\"j_idt87:country_label\" and text()=\"Select Country\"]");
		dropdown2.click();
		WebElement countrySelect = driver.findElementByXPath("//li[text()=\"Select Country\"]/following::li[4]");
		countrySelect.click();
		//		wait.until(ExpectedConditions.visibilityOf(dropdown2));
		//		//select city
		//		WebElement dropdown3 = driver.findElementByXPath("//label[@id=\"j_idt87:city_label\" and text() = \"Select City\"]");
		//		wait.until(ExpectedConditions.visibilityOf(dropdown3));
		//		dropdown3.click();
		//		WebElement citySelect = driver.findElementByXPath("//ul[@id=\"j_idt87:city_items\"]/li[3]");
		//		citySelect.click();
		//select Language
		WebElement dropdown4 = driver.findElementByXPath("//label[@id=\"j_idt87:lang_label\" and text() = \"Select Language\"]");
		dropdown4.click();
		WebElement languageSelect = driver.findElementByXPath("//ul[@id=\"j_idt87:lang_items\"]/li[2]");
		languageSelect.click();
		wait.until(ExpectedConditions.elementToBeClickable(dropdown4));
		//choose Course
		WebElement multiselect = driver.findElementByXPath("//button[@class=\"ui-autocomplete-dropdown ui-button ui-widget ui-state-default ui-corner-right ui-button-icon-only\"]");
		multiselect.click();
		WebElement select1 = driver.findElementByXPath("//li[text()=\"Selenium WebDriver\"]");
		select1.click();
		WebElement multiselect1 = driver.findElementByXPath("//button[@class=\"ui-autocomplete-dropdown ui-button ui-widget ui-state-default ui-corner-right ui-button-icon-only\"]");
		multiselect1.click();
		wait.until(ExpectedConditions.elementToBeClickable(multiselect1));
		//WebElement select2 = driver.findElementByXPath("//ul[@class=\"ui-autocomplete-items ui-autocomplete-list ui-widget-content ui-widget ui-corner-all ui-helper-reset\"]/li[4]");
		//select2.click();
		
		int attempts = 0;
		while(attempts < 2) {
			try {	
				WebElement select2 = driver.findElementByXPath("//ul[@class=\"ui-autocomplete-items ui-autocomplete-list ui-widget-content ui-widget ui-corner-all ui-helper-reset\"]/li[4]");
				select2.click();
				WebElement select3 = driver.findElementByXPath("//li[text()=\"JMeter\"]");
				select3.click();
				break;
			} 
			catch(StaleElementReferenceException e) 
			{
				attempts++;
			}
		}
//		WebElement multiselect2 = driver.findElementByXPath("//button[@class=\"ui-autocomplete-dropdown ui-button ui-widget ui-state-default ui-corner-right ui-button-icon-only\"]");
//		multiselect2.click();
//		WebElement select3 = driver.findElementByXPath("//li[text()=\"JMeter\"]");
//		select3.click();
}
}