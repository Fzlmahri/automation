import com.aventstack.extentreports.ExtentTest;
import org.openqa.selenium.Keys;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class Address {
    public static void addresstest(WebDriver driver, ExtentTest extentTest, String provinsistr , String kotastr , String negarastr, String kodeposstr  ) {
        WebElement namajalan = driver.findElement(By.xpath("//*[text()='ID Card']/parent::*/parent::*/parent::*/parent::*/parent::*/div[2]/div[1]/div/div/div/form/div[1]/div[1]/div/input"));
        namajalan.sendKeys("JALAN PERBAIKAN");
        namajalan.sendKeys(Keys.ENTER);
        WebElement rtrw = driver.findElement(By.xpath("//*[text()='ID Card']/parent::*/parent::*/parent::*/parent::*/parent::*/div[2]/div[1]/div/div/div/form/div[2]/div[1]/div/input"));
        rtrw.sendKeys("002/003");
        rtrw.sendKeys(Keys.ENTER);
        WebElement desa = driver.findElement(By.xpath("//*[text()='ID Card']/parent::*/parent::*/parent::*/parent::*/parent::*/div[2]/div[1]/div/div/div/form/div[3]/div[1]/div/input"));
        desa.sendKeys("KADES");
        desa.sendKeys(Keys.ENTER);
        WebElement kecamatan = driver.findElement(By.xpath("//*[text()='ID Card']/parent::*/parent::*/parent::*/parent::*/parent::*/div[2]/div[1]/div/div/div/form/div[4]/div[1]/div/input"));
        kecamatan.sendKeys("PACAMAT");
        kecamatan.sendKeys(Keys.ENTER);
        WebElement provinsi = driver.findElement(By.xpath("//*[text()='ID Card']/parent::*/parent::*/parent::*/parent::*/parent::*/div[2]/div[1]/div/div/div/form/div[5]/div[1]/div/input"));
        provinsi.sendKeys(provinsistr);
        try {
            // Wait for 5 seconds
            Thread.sleep(2000);
        } catch (InterruptedException f) {
            f.printStackTrace();
            Thread.currentThread().interrupt();
        }
        provinsi.sendKeys(Keys.ENTER);
        WebElement kota = driver.findElement(By.xpath("//*[text()='ID Card']/parent::*/parent::*/parent::*/parent::*/parent::*/div[2]/div[1]/div/div/div/form/div[6]/div[1]/div/input"));
        kota.sendKeys(kotastr);
        try {
            // Wait for 5 seconds
            Thread.sleep(2000);
        } catch (InterruptedException f) {
            f.printStackTrace();
            Thread.currentThread().interrupt();
        }
        kota.sendKeys(Keys.ENTER);
        WebElement negara = driver.findElement(By.xpath("//*[text()='ID Card']/parent::*/parent::*/parent::*/parent::*/parent::*/div[2]/div[1]/div/div/div/form/div[7]/div[1]/div/input"));
        negara.sendKeys(negarastr);
        try {
            // Wait for 5 seconds
            Thread.sleep(2000);
        } catch (InterruptedException f) {
            f.printStackTrace();
            Thread.currentThread().interrupt();
        }
        negara.sendKeys(Keys.ENTER);
        WebElement kodepos = driver.findElement(By.xpath("//*[text()='ID Card']/parent::*/parent::*/parent::*/parent::*/parent::*/div[2]/div[1]/div/div/div/form/div[8]/div[1]/div/input"));
        kodepos.sendKeys(kodeposstr);
        try {
            // Wait for 5 seconds
            Thread.sleep(2000);
        } catch (InterruptedException f) {
            f.printStackTrace();
            Thread.currentThread().interrupt();
        }
        kodepos.sendKeys(Keys.ENTER);
        WebElement telepon = driver.findElement(By.xpath("//*[text()='ID Card']/parent::*/parent::*/parent::*/parent::*/parent::*/div[2]/div[1]/div/div/div/form/div[9]/div[1]/div/input"));
        telepon.sendKeys("82113345465");
        telepon.sendKeys(Keys.ENTER);
        WebElement fax = driver.findElement(By.xpath("//*[text()='ID Card']/parent::*/parent::*/parent::*/parent::*/parent::*/div[2]/div[1]/div/div/div/form/div[10]/div[1]/div/input"));
        fax.sendKeys("230175");
        fax.sendKeys(Keys.ENTER);
        WebElement cekbox = driver.findElement(By.xpath("//*[text()='Home']/parent::*/parent::*/parent::*/parent::*/parent::*/div[2]/div[1]/div/div/div/form/div[1]/div[1]/div"));
        cekbox.click();
    }
}
