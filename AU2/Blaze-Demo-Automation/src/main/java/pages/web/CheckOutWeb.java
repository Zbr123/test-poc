package pages.web;

import core.utils.BrowerConfig.WebConnector;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.Page;

import static core.utils.AndroidCore.AndroidDriverSetup.androidDriver;

public class CheckOutWeb {
   private String CART="//android.view.View[@content-desc=\"Cart\"]/android.widget.TextView";
   private String PLACE_ORDER="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View[2]/android.widget.Button";
   private String USER_NAME="name";
   private String COUNTRY="country";
   private String CITY="city";
   private String CREDIT_CARD="card";
   private String MONTH="month";
   private String YEAR="year";
   private String PURCHASE_BUTTON="//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.webkit.WebView/android.view.View/android.app.Dialog/android.view.View/android.view.View/android.widget.Button[2]";

    public CheckOutWeb(Page page) {
    }
    public WebElement getRedirectToCart() { return androidDriver.findElement(By.xpath(CART)); }
    public WebElement getPlaceHolder() { return  androidDriver.findElement(By.xpath(PLACE_ORDER)); }
    public WebElement getUserName() { return  androidDriver.findElement(By.id(USER_NAME)); }
    public WebElement getCountryName() { return  androidDriver.findElement(By.id(COUNTRY)); }
    public WebElement getCity() { return  androidDriver.findElement(By.id(CITY)); }
    public WebElement getCreditCardNumber() { return  androidDriver.findElement(By.id(CREDIT_CARD)); }
    public WebElement getMonth() { return  androidDriver.findElement(By.id(MONTH)); }
    public WebElement getYear() { return  androidDriver.findElement(By.id(YEAR)); }
    public WebElement getPurchaseButton() { return androidDriver.findElement(By.xpath(PURCHASE_BUTTON)); }
}
