package StepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.*;

public class LoginWithHardCodedValues {


//	WebDriver driver = null;
//
//	@Given("browser is open")
//	public void browser_is_open() {
//
//		String projectPath = System.getProperty("user.dir");
//		System.setProperty("webdriver.chrome.driver", projectPath+"/src/test/resources/Drivers/chromedriver.exe");
//		driver= new ChromeDriver();		
//		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
//		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
//		driver.manage().window().maximize();
//	}
//
//	@Given("user is on Login page")
//	public void user_is_on_login_page() {
//		driver.navigate().to("https://example.testproject.io/web/");
//	}
//
//	@When("user enters username and password")
//	public void user_enters_username_and_password() throws InterruptedException {
//		driver.findElement(By.id("name")).sendKeys("DollySingh");
//		driver.findElement(By.id("password")).sendKeys("12345");
//		Thread.sleep(3000);
//	}
//
//	@And("user clicks on Login")
//	public void user_clicks_on_Login() throws InterruptedException {
//		driver.findElement(By.id("login")).click();
//		Thread.sleep(3000);
//	}
//
//	@Then("user is navigated to TestForm page")
//	public void user_is_navigated_to_TestForm_page() {
//		driver.findElement(By.id("logout")).isDisplayed();
//	}
//
//	@When("user enters the form details")
//	public void user_enters_the_form_details() throws InterruptedException {
//		Select select = new Select(driver.findElement(By.id("country")));
//		select.selectByValue("IN");		
//		driver.findElement(By.id("address")).sendKeys("1468, Sector3,Faridabad");
//		driver.findElement(By.id("email")).sendKeys("dollysingh396@gmail.com");
//		driver.findElement(By.id("phone")).sendKeys("8629186671");
//		Thread.sleep(3000);
//	}
//
//	@When("clicks on Save Button")
//	public void clicks_on_save_button() throws InterruptedException {
//		driver.findElement(By.id("save")).click();
//		Thread.sleep(3000);
//	}
//
//	@Then("validate Form is saved")
//	public void validate_form_is_saved() {
//		driver.findElement(By.id("saved")).isDisplayed();
//		driver.close();
//		driver.quit();
//	}

}
