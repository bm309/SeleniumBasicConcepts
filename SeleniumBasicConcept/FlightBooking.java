package SeleniumBasicConcept;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

	public  class FlightBooking {
		
		private static void SelectCity(List<WebElement> aa, String bb) {
			for (WebElement webElement : aa) {
				if( webElement.getText().contains(bb)) {
					webElement.click();
					System.out.println("Selected " +webElement.getText());
					break;
				}				
			}
		}
 		public static void main(String[] args) throws InterruptedException { 
			String FromOption = "Coimbatore";
			String ToOption = "London";
			System.setProperty("webdriver.chrome.driver", 
					"./drivers/chromedriver.exe");
			ChromeDriver driver =  new ChromeDriver();
			driver = new ChromeDriver();
			driver.get("https://www.aircanada.com/ca/en/aco/home.html");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.findElementByXPath("//input[@id=\"bkmgFlights_tripTypeSelector_O\"]").click();
			
			WebElement inputFrom = driver.findElementByXPath("//input[@id=\"bkmgFlights_origin_trip_1\"]");
			inputFrom.sendKeys(FromOption);
			Thread.sleep(4000);
			List<WebElement> optionsFrom = driver.findElementsByXPath("//ul[@id=\"bkmgFlights_origin_trip_1OptionsPanel\"]/li");
			System.out.println(optionsFrom.size());
			SelectCity(optionsFrom,FromOption);
			//optionsFrom.click();
//		for (WebElement webElement : optionsFrom) {
//			if( webElement.getText().contains(FromOption)) {
//				webElement.click();
//				System.out.println("Selected " +webElement.getText());
//				break;
//			}
//			
//		}
			WebElement inputTo = driver.findElementByXPath("//input[@id=\"bkmgFlights_destination_trip_1\"]");
			inputTo.sendKeys(ToOption);
			List<WebElement> optionsTo = driver.findElementsByXPath("//ul[@id=\"bkmgFlights_destination_trip_1OptionsPanel\"]/li");
			SelectCity(optionsTo,ToOption);
//			for (WebElement webElement : optionsTo) {
//				if( webElement.getText().contains(ToOption)) {
//					webElement.click();
//					System.out.println("Selected " +webElement.getText());
//					break;
//				}
//				
//			}
			//optionsTo.get(2).click();
			driver.findElementByXPath("//div[@id=\"bkmgFlights_selectTravelersMainContainer\"]").click();
			driver.findElementByXPath("//button[@id=\"bkmgFlights_selectTravelers_addTraveler_ADT\"]").click();
			driver.findElementByXPath("//button[@id=\"bkmgFlights_selectTravelers_addTraveler_CHD\"]").click();
			driver.findElementByXPath("//button[@id=\"bkmgFlights_selectTravelers_addTraveler_CHD\"]").click();
			driver.findElementByXPath("//button[@id=\"bkmgFlights_selectTravelers_confirmTravelers\"]").click();
			driver.findElementByXPath("//div[@id=\"bkmgFlights_travelDates_1Wrapper\"]").click();
			driver.findElementByXPath("//div[@id=\"bkmgFlights_travelDates_1-date-2023-05-30\"]").click();
			driver.findElementByXPath("//button[@id=\"bkmgFlights_findButton\"]").click();
		}

	}



