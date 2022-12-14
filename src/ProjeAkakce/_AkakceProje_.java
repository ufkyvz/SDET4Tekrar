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
        MyFunc.Bekle(1);

        WebElement surname=driver.findElement(By.id("rnufs"));
        surname.sendKeys("TestLastName");
        MyFunc.Bekle(1);

        WebElement email=driver.findElement(By.id("rnufe1"));
        email.sendKeys("test@testmaill.com");
        MyFunc.Bekle(1);

        WebElement email2=driver.findElement(By.id("rnufe2"));
        email2.sendKeys("test@testmaill.com");
        MyFunc.Bekle(1);

        WebElement password=driver.findElement(By.id("rnufp1"));
        password.sendKeys("Abc123123!");
        MyFunc.Bekle(1);

        WebElement password2=driver.findElement(By.id("rnufp2"));
        password2.sendKeys("Abc123123!");
        MyFunc.Bekle(1);

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
        MyFunc.Bekle(1);

        WebElement bdDay= driver.findElement(By.id("bd"));
        Select day= new Select(bdDay);
        day.selectByValue("9");
        MyFunc.Bekle(1);

        WebElement bdMonth= driver.findElement(By.id("bm"));
        Select month= new Select(bdMonth);
        month.selectByValue("8");
        MyFunc.Bekle(1);

        WebElement bdYear= driver.findElement(By.id("by"));
        Select year= new Select(bdYear);
        year.selectByValue("1998");
        MyFunc.Bekle(1);

        WebElement button1= driver.findElement(By.cssSelector("label>input[id='rnufpca']"));
        button1.click();
        MyFunc.Bekle(1);

        WebElement button2= driver.findElement(By.cssSelector("input[id='rnufnee']"));
        button2.click();
        MyFunc.Bekle(1);

        WebElement openAnAccount= driver.findElement(By.cssSelector("input[id='rfb']"));
        openAnAccount.click();
        MyFunc.Bekle(1);

        WebElement accountAssert= driver.findElement(By.linkText("TestName"));
        MyFunc.Bekle(2);
        Assert.assertTrue("SingIn Failed",accountAssert.isDisplayed());

    }

    @Test
    public void Test2() {

        loginAkakce();

        WebElement loginCheck= driver.findElement(By.linkText("TestName"));
        Assert.assertTrue("Login Failed", loginCheck.getText().contains("TestName"));
        MyFunc.Bekle(1);

        WebElement account= driver.findElement(By.linkText("TestName"));
        account.click();
        MyFunc.Bekle(1);

        WebElement myOrder= driver.findElement(By.xpath("//li[@class='order first']/a[1]"));
        myOrder.click();
        MyFunc.Bekle(1);

        WebElement orderCheck= driver.findElement(By.cssSelector("div[class='no-record']"));
        Assert.assertTrue("Order Available", orderCheck.getText().contains("Kayıtlı siparişiniz bulunmuyor."));
        MyFunc.Bekle(2);

    }



    public void loginAkakce() {

        driver.navigate().to("https://www.akakce.com/");

        WebElement login= driver.findElement(By.linkText("Giriş Yap"));
        login.click();
        MyFunc.Bekle(1);

        WebElement loginEmail= driver.findElement(By.id("life"));
        loginEmail.sendKeys("test@testmaill.com");
        MyFunc.Bekle(1);

        WebElement loginPassword= driver.findElement(By.cssSelector("input[class='t'][id='lifp']"));
        loginPassword.sendKeys("Abc123123!");
        MyFunc.Bekle(1);

        WebElement loginClick= driver.findElement(By.cssSelector("input[id='lfb']"));
        loginClick.click();
        MyFunc.Bekle(1);

    }
}