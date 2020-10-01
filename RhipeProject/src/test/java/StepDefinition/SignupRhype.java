package StepDefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class SignupRhype {

	WebDriver driver;

	@Given("^Launch Chrome browser$")
	public void launch_Chrome_browser() throws Throwable {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
	}

	@When("^User opens URL \"([^\"]*)\"$")
	public void user_opens_URL(String url) throws Throwable {
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}

	@When("^User enters General Information$")
	public void user_enters_General_Information() throws Throwable {
		// Set "Business/Billing Entity Name" in textbox
				driver.findElement(By.id("CustomerName")).sendKeys("Test Company");

				// Set "Legal Entity ID (Tax, ABN, NPWP)" in textbox
				driver.findElement(By.name("RegistrationNumber")).sendKeys("456678900");

				// Set "Address Line 1" in textbox
				driver.findElement(By.name("Street1")).sendKeys("Unit 3, 1127");

				// Set "Address Line 2" in textbox
				driver.findElement(By.name("Street2")).sendKeys("Poath Road ");

				// Set "Line 3" in textbox
				driver.findElement(By.name("Street3")).sendKeys("Oakleigh");

				// Set "City" in textbox
				driver.findElement(By.name("City")).sendKeys("Melbourne");

				// Set "State" in textbox
				driver.findElement(By.name("State")).sendKeys("Victoria");

				// Set "PostCode" in textbox
				driver.findElement(By.name("Postcode")).sendKeys("3155");

				// Set "Main Phone" in textbox
				driver.findElement(By.name("MainPhone")).sendKeys("0478987456");

				// Set "Website" in textbox
				driver.findElement(By.name("WebUrl")).sendKeys("https://www.google.com/");

				// Set "Email" in textbox
				driver.findElement(By.name("Email")).sendKeys("rhipetest1@test.com");

				// Set "How did you hear about Rhipe?" in dropdown
				WebElement dropdown1 = driver.findElement(By.name("Source"));
				Select sel1 = new Select(dropdown1);
				sel1.selectByVisibleText("Rhipe Website");

				// Set "Industry Type" in dropdown
				WebElement dropdown2 = driver.findElement(By.name("IndustryType"));
				Select sel2 = new Select(dropdown2);
				sel2.selectByVisibleText("Finance Provider");

				System.out.println("General Information : All mandatory fields entered");
	}

	@When("^User enters Authorised Signatory Contact details$")
	public void user_enters_Authorised_Signatory_Contact_details() throws Throwable {
	   
		// Set Authorised Signatory Contact

				// Set "First Name" in textbox
				driver.findElement(By.id("PrimaryContactFirstName")).sendKeys("FirstName");

				// Set " Last Name" in textbox
				driver.findElement(By.id("PrimaryContactLastName")).sendKeys("LastName");

				// Set "Direct Phone" in textbox
				driver.findElement(By.id("PrimaryContactPhone")).sendKeys("0478956777");

				// Set "Job Title" in textbox
				driver.findElement(By.id("PrimaryContactJobTitle")).sendKeys("TestAnalyst");

				// Set "Email" in textbox
				driver.findElement(By.id("PrimaryContactEmail")).sendKeys("testing@test.com");
				System.out.println("Autorized Signatory Contact : All mandatory fields entered");
	}

	
	
	@When("^Click on Sign up button$")
	public void click_on_Sign_up_button() throws Throwable {
		// Print a Text instead of clicking on Sign up button
		System.out.println("Happy Path: Move to Sign Up");
		
		// Uncomment below line to close the browser window post the test execution
		// driver.close();
	}

}
