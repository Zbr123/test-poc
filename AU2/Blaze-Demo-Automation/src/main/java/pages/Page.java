package pages;

import pages.web.*;

public class Page {

    // Web
    private final SignUpWeb signUpWeb = new SignUpWeb(this);
    protected SignUpWeb getSignUpWeb() {return signUpWeb;}

    private final AddToCartWeb addToCartWeb = new AddToCartWeb(this);
    protected AddToCartWeb getAddToCartWeb() {return addToCartWeb;}

    private final LogIn logIn = new LogIn(this);
    protected LogIn getLogIn() {return logIn;}

    private final CheckOutWeb checkOutWeb = new CheckOutWeb(this);
    protected CheckOutWeb getCheckOutWeb() {return checkOutWeb;}
}
