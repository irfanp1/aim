package Both;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
public class Flprocess extends Use {
	Use u=new Use();
	 public void projectapply(String s) throws Exception {
		  d.manage().timeouts().implicitlyWait(Duration.ofMinutes(2));
			//  d.findElement(By.xpath("//span[@class='icon-Close text-white']")).click();
		  d.findElement(By.xpath("//span[.='Available Projects']")).click();
		  WebDriverWait wait=new WebDriverWait(d, Duration.ofMinutes(1));
		  wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//button[.='Submit Proposal']")));
		 d.findElement(By.xpath("//*[.='"+s+"']")).click();Thread.sleep(5000);
		  d.findElement(By.xpath("//button[.='Submit Proposal']")).click();
		  d.findElement(By.xpath("//textarea")).sendKeys("If you've reviewed the project details and believe the budget should be adjusted, you can propose a new budget");
		 String budget = d.findElement(By.xpath("//*[@class='mb-3']")).getText();	
		  d.findElement(By.xpath("//*[contains(text(),'Yes')]")).click();
		  d.findElement(By.xpath("//input[@type='text']")).sendKeys(budget);
		  d.findElement(By.xpath("(//textarea)[2]")).sendKeys("My proposed budget amount.");
		  d.findElement(By.xpath("//button[contains(@class,'btn submit')]")).click();Thread.sleep(3000);
		  try {
			  WebElement e = d.findElement(By.xpath("//*[.='Back to Project']"));
			  u.nextbutton1(e);Thread.sleep(2000);
		} catch (Exception e) {
			 d.findElement(By.xpath("//span[.='Available Projects']")).click();}
		
	  }
	 public void timesheet(String s) throws Exception{
		  d.manage().timeouts().implicitlyWait(Duration.ofMinutes(2));
		  d.findElement(By.xpath("//span[.='My Projects']")).click();Thread.sleep(3000);
		  WebDriverWait wait=new WebDriverWait(d, Duration.ofMinutes(1));
		  wait.until(ExpectedConditions.visibilityOfAllElements(d.findElements(By.xpath("//*[@class='icon-more-vertical purple_color hover_orange']"))));
		  d.findElement(By.xpath("//*[.='"+s+"']")).click();Thread.sleep(3000);
		  d.findElement(By.xpath("//span[.='Timesheet']")).click();Thread.sleep(3000);
		  for (int i = 15; i <=18; i++) {
			  d.findElement(By.xpath("(//*[.=' Add New Record'])[2]")).click();Thread.sleep(3000);
				 d.findElement(By.xpath("(//*[@type='text'])[1]")).click();Thread.sleep(3000);
			     d.findElement(By.xpath("//span[@class='ng-star-inserted' and .='"+i+"']")).click ();Thread.sleep(3000); 
				 d.findElement(By.xpath("(//*[@type='text'])[2]")). sendKeys("Timesheet submitting for current");Thread.sleep(3000); 
				Select hour=new Select(d.findElement(By.xpath("//select[contains(.,'Hr')]")));
				  hour.selectByIndex(i); 
				 Select mts=new Select(d.findElement(By.xpath("//select[contains(.,'Min')]")));
				mts.selectByIndex(i);
				d.findElement(By.xpath("//span[.='Submit']")).click();Thread.sleep(2000);
				if(d.findElement(By.xpath("//div[starts-with(text(),'Timesheet successfully added')]")).isDisplayed())  { 
				System.out.println("Timesheet successfully added");}
		}
	  }
	  public void deliverable(String s) throws Exception { 
			  d.manage().timeouts().implicitlyWait(Duration.ofMinutes(2));
			  d.findElement(By.xpath("//span[.='My Projects']")).click();Thread.sleep(3000);
			 WebDriverWait wait=new WebDriverWait(d, Duration.ofMinutes(1));
			  wait.until(ExpectedConditions.visibilityOfAllElements(d.findElements(By.xpath("//*[@class='icon-more-vertical purple_color hover_orange']"))));
			  d.findElement(By.xpath("//*[.='"+s+"']")).click();Thread.sleep(3000);
			  d.findElement(By.xpath("//span[.='Deliverables']")).click();Thread.sleep(3000);
			  d.findElement(By.xpath("//button[.=' Submit Project']")).click();Thread.sleep(3000);
			  d.findElement(By.xpath("//textarea[@type='text']")).sendKeys("i am sending deliverable to you");
			  d.findElement(By.xpath("(//span[.='Upload Files'])[2]")).click();
			 Thread.sleep(2000);
			 Flprocess fp=new Flprocess();
			 fp.addfile("C:\\Users\\ciadmin\\Downloads\\add.pdf");
			 Thread.sleep(2000);
			    JavascriptExecutor executor =(JavascriptExecutor) d;
				 WebElement findElement = d.findElement(By.xpath("//button[@type='submit']"));
				  executor.executeScript("arguments[0].click();", findElement);Thread.sleep(2000);
			    d.findElement(By.xpath("//button[.='Back to Dashboard']")).click();
	  }
	 public void conflict_submit(String s) throws Exception {
		 d.manage().timeouts().implicitlyWait(Duration.ofMinutes(2));
			//  d.findElement(By.xpath("//span[@class='icon-Close text-white']")).click();
		  d.findElement(By.xpath("//span[.='Available Projects']")).click();
		  WebDriverWait wait=new WebDriverWait(d, Duration.ofMinutes(1));
		  wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//button[.='Submit Proposal']")));
		  d.findElement(By.xpath("//a[.='Pending Proposals']")).click();Thread.sleep(4000);
		  d.findElement(By.xpath("//*[.='"+s+"']")).click();Thread.sleep(5000);
		 d.findElement(By.xpath("//span[.='Conflict Check']")).click();Thread.sleep(3000);
		 d.findElement(By.xpath("(//input)[1]")).click();Thread.sleep(2000);
		 JavascriptExecutor executor =(JavascriptExecutor) d;
		 WebElement findElement = d.findElement(By.xpath("//button[@type='submit']"));
		  executor.executeScript("arguments[0].click();", findElement);Thread.sleep(2000);	 
		 
		 
	 }
	  
	  
}
