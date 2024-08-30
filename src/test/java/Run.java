import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
//import java.util.concurrent.TimeUnit;

public class Run {
    public static void main(String[] args) throws InterruptedException {
//        System.setProperty("webdriver.edge.driver", "D:\\msedgedriver.exe");
//
//        EdgeOptions options = new EdgeOptions();
//        RemoteWebDriver driver = new EdgeDriver(options);
//
//        driver.manage().window().maximize();
//        driver.get("http://192.168.19.93:8080/oaccess21/");
//        driver.manage().window().maximize();
        System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");

        ChromeOptions options = new ChromeOptions();
// Specify the path to the Chromium binary
        options.setBinary("D:\\Chrome Win\\chrome-win\\chrome.exe");

        WebDriver driver = new ChromeDriver(options);

// Use the correct URL (assuming your URL is correct)
        driver.get("http://192.168.19.93:8080/oaccess/");

// Ensure the browser window is maximized
        driver.manage().window().maximize();
//            driver.quit();
        ExtentReports extent = new ExtentReports();

        ExtentTest loginTest = extent.createTest("Test Login", "Description of Test Scenario Login");
        ExtentTest salesinfotest = extent.createTest("Test Login", "Description of Test Scenario Login");
        ExtentTest customertypetest = extent.createTest("Test Login", "Description of Test Scenario Login");
        ExtentTest identitastest = extent.createTest("Test Login", "Description of Test Scenario Login");
        ExtentTest banktest = extent.createTest("Test Login", "Description of Test Scenario Login");
        ExtentTest invesmenttest = extent.createTest("Test Login", "Description of Test Scenario Login");
        ExtentTest addresstest = extent.createTest("Test Login", "Description of Test Scenario Login");
        ExtentTest spousetest = extent.createTest("Test Login", "Description of Test Scenario Login");
        ExtentTest occupationtest = extent.createTest("Test Login", "Description of Test Scenario Login");
        ExtentTest teleponareatest = extent.createTest("Test Login", "Description of Test Scenario Login");
        ExtentTest companystatustest = extent.createTest("Test Login", "Description of Test Scenario Login");


        Login.logintest(driver, loginTest, "faisal", "Password1212");
        Salesinfo.salesinfo(driver, salesinfotest, "160804", "Individual", "REGULER");
        Customertype.customertypetest(driver, customertypetest, "Indonesian", "Retail", "Transfer To Customer");
        Identitas.identitastest(driver, identitastest, "MR", "Kristen", "Menikah", "ID CARD", "S1");
        Bank.banktest(driver,banktest,"PT. BANK NEGARA INDONESIA");
//        Invesment.invesmenttest(driver,invesmenttest,"Apresiasi Harga / Price Apreciation" , "testing" , "Hasil Usaha / Business Profit" , "TESTING");
        Address.addresstest(driver, addresstest, "BANTEN", "TANGERANG SELATAN", "INDONESIA", "15226");
        Spouse.spousetest(driver, spousetest, "Mr", "indonesia", "TANGERANG SELATAN", "15226", "BANTEN", "INDONESIA");
        Occupation.occupationtest(driver, occupationtest, "OTHERS", "50", "MONTHLY", "500", "500", "dki", "JAKARTA SELATAN", "indonesia", "12910", "+62");
        Telponarea.telponareatest(driver, teleponareatest, "+62", "0821", "13367082", "+62", "0821", "13362342");
//        Corporate.Companystatustest(driver,companystatustest,"PT");
    }
    }