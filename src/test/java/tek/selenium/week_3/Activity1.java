package tek.selenium.week_3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class Activity1 {

    //navigate to insurance app, and login and got to accounts
    //wait for spinner to disappear
    //and print the table headers one by one.
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://qa.insurance.tekschool-students.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        //Explicit wait
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));

        By usernameInput = By.xpath("//input[@name='username']");
        wait.until(ExpectedConditions.visibilityOfElementLocated(usernameInput)).sendKeys("supervisor");

        By passwordInput = By.xpath("//input[@name='password']");
        wait.until(ExpectedConditions.visibilityOfElementLocated(passwordInput)).sendKeys("tek_supervisor");

        By submitButton = By.xpath("//button[@type='submit']");
        wait.until(ExpectedConditions.elementToBeClickable(submitButton)).click();

        By accountsLink = By.xpath("//a[@href='/csr/accounts']");
        wait.until(ExpectedConditions.elementToBeClickable(accountsLink)).click();

        By spinner = By.xpath("//app-spinner");
        wait.until(ExpectedConditions.not(ExpectedConditions.visibilityOfElementLocated(spinner)));

       By columnsLocator = By.xpath("//table/thead/tr/th");
       List<WebElement> columnsElements = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(columnsLocator));

        for (WebElement element : columnsElements) {
            System.out.println(element.getText());
        }

        driver.quit();
    }
}
