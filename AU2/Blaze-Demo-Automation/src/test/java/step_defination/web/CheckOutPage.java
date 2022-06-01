package step_defination.web;

import cucumber.api.java.en.Given;
import pages.Page;

import java.util.concurrent.TimeUnit;

import static core.utils.BrowerConfig.WebConnector.driver;

public class CheckOutPage extends Page {

    @Given("^\\[Main Page] Click on Chart")
    public void  navigateLoginPage() throws InterruptedException {
        Thread.sleep(3000);
        getCheckOutWeb().getRedirectToCart().click();
    }

    @Given("^\\[Main Page] Click on placeOrder")
    public void  addToChart() throws InterruptedException {
        getCheckOutWeb().getPlaceHolder().click();
    }

    @Given("^\\[Main Page] Enter Buyer name \"([^\"]*)\"$")
    public void  enterName(String username)  {
        getCheckOutWeb().getUserName().sendKeys(username);
    }

    @Given("^\\[Main Page] Enter Country \"([^\"]*)\"$")
    public void  enterCountry(String country)  {
        getCheckOutWeb().getCountryName().sendKeys(country);
    }

    @Given("^\\[Main Page] Enter City \"([^\"]*)\"$")
    public void  enterCity(String city)  {
        getCheckOutWeb().getCity().sendKeys(city);
    }

    @Given("^\\[Main Page] Enter card number \"([^\"]*)\"$")
    public void  enterCardNumber(String card)  {
        getCheckOutWeb().getCreditCardNumber().sendKeys(card);
    }

    @Given("^\\[Main Page] Enter month \"([^\"]*)\"$")
    public void  enterMonth(String month)  {
        getCheckOutWeb().getMonth().sendKeys(month);
    }

    @Given("^\\[Main Page] Enter year \"([^\"]*)\"$")
    public void  enterYear(String year)  {
        getCheckOutWeb().getYear().sendKeys(year);
    }

    @Given("^\\[Main Page] Click on purchase button")
    public void  purchaseButton() throws InterruptedException {
        getCheckOutWeb().getPurchaseButton().click();

    }







}
