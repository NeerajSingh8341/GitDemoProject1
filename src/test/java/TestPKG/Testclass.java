package TestPKG;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.github.dockerjava.api.model.Driver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Testclass {
	WebDriver driver;
	
	@BeforeClass
	public void Test1() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.maxlifeinsurance.com/");
	}
	
	
	@Test
	public void test2() {
		String Title=driver.getTitle();
		System.out.println(Title);
		assertEquals("maxlifeinsurance", Title);
	}
	@Test
	public void test3() {
		String Title=driver.getTitle();
		assertEquals("Life Insurance : Max Life Insurance Company in India 2024", Title);
	}

	@AfterClass
	public void test4() {
		driver.close();
		driver.quit();
	}
	
	
}
