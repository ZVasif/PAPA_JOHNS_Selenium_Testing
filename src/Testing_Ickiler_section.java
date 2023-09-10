import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import static Utils.BaseStaticDriver.*;

public class Testing_Ickiler_section {
    public static void main(String[] args) {
        driver.get("https://www.papajohns.com");

        WebElement country=driver.findElement(By.cssSelector("[alt=\"Turkey\"]"));
        country.click();
        WebElement dahasonra= driver.findElement(By.cssSelector("[id=onesignal-slidedown-cancel-button]"));
        dahasonra.click();
        WebElement dahasonra2= driver.findElement(By.cssSelector("[id=denyNotifications]"));
        dahasonra2.click();
        WebElement ickiler= driver.findElement(By.cssSelector("[group=\"icecekler\"]"));
        ickiler.click();
        WebElement nescafe=driver.findElement(By.linkText("Nescafe Xpress Çikolatalı"));
        nescafe.click();
        WebElement sebeteEkle= driver.findElement(By.cssSelector("[rel=dialogBox]"));
        sebeteEkle.click();
        WebElement sebet= driver.findElement(By.cssSelector("[class='btn btn-red']"));
        sebet.click();
        WebElement sebeteGit= driver.findElement(By.linkText("SEPETE GİT"));
        sebeteGit.click();
        WebElement sebetdenSil= driver.findElement(By.xpath("(//*[@removetarget='gridrow-0'])[2]"));
        sebetdenSil.click();
        WebElement bosmu=driver.findElement(By.xpath("(//*[contains(@class,'color_brown')])[4]"));

        Assert.assertTrue(bosmu.getText().toLowerCase().contains("bulunmuyor!"));


        closeWindow();
    }
}
//[class='col-xs-12 no-paddings']>*:nth-child(1)
