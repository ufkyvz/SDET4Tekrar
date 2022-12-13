package Utility;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.logging.Level;
import java.util.logging.Logger;

public class BaseDriver {

    public static WebDriver driver;
    public static WebDriverWait wait;


    static {

        // ilk adımda çalışan kod kısmı
        KalanOncekileriKapat();

        Logger logger= Logger.getLogger(""); // sisteme ait bütün  logları üreten objeye/servise ulaştım ""
        logger.setLevel(Level.SEVERE); // Sadece Error ları göster

        // ayarları set etme -> setProperty
        System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY, "true");
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        driver = new ChromeDriver(); // web sayfasını kontrol eden görevli

        //driver.manage().window().setPosition(new Point(2000,0));

        driver.manage().window().maximize(); // Ekranı max yapıyor
        driver.manage().deleteAllCookies(); // sitenin bilgisayarda yaptığı ayarlar siliniyor, sayfa başlangıç ayarlarına dönüyor

        Duration dr= Duration.ofSeconds(30);
        driver.manage().timeouts().pageLoadTimeout(dr); // Sadece tüm sayfanın kodlarının bilgisayarınıza inmesi süresiyle ilgili
        // bu eklenmezse Selenium sayfa yüklenene kadar (sonsuza) bekler. : 30 sn süresince sayfanın yüklenmesini bekle yüklenmezse hata ver.

        driver.manage().timeouts().implicitlyWait(dr); // Bütün webelementlerin element bazında, elemente özel işlem yapılmadan önce
        // hazır hale gelmesi için mühlet yani süre.

        // JavascriptExecutor js = (JavascriptExecutor) driver; // JavaScript komutlarını çalıştırmak için js değişkeni tanımlandı.

        wait= new WebDriverWait(driver, Duration.ofSeconds(30));

    }

    public static void KalanOncekileriKapat() {

        try {
            Runtime.getRuntime().exec("taskkill /F /IM chromedriver.exe /T");
        } catch (Exception ignored) {

        }
    }

    public static void driverBekleKapat () {

        MyFunc.Bekle(5);
        driver.quit();

    }

    // Action Activator
    public static Actions actions;
    static {
        actions=new Actions(driver);

    }

    // JavaScript Activator
    public static JavascriptExecutor js;
    static {
        js= (JavascriptExecutor) driver;

    }

//    // Select Activator
//    public static Select select;
//    static  {
//        select= (Select) driver;
//    }

}