import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class firefoxauto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","Resources\\geckodriver.exe");
	    WebDriver driver = new FirefoxDriver();
	    driver.get("https://www.amazon.in/");
		
		System.out.println(driver.getTitle());
		
		

	}

}
