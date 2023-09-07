package tek.selenium.week_2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Activity4 {

    /*
    navigate to https://tek-retail-ui.azurewebsites.net/selenium/dropdown
    in Select website's language drop down
    select what ever language you want.
    make use using wait implicit and explicit
     */
    public static void main(String[] args) throws InterruptedException{
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://tek-retail-ui.azurewebsites.net/selenium/dropdown");

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        By languageSelectLocator =By.id("languageSelect");
        WebElement languageSelectElement = wait.until(ExpectedConditions.presenceOfElementLocated(languageSelectLocator));

        Select languageSelect = new Select(languageSelectElement);
        languageSelect.selectByValue("Persian");
        Thread.sleep(2000);
        driver.quit();
    }
}
