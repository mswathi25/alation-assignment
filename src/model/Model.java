package model;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import cfg.WebDriverConfig;
import page.page;
import org.openqa.selenium.support.ui.Select;
public class Model {

	WebDriver driver;

	public Model() throws Exception {
		driver = WebDriverConfig.createLocalDriver("chrome");
	}
	
	public void openPageWithUrl(String url) {
		driver.get(url);
	}
	
	public void selectCategoryFromPage(String url) {
		Select dropdown = new Select(driver.findElement(page.SEARCH_DROPDOWN));
		dropdown.selectByValue("Books");
	}
	
	public void enterText(String url) {
		Select dropdown = new Select(driver.findElement(page.SEARCH_DROPDOWN));
		dropdown.selectByValue("Books");
	}
	
}
