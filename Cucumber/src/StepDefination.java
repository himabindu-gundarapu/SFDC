import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefination {
	@Given("^use for loop$")
	public void use_for_loop() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println(" loop ");
	}

	@When("^to print all numbers$")
	public void to_print_all_numbers() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("print numbers");
	}

	@Then("^From (\\d+) to \"([^\"]*)\"$")
	public void from_to(int arg1, String arg2) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   System.out.println(" print 1 to 10");
	}


}
