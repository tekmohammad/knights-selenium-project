package tek.selenium.week_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NameAndIDLocator {

    public static void main(String[] args) throws InterruptedException{
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://happy-desert-0f05d560f.1.azurestaticapps.net/");

        //Locating Username Element in Web Page and enter a value.
        //id , name , className, tagName, linkName, partialLinkName, xpath , css
        //1) locate with one of the options
       By usernameInputLocator =  By.name("username");
       //2) find element by selenium
       WebElement usernameElement = driver.findElement(usernameInputLocator);
       //3) take action with element.
       //using sendkey method with enter value to input field
       usernameElement.sendKeys("supervisor");

       Thread.sleep(20 * 1000);
       driver.quit();
    }
}
