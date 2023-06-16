import PageObject.LogInPage;
import StepObject.LogInStep;
import Utils.ChromeRunner;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

import static DataObject.LogInData.*;
import static PageObject.LogInPage.*;
import static StepObject.LogInStep.*;


public class LogIn extends ChromeRunner{



    @Test (priority = 2)

    public void logInWithIncorrectData() throws InterruptedException {


        LogInStep obj1 = new LogInStep(driver);

        obj1.emailInput(incorrectEmailData);
        obj1.passWordInput(incorrectPasswordData);
        obj1.clickOnLogIButton();


        String actualResult = driver.findElement(errorText).getText();

        Assert.assertEquals(expectedResult,actualResult);
        Thread.sleep(3000);


    }
    
    @Test (priority = 2)


    public void  logInWithIncorrectPassword () throws InterruptedException {


        LogInStep obj2 = new LogInStep(driver);



        obj2.emailInput(validEmail);
        obj2.passWordInput(incorrectPasswordData);
        obj2.clickOnLogIButton();



        String actualResult = driver.findElement(errorText).getText();

        Assert.assertEquals(expectedResult,actualResult);
        Thread.sleep(3000);


    }


    @Test (priority = 1)

    public void logIInWithEmptyData () throws InterruptedException {
        LogInStep obj3 = new LogInStep(driver);
        WebElement wait = new WebDriverWait(driver, Duration.ofSeconds(5)).
                until(ExpectedConditions.elementToBeClickable(logInButton));

        obj3.clickOnLogIButton();
        Thread.sleep(3000);

    }





}
