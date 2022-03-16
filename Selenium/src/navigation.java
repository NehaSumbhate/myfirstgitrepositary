import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class navigation {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "Resources\\chromedriver.exe");
	ChromeDriver obj = new ChromeDriver();
	Navigation test = obj.navigate();
	test.to("https://www.myntra.com/");
   
	}

}
