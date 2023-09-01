package tek.selenium.week_1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Activity5 {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://tek-retail-ui.azurewebsites.net/selenium");

        By inputLinkLocator = By.linkText("Inputs");
        driver.findElement(inputLinkLocator).click();

        By rangeLocator = By.id("rangeInput");

        for(int i = 0 ; i < 20 ; i++) {
            Thread.sleep(100);
            WebElement rangeElement = driver.findElement(rangeLocator);
            rangeElement.sendKeys(Keys.ARROW_RIGHT);
        }

        Thread.sleep(5000);
        driver.quit();
    }
}
