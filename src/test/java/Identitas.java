import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class Identitas {
    public static void identitastest(WebDriver driver, ExtentTest extentTest, String jenisklmnstr, String religionstr, String maritalstatusstr, String identitasstr, String educationbackstr)
    {
        WebElement firstname = driver.findElement(By.xpath("//*[text()='First Name: *']/parent::*/div[2]/input"));
        firstname.sendKeys("NAMA DEPAN");
        firstname.sendKeys(Keys.ENTER);
        WebElement lastname = driver.findElement(By.xpath("//*[text()='Last Name:']/parent::*/div[4]/input"));
        lastname.sendKeys("BELAKANG NAMA");
        lastname.sendKeys(Keys.ENTER);
        WebElement jenisklmn = driver.findElement(By.xpath("//*[text()='Last Name:']/parent::*/div[5]/input"));
        jenisklmn.sendKeys(jenisklmnstr);
        try {
            // Wait for 5 seconds
            Thread.sleep(2000);
        } catch (InterruptedException f) {
            f.printStackTrace();
            Thread.currentThread().interrupt();
        }
        jenisklmn.sendKeys(Keys.ENTER);
        WebElement religion = driver.findElement(By.xpath("//*[text()='Religion']/parent::*/div[7]/input"));
        religion.sendKeys(religionstr);
        try {
            // Wait for 5 seconds
            Thread.sleep(2000);
        } catch (InterruptedException f) {
            f.printStackTrace();
            Thread.currentThread().interrupt();
        }
        religion.sendKeys(Keys.ENTER);
        WebElement maritalstatus = driver.findElement(By.xpath("//*[text()='Marital Status *']/parent::*/parent::*/td[2]/div/input"));
        maritalstatus.sendKeys(maritalstatusstr);
        try {
            // Wait for 5 seconds
            Thread.sleep(2000);
        } catch (InterruptedException f) {
            f.printStackTrace();
            Thread.currentThread().interrupt();
        }
        maritalstatus.sendKeys(Keys.ENTER);
        WebElement tempatlahir = driver.findElement(By.xpath("//*[@role=\"presentation\"]/table/tbody/tr[1]/td[4]/div/div[2]/div[1]/div[1]/input"));
        tempatlahir.sendKeys("tangerang");
        tempatlahir.sendKeys(Keys.ENTER);
        WebElement tanggallahir = driver.findElement(By.xpath("//*[@role=\"presentation\"]/table/tbody/tr[1]/td[4]/div/div[2]/div[1]/div[2]/input"));
        tanggallahir.sendKeys("12/06/1993");
        tanggallahir.sendKeys(Keys.ENTER);
        WebElement identitas = driver.findElement(By.xpath("//*[text()='ID Type']/parent::*/parent::*/td[2]/div/input"));
        identitas.sendKeys(identitasstr);
        try {
            // Wait for 5 seconds
            Thread.sleep(2000);
        } catch (InterruptedException f) {
            f.printStackTrace();
            Thread.currentThread().interrupt();
        }
        identitas.sendKeys(Keys.ENTER);
        WebElement identitasno = driver.findElement(By.xpath("//*[text()='ID No & Expired *']/parent::*/parent::*/td[4]/div/div[2]/div[1]/div[1]/input"));
        identitasno.sendKeys("3671060612930002");
        identitasno.sendKeys(Keys.ENTER);
        WebElement ibukandung = driver.findElement(By.xpath("//div[contains(@class, 'x-form-label') and text()=\"Mother's Name *\"]/parent::*/parent::*/td[6]/div[1]/input"));
        ibukandung.sendKeys("SUHAETI");
        ibukandung.sendKeys(Keys.ENTER);
        WebElement placedate = driver.findElement(By.xpath("//*[text()='Place/Date of Issuance *']/parent::*/parent::*/td[6]/div/div[2]/div/div[1]/input"));
        placedate.sendKeys("TANGERANG");
        placedate.sendKeys(Keys.ENTER);
        WebElement placedateexp = driver.findElement(By.xpath("//*[text()='Place/Date of Issuance *']/parent::*/parent::*/td[6]/div/div[2]/div/div[2]/input"));
        placedateexp.sendKeys("31/12/9998");
        placedateexp.sendKeys(Keys.ENTER);
        WebElement nationality = driver.findElement(By.xpath("//*[text()='Nationality']/parent::*/parent::*/td[2]/div/input"));
        nationality.sendKeys("Indonesian");
        try {
            // Wait for 5 seconds
            Thread.sleep(2000);
        } catch (InterruptedException f) {
            f.printStackTrace();
            Thread.currentThread().interrupt();
        }
        nationality.sendKeys(Keys.ENTER);
        WebElement educationback = driver.findElement(By.xpath("//*[text()='Educational Background *']/parent::*/parent::*/td[2]/div[1]/input"));
        educationback.sendKeys(educationbackstr);
        try {
            // Wait for 5 seconds
            Thread.sleep(2000);
        } catch (InterruptedException f) {
            f.printStackTrace();
            Thread.currentThread().interrupt();
        }
        educationback.sendKeys(Keys.ENTER);
        WebElement email = driver.findElement(By.xpath("//*[text()='Email']/parent::*/parent::*/td[2]/div[1]/input"));
        email.sendKeys("lebron@GMAIL.COM");
        email.sendKeys(Keys.ENTER);
        WebElement mobilephone = driver.findElement(By.xpath("//*[text()='Educational Background *']/parent::*/parent::*/td[6]/div/div/div[1]/div[2]/input"));
        mobilephone.sendKeys("082113131515");
        mobilephone.sendKeys(Keys.ENTER);
    }
}