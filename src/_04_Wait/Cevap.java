package _04_Wait;

import Utility.BaseDriver;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Random;

public class Cevap extends BaseDriver {
    @Test
    public void Test() {
        Random random = new Random();
        int num1 = random.nextInt(100);
        int num2 = random.nextInt(100);
        String Add = Integer.toString(num1+num2);
        String Subtract = Integer.toString(num1-num2);
        String Multiply = Integer.toString(num1 * num2);
        String Divide = Double.toString(num1 / (double)num2);
        String strNum1 = Integer.toString(num1);
        String strNum2 = Integer.toString(num2);
        driver.get("https://testsheepnz.github.io/BasicCalculator.html");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        WebElement firsNum = driver.findElement(By.id("number1Field"));
        firsNum.sendKeys(strNum1);
        WebElement seconNum = driver.findElement(By.id("number2Field"));
        seconNum.sendKeys(strNum2);
        WebElement serc = driver.findElement(By.id("selectOperationDropdown"));
        Select menu = new Select(serc);
        menu.selectByValue("3");
        WebElement btn = driver.findElement(By.id("calculateButton"));
        btn.click();
        WebElement anser =
        wait.until(ExpectedConditions.elementToBeClickable(By.id("numberAnswerField")));
        Assert.assertTrue(Divide.contains(anser.getText()));
        bekleVeKapat();

    }
}
