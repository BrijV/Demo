package demJenks;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class DemoJenk {

	@Test
	public void demoTest() {

		Logger logger = Logger.getLogger("LogDemo");

		PropertyConfigurator.configure("Log4j.properties");

		WebDriver driver = new FirefoxDriver();

		logger.info("firefox Opened");

		driver.manage().window().maximize();
		logger.info("firefox maximized");

		// driver.get("http://www.ksrtc.in/site/");
		driver.get("http://www.google.com");
		logger.info("firefox launched");

		driver.findElement(By.name("q")).sendKeys("hello", Keys.ENTER);
		logger.info("firefox click on seargh button");

		String title = "hello - Google Search";
		logger.info("firefox capture the text");
		String actualTitle = driver.getTitle();
		System.out.println(actualTitle);

		if (title.equals(actualTitle)) {

			logger.info("firefox title matched");
			System.out.println("Title match");
		} else
			System.out.println("Title did not match");

		driver.quit();

	}

}
