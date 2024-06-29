package emaillogin;
import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PractiseEmaillogin {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://mail.google.com/mail/u/1/#sent");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("uspatilathani12@gmail.com");
		driver.findElement(By.xpath("//span[@jsname='V67aGc']")).click();
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("12341234");
		driver.findElement(By.xpath("//span[@jsname='V67aGc']")).click();
		driver.findElement(By.xpath("//div[@class='z0']/div")).click();
		driver.findElement(By.xpath("//input[@id=':tk']")).sendKeys("uspatilathani12@gmail.com");
		driver.findElement(By.xpath("//input[@name='subjectbox']")).sendKeys("Test Mail");
		driver.findElement(By.xpath("//div[@id=':r7']")).sendKeys("Test Email Body");
		driver.findElement(By.xpath("((//div[@id=':1ka'])/div)[1]")).click();
		driver.findElement(By.xpath("(//div[@id=':1kd'])/div")).click();
		
		List<WebElement> a = driver.findElements(By.xpath("//div[@class='J-M-Jz aiL']/div"));
		Thread.sleep(2000);
		for (int i = 0; i < a.size(); i++) {
			if (a.get(i).getText().equalsIgnoreCase("social")) {
				a.get(i).click();
				break;
			}
		}
		driver.findElement(By.xpath("//div[@id=':pn']")).click();
		driver.findElement(By.xpath("(//div[@class='aio UKr6le'])[1]")).click();
		driver.findElement(By.xpath("//div[@id=':1u']")).click();
		
		
		
	}

}
