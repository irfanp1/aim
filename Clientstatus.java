package Both;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;
public class Clientstatus extends Use {
	 public void projectsearch(String s) throws Exception {
			  d.manage().timeouts().implicitlyWait(Duration.ofMinutes(2));
			  d.findElement(By.xpath("//span[.='Dashboard']")).click();
			  d.findElement(By.xpath("//span[.='Projects']")).click();Thread.sleep(3000);
			  WebDriverWait wait=new WebDriverWait(d, Duration.ofMinutes(2));
			  wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//i[@class='icon-more-vertical']")));
			  d.findElement(By.xpath("//input[@placeholder='Project Name']")).sendKeys(s);Thread.sleep(2000);
			  Robot r=new Robot();
			  r.keyPress(KeyEvent.VK_ENTER);
			  r.keyRelease(KeyEvent.VK_ENTER);Thread.sleep(3000);
	 }
	 public void invoicesearch(String s) throws Exception {
		  d.manage().timeouts().implicitlyWait(Duration.ofMinutes(2));
		  d.findElement(By.xpath("//span[.='Dashboard']")).click();
		  d.findElement(By.xpath("//span[.='Invoices']")).click();Thread.sleep(5000);
		  d.findElement(By.xpath("//input[@placeholder='Project ID']")).sendKeys(s);Thread.sleep(2000);
		  Robot r=new Robot();
		  r.keyPress(KeyEvent.VK_ENTER);
		  r.keyRelease(KeyEvent.VK_ENTER);Thread.sleep(3000);
    }
	 public void stautspublish(String s) throws Exception {
		  d.manage().timeouts().implicitlyWait(Duration.ofMinutes(2));
		 d.findElement(By.xpath("//span[.='Dashboard']")).click();Thread.sleep(4000);
		  Clientstatus cs=new Clientstatus(); SoftAssert sa=new SoftAssert();
		  cs.projectsearch(s);
		  sa.assertEquals( d.findElement(By.xpath("//li[@class='mb-0 font_12']")).getText(), "Published");
		  d.findElement(By.xpath("//i[@class='icon-more-vertical']")).click();Thread.sleep(2000);
		  d.findElement(By.xpath("(//*[.=' View Project'])[2]")).click();Thread.sleep(4000);
		  sa.assertEquals(d.findElement(By.xpath("//li[@class='mb-0 font_13']")).getText(), "Published");
		  d.findElement(By.xpath("//*[@class='back_arrow_btn']")).click();Thread.sleep(3000);
		  cs.projectsearch(s);
		  d.findElement(By.xpath("//i[@class='icon-more-vertical']")).click();Thread.sleep(2000);
		  d.findElement(By.xpath("(//*[.=' Applicants'])[2]")).click();Thread.sleep(4000);
		  sa.assertEquals(d.findElement(By.xpath("//li[@class='mb-0 font_13']")).getText(), "Publish");Thread.sleep(1000);
		  System.out.println("Published label displayed"); 
		  sa.assertAll();
	 }
	 public void statusinprogress(String s) throws Exception {
		  d.manage().timeouts().implicitlyWait(Duration.ofMinutes(2));
		  Clientstatus cs=new Clientstatus(); SoftAssert sa=new SoftAssert();
		  cs.projectsearch(s);
		  sa.assertEquals(d.findElement(By.xpath("//li[@class='mb-0 font_12']")).getText(), "In Progress");
		  d.findElement(By.xpath("//i[@class='icon-more-vertical']")).click();Thread.sleep(2000);
		  d.findElement(By.xpath("(//*[.=' View Project'])[2]")).click();Thread.sleep(4000);
		  sa.assertEquals(d.findElement(By.xpath("//li[@class='mb-0 font_13']")).getText(), "In Progress");
		  d.findElement(By.xpath("//*[@class='back_arrow_btn']")).click();
		  cs.projectsearch(s);
		  d.findElement(By.xpath("//i[@class='icon-more-vertical']")).click();Thread.sleep(2000);
		  d.findElement(By.xpath("(//*[.=' Applicants'])[2]")).click();Thread.sleep(4000);
		  sa.assertEquals(d.findElement(By.xpath("//li[@class='mb-0 font_13']")).getText(), "In Progress");
		  d.findElement(By.xpath("//*[@class='back_arrow_btn']")).click();
		  cs.invoicesearch(s);
		  sa.assertEquals(d.findElement(By.xpath("(//li[@class='mb-0 font_13'])[1]")).getText(), "In Progss");
		  System.out.println("In Progress label displayed"); 
		  sa.assertAll();
	}
	public void statusdelivered(String s) throws Exception {
		  d.manage().timeouts().implicitlyWait(Duration.ofMinutes(2));
		  Clientstatus cs=new Clientstatus(); SoftAssert sa=new SoftAssert();
		 cs.projectsearch(s);
		  sa.assertEquals(d.findElement(By.xpath("//li[@class='mb-0 font_12']")).getText(), "Delivered");
		  d.findElement(By.xpath("//i[@class='icon-more-vertical']")).click();Thread.sleep(3000);
		  d.findElement(By.xpath("(//*[.=' View Project'])[2]")).click();Thread.sleep(4000);
		  sa.assertEquals( d.findElement(By.xpath("//li[@class='mb-0 font_12']")).getText(), "Delivered");
		  d.findElement(By.xpath("//*[@class='back_arrow_btn']")).click();Thread.sleep(3000);
		  cs.projectsearch(s);
		  d.findElement(By.xpath("//i[@class='icon-more-vertical']")).click();Thread.sleep(3000);
		  d.findElement(By.xpath("(//*[.=' Applicants'])[2]")).click();Thread.sleep(4000);
		  sa.assertEquals(d.findElement(By.xpath("//li[@class='mb-0 font_12']")).getText(),"Delivered");
		  d.findElement(By.xpath("//*[@class='back_arrow_btn']")).click();
		  cs.invoicesearch(s);
		  sa.assertEquals(d.findElement(By.xpath("(//li[@class='mb-0 font_13'])[1]")).getText(),"Deliver");
		  System.out.println("Delivered label displayed"); 
		  sa.assertAll();
	}
	public void statusinrevision(String s) throws Exception {
		  d.manage().timeouts().implicitlyWait(Duration.ofMinutes(2));
		  Clientstatus cs=new Clientstatus();SoftAssert sa=new SoftAssert();
		 cs.projectsearch(s);
		  sa.assertEquals(d.findElement(By.xpath("//li[@class='mb-0 font_12']")).getText(), "In Revision");
		  d.findElement(By.xpath("//i[@class='icon-more-vertical']")).click();Thread.sleep(3000);
		  d.findElement(By.xpath("(//*[.=' View Project'])[2]")).click();Thread.sleep(4000);
		  sa.assertEquals(d.findElement(By.xpath("//li[@class='mb-0 font_13']")).getText(),"In Revision");
		  d.findElement(By.xpath("//*[@class='back_arrow_btn']")).click();Thread.sleep(3000);
		  cs.projectsearch(s);
		  d.findElement(By.xpath("//i[@class='icon-more-vertical']")).click();Thread.sleep(4000);
		  d.findElement(By.xpath("(//*[.=' Applicants'])[2]")).click();Thread.sleep(4000);
		  sa.assertEquals(d.findElement(By.xpath("//li[@class='mb-0 font_12']")).getText(), "In Revision");
		  d.findElement(By.xpath("//*[@class='back_arrow_btn']")).click();
		  cs.invoicesearch(s);
		  sa.assertEquals(d.findElement(By.xpath("(//li[@class='mb-0 font_13'])[1]")).getText(),"In Revise");
		  System.out.println("In Revision label displayed"); 
		  sa.assertAll();
	}
	public void statusapproved (String s) throws Exception {
		  d.manage().timeouts().implicitlyWait(Duration.ofMinutes(2));
		  Clientstatus cs=new Clientstatus();	 SoftAssert sa=new SoftAssert();
		 cs.projectsearch(s);
		  sa.assertEquals(d.findElement(By.xpath("//li[@class='mb-0 font_12']")).getText(),"Approved");
		  d.findElement(By.xpath("//i[@class='icon-more-vertical']")).click();Thread.sleep(3000);
		  d.findElement(By.xpath("(//*[.=' View Project'])[2]")).click();Thread.sleep(4000);
		  sa.assertEquals(d.findElement(By.xpath("//li[@class='mb-0 font_13']")).getText(), "Approved");
		  d.findElement(By.xpath("//*[@class='back_arrow_btn']")).click();Thread.sleep(3000);
		  cs.projectsearch(s);
		  d.findElement(By.xpath("//i[@class='icon-more-vertical']")).click();Thread.sleep(3000);
		  d.findElement(By.xpath("(//*[.=' Applicants'])[2]")).click();Thread.sleep(4000);
		  sa.assertEquals(d.findElement(By.xpath("//li[@class='mb-0 font_13']")).getText(), "Approved");
		  d.findElement(By.xpath("//*[@class='back_arrow_btn']")).click();
		  cs.invoicesearch(s);
		  sa.assertEquals(d.findElement(By.xpath("(//li[@class='mb-0 font_13'])[1]")).getText(), "Approv");
		  System.out.println("Approved label displayed"); 
		  sa.assertAll();
	}

	public void statusdisputeopen(String s) throws Exception {
		 d.manage().timeouts().implicitlyWait(Duration.ofMinutes(2));
		 Clientstatus cs=new Clientstatus();	 SoftAssert sa=new SoftAssert();
		 cs.projectsearch(s);
		  sa.assertEquals(d.findElement(By.xpath("//li[@class='mb-0 font_12']")).getText(), "Dispute Open");
		  d.findElement(By.xpath("//i[@class='icon-more-vertical']")).click();Thread.sleep(3000);
		  d.findElement(By.xpath("(//*[.=' View Project'])[2]")).click();Thread.sleep(4000);
		  sa.assertEquals(d.findElement(By.xpath("//li[@class='mb-0 font_13']")).getText(), "Dispute Open");
		  d.findElement(By.xpath("//*[@class='back_arrow_btn']")).click();
		  cs.projectsearch(s);
		  d.findElement(By.xpath("//i[@class='icon-more-vertical']")).click();Thread.sleep(3000);
		  d.findElement(By.xpath("(//*[.=' Applicants'])[2]")).click();Thread.sleep(4000);
		  sa.assertEquals(d.findElement(By.xpath("//li[@class='mb-0 font_13']")).getText(), "Dispute Open");
		  d.findElement(By.xpath("//*[@class='back_arrow_btn']")).click();
		  cs.invoicesearch(s);
		  sa.assertEquals(d.findElement(By.xpath("(//li[@class='mb-0 font_13'])[1]")).getText(), "Dispute ");
		  System.out.println("Dispute Open label displayed"); 
		  sa.assertAll();
	}
	public void statusdisputeclosed(String s) throws Exception {
		 d.manage().timeouts().implicitlyWait(Duration.ofMinutes(2));
		 Clientstatus cs=new Clientstatus();	 SoftAssert sa=new SoftAssert();
		 cs.projectsearch(s);
		  sa.assertEquals(d.findElement(By.xpath("//li[@class='mb-0 font_12']")).getText(), "Dispute Closed");
		  d.findElement(By.xpath("//i[@class='icon-more-vertical']")).click();Thread.sleep(3000);
		  d.findElement(By.xpath("(//*[.=' View Project'])[2]")).click();Thread.sleep(4000);
		  sa.assertEquals(d.findElement(By.xpath("//li[@class='mb-0 font_13']")).getText(), "Dispute Closed");
		  d.findElement(By.xpath("//*[@class='back_arrow_btn']")).click();
		  cs.projectsearch(s);
		  d.findElement(By.xpath("//i[@class='icon-more-vertical']")).click();Thread.sleep(3000);
		  d.findElement(By.xpath("(//*[.=' Applicants'])[2]")).click();Thread.sleep(4000);
		  sa.assertEquals(d.findElement(By.xpath("//li[@class='mb-0 font_13']")).getText(), "Dispute Closed");
		  d.findElement(By.xpath("//*[@class='back_arrow_btn']")).click();
		  cs.invoicesearch(s);
		  sa.assertEquals(d.findElement(By.xpath("(//li[@class='mb-0 font_13'])[1]")).getText(), "Dispute ");
		  System.out.println("Dispute Closed label displayed"); 
		  sa.assertAll();
	}
}
