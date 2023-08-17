package _02_XOathHomeWork;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class XOath extends BaseDriver {
    @Test
    public void test1(){
        driver.get("http://demoqa.com/text-box");
        String fullNameText = "Automation";
        String emailText = "Testing@gmail.com";
        WebElement fullName = driver.findElement(By.xpath("//input[@id='userName']"));
        fullName.sendKeys(fullNameText);
        WebElement email = driver.findElement(By.xpath("//input[@id='userEmail']"));
        email.sendKeys(emailText);//
        WebElement ares = driver.findElement(By.xpath("//textarea[@id='currentAddress']"));
        ares.sendKeys("Testing Permanent Address");
        WebElement present = driver.findElement(By.xpath("//textarea[@id='permanentAddress']"));
        present.sendKeys("Testing Permanent Address");
        MyFunc.Wait(2);
        WebElement btn = driver.findElement(By.xpath("//button[@id='submit']"));
        btn.click();
        WebElement fullTimeout = driver.findElement(By.xpath("//p[@id='name']"));
        System.out.println(fullTimeout.getText());
        WebElement emilOut = driver.findElement(By.xpath("//p[@id='email']"));
        System.out.println(emilOut.getText());
        Assert.assertTrue(!fullTimeout.getText().equals(null));
        Assert.assertTrue(!emilOut.getText().equals(null));
        bekleVeKapat();
    }
}
