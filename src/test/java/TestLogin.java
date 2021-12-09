import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestLogin {
    private WebDriver driver;
    private PageObject page;

    @Before
    public void bootUp(){
        WebDriverManager.chromedriver().setup();
        this.driver = new ChromeDriver();
        driver.get("http://academico.fabrica.unipe.br:8094/accounts/login/");
        this.page = new PageObject(driver);
    }
    @Test
        public void login(){
        page.writeEmail("walace.bonfim@fabrica.unipe.br");
        page.writeSenha("wsb12345");
        page.Submit();

    }
}
