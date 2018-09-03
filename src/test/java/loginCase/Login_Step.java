package loginCase;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.en.And;
import cucumber.api.java.en.But;

public class Login_Step {

	private String Page = "https://test.intranet.osde/IV3/login.asp";
	
	WebDriver driver; 
	WebDriverWait wait;
	
    
	@Given("^you are in Given annotation$")
	public void given() throws Throwable {
	}

	@When("^you are in When annotation$")
	public void when() throws Throwable {
	}

	@Then("^you are in Then annotation$")
	public void then() throws Throwable {
	}

	@And("^you are in And annotation$")
	public void and() throws Throwable {
	}

	@But("^you are in But annotation$")
	public void but() throws Throwable {
	}

	@And("^some other precondition$")
	public void someOtherPrecondition() throws Throwable {
	}

	@Given("^I want to open the intranet$")
	public void iWantToOpenTheIntranet() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\ChromeDriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(Page);
	}

	@And("^I write the username and password$")
	public void iWriteTheUsernameAndPassword() throws Throwable {
		driver.findElement(By.id("usuario")).sendKeys("SS36739794");
		driver.findElement(By.id("password")).sendKeys("intranet08");
	}

	@When("^I click on the login button$")
	public void iClickOnTheLoginButton() throws Throwable {
		driver.findElement(By.name("submit")).click();
	}

	@Then("^I login in the intranet page$")
	public void iLoginInTheIntranetPage() throws Throwable {
		System.out.println("Exito");
	}

	

}
