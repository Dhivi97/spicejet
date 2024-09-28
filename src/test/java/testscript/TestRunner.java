package testscript;


import java.io.IOException;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

import utils.ConfigProperty;
import utils.FileReaderManager;
import utils.baseclass;

@RunWith(Cucumber.class)
@CucumberOptions(features = { "src\\test\\java\\feature\\spicejetasignup.feature",
		"src\\test\\java\\feature\\spicejetblogin.feature",
		"src\\test\\java\\feature\\spicejetconewaytrip.feature",
		"src\\test\\java\\feature\\spicejetdroundtrip.feature",
		"src\\test\\java\\feature\\spicejetevalidation.feature",
		"src\\test\\java\\feature\\spicejetfpaymentprocess.feature"},
glue = {"stepdefinition" },
dryRun = false,
monochrome = true,
plugin = {"pretty", "json:cucumberreports\\CucumberReport.json",
						"html:cucumberreports\\CucumberReport.html" }
)

public class TestRunner extends baseclass {

	public  WebDriver driver;

	@BeforeClass
	public void setUp(String browser, String url) throws IOException {
		 ConfigProperty config = FileReaderManager.getInstance().getConfigReader();
	     launchBrowser(browser);
	     launchUrl(url);
	}

	@AfterClass
	public  void tearDown() {
		driver.quit();
	}
}
