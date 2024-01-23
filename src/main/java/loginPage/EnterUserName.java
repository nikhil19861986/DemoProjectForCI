package loginPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class EnterUserName {
    private WebDriver driver;
    private WebDriverWait wait;

    @FindBy(xpath = "//input[@id='login-username']")
    private WebElement userIdTextField;
    @FindBy(xpath = "//input[@id='login-signin']")
    private WebElement nextButton;
    @FindBy(xpath = "//a[contains(text(),'Sign in')]")
    private WebElement signIn;
    @FindBy(xpath = "//a[@id='createacc']")
    private WebElement createAcc;
    @FindBy(xpath = "//a[@id='mbr-forgot-link']")
    private WebElement forgtUser;

    public EnterUserName(WebDriver driver)
    {
        this.driver=driver;
        this.wait=new WebDriverWait(driver,30);
        PageFactory.initElements(driver,this);
    }
    public void enterUserName(String username)
    {
        wait.until(ExpectedConditions.visibilityOf(userIdTextField)).sendKeys(username);
    }
    public void clickNextButton()
    {
        wait.until(ExpectedConditions.visibilityOf(nextButton)).click();
    }
    public void clickSignInLink()
    {
        wait.until(ExpectedConditions.visibilityOf(signIn)).click();
    }
    public void createAccountButton()
    {
        wait.until(ExpectedConditions.visibilityOf(createAcc)).click();
    }
    public void forgotUserName()
    {
        wait.until(ExpectedConditions.visibilityOf(forgtUser)).click();
    }




}
