package Both;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Method;
import java.time.Duration;
import java.util.Date;
import java.util.Iterator;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.remote.Browser;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentReporter;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.Markup;
import com.beust.jcommander.Parameter;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.opentelemetry.context.Context;
public class Use implements ITestListener{
	ExtentReports extent ;
	Date currentdate=new Date();
	String name=currentdate.toString().replace(":", "-");

	public ExtentTest extenttest;
	public  static WebDriver d;
	 @Parameters("s")
	@BeforeTest
	 public void browser(String s ) throws Exception {
		if (s.equalsIgnoreCase("chrome")) {
			  WebDriverManager.chromedriver().setup(); d=new ChromeDriver();
			  d.manage().window().maximize(); }
		 else if (s.equalsIgnoreCase("opera")) {
			  WebDriverManager.operadriver().setup(); d=new OperaDriver();
			  d.manage().window().maximize(); } 
			  else {
			  WebDriverManager.edgedriver().setup(); d=new EdgeDriver();
			  d.manage().window().maximize(); }
		
	}
//	@AfterTest
//	public void tear() {
//		d.quit();
//	}
	@BeforeMethod
	public void  portal(ITestContext context, Method m) {
		Capabilities cap= ((RemoteWebDriver)d).getCapabilities();
		String device = cap.getBrowserName() + "  -  " +cap.getBrowserVersion();
			ExtentTest extenttest1 = extent.createTest(context.getName()+" - "+m.getName());
			this.extenttest=extenttest1;
			extenttest.assignDevice(device);
	}
	@AfterMethod
	public void checkstatus(ITestResult result, Method m) throws Exception {
		Thread.sleep(2000);
		if(result.getStatus()==ITestResult.FAILURE) {
			  TakesScreenshot ss= (TakesScreenshot)d; String sourcefile =
			  ss.getScreenshotAs(OutputType.BASE64);
			  extenttest.addScreenCaptureFromBase64String(sourcefile);
			  extenttest.fail(m.getName()+" is failed     "+result.getThrowable());Thread.sleep(3000);
		} 
			  else if (result.getStatus()==ITestResult.SUCCESS) {
				extenttest.pass(m.getName()+" is passed");
	}
		else if (result.getStatus()==ITestResult.SKIP) {
			extenttest.skip(m.getName()+" is skipped");
		}
	}
	
	public void logout() throws Exception{
		Thread.sleep(2000);
		  d.findElement(By.xpath("//*[@class='user_name_sec']")).click();Thread.sleep(2000);
		  d.findElement(By.xpath("(//span[.='Sign Out'])[1]")).click();Thread.sleep(2000);
		  d.findElement(By.xpath("//button[.='Sign Out']")).click();Thread.sleep(2000);
	}
	@Parameters("logemail")
	  public void client(String logemail) throws Exception {
		  Thread.sleep(1000);
		//  WebDriverWait wait=new WebDriverWait(d, Duration.ofMinutes(1));
		 // wait.until(ExpectedConditions.)
		  d.manage().timeouts().pageLoadTimeout(Duration.ofMinutes(3));
			d.get("https://beta.tech.us/projects/aim_qa_562981/client/#/auth/signin");
			
			d.findElement(By.xpath("//*[@type='email']")).sendKeys(logemail);
			d.findElement(By.xpath("//*[@type='password']")).sendKeys("Test@123");
			d.findElement(By.xpath("//*[.='Log In']")).click();Thread.sleep(2000);
	  }
	  public void fl () throws Exception {
		 // d.switchTo().newWindow(WindowType.TAB);
		  Thread.sleep(2000);
		  d.get("https://beta.tech.us/projects/aim_qa_562981/lawyer/#/auth/signin");Thread.sleep(2000);
			d.findElement(By.xpath("//*[@type='email']")).sendKeys("nirfanpalyam@compindia.com");  Thread.sleep(2000);
			d.findElement(By.xpath("//*[@type='password']")).sendKeys("Test@1234");
			d.findElement(By.xpath("//*[.='Log In']")).click();  Thread.sleep(3000);
	  }
	  public void admin () throws Exception {
		 // d.switchTo().newWindow(WindowType.TAB);
		  Thread.sleep(2000);
		  d.get("https://beta.tech.us/projects/aim_qa_562981/admin/#/auth/signin");Thread.sleep(2000);
			d.findElement(By.xpath("//*[@type='email']")).sendKeys("nirfanpalyam@compindia.com");  Thread.sleep(2000);
			d.findElement(By.xpath("//*[@type='password']")).sendKeys("Test@12345");
			d.findElement(By.xpath("//*[.='Log In']")).click();  Thread.sleep(3000);
	  }
	  @BeforeSuite
		public void Before_report() throws Exception {
		 extent = new ExtentReports();
		  ExtentSparkReporter spark = new ExtentSparkReporter("  - Extentreport.html");
			extent.attachReporter(spark);
			  spark.config().setReportName("Comp India-QA");
			ExtentSparkReporter spark1 = new ExtentSparkReporter("  - Failedcases.html");
			spark1.filter().statusFilter().as(new Status[] {Status.FAIL});
			extent.attachReporter(spark1);
			spark1.config().setReportName("Comp India-QA");
			extent.setSystemInfo("OS", System.getProperty("os.name"));
			 Thread.sleep(1000);
		}
		@AfterSuite
		public void After_report() {
			extent.flush();
		}
		
		 public void addfile(String s) throws AWTException, Exception {
			 Thread.sleep(2000);
			  Robot robot = new Robot();
			     Transferable trans = new StringSelection(s);
			    Toolkit.getDefaultToolkit().getSystemClipboard().setContents(trans, null);
			    robot.keyPress(KeyEvent.VK_CONTROL); robot.keyPress(KeyEvent.VK_V);
			    robot.keyRelease(KeyEvent.VK_CONTROL); robot.keyRelease(KeyEvent.VK_V);
			    robot.keyPress(KeyEvent.VK_ENTER);robot.keyRelease(KeyEvent.VK_ENTER);
		  }
		
		
		public  String sscapture() {
			Date currentdate=new Date();
			String name=currentdate.toString().replace(" ", "-").replace(":", "-");
			TakesScreenshot ss= (TakesScreenshot)d;
			 String sourcefile = ss.getScreenshotAs(OutputType.BASE64);
			/*
			 * File destfile= new File("D:\\screenshotsauto\\"+name+".png"); try {
			 * FileUtils.copyFile(sourcefile, destfile); } catch (IOException e) {
			 * e.printStackTrace(); }
			 */
			return sourcefile;
		}
		 public void close_window() throws Exception {
			 d.manage().timeouts().implicitlyWait(Duration.ofMinutes(2));
			Set<String> handles = d.getWindowHandles();//parent id,child id
			 Iterator<String> it = handles.iterator();
			 String parent=it.next();
			 String child1=it.next();Thread.sleep(2000);
			 d.switchTo().window(child1);Thread.sleep(5000);
			 d.close();
			 d.switchTo().window(parent);Thread.sleep(3000);
			 }
		
		
		 public void windowhandleparentclient() throws Exception {
			 d.manage().timeouts().implicitlyWait(Duration.ofMinutes(2));
			Set<String> handles = d.getWindowHandles();//parent id,child id
			 Iterator<String> it = handles.iterator();
			 String parent=it.next();
			 String child1=it.next();
			 String child2=it.next(); Thread.sleep(3000);
			 d.switchTo().window(parent);Thread.sleep(4000);
			 }
		  public   void windowhandlechildfl() throws Exception {
			  d.manage().timeouts().implicitlyWait(Duration.ofMinutes(2));
			  Set<String> handles = d.getWindowHandles();//parent id,child id,child 2
				 Iterator<String> it = handles.iterator();
				 String parent=it.next();
				 String child1=it.next();
				 String child2=it.next(); Thread.sleep(5000);
				 d.switchTo().window(child1);Thread.sleep(4000);
		  }
		  public   void windowhandlechildadmin() throws Exception {
			  d.manage().timeouts().implicitlyWait(Duration.ofMinutes(2));
			  Set<String> handles = d.getWindowHandles();//parent id,child id,child 2
				 Iterator<String> it = handles.iterator();
				 String parent=it.next();
				 String child1=it.next();
				 String child2=it.next();Thread.sleep(5000);
				 d.switchTo().window(child2);Thread.sleep(4000);
		  }
		  public   void nextbutton1(WebElement findElement) {
			  JavascriptExecutor executor =(JavascriptExecutor) d;
				// WebElement findElement = d.findElement(By.xpath("//*[.='Next']"));
				  executor.executeScript("arguments[0].click();", findElement);
		  }
		  public void cleardata() throws AWTException, Exception {
				 //Thread.sleep(2000);
				  Robot robot = new Robot();
				    robot.keyPress(KeyEvent.VK_CONTROL); robot.keyPress(KeyEvent.VK_A);robot.keyPress(KeyEvent.VK_BACK_SPACE); Thread.sleep(2000);
				    robot.keyRelease(KeyEvent.VK_BACK_SPACE); robot.keyRelease(KeyEvent.VK_CONTROL); robot.keyRelease(KeyEvent.VK_A);
				   // robot.keyPress(KeyEvent.VK_ENTER);robot.keyRelease(KeyEvent.VK_ENTER);
			  }
	  public void success_alert(ExtentTest extentTest) throws Exception {
		  this.extenttest=extentTest;
			WebElement  ele1=d.findElement(By.xpath("//div[@class='alert-effect alert alert-success alert-dismissible']"));
			extenttest.log(Status.INFO, ele1.getText().replace("×", ""));Thread.sleep(2000);
			d.findElement(By.xpath("//a[@class='close']")).click();
	  }
	  public void snackbar_alert(ExtentTest extentTest) throws Exception {
			 this.extenttest=extentTest;
			 WebElement ele1 = d.findElement(By.xpath("//*[@class='alert-effect alert alert-danger alert-dismissible']"));
			  extenttest.log(Status.INFO, ele1.getText().replace("×", ""));Thread.sleep(2000);
			  d.findElement(By.xpath("//a[@class='close']")).click();
		 }
	  public void scroll(WebElement Element) {
		  JavascriptExecutor js = (JavascriptExecutor) d;
		  js.executeScript("arguments[0].scrollIntoView();", Element);
	  }
}
