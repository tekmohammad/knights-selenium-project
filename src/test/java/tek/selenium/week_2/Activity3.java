package tek.selenium.week_2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Activity3 {
    //Navigate to Facebook.com
    //Click on Create new Account.
    //print dialog title is Sign Up
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://facebook.com");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        try {
            WebDriverWait driverWait = new WebDriverWait(driver, Duration.ofSeconds(30));
            By createAccountButtonLocator = By.linkText("Create new account");
            WebElement createAccountElement = driverWait.until(ExpectedConditions.elementToBeClickable(createAccountButtonLocator));
            createAccountElement.click();

            By dialogTitleLocator = By.xpath("/html/body/div[3]/div[2]/div/div/div[1]/div[1]");
            WebElement dialogTitleElement = driverWait.until(ExpectedConditions.visibilityOfElementLocated(dialogTitleLocator));
            String dialogTitleText = dialogTitleElement.getText();
            System.out.println(dialogTitleText);
        }catch(Exception e) {
            e.printStackTrace();
        }finally {
            driver.quit();
        }
    }
}
