package tek.selenium.scenarios;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TitleValidation {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://happy-desert-0f05d560f.1.azurestaticapps.net/");
        String actualTitle = driver.getTitle();

        if (actualTitle.equals("Tek Insurance Service")) {
            System.out.println("Test Passed");
        } else {
            System.out.println("Test Failed");
            System.out.println("Expecting to be Tek Insurance Service " + "but it was " + actualTitle);
        }
        driver.quit();
    }
}
