package tek.selenium.week_1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.util.Scanner;

public class Activity1 {
    //Open Chrome Browser and navigate to Facebook page.
    //print the title and quite browser
    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        String browserType = scanner.next();

        WebDriver driver;
        if (browserType.equals("chrome")) {
            driver = new ChromeDriver();
        } else if (browserType.equals("firefox")) {
            driver = new FirefoxDriver();
        } else if (browserType.equals("edge")) {
            driver = new EdgeDriver();
        } else {
            //Intentional stop execution of application with throw keyword
            throw new RuntimeException("Browser type is wrong");
        }

        driver.get("https://www.facebook.com/");
        String title = driver.getTitle();
        System.out.println(title);
        Thread.sleep(1000 * 5);
        driver.quit();
    }

}
