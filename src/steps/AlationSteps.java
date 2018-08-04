package steps;
import org.openqa.selenium.WebDriver;



import cfg.WebDriverConfig;
import context.context;
import cucumber.api.DataTable;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import model.Model;
public class AlationSteps {
	private static Model model = null;
	
	public AlationSteps() throws Exception {
		model=context.getModel();
	}
	
	@Given("^user opened page ([^\"]*)$")
    public void userOpenedPage( String pageUrl ){
		
}}
