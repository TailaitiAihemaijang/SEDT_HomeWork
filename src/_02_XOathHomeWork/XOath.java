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
    @Test
    public void test4(){
        driver.get("https://testpages.herokuapp.com/styled/index.html");
        WebElement culctor = driver.findElement(By.xpath("//a[@id='calculatetest']"));
        culctor.click();
        WebElement num1 = driver.findElement(By.xpath("//input[@id='number1']"));
        num1.sendKeys("40");
        WebElement num2 = driver.findElement(By.xpath("//input[@id='number2']"));
        num2.sendKeys("23");
        WebElement btn = driver.findElement(By.xpath("//input[@id='calculate']"));
        btn.click();
        WebElement show = driver.findElement(By.xpath("//span[@id='answer']"));
        System.out.println(show.getText());
        bekleVeKapat();
    }
    @Test
    public void test5(){
        driver.get("https://testpages.herokuapp.com/styled/index.html");
        WebElement fakeAlerts = driver.findElement(By.xpath("//a[@id='fakealerttest']"));
        fakeAlerts.click();
        WebElement showAlert = driver.findElement(By.xpath("//input[@id='fakealert']"));
        showAlert.click();
        MyFunc.Wait(2);
        WebElement ok = driver.findElement(By.xpath("//button[@id='dialog-ok']"));
        ok.click();
        MyFunc.Wait(2);
        bekleVeKapat();
    }
    @Test
    public void test6(){
        driver.get("https://testpages.herokuapp.com/styled/index.html");
        WebElement fakeAlerts = driver.findElement(By.xpath("//a[@id='fakealerttest']"));
        fakeAlerts.click();
        MyFunc.Wait(2);
        WebElement showAlert = driver.findElement(By.xpath("//input[@id='modaldialog']"));
        showAlert.click();
        MyFunc.Wait(2);
        WebElement ok = driver.findElement(By.xpath("//button[@id='dialog-ok']"));
        ok.click();
        MyFunc.Wait(2);
        bekleVeKapat();
    }
}
