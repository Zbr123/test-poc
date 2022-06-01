package core.utils.AndroidCore;

import core.utils.ConfigUtil;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.io.IOException;
import java.net.ServerSocket;
import java.util.Properties;


public class CapabilitiesGenerator {

    public static Properties androidconfig = ConfigUtil.getConfig("androidconfig");
    // App1 capabilities
    static String contactsAppPackageName="com.android.contacts";
    // App2 capabilities
    String settingsAppPackageName="com.android.settings";
    String settingsAppActivityName="com.android.settings.Settings";

    public static int getAnyFreePort() throws IOException {
        ServerSocket s = new ServerSocket(0);
        return s.getLocalPort();
    }

    public static DesiredCapabilities getAndroidCapabilities() throws IOException {

        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setCapability(MobileCapabilityType.PLATFORM_NAME, androidconfig.getProperty("platformName"));
        cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, androidconfig.getProperty("platformVersion"));
        cap.setCapability(MobileCapabilityType.DEVICE_NAME, androidconfig.getProperty("deviceName"));
        cap.setCapability("appPackage", androidconfig.getProperty("appPackage"));
        cap.setCapability("appActivity", androidconfig.getProperty("appActivity"));
        cap.setCapability("autoGrantPermissions", true);
        cap.setCapability("autoAcceptAlerts", true);
        cap.setCapability("noReset", false);
        return cap;
    }

}
