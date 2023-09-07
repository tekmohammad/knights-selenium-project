package tek.selenium.week_2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Activity2 {

    //Use CssSelector
    //Navigate to Insurance app.
    //print Page title.
    //print customer service portal title
    //print second section title (Login)
    //Enter WrongUser Name
    //Enter Wrong password
    //Click login
    //Print error message.
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://happy-desert-0f05d560f.1.azurestaticapps.net/");

        Thread.sleep(1000);
        By pageTitleLocator = By.cssSelector("body > app-root > app-login > mat-toolbar > span:nth-child(2)");
        WebElement pageTitleElement = driver.findElement(pageTitleLocator);
        String pageTitleText = pageTitleElement.getText();
        System.out.println(pageTitleText);

        By sectionTitleLocator = By.cssSelector("body > app-root > app-login > div > mat-card > mat-card-title > strong");
        WebElement sectionTitleElement = driver.findElement(sectionTitleLocator);
        String sectionTitleText = sectionTitleElement.getText();
        System.out.println(sectionTitleText);

        By subTitleLocator = By.cssSelector("body > app-root > app-login > div > mat-card > mat-card-title:nth-child(2)");
        WebElement subTitleElement = driver.findElement(subTitleLocator);
        String subTitleText = subTitleElement.getText();
        System.out.println(subTitleText);

        By usernameInputLocator  = By.name("username");
        WebElement usernameInputElement = driver.findElement(usernameInputLocator);
        usernameInputElement.sendKeys("wrongUsername");

        By passwordInputLocator = By.name("password");
        WebElement passwordInputElement = driver.findElement(passwordInputLocator);
        passwordInputElement.sendKeys("tek_supervisor");

        By loginButtonLocator = By.id("loginButton");
        WebElement loginButtonElement = driver.findElement(loginButtonLocator);
        loginButtonElement.click();

        Thread.sleep(1000);
        By errorMessageLocator = By.className("error");
        WebElement errorMessageElement = driver.findElement(errorMessageLocator);
        String errorMessage = errorMessageElement.getText();
        System.out.println(errorMessage);
        driver.quit();

    }

}
