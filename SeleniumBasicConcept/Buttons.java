package SeleniumBasicConcept;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Buttons {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", 
				"./drivers/chromedriver.exe");
		ChromeDriver driver =  new ChromeDriver();
		driver = new ChromeDriver();
		driver.get("https://www.aircanada.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//To find button location.
		Point buttonLocation = driver.findElementByXPath("//button[@id=\"bkmgFlights_findButton\"]").getLocation();
		int xValue = buttonLocation.getX();
		int yValue = buttonLocation.getY();
		System.out.println("X Value is "+xValue+ " Y Value is "+yValue);
		
		//To find the background color of the button.
		
		WebElement buttonColor = driver.findElementByXPath("//button[@id=\"bkmgFlights_findButton\"]");
		String color = buttonColor.getCssValue("background");
		System.out.println("Button color is "+color);
		
		//To find the size of the button.
		WebElement buttonSize = driver.findElementByXPath("//button[@id=\"bkmgFlights_findButton\"]");
		int height = buttonSize.getSize().getHeight();
		int Width = buttonSize.getSize().getWidth();
		System.out.println("button height is "+height+ " button width is "+Width);
		
	}

}
