package Pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class NewTest {
	@Test
	public void prg()
	{
				
				System.out.println("Browser opening....");
				System.setProperty("webdriver.gecko.driver", "G:/geckodriver-v0.26.0-win64/geckodriver.exe");
				WebDriver w = new FirefoxDriver();
				w.get("https://www.google.com/");
				System.out.println("Google opened.....");
				w.quit();
				System.out.println(".....");
	}

}
