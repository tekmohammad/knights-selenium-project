package tek.selenium.week_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UseLocators2 {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://tek-retail-ui.azurewebsites.net/selenium");

        Thread.sleep(3000);
        By inputLink = By.linkText("Input");
        WebElement inputLinkElement = driver.findElement(inputLink);
        inputLinkElement.click();

        Thread.sleep(5000);
        driver.quit();
    }
}
