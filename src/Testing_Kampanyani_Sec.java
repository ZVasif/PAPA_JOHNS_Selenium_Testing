import Utils.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class Testing_Kampanyani_Sec extends BaseStaticDriver {
    public static void main(String[] args) {

        driver.get("https://www.papajohns.com");

        WebElement country=driver.findElement(By.cssSelector("[alt=\"Turkey\"]"));
        country.click();
        WebElement dahasonra= driver.findElement(By.cssSelector("[id=onesignal-slidedown-cancel-button]"));
        dahasonra.click();
        WebElement dahasonra2= driver.findElement(By.cssSelector("[id=denyNotifications]"));
        dahasonra2.click();
        WebElement kamSec= driver.findElement(By.cssSelector("[alt=\"Restoran Seç\"]"));
        kamSec.click();
        List<WebElement> ozelKamp=driver.findElements(By.cssSelector("[id^='9afebc804b'] [class='row']"));

        for (WebElement kampaniya:ozelKamp){
            System.out.println(kampaniya.getText()+"\n***************");
        }

//        int mehsulSayi=ozelKamp.size();
//        System.out.println("mehsulSayi = " + mehsulSayi);

        if (ozelKamp.size()>3){
            System.out.println((ozelKamp.size()-3)+" ədəd yeni məhsul əlavə olunub.");
        } else if (ozelKamp.size()<3) {
            System.out.println((ozelKamp.size()-3)+" ədəd məhsul kampaniyadan çıxarılıb.");
        }else System.out.println("Kampaniyaya yeni məhsul əlavə olunmayıb.");

        closeWindow();
    }
}
