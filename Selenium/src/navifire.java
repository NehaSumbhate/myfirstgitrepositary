import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.firefox.FirefoxDriver;

public class navifire {

	public static void main(String[] args) {
		 System.setProperty("webdriver.gecko.driver", "D:\\QA\\WORK SPACE\\Selenium\\Resources\\geckodriver.exe");
		    WebDriver driver  = new FirefoxDriver();
		    Navigation test = driver.navigate();
		    test.to("https://www.myntra.com/");

	}

}
