import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class PageObject {
    private WebDriver driver;

    public PageObject (WebDriver driver){
        this.driver = driver;
    }
    public void writeEmail(String email){
        driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys(email);
    }
    public void writeSenha(String password){
        driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys(password);
    }
    public void Submit(){
        driver.findElement(By.xpath("/html/body/div/div/div/div/div/form/button")).click();
    }
}
