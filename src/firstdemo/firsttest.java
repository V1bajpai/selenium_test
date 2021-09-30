package firstdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
//import org.openqa.selenium.support.ui.Select;

public class firsttest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1. Open the browser
		System.setProperty("webdriver.chrome.driver", "C:\\browserdriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		
		//2. Textarea Name, Mobile no., Email Address, Password, Address, submit
		driver.get("https://itera-qa.azurewebsites.net/home/automation");		
		driver.findElement(By.id("name")).sendKeys("Meena bal");
		driver.findElement(By.id("phone")).sendKeys("9090908800");
		driver.findElement(By.id("email")).sendKeys("abc@gmail.com");
		driver.findElement(By.id("password")).sendKeys("1234");
		driver.findElement(By.id("address")).sendKeys("118 Noida Up");
		driver.findElement(By.name("submit")).click();
		
		//3. Checkbox/Radio- Gender, Week days
		driver.findElement(By.id("male")).click();
		driver.findElement(By.id("saturday")).click();
		driver.findElement(By.id("sunday")).click();



		
		//4. Dropdown- Travel
		Select trvlDropdown = new Select(driver.findElement(By.className("custom-select")));
		trvlDropdown.selectByVisibleText("Norway");
		
		//5. checkbox/radio- YOExperience, Automation tool
		driver.findElement(By.cssSelector("body > div > div:nth-child(6) > div.card-body > div:nth-child(1) > div:nth-child(2) > label")).click();
		driver.findElement(By.xpath("/html/body/div/div[5]/div[2]/div[2]/div[1]/label")).click();

		
		//6. Upload file (Browse, Upload)
		WebElement upload_file = driver.findElement(By.id("inputGroupFile02"));

		upload_file.sendKeys("C:\\My_Development\\chrome_extension\\logo.png");
//		driver.findElement(By.xpath("//*[@id=\"inputGroupFile02\"]")).sendKeys("C:\\My_Development\\chrome_extension\\logo.png");
//		driver.findElement(By.cssSelector("input[type=\"file\"]")).click();
		
		//7. Close the browser
		

	}

}
