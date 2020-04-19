import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class simulateKeystrokes {
    static WebDriver driver;

    public static void main(String[] args) {
        System.setProperty("webdriver.gecko.driver", "C:\\Users\\nazhivka.by\\IdeaProjects\\testselenium\\drivers\\geckodriver.exe");
        driver=new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://ru.wikipedia.org/");
        WebElement searchInput=driver.findElement(By.xpath("//input[@id='searchInput']"));
        searchInput.sendKeys("I'm a grand Man");
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        searchInput.sendKeys(Keys.chord(Keys.CONTROL, "a"));
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        searchInput.sendKeys(Keys.chord(Keys.CONTROL, "x"));
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        searchInput.sendKeys(Keys.chord(Keys.SHIFT, "i'm a grand man"));
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        searchInput.sendKeys(Keys.ENTER);
        driver.quit();

    }
}
