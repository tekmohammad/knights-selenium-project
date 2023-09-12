package tek.selenium.week_3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HandleTables {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://qa.insurance.tekschool-students.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));

        By usernameInput = By.xpath("//input[@name='username']");
        wait.until(ExpectedConditions.visibilityOfElementLocated(usernameInput)).sendKeys("supervisor");

        By passwordInput = By.xpath("//input[@name='password']");
        wait.until(ExpectedConditions.visibilityOfElementLocated(passwordInput)).sendKeys("tek_supervisor");

        By submitButton = By.xpath("//button[@type='submit']");
        wait.until(ExpectedConditions.elementToBeClickable(submitButton)).click();

        By accountLink = By.xpath("//a[@routerlink='/csr/accounts']");
        wait.until(ExpectedConditions.elementToBeClickable(accountLink)).click();

        //Wait until not visibility of spinner
        //this will wait until the spinner is not visible
        By spinnerLocator = By.xpath("//app-spinner");
        wait.until(ExpectedConditions.not(ExpectedConditions.visibilityOfElementLocated(spinnerLocator)));

        By accountDetailLink = By.xpath("//table/tbody/tr[1]/td[8]/a");
        wait.until(ExpectedConditions.elementToBeClickable(accountDetailLink)).click();

        By accountDetailTitle = By.xpath("//app-account-detail/mat-card/mat-card-title");
        String titleText = wait.until(ExpectedConditions.visibilityOfElementLocated(accountDetailTitle)).getText();
        System.out.println(titleText);

        driver.quit();
    }
}
