/*Ruslan Riabokoniev*/
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;



public class TestSelenium {


    @Test

    public static void main(String[] args){


        System.setProperty("webdriver.gecko.driver","C:\\geckodriver\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("http://testoutlivecontent.blob.core.windows.net/secpro2017v6-en-us/en-us/sims/windows/xsimengine.html?simpackage=windows&simfile=email_social_eng_secpro6.html&dev=true&automation=true");
        driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);



        driver.findElement(By.id("MailItem.Grid.cbCheckBox")).click();
        driver.findElement(By.id("tbSender")).click();
        driver.findElement(By.xpath("//span[contains(text(), 'Delete')]")).click();

        driver.findElement(By.id("cContentControl.cpContentPresenter.MailItem.Grid.cbCheckBox")).click();
        driver.findElement(By.id("cContentControl.cpContentPresenter.MailItem.Grid.tbSender")).click();
        driver.findElement(By.xpath("//span[contains(text(), 'Delete')]")).click();

        driver.findElement(By.id("InnerElement.ItemsPresenter.StackPanel.ListBoxItem2.Grid.cContentControl.cpContentPresenter.MailItem.Grid.cbCheckBox")).click();
        driver.findElement(By.id("InnerElement.ItemsPresenter.StackPanel.ListBoxItem2.Grid.cContentControl.cpContentPresenter.MailItem.Grid.tbSender")).click();
        driver.findElement(By.xpath("//span[contains(text(), 'Delete')]")).click();

        driver.findElement(By.id("InnerElement.ItemsPresenter.StackPanel.ListBoxItem3.Grid.cContentControl.cpContentPresenter.MailItem.Grid.cbCheckBox")).click();
        driver.findElement(By.id("InnerElement.ItemsPresenter.StackPanel.ListBoxItem3.Grid.cContentControl.cpContentPresenter.MailItem.Grid.tbSender")).click();
        driver.findElement(By.xpath("//span[contains(text(), 'Delete')]")).click();

        driver.findElement(By.id("InnerElement.ItemsPresenter.StackPanel.ListBoxItem4.Grid.cContentControl.cpContentPresenter.MailItem.Grid.cbCheckBox")).click();
        driver.findElement(By.id("InnerElement.ItemsPresenter.StackPanel.ListBoxItem4.Grid.cContentControl.cpContentPresenter.MailItem.Grid.tbSender")).click();
        driver.findElement(By.xpath("//span[contains(text(), 'Delete')]")).click();

        driver.findElement(By.id("InnerElement.ItemsPresenter.StackPanel.ListBoxItem5.Grid.cContentControl.cpContentPresenter.MailItem.Grid.cbCheckBox")).click();
        driver.findElement(By.id("InnerElement.ItemsPresenter.StackPanel.ListBoxItem5.Grid.cContentControl.cpContentPresenter.MailItem.Grid.tbSender")).click();
        driver.findElement(By.xpath("//span[contains(text(), 'Delete')]")).click();

        driver.findElement(By.id("InnerElement.ItemsPresenter.StackPanel.ListBoxItem6.Grid.cContentControl.cpContentPresenter.MailItem.Grid.cbCheckBox")).click();
        driver.findElement(By.id("InnerElement.ItemsPresenter.StackPanel.ListBoxItem6.Grid.cContentControl.cpContentPresenter.MailItem.Grid.tbSender")).click();
        driver.findElement(By.xpath("//span[contains(text(), 'Delete')]")).click();

        driver.findElement(By.id("InnerElement.ItemsPresenter.StackPanel.ListBoxItem8.Grid.cContentControl.cpContentPresenter.MailItem.Grid.cbCheckBox")).click();
        driver.findElement(By.id("InnerElement.ItemsPresenter.StackPanel.ListBoxItem8.Grid.cContentControl.cpContentPresenter.MailItem.Grid.tbSender")).click();
        driver.findElement(By.xpath("//span[contains(text(), 'Delete')]")).click();

        driver.findElement(By.id("bDone.Grid.contentPresenter.TextBlock")).click();


        String text = driver.findElement(By.xpath("//div[contains(text(), 'Your Score: ')]")).getText();

        System.out.println(text + "\nGood Job!");

        if (text.contains("Your Score: 8 of 8 (100%)"))
        {
            System.out.println("Successfully completed");
            String expectedMessage = "The test passed Successfully!";
           driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
            driver.findElement(By.id("bDone.Grid.contentPresenter.TextBlock")).click();
            driver.quit();
            Assert.assertEquals(expectedMessage, text);
        }
         else
            {
            System.out.println("Fail");
                String expectedMessage =  driver.findElement(By.xpath("//div[contains(text(), 'Your Score: ')]")).getText();;
                driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
                driver.findElement(By.id("bDone.Grid.contentPresenter.TextBlock")).click();
                driver.quit();
                Assert.assertEquals(expectedMessage, text);
            }

    }
}
