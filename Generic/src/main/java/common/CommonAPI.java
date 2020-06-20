package common;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public class CommonAPI {
    public static WebDriver driver = null;
    static JavascriptExecutor jse = (JavascriptExecutor)driver;

    @BeforeMethod
    public void setUp() {
        //setting up the browser
        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\samin\\Desktop\\FinalProject\\TargetPractice\\Generic\\src\\main\\java\\drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().deleteAllCookies();
        driver.get("https://www.target.com/");
    }


    @AfterMethod(alwaysRun = true)
    public void cleanUp() {
        //close the browser
        driver.close();
    }
}
