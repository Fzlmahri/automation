import com.aventstack.extentreports.ExtentTest;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Telponarea {
    public static void telponareatest(WebDriver driver, ExtentTest extentTest, String homemand1str, String homemand2str, String homemand3str, String phonemand1str, String phonemand2str, String phonemand3str) {
        WebElement telparea = driver.findElement(By.xpath("//*[text()='Reference']/parent::*/parent::*/parent::*/parent::*/parent::*/parent::*/parent::*/div[1]/div[12]/div[1]/div[1]/ul/li[8]/a[2]/em/span/span"));
        telparea.click();
        WebElement homemand1 = driver.findElement(By.xpath("//*[text()='TELP']/parent::*/parent::*/parent::*/parent::*/parent::*/div[2]/div[1]/div/div/div/table/tbody/tr[1]/td[2]/div/input"));
        homemand1.sendKeys(homemand1str);
        try {
            // Wait for 5 seconds
            Thread.sleep(2000);
        } catch (InterruptedException f) {
            f.printStackTrace();
            Thread.currentThread().interrupt();
        }
        homemand1.sendKeys(Keys.ENTER);
        WebElement homemand2 = driver.findElement(By.xpath("//*[text()='TELP']/parent::*/parent::*/parent::*/parent::*/parent::*/div[2]/div[1]/div/div/div/table/tbody/tr[1]/td[3]/div/input"));
        homemand2.sendKeys(homemand2str);
        try {
            // Wait for 5 seconds
            Thread.sleep(2000);
        } catch (InterruptedException f) {
            f.printStackTrace();
            Thread.currentThread().interrupt();
        }
        homemand2.sendKeys(Keys.ENTER);
        WebElement homemand3 = driver.findElement(By.xpath("//*[text()='TELP']/parent::*/parent::*/parent::*/parent::*/parent::*/div[2]/div[1]/div/div/div/table/tbody/tr[1]/td[4]/div/input"));
        homemand3.sendKeys(homemand3str);
        homemand3.sendKeys(Keys.ENTER);
        WebElement phonemand1 = driver.findElement(By.xpath("//*[text()='TELP']/parent::*/parent::*/parent::*/parent::*/parent::*/div[2]/div[1]/div/div/div/table/tbody/tr[3]/td[2]/div/input"));
        phonemand1.sendKeys(phonemand1str);
        try {
            // Wait for 5 seconds
            Thread.sleep(2000);
        } catch (InterruptedException f) {
            f.printStackTrace();
            Thread.currentThread().interrupt();
        }
        phonemand1.sendKeys(Keys.ENTER);
        WebElement phonemand2 = driver.findElement(By.xpath("//*[text()='TELP']/parent::*/parent::*/parent::*/parent::*/parent::*/div[2]/div[1]/div/div/div/table/tbody/tr[3]/td[3]/div/input"));
        phonemand2.sendKeys(phonemand2str);
        try {
            // Wait for 5 seconds
            Thread.sleep(2000);
        } catch (InterruptedException f) {
            f.printStackTrace();
            Thread.currentThread().interrupt();
        }
        phonemand2.sendKeys(Keys.ENTER);
        WebElement phonemand3 = driver.findElement(By.xpath("//*[text()='TELP']/parent::*/parent::*/parent::*/parent::*/parent::*/div[2]/div[1]/div/div/div/table/tbody/tr[3]/td[4]/div/input"));
        phonemand3.sendKeys(phonemand3str);
        phonemand3.sendKeys(Keys.ENTER);

        WebElement fatca = driver.findElement(By.xpath("//*[text()='Reference']/parent::*/parent::*/parent::*/parent::*/parent::*/parent::*/parent::*/div[1]/div[12]/div[1]/div[1]/ul/li[9]/a[2]/em/span/span"));
        fatca.click();
        WebElement fatca1 = driver.findElement(By.xpath("//*[text()='FATCA']/parent::*/parent::*/parent::*/parent::*/parent::*/div[2]/div[1]/div/div/div/div[3]/input"));
        fatca1.click();
        WebElement fatca2 = driver.findElement(By.xpath("//*[text()='FATCA']/parent::*/parent::*/parent::*/parent::*/parent::*/div[2]/div[1]/div/div/div/div[6]/input"));
        fatca2.click();
        WebElement fatca3 = driver.findElement(By.xpath("//*[text()='FATCA']/parent::*/parent::*/parent::*/parent::*/parent::*/div[2]/div[1]/div/div/div/div[9]/input"));
        fatca3.click();
        WebElement fatca4 = driver.findElement(By.xpath("//*[text()='FATCA']/parent::*/parent::*/parent::*/parent::*/parent::*/div[2]/div[1]/div/div/div/div[12]/input"));
        fatca4.click();
        WebElement fatca5 = driver.findElement(By.xpath("//*[text()='FATCA']/parent::*/parent::*/parent::*/parent::*/parent::*/div[2]/div[1]/div/div/div/div[15]/input"));
        fatca5.click();

        WebElement shareholder = driver.findElement(By.xpath("//*[text()='Reference']/parent::*/parent::*/parent::*/parent::*/parent::*/parent::*/parent::*/div[1]/div[12]/div[1]/div[1]/ul/li[10]/a[2]/em/span/span"));
        shareholder.click();
        WebElement infolain = driver.findElement(By.xpath("//*[text()='Reference']/parent::*/parent::*/parent::*/parent::*/parent::*/parent::*/parent::*/div[1]/div[12]/div[1]/div[1]/ul/li[12]/a[2]/em/span/span"));
        infolain.click();
        try {
            // Wait for 5 seconds
            Thread.sleep(2000);
        } catch (InterruptedException f) {
            f.printStackTrace();
            Thread.currentThread().interrupt();
        }
        WebElement infolain1 = driver.findElement(By.xpath("//*[text()='Saya atau keluarga saya tidak bekerja di BNI Sekuritas, IDX, OJK, dan Perusahaan Efek lainnya ']/parent::*/parent::*/parent::*/parent::*/parent::*/parent::*/parent::*/parent::*/parent::*/div/div/div[2]/div[2]/div/div/div/div/table/tbody/tr[1]/td[1]/div/input"));
        infolain1.click();
        WebElement infolain2 = driver.findElement(By.xpath("//*[text()='Saya atau keluarga saya tidak bekerja di BNI Sekuritas, IDX, OJK, dan Perusahaan Efek lainnya ']/parent::*/parent::*/parent::*/parent::*/parent::*/parent::*/parent::*/parent::*/parent::*/div/div/div[4]/div[2]/div/div/div/div/table/tbody/tr[1]/td[1]/div/input"));
        infolain2.click();
        WebElement infolain3 = driver.findElement(By.xpath("//*[text()='Saya atau keluarga saya tidak bekerja di BNI Sekuritas, IDX, OJK, dan Perusahaan Efek lainnya ']/parent::*/parent::*/parent::*/parent::*/parent::*/parent::*/parent::*/parent::*/parent::*/div/div/div[6]/div[2]/div/div/div/div/table/tbody/tr[1]/td[1]/div/input"));
        infolain3.click();
        WebElement infolain4 = driver.findElement(By.xpath("//*[text()='Saya atau keluarga saya tidak bekerja di BNI Sekuritas, IDX, OJK, dan Perusahaan Efek lainnya ']/parent::*/parent::*/parent::*/parent::*/parent::*/parent::*/parent::*/parent::*/parent::*/div/div/div[8]/div[2]/div/div/div/div/table/tbody/tr[1]/td[1]/div"));
        infolain4.click();
        WebElement infolain5 = driver.findElement(By.xpath("//*[text()='Saya atau keluarga saya tidak bekerja di BNI Sekuritas, IDX, OJK, dan Perusahaan Efek lainnya ']/parent::*/parent::*/parent::*/parent::*/parent::*/parent::*/parent::*/parent::*/parent::*/div/div/div[10]/div[2]/div/div/div/div/table/tbody/tr[1]/td[1]/div"));
        infolain5.click();
        WebElement infolain6 = driver.findElement(By.xpath("//*[text()='Saya atau keluarga saya tidak bekerja di BNI Sekuritas, IDX, OJK, dan Perusahaan Efek lainnya ']/parent::*/parent::*/parent::*/parent::*/parent::*/parent::*/parent::*/parent::*/parent::*/div/div/div[12]/div[2]/div/div/div/div/table/tbody/tr[1]/td[1]/div"));
        infolain6.click();

        // risk profile //
        WebElement riskprof = driver.findElement(By.xpath("//*[text()='Reference']/parent::*/parent::*/parent::*/parent::*/parent::*/parent::*/parent::*/div[1]/div[12]/div[1]/div[1]/ul/li[13]/a[2]/em/span/span"));
        riskprof.click();
        try {
            // Wait for 5 seconds
            Thread.sleep(2000);
        } catch (InterruptedException f) {
            f.printStackTrace();
            Thread.currentThread().interrupt();
        }
        WebElement questioner1 = driver.findElement(By.xpath("//*[text()='Questioner']/parent::*/parent::*/parent::*/parent::*/parent::*/parent::*/parent::*/div/div[1]/div[2]/div/div/div/div/div[4]/input"));
        questioner1.click();
        WebElement questioner2 = driver.findElement(By.xpath("//*[text()='Questioner']/parent::*/parent::*/parent::*/parent::*/parent::*/parent::*/parent::*/div/div[1]/div[2]/div/div/div/div/div[10]/input"));
        questioner2.click();
        WebElement questioner3 = driver.findElement(By.xpath("//*[text()='Questioner']/parent::*/parent::*/parent::*/parent::*/parent::*/parent::*/parent::*/div/div[1]/div[2]/div/div/div/div/div[13]/input"));
        questioner3.click();
        WebElement questioner4 = driver.findElement(By.xpath("//*[text()='Questioner']/parent::*/parent::*/parent::*/parent::*/parent::*/parent::*/parent::*/div/div[1]/div[2]/div/div/div/div/div[17]/input"));
        questioner4.click();
        WebElement questioner5 = driver.findElement(By.xpath("//*[text()='Questioner']/parent::*/parent::*/parent::*/parent::*/parent::*/parent::*/parent::*/div/div[1]/div[2]/div/div/div/div/div[22]/input"));
        questioner5.click();

        WebElement complate = driver.findElement(By.xpath("//*[text()='Complete']/parent::*/input"));
        complate.click();
        WebElement save = driver.findElement(By.xpath("//*[text()='Complete']/parent::*/parent::*/parent::*/td[2]/table/tbody/tr[2]/td[2]/em/button"));
        save.click();
        WebElement saveyes = driver.findElement(By.xpath("//*[text()='Yes']/parent::*/parent::*/parent::*/td[2]/em/button"));
        saveyes.click();
    }
}