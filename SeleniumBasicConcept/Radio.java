package SeleniumBasicConcept;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Radio {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", 
				"./drivers/chromedriver.exe");
		ChromeDriver driver =  new ChromeDriver();
		WebDriverWait Wait = new WebDriverWait(driver,30);

		driver = new ChromeDriver();
		driver.get("https://leafground.com/radio.xhtml");
		
		//your most fav browser
		driver.findElementByXPath("//label[text()= \"Chrome\"]/preceding::div[1]").click();
		
		//UnSelectable
		WebElement clickonce = driver.findElementByXPath("//label[text() = \"Chennai\"]/preceding::span[1]");
		clickonce.click();
		clickonce.click();
		
		//Find the default select radio button
		//List<WebElement> defaultSelect = driver.findElementsByXPath("//table[6]");
		
		WebElement UnSelected = driver.findElementByXPath("//input[@id =\"j_idt87:console2:0\"]/following::div[1]");
		//Wait.until(ExpectedConditions.visibilityOf(UnSelected));
		boolean unselect = UnSelected.isSelected();
		System.out.println(unselect);
		WebElement selected = driver.findElementByXPath("//input[@id =\"j_idt87:console2:2\"]/following::div[1]/span[1]");
		boolean select = selected.isSelected();
		System.out.println(select);
	}

}
