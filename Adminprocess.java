package Both;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Adminprocess extends Use {
  
  public void projectsearch(String s) throws Exception {
	  d.manage().timeouts().implicitlyWait(Duration.ofMinutes(1));
	  d.findElement(By.xpath("//span[.='Projects']")).click();
	 WebDriverWait wait=new WebDriverWait(d, Duration.ofMinutes(1));
	  wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//i[@class='icon-more-vertical']")));
	  Thread.sleep(3000);
	  d.findElement(By.xpath("//input[@placeholder='Search by project ID']")).sendKeys(s);
	  Robot r=new Robot();
	  r.keyPress(KeyEvent.VK_ENTER);
	  r.keyRelease(KeyEvent.VK_ENTER);Thread.sleep(5000);
  }
  public void disputesearch(String s) throws Exception {
	  d.manage().timeouts().implicitlyWait(Duration.ofMinutes(2));
	  d.findElement(By.xpath("//span[.='Projects']")).click();Thread.sleep(4000);
	  d.findElement(By.xpath("//span[.='Disputes']")).click();Thread.sleep(4000);
	  d.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys(s);
	  Robot r=new Robot();
	  r.keyPress(KeyEvent.VK_ENTER);
	  r.keyRelease(KeyEvent.VK_ENTER);Thread.sleep(4000);
	  d.findElement(By.xpath("//i[@class='icon-more-vertical']")).click();Thread.sleep(2000);
  }
  public void disputedeny(String s) throws Exception {
	  Adminprocess ad=new Adminprocess();
	  ad.disputesearch(s);
	  d.findElement(By.xpath("//a[.=' Deny Dispute']")).click();Thread.sleep(2000);
	  d.findElement(By.xpath("//textarea")).sendKeys("problem solved");Thread.sleep(2000);
	  d.findElement(By.xpath("//span[.='Submit']")).click();Thread.sleep(2000);
  }
  public void disputeapprove(String s) throws Exception {
	  Adminprocess ad=new Adminprocess();
	  ad.disputesearch(s);
	  d.findElement(By.xpath("//a[.=' Deny Dispute']")).click();Thread.sleep(2000);
	  d.findElement(By.xpath("//textarea")).sendKeys("problem solved");Thread.sleep(2000);
	  
  } 
	  
  }
  
 
  


