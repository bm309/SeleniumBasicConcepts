package SeleniumFrameWork;
import org.openqa.selenium.WebElement;

public interface SeleniumAPI {
	/**
	 * This will launch the default browser as Chrome
	 * @param url
	 */
	public void SetUp(String url);
	/**
	 * This will launch the given browser with the given url
	 * @param BrowserName
	 * @param url
	 */
	public void SetUp(String BrowserName, String url);
	
	/**
	 * This will close the current window
	 */
	public void close();
	/**
	 * This will close the entire window
	 */
	public void quit();
	
	WebElement element(Locators type, String value);
	
	void SwitchTowindow(int i);
	
	void SelectDropdownByIndex(WebElement ele, int position);
	
	void SelectDropdownByValue(WebElement ele, String Value);
	
	void SelectDropdownByText(WebElement ele, String Text);
	
	void Clear(WebElement ele);
	
	void type(WebElement ele,String value);
	
	void AppendText(WebElement ele);
	/**
	 * The function will wait until the element to be clicked
	 * @param ele
	 */
	void click(WebElement ele);
		
	String Title();
	
	String URL();
	
	void IsDisplayed();
	
	void IsEnabled();
	
	void IsSelected();
	
}

