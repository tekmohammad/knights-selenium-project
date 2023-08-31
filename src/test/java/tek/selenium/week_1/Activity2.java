package tek.selenium.week_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Activity2 {

    /*
    Navigate to link https://tek-retail-ui.azurewebsites.net/selenium
    Click on Inputs
    then fill the form text, email , password
     */
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://tek-retail-ui.azurewebsites.net/selenium");
        By inputLinkLocator = By.linkText("Inputs");
        WebElement inputLinkElement = driver.findElement(inputLinkLocator);
        inputLinkElement.click();

        By textInputLocator =By.name("text");
        WebElement textInputElement = driver.findElement(textInputLocator);
        textInputElement.sendKeys("Some Text in here");

        By emailLocator = By.name("email");
        WebElement emailElement = driver.findElement(emailLocator);
        emailElement.sendKeys("someone@gmail.com");

        By passwordLocator = By.id("passwordInput");
        WebElement passwordElement = driver.findElement(passwordLocator);
        passwordElement.sendKeys("Someone'spassword");

        driver.quit();
    }
}
