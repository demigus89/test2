import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Firsttest {
    public static void main (String [] args) throws Exception {
        System.setProperty("webdriver.chrome.driver","C:\\chromedriver\\chromedriver.exe");
        WebDriver chromedriver = new ChromeDriver();

        chromedriver.get("https://www.sharelane.com/cgi-bin/main.py");
        chromedriver.manage().window().maximize();
        chromedriver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);

        chromedriver.findElement(By.xpath("/html/body/center/table/tbody/tr[3]/td/table/tbody/tr/td[4]/a")).click();
        chromedriver.findElement(By.xpath("/html/body/center/table/tbody/tr[5]/td/table/tbody/tr[2]/td/table/tbody/tr[2]/td[2]/input")).sendKeys("11111");
        Thread.sleep(10000);
        chromedriver.findElement(By.xpath("/html/body/center/table/tbody/tr[6]/td/table/tbody/tr[2]/td/table/tbody/tr[3]/td[2]/input")).click();
        chromedriver.findElement(By.xpath("/html/body/center/table/tbody/tr[5]/td/table/tbody/tr[2]/td/table/tbody/tr[1]/td[2]/input")).sendKeys("gfftygkg");
        chromedriver.findElement(By.xpath("/html/body/center/table/tbody/tr[5]/td/table/tbody/tr[2]/td/table/tbody/tr[2]/td[2]/input")).sendKeys("gkk");
        chromedriver.findElement(By.xpath("/html/body/center/table/tbody/tr[5]/td/table/tbody/tr[2]/td/table/tbody/tr[3]/td[2]/input")).sendKeys("ghdhdgh@gmai.com");
        chromedriver.findElement(By.xpath("/html/body/center/table/tbody/tr[5]/td/table/tbody/tr[2]/td/table/tbody/tr[4]/td[2]/input")).sendKeys("1111");
        chromedriver.findElement(By.xpath("/html/body/center/table/tbody/tr[5]/td/table/tbody/tr[2]/td/table/tbody/tr[5]/td[2]/input")).sendKeys("1111");
        chromedriver.findElement(By.xpath("/html/body/center/table/tbody/tr[5]/td/table/tbody/tr[2]/td/table/tbody/tr[6]/td[2]/input")).click();
        chromedriver.close();
        chromedriver.quit();

    }
}
