package _03_ActonDragDrop;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class Answer extends BaseDriver {
    @Test
    public void Test1() {
        driver.get("http://dhtmlgoodies.com/scripts/drag-drop-quiz/drag-drop-quiz-d2.html");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        List<WebElement> questions = driver.findElements(By.className("destinationBox"));
        Actions actions = new Actions(driver);
        List<WebElement> answers = driver.findElements(By.cssSelector("div[id='answerDiv'] [class='dragDropSmallBox']"));

        for (int i = 0; i < answers.size(); i++) {
            WebElement answer = answers.get(i);
            for (int j = 0; j < questions.size(); j++) {
                WebElement question = questions.get(j);
                if (!question.getAttribute("class").contains("correctAnswer")) {
                    actions.moveToElement(answer).clickAndHold().build().perform();
                    MyFunc.Wait(2);
                    actions.moveToElement(question).release().build().perform();

                    if (answer.getAttribute("class").contains("correctAnswer")) {
                        break;
                    } else if (answer.getAttribute("class").contains("wrongAnswer")) {
                        continue;
                    }
                    actions.moveToElement(answer).clickAndHold().build().perform();
                    MyFunc.Wait(2);
                    actions.moveToElement(question).release().build().perform();
                } else break;


            }
        }
        bekleVeKapat();
    }

    @Test
    public void Test2() {
        driver.get("http://dhtmlgoodies.com/scripts/drag-drop-nodes/drag-drop-nodes.html");
        Actions actions = new Actions(driver);
        List<WebElement> sutudetns = driver.findElements(By.id("allItems"));
        WebElement box1 = driver.findElement(By.id("box1"));
        WebElement box2 = driver.findElement(By.id("box2"));
        WebElement box3 = driver.findElement(By.id("box3"));
        WebElement box4 = driver.findElement(By.id("box4"));
        WebElement box5 = driver.findElement(By.id("box5"));
        for (WebElement student : sutudetns) {

            for (int i = 1; i < 5; i++) {
                actions.moveToElement(student).clickAndHold().build().perform();
                MyFunc.Wait(1);
                actions.moveToElement(box1).release().build().perform();
            }
            for (int i = 1; i < 5; i++) {
                actions.moveToElement(student).clickAndHold().build().perform();
                MyFunc.Wait(1);
                actions.moveToElement(box2).release().build().perform();
            }
            for (int i = 1; i < 5; i++){
                actions.moveToElement(student).clickAndHold().build().perform();
                MyFunc.Wait(1);
                actions.moveToElement(box3).release().build().perform();
            }
            for (int i = 1; i < 4; i++) {
                actions.moveToElement(student).clickAndHold().build().perform();
                MyFunc.Wait(1);
                actions.moveToElement(box4).release().build().perform();
            }
            for (int i = 1; i < 7; i++) {
                actions.moveToElement(student).clickAndHold().build().perform();
                MyFunc.Wait(1);
                actions.moveToElement(box5).release().build().perform();
            }

        }
        bekleVeKapat();
    }


}
