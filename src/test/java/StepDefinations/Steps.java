package StepDefinations;

import java.io.IOException;
import org.openqa.selenium.WebDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import common.common;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.json.simple.JSONObject;
import org.json.simple.parser.ParseException;
import org.junit.Assert;
import pages.homepage;

public class Steps {

	public static WebDriver driver = null;
	public static JSONObject dataobj,configobj;
	public static Logger logger;
	
	@Given("User completed the initial setup")
	public void initial_setup() throws InterruptedException, IOException, ParseException {
		
		logger = Logger.getLogger("Steps");
		PropertyConfigurator.configure("log4j.properties");
		
		configobj = common.readJSON(System.getProperty("user.dir")+"\\src\\test\\java\\data\\configuration.json");
		dataobj = common.readJSON(System.getProperty("user.dir")+"\\src\\test\\java\\data\\testdata.json"); 
		
		driver = common.openBrowser(driver, (String)configobj.get("browser"));
		
		driver.get((String)configobj.get("url"));
	    homepage.getCookieBtn().click();
	    logger.info("initial setup completed successfully");
	}

	@When("User Login to application")
	public void logintoApp() throws InterruptedException {
		homepage.getloginasSubscriberBtn().click();
		homepage.getUnameTxt().sendKeys((String)dataobj.get("username"));
		homepage.getContinueBtn().click();
		homepage.getPassTxt().sendKeys((String)dataobj.get("password"));
		homepage.getLoginBtn().click();
	}
}
