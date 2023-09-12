package tek.selenium.scenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginButtonEnabled {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://happy-desert-0f05d560f.1.azurestaticapps.net");

        By loginButtonLocator = By.id("loginButton");

        WebElement loginButtonElement = driver.findElement(loginButtonLocator);

        boolean isDisabled = loginButtonElement.isEnabled();

        if (!isDisabled) {
            System.out.println("Button disabled");
        } else {
            System.out.println("Button is enabled");
        }

        driver.findElement(By.name("userName")).sendKeys("Username");
        driver.findElement(By.name("password")).sendKeys("password");

        boolean isEnabled = driver.findElement(By.id("loginButton")).isEnabled();
        if (isEnabled) {
            System.out.println("Button is Enabled");
        } else {
            System.out.println("button is Disabled.");
        }
        driver.quit();
    }
}
