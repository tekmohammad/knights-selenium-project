package tek.selenium.scenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ValidCSRLogin {
    //User Story # 6
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://happy-desert-0f05d560f.1.azurestaticapps.net/");
        Thread.sleep(1000);

        driver.findElement(By.name("username")).sendKeys("Supervisor");
        driver.findElement(By.name("password")).sendKeys("tek_supervisor");
        driver.findElement(By.id("loginButton")).click();

        Thread.sleep(2000);

        By pageTitleLocator = By.xpath("/html/body/app-root/app-home-page/div/app-toolbar/mat-toolbar/span[1]");
        WebElement pageTitleElement = driver.findElement(pageTitleLocator);
        String pageTitleText = pageTitleElement.getText();
        String expectedPageTitle = "Tek Insurance App";
        if (pageTitleText.equals(expectedPageTitle)) {
            System.out.println("Page Title is correct Test Passed");
        } else {
            System.out.println("Page Title is WRONG Test Failed");
        }

        By usernameLocator = By.xpath("/html/body/app-root/app-home-page/div/app-toolbar/mat-toolbar/button[2]/span[1]");
        WebElement usernameElement = driver.findElement(usernameLocator);
        String usernameText = usernameElement.getText();
        String expectedUsername = "Supervisor";
        System.out.println(usernameText);

       String actualUsername = usernameText.substring(0, expectedUsername.length());

        if (actualUsername.equals(expectedUsername)) {
            System.out.println("User name correct test pass");
        }else {
            System.out.println("Username wrong test failed");
        }
        driver.quit();
    }
}
