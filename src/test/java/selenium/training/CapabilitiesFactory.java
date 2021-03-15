package selenium.training;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.chrome.ChromeOptions;

public class CapabilitiesFactory {

    public Capabilities capabilities;

    public Capabilities getCapabilities(String browser){
        ChromeOptions options = new ChromeOptions();
        capabilities = options;
        return capabilities;
    }

}
