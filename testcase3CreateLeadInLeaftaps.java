package week2.day1assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class testcase3CreateLeadInLeaftaps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();

		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");

		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();

		// create lead page

		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("CEMBS pvt ltd");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Sowmiya");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("D");

		// source drop down
		WebElement elem = driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select select = new Select(elem);
		select.selectByVisibleText("Employee");

		// marketing company drop down
		WebElement elemcomp = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
		Select sel = new Select(elemcomp);
		sel.selectByVisibleText("Automobile");

		// Text fields
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Sowmi");
		driver.findElement(By.id("createLeadForm_lastNameLocal")).sendKeys("D");
		driver.findElement(By.id("createLeadForm_personalTitle")).sendKeys("DS");

		driver.findElement(By.id("createLeadForm_birthDate")).sendKeys("03/04/85");
		driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("MainTitle");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Engineering");
		driver.findElement(By.id("createLeadForm_annualRevenue")).sendKeys("845000");

		WebElement currency = driver.findElement(By.id("createLeadForm_currencyUomId"));
		Select curr = new Select(currency);
		curr.selectByIndex(1);

		WebElement ind = driver.findElement(By.id("createLeadForm_industryEnumId"));
		Select industry = new Select(ind);
		industry.selectByIndex(1);

		driver.findElement(By.id("createLeadForm_numberEmployees")).sendKeys("540");

		WebElement own = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
		Select owner = new Select(own);
		owner.selectByValue("OWN_PARTNERSHIP");

		driver.findElement(By.id("createLeadForm_sicCode")).sendKeys("SIC");
		driver.findElement(By.id("createLeadForm_tickerSymbol")).sendKeys("SYM");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("Its my first lead");
		driver.findElement(By.id("createLeadForm_importantNote")).sendKeys("Be Bold And Brave");

		driver.findElement(By.id("createLeadForm_primaryPhoneCountryCode")).sendKeys("2");
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("8870264461");
		driver.findElement(By.id("createLeadForm_primaryPhoneAreaCode")).sendKeys("91");
		driver.findElement(By.id("createLeadForm_primaryPhoneExtension")).sendKeys("251");
		driver.findElement(By.id("createLeadForm_primaryPhoneAskForName")).sendKeys("king");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("babu@trestleaf.com");
		driver.findElement(By.id("createLeadForm_primaryWebUrl")).sendKeys("http://testleaf.com");

		driver.findElement(By.id("createLeadForm_generalToName")).sendKeys("kind1");
		driver.findElement(By.id("createLeadForm_generalAttnName")).sendKeys("kind2");
		driver.findElement(By.id("createLeadForm_generalAddress1")).sendKeys("Porur");
		driver.findElement(By.id("createLeadForm_generalAddress2")).sendKeys("Chennai77");
		driver.findElement(By.id("createLeadForm_generalCity")).sendKeys("Chennai");
		driver.findElement(By.id("createLeadForm_generalPostalCode")).sendKeys("600077");
		driver.findElement(By.id("createLeadForm_generalPostalCodeExt")).sendKeys("77");

		WebElement statep = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select sp = new Select(statep);
		sp.selectByIndex(5);

		WebElement conco = driver.findElement(By.id("createLeadForm_generalCountryGeoId"));
		Select country = new Select(conco);
		country.selectByValue("GBR");

		String FM = driver.findElement(By.id("createLeadForm_firstName")).getAttribute("value");
		System.out.println("FirstName is : " + FM);

		driver.findElement(By.name("submitButton")).click();

		String resultingTitle = driver.getTitle();

		if (resultingTitle.contains("View Lead")) {
			System.out.println("Title of the resulting Page is " + resultingTitle);
		} else
			System.out.println("Title of the resulting Page is not View Lead)");

	}

}
