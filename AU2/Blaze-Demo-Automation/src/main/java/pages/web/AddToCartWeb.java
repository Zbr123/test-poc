package pages.web;

import core.utils.BrowerConfig.WebConnector;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.Page;

import static core.utils.AndroidCore.AndroidDriverSetup.androidDriver;

public class AddToCartWeb {
   private String ITEMS="//android.view.View/android.view.View[2]/android.view.View[2]/android.view.View/android.view.View[1]";
   private String ADD_TO_CART="//android.view.View[@content-desc=\"Add to cart\"]/android.widget.TextView";


    public AddToCartWeb(Page page) {
    }
    public WebElement getSelectItems() { return  androidDriver.findElement(By.xpath(ITEMS)); }
    public WebElement getAddToChart() { return  androidDriver.findElement(By.xpath(ADD_TO_CART)); }

}
