package pages.web;

import core.utils.BrowerConfig.WebConnector;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import pages.Page;

import static core.utils.AndroidCore.AndroidDriverSetup.androidDriver;

public class SignUpWeb {


   private String SIGN_UP_XPATH="//android.view.View[@content-desc=\"Sign up\"]/android.widget.TextView";
   private String SIGN_UP_USER_NAME_ID="sign-username";
   private String SIGN_UP_PASSWORD_ID="sign-password";
   private String SIGN_UP_BUTTON="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.webkit.WebView/android.view.View/android.app.Dialog/android.view.View/android.view.View/android.widget.Button[3]";


    public SignUpWeb(Page page) {
    }

    public WebElement getSignUpButton() { return  androidDriver.findElement(By.xpath(SIGN_UP_XPATH)); }

    public WebElement getUsername() { return  androidDriver.findElement(By.id(SIGN_UP_USER_NAME_ID)); }

    public WebElement getPassword() { return  androidDriver.findElement(By.id(SIGN_UP_PASSWORD_ID)); }

    public WebElement getSignUp() { return  androidDriver.findElement(By.xpath(SIGN_UP_BUTTON)); }



}
