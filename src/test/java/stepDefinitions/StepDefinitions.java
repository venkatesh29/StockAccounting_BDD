package stepDefinitions;

import org.openqa.selenium.WebDriver;

import CommonFunLibrary.FunctionLibrary;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinitions {
	
	WebDriver driver;
	
	@When("^Open Browser$")
	public void open_Browser() throws Throwable {
		driver=FunctionLibrary.startBrowser(driver);
	}

	@When("^Open Application$")
	public void open_Application() throws Throwable {
		FunctionLibrary.openApplication(driver);
	}

	@When("^Wait For Username$")
	public void wait_For_Username() throws Throwable {
		FunctionLibrary.waitForElement(driver, "id", "username", "10");
	}

	@When("^Enter Username$")
	public void enter_Username() throws Throwable {
		FunctionLibrary.typeAction(driver,  "id", "username", "admin");
	}

	@When("^Wait For Supplier$")
	public void wait_For_Supplier() throws Throwable {
		FunctionLibrary.waitForElement(driver, "xpath", "//*[@id='mi_a_suppliers']", "10");
	}


	@When("^Wait For Password$")
	public void wait_For_Password() throws Throwable {
		FunctionLibrary.waitForElement(driver, "name", "password", "10");
	}

	@When("^Enter Password$")
	public void enter_Password() throws Throwable {
		FunctionLibrary.typeAction(driver,  "name", "password" ,"master");
	}

	@When("^Wait For AddButton$")
	public void wait_For_AddButton() throws Throwable {
		FunctionLibrary.waitForElement(driver, "xpath", "//*[@id='ewContentColumn']/div[3]/div[1]/div[1]/div[1]/div/a", "10");
	}

	@When("^Click On AddButton$")
	public void click_On_AddButton() throws Throwable {
		FunctionLibrary.clickAction(driver,"xpath", "//*[@id='ewContentColumn']/div[3]/div[1]/div[1]/div[1]/div/a");
	}
	
	@When("^Wait For Login$")
	public void wait_For_Login() throws Throwable {
		FunctionLibrary.waitForElement(driver, "id", "btnsubmit", "10");
	}
	
	@When("^Wait For SupplierName$")
	public void wait_For_SupplierName() throws Throwable {
		FunctionLibrary.waitForElement(driver,"id","x_Supplier_Name","10");
	}

	@When("^Enter in \"([^\"]*)\" with \"([^\"]*)\" and \"([^\"]*)\"$")
	public void enter_in_with_and(String arg1, String arg2, String arg3) throws Throwable {
	  
	   
	   FunctionLibrary.typeAction(driver, arg2, arg3, arg1);
	 
	}
	
	@When("^Wait For City$")
	public void wait_For_City() throws Throwable {
		FunctionLibrary.waitForElement(driver,"xpath","//*[@id='x_City']","10");
	}


	
	@When("^Wait For Address$")
	public void wait_For_Address() throws Throwable {
		FunctionLibrary.waitForElement(driver,"xpath","//*[@id='x_Address']","10");
	}
	
	@When("^Capture Data$")
	public void capture_Data() throws Throwable {
		FunctionLibrary.captureData(driver, "id", "x_Supplier_Number");
	}
	
	@When("^Wait For SupplierNumber$")
	public void wait_For_SupplierNumber() throws Throwable {
		FunctionLibrary.waitForElement(driver, "xpath", "//*[@id='x_Supplier_Number']", "10");
	}

	@When("^Click On Login$")
	public void click_On_Login() throws Throwable {
		FunctionLibrary.clickAction(driver,"id", "btnsubmit");
	}
	
	@When("^Click On Supplier$")
	public void click_On_Supplier() throws Throwable {
		FunctionLibrary.clickAction(driver,"xpath", "//*[@id='mi_a_suppliers']");
	}

	@When("^wait For Logout$")
	public void wait_For_Logout() throws Throwable {
		FunctionLibrary.waitForElement(driver, "id", "logout", "10");
	}

	@When("^Click On Logout$")
	public void click_On_Logout() throws Throwable {
		FunctionLibrary.clickAction(driver,"id", "logout");
	}

	@When("^Wait For OK$")
	public void wait_For_OK() throws Throwable {
		FunctionLibrary.waitForElement(driver, "xpath", "//button[contains(text(),'OK!')]", "10");
	}

	@When("^Click On OK$")
	public void click_On_OK() throws Throwable {
		FunctionLibrary.clickAction(driver,"xpath", "//button[contains(text(),'OK!')]");
	}

	@When("^CloseBrowser$")
	public void closebrowser() throws Throwable {
		FunctionLibrary.closeBrowser(driver);
	}
	
	
	@When("^Wait For Country$")
	public void wait_For_Country() throws Throwable {
		FunctionLibrary.waitForElement(driver, "xpath", "//*[@id='x_Country']", "10");
	}

	@When("^Wait For Contact Person$")
	public void wait_For_Contact_Person() throws Throwable {
		FunctionLibrary.waitForElement(driver, "xpath", "//*[@id='x_Contact_Person']", "10");
	}

	@When("^Wait For Ph Number$")
	public void wait_For_Ph_Number() throws Throwable {
		FunctionLibrary.waitForElement(driver, "xpath", "//*[@id='x_Phone_Number']", "10");
	}

	@When("^Wait For Email$")
	public void wait_For_Email() throws Throwable {
		FunctionLibrary.waitForElement(driver, "xpath", "//*[@id='x__Email']", "10");
	}

	@When("^Wait For Mobile Number$")
	public void wait_For_Mobile_Number() throws Throwable {
		FunctionLibrary.waitForElement(driver, "xpath", "//*[@id='x_Mobile_Number']", "10");
	}

	@When("^Wait For Notes$")
	public void wait_For_Notes() throws Throwable {
		FunctionLibrary.waitForElement(driver, "xpath", "//*[@id='x_Notes']", "10");
	}

	@When("^Wait For Add Button$")
	public void wait_For_Add_Button() throws Throwable {
		FunctionLibrary.waitForElement(driver, "id", "btnAction", "10");
	}

	@When("^Click On AddButton after adding notes$")
	public void click_On_AddButton_after_adding_notes() throws Throwable {
		FunctionLibrary.clickAction(driver, "id", "btnAction");
	}

	@When("^Wait For Ok Button$")
	public void wait_For_Ok_Button() throws Throwable {
		FunctionLibrary.waitForElement(driver, "xpath", "(//*[text()='OK!'])[1]", "10");
	}
					
	@When("^Click On Ok Button with \"([^\"]*)\" and \"([^\"]*)\"$")
	public void click_On_Ok_Button_with_and(String locatortype, String locatorvalue) throws Throwable {
				System.out.println("came inside to click");	
		
				FunctionLibrary.clickAction(driver, locatortype, locatorvalue);
	}

	@When("^Wait For Alert$")
	public void wait_For_Alert() throws Throwable {
		FunctionLibrary.waitForElement(driver, "xpath", "(//*[text()='OK'])[6]", "10");
	}

	@When("^Click On Alert$")
	public void click_On_Alert() throws Throwable {
		FunctionLibrary.clickAction(driver, "xpath", "(//*[text()='OK'])[6]");
	}

	@Then("^user validate the supplier table$")
	public void user_validate_the_supplier_table() throws Throwable {
		FunctionLibrary.tableValidation(driver, "6");
	}

	@When("^user closes the browser$")
	public void user_closes_the_browser() throws Throwable {
		FunctionLibrary.closeBrowser(driver);
	}



}
