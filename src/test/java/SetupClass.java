import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;
import java.util.List;
import java.util.Set;

public class SetupClass {


    WebDriver driver;
    @Before
    public void setup(){
        System.setProperty("webdriver.gecko.driver" , "./src/test/resources/geckodriver.exe");
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
    }
//    []   { }

//    @After
//    public void exit() {
//        driver.quit();
//    }
    }


