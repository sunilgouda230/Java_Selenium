package Assignment11;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Assignment11 {

    public static String waitForTheText(WebDriver driver, String text, int timeout, By locator){
        for (int i = 0; i < timeout; i++) {
            try {
                WebElement ele = driver.findElement(locator);
                if (ele.getText().contains(text)) {
                    return ele.getText();
                }
            } catch (NoSuchElementException e) {
                System.out.println("Finding the "+text);
            }
        }
        return null;
    }

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-use-explicit-wait-in-selenium.html");
        driver.findElement(By.xpath("//button[text()='Click me to start timer']")).click();
        String text = waitForTheText(driver,"WebDriver",30,By.xpath("//p[@id='demo']"));
        System.out.println("The Text Is Visible----> "+text);
    }
}
