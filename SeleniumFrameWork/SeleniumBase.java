package SeleniumFrameWork;
import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumBase implements SeleniumAPI {
	long maxWait = 20;
	RemoteWebDriver driver = null;
	WebDriverWait wait = null;
	public void SetUp(String url) {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(url);
		wait = new WebDriverWait(driver, maxWait);
	}

	public void SetUp(String BrowserName, String url) {
		switch (BrowserName) {
		case "chrome":
			driver = new ChromeDriver();
			break;

		case "firefox":
			driver = new FirefoxDriver();
			break;

		case "edge":
			driver = new EdgeDriver();
			break;

		default:
			break;
		}

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(url);
		wait = new WebDriverWait(driver, maxWait);
	}

	public void close() {

		driver.close();
	}

	public void quit() {

		driver.quit();
	}

	public WebElement element(Locators type, String value) {
		switch (type) {
		case id:
			return driver.findElement(By.id(value));
		case name:
			driver.findElement(By.name(value));
		case xpath:
			driver.findElement(By.xpath(value));
		case link:
			driver.findElement(By.linkText(value));

			break;

		default:
			break;
		}
		return null;
	}

	public void SwitchTowindow(int i) {
		Set<String> window = driver.getWindowHandles();
	ArrayList<String> list = new ArrayList<String>(window);
	driver.switchTo().window(list.get(i));
	}

	public void SelectDropdownByIndex(WebElement ele, int position) {


	}

	public void SelectDropdownByValue(WebElement ele, String Value) {


	}

	public void SelectDropdownByText(WebElement ele, String Text) {


	}

	public void Clear(WebElement ele) {


	}

	public void AppendText(WebElement ele) {


	}

	public void click(WebElement ele) {
		WebElement element = wait
				.withMessage("Element not clickable")
				.until(ExpectedConditions.elementToBeClickable(ele));
		element.click();

	}

	public String Title() {

		return null;
	}

	public String URL() {

		return null;
	}

	public void IsDisplayed() {


	}

	public void IsEnabled() {


	}

	public void IsSelected() {


	}


	public void type(WebElement ele, String value) {
		WebElement element = wait.until(ExpectedConditions.visibilityOf(ele));
		element.clear();
		element.sendKeys(value);
	}
		public void type(WebElement ele, String value, Keys keys) {
			WebElement element = wait.until(ExpectedConditions.visibilityOf(ele));
			element.clear();
			element.sendKeys(value, keys);
		}

		

	}
