package tek.selenium.week_2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


public class UseImplicitWait {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        //Add implicit wait.
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get("https://happy-desert-0f05d560f.1.azurestaticapps.net/");

        By pageTitleLocator = By.xpath("/html/body/app-root/app-login/mat-toolbar/span[1]");
        WebElement pageTitleElement = driver.findElement(pageTitleLocator);
        String pageTitleText = pageTitleElement.getText();
        System.out.println(pageTitleText);

        //Explicitly Wait.
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        By usernameInputLocator = By.name("username");
        WebElement usernameInputElement = wait.until(ExpectedConditions
                .presenceOfElementLocated(usernameInputLocator));
        usernameInputElement.sendKeys("wrong username");

        By passwordInputLocator = By.name("password");
        WebElement passwordInputElement = wait.until(ExpectedConditions.presenceOfElementLocated(passwordInputLocator));
        passwordInputElement.sendKeys("WrongPassword");

        By loginButtonLocator = By.id("loginButton");
        WebElement loginButtonElement = wait.until(ExpectedConditions.elementToBeClickable(loginButtonLocator));
        loginButtonElement.click();

        By errorLocator = By.className("error");
        WebElement errorElement = wait.until(ExpectedConditions.visibilityOfElementLocated(errorLocator));
        String errorText = errorElement.getText();
        System.out.println(errorText);
        driver.quit();
    }
}
