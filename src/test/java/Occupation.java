import com.aventstack.extentreports.ExtentTest;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class Occupation {
    public static void occupationtest(WebDriver driver, ExtentTest extentTest, String occupationnamestr, String monthincomstr, String incomfreqstr, String annualincomstr , String networthstr , String provinsioccupstr , String kotaoccupstr , String negaraoccupstr , String kodeposoccupstr , String kodenegoccupstr) {
        WebElement occupation = driver.findElement(By.xpath("//*[text()='Reference']/parent::*/parent::*/parent::*/parent::*/parent::*/parent::*/parent::*/div[1]/div[12]/div[1]/div[1]/ul/li[4]/a[2]/em/span/span"));
        occupation.click();
        WebElement occupationname = driver.findElement(By.xpath("//*[text()='Occupation Detail']/parent::*/parent::*/parent::*/parent::*/parent::*/div[2]/div[1]/div/div/div/form/div[1]/div[1]/div/input"));
        occupationname.sendKeys(occupationnamestr);
        try {
            // Wait for 5 seconds
            Thread.sleep(2000);
        } catch (InterruptedException f) {
            f.printStackTrace();
            Thread.currentThread().interrupt();
        }
        occupationname.sendKeys(Keys.ENTER);
        WebElement occupationdesc = driver.findElement(By.xpath("//*[text()='Occupation Detail']/parent::*/parent::*/parent::*/parent::*/parent::*/div[2]/div[1]/div/div/div/form/div[2]/div[1]/div/input"));
        occupationdesc.sendKeys("DPR");
        occupationdesc.sendKeys(Keys.ENTER);
        WebElement company = driver.findElement(By.xpath("//*[text()='Occupation Detail']/parent::*/parent::*/parent::*/parent::*/parent::*/div[2]/div[1]/div/div/div/form/div[3]/div[1]/div/input"));
        company.sendKeys("PT MAHRI LANCAR");
        company.sendKeys(Keys.ENTER);
//        WebElement linebisnis = driver.findElement(By.xpath("//*[text()='Occupation Detail']/parent::*/parent::*/parent::*/parent::*/parent::*/div[2]/div[1]/div/div/div/form/div[4]/div[1]/div/input"));
//        linebisnis.sendKeys(linebisnisstr);
//        try {
//            // Wait for 5 seconds
//            Thread.sleep(2000);
//        } catch (InterruptedException f) {
//            f.printStackTrace();
//            Thread.currentThread().interrupt();
//        }
//        linebisnis.sendKeys(Keys.ENTER);
        WebElement position = driver.findElement(By.xpath("//*[text()='Occupation Detail']/parent::*/parent::*/parent::*/parent::*/parent::*/div[2]/div[1]/div/div/div/form/div[5]/div[1]/div/input"));
        position.sendKeys("MELAWAN");
        position.sendKeys(Keys.ENTER);
        WebElement yearwork = driver.findElement(By.xpath("//*[text()='Occupation Detail']/parent::*/parent::*/parent::*/parent::*/parent::*/div[2]/div[1]/div/div/div/form/div[6]/div[1]/div/input"));
        yearwork.sendKeys("2021");
        yearwork.sendKeys(Keys.ENTER);
        WebElement monthwork = driver.findElement(By.xpath("//*[text()='Occupation Detail']/parent::*/parent::*/parent::*/parent::*/parent::*/div[2]/div[1]/div/div/div/form/div[7]/div[1]/div/input"));
        monthwork.sendKeys("10");
        monthwork.sendKeys(Keys.ENTER);
        WebElement monthincom = driver.findElement(By.xpath("//*[text()='Occupation Detail']/parent::*/parent::*/parent::*/parent::*/parent::*/div[2]/div[1]/div/div/div/form/div[8]/div[1]/div/input"));
        monthincom.sendKeys(monthincomstr);
        try {
            // Wait for 5 seconds
            Thread.sleep(2000);
        } catch (InterruptedException f) {
            f.printStackTrace();
            Thread.currentThread().interrupt();
        }
        monthincom.sendKeys(Keys.ENTER);
        WebElement incomfreq = driver.findElement(By.xpath("//*[text()='Occupation Detail']/parent::*/parent::*/parent::*/parent::*/parent::*/div[2]/div[1]/div/div/div/form/div[9]/div[1]/div/input"));
        incomfreq.sendKeys(incomfreqstr);
        try {
            // Wait for 5 seconds
            Thread.sleep(2000);
        } catch (InterruptedException f) {
            f.printStackTrace();
            Thread.currentThread().interrupt();
        }
        incomfreq.sendKeys(Keys.ENTER);
        WebElement annualincom = driver.findElement(By.xpath("//*[text()='Occupation Detail']/parent::*/parent::*/parent::*/parent::*/parent::*/div[2]/div[1]/div/div/div/form/div[10]/div[1]/div/input"));
        annualincom.sendKeys(annualincomstr);
        try {
            // Wait for 5 seconds
            Thread.sleep(2000);
        } catch (InterruptedException f) {
            f.printStackTrace();
            Thread.currentThread().interrupt();
        }
        annualincom.sendKeys(Keys.ENTER);
        WebElement networth = driver.findElement(By.xpath("//*[text()='Occupation Detail']/parent::*/parent::*/parent::*/parent::*/parent::*/div[2]/div[1]/div/div/div/form/div[11]/div[1]/div/input"));
        networth.sendKeys(networthstr);
        try {
            // Wait for 5 seconds
            Thread.sleep(2000);
        } catch (InterruptedException f) {
            f.printStackTrace();
            Thread.currentThread().interrupt();
        }
        networth.sendKeys(Keys.ENTER);
        WebElement namajalanoccup = driver.findElement(By.xpath("//*[text()='Address']/parent::*/parent::*/parent::*/parent::*/parent::*/parent::*/div[2]/div[2]/div[1]/div/div/div/form/div[1]/div[1]/div/input"));
        namajalanoccup.sendKeys("JALAN KIRI");
        namajalanoccup.sendKeys(Keys.ENTER);
        WebElement rtrwoccup = driver.findElement(By.xpath("//*[text()='Address']/parent::*/parent::*/parent::*/parent::*/parent::*/parent::*/div[2]/div[2]/div[1]/div/div/div/form/div[2]/div[1]/div/input"));
        rtrwoccup.sendKeys("002/003");
        rtrwoccup.sendKeys(Keys.ENTER);
        WebElement desaoccup = driver.findElement(By.xpath("//*[text()='Address']/parent::*/parent::*/parent::*/parent::*/parent::*/parent::*/div[2]/div[2]/div[1]/div/div/div/form/div[3]/div[1]/div/input"));
        desaoccup.sendKeys("SETIA BUDI");
        desaoccup.sendKeys(Keys.ENTER);
        WebElement kecamatanoccup = driver.findElement(By.xpath("//*[text()='Address']/parent::*/parent::*/parent::*/parent::*/parent::*/parent::*/div[2]/div[2]/div[1]/div/div/div/form/div[4]/div[1]/div/input"));
        kecamatanoccup.sendKeys("SETIA BANGET");
        kecamatanoccup.sendKeys(Keys.ENTER);
        WebElement provinsioccup = driver.findElement(By.xpath("//*[text()='Address']/parent::*/parent::*/parent::*/parent::*/parent::*/parent::*/div[2]/div[2]/div[1]/div/div/div/form/div[5]/div[1]/div/input"));
        provinsioccup.sendKeys(provinsioccupstr);
        try {
            // Wait for 5 seconds
            Thread.sleep(2000);
        } catch (InterruptedException f) {
            f.printStackTrace();
            Thread.currentThread().interrupt();
        }
        provinsioccup.sendKeys(Keys.ENTER);
        WebElement kotaoccup = driver.findElement(By.xpath("//*[text()='Address']/parent::*/parent::*/parent::*/parent::*/parent::*/parent::*/div[2]/div[2]/div[1]/div/div/div/form/div[6]/div[1]/div/input"));
        kotaoccup.sendKeys(kotaoccupstr);
        try {
            // Wait for 5 seconds
            Thread.sleep(2000);
        } catch (InterruptedException f) {
            f.printStackTrace();
            Thread.currentThread().interrupt();
        }
        kotaoccup.sendKeys(Keys.ENTER);
        WebElement negaraoccup = driver.findElement(By.xpath("//*[text()='Address']/parent::*/parent::*/parent::*/parent::*/parent::*/parent::*/div[2]/div[2]/div[1]/div/div/div/form/div[7]/div[1]/div/input"));
        negaraoccup.sendKeys(negaraoccupstr);
        try {
            // Wait for 5 seconds
            Thread.sleep(2000);
        } catch (InterruptedException f) {
            f.printStackTrace();
            Thread.currentThread().interrupt();
        }
        negaraoccup.sendKeys(Keys.ENTER);
        WebElement kodeposoccup = driver.findElement(By.xpath("//*[text()='Address']/parent::*/parent::*/parent::*/parent::*/parent::*/parent::*/div[2]/div[2]/div[1]/div/div/div/form/div[8]/div[1]/div/input"));
        kodeposoccup.sendKeys(kodeposoccupstr);
        try {
            // Wait for 5 seconds
            Thread.sleep(2000);
        } catch (InterruptedException f) {
            f.printStackTrace();
            Thread.currentThread().interrupt();
        }
        kodeposoccup.sendKeys(Keys.ENTER);
//        WebElement kodenegoccup = driver.findElement(By.xpath("//*[text()='Address']/parent::*/parent::*/parent::*/parent::*/parent::*/parent::*/div[2]/div[2]/div[1]/div/div/div/form/div[9]/div[1]/div/input"));
//        kodenegoccup.sendKeys(kodenegoccupstr);
//        try {
//            // Wait for 5 seconds
//            Thread.sleep(2000);
//        } catch (InterruptedException f) {
//            f.printStackTrace();
//            Thread.currentThread().interrupt();
//        }
//        kodenegoccup.sendKeys(Keys.ENTER);
        WebElement teleponoccup = driver.findElement(By.xpath("//*[text()='Address']/parent::*/parent::*/parent::*/parent::*/parent::*/parent::*/div[2]/div[2]/div[1]/div/div/div/form/div[9]/div[1]/div/input"));
        teleponoccup.sendKeys("2172134562");
        teleponoccup.sendKeys(Keys.ENTER);
        WebElement faxoccup = driver.findElement(By.xpath("//*[text()='Address']/parent::*/parent::*/parent::*/parent::*/parent::*/parent::*/div[2]/div[2]/div[1]/div/div/div/form/div[10]/div[1]/div/input"));
        faxoccup.sendKeys("112434");
        faxoccup.sendKeys(Keys.ENTER);

        WebElement mailing = driver.findElement(By.xpath("//*[text()='Reference']/parent::*/parent::*/parent::*/parent::*/parent::*/parent::*/parent::*/div[1]/div[12]/div[1]/div[1]/ul/li[5]/a[2]/em/span/span"));
        mailing.click();
        WebElement letter = driver.findElement(By.xpath("//*[text()='Letter']/parent::*/parent::*/parent::*/parent::*/parent::*/div[2]/div[1]/div/div/div/form/div[1]/div[1]/div"));
        letter.click();

    }
}