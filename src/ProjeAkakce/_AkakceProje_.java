package ProjeAkakce;


import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)

public class _AkakceProje_ extends BaseDriver {

    @Test
    public void Test1() {

        driver.get("https://www.akakce.com/");

        WebElement siteImage= driver.findElement(By.cssSelector("a[title='Anasayfaya gitmek için tıklayın']"));
        MyFunc.Bekle(2);

        Assert.assertTrue("Site Açılmadı",siteImage.isDisplayed());

        driver.quit();




    }

}
