package SeleniumBasicConcept;
import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class downloadFile {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", 
				"./drivers/chromedriver.exe");
		ChromeDriver driver =  new ChromeDriver();
		driver = new ChromeDriver();
		driver.get("https://leafground.com/file.xhtml");
		driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement FileDownloaded = driver.findElementByXPath("//button[@id=\"j_idt93:j_idt95\"]//span[1]");	
	    FileDownloaded.click();
		//Thread.sleep(3000);

		File downloadPath = new File("C:\\Users\\HP\\Downloads");
		File[] downloadedFolder = downloadPath.listFiles();
//		for (int i = 0; i < downloadedFolder.length; i++) {
//			if(downloadedFolder[i].getName().equals("TestLeaf Logo.png")) {
//				System.out.println("File is downloaded");
//				break;
//		}
//	}
		for(File file : downloadedFolder) {
			if(file.getName().equals("TestLeaf Logo.png")) {
				System.out.println("File is downloaded");
				break;
			}
	}
	}

}

