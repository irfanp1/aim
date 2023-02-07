package Both;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

public class Clientnegative extends Use {
	Use u=new Use();
	Clientstatus cs=new Clientstatus();
 public void maximum_Laws(String id,ExtentTest extentTest) throws Exception {
	this.extenttest=extentTest;
	 cs.projectsearch(id);Thread.sleep(3000);
	 d.findElement(By.xpath("//i[@class='icon-more-vertical']")).click();Thread.sleep(2000);
	 d.findElement(By.xpath("(//*[.=' Edit'])[2]")).click();Thread.sleep(4000);
	 WebElement e = d.findElement(By.xpath("(//*[.='Project Description '])[1]"));
	 u.nextbutton1(e);Thread.sleep(3000);
	 Select Practicearea=new Select(d.findElement(By.xpath("(//select)[1]")));
	   Practicearea.selectByIndex(12);Thread.sleep(3000);
	   u.snackbar_alert(extentTest);
	  Practicearea.selectByIndex(5);Thread.sleep(3000);
	  u.snackbar_alert(extentTest);
	  Select CaseType=new Select(d.findElement(By.xpath("(//select[contains(@class,'border-bottom ca')])[2]")));
	  CaseType.selectByIndex(25);Thread.sleep(3000);
	  u.snackbar_alert(extentTest);
	  CaseType.selectByIndex(7);Thread.sleep(3000);
	  u.snackbar_alert(extentTest);
	  Select ProjectType=new Select(d.findElement(By.xpath("(//select[contains(@class,'border-bottom ca')])[3]")));
	 ProjectType.selectByIndex(5);
	 u.snackbar_alert(extentTest);
  }
public void request_areas(ExtentTest extentTest) throws Exception {
	this.extenttest=extentTest;
	clientprocess c=new clientprocess();Clientnegative cg=new Clientnegative();
	WebElement l1 = d.findElement(By.xpath("//a[contains(text(),'If the Practice')]"));
	u.nextbutton1(l1);Thread.sleep(2000);
cg.reqmeth("1", extentTest);
	WebElement l2 = d.findElement(By.xpath("//a[contains(text(),'Case')]"));
	u.nextbutton1(l2);Thread.sleep(2000);
	cg.reqmeth("3", extentTest);
	WebElement l3 = d.findElement(By.xpath("//a[contains(text(),'Project Type')]"));
	u.nextbutton1(l3);Thread.sleep(2000);
	cg.reqmeth("4", extentTest);
}
 public void reqmeth(String s,ExtentTest extentTest) throws Exception {
	 this.extenttest=extentTest;clientprocess c=new clientprocess();
	 WebElement e = d.findElement(By.xpath("(//input[@type='text'])[2]"));
		WebElement t = d.findElement(By.xpath("//h3[contains(text(),'Add New')]"));
		WebElement sub = d.findElement(By.xpath("//button[.='Submit']"));
		WebElement cl = d.findElement(By.xpath("//div[contains(@class,'modal_header')]/button/span"));
		e.click();t.click();Thread.sleep(2000);
		c.alerts_list1(extentTest);
		e.sendKeys(s);u.nextbutton1(sub);Thread.sleep(2000);
		u.snackbar_alert(extentTest);cl.click();
 }
 
 
 
 
 
 public void duplicate_Question(ExtentTest extentTest) throws Exception {
	 this.extenttest=extentTest;
	 JavascriptExecutor executor =(JavascriptExecutor) d; 
	  WebElement findElement =d.findElement(By.xpath("(//*[.='Conflict Checklist '])[1]"));
	  executor.executeScript("arguments[0].click();", findElement);Thread.sleep(3000);
	// d.findElement(By.xpath("")).click();Thread.sleep(3000);
	 d.findElement(By.xpath("//input[contains(@class,'capitalize')]")).sendKeys("what ur opinion");
	  d.findElement(By.xpath("//button[.='Add']")).click();Thread.sleep(3000);
	 WebElement ele = d.findElement(By.xpath("//*[@ng-reflect-label-name='Add New Questions']/small"));
	  ele.isDisplayed();
	  extenttest.log(Status.INFO, ele.getText());Thread.sleep(3000);
 }
 public void duplicates_files(String id,ExtentTest extentTest) throws Exception {
	 this.extenttest=extentTest;
	 cs.projectsearch(id);
 d.findElement(By.xpath("//i[@class='icon-more-vertical']")).click();Thread.sleep(2000);
	 d.findElement(By.xpath("(//*[.=' View Project'])[2]")).click();Thread.sleep(3000);
	 d.findElement(By.xpath("//span[.='Documents']")).click();Thread.sleep(2000);
	 d.findElement(By.xpath("//button[.='Upload']")).click();Thread.sleep(2000);
	 d.findElement(By.xpath("//span[.='Add Documents']")).click();Thread.sleep(2000);
	 u.addfile("C:\\Users\\ciadmin\\Downloads\\add.pdf");Thread.sleep(3000);
	 d.findElement(By.xpath("//span[.='Add Documents']")).click();Thread.sleep(2000);
	 u.addfile("C:\\Users\\ciadmin\\Downloads\\add.pdf");Thread.sleep(3000);
	u.snackbar_alert(extentTest);
	  d.findElement(By.xpath("//span[.='Add Documents']")).click();Thread.sleep(2000);
	  u.addfile("C:\\Users\\ciadmin\\Downloads\\faied.html");Thread.sleep(3000);
	  WebElement ele1 = d.findElement(By.xpath("//ul[@class='list_style']"));
	  ele1.isDisplayed(); extenttest.log(Status.INFO, ele1.getText());Thread.sleep(3000);
	  d.findElement(By.xpath("//span[.='Add Documents']")).click();Thread.sleep(2000);
	  u.addfile("C:\\Users\\ciadmin\\Downloads\\LatestFileV3-Pass-55551.rar");
	  Thread.sleep(3000); WebElement ele2 =d.findElement(By.xpath("//ul[@class='list_style']")); 
	  ele2.isDisplayed();
	  extenttest.log(Status.INFO, ele2.getText());Thread.sleep(3000);
	  //d.findElement(By.xpath("//span[@class='icon-Close text-white']")).click();Thread.sleep(3000);
	  WebElement q = d.findElement(By.xpath("//span[.='Submit']"));
	u.nextbutton1(q);Thread.sleep(1000);
	WebElement  ele3=d.findElement(By.xpath("//div[@class='alert-effect alert alert-success alert-dismissible']"));
	extenttest.log(Status.INFO, ele3.getText().replace("×", ""));Thread.sleep(2000);
 }
 public void delete_document(ExtentTest extentTest) throws Exception {
	 this.extenttest=extentTest;
	 WebElement e = d.findElement(By.xpath("(//span[contains(@class,'icon-Delete')])[1]"));
	 u.nextbutton1(e);Thread.sleep(3000);
	WebElement e1 = d.findElement(By.xpath("//button[.='Delete']"));
	 u.nextbutton1(e1);Thread.sleep(3000);
	 u.success_alert(extentTest);
 }
 
 
 
 
 public void coflict_check_alert(String s,ExtentTest extentTest) throws Exception {
	 this.extenttest=extentTest;
	 cs.projectsearch(s);
	 d.findElement(By.xpath("//i[@class='icon-more-vertical']")).click();Thread.sleep(3000);
	 d.findElement(By.xpath("(//*[.=' View Project'])[2]")).click();Thread.sleep(3000);
	 d.findElement(By.xpath("//span[.='Conflict Checklist']")).click();Thread.sleep(2000);
	 d.findElement(By.xpath("//button[.='Hire']")).click();Thread.sleep(2000);
	u.snackbar_alert(extentTest);
	
 }

 public void invalid_login(ExtentTest extentTest) throws Exception {
	 this.extenttest=extentTest;
	 clientprocess cp=new clientprocess();
	 d.manage().timeouts().pageLoadTimeout(Duration.ofMinutes(3));
		d.get("https://beta.tech.us/projects/aim_qa_562981/client/#/auth/signin");
		 WebElement email = d.findElement(By.xpath("//*[@type='email']"));
		  WebElement pwd = d.findElement(By.xpath("//*[@type='password']"));
		  email.click(); pwd.click(); email.click();Thread.sleep(3000);
		  cp.alerts_list1(extentTest);
		  email.sendKeys("nirfanpalyam+01@comp/india.com");Thread.sleep(2000);
		pwd.sendKeys("Test@12345678");
		cp.alerts_list1(extentTest);email.clear();
		  email.sendKeys("nirfanpalyam+01@comppiindia.com");
		  d.findElement(By.xpath("//*[.='Log In']")).click();Thread.sleep(3000);
		  u.snackbar_alert(extentTest);
		  email.clear();
		  email.sendKeys("nirfanpalyam+01@compindia.com");
		  d.findElement(By.xpath("//*[.='Log In']")).click();Thread.sleep(3000);
		  u.snackbar_alert(extentTest);
		  email.clear();
		  email.sendKeys("nirfanpalyam+05@compindia.com");
		  pwd.clear();
		  pwd.sendKeys("Test@123");
		  d.findElement(By.xpath("//*[.='Log In']")).click();Thread.sleep(3000);
		  WebElement ele1 = d.findElement(By.xpath("//h3"));
		  extenttest.log(Status.INFO, ele1.getText());Thread.sleep(3000);
		  d.findElement(By.xpath("//*[.='Re-send Verification Email']")).click();Thread.sleep(1000);
		 // u.success_alert(extentTest);
		  
 }

 public void forgot_password(ExtentTest extentTest) throws Exception {
	 this.extenttest=extentTest;
	 clientprocess cp=new clientprocess();
	 WebElement e1 = d.findElement(By.xpath("//a[.='Forgot Password?']"));
	 u.nextbutton1(e1);Thread.sleep(3000);
	 WebElement email = d.findElement(By.xpath("//*[@type='email']"));
	 email.click();d.findElement(By.xpath("//h3")).click();
	 Thread.sleep(2000);
	 cp.alerts_list1(extentTest);
		email.sendKeys("nirfanpalyam+01@comp/india.com");Thread.sleep(2000);
		d.findElement(By.xpath("//h3")).click();Thread.sleep(2000);
		 WebElement ele = d.findElement(By.xpath("//small[@class='text-danger']"));
		  extenttest.log(Status.INFO, ele.getText());Thread.sleep(3000);
		  email.clear();
		  email.sendKeys("nirfanpalyam+01@comppiindia");
		  d.findElement(By.xpath("//button[@type='submit']")).click();Thread.sleep(3000);
		  u.snackbar_alert(extentTest);
		  email.clear();
		  email.sendKeys("nirfanpalyam+01@compipindia.com");
		  d.findElement(By.xpath("//button[@type='submit']")).click();Thread.sleep(3000);
		  u.snackbar_alert(extentTest);
		  email.clear();
		  email.sendKeys("nirfanpalyam+05@compindia.com");
		  d.findElement(By.xpath("//button[@type='submit']")).click();Thread.sleep(2000);
		  WebElement ele2 = d.findElement(By.xpath("(//h3)[2]"));
		  extenttest.log(Status.INFO, ele2.getText());Thread.sleep(2000);
		  d.findElement(By.xpath("//button[.='Re-send Activation Email']")).click();Thread.sleep(3000);
		  email.clear();
		  email.sendKeys("nirfanpalyam+01@compindia.com");Thread.sleep(1000);
		  WebElement e = d.findElement(By.xpath("//button[@type='submit']"));
		  u.nextbutton1(e);Thread.sleep(3000);
		 WebElement  ele1=d.findElement(By.xpath("//div[@class='alert-effect alert alert-success alert-dismissible']"));
			extenttest.log(Status.INFO, ele1.getText().replace("×", ""));Thread.sleep(2000);
		  d.findElement(By.xpath("//img")).click();Thread.sleep(3000);
 }

 
 public void invitefl(ExtentTest extentTest) throws Exception {
	 this.extenttest=extentTest;
	  d.manage().timeouts().implicitlyWait(Duration.ofMinutes(1));
	 d.findElement(By.xpath("//span[.='Find Talent']")).click();Thread.sleep(3000);
	 d.findElement(By.xpath("(//a[@class='br_5 btn font_14 invite_btn white_orange_border'])[1]")).click();
 	try {
 		WebElement findElement1 = d.findElement(By.xpath("(//button[.='Invite'])[1]"));
 	 	u.nextbutton1(findElement1);Thread.sleep(2000);
	} catch (Exception e) {
		 d.findElement(By.xpath("//span[@class='icon-Close text-white']")).click();Thread.sleep(2000);
	}
 	
 	
 	
 }
 public void my_profile_neg(ExtentTest extentTest) throws Exception {
	 this.extenttest=extentTest;
	 clientprocess log=new clientprocess();
	 d.findElement(By.xpath("//span[.='Email & Password']")).click();
	 d.findElement(By.xpath("(//span[.='My Profile'])[3]")).click();Thread.sleep(2000);
	  WebElement fe2 = d.findElement(By.xpath("(//a[.='Edit'])[1]"));
	  u.nextbutton1(fe2); Thread.sleep(2000);
		 String sb = d.findElement(By.xpath("(//input[@placeholder='State Bar Number'])[1]")).getText();Thread.sleep(2000);
		 System.out.println("sb="+sb);
		 d.findElement(By.xpath("(//input[@placeholder='State Bar Number'])[2]")).sendKeys(sb);
		 Select st=new Select(d.findElement(By.xpath("(//select)[1]")));
		  String f = st.getFirstSelectedOption().getText();
		  System.out.println(f);
		  Select st1=new Select(d.findElement(By.xpath("(//select)[2]")));
		  st1.selectByVisibleText(f);Thread.sleep(2000);
		  d.findElement(By.xpath("//span[contains(@class,'icon-ios-plus')]")).click();Thread.sleep(2000);
		  u.snackbar_alert(extentTest);
	  d.findElement(By.xpath("//*[contains(@class,'icon-delete')]")).click();Thread.sleep(1000);
	  Select s=new Select(d.findElement(By.xpath("(//select)[2]")));
      s.selectByVisibleText(" Administrative law");Thread.sleep(2000);
      u.snackbar_alert(extentTest);
      s.selectByIndex(22);Thread.sleep(2000);
      u.snackbar_alert(extentTest);
      Select s1=new Select(d.findElement(By.xpath("(//select)[3]")));
	 s1.selectByIndex(1);Thread.sleep(2000);
	 u.snackbar_alert(extentTest);
	 d.findElement(By.xpath("(//label[.='Primary Practice Area *']/following::span)[3]")).click();
		d.findElement(By.xpath("(//label[.='General Practice Area(s) *']/following::span[contains(@class,'icon-Close')])[1]")).click();
	     Thread.sleep(2000);
	      d.findElement(By.xpath("(//span[.='Save'])[1]")).click();  Thread.sleep(2000);
	    // log.fieldclick("Law Firm");u.cleardata();
	     log.signupdata("Law Firm", "Law Firm");u.cleardata();Thread.sleep(2000);
	   d.findElement(By.xpath("//label[.='State Bar Number *']")).click();Thread.sleep(2000);
	      log.alerts_list1(extentTest);
	      d.findElement(By.xpath("//a[.='Cancel']")).click();Thread.sleep(2000);
 }
 
 public void email_neg(ExtentTest extentTest) throws Exception {
	 clientprocess c=new clientprocess();
	 this.extenttest=extentTest;
	 d.findElement(By.xpath("//span[.='Email & Password']")).click();Thread.sleep(3000);
	 d.findElement(By.xpath("(//a[.='Edit'])[1]")).click();Thread.sleep(2000);
	WebElement em = d.findElement(By.xpath("(//input[@type='email'])[2]"));
	WebElement cem = d.findElement(By.xpath("(//input[@type='email'])[3]"));
	em.click();cem.click();em.click();Thread.sleep(2000);
	c.alerts_list1(extentTest);
	em.sendKeys("ram");cem.sendKeys("jam");em.click();Thread.sleep(2000);
	c.alerts_list1(extentTest);
	 em.clear();cem.clear();
	 em.sendKeys("ram@ram");cem.sendKeys("ram@ram");
	 d.findElement(By.xpath("(//span[.='Save'])[1]")).click();Thread.sleep(2000);
	 u.snackbar_alert(extentTest);
	 em.clear();cem.clear();Thread.sleep(2000);
	 em.sendKeys("nirfanpalyam+01@compindia.com");cem.sendKeys("nirfanpalyam+01@compindia.com");
	 d.findElement(By.xpath("(//span[.='Save'])[1]")).click();Thread.sleep(3000);
	 u.snackbar_alert(extentTest);
	 d.findElement(By.xpath("(//a[.='Cancel'])[1]")).click();Thread.sleep(2000);
 }
 public void password_neg(ExtentTest extentTest) throws Exception {
	 this.extenttest=extentTest; 
	 clientprocess cp=new clientprocess();
	 d.findElement(By.xpath("(//a[.='Edit'])[2]")).click();Thread.sleep(2000);
	WebElement cup = d.findElement(By.xpath("(//input[@type='password'])[1]"));
	 WebElement np = d.findElement(By.xpath("(//input[@type='password'])[2]"));
	WebElement cnp = d.findElement(By.xpath("(//input[@type='password'])[3]"));
	cup.click();np.click();cnp.click();cup.click();Thread.sleep(2000);
	cp.alerts_list1(extentTest);
	cup.sendKeys("asdfghhjk");np.sendKeys("jvdwsadsbv");cnp.sendKeys("jsdkfeiwu");cup.click();Thread.sleep(2000);
	cp.alerts_list1(extentTest);
	np.clear();cnp.clear();np.sendKeys("Test@123");cnp.sendKeys("Test@123");
	System.out.println(np.getText());
	 d.findElement(By.xpath("(//span[.='Save'])[1]")).click();Thread.sleep(2000);
	 u.snackbar_alert(extentTest);
	 cup.clear();cup.sendKeys("Test@123");
	 d.findElement(By.xpath("(//span[.='Save'])[1]")).click();Thread.sleep(2000);
	 u.snackbar_alert(extentTest);
	 d.findElement(By.xpath("(//a[.='Cancel'])[1]")).click();Thread.sleep(2000);
 }
 
 
 
 
 
}
