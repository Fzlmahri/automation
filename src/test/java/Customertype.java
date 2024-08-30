import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class Customertype {
    public static void customertypetest(WebDriver driver, ExtentTest extentTest, String invstrtypestr, String customertypestr , String settlementtypestr ) {

        WebElement custid = driver.findElement(By.xpath("//*[text()='Cust. ID *']/parent::*/parent::*/td[2]/div/input"));
        custid.sendKeys("JAKATEST");
        try {
            // Wait for 5 seconds
            Thread.sleep(2000);
        } catch (InterruptedException f) {
            f.printStackTrace();
            Thread.currentThread().interrupt();
        }
        custid.sendKeys(Keys.ENTER);
        WebElement invstrtype = driver.findElement(By.xpath("//*[text()='Investor Type *']/parent::*/parent::*/td[2]/div/input"));
        invstrtype.sendKeys(invstrtypestr);
        try {
            // Wait for 5 seconds
            Thread.sleep(2000);
        } catch (InterruptedException f) {
            f.printStackTrace();
            Thread.currentThread().interrupt();
        }
        invstrtype.sendKeys(Keys.ENTER);
        WebElement customertype = driver.findElement(By.xpath("//*[text()='Customer Type *']/parent::*/parent::*/td[4]/div/input"));
        customertype.sendKeys(customertypestr);
        try {
            // Wait for 5 seconds
            Thread.sleep(2000);
        } catch (InterruptedException f) {
            f.printStackTrace();
            Thread.currentThread().interrupt();
        }
        customertype.sendKeys(Keys.ENTER);
        WebElement settlementtype = driver.findElement(By.xpath("//*[text()='Settlement Type:']/parent::*/div[2]/input"));
        settlementtype.sendKeys(settlementtypestr);
        try {
            // Wait for 5 seconds
            Thread.sleep(2000);
        } catch (InterruptedException f) {
            f.printStackTrace();
            Thread.currentThread().interrupt();
        }
        settlementtype.sendKeys(Keys.ENTER);
    }
}