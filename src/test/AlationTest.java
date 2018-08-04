package test;

import org.testng.annotations.BeforeSuite;


import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(tags = { "~@excluded" }, plugin = { "pretty", "html:target/cucumber",
		"testng:target/testng-results.xml", "json:target/cucumber-report.json" }, features = {
				"classpath:features" }, glue = { "steps" }, monochrome = true)

public class AlationTest extends AbstractTestNGCucumberTests{
	@BeforeSuite
	public void setUp() throws Exception {
		System.out.println("hrllo");
	}

	/**
	 * Log properties.
	 *
	 * @param config
	 *            the config
	 */
	// public void logProperties(Properties config){
	// log.info("Logging Default Configurations of the Co-browse Test");
	// Set<Object> keys = config.keySet();
	// for(Object propertyName : keys){
	// log.info(propertyName +" : "+config.get(propertyName));
	// }
	// }

	// @AfterSuite
	// public void tearDown() throws AtsConfigEx, IOException{
	// Context.getContext().getMaster().close();
	// Context.getContext().getSlave().close();
	// }
	// }

}
