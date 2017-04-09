package ohtu;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tester {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "chromedriver");
        WebDriver driver = new ChromeDriver();
        

        driver.get("http://localhost:4567");
        WebElement element = driver.findElement(By.linkText("login"));
        element.click();
        sleep(2);
        
        
        
        fillLoginForm(driver, "pekka", "akkep", element);
        element = driver.findElement(By.linkText("logout"));
        element.click();
        
        element = driver.findElement(By.linkText("login"));
        element.click();
        
        fillLoginForm(driver, "pekka", "akk", element);
        
        
        
        fillLoginForm(driver, "akvaario", "akkep", element);
        fillNewUserForm(driver, "rapuihminen", "salasana", element);
        sleep(3);

        driver.quit();
    }

    private static void sleep(int n) {
        try {
            Thread.sleep(n * 1000);
        } catch (Exception e) {
        }
    }

    public static void fillLoginForm(WebDriver driver, String username, String password, WebElement element) {
        

        sleep(2);

        element = driver.findElement(By.name("username"));
        element.sendKeys(username);
        element = driver.findElement(By.name("password"));
        element.sendKeys(password);
        element = driver.findElement(By.name("login"));

        sleep(2);
        element.submit();
        
        sleep(2);
        
  
    }

    public static void fillNewUserForm(WebDriver driver, String username, String password, WebElement element) {
        element = driver.findElement(By.linkText("back to home"));
        element.click();
        
        element = driver.findElement(By.linkText("register new user"));
        element.click();

        sleep(2);

        element = driver.findElement(By.name("username"));
        element.sendKeys(username);
        element = driver.findElement(By.name("password"));
        element.sendKeys(password);
        element = driver.findElement(By.name("passwordConfirmation"));
        element.sendKeys(password);
        element = driver.findElement(By.name("signup"));

        sleep(2);
        element.submit();
        
        sleep(2);
        
        element = driver.findElement(By.linkText("continue to application mainpage"));
        element.click();
        sleep(2);
        
        
        
        
    }
}
