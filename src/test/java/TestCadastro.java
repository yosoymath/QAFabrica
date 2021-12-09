import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCadastro {
    private WebDriver driver;
    private PageObjectCadastro page;
    private PageObject page1;

    @Before
    public void bootUp(){
        WebDriverManager.chromedriver().setup();
        this.driver = new ChromeDriver();
        driver.get("http://academico.fabrica.unipe.br:8094/accounts/login/");
        this.page = new PageObjectCadastro(driver);
        this.page1 = new PageObject(driver);
}
    @Test
    public void login(){
        page1.writeEmail("walace.bonfim@fabrica.unipe.br");
        page1.writeSenha("wsb12345");
        page1.Submit();
        page.realizarCadastro();
        page.cadastrarUsuario();
        page.botaoRegistrar();
        page.email();
        page.nome();
        page.senha();
        page.confSenha();
        page.confirm();
    }
}
