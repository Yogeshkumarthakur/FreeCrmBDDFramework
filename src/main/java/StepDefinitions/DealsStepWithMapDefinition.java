package StepDefinitions;
////working fine but u need to comments all the login and deal step definition test cases before run this test case of "deals step with map definition"  
//
//package StepDefinations;
//
//import java.util.List;
//import java.util.Map;
//import org.openqa.selenium.By;
//import org.openqa.selenium.JavascriptExecutor;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.interactions.Actions;
//import cucumber.api.DataTable;
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//import junit.framework.Assert;
//
////datatable with maps: For parameterisation of test cases
//
//public class DealsStepWithMapDefinition {
//
//	WebDriver driver;
//
//	@Given("^user is already on Login Page$")
//	public void user_already_on_login_page() {
//		System.setProperty("webdriver.chrome.driver", "D:\\ChromeDriver\\chromedriver_win32\\chromedriver.exe");
//		driver = new ChromeDriver();
//		driver.get("https://classic.freecrm.com/");
//	}
//
//	@When("^title of login page is Free CRM$")
//	public void title_of_login_page_is_free_CRM() {
//		String title = driver.getTitle();
//		System.out.println(title);
//		Assert.assertEquals("CRMPRO - CRM software for customer relationship management, sales, and support.", title);
//	}
//
//	@Then("^user enters username and password$")
//	public void user_enters_username_and_password(DataTable credentials) {
//		for (Map<String, String> data : credentials.asMaps(String.class, String.class)) {
//
//			driver.findElement(By.name("username")).sendKeys(data.get("username"));
//			driver.findElement(By.name("password")).sendKeys(data.get("password"));
//		}
//	}
//
//	@Then("^user clicks on login button$")
//	public void user_clicks_on_login_button() {
//		WebElement loginBtn = driver.findElement(By.xpath("//input[@type='submit']"));
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		js.executeScript("arguments[0].click();", loginBtn);
//	}
//
//	@Then("^user is on home page$")
//	public void user_is_on_home_page() {
//		String title = driver.getTitle();
//		System.out.println("Home Page title ::" + title);
//		Assert.assertEquals("CRMPRO", title);
//	}
//
//	@Then("^user moves to new deal page$")
//	public void user_moves_to_new_contact_page() {
//		driver.switchTo().frame("mainpanel");
//		Actions action = new Actions(driver);
//		action.moveToElement(driver.findElement(By.xpath("//a[contains(text(),'Deals')]"))).build().perform();
//		driver.findElement(By.xpath("//a[contains(text(),'New Deal')]")).click();
//	}
//
//	@Then("^user enters deal details")
//	public void user_enters_deal_details(DataTable dealData) {
//		for (Map<String, String> data : dealData.asMaps(String.class, String.class)) {
//
//			driver.findElement(By.id("title")).sendKeys(data.get("title"));
//			driver.findElement(By.id("amount")).sendKeys(data.get("amount"));
//			driver.findElement(By.id("probability")).sendKeys(data.get("probability"));
//			driver.findElement(By.id("commission")).sendKeys(data.get("commission"));
//
//			driver.findElement(By.xpath("//input[@type='submit' and @value='Save']")).click(); // Save button
//
//			// move to new deals
//			Actions action = new Actions(driver);
//			action.moveToElement(driver.findElement(By.xpath("//a[contains(text(),'Deals')]"))).build().perform();
//			driver.findElement(By.xpath("//a[contains(text(),'New Deal')]")).click();
//
//		}
//	}
//
//	@Then("^Close the browser$")
//	public void close_the_browser() {
//		driver.quit();
//	}
//}
