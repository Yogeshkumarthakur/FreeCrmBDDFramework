////working but below code is taken from naveen still some sequence issue and some missing steps while executing hooks concept is not very clear to me
//
//package StepDefinitions;
//
//import cucumber.api.java.After;
//
//import cucumber.api.java.Before;
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//
//public class Hooks_StepDefinition {
//
//	@Before
//	public void setUP() {
//		System.out.println("launch FF");
//		System.out.println("Enter URL for Free CRM APP");
//	}
//
//	@After
//	public void tearDown() {
//		System.out.println("close the browser");
//	}
//
//	@Given("^user is on deal page$")
//	public void user_is_on_deal_page() {
//	}
//
//	@When("^user fills the deals form$")
//	public void user_fills_the_deals_form() {
//	}
//
//	@Then("^deal is created$")
//	public void deal_is_created() {
//	}
//
//	@Given("^user is on contact page$")
//	public void user_is_on_contact_page() {
//		System.out.println("user is on contact page");
//
//	}
//
//	@When("^user fills the contact form$")
//	public void user_fills_the_contact_form() {
//		System.out.println("create a contact");
//	}
//
//	@Then("^contact is created$")
//	public void contact_is_created() {
//		System.out.println("contact is created");
//	}
//
//	@Given("^user is on mail page$")
//	public void user_is_on_mail_page() throws Throwable {
//		System.out.println("user is on mail pahge");
//	}
//
//	@When("^user fills the mail form$")
//	public void user_fills_the_mail_form() throws Throwable {
//		System.out.println("create a mail");
//	}
//
//	@Then("^mail is created$")
//	public void mail_is_created() throws Throwable {
//		System.out.println("mail is created");
//	}
//
//}