import Utils.BaseStaticDriver;
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

        WebElement mantar= driver.findElement(By.id("pds_product_addon69"));
        Actions actions=new Actions(driver);
        Action action=actions.moveToElement(mantar).click().build();
        action.perform();

        //action da xeta vermedi, amma click de etmedi

//        WebElement extraSecim=driver.findElement(By.linkText("Seçim yap/Kapat..."));
//        extraSecim.click();
//        WebElement extra1= driver.findElement(By.cssSelector("[value=\"84\"]"));
//        extra1.click();
//        WebElement extra2= driver.findElement(By.cssSelector("[value=\"1353\"]"));
//        extra2.click();
//        WebElement extra3= driver.findElement(By.cssSelector("[value=\"129\"]"));
//        extra3.click();





        closeWindow();




    }
}
