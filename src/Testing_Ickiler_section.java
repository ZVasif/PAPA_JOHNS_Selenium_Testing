import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static Utils.BaseStaticDriver.*;

public class Testing_Ickiler_section {
    public static void main(String[] args) {
        driver.get("https://www.papajohns.com");

        WebElement country=driver.findElement(By.cssSelector("[alt=\"Turkey\"]"));
        country.click();
        //waitLocator(5);
        WebElement dahasonra= driver.findElement(By.cssSelector("[id=onesignal-slidedown-cancel-button]"));
        dahasonra.click();
        WebElement dahasonra2= driver.findElement(By.cssSelector("[id=denyNotifications]"));
        dahasonra2.click();
        WebElement ickiler= driver.findElement(By.cssSelector("[id='bs-example-navbar-collapse-1']"));
        ickiler.click();

        closeWindow();
    }
}
