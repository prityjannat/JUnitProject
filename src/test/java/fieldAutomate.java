import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class fieldAutomate extends SetupClass{
    @Test
    public void getTitle() {
        driver.get("https://demoqa.com/automation-practice-form");
        String getActual = driver.getTitle();
        String getExpected = "ToolsQA";
        Assert.assertEquals(getExpected , getActual);
    }
    @Test
    public void imageelement(){
        driver.get("https://demoqa.com/automation-practice-form");
        Assert.assertTrue(driver.findElement(By.xpath("//img[@src='/images/Toolsqa.jpg']")).isDisplayed());
    }

    @Test
    public void header() {
        driver.get("https://demoqa.com/automation-practice-form");
        String getActual = String.valueOf(driver.findElement(By.cssSelector("[class = main-header]")).getText());
        String getExpected = "Practice Form";
        Assert.assertTrue(getActual.contains(getExpected));

    }

    @Test
    public void submit() throws InterruptedException {
        driver.get("https://demoqa.com/automation-practice-form");
        driver.findElement(By.id("firstName")).sendKeys("Afrina");
        driver.findElement(By.id("lastName")).sendKeys("Prity");
        driver.findElement(By.id("userEmail")).sendKeys("prityjannat23@gmail.com");
        List<WebElement> radio = driver.findElements(By.className("custom-control-label"));
        radio.get(1).click();
        driver.findElement(By.id("userNumber")).sendKeys("0172345676");
        WebElement w = driver.findElement(By.xpath("//input[@id='subjectsInput']"));
        w.sendKeys("Computer");
        w.sendKeys(Keys.ENTER);
        WebElement uploadpic = driver.findElement(By.id("uploadPicture"));
        uploadpic.sendKeys("G:\\Tree.jpg");
        driver.findElement(By.id("currentAddress")).sendKeys("Dhaka");
         // radio.get(4).click();


//
    }
    @Test
    public void dropdown(){
        driver.get("https://demoqa.com/automation-practice-form");
//        WebElement dropdown = driver.findElement(By.id("close-fixedban"));

        List<WebElement> radio = driver.findElements(By.className("custom-control-label"));
        radio.get(4).click();
//
   }
//    @Test
//    public void date() throws InterruptedException {
//        driver.get("https://demoqa.com/automation-practice-form");
//         driver.findElement(By.id("dateOfBirthInput")).clear();
//         Thread.sleep(5000);
//        //e.sendKeys(Keys.BACK_SPACE);
//        //e.get(4).sendKeys("31 Oct 2022");
//
////        driver.findElement(By.id("dateOfBirthInput")).sendKeys("30 Oct 2022");
////
//    }
//

        @Test
    public void dropdownstate() throws InterruptedException {
        driver.get("https://demoqa.com/automation-practice-form");
        Thread.sleep(2000);
        WebElement single = driver.findElement(By.className(" css-1uccc91-singleValue"));
        single.sendKeys(Keys.ARROW_DOWN);
        single.sendKeys(Keys.ENTER);
//        Select option = new Select(single);
//        option.selectByIndex(0);
//
  }

    }

