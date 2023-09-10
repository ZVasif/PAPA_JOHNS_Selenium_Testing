import Utils.BaseStaticDriver;
import org.testng.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class Testing_Pizza_section extends BaseStaticDriver {
    public static void main(String[] args){
        driver.get("https://www.papajohns.com");

        WebElement country=driver.findElement(By.cssSelector("[alt=\"Turkey\"]"));
        country.click();
        WebElement dahasonra= driver.findElement(By.cssSelector("[id=onesignal-slidedown-cancel-button]"));
        dahasonra.click();
        WebElement dahasonra2= driver.findElement(By.cssSelector("[id=denyNotifications]"));
        dahasonra2.click();
        WebElement pizza= driver.findElement(By.cssSelector("[group=\"pizzalar\"]"));
        pizza.click();
        WebElement bahceKeyfi=driver.findElement(By.linkText("Bahçe Keyfi"));
        bahceKeyfi.click();
        WebElement sebeteEkle= driver.findElement(By.xpath("//*[text()='SEPETE EKLE']"));
        sebeteEkle.click();

        WebElement menu=driver.findElement(By.cssSelector("[id='product']"));
        Select select=new Select(menu);
        select.selectByValue("199");

        WebElement mantar= driver.findElement(By.xpath("//*[text()='Mantar']"));
        Actions actions=new Actions(driver);
        Action action=actions.moveToElement(mantar).click().build();
        action.perform();


        WebElement extraSecim=driver.findElement(By.linkText("Seçim yap/Kapat..."));
        extraSecim.click();
        WebElement extra1= driver.findElement(By.xpath("(//label[contains(@class,'col-sm-6')])[2]"));
        extra1.click();
        WebElement extra2= driver.findElement(By.xpath("(//label[contains(@class,'col-sm-6')])[13]"));
        extra2.click();
        WebElement extra3= driver.findElement(By.xpath("(//label[contains(@class,'col-sm-6')])[28]"));
        extra3.click();
        WebElement sebeteEkle2=driver.findElement(By.cssSelector("[class$=\"btn-red\"]"));
        sebeteEkle2.click();

        WebElement ok=driver.findElement(By.xpath("//*[@class=\"swal2-buttonswrapper\"]/button"));
        if (ok.isDisplayed()){
            ok.click();
        }

//        do {
//            ok.click();
//        }while (!ok.isEnabled());
        WebElement sebeteGit= driver.findElement(By.linkText("SEPETE GİT"));
        sebeteGit.click();
        WebElement urunuSil= driver.findElement(By.xpath("(//*[@class='removeItem'])[2]"));
        urunuSil.click();
        WebElement bosmu=driver.findElement(By.xpath("(//*[contains(@class,'color_brown')])[4]"));

        Assert.assertTrue(bosmu.getText().toLowerCase().contains("bulunmuyor!"));





        closeWindow();




    }
}
