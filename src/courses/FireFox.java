package courses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FireFox {
    public static void main(String[] args) {
        String baseUrl="https://courses.ultimateqa.com/users/sign_in";
        System.setProperty("webdriver.gecko.driver","driver/geckodriver.exe");
        WebDriver driver= new FirefoxDriver();
        driver.get(baseUrl);
        System.out.println("Title: "+driver.getTitle());
        System.out.println("Current Url: "+ driver.getCurrentUrl());
        System.out.println("Page source:"+ driver.getPageSource());
        WebElement email= driver.findElement(By.name("user[email]"));
        email.sendKeys("1234@yahoo.com");
        WebElement password=driver.findElement(By.name("user[password]"));
        password.sendKeys("123456");
        driver.close();


    }
}
