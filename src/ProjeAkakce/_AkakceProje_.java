package ProjeAkakce;


import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)

public class _AkakceProje_ extends BaseDriver {

    @Test
    public void Test1() {

        driver.get("https://www.akakce.com/");

        WebElement siteImage= driver.findElement(By.cssSelector("a[title='Anasayfaya gitmek için tıklayın']"));
        MyFunc.Bekle(2);

        Assert.assertTrue("Site Açılmadı",siteImage.isDisplayed());

        WebElement openAccount= driver.findElement(By.linkText("Hesap Aç"));
        openAccount.click();
        MyFunc.Bekle(2);

        WebElement name=driver.findElement(By.id("rnufn"));
        name.sendKeys("TestName");
        MyFunc.Bekle(2);

        WebElement surname=driver.findElement(By.id("rnufs"));
        surname.sendKeys("TestLastName");
        MyFunc.Bekle(2);

        WebElement email=driver.findElement(By.id("rnufe1"));
        email.sendKeys("test@testmaill.com");
        MyFunc.Bekle(2);

        WebElement email2=driver.findElement(By.id("rnufe2"));
        email2.sendKeys("test@testmaill.com");
        MyFunc.Bekle(2);

        WebElement password=driver.findElement(By.id("rnufp1"));
        password.sendKeys("Abc123123!");
        MyFunc.Bekle(2);

        WebElement password2=driver.findElement(By.id("rnufp2"));
        password2.sendKeys("Abc123123");
        MyFunc.Bekle(2);

        WebElement gender= driver.findElement(By.id("rngm"));
        gender.click();
        MyFunc.Bekle(1);

        WebElement menuIl= driver.findElement(By.id("locpr"));
        Select city= new Select(menuIl);
        city.selectByValue("85");
        MyFunc.Bekle(1);

        WebElement menuProvince= driver.findElement(By.id("locds"));
        Select province= new Select(menuProvince);
        province.selectByValue("453");

        WebElement bdDay= driver.findElement(By.id("bd"));
        Select day= new Select(bdDay);
        day.selectByValue("9");

        WebElement bdMonth= driver.findElement(By.id("bm"));
        Select month= new Select(bdMonth);
        month.selectByValue("8");

        WebElement bdYear= driver.findElement(By.id("by"));
        Select year= new Select(bdYear);
        year.selectByValue("1998");

        WebElement button1= driver.findElement(By.cssSelector("label>input[id='rnufpca']"));
        button1.click();

        WebElement button2= driver.findElement(By.cssSelector("input[id='rnufnee']"));
        button2.click();

        WebElement openAnAccount= driver.findElement(By.cssSelector("input[id='rfb']"));
        openAnAccount.click();

    }

    @Test
    public void Test2() {



    }

}