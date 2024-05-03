package SeleniumBasicConcept;
import java.awt.AWTException;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot {
	public static void main(String[] args) throws IOException, AWTException {

	System.setProperty("webdriver.chrome.driver", 
			"./drivers/chromedriver.exe");

	ChromeDriver driver =  new ChromeDriver();
	driver = new ChromeDriver();
	driver.get("https://leafground.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	WebElement homeButton = driver.findElementByXPath("//div[@id=\"j_idt133\"]");
	homeButton.click();
	//particular section screenshot
	File source = homeButton.getScreenshotAs(OutputType.FILE);
	File destination = new File("./snaps/sectionImage.png");
	FileHandler.copy(source, destination);
	

	//	Robot robot = new Robot();
//	Dimension screensize  = Toolkit.getDefaultToolkit().getScreenSize();
//	Rectangle rectangle = new Rectangle(screensize);
//	BufferedImage src = robot.createScreenCapture(rectangle);
//	File destination1 = new File("./snaps/image3.png");
//	ImageIO.write(src,"png",destination1);
}
}