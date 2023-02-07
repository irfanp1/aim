package Both;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Parameters;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
public class clientprocess extends Use {
 Clientstatus cs=new Clientstatus();
 Use us=new Use();
  public   void nextbutton() {
	  JavascriptExecutor executor =(JavascriptExecutor) d;
		 WebElement findElement = d.findElement(By.xpath("//*[.='Next']"));
		  executor.executeScript("arguments[0].click();", findElement);
  }
  public void alerts_list1(ExtentTest extentTest) {
	  this.extenttest=extentTest; 
	  List<WebElement> al =d.findElements(By.xpath("//small"));
	  for( WebElement q : al) {
	  extenttest.log(Status.INFO,q.getText()); } 
	  }
  public  String postproject(ExtentTest extentTest,String projecttitle) throws Exception {
	  this.extenttest=extentTest;
	  clientprocess log=new clientprocess();
	  d.manage().timeouts().implicitlyWait(Duration.ofMinutes(2));
	  d.findElement(By.xpath("//span[.='Messages']")).click();Thread.sleep(4000);
	  d.findElement(By.xpath("//span[.='Projects']")).click();Thread.sleep(7000);
	  WebElement post = d.findElement(By.xpath("//span[.='Post a Project']"));post.click();
	  Thread.sleep(3000);
	 // WebDriverWait wt=new WebDriverWait(d, Duration.ofMinutes(2));
	 // wt.until(ExpectedConditions.elementToBeClickable(post));
//step-1
	  
	  log.nextbutton();Thread.sleep(3000);
	  log.alerts_list1(extenttest);Thread.sleep(2000);
	
	  d.findElement(By.xpath("//input[@type='text']")).sendKeys(projecttitle);
	  Select Practicearea=new Select(d.findElement(By.xpath("(//select)[1]")));
	  for (int i=1;i<=10;i++) {Practicearea.selectByIndex(i);}
	  Select CaseType=new Select(d.findElement(By.xpath("(//select[contains(@class,'border-bottom ca')])[2]")));
	  for (int i=1;i<=20;i++) {CaseType.selectByIndex(i);}
	  Select ProjectType=new Select(d.findElement(By.xpath("(//select[contains(@class,'border-bottom ca')])[3]")));
	  for (int i=1;i<=30;i++) {ProjectType.selectByIndex(i);}
	 
	  log.nextbutton();Thread.sleep(3000);
//step-2
	  log.nextbutton();Thread.sleep(3000);
	  log.alerts_list1(extenttest);Thread.sleep(2000);
		  d.findElement(By.xpath("//input[@type='text']")).sendKeys("FederalAppeals"); Thread.sleep(1000);
		  Select state=new Select(d.findElement(By.xpath("(//select)[1]")));
		  state.selectByIndex(2);
		  Select country=new Select(d.findElement(By.xpath("(//select)[2]")));
		  country.selectByIndex(2);Thread.sleep(2000);
		log.nextbutton();Thread.sleep(3000);
//step-3
		
		  d.findElement(By.xpath("(//input[@type='text'])[1]")).click();Thread.sleep(2000);
		 log.nextbutton();Thread.sleep(3000);
		  log.alerts_list1(extenttest);Thread.sleep(2000);
	  d.findElement(By.xpath("(//input[@type='text'])[1]")).click();Thread.sleep(2000);
	  d.findElement(By.xpath("//button[@class='next']")).click();Thread.sleep(2000);
	  d.findElement(By.xpath("//span[@class='ng-star-inserted' and text()='11']")).click();Thread.sleep(2000);
	  d.findElement(By.xpath("(//input[@type='text'])[2]")).click();Thread.sleep(2000);
	  d.findElement(By.xpath("//button[@class='next']")).click();Thread.sleep(2000);
	  d.findElement(By.xpath("//span[@class='ng-star-inserted' and text()='11']")).click();Thread.sleep(2000);
	  d.findElement(By.xpath("(//input[@type='text'])[3]")).click();Thread.sleep(2000);
	  d.findElement(By.xpath("//button[@class='next']")).click();Thread.sleep(2000);
	  d.findElement(By.xpath("//span[@class='ng-star-inserted' and text()='11']")).click();Thread.sleep(2000);
	  log.nextbutton();
//step-4	 
	  d.findElement(By.xpath("(//input[contains(@class,'capitalize')])[1]")).sendKeys("45");
	  d.findElement(By.xpath("(//input[contains(@class,'capitalize')])[1]")).clear();
	  log.nextbutton();Thread.sleep(3000);
	  log.alerts_list1(extenttest);Thread.sleep(2000);
	  
	  Select practiceareafl=new Select( d.findElement(By.xpath("(//select)[1]")));
	  practiceareafl.selectByIndex(3);Thread.sleep(2000);
	  Select casetypefl=new Select( d.findElement(By.xpath("(//select)[2]")));
	  casetypefl.selectByIndex(3);Thread.sleep(2000);
	  Select projecttypefl=new Select( d.findElement(By.xpath("(//select)[3]")));
	  projecttypefl.selectByIndex(2);Thread.sleep(2000);
	  Select rating=new Select( d.findElement(By.xpath("(//select)[4]")));
	  rating.selectByIndex(3);Thread.sleep(2000);
	  Select time=new Select( d.findElement(By.xpath("(//select)[5]")));
	  time.selectByIndex(16);Thread.sleep(2000);
	  d.findElement(By.xpath("(//input[contains(@class,'capitalize')])[1]")).sendKeys("45");
	  log.nextbutton();  Thread.sleep(3000);
//step-5
	  
	  log.nextbutton();Thread.sleep(3000);
	  log.alerts_list1(extenttest);Thread.sleep(2000);
	  d.findElement(By.xpath("(//*[@type='text'])[1]")).sendKeys("1. Any applicants will not have access to the documents and will not be able to view them until you choose to hire someone");Thread.sleep(2000);
	  d.findElement(By.xpath("(//*[@type='text'])[2]")).sendKeys("2. Any applicants will not have access to the documents and will not be able to view them until you choose to hire someone");Thread.sleep(2000);
	  log.nextbutton();
//step-6
	  
	  d.findElement(By.xpath("//input[contains(@class,'capitalize')]")).click();Thread.sleep(2000);
	  //d.findElement(By.xpath("//input[contains(@class,'capitalize')]")).clear();Thread.sleep(4000);
	  WebElement e = d.findElement(By.xpath("//button[.='Add']"));
	  us.nextbutton1(e);Thread.sleep(2000);
	  log.alerts_list1(extenttest);Thread.sleep(2000);
	  d.findElement(By.xpath("//input[contains(@class,'capitalize')]")).sendKeys("what ur opinion");
	  d.findElement(By.xpath("//button[.='Add']")).click();
	  log.nextbutton();Thread.sleep(3000);
  String id = d.findElement(By.xpath("(//span[@class='font_bold'])[1]")).getText();
		  WebElement findElement =d.findElement(By.xpath("//button[.='Publish']"));
		  us.scroll(findElement);Thread.sleep(3000);
		  us.nextbutton1(findElement);
		  d.findElement(By.xpath("//span[.='Publish Project']")).click();Thread.sleep(3000);
		  d.findElement(By.xpath("//*[.='View Dashboard']")).click();
		  return id;
  }
  public void hire_without_conflict(String s) throws Exception {
	  d.manage().timeouts().implicitlyWait(Duration.ofMinutes(2));
	  d.findElement(By.xpath("//span[.='Dashboard']")).click();
	  d.findElement(By.xpath("//span[.='Projects']")).click();Thread.sleep(7000);
	  d.findElement(By.xpath("//input[@placeholder='Project Name']")).sendKeys(s);Thread.sleep(4000);
	  Robot r=new Robot();Thread.sleep(2000);
	  r.keyPress(KeyEvent.VK_ENTER);Thread.sleep(2000);
	  r.keyRelease(KeyEvent.VK_ENTER);Thread.sleep(7000);
	  d.findElement(By.xpath("//i[@class='icon-more-vertical']")).click();Thread.sleep(3000);
	  d.findElement(By.xpath("(//*[.=' Applicants'])[2]")).click();Thread.sleep(3000);
	  d.findElement(By.xpath("//i[@class='icon-more-vertical']")).click();Thread.sleep(2000);
	  d.findElement(By.xpath("//*[@class='icon-hire-FL font_14 mr-2']")).click();Thread.sleep(2000);
  d.findElement(By.xpath("(//*[.='I ran my own conflict check'])[2]")).click();Thread.sleep(3000);
  d.findElement(By.xpath("//*[@type='checkbox']")).click();Thread.sleep(3000);
  d.findElement(By.xpath("//*[@type='submit']")).click();Thread.sleep(3000);
  d.findElement(By.xpath("//*[.='View Project']")).click();Thread.sleep(3000);
  d.findElement(By.xpath("//span[.='Projects']")).click();
  }
  public void reqrevision(String s) throws Exception {
	  d.manage().timeouts().implicitlyWait(Duration.ofMinutes(2));
	  d.findElement(By.xpath("//span[.='Projects']")).click();Thread.sleep(7000);
	  d.findElement(By.xpath("//input[@placeholder='Project Name']")).sendKeys(s);
	  Robot r=new Robot(); Thread.sleep(2000);
	  r.keyPress(KeyEvent.VK_ENTER);Thread.sleep(2000);
	  r.keyRelease(KeyEvent.VK_ENTER);Thread.sleep(7000);
	  d.findElement(By.xpath("//i[@class='icon-more-vertical']")).click();
	  d.findElement(By.xpath("(//*[.=' View Project'])[2]")).click();Thread.sleep(3000);
	  d.findElement(By.xpath("//span[.='Deliverables']")).click();Thread.sleep(3000);
	  JavascriptExecutor executor =(JavascriptExecutor) d;
		 WebElement findElement = d.findElement(By.xpath("//a[.='Request a Revision']"));
		  executor.executeScript("arguments[0].click();", findElement);
	  d.findElement(By.xpath("//textarea[@type='text']")).sendKeys("send another deliverable");Thread.sleep(3000);
	  d.findElement(By.xpath("//span[.='Submit']")).click();Thread.sleep(3000);
  }
 
  public void approve(String s) throws Exception {
	  d.manage().timeouts().implicitlyWait(Duration.ofMinutes(2));
	  d.findElement(By.xpath("//span[.='Projects']")).click();Thread.sleep(7000);
	  d.findElement(By.xpath("//input[@placeholder='Project Name']")).sendKeys(s);
	  Robot r=new Robot(); Thread.sleep(2000);
	  r.keyPress(KeyEvent.VK_ENTER);Thread.sleep(2000);
	  r.keyRelease(KeyEvent.VK_ENTER);Thread.sleep(7000);
	  d.findElement(By.xpath("//i[@class='icon-more-vertical']")).click();
	  d.findElement(By.xpath("(//*[.=' View Project'])[2]")).click();Thread.sleep(3000);
	  d.findElement(By.xpath("//span[.='Deliverables']")).click();Thread.sleep(3000);
		  JavascriptExecutor executor =(JavascriptExecutor) d; WebElement findElement =
		  d.findElement(By.xpath("//button[contains(.,'Approve')]"));
		  executor.executeScript("arguments[0].click();", findElement);Thread.sleep(3000);
		  d.findElement(By.xpath("(//button[contains(.,'Approve')])[2]")).click();Thread.sleep(3000);
		  d.findElement(By.xpath("//button[.='View Project Details']")).click();Thread.sleep(3000);
  }
  public void dispute(String s) throws Exception {
	  d.manage().timeouts().implicitlyWait(Duration.ofMinutes(2));
	  d.findElement(By.xpath("//span[.='Projects']")).click();Thread.sleep(7000);
	  d.findElement(By.xpath("//input[@placeholder='Project Name']")).sendKeys(s);
	  Robot r=new Robot(); Thread.sleep(2000);
	  r.keyPress(KeyEvent.VK_ENTER);Thread.sleep(2000);
	  r.keyRelease(KeyEvent.VK_ENTER);Thread.sleep(7000);
	  d.findElement(By.xpath("//i[@class='icon-more-vertical']")).click();
	  d.findElement(By.xpath("(//*[.=' View Project'])[2]")).click();Thread.sleep(3000);
	  d.findElement(By.xpath("//span[.='Deliverables']")).click();Thread.sleep(3000);
	  WebElement e = d.findElement(By.xpath("//a[.='Dispute']"));
	  us.nextbutton1(e);Thread.sleep(3000);
	  d.findElement(By.xpath("(//input)[1]")).click();
	  d.findElement(By.xpath("(//textarea[@type='text'])[1]")).sendKeys("yes Understand");
	  d.findElement(By.xpath("(//input)[3]")).click();
	  d.findElement(By.xpath("(//textarea[@type='text'])[2]")).sendKeys("yes communicated");
	  d.findElement(By.xpath("(//input)[7]")).click();Thread.sleep(3000);
	  d.findElement(By.xpath("//button[contains(.,'Submit')]")).click();Thread.sleep(3000);
	  WebElement e1 = d.findElement(By.xpath("//span[@class='icon-Close text-white']"));
	  us.nextbutton1(e1); Thread.sleep(3000);
	
  }
// public void dp() {
//	 JavascriptExecutor executor1 =(JavascriptExecutor) d; 
//	  WebElement findElement1 = d.findElement(By.xpath("//span[@class='icon-Close text-white']"));
//			  executor1.executeScript("arguments[0].click();", findElement1);
//  }
  public void send_conflictcheck(String s) throws Exception {
		 cs.projectsearch(s);
	  d.findElement(By.xpath("//i[@class='icon-more-vertical']")).click();Thread.sleep(3000);
	  d.findElement(By.xpath("(//*[.=' Applicants'])[2]")).click();Thread.sleep(3000);
	  d.findElement(By.xpath("//i[@class='icon-more-vertical']")).click();Thread.sleep(2000);
	  d.findElement(By.xpath("//*[@class='icon-hire-FL font_14 mr-2']")).click();Thread.sleep(2000);
	 d.findElement(By.xpath("//button[.='Send my conflict checklist']")).click();Thread.sleep(2000);
	 d.findElement(By.xpath("//span[.='Send']")).click();Thread.sleep(3000);  
  }
  public void hire_with_conflictcheck(String s) throws Exception {
	  cs.projectsearch(s);
	  d.findElement(By.xpath("//i[@class='icon-more-vertical']")).click();Thread.sleep(3000);
	  d.findElement(By.xpath("(//*[.=' Applicants'])[2]")).click();Thread.sleep(3000);
	  d.findElement(By.xpath("//i[@class='icon-more-vertical']")).click();Thread.sleep(2000);
	  d.findElement(By.xpath("//*[@class='icon-hire-FL font_14 mr-2']")).click();Thread.sleep(2000);
	 d.findElement(By.xpath("//input[@type='checkbox']")).click();Thread.sleep(2000);
	 d.findElement(By.xpath("//span[.='Hire']")).click();Thread.sleep(2000);
	 d.findElement(By.xpath("//button[.='View Project']")).click();Thread.sleep(2000);
  }
 
  public void signup(ExtentTest extentTest,String newemail) throws Exception {
	  clientprocess log=new clientprocess();
	  this.extenttest=extentTest;
	  d.manage().timeouts().pageLoadTimeout(Duration.ofMinutes(3));
		d.get("https://beta.tech.us/projects/aim_qa_562981/client/#/auth/signin");
		d.findElement(By.xpath("//button[.='Sign Up']")).click();
		d.findElement(By.xpath("//span[@class='icon-ios-plus font_30 d-flex align-items-top purple_color pointer_link position-absolute']")).click();
		for (int i = 1; i <=9; i++) {
			d.findElement(By.xpath("(//div[@class='position-relative inputfield']/input)["+i+"]")).click();
			Thread.sleep(2000);
		}
		d.findElement(By.xpath("//input[@placeholder='Last Name *']")).click();
		d.findElement(By.xpath("(//span)[3]")).click();Thread.sleep(2000);
		log.alerts_list1(extenttest);
		d.findElement(By.xpath("(//*[.='Log In'])[3]")).click();Thread.sleep(2000);
		d.findElement(By.xpath("//button[.='Sign Up']")).click();Thread.sleep(2000);
		log.signupdata("First Name","john");
		d.findElement(By.xpath("//input[@placeholder='Last Name *']")).sendKeys("samuel");
		log.signupdata("Law Firm", "Law-Comp");
		log.signupdata("State Ba", "123456789");
		Select st=new Select(d.findElement(By.xpath("(//select)[1]")));
		st.selectByIndex(4);
		d.findElement(By.xpath("(//span)[3]")).click();Thread.sleep(2000);
		log.signupdata("Mobile", "9966");
		log.signupdata("Office", "8994478");
		log.signupdata("Mobile", "");Thread.sleep(3000);
		log.alerts_list1(extentTest);
		log.signupclear("Mobile");
		log.signupclear("Office");Thread.sleep(2000);
		log.signupdata("Mobile", "9966558844");
		log.signupdata("Office", "8866994478");
		WebElement email = d.findElement(By.xpath("//input[@placeholder='Email Address *']"));
		WebElement confemail = d.findElement(By.xpath("//input[@placeholder='Confirm Email Address *']"));
		email.sendKeys("nirfanpalyam@compindia.com");
		confemail.sendKeys("nirfanpalyam@compindia.com");
		log.alerts_list1(extentTest);
		email.clear();
		email.sendKeys(newemail);Thread.sleep(3000);
		log.alerts_list1(extentTest);
		confemail.clear();
		confemail.sendKeys(newemail);Thread.sleep(2000);
		WebElement p = d.findElement(By.xpath("//input[@placeholder='Password *']"));
		WebElement cp = d.findElement(By.xpath("//input[@placeholder='Confirm Password *']"));
		p.sendKeys("asdfghjkl");
		cp.sendKeys("123456789");
		p.sendKeys("");Thread.sleep(3000);
		log.alerts_list1(extentTest);
		p.clear();
		p.sendKeys("Test@123");
		cp.clear();
		cp.sendKeys("Test@123");
		Select s= new Select(d.findElement(By.xpath("(//select)[2]")));Thread.sleep(2000);
		s.selectByIndex(1);Thread.sleep(2000);
		log.signupdata("State Ba", "123456789");
		Select str=new Select(d.findElement(By.xpath("(//select)[1]")));
		str.selectByIndex(4);
		d.findElement(By.xpath("(//span)[3]")).click();Thread.sleep(2000);
		 WebElement ele1 = d.findElement(By.xpath("//*[@class='alert-effect alert alert-danger alert-dismissible']"));
		  extenttest.log(Status.INFO, ele1.getText().replace("×", ""));Thread.sleep(2000);
		 JavascriptExecutor executor =(JavascriptExecutor) d;
		 WebElement findElement = d.findElement(By.xpath("//button[.='Continue']"));
		  executor.executeScript("arguments[0].click();", findElement);Thread.sleep(2000);
		WebElement t = d.findElement(By.xpath("//div[@class='font_20 icon-AIM-Uncheck-line']"));
		us.nextbutton1(t);
		Thread.sleep(2000);
		WebElement e1 = d.findElement(By.xpath("//button"));Thread.sleep(2000);
		us.nextbutton1(e1);Thread.sleep(2000);
		WebElement e2 = d.findElement(By.xpath("//button[.='Go to Log In']"));
		 e2.click();Thread.sleep(3000);
		d.findElement(By.xpath("//img")).click();Thread.sleep(3000);
  }
  public void signupdata(String s1,String s) {
	  d.findElement(By.xpath("//input[contains(@placeholder,'"+s1+"')]")).sendKeys(s);
  }
  public void fieldclick(String s1) {
	  WebElement e = d.findElement(By.xpath("//input[contains(@placeholder,'"+s1+"')]"));
	  us.nextbutton1(e);
	  }
  public void signupclear(String s) {
	  d.findElement(By.xpath("//input[contains(@placeholder,'"+s+"')]")).clear();
  }
  public void myprofileclick() throws Exception {
	  d.manage().timeouts().implicitlyWait(Duration.ofMinutes(2));
	  d.findElement(By.xpath("//span[.='Messages']")).click();Thread.sleep(7000);
	  d.findElement(By.xpath("//*[@class='user_name_sec']")).click();Thread.sleep(2000);
	  WebElement fe = d.findElement(By.xpath("(//span[.='My Profile'])[2]"));
	  us.nextbutton1(fe);
  }
  public void myinfo(ExtentTest extentTest) throws Exception {
	  this.extenttest=extentTest;
	  clientprocess log=new clientprocess();
	 log.myprofileclick();
	  d.findElement(By.xpath("(//a[.='Edit'])[1]")).click();Thread.sleep(2000);
	  log.fieldclick("First Name");us.cleardata();Thread.sleep(2000);
	  log.fieldclick("Last Name");us.cleardata();Thread.sleep(2000);
	  log.fieldclick("Address");us.cleardata();Thread.sleep(1000);
	  log.fieldclick("City");us.cleardata(); Thread.sleep(1000);
	  log.fieldclick("Zip Code");us.cleardata(); Thread.sleep(1000);
	  log.fieldclick("First Name");us.cleardata();Thread.sleep(1000);
	 
	  log.alerts_list1(extenttest);
	 log.signupdata("First Name", "Dwaynee");log.signupdata("Last Name", "Bravoo");
	 log.signupdata("Address", "Address 1");log.signupdata("City", "City 1");
	 log.signupdata("Zip Code", "123456");
	 
	 try {
		Select s=new Select(d.findElement(By.xpath("//select")));
		s.selectByIndex(4);
	} catch (Exception e) {
		System.out.println("ex");
	}
	
	 d.findElement(By.xpath("(//span[.='Save'])[1]")).click();  Thread.sleep(2000);
	  us.success_alert(extentTest);
	 // d.findElement(By.xpath("//a[.='Cancel']")).click();Thread.sleep(2000);
	 WebElement fe1 = d.findElement(By.xpath("(//a[.='Edit'])[1]"));
	 us.nextbutton1(fe1); Thread.sleep(2000);
	  log.signupclear("Mobile"); log.signupclear("Office");
	  log.signupdata("Mobile", "9966");log.signupdata("Office", "8994478");
		d.findElement(By.xpath("(//span[.='Save'])[1]")).click();  Thread.sleep(3000);
		log.alerts_list1(extentTest);
		  d.findElement(By.xpath("//a[.='Cancel']")).click();Thread.sleep(2000);
		
    	
  }
  public void my_profile_newaccount_only(ExtentTest extentTest) throws Exception {
	  this.extenttest=extentTest;
	  d.manage().timeouts().implicitlyWait(Duration.ofMinutes(1));
	  d.findElement(By.xpath("(//span[.='My Profile'])[3]")).click();Thread.sleep(2000);
	  WebElement fe2 = d.findElement(By.xpath("(//a[.='Edit'])[1]"));
	  us.nextbutton1(fe2); Thread.sleep(2000);
	  	Select s=new Select(d.findElement(By.xpath("(//select)[3]")));
	  	s.selectByVisibleText("Administrative law");
	  	Select st=new Select(d.findElement(By.xpath("(//select)[4]")));
	  	st.selectByIndex(1);
	  	WebElement e = d.findElement(By.xpath("(//span[.='Save'])[1]"));  
	  	us.nextbutton1(e);Thread.sleep(2000);
	  	us.success_alert(extentTest);
}
  
 
  
  public void billing_details_card(ExtentTest extentTest) throws Exception {
	  this.extenttest=extentTest;
	  d.manage().timeouts().implicitlyWait(Duration.ofMinutes(1));
	  d.findElement(By.xpath("//span[.='Billing Details']")).click();Thread.sleep(2000);
	  d.findElement(By.xpath("(//a[contains(text(),'Update')])[1]")).click();Thread.sleep(2000);
	  clientprocess log=new clientprocess();
		/*
		 * log.fieldclick("Credit Card Number");Thread.sleep(1000);
		 * log.fieldclick("Name on Card");us.cleardata();Thread.sleep(1000);
		 * log.fieldclick("MM");Thread.sleep(1000);
		 * log.fieldclick("YYYY");Thread.sleep(1000);
		 * log.fieldclick("Enter CVV");Thread.sleep(1000);
		 * log.fieldclick("Credit Card Number");Thread.sleep(1000);
		 */
	 
	  log.signupdata("Credit Card Number", "12345678912");us.cleardata();Thread.sleep(2000);
	  log.signupdata("Name on Card", "James mike");us.cleardata();Thread.sleep(2000);
	  log.signupdata("MM", "95");us.cleardata();Thread.sleep(2000);
	  log.signupdata("YYYY", "9562");us.cleardata();Thread.sleep(2000);
	  log.signupdata("Enter CVV", "12");us.cleardata();Thread.sleep(2000);
	  d.findElement(By.xpath("//label[.='Credit Card Number *']")).click();Thread.sleep(2000);
	  
	 log.alerts_list1(extenttest);
		/*
		 * WebElement r = d.findElement(By.xpath("(//button[.='Cancel'])[1]"));
		 * us.nextbutton1(r);Thread.sleep(2000);
		 * d.findElement(By.xpath("//span[.='Email & Password']")).click();
		 * d.findElement(By.xpath("//span[.='Billing Details']")).click();Thread.sleep(
		 * 2000);
		 * d.findElement(By.xpath("(//a[contains(text(),'Update')])[1]")).click();Thread
		 * .sleep(2000);
		 */
	 WebElement r = d.findElement(By.xpath("//a[.='Clear']"));
	 us.nextbutton1(r);Thread.sleep(2000);
	 
	  log.signupdata("Credit Card Number", "12345678912");
	  log.signupdata("MM", "95");
	  log.signupdata("YYYY", "9562");
	  log.signupdata("Enter CVV", "12");
	  log.fieldclick("Credit Card Number");Thread.sleep(1000);
	  log.alerts_list1(extenttest);
	  
	  d.navigate().refresh();Thread.sleep(4000);
	  d.findElement(By.xpath("(//a[contains(text(),'Update')])[1]")).click();Thread.sleep(2000);
	 
	 // log.fieldclick("Name on Card");us.cleardata();Thread.sleep(1000);
	  log.signupdata("Name on Card", "James mike");us.cleardata();Thread.sleep(2000);
	  log.signupdata("MM", "04");
	  log.signupdata("YYYY", "2026");
	  log.signupdata("Name on Card", "James mike");
	  log.signupdata("Enter CVV", "456");
	  log.signupdata("Credit Card Number", "5555567893665454");
	
	  WebElement q = d.findElement(By.xpath("(//span[.='Save'])[1]"));
	  us.nextbutton1(q);  Thread.sleep(2000);
	  us.snackbar_alert(extentTest);
	  log.signupclear("Credit Card Number");
	  log.signupdata("Credit Card Number", "5425233430109903");
	  us.nextbutton1(q);  Thread.sleep(2000);
  }
  public void billing_details_address(ExtentTest extentTest) throws Exception {
	  this.extenttest=extentTest;
	  d.manage().timeouts().implicitlyWait(Duration.ofMinutes(1));
	  d.findElement(By.xpath("//span[.='Email & Password']")).click();Thread.sleep(1000);
	  d.findElement(By.xpath("//span[.='Billing Details']")).click();Thread.sleep(2000);
	  d.findElement(By.xpath("(//a[contains(text(),'Update')])[2]")).click();Thread.sleep(2000);
	  clientprocess log=new clientprocess();
	  
		/*
		 * log.fieldclick("Enter Address");us.cleardata();Thread.sleep(1000);
		 * log.fieldclick("City");us.cleardata();Thread.sleep(1000);
		 * log.fieldclick("Zip Code");us.cleardata();Thread.sleep(1000);
		 * log.fieldclick("Enter Address");Thread.sleep(1000);
		 */

	  log.signupdata("Enter Address", "Address11");us.cleardata();Thread.sleep(1000);
	  log.signupdata("City", "City11");us.cleardata();Thread.sleep(1000);
	  log.signupdata("Zip Code", "123456");us.cleardata();Thread.sleep(1000);
	  d.findElement(By.xpath("//label[.='Address *']")).click();Thread.sleep(1000);
	 log.alerts_list1(extenttest);
	  log.signupdata("Enter Address", "Address11");
	  log.signupdata("City", "City11");
	  log.signupdata("Zip Code", "123456");
	  Select s=new Select(d.findElement(By.xpath("//select")));
	  s.selectByIndex(5);
	  WebElement q = d.findElement(By.xpath("(//span[.='Save'])"));
	  us.nextbutton1(q);Thread.sleep(4000);
  }
  
  public void billing_details_new_account(ExtentTest extentTest) throws Exception {
	  this.extenttest=extentTest;
	  d.manage().timeouts().implicitlyWait(Duration.ofMinutes(1));
	  d.findElement(By.xpath("//span[.='Billing Details']")).click();Thread.sleep(2000);
	 WebElement q = d.findElement(By.xpath("//*[contains(text(),' Amendment')]"));
	  us.scroll(q);Thread.sleep(4000);
	 d.findElement(By.xpath("//input[@type='checkbox']")).click();Thread.sleep(2000);
	 WebElement e = d.findElement(By.xpath("//button[@type='submit']"));
	 e.click();Thread.sleep(3000);
	 WebElement w = d.findElement(By.xpath("//h4[.='Payment Information']"));
	 us.scroll(w);Thread.sleep(3000);
	  clientprocess log=new clientprocess();
	  log.signupdata("Credit Card Number", "12345678912");
	  log.signupdata("MM", "95");
	  log.signupdata("YYYY", "9562");
	  log.signupdata("Enter CVV", "12");
	 log.alerts_list1(extenttest);
	 WebElement r = d.findElement(By.xpath("//a[.='Clear']"));
	 us.nextbutton1(r);Thread.sleep(2000);
	  log.signupdata("Credit Card Number", "12345678912");us.cleardata();
	  log.signupdata("Name on Card", "James mike");us.cleardata();
	  log.signupdata("MM", "95");us.cleardata();
	  log.signupdata("YYYY", "9562");us.cleardata();
	  log.signupdata("Enter CVV", "12");us.cleardata();
	  log.signupdata("Enter Address", "Address11");us.cleardata();
	  log.signupdata("City", "City11");us.cleardata();
	  log.signupdata("Zip Code", "123456");us.cleardata();
	  log.fieldclick("Credit Card Number");Thread.sleep(1000);
	  log.alerts_list1(extenttest);
	  WebElement r1 = d.findElement(By.xpath("//a[.='Clear']"));
		 us.nextbutton1(r1);Thread.sleep(2000);
	  log.signupdata("Credit Card Number", "5555567893665454");
	 // log.signupdata("Name on Card");us.cleardata();Thread.sleep(1000);
	  log.signupdata("Name on Card", "James mike");
	  log.signupdata("MM", "04");
	  log.signupdata("YYYY", "2026");
	  log.signupdata("Enter CVV", "456");
	  log.signupdata("Enter Address", "Address11");
	  log.signupdata("City", "City11");
	  log.signupdata("Zip Code", "123456");
	  Select s=new Select(d.findElement(By.xpath("//select")));
	  s.selectByIndex(5);
	  WebElement q1 = d.findElement(By.xpath("(//span[.='Save'])[1]"));
	  us.nextbutton1(q1);  Thread.sleep(2000);
	  try {
		  us.snackbar_alert(extentTest);
	} catch (Exception e2) {
		System.out.println("exception");
	}
	  log.signupclear("Credit Card Number");
	  log.signupdata("Credit Card Number", "5425233430109903");
	  us.nextbutton1(q1);  Thread.sleep(2000);
  }
  
  
  
  
  public void invitefriends(ExtentTest extentTest) throws Exception {
	  this.extenttest=extentTest;Use u=new Use();
	  clientprocess log=new clientprocess();
	  d.manage().timeouts().implicitlyWait(Duration.ofMinutes(1));
	  Thread.sleep(3000);WebElement q = d.findElement(By.xpath("//span[.='Invite Friends']"));
	  us.nextbutton1(q);Thread.sleep(2000);
	  d.findElement(By.xpath("//span[.='Send Invite']")).click();Thread.sleep(2000);
	 WebElement name = d.findElement(By.xpath("(//input[@type='text'])[1]"));
	WebElement em = d.findElement(By.xpath("//input[@type='email']"));
	 WebElement ph = d.findElement(By.xpath("(//input[@type='text'])[2]"));
	  name.click();em.click();name.click();Thread.sleep(2000);
	  log.alerts_list1(extentTest);
	  name.sendKeys("Ram");em.sendKeys("ram");ph.sendKeys("654"); name.click();Thread.sleep(2000);
	  log.alerts_list1(extentTest);
	  em.clear();ph.clear();em.sendKeys("ram@ram");
	  d.findElement(By.xpath("//span[.='Send Invite']")).click();Thread.sleep(2000);
	  u.snackbar_alert(extentTest);
	   d.findElement(By.xpath("//*[contains(@class,'icon-delete')]")).click();
	   name.sendKeys("Ram");em.sendKeys("ram@gmail.com");
	   d.findElement(By.xpath("//span[.='Send Invite']")).click();Thread.sleep(2000);
	   u.success_alert(extentTest);
  }
  public void change_pic(ExtentTest extentTest) throws AWTException, Exception {
	  this.extenttest=extentTest;
	  d.findElement(By.xpath("//a[.='Change Picture']")).click();
	  us.addfile("C:\\Users\\ciadmin\\Downloads\\images.JPG");Thread.sleep(2000);
	  d.findElement(By.xpath("//button[.='Crop']")).click();
	  us.success_alert(extenttest);
  }
  public void dashboard_navigations(ExtentTest extentTest) throws Exception {
	  this.extenttest=extentTest;
	  clientprocess c=new clientprocess();
	  d.manage().timeouts().implicitlyWait(Duration.ofMinutes(2));Thread.sleep(4000);
	  d.findElement(By.xpath("//span[.='Dashboard']")).click();Thread.sleep(5000);
	//  WebElement q = d.findElement(By.xpath("//a[.='View All ']"));
	  c.wait1("//a[.='View All ']");
	  d.findElement(By.xpath("(//a[.='View All '])[1]")).click();Thread.sleep(4000);
	  d.findElement(By.xpath("(//th)[1]")).isDisplayed();
	  d.findElement(By.xpath("//a[.='Urgent Notifications']")).click();Thread.sleep(4000);
	  extenttest.log(Status.INFO, "Navigated to Notifications screen");
	  d.findElement(By.xpath("//span[.='Dashboard']")).click();Thread.sleep(5000);c.wait1("//a[.='View All ']");
	  d.findElement(By.xpath("(//a[.='View All'])[3]")).click();Thread.sleep(4000);
	  extenttest.log(Status.INFO, "Navigated to Messages screen");
	  d.findElement(By.xpath("//span[.='Dashboard']")).click();Thread.sleep(4000);c.wait1("//a[.='View All ']");
	  d.findElement(By.xpath("(//a[.='View All '])[2]")).click();Thread.sleep(4000);
	  d.findElement(By.xpath("//a[.='Drafts']")).isDisplayed();Thread.sleep(4000);
	  extenttest.log(Status.INFO, "Navigated to My Projects screen");
	  d.findElement(By.xpath("//span[.='Dashboard']")).click();Thread.sleep(4000);c.wait1("//a[.='View All ']");
	 WebElement e1 = d.findElement(By.xpath("(//h5[contains(@class,'mb-2')])[1]"));
	  us.nextbutton1(e1);Thread.sleep(5000);
//	  WebElement e3 = d.findElement(By.xpath("(//a[.=' View'])[1]"));
//	  e3.click();Thread.sleep(5000);
	  d.findElement(By.xpath("//span[.='Details']")).isDisplayed();
	  extenttest.log(Status.INFO, "Navigated to  Project Details screen");
	  d.findElement(By.xpath("//span[.='Dashboard']")).click();Thread.sleep(4000);c.wait1("//a[.='View All ']");
	  WebElement Element = d.findElement(By.xpath("//span[.='Law Beez']"));
	  us.scroll(Element);
	 WebElement e2 = d.findElement(By.xpath("(//i[@class='icon-more'])[6]"));Thread.sleep(2000);
	 us.nextbutton1(e2);
	  WebElement e4 = d.findElement(By.xpath("(//a[.=' View'])[6]"));
	  e4.click();Thread.sleep(4000);
	  extenttest.log(Status.INFO, "Navigated to  Project Details - Timesheets screen");
	  d.findElement(By.xpath("//span[.='Dashboard']")).click();Thread.sleep(4000);c.wait1("//a[.='View All ']");
	  WebElement e5 = d.findElement(By.xpath("(//p[.='View more'])[1]"));
	  e5.click();Thread.sleep(4000);
	  extenttest.log(Status.INFO, "Navigated Successfully");
	  d.findElement(By.xpath("//span[.='Dashboard']")).click();Thread.sleep(5000);c.wait1("//a[.='View All ']");
	  WebElement e6 = d.findElement(By.xpath("(//p[contains(text(),'Messages')])[2]/i"));Thread.sleep(4000);
	  us.nextbutton1(e6);
	  extenttest.log(Status.INFO, "Navigated Project Details - Messages screen");
	  d.findElement(By.xpath("//span[.='Dashboard']")).click();Thread.sleep(2000); 
  }
  public void wait1(String we) {
	  WebDriverWait w=new WebDriverWait(d, Duration.ofMinutes(2));
	  w.until(ExpectedConditions.visibilityOfAllElements(d.findElements(By.xpath(""+we+""))));
  }
  public void email_activation() throws InterruptedException {
	  d.manage().timeouts().implicitlyWait(Duration.ofMinutes(2));
	  d.get("https://mail.google.com/");Thread.sleep(4000); 
	  d.findElement(By.xpath("//input[@type='email']")).sendKeys("nirfanpalyam@compindia.com");
	  d.findElement(By.xpath("//span[.='Next']")).click();Thread.sleep(4000); 
	  d.findElement(By.xpath("//input[@type='password']")).sendKeys("V>GgA7Am!");
	  d.findElement(By.xpath("//span[.='Next']")).click();Thread.sleep(10000); 
	  d.findElement(By.xpath("//input[@name='q']")).sendKeys("Verify your email address ",Keys.ENTER);Thread.sleep(4000);
	  WebElement email_click =  d.findElement(By.xpath("//span[.='Verify your email address for access to your Law Beez Account'][1]"));
	  nextbutton1(email_click);Thread.sleep(3000); 
	  WebElement verify_button_click= d.findElement(By.xpath("(//a[.='Verify Email Address'])"));
	 nextbutton1(verify_button_click);Thread.sleep(4000); 
  }
   public void increase_budget(String s,ExtentTest extentTest) throws Exception {
	   this.extenttest=extentTest;
	   d.manage().timeouts().implicitlyWait(Duration.ofMinutes(2));
	   cs.projectsearch(s);
	   d.findElement(By.xpath("//i[@class='icon-more-vertical']")).click();
		  d.findElement(By.xpath("(//*[.=' View Project'])[2]")).click();Thread.sleep(3000);
		  d.findElement(By.xpath("//span[.='Deliverables']")).click();Thread.sleep(3000);
		  WebElement e = d.findElement(By.xpath("//button[.=' Increase Budget']"));
	   us.nextbutton1(e);Thread.sleep(3000);
	   d.findElement(By.xpath("//input[@type='text']")).click();
	   d.findElement(By.xpath("//input[@type='checkbox']")).click();
	   alerts_list1(extenttest);Thread.sleep(2000);
	   d.findElement(By.xpath("//input[@type='text']")).sendKeys("10");
	   d.findElement(By.xpath("//p[.='New Budget']")).click();Thread.sleep(3000);
	   WebElement e1 = d.findElement(By.xpath("//*[.='Submit']"));
	  us.nextbutton1(e1);Thread.sleep(3000);
   }
  public void rate_fl(String s,ExtentTest extentTest) throws Exception {
	  this.extenttest=extentTest;
	   d.manage().timeouts().implicitlyWait(Duration.ofMinutes(2));
	   cs.projectsearch(s);
	   d.findElement(By.xpath("//i[@class='icon-more-vertical']")).click();
		  d.findElement(By.xpath("(//*[.=' View Project'])[2]")).click();Thread.sleep(3000);
		  d.findElement(By.xpath("//span[.='Deliverables']")).click();Thread.sleep(3000);
		  WebElement e = d.findElement(By.xpath("//button[.='Rate your Freelance Lawyer']"));
		  us.nextbutton1(e);Thread.sleep(3000);
		  submit();us.snackbar_alert(extentTest);
		  d.findElement(By.xpath("(//p[.='Communication'])[2]/../../div[2]/div/techus-rating/ul/li[4]")).click();Thread.sleep(2000);
		  submit();us.snackbar_alert(extentTest);
		  d.findElement(By.xpath("(//p[.='Timeliness'])[2]/../../div[2]/div/techus-rating/ul/li[3]")).click();Thread.sleep(2000);
		  submit();us.snackbar_alert(extentTest);
		  d.findElement(By.xpath("(//p[.='Attention to Details'])[2]/../../div[2]/div/techus-rating/ul/li[5]")).click();Thread.sleep(2000);
		  submit();us.snackbar_alert(extentTest);
		  d.findElement(By.xpath("(//p[.='Overall Work Quality'])[1]/../../div[2]/div/techus-rating/ul/li[2]")).click();Thread.sleep(2000);
		  submit();Thread.sleep(3000);
  
  }
  public void submit() throws Exception {
	  WebElement e1 = d.findElement(By.xpath("//*[.='Submit']"));
	  us.nextbutton1(e1);Thread.sleep(3000);
  }
  
  
}
