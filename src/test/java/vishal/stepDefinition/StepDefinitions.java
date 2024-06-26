package vishal.stepDefinition;

import io.cucumber.java.en.Given;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.When;
import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;
import io.cucumber.java.en.Then;
import static org.junit.Assert.assertEquals;

public class StepDefinitions {

    private int num1;
    private int num2;
    private int result;

    @Given("I have two numbers {int} and {int}")
    public void i_have_two_numbers_and(int number1, int number2) {
        this.num1 = number1;
        this.num2 = number2;
        
      
		System.setProperty("webdriver.chrome.driver.", "C:/Users/visha/Downloads/chromedriver_win32.exe");

		
        WebDriver driver=new ChromeDriver();
        
        driver.get("https://www.google.com/");
        
        System.out.println("This is GitDemo User");
        
        System.out.println("This is changed by gitsStuff user");
        
        driver.close();
        
        
    }

    @When("I add them")
    public void i_add_them() {
        this.result = num1 + num2;
    }

    @Then("the result should be {int}")
    public void the_result_should_be(int expectedResult) {
        assertEquals(expectedResult, result);
    }
}