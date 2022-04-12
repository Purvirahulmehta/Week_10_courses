package courses;

import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.Scanner;

public class Multiple {
    public static void main(String[] args) {
        String baseUrl = "https://courses.ultimateqa.com/users/sign_in";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Browser name(firefox=1,chrome=2,edge=3):");
        int a = scanner.nextInt();
        if (a == 1) {
            System.out.println("Firefox");
            System.setProperty("webdriver.gecko.driver","driver/geckodriver.exe");
            WebDriver driver = new FirefoxDriver();
            driver.get(baseUrl);
        } else if (a == 2) {
            System.out.println("chrome");
            System.setProperty("webdriver.chrome.driver","driver/chromedriver.exe");
            WebDriver driver = new ChromeDriver();
            driver.get(baseUrl);
        } else {
            System.out.println("edge");
            System.setProperty("webdriver.edge.driver","driver/msedgedriver.exe");
            WebDriver driver = new EdgeDriver();
            driver.get(baseUrl);
        }
    }
}