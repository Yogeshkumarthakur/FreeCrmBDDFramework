package StepDefinitions;
////Working fine made by self
//package StepDefinations;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//import junit.framework.Assert;
//
//public class TitleStepDefination {
//
//	WebDriver driver;
//
//	@Given("^user is already logged In$")
//	public void user_is_already_logged_In() {
//		System.setProperty("webdriver.chrome.driver", "D:\\ChromeDriver\\chromedriver_win32\\chromedriver.exe");
//		driver = new ChromeDriver();
//		driver.get("https://classic.freecrm.com/");
//		driver.findElement(By.name("username")).sendKeys("Balli04");
//		driver.findElement(By.name("password")).sendKeys("July@2019");
//		driver.findElement(By.xpath("//input[@type='submit']")).click();// login button
//	}
//
//	@When("^verify title of home page is CRMPRO$")
//	public void verify_title_of_home_page_is_CRMPRO() {
//		String title = driver.getTitle();
//		System.out.println(title);
//		Assert.assertEquals("CRMPRO", title);
//	}
//
//	@Then("^Print title on console$")
//	public void Print_title_on_console() {
//		String title = driver.getTitle();
//		System.out.println(title);
//
//	}
//
//}
