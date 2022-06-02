package step_defination.web;

import core.utils.BrowerConfig.WebConnector;
import core.utils.ConfigUtil;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.Page;


import static core.utils.AndroidCore.AndroidDriverSetup.androidDriver;
import static core.utils.AndroidCore.AndroidDriverSetup.quitAndroidDriver;
import static core.utils.AndroidCore.AppiumServerRunner.StartAppiumServer;
import static core.utils.BrowerConfig.WebConnector.driver;

import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class SignUpPage extends Page {

    public static Properties myProp = ConfigUtil.getConfig("config");
    public WebDriver driver = WebConnector.driver;

    public String PORT;

    @Before
    public void startTest() throws Exception {

        if (myProp.getProperty("platformname").toString().equals("WEB")) {
            WebConnector connector = new WebConnector();
            driver = connector.openBrowser();
        }
        if (myProp.getProperty("platformname").toString().equals("Android")) {
            PORT = myProp.getProperty("appiumport");
            StartAppiumServer(PORT);
            androidDriver(PORT);
        }
    }

    public void iOSDriver() {
    }

    @After
    public void afterTest() {
        if (myProp.getProperty("platformname").toString().equals("WEB")) {
            if (driver != null) {
                driver.quit();
            }
        }
        if (myProp.getProperty("platformname").toString().equals("Android")) {
            quitAndroidDriver();
        }
    }

    @Given("^\\[Main Page] Navigate to Blaze Web app")
    public void  openWebUrl() throws InterruptedException {
        String webUrl = myProp.getProperty("weburl");
        androidDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        androidDriver.get(webUrl);
    }

    @Given("^\\[Main Page] Go to the SignUp")
    public void  navigateLoginPage() {
        getSignUpWeb().getSignUpButton().click();
    }

    @Given("^\\[Main Page] Enter UserName \"([^\"]*)\"$")
    public void  enterUserName(String username) {
        getSignUpWeb().getUsername().sendKeys(username);

    }

    @Given("^\\[Main Page] Enter Password \"([^\"]*)\"$")
    public void  enterPassword(String password)  {
        getSignUpWeb().getPassword().sendKeys(password);
    }

    @Given("^\\[Main Page] Click on SignUp Button")
    public void  signUp()  {
        getSignUpWeb().getSignUp().click();
    }


}
