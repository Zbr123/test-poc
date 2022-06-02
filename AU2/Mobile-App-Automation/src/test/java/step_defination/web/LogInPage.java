package step_defination.web;

import cucumber.api.java.en.Given;
import pages.Page;

import java.util.concurrent.TimeUnit;

import static core.utils.AndroidCore.AndroidDriverSetup.androidDriver;
import static core.utils.BrowerConfig.WebConnector.driver;

public class LogInPage extends Page {

    @Given("^\\[Main Page] Go to the LogIn")
    public void  navigateLoginPage() throws InterruptedException {
        androidDriver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        getLogIn().getRedirectLogIn().click();
    }

    @Given("^\\[Main Page] Enter Username in logIn filed \"([^\"]*)\"$")
    public void  enterName(String username)  {
        getLogIn().getUserName().sendKeys(username);
    }

    @Given("^\\[Main Page] Enter Password in logIn filed \"([^\"]*)\"$")
    public void  enterPassword(String password) {
        getLogIn().getPassword().sendKeys(password);
    }

    @Given("^\\[Main Page] Click on LogIn Button")
    public void  logIn() {
        getLogIn().getLogin().click();
    }

}

