package step_defination.web;

import cucumber.api.java.en.Given;
import pages.Page;

import java.util.concurrent.TimeUnit;

import static core.utils.BrowerConfig.WebConnector.driver;
import static java.lang.Thread.sleep;

public class AddToChartPage extends Page {

    @Given("^\\[Main Page] Enter Items to add on cart")
    public void  navigateLoginPage() throws InterruptedException {
        Thread.sleep(3000);
        getAddToCartWeb().getSelectItems().click();
    }

    @Given("^\\[Main Page] Click on Add to Chart")
    public void  addToChart()  {
        getAddToCartWeb().getAddToChart().click();
    }

}
