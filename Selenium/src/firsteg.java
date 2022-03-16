import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.GeckoDriverInfo;
import org.openqa.selenium.firefox.GeckoDriverService;

public class firsteg {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","Resources\\chromedriver.exe");
		ChromeDriver obj = new ChromeDriver();
		obj.get("https://www.flipkart.com/?s_kwcid=AL!739!3!582822158567!e!!g!!flipkart&gclsrc=aw.ds&&semcmpid=sem_8024046704_brand_exe_buyers_goog&gclid=Cj0KCQiAjc2QBhDgARIsAMc3SqTkXpc1WGAjcNvWwGNXfRgftGO-iecFZ2WyJEYepr3XiaqulVC1MAwaAoxWEALw_wcB");
		System.out.println(obj.getTitle());

		
	}

}
