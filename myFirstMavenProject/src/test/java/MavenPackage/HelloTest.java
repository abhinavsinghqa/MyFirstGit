package MavenPackage;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class HelloTest {
	
	@Test
	public void myFirstMaven()
	{
		System.out.println("This is my First Maven project");
		
		WebDriver driver=new FirefoxDriver();
		driver.get("https://web.skype.com/en/");
		System.out.println("Change made in Dev branch");
	}

}
