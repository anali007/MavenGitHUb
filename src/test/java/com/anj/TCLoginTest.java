package com.anj;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TCLoginTest {
  @Test
  public void login_Test() {
	  
	  WebDriverManager.chromedriver().setup();
	  WebDriver driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  
	  driver.get("https://www.amazon.in/?&ext_vrnc=hi&tag=googinhydr1-21&ref=pd_sl_21dwgmprht_b&adgrpid=58575554323&hvpone=&hvptwo=&hvadid=294136260952&hvpos=&hvnetw=g&hvrand=7252971329340566916&hvqmt=b&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9301058&hvtargid=kwd-309476475962&hydadcr=15413_1904556&gclid=CjwKCAjwo_KXBhAaEiwA2RZ8hPLCkvGe3SsGIlOICMXcQnr9Fb675dp22DIDQJnl0j4u0jvQqqZFUBoC53oQAvD_BwE");
	  
	  Actions action=new Actions(driver);
	  action.moveToElement(driver.findElement(By.id("nav-link-accountList-nav-line-1")));
	 
	  action.moveToElement(driver.findElement(By.xpath("//*[@id=\"nav-flyout-ya-signin\"]/a/span"))).click().perform();
	  
	  driver.findElement(By.id("ap_email")).sendKeys("anjaleenegi15@gmail.com");
	  driver.findElement(By.id("continue")).click();
	  driver.findElement(By.id("ap_password")).sendKeys("anjalee7");
//	  Assert.assertEquals(driver.findElements(By.cssSelector("body > header > nav > div > div.navbar-header > a > img")), "OpenCart - Your Account");
//	  
	  driver.close();
  }
}
