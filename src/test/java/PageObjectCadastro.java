import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PageObjectCadastro {
    private WebDriver driver;

    public PageObjectCadastro (WebDriver driver){
        this.driver = driver;
    }
    public void realizarCadastro(){
        driver.findElement(By.xpath("/html/body/div[2]/div[1]")).click();
    }
    public void cadastrarUsuario(){
        driver.findElement(By.xpath("/html/body/div[2]/div[3]")).click();
    }
    public void botaoRegistrar(){
        driver.findElement(By.xpath("/html/body/div[2]/section/div/a[1]/button")).click();
    }
    public void email(){
        driver.findElement(By.xpath("//*[@id=\"exampleInputEmail1\"]")).sendKeys("matheusmat170@gmail.com");
    }
    public void nome(){
        driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("Matheus Fernandes");
    }
    public void senha(){
        //Apenas senhas com mais de 8 caracteres
        //Aponta "essa senha é muito comum" para uma senha fácil
        driver.findElement(By.xpath("/html/body/div[2]/div/form/div/div[3]/div/div/input")).sendKeys("r02mm2926");
    }
    public void confSenha(){
        driver.findElement(By.xpath("/html/body/div[2]/div/form/div/div[4]/div/div/input")).sendKeys("r02mm2926");
    }
    public void confirm(){
        driver.findElement(By.xpath("/html/body/div[2]/div/form/button")).click();
    }
}
