package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class _13_IFrameTest extends Base {

    @BeforeMethod
    public void setPage(){
        driver.get("https://techglobal-training.com/frontend/iframes");
    }

    /*
    TEST CASE
    Go to https://techglobal-training.com/frontend/iframes
    Validate the "Please fill out your information below" paragraph
     */

    @Test(priority = 1, description = "TC123: Validate the IFrame Page content paragraph")
    public void validateTheParagraph(){
        //WebElement iframe = driver.findElement(By.id("form_frame"));
        //driver.switchTo().frame(iframe);

        //driver.switchTo().frame(0);

        driver.switchTo().frame("form_frame");

        WebElement paragraph = driver.findElement(By.cssSelector("#name_form>p"));
        Assert.assertTrue(paragraph.isDisplayed());
        Assert.assertEquals(paragraph.getText(), "Please fill out your information below");
    }

    /*
TEST CASE
Go to https://techglobal-training.com/frontend/iframes
Enter name as "John"
Enter last name as "Doe"
Click on "SUBMIT" button
Validate that the Result is "You entered: John Doe"
 */
    @Test(priority = 2, description = "TC345 Validate the form submission" )

    public void validateTheFormSubmission(){

        driver.switchTo().frame("form_frame");

        WebElement firstName = driver.findElement(By.cssSelector("input[id='first_name]"));
        firstName.sendKeys("John");

        WebElement lastName = driver.findElement(By.cssSelector("input[id='last_name]"));
        lastName.sendKeys("Doe");

        WebElement submitButton = driver.findElement(By.cssSelector("button[id='submit']>span"));
        submitButton.click();



        WebElement resultMessage = driver.findElement(By.id("#result"));
        Assert.assertEquals(resultMessage.getText(), "You entered: John Doe");




    }
}




