package tek.selenium.week_2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class UseSyncWaits {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://happy-desert-0f05d560f.1.azurestaticapps.net/");
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));

        wait.until(ExpectedConditions.presenceOfElementLocated(By.name("username"))).sendKeys("supervisor");
        wait.until(ExpectedConditions.presenceOfElementLocated(By.name("password"))).sendKeys("tek_supervisor");

        WebElement loginButtonElement = wait.until(ExpectedConditions.elementToBeClickable(By.id("loginButton")));
        loginButtonElement.click();

        wait.until(ExpectedConditions.elementToBeClickable(By.partialLinkText("Accounts"))).click();

        wait.until(ExpectedConditions.not(ExpectedConditions.visibilityOfElementLocated(By.xpath("//app-spinner"))));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='newAccountSection']/button[1]"))).click();

        String text = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//mat-dialog-container/app-add/h2"))).getText();

        System.out.println(text);
        driver.quit();
    }
}
