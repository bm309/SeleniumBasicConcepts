package SeleniumBasicConcept;
import java.awt.AWTException;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {
	public static void main(String[] args) throws IOException, AWTException {

		System.setProperty("webdriver.chrome.driver", 
				"./drivers/chromedriver.exe");

		ChromeDriver driver =  new ChromeDriver();
		driver = new ChromeDriver();
		driver.get("https://leafground.com/frame.xhtml;jsessionid=node0shc2y82pfnds1v9q62n8j3z12234155.node0");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//count the number of frames
		List<WebElement> countFrames = driver.findElementsByTagName("iframe");
		System.out.println("Total number of iframes in webPage : "+countFrames.size());
		//switch to frame 1
		driver.switchTo().frame(0);
		WebElement frame1 = driver.findElementByXPath("//button[@id=\"Click\" and text()=\"Click Me\"]");
		frame1.click();
		String frametext1 = frame1.getText();
		System.out.println(frametext1);
		//switch to frame 2
		driver.switchTo().parentFrame();
		driver.switchTo().frame(1);
		WebElement frame2 = driver.findElementByXPath("//button[@id=\"Click\" and text()=\"Count Frames\"]");
		frame2.click();
		String frametext2 = frame2.getText();
		System.out.println(frametext2);
		//switch to frame 3 - Nested Frames
		driver.switchTo().parentFrame();
		driver.switchTo().frame(2);
		driver.switchTo().frame(0);
		WebElement frame3 = driver.findElementByXPath("//button [@id=\"Click\" and text()=\"Click Me\"]");
		frame3.click();
		String frametext3 = frame3.getText();
		System.out.println(frametext3);

	}
}
