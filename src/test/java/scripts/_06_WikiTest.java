package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class _06_WikiTest extends Base {

    /**
Go to "https://www.wikipedia.org/"
Search for "Tesla"
Validate the main header of the page is displayed and is "Tesla"
 */

    @BeforeMethod
    public void setPage() {
        driver.get("https://en.wikipedia.org/");
    }

    @Test
    public void validateWikiTesla() {
        WebElement searchInput = driver.findElement(By.id("searchInput"));
        searchInput.sendKeys("Tesla");

        driver.findElement(By.cssSelector("h1[id='firstHeading']"));




    }
}