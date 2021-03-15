package selenium.training;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class ParallelShareLane {

    public WebDriver driver;

    @AfterMethod
    public void quit(){
        driver.quit();
    }

    @Test
    public void test1() throws InterruptedException, MalformedURLException {

            System.out.println("test 1 started..."+ Thread.currentThread().getId());
            DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
            desiredCapabilities.setBrowserName("chrome");
            desiredCapabilities.setPlatform(Platform.MAC);

            driver = new RemoteWebDriver(new URL("http://192.168.1.10:4444/wd/hub"), desiredCapabilities);


            driver.get("https://www.google.com/");
            System.out.println("title = " + driver.getTitle());
            Thread.sleep(2000);

            System.out.println("test 1 ended...");
        }





    @Test
    public void test2() throws InterruptedException, MalformedURLException {


            System.out.println("test 2 started..."+ Thread.currentThread().getId());
            DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
            desiredCapabilities.setBrowserName("chrome");
            desiredCapabilities.setPlatform(Platform.MAC);

            driver = new RemoteWebDriver(new URL("http://192.168.1.10:4444/wd/hub"), desiredCapabilities);

            driver.get("https://www.google.com/");
            System.out.println("title = " + driver.getTitle());
            Thread.sleep(2000);

            System.out.println("test 2 ended...");
        }



    @Test
    public void test3() throws InterruptedException, MalformedURLException {

        System.out.println("test 3 started... "+ Thread.currentThread().getId());
            DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
            desiredCapabilities.setBrowserName("chrome");
            desiredCapabilities.setPlatform(Platform.MAC);

            driver = new RemoteWebDriver(new URL("http://192.168.1.10:4444/wd/hub"), desiredCapabilities);


        driver.get("https://www.google.com/");
        System.out.println("title = "+driver.getTitle());
        Thread.sleep(2000);

        System.out.println("test 3 ended...");

        }


}
