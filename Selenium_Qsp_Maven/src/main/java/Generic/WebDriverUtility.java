package Generic;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class WebDriverUtility {
	
	public void dropDown(WebElement element,String value) {
		Select select=new Select(element);
		select.selectByValue(value);
	}

}
