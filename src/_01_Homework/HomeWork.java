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

    @Test
    public void test2() {
        driver.get("https://demo.applitools.com/");
        WebElement userName = driver.findElement(By.cssSelector("[id='username']"));
        userName.sendKeys("ttechno@gmail.com");
        WebElement password = driver.findElement(By.cssSelector("[id='password']"));
        password.sendKeys("techno123.");
        WebElement btn = driver.findElement(By.cssSelector("[id='log-in']"));
        btn.click();
        WebElement text = driver.findElement(By.cssSelector("[id='time']"));
        String a = text.getText();
        Assert.assertTrue(a.contains("Your nearest branch closes in: 30m 5s"));
        bekleVeKapat();
    }
    @Test
    public void test3(){
        driver.get("https://www.snapdeal.com/");
        WebElement serch = driver.findElement(By.cssSelector("[id='inputValEnter']"));
        serch.sendKeys("teddy bear");
        WebElement btn = driver.findElement(By.cssSelector("button>*:nth-child(1)>*"));
        btn.click();
        WebElement txet = driver.findElement(By.cssSelector("[style='color: #212121; font-weight: normal']"));
        System.out.println(txet.getText());
        Assert.assertTrue(txet.getText().contains("We've got 298 results for teddy bear"));
        bekleVeKapat();
    }
    @Test
    public void test4(){
        driver.get("https://testpages.herokuapp.com/styled/index.html");
        WebElement culctor = driver.findElement(By.cssSelector("[id='calculatetest']"));
        culctor.click();
        WebElement num1 = driver.findElement(By.cssSelector("[id='number1']"));
        num1.sendKeys("40");
        WebElement num2 = driver.findElement(By.cssSelector("[id='number2']"));
        num2.sendKeys("23");
        WebElement btn = driver.findElement(By.cssSelector("[id='calculate']"));
        btn.click();
        WebElement show = driver.findElement(By.cssSelector("[id='answer']"));
        System.out.println(show.getText());
        bekleVeKapat();
    }
    @Test
    public void test5(){
        driver.get("https://testpages.herokuapp.com/styled/index.html");
        WebElement fakeAlerts = driver.findElement(By.cssSelector("[id='fakealerttest']"));
        fakeAlerts.click();
        WebElement showAlert = driver.findElement(By.cssSelector("[id='fakealert']"));
        showAlert.click();
        WebElement ok = driver.findElement(By.cssSelector("[id='dialog-ok']"));
        ok.click();
        bekleVeKapat();
    }
//[id='modaldialog']
    @Test
    public void test6(){
        driver.get("https://testpages.herokuapp.com/styled/index.html");
        WebElement fakeAlerts = driver.findElement(By.cssSelector("[id='fakealerttest']"));
        fakeAlerts.click();
        MyFunc.Wait(2);
        WebElement showAlert = driver.findElement(By.cssSelector("[id='modaldialog']"));
        showAlert.click();
        MyFunc.Wait(2);
        WebElement ok = driver.findElement(By.cssSelector("[id='dialog-ok']"));
        ok.click();
        MyFunc.Wait(2);
        bekleVeKapat();
    }

}
