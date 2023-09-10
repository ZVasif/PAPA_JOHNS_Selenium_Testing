import Utils.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

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
    }
}
