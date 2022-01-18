package mindtree.sdet;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class App 
{
        public static void main(String[] args) throws InterruptedException {
    		// TODO Auto-generated method stub

    		System.setProperty("webdriver.edge.driver",
    				"C:\\Users\\M1077487\\Downloads\\edgedriver_win64 (1)\\msedgedriver.exe");
    				WebDriver driver=new EdgeDriver();
    				// xPath -> //tagName[@attribute='value']
    				// Css selector-> //tagName[attribute='value']
    				driver.get("https://www.savaari.com/");
    				driver.manage().window().maximize();
    				String halfxPath = "//*[@id=\"approot\"]/mat-sidenav-container/mat-sidenav-content/app-home/div/app-home-container/div[1]/div[1]/div[2]/app-outstation/div";
    				//hover
    				driver.findElement(By.xpath("//*[@id=\"approot\"]/mat-sidenav-container/mat-sidenav-content/app-home/div/app-home-container/div[1]/div[1]/div[1]/div[1]/a/span")).click();

    				driver.findElement(By.id("oneway_radio")).isSelected();
    				driver.findElement(By.id("fromCityList")).click();
    				driver.findElement(By.id("fromCityList")).sendKeys("Bangalore");
    				Thread.sleep(2000);
    				driver.findElement(By.id("fromCityList")).sendKeys(Keys.ENTER);

    				driver.findElement(By.xpath(halfxPath + "/form/div[2]/div/input")).sendKeys("Mysore");
    				Thread.sleep(2000);
    				driver.findElement(By.xpath(halfxPath + "/form/div[2]/div/input")).sendKeys(Keys.ENTER);



    				driver.findElement(By.xpath("//*[@id=\"pickUpTime\"]")).sendKeys(Keys.ENTER);
    				driver.findElement(By.xpath("//*[@id=\"approot\"]/mat-sidenav-container/mat-sidenav-content/app-home/div/app-home-container/div[1]/div[1]/div[2]/app-outstation/div/form/div[4]/div/button")).click();
    				
    	}
}
