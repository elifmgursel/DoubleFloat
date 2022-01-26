

    import org.junit.After;
    import org.junit.Before;
    import org.junit.Test;
    import org.openqa.selenium.WebDriver;
    import org.openqa.selenium.chrome.ChromeDriver;
    import org.openqa.selenium.remote.DesiredCapabilities;
    import java.util.concurrent.TimeUnit;
    import static java.lang.Thread.sleep;
    import static org.openqa.selenium.By.*;

    public class Login {

        protected WebDriver driver;
        public static String LoginUrl = "https://wwww.instagram.com/";

        @Before
        public void setUp() {
            try {
                DesiredCapabilities capabilities = DesiredCapabilities.chrome();
                System.setProperty("webdriver.chrome.driver", "C:\\javademos\\Otomasyon\\ChromeDriver\\chromedriver.exe");
                driver = new ChromeDriver(capabilities);

                driver.manage().window().maximize();
                driver.manage().deleteAllCookies();

                driver.manage().timeouts().pageLoadTimeout(25, TimeUnit.SECONDS);
                driver.manage().timeouts().setScriptTimeout(30, TimeUnit.SECONDS);
                driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

            } catch (Exception e) {
                e.printStackTrace();
            }

        }

        @Test

            public void login() {
                 try {
                     driver.get(LoginUrl);
        }

}
