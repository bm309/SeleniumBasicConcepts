package SeleniumBasicConcept;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", 
				"./drivers/chromedriver.exe");
		ChromeDriver driver =  new ChromeDriver();
		driver = new ChromeDriver();
		driver.get("https://leafground.com/alert.xhtml");
		
		//Simple Alert
		WebElement clickAlert1 = driver.findElementByXPath("//button[@id = \"j_idt88:j_idt91\"]");
		clickAlert1.click();
		Alert simpleAlert = driver.switchTo().alert();
		String SimpleText =  simpleAlert.getText();
		System.out.println("Simple Alert Text : "+SimpleText);
		simpleAlert.accept();
		
		//Confirm Alert
		WebElement ClickAlert2 = driver.findElementByXPath("//button[@id = \"j_idt88:j_idt93\"]");
		ClickAlert2.click();
		Alert ConfirmAlert = driver.switchTo().alert();
		String ConfirmText = ConfirmAlert.getText();
		System.out.println("Confirm Alert Text : "+ConfirmText);
		ConfirmAlert.dismiss();
		
		//Prompt Alert
		WebElement ClickAlert3 = driver.findElementByXPath("//button[@id = \"j_idt88:j_idt104\"]");
		ClickAlert3.click();
		Alert PromptAlert = driver.switchTo().alert();
		PromptAlert.sendKeys("London");
		Thread.sleep(3000);
		String PromtText = PromptAlert.getText();
		System.out.println("Prompt Alert Text : "+PromtText);
		PromptAlert.accept();
		
		
		//Sweet Alert
		WebElement SweetAlert = driver.findElementByXPath("//button[@id = \"j_idt88:j_idt95\"]");
		SweetAlert.click();
		driver.findElementByXPath("//span[@class=\"ui-button-text ui-c\"][text()=\"Dismiss\"]").click();
		
		
		//Minimize and maximize
		driver.findElementByXPath("//button[@id=\"j_idt88:j_idt111\"]").click();
		driver.findElementByXPath
		("//a[@class=\"ui-dialog-titlebar-icon ui-dialog-titlebar-minimize ui-corner-all\"]").click();
	
	}

}
