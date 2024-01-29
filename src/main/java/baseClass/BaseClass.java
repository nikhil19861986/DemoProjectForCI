package baseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Properties;
public class BaseClass {
    protected WebDriver driver;
    private Properties properties;
    private BufferedReader bufferedReader;
    private FileReader fileReader;

    @BeforeClass
    public void setupDriver()
    {
        try {
            properties = new Properties();
            fileReader=new FileReader("./demo.properties");
            bufferedReader=new BufferedReader(fileReader);
            properties.load(bufferedReader);
            bufferedReader.close();
            if(properties.getProperty("browserName").equalsIgnoreCase("chrome"))
            {
                ChromeOptions options = new ChromeOptions();
                options.setAcceptInsecureCerts(true);
                options.addArguments("incognito");
                options.addArguments("disk-cache-size=0");
                this.driver=new ChromeDriver(options);
                this.driver.manage().deleteAllCookies();
                this.driver.manage().window().maximize();
                this.driver.get(properties.getProperty("url"));
            }
        }
        catch(Exception a)
        { }
    }
    @AfterClass
    public void closeBrowser()
    {
        this.driver.quit();
    }
}
