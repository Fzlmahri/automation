import com.aventstack.extentreports.ExtentTest;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Corporate {
    public static void Companystatustest(WebDriver driver, ExtentTest extentTest, String companynamestr, String bisnistypestr ) {

        WebElement companyname = driver.findElement(By.xpath("//*[text()='Company Status *']/parent::*/parent::*/parent::*/parent::*/parent::*/div[2]/div/div/div/div/table/tbody/tr[1]/td[1]/div/input"));
        companyname.sendKeys("companynamestr");
        try {
            // Wait for 5 seconds
            Thread.sleep(2000);
        } catch (InterruptedException f) {
            f.printStackTrace();
            Thread.currentThread().interrupt();
        }
        companyname.sendKeys(Keys.ENTER);
        WebElement companyname1 = driver.findElement(By.xpath("//*[text()='Company Name:*']/parent::*/parent::*/parent::*/parent::*/parent::*/table/tbody/tr[1]/td[4]/div/input"));
        companyname1.sendKeys("TESTINGAN CORP");
        try {
            // Wait for 5 seconds
            Thread.sleep(2000);
        } catch (InterruptedException f) {
            f.printStackTrace();
            Thread.currentThread().interrupt();
        }
        companyname1.sendKeys(Keys.ENTER);
        WebElement bisnistype = driver.findElement(By.xpath("//*[text()='Company Name:*']/parent::*/parent::*/parent::*/parent::*/parent::*/table/tbody/tr[1]/td[4]/div/input"));
        bisnistype.sendKeys("bisnistypestr");
        try {
            // Wait for 5 seconds
            Thread.sleep(2000);
        } catch (InterruptedException f) {
            f.printStackTrace();
            Thread.currentThread().interrupt();
        }
        bisnistype.sendKeys(Keys.ENTER);
        WebElement companykarakter = driver.findElement(By.xpath("//*[text()='Company Characteristic *']/parent::*/parent::*/parent::*/parent::*/parent::*/table/tbody/tr[2]/td[2]/div/input"));
        companykarakter.sendKeys("TESTINGAN CORP");
        try {
            // Wait for 5 seconds
            Thread.sleep(2000);
        } catch (InterruptedException f) {
            f.printStackTrace();
            Thread.currentThread().interrupt();
        }
        companykarakter.sendKeys(Keys.ENTER);
        WebElement mainbisnis = driver.findElement(By.xpath("//*[text()='Main Business Activities *']/parent::*/parent::*/parent::*/parent::*/parent::*/table/tbody/tr[2]/td[4]/div/input"));
        mainbisnis.sendKeys("bisnistypestr");
        try {
            // Wait for 5 seconds
            Thread.sleep(2000);
        } catch (InterruptedException f) {
            f.printStackTrace();
            Thread.currentThread().interrupt();
        }
        mainbisnis.sendKeys(Keys.ENTER);

        WebElement companynamebo = driver.findElement(By.xpath("//*[text()='Company Name ']/parent::*/parent::*/parent::*/parent::*/parent::*/table/tbody/tr[1]/td[2]/div/input"));
        companynamebo.sendKeys("PT TESTINGAN CORP");
        companynamebo.sendKeys(Keys.ENTER);
        WebElement placeofestab = driver.findElement(By.xpath("//*[text()='Place of Establishment ']/parent::*/parent::*/parent::*/parent::*/parent::*/table/tbody/tr[2]/td[2]/div/input"));
        placeofestab.sendKeys("JAPAN");
        placeofestab.sendKeys(Keys.ENTER);
        WebElement dateofestab = driver.findElement(By.xpath("//*[text()='Date of Establishment ']/parent::*/parent::*/parent::*/parent::*/parent::*/table/tbody/tr[3]/td[2]/div/input"));
        dateofestab.sendKeys("01/01/2001");
        dateofestab.sendKeys(Keys.ENTER);
        WebElement companyaddres = driver.findElement(By.xpath("//*[text()='Company Address ']/parent::*/parent::*/parent::*/parent::*/parent::*/table/tbody/tr[4]/td[2]/div/textarea"));
        companyaddres.sendKeys("setia budi stats");
        companyaddres.sendKeys(Keys.ENTER);
        WebElement companybank = driver.findElement(By.xpath("//*[text()='Bank Name *']/parent::*/parent::*/parent::*/parent::*/parent::*/table/tbody/tr[5]/td[2]/div/input"));
        companybank.sendKeys("");
        companybank.sendKeys(Keys.ENTER);
        WebElement companybankname = driver.findElement(By.xpath("//*[text()='Beneficiary Name *']/parent::*/parent::*/parent::*/parent::*/parent::*/table/tbody/tr[6]/td[2]/div/input"));
        companybankname.sendKeys("TESTINGAN BOR");
        companybankname.sendKeys(Keys.ENTER);
        WebElement companybankaccount = driver.findElement(By.xpath("//*[text()='Beneficiary Account *']/parent::*/parent::*/parent::*/parent::*/parent::*/table/tbody/tr[7]/td[2]/div/input"));
        companybankaccount.sendKeys("1349336364");
        companybankaccount.sendKeys(Keys.ENTER);
}
}