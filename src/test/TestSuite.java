package test;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class TestSuite{
	
	public static final String UsName = "TestU108";
	public static final String UsPwd = "TestU100";
	
	
   public static void main(String[] args) {
	   
	   System.setProperty("webdriver.chrome.driver","C:\\Users\\Ashok Aravind\\OneDrive\\Documents\\Work\\SJ1\\CBA_Shari\\driver\\chromedriver.exe");
	   WebDriver driver = new ChromeDriver();
      
	   driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	   driver.manage().window().maximize();
	   driver.get("https://responsivefight.herokuapp.com/");
	   driver.findElement(By.xpath("//*[@id=\"rego\"]")).click();
	   
	   driver.findElement(By.xpath("//*[@id=\"uname\"]")).sendKeys(UsName);
	   driver.findElement(By.xpath("//*[@id=\"pwd\"]")).sendKeys(UsPwd);
	   driver.findElement(By.xpath("//*[@id=\"psw-repeat\"]")).sendKeys(UsPwd);
	   
	   driver.findElement(By.xpath("//*[@id=\"signupbtn\"]")).click();
	   
	  
	   driver.findElement(By.xpath("//*[@id=\"worrior_pwd\"]")).sendKeys(UsPwd);	   
	   driver.findElement(By.xpath("//*[@id=\"warrior\"]")).click();
	   
	   driver.findElement(By.xpath("//*[@id=\"start\"]")).click();
	   	   
	   // Take the bus flow  	
	   driver.findElement(By.xpath("//*[@id=\"bus\"]")).click();
	 
	   String bus1 = driver.findElement(By.xpath("//*[@id=\"staticBackdropLabel\"]")).getAttribute("innerHTML");
	   
	   if (bus1.trim().equals("You have taken the public bus.."))
		   System.out.println(" Test public bus scenario success");
	   else
		   System.out.println(" Test public bus scenario failed");
	   
	   
	   driver.findElement(By.xpath("//*[@id=\"bus_answer_1\"]")).click();
	   
	   
	   //Try next battle
	   driver.findElement(By.xpath("//*[@id=\"close_correct_modal_btn\"]")).click();	   
	 
	   
	   // Restaurant flow
	   
	   String res1 = driver.findElement(By.xpath("//*[@id=\"staticBackdropLabel\"]")).getAttribute("innerHTML");
	   
	   if (res1.trim().equals("You are seated at a restaurant.."))
		   System.out.println(" Test restaurant scenario success");
	   else
		   System.out.println(" Test restaurant scenario failed");
	   
	   driver.findElement(By.xpath("//*[@id=\"restaurant_timer_start\"]")).click();
	   
	   driver.findElement(By.xpath("//*[@id=\"restaurant_answer_1\"]")).click();
	   
	 
	   //Try next battle
	   driver.findElement(By.xpath("//*[@id=\"close_correct_modal_btn\"]")).click();	
	   
	 
	   // Office flow
	   String off1 = driver.findElement(By.xpath("//*[@id=\"staticBackdropLabel\"]")).getAttribute("innerHTML");
	   
	   if (off1.trim().equals("You have entered the office.."))
		   System.out.println(" Test restaurant scenario success");
	   else
		   System.out.println(" Test restaurant scenario failed");
	   
	   driver.findElement(By.xpath("//*[@id=\"start\"]")).click();
	   
	   driver.findElement(By.xpath("//*[@id=\"office_answer_2\"]")).click();
	   
	   
	   //Check Final Score
	   driver.findElement(By.xpath("//*[@id=\"leaderboard_link\"]")).click();	
	   
	      
	   
   }
     
}