package tek.selenium.week_1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverConfiguration {

    public static void main(String[] args) throws InterruptedException{

        WebDriver driver = new ChromeDriver();
        driver.get("https://google.com");
        //maximize the browser window size
        driver.manage().window().maximize();
        Thread.sleep(5 * 1000);
        driver.quit();
    }

}
