import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class first
{
	public static void main(String args[])
	{
	  System.setProperty("webdriver.chrome.driver","G:\\Rose Java Programs\\selenium\\chromedriver.exe");
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://www.facebook.com");
	  driver.manage().window().maximize();
	  driver.findElement(By.id("email")).sendKeys("smart.roshni2008@gmail.com");
	  driver.findElement(By.name("pass")).sendKeys("password");
	  //driver.findElement(By.xpath("//input[@value='Log In']")).click();
	  WebElement bday=driver.findElement(By.id("day"));
	  Select date=new Select(bday);
	  date.selectByValue("25");
	  
	  WebElement bmonth=driver.findElement(By.id("month"));
	  Select month=new Select(bmonth);
	  month.selectByVisibleText("Jun");
	  
	  WebElement byear=driver.findElement(By.id("year"));
	  Select year=new Select(byear);
	  year.selectByIndex(33);
	}
}
