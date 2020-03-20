package test;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UI_Searchby_datatopicname {

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
        driver.findElement(By.xpath("//*[@id=\"root\"]/div/main/div/div/div/div[1]/div/div[1]")).click();
        driver.findElement(By.xpath("//*[@id=\"root\"]/div/main/div/div[2]/div[1]/div[1]/div/div[2]/div[3]/span")).click();
        driver.findElement(By.xpath("//*[@id=\"root\"]/div/main/div/div/div/div[2]/div/input")).sendKeys("*");
        driver.findElement(By.xpath("//*[@id=\"root\"]/div/main/div/div/div/div[2]/div/i")).click();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        Thread.sleep(2000);
        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
        Thread.sleep(1000);
        Thread.sleep(1000);
        driver.findElement(By.className("MuiSvgIcon-root")).click();
        //driver.close();
	}

}
