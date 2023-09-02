import Utils.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Testing_Pizza_section extends BaseStaticDriver {
    public static void main(String[] args){
        driver.get("https://www.papajohns.com");

        WebElement country=driver.findElement(By.cssSelector("[alt=\"Turkey\"]"));
        country.click();
        waitLocator(5);
        WebElement pizza= driver.findElement(By.xpath("(//*[@class=\"wrap\"]/ul/li)[3]"));
        pizza.click();



        closeWindow();

    }
}
