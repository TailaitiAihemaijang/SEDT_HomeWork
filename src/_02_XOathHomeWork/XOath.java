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
    @Test
    public void test2(){
        driver.get("https://demo.applitools.com/");
        WebElement userName = driver.findElement(By.xpath("//input[@id='username']"));
        userName.sendKeys("ttechno@gmail.com");
        WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
        password.sendKeys("techno123.");
        WebElement btn = driver.findElement(By.xpath("//a[@id='log-in']"));
        btn.click();
        WebElement text = driver.findElement(By.xpath("//h6[@id='time']"));
        String a = text.getText();
        Assert.assertTrue(a.contains("Your nearest branch closes in: 30m 5s"));
        bekleVeKapat();
    }
    @Test
    public void test3(){
        driver.get("https://www.snapdeal.com/");
        WebElement serch = driver.findElement(By.xpath("//input[@id='inputValEnter']"));
        serch.sendKeys("teddy bear");
        WebElement btn = driver.findElement(By.xpath("//i[@class='sd-icon sd-icon-search-under-catagory lfloat']"));
        btn.click();
        WebElement txet = driver.findElement(By.xpath("//span[@class='nnn']"));
        System.out.println(txet.getText());
        Assert.assertTrue(txet.getText().contains("We've got 298 results for teddy bear"));
        bekleVeKapat();
    }
}
