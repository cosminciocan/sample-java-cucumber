package webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;


public class Driver {

    private static WebDriver driver;

    public static void initWebdriver() {
            System.out.println("===============================================================");
            System.out.println("|          Open Selenium Web Driver ");
            System.out.println("===============================================================\n");

//        If FF is used, uncomment the login method from Homepage
//        driver = new FirefoxDriver(); // for Firefox
            System.setProperty("webdriver.chrome.driver", "chromeDriver\\chromedriver.exe");
            driver = new ChromeDriver(); // For chrome
////        TimeUnit.SECONDS.sleep(1);


            driver.manage().window().maximize();
            driver.manage().deleteAllCookies();
            Runtime.getRuntime().addShutdownHook(new Thread() {
                public void run() {
                    System.out.println("Closing browser");
                    closeWebDriver();
                }
            });
    }

    private static void closeWebDriver(){
        System.out.println("===============================================================");
        System.out.println("|          Stopping driver (closing browser)                   |");
        System.out.println("===============================================================");
        driver.quit();
        System.out.println("===============================================================");
        System.out.println("|         Driver stopped (browser closed)                     |");
        System.out.println("===============================================================\n");
    }



    public static WebDriver getWebdriver() {
        return driver;
    }
}
