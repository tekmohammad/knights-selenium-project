package tek.selenium.week_1;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class UseBrowsers {

    public static void main(String[] args) {

        //WebDriverManager Library was required for setup each browser before Selenium V4.4.0

        // to open a browser we need to instantiate new object of that browser.
        ChromeDriver chromeDriver = new ChromeDriver();
        //navigate to a URL
        chromeDriver.get("https://google.com");
        String googleTitle = chromeDriver.getTitle();
        System.out.println(googleTitle);
        chromeDriver.quit();

        //FireFox Browser.
        FirefoxDriver firefoxDriver = new FirefoxDriver();
        firefoxDriver.get("https://google.com");
        String titleWithFirefox = firefoxDriver.getTitle();
        System.out.println(titleWithFirefox);
        firefoxDriver.quit();

        //Edge Browser
        EdgeDriver edgeDriver = new EdgeDriver();
        edgeDriver.get("https://google.com");
        String titleFromEdge = edgeDriver.getTitle();
        System.out.println(titleFromEdge);
        edgeDriver.quit();

    }
}
