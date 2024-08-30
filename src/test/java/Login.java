import com.aventstack.extentreports.ExtentTest;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;
import java.awt.*;
import java.util.List;

public class Login {
    public static void logintest(WebDriver driver, ExtentTest extentTest, String Username, String Password){
        WebElement userid = driver.findElement(By.xpath("//*[text()='Username:']/following-sibling::*/div/input"));
        userid.sendKeys(Username);
        WebElement password = driver.findElement(By.xpath("//*[text()='Password:']/following-sibling::*/div/input"));
        password.sendKeys(Password);
        password.sendKeys(Keys.ENTER);
    }
}