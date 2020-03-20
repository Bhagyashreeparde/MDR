package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UI_LOGOUT {
//Logout
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\\\\\\\Users\\\\\\\\A1494969\\\\\\\\Downloads\\\\\\\\chromedriver_win32 (3)\\\\\\\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://mdr-dt.dt01-lcp-a.na.bestbuy.com/");
        driver.manage().window().maximize();	
        driver.findElement(By.xpath("//*[@id=\"root\"]/div/main/div/div/div/div[2]/div/button")).click();
        Thread.sleep(1000);
        driver.findElement(By.id("ContentPlaceHolder1_MFALoginControl1_UserIDView_txtUserid_UiInput")).sendKeys("A1494969");
        driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_MFALoginControl1_UserIDView_tbxPassword_UiInput\"]")).sendKeys("y4rj5Fh5");
        driver.findElement(By.xpath("//*[@id=\"ngView\"]/div/div[2]/div[2]/user-id-button/div/div/a")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]/header/div/div[1]/i")).click();
        driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]/header/div/div[1]/div[2]/a[3]")).click();
	}

}
