package courses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Edge {
    public static void main(String[] args) {
        String baseUrl="https://courses.ultimateqa.com/users/sign_in";
        System.setProperty("webdriver.edge.driver","driver/msedgedriver.exe");
        WebDriver driver= new EdgeDriver();
        driver.get(baseUrl);
        System.out.println("Title:"+ driver.getTitle());
        System.out.println("Current Url:"+ driver.getCurrentUrl());
        System.out.println("PageSource:"+ driver.getPageSource());
        WebElement email=driver.findElement(By.name("user[email]"));
        email.sendKeys("1234@yahoo.com");
        WebElement password=driver.findElement(By.name("user[password]"));
        password.sendKeys("123456");
        driver.close();
    }
}
