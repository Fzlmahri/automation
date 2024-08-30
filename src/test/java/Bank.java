import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class Bank {
    public static void banktest(WebDriver driver, ExtentTest extentTest, String banknamestr) {
        WebElement bankname = driver.findElement(By.xpath("//*[text()='Bank Name *']/parent::*/parent::*/td[2]/div[1]/input"));
        bankname.sendKeys(banknamestr);
        try

    {
        // Wait for 5 seconds
        Thread.sleep(2000);
    } catch(
    InterruptedException f)

    {
        f.printStackTrace();
        Thread.currentThread().interrupt();
    }
        bankname.sendKeys(Keys.ENTER);
    WebElement beneficiaryacc = driver.findElement(By.xpath("//*[text()='Beneficiary Account *']/parent::*/parent::*/td[2]/div[1]/input"));
        beneficiaryacc.sendKeys("1349335067");
        beneficiaryacc.sendKeys(Keys.ENTER);
    WebElement beneficiaryname = driver.findElement(By.xpath("//*[text()='Beneficiary Name *']/parent::*/parent::*/td[4]/div[1]/input"));
        beneficiaryname.sendKeys("MAHRI TESTING");
        beneficiaryname.sendKeys(Keys.ENTER);
}
}
