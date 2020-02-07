package CommonFunLibrary;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


import junit.framework.Assert;

public class FunctionLibrary {

	public static WebDriver startBrowser(WebDriver driver) throws Exception{
		
			System.setProperty("webdriver.chrome.driver", "D:\\Batch81\\StockAccounting_BDD\\drivers\\chromedriver.exe");
			driver=new ChromeDriver();
		
		return driver;
	}
	
	
	public static void openApplication(WebDriver driver) throws Exception{
			driver.get("http://webapp.qedge.com/login.php");
			driver.manage().window().maximize();
	}
	
	public static void typeAction(WebDriver driver,String locatortype,String locatorvalue,String testdata){
		   if(locatortype.equalsIgnoreCase("id")){
		   driver.findElement(By.id(locatorvalue)).clear();
			   driver.findElement(By.id(locatorvalue)).sendKeys(testdata);
		   }else if (locatortype.equalsIgnoreCase("name")){
			   driver.findElement(By.name(locatorvalue)).clear();
			   driver.findElement(By.name(locatorvalue)).sendKeys(testdata);
			   
		   }else if(locatortype.equalsIgnoreCase("xpath")){
			   driver.findElement(By.xpath(locatorvalue)).clear();
			   driver.findElement(By.xpath(locatorvalue)).sendKeys(testdata);  
		   }
		   else{
				System.out.println("Locator not matching for typeAction method");
			}
	}
	
	public static void waitForElement(WebDriver driver,String locatortype,String locatorvalue,String testdata){
		
		WebDriverWait mywait=new WebDriverWait(driver,Integer.parseInt(testdata));
		
		if(locatortype.equalsIgnoreCase("id")){
			mywait.until(ExpectedConditions.visibilityOfElementLocated(By.id(locatorvalue)));
		}else if (locatortype.equalsIgnoreCase("name")){	
			mywait.until(ExpectedConditions.visibilityOfElementLocated(By.name(locatorvalue)));
		}else if(locatortype.equalsIgnoreCase("xpath")){
			mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(locatorvalue)));
		}
		else
		{
			System.out.println("unable to locate for waitForElement method");
		}
		
	}
	
	public static void clickAction(WebDriver driver,String locatortype,String locatorvalue){
		if(locatortype.equalsIgnoreCase("id")){
			driver.findElement(By.id(locatorvalue)).sendKeys(Keys.ENTER);
		}else if (locatortype.equalsIgnoreCase("name")){	
			driver.findElement(By.name(locatorvalue)).click();
		}else if(locatortype.equalsIgnoreCase("xpath")){
			driver.findElement(By.xpath(locatorvalue)).click();
		}
		else{
			System.out.println("Unable to locate for ClickAction method");	
		}
	}
	
	public static void closeBrowser(WebDriver driver){
		 driver.close();
	}
	
public static void captureData(WebDriver driver,String locatortytpe,String locatorvalue) throws Exception{
		
		String supplierdata="";
		
		if(locatortytpe.equalsIgnoreCase("id"))
		{
			supplierdata=driver.findElement(By.id(locatorvalue)).getAttribute("value");
			System.out.println(supplierdata);
		}else if(locatortytpe.equalsIgnoreCase("xpath"))
		{
			supplierdata=driver.findElement(By.xpath(locatorvalue)).getAttribute("value");
			System.out.println(supplierdata);
		}
		
		FileWriter fw=new FileWriter("./CaptureData/suppnumber.txt");		
	
		BufferedWriter bw=new BufferedWriter(fw);
		
		bw.write(supplierdata);
		
		bw.flush();
		bw.close();
			
	}

public static void tableValidation(WebDriver driver,String column) throws Exception{
	
	System.out.println("came inside");
	FileReader fr=new FileReader("./CaptureData/suppnumber.txt");
	BufferedReader br=new BufferedReader(fr);
	
	String Exp_data=br.readLine();
	
	if(driver.findElement(By.xpath("//*[@id='psearch']")).isDisplayed()){
		driver.findElement(By.xpath("//*[@id='psearch']")).clear();
		driver.findElement(By.xpath("//*[@id='psearch']")).sendKeys(Exp_data);
		driver.findElement(By.xpath("//*[@id='btnsubmit']")).click();
		
		
	}else{
		driver.findElement(By.xpath("//*[@id='ewContentColumn']/div[2]/div[2]/div/button/span")).click();
		driver.findElement(By.xpath("//*[@id='psearch']")).clear();
		driver.findElement(By.xpath("//*[@id='psearch']")).sendKeys(Exp_data);
		driver.findElement(By.xpath("//*[@id='btnsubmit']")).click();
	}
	
	WebElement table=driver.findElement(By.xpath("//table[@id='tbl_a_supplierslist']"));
	
	List<WebElement>rows=table.findElements(By.tagName("tr"));
	
	for(int i=1;i<rows.size();i++){
		
		String act_data=driver.findElement(By.xpath("//table[@id='tbl_a_supplierslist']/tbody/tr["+i+"]/td["+column+"]/div/span/span")).getText();
		
		Assert.assertEquals(act_data, Exp_data);
		
		System.out.println(act_data+"   "+Exp_data);
		break;		
	}
	
}



}
