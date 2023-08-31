package tek.selenium.week_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UseLocators {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://happy-desert-0f05d560f.1.azurestaticapps.net/");

        Thread.sleep(2000);
        //1) Locate the element with By
        By usernameLocator = By.name("username");
        //2) Find the element with driver.
        WebElement usernameElement = driver.findElement(usernameLocator);
        //3) perform action -> send text to input
        usernameElement.sendKeys("WrongUsername");

        By passwordLocator = By.name("password");
        WebElement passwordElement = driver.findElement(passwordLocator);
        passwordElement.sendKeys("tek_supervisor");
        Thread.sleep(5000);
        //Clicking on button
        By loginButtonLocator = By.id("loginButton");
        WebElement loginButtonElement = driver.findElement(loginButtonLocator);
        loginButtonElement.click();
        Thread.sleep(5000);

        //Using className for locator.
        By bannerLocator = By.className("error");
        WebElement bannerElement = driver.findElement(bannerLocator);
        String errorMessage = bannerElement.getText();
        System.out.println(errorMessage);
        driver.quit();
    }
}
