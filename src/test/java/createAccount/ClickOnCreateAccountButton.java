package createAccount;
import baseClass.BaseClass;
import loginPage.EnterUserName;
import org.testng.annotations.Test;
public class ClickOnCreateAccountButton extends BaseClass {

    @Test
    public void clickSignIn()
    {
        EnterUserName enterUserName=new EnterUserName(driver);
        enterUserName.clickSignInLink();
    }
    @Test(dependsOnMethods = {"clickSignIn"})
    public void enterUserName()
    {
        EnterUserName enterUserName=new EnterUserName(driver);
        enterUserName.enterUserName("Nikhil.mlk1986");
    }
    @Test(dependsOnMethods = {"enterUserName"})
    public void clickNext()
    {
        EnterUserName enterUserName=new EnterUserName(driver);
        enterUserName.clickNextButton();
    }
    @Test(dependsOnMethods = {"clickNext"})
    public void clickCreateAccount()
    {
        EnterUserName enterUserName=new EnterUserName(driver);
        enterUserName.createAccountButton();
    }
}
