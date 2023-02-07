package Both;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Method;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Run extends Use  {
	Use  u=new Use();
	clientprocess c=new clientprocess();
	Clientstatus cs=new Clientstatus();
	Flprocess f=new Flprocess();
	Adminprocess a=new Adminprocess();
	Clientnegative cn=new Clientnegative();
	public static String id;
	@Parameters({"logemail","newemail"})
	@Test
	public void r(String logemail,String newemail) throws Exception {
		
//	String ide = "AIM#3E3445189E0";
//	this.id=ide;
		//c.signup(extenttest, logemail);
		//cn.invalid_login(extenttest);
		//cn.forgot_password(extenttest);
		
//		c.email_activation();
//		u.close_window();
		u.client(logemail);
		//c.myinfo(extenttest);
		c.myprofileclick();
		cn.my_profile_neg(extenttest);
		c.billing_details_card(extenttest);
		c.billing_details_address(extenttest);
		c.invitefriends(extenttest);
		c.change_pic(extenttest);
		//c.my_profile_newaccount_only(extenttest);
		
		
		//c.dashboard_navigations(extenttest);
		//cn.maximum_Laws("AIM#6B104884A1F", extenttest);
		//cn.request_areas(extenttest);
	}
	
	
	
//	@Test(priority = 1)
//	public void Client_Signup_With_Alerts() throws Exception {
//		c.signup(extenttest);
//		}
//	@Test(priority = 2)
//	public void ForgotPassword_with_Alerts() throws Exception {
//		cn.forgot_password(extenttest);
//	}
//	@Test(priority = 3)
//	public void Invalid_Login() throws Exception {
//		cn.invalid_login(extenttest);
//		 extenttest.generateLog(Status.INFO, "       Negative scenario");
//	}
//	@Test(priority = 4)
//	public void Client_Login1() throws Exception {
//		u.client();
//		extenttest.log(Status.INFO, "Client logged in successfully");
//	}
//	
//	@Test(priority = 5)
//	public void MyInfo() throws Exception {
//		c.myinfo(extenttest);
//		extenttest.log(Status.INFO, "Nagivated to My Profile  successfully");
//	}
//	@Test(priority = 6)
//	public void MyInfo_Profile_Negative() throws Exception {
//		cn.my_profile_neg(extenttest);
//		 extenttest.generateLog(Status.INFO, "       Negative scenario");
//	}
//	@Test(priority = 7)
//	public void Email_Change_Negative() throws Exception {
//		cn.email_neg(extenttest);
//		 extenttest.generateLog(Status.INFO, "       Negative scenario");
//	}
//	@Test(priority = 8)
//	public void Password_Change_Negative() throws Exception {
//		cn.password_neg(extenttest);
//		 extenttest.generateLog(Status.INFO, "       Negative scenario");
//	}
//	
//	@Test(priority = 9)
//	public void A_Billing_Details_Card() throws Exception {
//		c.billing_details_card(extenttest);
//		extenttest.log(Status.INFO, "Nagivated to Billing Details  successfully");
//	}
//	@Test(priority = 9)
//	public void Billing_Details_Address() throws Exception {
//		c.billing_details_address(extenttest);
//		//extenttest.log(Status.INFO, "Nagivated to Billing Details  successfully");
//	}
//	@Test(priority = 10)
//	public void Invite() throws Exception {
//		c.invitefriends(extenttest);
//		extenttest.log(Status.INFO, "Nagivated to Invite Friends  successfully");
//	}
//	@Test(priority = 11)
//	public void Change_Profile_Pic() throws Exception {
//		c.change_pic(extenttest);
//		extenttest.log(Status.INFO, "Profile Pic Changed  successfully");
//	}
//	
//	
//
//	  @Test(priority = 12) public void Publish_Project() throws Exception { 
//	  String ide = c.postproject(extenttest, " Crime"); 
//		  this.id=ide; System.out.println(id);
//	  extenttest.info("Project Id "+id+" is published successfully"); 
//	  }
//	  @Test(priority = 13)
//	  public void Maximum_Laws_Negative() throws Exception {
//		  cn.maximum_Laws(id, extenttest);
//		  extenttest.generateLog(Status.INFO, "       Negative scenario");
//	  }
//	  @Test(priority = 14)
//	  public void A_Request_Areas_Negative() throws Exception {
//		  cn.request_areas(extenttest);
//		  extenttest.generateLog(Status.INFO, "       Negative scenario");
//	  }
//	 
//	  @Test(priority = 14)
//	  public void Dulicate_Question_Negative() throws Exception {
//		  cn.duplicate_Question(extenttest);
//		  extenttest.generateLog(Status.INFO, "       Negative scenario");
//	  }
//	  @Test(priority = 15)
//	  public void Duplicate_Add_File() throws Exception {
//		  cn.duplicates_files(id, extenttest);
//		  extenttest.generateLog(Status.INFO, "       Negative scenario");
//	  }
//	  @Test(priority = 16)
//	  public void Delete_Documnent() throws Exception {
//		  cn.delete_document(extenttest);
//	  }
//	  @Test(priority = 17)
//	  public void Invite_FL() throws Exception {
//		  cn.invitefl(extenttest);
//		  extenttest.info("Lawyer Invited successfully"); 
//	  }
//	  
//	  
//		  @Test(priority = 18) public void Publish_Label() throws Exception {
//		  cs.stautspublish(id);
//		  extenttest.info("Published label verified successfully"); }
//		  
//		  
//		  @Test(priority = 19) public void Client_Logout1() throws Exception {
//		  u.logout(); extenttest.info("Client logged out successfully"); }
//		  
//		  @Test(priority = 20) public void Fl_Login1() throws Exception { u.fl();
//		  extenttest.info("Fl logged in  successfully"); }
//		  
//		  @Test(priority = 21) public void Apply_Project() throws Exception {
//		  f.projectapply(id); extenttest.info("Project applied successfully"); }
//		  
//		  @Test(priority = 22) public void Fl_Logout1() throws Exception { u.logout();
//		  extenttest.info("Fl logged out successfully"); }
//		  
//		  @Test(priority = 23) public void Client_Login2() throws Exception {
//		  u.client(); extenttest.info("Client logged in successfully"); }
//		  
//		  @Test(priority = 24) public void Conflict_Request_send() throws Exception {
//			  c.send_conflictcheck(id);
//		  extenttest.info("COnflict Checklist Sent successfully"); }
//		  
//		  @Test(priority = 25) public void Conflict_Negative() throws Exception {
//			  cn.coflict_check_alert(id, extenttest);
//			  extenttest.generateLog(Status.INFO, "       Negative scenario");
//		  }
//		  
//		  @Test(priority = 26) public void Client_Logout6() throws Exception {
//			  u.logout(); extenttest.info("Client logged out successfully"); }
//			  
//			  @Test(priority = 27) public void Fl_Login6() throws Exception {
//				  u.fl();
//			  extenttest.info("Fl logged in  successfully"); }
//			  
//			  @Test(priority = 28) public void Fl_Conflict_Submit() throws Exception { 
//				  f.conflict_submit(id);
//			  extenttest.info("Fl Conflict Submitted  successfully"); }
//			  @Test(priority = 29) public void Fl_Logout6() throws Exception { u.logout();
//			  extenttest.info("Fl logged out successfully"); }
//			  
//			  @Test(priority = 30) public void Client_Login6() throws Exception {
//				  u.client(); extenttest.info("Client logged in successfully"); }
//			  @Test(priority = 31) public void Hire_Fl() throws Exception {
//				  c.hire_with_conflictcheck(id); extenttest.info("FL Hired successfully"); }
//		  
//		  @Test(priority = 32) public void A_InProgress_Label() throws Exception {
//		  cs.statusinprogress(id);
//		  extenttest.info("InProgress label verified successfully"); }
//	
//	  @Test(priority = 32) public void Budget_Increase() throws Exception {
//	  c.increase_budget(id, extenttest);
//	  extenttest.info("Budget Increased successfully"); }	
//		  
//		  @Test(priority = 33) public void Client_Logout2() throws Exception {
//		  u.logout(); extenttest.info("Client logged out successfully"); }
//		  
//		  @Test(priority = 34) public void Fl_Login2() throws Exception { u.fl();
//		  extenttest.info("Fl logged in  successfully"); }
//		  
//		  @Test(priority = 35) public void Fl_Timesheet() throws Exception {
//		  f.timesheet(id); extenttest.info("Fl added timesheet  successfully"); }
//		  
//		  @Test(priority = 36) public void Fl_Deliverable1() throws Exception {
//		  f.deliverable(id); extenttest.info("Fl submitted deliverable  successfully");
//		  }
//		  
//		  @Test(priority = 37) public void Fl_Logout2() throws Exception { u.logout();
//		  extenttest.info("Fl logged out successfully"); }
//		  
//		  @Test(priority = 38) public void Client_Login3() throws Exception {
//		  u.client(); extenttest.info("Client logged in successfully"); }
//		  
//		  @Test(priority = 39) public void Delivered_Label1() throws Exception {
//		  cs.statusdelivered(id);
//		  extenttest.info("Delivered label verified  successfully"); }
//		  
//		  @Test(priority = 40) public void Request_Revision() throws Exception {
//		  c.reqrevision(id); extenttest.info("Request a revision raised successfully");
//		  }
//		  
//		  @Test(priority = 41) public void Revision_Label() throws Exception {
//		  cs.statusinrevision(id);
//		  extenttest.info("InRevision label verified  successfully"); }
//		  
//		  @Test(priority = 42) public void Client_Logout3() throws Exception {
//		  u.logout(); extenttest.info("Client logged out successfully"); }
//		  
//		  @Test(priority = 43) public void Fl_Login3() throws Exception { u.fl();
//		  extenttest.info("Fl logged in  successfully"); }
//		  
//		  @Test(priority = 44) public void Fl_Deliverable2() throws Exception {
//		  f.deliverable(id); extenttest.info("Fl submitted deliverable  successfully");
//		  }
//		  
//		  @Test(priority = 45) public void Fl_Logout3() throws Exception { u.logout();
//		  extenttest.info("Fl logged out successfully"); }
//		  
//		  @Test(priority = 46) public void Client_Login4() throws Exception {
//		  u.client(); extenttest.info("Client logged in successfully"); }
//		  
//		  @Test(priority = 47) public void Delivered_Label2() throws Exception {
//		  cs.statusdelivered(id);
//		  extenttest.info("Delivered label verified  successfully"); }
//		  
//		  @Test(priority = 48) public void Approve() throws Exception { c.approve(id);
//		  extenttest.info("Project  approved  successfully"); }
//		  
//		  @Test(priority = 49) public void Approved_Label() throws Exception {
//		  cs.statusapproved(id);
//		  extenttest.info("Approved label verified  successfully"); }
//	
//	  @Test(priority = 49) public void Rate_FL() throws Exception {
//	  c.rate_fl(id, extenttest);
//	  extenttest.info("Rated    successfully"); }	
//		  
//		  @Test(priority = 50) public void Dispute() throws Exception { c.dispute(id);
//		  extenttest.info("Dispute is raised successfully"); }
//		  
//		  @Test(priority = 51) public void Dispute_Open_Label() throws Exception {
//		  cs.statusdisputeopen(id);
//		  extenttest.info("Dispute open label verified successfully"); }
//		  
//		  @Test(priority = 52) public void Client_Logout4() throws Exception {
//		  u.logout(); extenttest.info("Client logged out successfully"); }
//		  
//		  @Test(priority = 53) public void Admin_Login() throws Exception { u.admin();
//		  extenttest.info("Admin logged in successfully"); }
//		  
//		  @Test(priority = 54) public void Deny_Dispute() throws Exception {
//		  a.disputedeny(id); extenttest.info("Dispute is rejected  successfully"); }
//		  
//		  @Test(priority = 55) public void Admin_Logout() throws Exception {
//			  
//			  
//		  u.logout(); extenttest.info("Admin logged out successfully"); }
//		  
//		  @Test(priority = 56) public void Client_Login5() throws Exception {
//		  u.client(); extenttest.info("Client logged in successfully"); }
//		  
//		  @Test(priority = 57) public void Dispute_Closed_Label() throws Exception {
//		  cs.statusdisputeclosed(id);
//		  extenttest.info("Dispute closed label verified successfully"); }
//		  
//		  @Test(priority = 58) public void Client_Dashboard_Navigations() throws Exception {
//		 c.dashboard_navigations(extenttest);
//		  }
//		 
		 

  

public void capturess() {
	Date currentdate=new Date();
	String name=currentdate.toString().replace(" ", "-").replace(":", "-");
	TakesScreenshot ss= (TakesScreenshot)d;
	File sourcefile=ss.getScreenshotAs(OutputType.FILE);
	File destfile= new File("D:\\screenshotsauto\\"+name+".png");
	try {
		FileUtils.copyFile(sourcefile, destfile);
	} catch (IOException e) {
		e.printStackTrace();
	}
	
}
	


}





