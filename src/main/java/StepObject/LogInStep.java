package StepObject;

import PageObject.LogInPage;
import org.openqa.selenium.WebDriver;

import static PageObject.LogInPage.*;

public class LogInStep  {
    WebDriver driver;


    public LogInStep(WebDriver driver1){
        driver=driver1;

    }

    public void emailInput (String s){
        driver.findElement(email).clear();
        driver.findElement(email).sendKeys(s);
    }


    public void  passWordInput (String s){

        driver.findElement(password).sendKeys(s);

    }

    public void clickOnLogIButton (){

        driver.findElement(logInButton).click();
    }








}
