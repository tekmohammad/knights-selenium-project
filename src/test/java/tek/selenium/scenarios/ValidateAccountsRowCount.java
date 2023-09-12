package tek.selenium.scenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class ValidateAccountsRowCount {
    //User story # 7
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://qa.insurance.tekschool-students.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        //Explicit wait
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("username"))).sendKeys("supervisor");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("password"))).sendKeys("tek_supervisor");
        wait.until(ExpectedConditions.elementToBeClickable(By.id("loginButton"))).click();

        wait.until(ExpectedConditions.elementToBeClickable(By.partialLinkText("Accounts"))).click();

        By spinnerLocator = By.xpath("//app-spinner");
        wait.until(ExpectedConditions.not(ExpectedConditions.visibilityOfElementLocated(spinnerLocator)));

        By accountsTableRowLocator = By.xpath("//table/tbody/tr");
       List<WebElement> tableRowsElement = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(accountsTableRowLocator));

       if (tableRowsElement.size() == 10) {
           System.out.println("Text passed 10 rows shows in table");
       }else {
           System.out.println("Text failed number of rows not match to 10 actual is " + tableRowsElement.size());
       }

       driver.quit();
    }
}
