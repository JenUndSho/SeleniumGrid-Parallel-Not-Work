package selenium.training;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import java.net.MalformedURLException;
import java.net.URL;

public class BaseTest {

    protected static ThreadLocal<RemoteWebDriver> driver = new ThreadLocal<>();
    public CapabilitiesFactory capabilitiesFactory = new CapabilitiesFactory();



    @BeforeMethod
    @Parameters(value={"browser"})
    public void setup(String browser) throws MalformedURLException {
        driver.set( new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"),
                    capabilitiesFactory.getCapabilities(browser)));
    }

    public WebDriver getDriver(){
        //Get driver from ThreadLocalMap
        return driver.get();
    }

    @AfterMethod
    public void tearDown(){
        getDriver().quit();
    }

    @AfterClass
    public void terminate(){
        //Remove the ThreadLocalMap element
        driver.remove();
    }

}
