package test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UI_Searchby_datatopicid {

	private static final String Assert = null;

	public static void main(String[] args) throws InterruptedException, SQLException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\\\\\\\\\\\\\\\Users\\\\\\\\\\\\\\\\A1494969\\\\\\\\\\\\\\\\Downloads\\\\\\\\\\\\\\\\chromedriver_win32 (3)\\\\\\\\\\\\\\\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://mdr-dt.dt01-lcp-a.na.bestbuy.com/");
        driver.manage().window().maximize();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"root\"]/div/main/div/div/div/div[2]/div/button")).click();
        Thread.sleep(1000);
        Thread.sleep(500);
        driver.findElement(By.id("ContentPlaceHolder1_MFALoginControl1_UserIDView_txtUserid_UiInput")).sendKeys("A1494969");
        driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_MFALoginControl1_UserIDView_tbxPassword_UiInput\"]")).sendKeys("y4rj5Fh5");
        driver.findElement(By.xpath("//*[@id=\"ngView\"]/div/div[2]/div[2]/user-id-button/div/div/a")).click();
        Thread.sleep(1000);
        Thread.sleep(500);
        driver.findElement(By.xpath("//*[@id=\"root\"]/div/main/div/div/div/div[1]/div")).click();
        driver.findElement(By.xpath("//*[@id=\"root\"]/div/main/div/div[2]/div[1]/div[1]/div/div[2]/div[2]")).click();
        driver.findElement(By.xpath("//*[@id=\"root\"]/div/main/div/div/div/div[2]/div/input")).sendKeys("*");
        driver.findElement(By.xpath("//*[@id=\"root\"]/div/main/div/div/div/div[2]/div/i")).click();
        Thread.sleep(1000);
        Thread.sleep(500);
       String a=  driver.findElement(By.xpath("//*[@id=\"root\"]/div/main/div/div[3]/div/table/tbody/tr[1]/td[1]")).getText();
       String b=  driver.findElement(By.xpath("//*[@id=\"root\"]/div/main/div/div[3]/div/table/tbody/tr[1]/td[2]/a")).getText();
       String c=  driver.findElement(By.xpath("//*[@id=\"root\"]/div/main/div/div[3]/div/table/tbody/tr[1]/td[3]")).getText();
       String d=  driver.findElement(By.xpath("//*[@id=\"root\"]/div/main/div/div[3]/div/table/tbody/tr[1]/td[4]/a")).getText();
       String E=  driver.findElement(By.xpath("//*[@id=\"root\"]/div/main/div/div[3]/div/table/tbody/tr[1]/td[5]")).getText();
     //  String f=  driver.findElement(By.xpath("//*[@id=\"root\"]/div/main/div/div[2]/div/table/tbody/tr[1]/td[7]")).getText();
       String g=  driver.findElement(By.xpath("//*[@id=\"root\"]/div/main/div/div[3]/div/table/tbody/tr[2]/td[1]")).getText();
       String h=  driver.findElement(By.xpath("//*[@id=\"root\"]/div/main/div/div[3]/div/table/tbody/tr[2]/td[2]/a")).getText();
       String i=  driver.findElement(By.xpath("//*[@id=\"root\"]/div/main/div/div[3]/div/table/tbody/tr[2]/td[3]")).getText();
       String j=  driver.findElement(By.xpath("//*[@id=\"root\"]/div/main/div/div[3]/div/table/tbody/tr[2]/td[4]/a")).getText();
       String k=  driver.findElement(By.xpath("//*[@id=\"root\"]/div/main/div/div[3]/div/table/tbody/tr[2]/td[5]")).getText();
     //  String l=  driver.findElement(By.xpath("//*[@id=\"root\"]/div/main/div/div[2]/div/table/tbody/tr[2]/td[7]")).getText();
       String m=  driver.findElement(By.xpath("//*[@id=\"root\"]/div/main/div/div[3]/div/table/tbody/tr[3]/td[1]")).getText();
       String n=  driver.findElement(By.xpath("//*[@id=\"root\"]/div/main/div/div[3]/div/table/tbody/tr[3]/td[2]/a")).getText();
       String o=  driver.findElement(By.xpath("//*[@id=\"root\"]/div/main/div/div[3]/div/table/tbody/tr[3]/td[3]")).getText();
       String p=  driver.findElement(By.xpath("//*[@id=\"root\"]/div/main/div/div[3]/div/table/tbody/tr[2]/td[4]/a")).getText();
       String q=  driver.findElement(By.xpath("//*[@id=\"root\"]/div/main/div/div[3]/div/table/tbody/tr[3]/td[5]")).getText();
       String r=  driver.findElement(By.xpath("//*[@id=\"root\"]/div/main/div/div[3]/div/table/tbody/tr[3]/td[6]/a")).getText();
       String s=  driver.findElement(By.xpath("//*[@id=\"root\"]/div/main/div/div[3]/div/table/tbody/tr[3]/td[7]")).getText();
       String E1= driver.findElement(By.xpath("//*[@id=\"root\"]/div/main/div/div[3]/div/table/tbody/tr[4]/td[1]")).getText();
       String t=  driver.findElement(By.xpath("//*[@id=\"root\"]/div/main/div/div[3]/div/table/tbody/tr[4]/td[2]/a")).getText();
       String u=  driver.findElement(By.xpath("//*[@id=\"root\"]/div/main/div/div[3]/div/table/tbody/tr[4]/td[3]")).getText();
       String v=  driver.findElement(By.xpath("//*[@id=\"root\"]/div/main/div/div[3]/div/table/tbody/tr[4]/td[4]/a")).getText();
       String w=  driver.findElement(By.xpath("//*[@id=\"root\"]/div/main/div/div[3]/div/table/tbody/tr[4]/td[5]")).getText();
       String x=  driver.findElement(By.xpath("//*[@id=\"root\"]/div/main/div/div[3]/div/table/tbody/tr[4]/td[6]/a")).getText();
       String y=  driver.findElement(By.xpath("//*[@id=\"root\"]/div/main/div/div[3]/div/table/tbody/tr[4]/td[7]")).getText();
       String E2= driver.findElement(By.xpath("//*[@id=\"root\"]/div/main/div/div[3]/div/table/tbody/tr[5]/td[1]")).getText();
       String z=  driver.findElement(By.xpath("//*[@id=\"root\"]/div/main/div/div[3]/div/table/tbody/tr[5]/td[2]/a")).getText();
       String A=  driver.findElement(By.xpath("//*[@id=\"root\"]/div/main/div/div[3]/div/table/tbody/tr[5]/td[3]")).getText();
       String B=  driver.findElement(By.xpath("//*[@id=\"root\"]/div/main/div/div[3]/div/table/tbody/tr[5]/td[4]/a")).getText();
       String C=  driver.findElement(By.xpath("//*[@id=\"root\"]/div/main/div/div[3]/div/table/tbody/tr[5]/td[5]")).getText();
       String D=  driver.findElement(By.xpath("//*[@id=\"root\"]/div/main/div/div[3]/div/table/tbody/tr[5]/td[6]/a")).getText();
       String E3= driver.findElement(By.xpath("//*[@id=\"root\"]/div/main/div/div[3]/div/table/tbody/tr[5]/td[7]")).getText();

       Thread.sleep(1000);
      // driver.findElement(By.xpath("//*[@id=\"menu-\"]/div[3]/ul/li[1]")).click();
       //driver.findElement(By.xpath("//*[@id=\"menu-\"]/div[3]/ul/li[3]")).click();
       

       
       System.out.println("UI DATA : "+a+" "+b+" "+c+" "+d+" "+E1+" ");
       System.out.println("UI DATA : "+g+" "+h+" "+i+" "+j+" "+k+" ");
       System.out.println("UI DATA : "+m+" "+n+" "+o+" "+p+" "+q+" "+r+" ");
       System.out.println("UI DATA : "+s+" "+t+" "+u+" "+v+" "+w+" "+x+" "+y+" ");
       System.out.println("UI DATA : "+E2+" "+z+" "+A+" "+B+" "+C+" "+D+" "+E3+" ");

       


       try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		
       Connection con = DriverManager.getConnection("jdbc:oracle:thin:@(DESCRIPTION=(LOAD_BALANCE=on)(FAILOVER=on)(ADDRESS=(PROTOCOL=TCP)(HOST=dlocdb05.na.bestbuy.com)(PORT=50000))(CONNECT_DATA=(SERVER=DEDICATED)(SERVICE_NAME=d01inrpdb01.world)(FAILOVER_MODE=(TYPE=session)(METHOD=basic))))","WBG_INT_ONL01","Metadata#64$");           
       Statement stmt=con.createStatement();
       ResultSet rs=stmt.executeQuery("Select * from INT_SCH01.DATA_TOPIC where ACTIVE LIKE 'A'");
       while(rs.next())  
       	//a=rs.getInt(1);
          System.out.println("DB data : "+rs.getInt(49)+" "+rs.getObject(3)+" "+rs.getObject(4)+" "+rs.getString(9)+" "+rs.getString(7)+" "+rs.getObject(32));
       con.close(); 
       }
       catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}        
     //  Assert.assertEquals("2019231213",driver.findElement(By.xpath("//*[@id=\\\"root\\\"]/div/main/div/div[2]/div/table/tbody/tr[1]/td[1]")));
	}
}