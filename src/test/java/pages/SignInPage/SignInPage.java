package pages.SignInPage;

import org.openqa.selenium.By;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pages.BasePage;

public class SignInPage extends BasePage {
    public static final Logger LOG = LoggerFactory.getLogger(SignInPage.class);
    public static SignInPage instance;

    private SignInPage() {
    }

    public static SignInPage getInstance() {
        SignInPage instance = null;
        if (instance == null) {
            instance = new SignInPage();

        }
        return instance;
    }

    private By SignInButton = By.id("btn1");
    private By logo = By.id("logo");
    private By emailField = By.xpath("//input[@ng-model='Email']");
    private By passwordField = By.xpath("//input[@ng-model='Password']");
    private By getEmailField = By.xpath("//input[@ng-model='Email']'");
    private By enterButton = By.id("enterbtn");
    private By errorMessage = By.id("errormsg");
    private By SkipSignInButton = By.id ("btn2");

    public void clickSignInButton() {
        LOG.info("Click 'Sign in' button");
        driver.findElement(SignInButton).click();
    }

    public boolean isSignInButtonDisplayed() {
        LOG.info("Verify if 'Sign in button is displayed");
        return driver.findElement(SignInButton).isDisplayed();
    }

    public boolean isLogoDisplayed() {
        LOG.info("Verify if Logo image button is displayed");
        return driver.findElement(logo).isDisplayed();


    }

    public void insertemail(String email) {
        LOG.info("Input 'Email adress' in field");
        driver.findElement(emailField).sendKeys(email)
        ;
    }

    public void insertPassword(String password) {
        LOG.info("Input 'password' in field");
        driver.findElement(passwordField).sendKeys(password);
    }
    public void clickenterButton() {
        LOG.info("Click 'Enter' button");
        driver.findElement(enterButton).click();
    }

        public boolean iserrorMessageDisplayed() {
            LOG.info("Verify if error message is displayed");
            return driver.findElement(errorMessage).isDisplayed();


        }
public void clickBack (){
        LOG.info("click back in browser");
        driver.navigate().back();
}
    public void clickSkipSignInButton (){
        LOG.info("Click 'Skip sign in button'");
        driver.findElement(SkipSignInButton).click();
    }
    }






