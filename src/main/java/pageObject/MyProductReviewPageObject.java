package pageObject;

import org.openqa.selenium.WebDriver;

import commons.BaseMethod;

public class MyProductReviewPageObject extends BaseMethod{
	private WebDriver driver;
	
	public MyProductReviewPageObject(WebDriver driver) {
		this.driver = driver;
	}

}
