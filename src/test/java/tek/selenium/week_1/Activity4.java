package tek.selenium.week_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Activity4 {

    //Navigate to google.com and search for something
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://google.com");

        By searchFieldLocator = By.id("APjFqb");
        WebElement searchFieldElement = driver.findElement(searchFieldLocator);
        searchFieldElement.sendKeys("Java if Fun");
        Thread.sleep(1000);
        By searchButtonLocator = By.name("btnK");
        WebElement searchButtonElement = driver.findElement(searchButtonLocator);
        searchButtonElement.click();
        Thread.sleep(5000);
        driver.quit();
    }
}
