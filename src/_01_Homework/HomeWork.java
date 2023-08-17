package _01_Homework;

import Utility.BaseDriver;
import Utility.MyFunc;
import com.google.common.annotations.VisibleForTesting;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.Test;

public class HomeWork extends BaseDriver {
    @Test
    public void test() {
        driver.get("http://demoqa.com/text-box");
        String fullNameText = "Automation";
        String emailText = "Testing@gmail.com";
        WebElement fullName = driver.findElement(By.cssSelector("input[autocomplete='off'][placeholder='Full Name']"));
        fullName.sendKeys(fullNameText);
        WebElement email = driver.findElement(By.cssSelector("input[autocomplete='off'][type='email']"));
        email.sendKeys(emailText);
        WebElement adres = driver.findElement(By.cssSelector("textarea[placeholder='Current Address']"));
        adres.sendKeys("Testing Permanent Address");
        WebElement prementAddre = driver.findElement(By.cssSelector("textarea[id='permanentAddress']"));
        prementAddre.sendKeys("Testing Permanent Address");
        MyFunc.Wait(2);
        WebElement btn = driver.findElement(By.cssSelector("button#submit"));
        btn.click();
        WebElement fullNameout = driver.findElement(By.cssSelector("div[class='mt-4 row'] >*>*:nth-child(1)"));
        System.out.println(fullNameout.getText());
        WebElement emailout = driver.findElement(By.cssSelector("div[class='mt-4 row'] >*>*:nth-child(2)"));
        System.out.println(emailout.getText());
        Assert.assertTrue(!fullNameout.getText().equals(null));
        Assert.assertTrue(!emailout.getText().equals(null));
        bekleVeKapat();
    }


}
