package mindtree.sdet;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.edge.EdgeDriver;
public class Roundtrip { 
	public static void main(String[] args) throws InterruptedException {
// TODO Auto-generated method stub
System.setProperty("webdriver.edge.driver","C:\\Users\\M1077487\\Downloads\\edgedriver_win64 (1)\\msedgedriver.exe");
EdgeDriver edgeDriver = new EdgeDriver();
edgeDriver.get("https://www.savaari.com/");
edgeDriver.findElement(By.xpath("//*[@id=\"approot\"]/mat-sidenav-container/mat-sidenav-content/app-home/div/app-home-container/div[1]/div[1]/div[2]/app-outstation/div/div[2]/label")).click(); edgeDriver.findElement(By.xpath("//*[@id=\"fromCityList\"]")).sendKeys("Hyderabad");
Thread.sleep(1500);
edgeDriver.findElement(By.xpath("//*[@id=\"fromCityList\"]")).sendKeys(Keys.ENTER);
edgeDriver.findElement(By.xpath("//*[@id=\"approot\"]/mat-sidenav-container/mat-sidenav-content/app-home/div/app-home-container/div[1]/div[1]/div[2]/app-outstation/div/form/div[2]/div/input")).sendKeys("Mumbai");
Thread.sleep(1500);
edgeDriver.findElement(By.xpath("//*[@id=\"approot\"]/mat-sidenav-container/mat-sidenav-content/app-home/div/app-home-container/div[1]/div[1]/div[2]/app-outstation/div/form/div[2]/div/input")).sendKeys(Keys.ENTER);
edgeDriver.findElement(By.xpath("//*[@id=\"pickUpTime\"]")).sendKeys(Keys.ENTER);
edgeDriver.findElement(By.xpath("//*[@id=\"approot\"]/mat-sidenav-container/mat-sidenav-content/app-home/div/app-home-container/div[1]/div[1]/div[2]/app-outstation/div/form/div[4]/div/button")).click();
}
	}

