package sit707_week1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Dimension; // Needed for window resizing

/**
 * @author Romil Bijarnia
 */
public class SeleniumOperations {

    public static void sleep(int sec) {
        try {
            Thread.sleep(sec * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void open_chrome_and_close() {
        // Step 1: Locate chrome driver folder (chromium browser) in the local drive.
        System.setProperty("webdriver.chrome.driver", "/users/romilbijarnia/desktop/chromedriver-mac-arm64/chromedriver");

        // Step 2: Use above chrome driver to open up a chromium browser.
        System.out.println("Fire up chrome browser.");
        WebDriver driver = new ChromeDriver();

        System.out.println("Driver info: " + driver);

        // Sleep a while
        sleep(5);

        // Close chrome driver.
        driver.close();
    }

    public static void open_chrome_maximize_close() {
        System.setProperty("webdriver.chrome.driver", "/users/romilbijarnia/desktop/chromedriver-mac-arm64/chromedriver");
        System.out.println("Fire up chrome browser.");
        WebDriver driver = new ChromeDriver();

        System.out.println("Driver info: " + driver);

        sleep(5);

        // Maximize chrome driver
        driver.manage().window().maximize();

        // Sleep a while
        sleep(5);

        // Close chrome driver.
        driver.close();
    }

    public static void load_web_page_close() {
        System.setProperty("webdriver.chrome.driver", "/users/romilbijarnia/desktop/chromedriver-mac-arm64/chromedriver");
        System.out.println("Fire up chrome browser.");
        WebDriver driver = new ChromeDriver();

        System.out.println("Driver info: " + driver);

        sleep(5);

        // Open the URL in chromium browser.
        driver.get("https://selenium.dev");

        // Sleep a while
        sleep(5);

        // Close chrome driver.
        driver.close();
    }

    /*
     * Completed function for task: Open Chrome, load a page, resize, and close.
     */
    public static void open_chrome_loadpage_resize_close() {
        // Display personal information.
        System.out.println("Hello from 222528574, Romil Bijarnia");

        // Step 1: Locate chrome driver folder in the local drive.
        System.setProperty("webdriver.chrome.driver", "/users/romilbijarnia/desktop/chromedriver-mac-arm64/chromedriver");

        // Step 2: Open up a chromium browser.
        System.out.println("Fire up chrome browser.");
        WebDriver driver = new ChromeDriver();
        System.out.println("Driver info: " + driver);

        sleep(2);

        // Load google page.
        driver.get("https://www.google.com");

        // Resize window to 640x480 and wait 2 seconds.
        driver.manage().window().setSize(new Dimension(640, 480));
        sleep(2);

        // Resize window to 1280x960 and wait 2 seconds.
        driver.manage().window().setSize(new Dimension(1280, 960));
        sleep(2);

        // Additional sleep before closing.
        sleep(2);

        // Close chrome driver.
        driver.close();
    }
}
