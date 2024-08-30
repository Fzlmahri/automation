import com.aventstack.extentreports.ExtentTest;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class Spouse {
    public static void spousetest(WebDriver driver, ExtentTest extentTest, String jenisklmstr, String nationalspsstr, String cityspsstr, String zipcodespsstr , String provincespsstr , String countryspsstr) {
        WebElement pasangan = driver.findElement(By.xpath("//*[text()='Reference']/parent::*/parent::*/parent::*/parent::*/parent::*/parent::*/parent::*/div[1]/div[12]/div[1]/div[1]/ul/li[2]/a[2]/em/span/span"));
        pasangan.click();
        WebElement jenisklm = driver.findElement(By.xpath("//*[text()='First Name:']/parent::*/parent::*/parent::*/parent::*/parent::*/div[2]/div[1]/div[2]/div[1]/div[1]/input"));
        jenisklm.sendKeys(jenisklmstr);
        try {
            // Wait for 5 seconds
            Thread.sleep(2000);
        } catch (InterruptedException f) {
            f.printStackTrace();
            Thread.currentThread().interrupt();
        }
        jenisklm.sendKeys(Keys.ENTER);
        WebElement firstnamesps = driver.findElement(By.xpath("//*[text()='First Name:']/parent::*/parent::*/parent::*/parent::*/parent::*/div[2]/div[1]/div[2]/div[1]/div[3]/input"));
        firstnamesps.sendKeys("OLIVE");
        firstnamesps.sendKeys(Keys.ENTER);
        WebElement lastnamesps = driver.findElement(By.xpath("//*[text()='Last Name:']/parent::*/parent::*/parent::*/parent::*/parent::*/div[2]/div[1]/div[2]/div[1]/div[5]/input"));
        lastnamesps.sendKeys("MONROE");
        lastnamesps.sendKeys(Keys.ENTER);
        WebElement noktp = driver.findElement(By.xpath("//*[text()='ID No and Expired']/parent::*/parent::*/td[2]/div/div[2]/div/div[1]/input"));
        noktp.sendKeys("3674022001950013");
        noktp.sendKeys(Keys.ENTER);
        WebElement noktpexp = driver.findElement(By.xpath("//*[text()='ID No and Expired']/parent::*/parent::*/td[2]/div/div[2]/div/div[2]/input"));
        noktpexp.sendKeys("31/12/9998");
        noktpexp.sendKeys(Keys.ENTER);
        WebElement national = driver.findElement(By.xpath("//*[text()='Personal Data']/parent::*/parent::*/parent::*/parent::*/parent::*/parent::*/parent::*/parent::*/div//table/tbody/tr[2]/td[2]/div/input"));
        national.sendKeys(nationalspsstr);
        try {
            // Wait for 5 seconds
            Thread.sleep(2000);
        } catch (InterruptedException f) {
            f.printStackTrace();
            Thread.currentThread().interrupt();
        }
        national.sendKeys(Keys.ENTER);
        WebElement placebirth = driver.findElement(By.xpath("//*[text()='Personal Data']/parent::*/parent::*/parent::*/parent::*/parent::*/parent::*/parent::*/parent::*/div//table/tbody/tr[3]/td[2]/div/div[2]/div/div[1]/input"));
        placebirth.sendKeys("TANGERANG");
        placebirth.sendKeys(Keys.ENTER);
        WebElement datebirth = driver.findElement(By.xpath("//*[text()='Personal Data']/parent::*/parent::*/parent::*/parent::*/parent::*/parent::*/parent::*/parent::*/div//table/tbody/tr[3]/td[2]/div/div[2]/div/div[2]/input"));
        datebirth.sendKeys("01/10/2002");
        datebirth.sendKeys(Keys.ENTER);
        WebElement emailsps = driver.findElement(By.xpath("//*[text()='Personal Data']/parent::*/parent::*/parent::*/parent::*/parent::*/parent::*/parent::*/parent::*/div//table/tbody/tr[4]/td[2]/div/input"));
        emailsps.sendKeys("MONROE@GMAIL.COM");
        emailsps.sendKeys(Keys.ENTER);
        WebElement rtrwsps = driver.findElement(By.xpath("//*[text()='Personal Data']/parent::*/parent::*/parent::*/parent::*/parent::*/parent::*/parent::*/parent::*/div//table/tbody/tr[5]/td[2]/div/input"));
        rtrwsps.sendKeys("001/002");
        rtrwsps.sendKeys(Keys.ENTER);
        WebElement subdistsps = driver.findElement(By.xpath("//*[text()='Personal Data']/parent::*/parent::*/parent::*/parent::*/parent::*/parent::*/parent::*/parent::*/div//table/tbody/tr[6]/td[2]/div/input"));
        subdistsps.sendKeys("XDERES");
        subdistsps.sendKeys(Keys.ENTER);
        WebElement citysps = driver.findElement(By.xpath("//*[text()='Personal Data']/parent::*/parent::*/parent::*/parent::*/parent::*/parent::*/parent::*/parent::*/div//table/tbody/tr[7]/td[2]/div/input"));
        citysps.sendKeys(cityspsstr);
        try {
            // Wait for 5 seconds
            Thread.sleep(2000);
        } catch (InterruptedException f) {
            f.printStackTrace();
            Thread.currentThread().interrupt();
        }
        citysps.sendKeys(Keys.ENTER);
        WebElement zipcodesps = driver.findElement(By.xpath("//*[text()='Personal Data']/parent::*/parent::*/parent::*/parent::*/parent::*/parent::*/parent::*/parent::*/div//table/tbody/tr[8]/td[2]/div/input"));
        zipcodesps.sendKeys(zipcodespsstr);
        try {
            // Wait for 5 seconds
            Thread.sleep(2000);
        } catch (InterruptedException f) {
            f.printStackTrace();
            Thread.currentThread().interrupt();
        }
        zipcodesps.sendKeys(Keys.ENTER);
        WebElement phonesps = driver.findElement(By.xpath("//*[text()='Personal Data']/parent::*/parent::*/parent::*/parent::*/parent::*/parent::*/parent::*/parent::*/div//table/tbody/tr[9]/td[2]/div/input"));
        phonesps.sendKeys("0216501213");
        phonesps.sendKeys(Keys.ENTER);
        WebElement mobilephonesps = driver.findElement(By.xpath("//*[text()='Personal Data']/parent::*/parent::*/parent::*/parent::*/parent::*/parent::*/parent::*/parent::*/div//table/tbody/tr[3]/td[4]/div/input"));
        mobilephonesps.sendKeys("082166781213");
        mobilephonesps.sendKeys(Keys.ENTER);
        WebElement namajalansps = driver.findElement(By.xpath("//*[text()='Personal Data']/parent::*/parent::*/parent::*/parent::*/parent::*/parent::*/parent::*/parent::*/div//table/tbody/tr[4]/td[4]/div/input"));
        namajalansps.sendKeys("JALAN LIKU");
        namajalansps.sendKeys(Keys.ENTER);
        WebElement villagesps = driver.findElement(By.xpath("//*[text()='Personal Data']/parent::*/parent::*/parent::*/parent::*/parent::*/parent::*/parent::*/parent::*/div//table/tbody/tr[5]/td[4]/div/input"));
        villagesps.sendKeys("PAK LURAH");
        villagesps.sendKeys(Keys.ENTER);
        WebElement provincesps = driver.findElement(By.xpath("//*[text()='Personal Data']/parent::*/parent::*/parent::*/parent::*/parent::*/parent::*/parent::*/parent::*/div//table/tbody/tr[6]/td[4]/div/input"));
        provincesps.sendKeys(provincespsstr);
        try {
            // Wait for 5 seconds
            Thread.sleep(2000);
        } catch (InterruptedException f) {
            f.printStackTrace();
            Thread.currentThread().interrupt();
        }
        provincesps.sendKeys(Keys.ENTER);
        WebElement countrysps = driver.findElement(By.xpath("//*[text()='Personal Data']/parent::*/parent::*/parent::*/parent::*/parent::*/parent::*/parent::*/parent::*/div//table/tbody/tr[7]/td[4]/div/input"));
        countrysps.sendKeys(countryspsstr);
        try {
            // Wait for 5 seconds
            Thread.sleep(2000);
        } catch (InterruptedException f) {
            f.printStackTrace();
            Thread.currentThread().interrupt();
        }
        countrysps.sendKeys(Keys.ENTER);
        WebElement faxsps = driver.findElement(By.xpath("//*[text()='Personal Data']/parent::*/parent::*/parent::*/parent::*/parent::*/parent::*/parent::*/parent::*/div//table/tbody/tr[8]/td[4]/div/input"));
        faxsps.sendKeys("11111115555");
        faxsps.sendKeys(Keys.ENTER);
    }
}
