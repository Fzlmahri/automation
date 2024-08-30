import com.aventstack.extentreports.ExtentTest;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class Salesinfo {
    public static void salesinfo(WebDriver driver, ExtentTest extentTest, String salesidstr, String documenttypestr , String acctypestr) {
        WebElement start = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/table/tbody/tr/td[2]/em/button"));
        start.click();
        WebElement list = driver.findElement(By.xpath("//*[@id=\"x-auto-27\"]"));
        list.click();
//        WebElement retrieve = driver.findElement(By.xpath("//*[text()='Retrieve']"));
//        retrieve.click();
        WebElement add = driver.findElement(By.xpath("//*[text()='Add']"));
        add.click();
        try {
            // Wait for 5 seconds
            Thread.sleep(2000);
        } catch (InterruptedException f) {
            f.printStackTrace();
            Thread.currentThread().interrupt();
        }
        WebElement maxim = driver.findElement(By.xpath("//tr[@role=\"presentation\"]/td/div[contains(@class, \"x-tool-maximize\")]"));
        maxim.click();
        WebElement salesid = driver.findElement(By.xpath("//*[text()='Sales ID *']/parent::*/parent::*/td[2]/div/input"));
        salesid.sendKeys(salesidstr);
        try {
            // Wait for 5 seconds
            Thread.sleep(2000);
        } catch (InterruptedException f) {
            f.printStackTrace();
            Thread.currentThread().interrupt();
        }
        salesid.sendKeys(Keys.ENTER);
        try {
            // Wait for 5 seconds
            Thread.sleep(2000);
        } catch (InterruptedException f) {
            f.printStackTrace();
            Thread.currentThread().interrupt();
        }
        WebElement documenttype = driver.findElement(By.xpath("//*[text()='Document Type *']/parent::*/parent::*/td[2]/div/input"));
        documenttype.sendKeys(documenttypestr);
        try {
            // Wait for 5 seconds
            Thread.sleep(2000);
        } catch (InterruptedException f) {
            f.printStackTrace();
            Thread.currentThread().interrupt();
        }
        documenttype.sendKeys(Keys.ENTER);
        try {
            // Wait for 5 seconds
            Thread.sleep(2000);
        } catch (InterruptedException f) {
            f.printStackTrace();
            Thread.currentThread().interrupt();
        }
        WebElement acctype = driver.findElement(By.xpath("//*[text()='Acc. Type *']/parent::*/parent::*/td[2]/div/input"));
        acctype.sendKeys(acctypestr);
        try {
            // Wait for 5 seconds
            Thread.sleep(2000);
        } catch (InterruptedException f) {
            f.printStackTrace();
            Thread.currentThread().interrupt();
        }
        acctype.sendKeys(Keys.ENTER);
        try {
            // Wait for 5 seconds
            Thread.sleep(2000);
        } catch (InterruptedException f) {
            f.printStackTrace();
            Thread.currentThread().interrupt();
        }
    }
}