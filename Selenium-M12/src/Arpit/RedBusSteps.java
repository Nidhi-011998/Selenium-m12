package Arpit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RedBusSteps{
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.redbus.in/");

        String title = driver.getTitle();
        System.out.println(title);

        if (title.equals("Book Bus Travels, AC Volvo Bus, rPool & Bus Hire - redBus India")) {
            System.out.println("Redbus page is displayed.");
        } else {
            System.out.println("Redbus page not displayed");
        }
        String pageSource = driver.getPageSource();
        System.out.println(pageSource);
    }
}
