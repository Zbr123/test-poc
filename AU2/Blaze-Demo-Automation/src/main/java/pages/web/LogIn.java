package pages.web;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import pages.Page;

import static core.utils.AndroidCore.AndroidDriverSetup.androidDriver;

public class LogIn {

   public String LOG_IN_BUTTON="//android.view.View[@content-desc=\"Log in\"]/android.widget.TextView";
   public String LOG_IN_USERNAME="loginusername";
   public String LOG_IN_PASSWORD="loginpassword";
   public String LOG_IN_BUTTON_XPATH="//android.view.View/android.widget.Button[3]";


    public LogIn(Page page) {
    }

    public WebElement getRedirectLogIn() { return  androidDriver.findElement(By.xpath(LOG_IN_BUTTON)); }
    public WebElement getUserName() { return  androidDriver.findElement(By.id(LOG_IN_USERNAME)); }
    public WebElement getPassword() { return  androidDriver.findElement(By.id(LOG_IN_PASSWORD)); }
    public WebElement getLogin() { return  androidDriver.findElement(By.xpath(LOG_IN_BUTTON_XPATH)); }


}
