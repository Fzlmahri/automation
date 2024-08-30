import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

//public class Invesment {
//    public static void invesmenttest(WebDriver driver, ExtentTest extentTest, String code2str , String descrip2str , String code3str ,String descrip3str) {
//        WebElement code2click = driver.findElement(By.xpath("//*[text()='Invesment Experience, Objective and Source of Income']/parent::*/parent::*/parent::*/parent::*/parent::*//div[1]/div/div/div/table/tbody/tr/td[2]/div/div[1]/div[1]/div[2]/div/div[1]/table/tbody/tr/td[1]/div"));
//        code2click.click();
//        try {
//            // Wait for 5 seconds
//            Thread.sleep(2000);
//        } catch (InterruptedException f) {
//            f.printStackTrace();
//            Thread.currentThread().interrupt();
//        }
//        WebElement code2 = driver.findElement(By.xpath("//*[text()='Invesment Experience, Objective and Source of Income']/parent::*/parent::*/parent::*/parent::*/parent::*//div[1]/div/div/div/table/tbody/tr/td[2]/div/div[1]/div[1]/div[2]/div[2]/div/input"));
//        code2.sendKeys(code2str);
//        try {
//            // Wait for 5 seconds
//            Thread.sleep(2000);
//        } catch (InterruptedException f) {
//            f.printStackTrace();
//            Thread.currentThread().interrupt();
//        }
//        WebElement clickcode2 = driver.findElement(By.xpath("//*[text()='Apresiasi Harga / Price Apreciation']"));
//        clickcode2.click();
//        try {
//            // Wait for 5 seconds
//            Thread.sleep(2000);
//        } catch (InterruptedException f) {
//            f.printStackTrace();
//            Thread.currentThread().interrupt();
//        }
//        code2.sendKeys(Keys.ENTER);
//        WebElement descrip2click = driver.findElement(By.xpath("//*[text()='Invesment Experience, Objective and Source of Income']/parent::*/parent::*/parent::*/parent::*/parent::*//div[1]/div/div/div/table/tbody/tr/td[2]/div/div[1]/div[1]/div[2]/div/div[1]/table/tbody/tr/td[2]/div"));
//        descrip2click.click();
//        try {
//            // Wait for 5 seconds
//            Thread.sleep(2000);
//        } catch (InterruptedException f) {
//            f.printStackTrace();
//            Thread.currentThread().interrupt();
//        }
//        WebElement descrip2 = driver.findElement(By.xpath("//*[text()='Invesment Experience, Objective and Source of Income']/parent::*/parent::*/parent::*/parent::*/parent::*//div[1]/div/div/div/table/tbody/tr/td[2]/div/div[1]/div[1]/div[2]/div[3]/div/input"));
//        descrip2.sendKeys(descrip2str);
//        try {
//            // Wait for 5 seconds
//            Thread.sleep(2000);
//        } catch (InterruptedException f) {
//            f.printStackTrace();
//            Thread.currentThread().interrupt();
//        }
//        descrip2.sendKeys(Keys.ENTER);
//        WebElement code3click = driver.findElement(By.xpath("//*[text()='Invesment Experience, Objective and Source of Income']/parent::*/parent::*/parent::*/parent::*/parent::*//div[1]/div/div/div/table/tbody/tr/td[3]/div/div[1]/div[1]/div[2]/div/div[1]/table/tbody/tr/td[1]/div"));
//        code3click.click();
//        try {
//            // Wait for 5 seconds
//            Thread.sleep(2000);
//        } catch (InterruptedException f) {
//            f.printStackTrace();
//            Thread.currentThread().interrupt();
//        }
//        WebElement code3 = driver.findElement(By.xpath("//*[text()='Invesment Experience, Objective and Source of Income']/parent::*/parent::*/parent::*/parent::*/parent::*//div[1]/div/div/div/table/tbody/tr/td[3]/div/div[1]/div[1]/div[2]/div[2]/div/input"));
//        code3.sendKeys(code3str);
//        try {
//            // Wait for 5 seconds
//            Thread.sleep(2000);
//        } catch (InterruptedException f) {
//            f.printStackTrace();
//            Thread.currentThread().interrupt();
//        }
//        WebElement clickcode3 = driver.findElement(By.xpath("//*[text()='Hasil Usaha / Business Profit']"));
//        clickcode3.click();
//        try {
//            // Wait for 5 seconds
//            Thread.sleep(2000);
//        } catch (InterruptedException f) {
//            f.printStackTrace();
//            Thread.currentThread().interrupt();
//        }
//        code3.sendKeys(Keys.ENTER);
//        WebElement descrip3click = driver.findElement(By.xpath("//*[text()='Invesment Experience, Objective and Source of Income']/parent::*/parent::*/parent::*/parent::*/parent::*//div[1]/div/div/div/table/tbody/tr/td[3]/div/div[1]/div[1]/div[2]/div/div[1]/table/tbody/tr/td[2]/div"));
//        descrip3click.click();
//        WebElement descrip3 = driver.findElement(By.xpath("//*[text()='Invesment Experience, Objective and Source of Income']/parent::*/parent::*/parent::*/parent::*/parent::*//div[1]/div/div/div/table/tbody/tr/td[3]/div/div[1]/div[1]/div[2]/div[3]/div/input"));
//        descrip3.sendKeys(descrip3str);
//        try {
//            // Wait for 5 seconds
//            Thread.sleep(2000);
//        } catch (InterruptedException f) {
//            f.printStackTrace();
//            Thread.currentThread().interrupt();
//        }
//        descrip3.sendKeys(Keys.ENTER);
//    }
//}