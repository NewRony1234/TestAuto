package Utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class ChromeRunner {

    public WebDriver driver = new ChromeDriver();

    @BeforeTest

    public void openChrome (){
        driver.manage().window().maximize();
        driver.get("https://dressup.ge/ka/%E1%83%90%E1%83%95%E1%83%A2%E1%83%9D%E1%83%A0%E1%83%98%E1%83%96%E1%83%90%E1%83%AA%E1%83%98%E1%83%90?back=my-account");


    }


    @AfterTest

    public void closeChrome()  {
        driver.quit();
    }
}
