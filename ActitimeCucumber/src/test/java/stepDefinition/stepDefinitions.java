package stepDefinition;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class stepDefinitions {
	WebDriver driver;

	@Given("^user is on actitime landing page$")
	public void user_is_on_landing_page() {

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demo.actitime.com/login.do");
		System.out.println("User is On Landing Page");
	}

	@When("^user provides username and password$")
	public void user_provides_username_and_password() {

		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		System.out.println("Password and Username Provided");
	}

	@And("^click on login$")
	public void click_on_login() {
		driver.findElement(By.id("loginButton")).click();
		System.out.println("Login Button Clicked");
	}

	@Then("^Home Page shouldbe displayed$")
	public void Home_Page_shouldbe_displayed() {

		WebElement logoutLink = driver.findElement(By.id("logoutLink"));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(logoutLink));

		System.out.println(driver.getTitle());
		System.out.println("Home Page Displayed");
	}

}
