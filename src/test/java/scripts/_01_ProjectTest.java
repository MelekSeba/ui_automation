package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.Waiter;

public class _01_ProjectTest extends Base{



    /**
     * Navigate to https://techglobal-training.com/frontend/project-1
     * Validate the heading is “Contact Us”
     * Validate the address is “2860 S River Rd Suite 350, Des Plaines IL 60018”
     * Validate the email is “info@techglobalschool.com"
     * Validate the phone number is “(773) 257-3010”
     */

    @BeforeMethod
    public void setPage(){
        driver.get("https://techglobal-training.com/frontend/project-1");
    }

    @Test
    public void ValidateTheContactUsInformation() {

        WebElement heading = driver.findElement(By.cssSelector(".is-size-2"));
        WebElement address = driver.findElement(By.id("address"));
        WebElement email = driver.findElement(By.id("email"));
        WebElement phoneNumber = driver.findElement(By.id("phone-number"));

        Assert.assertTrue(heading.isDisplayed());
        Assert.assertEquals(heading.getText(), "Contact Us");
        Assert.assertTrue(address.isDisplayed());
        Assert.assertEquals(address.getText(), "2860 S River Rd Suite 350, Des Plaines IL 60018");
        Assert.assertTrue(email.isDisplayed());
        Assert.assertEquals(email.getText(), "info@techglobalschool.com");
        Assert.assertTrue(phoneNumber.isDisplayed());
        Assert.assertEquals(phoneNumber.getText(), "(773) 257-3010");

    }

        /**
         * Navigate to https://techglobal-training.com/frontend/project-1
         * Validate that the Full name input box is displayed
         * Validate that the Full name input box is required
         * Validate that the label of the Full name input box is “Full name”
         * Validate that the placeholder of the Full name input box is “Enter your name”
         */

        @Test
        public void validateTheFullNameInput(){

            // Validate the Full name input box is displayed
            WebElement fullNameInputBox = driver.findElement(By.name("full_name"));
            Assert.assertTrue(fullNameInputBox.isDisplayed());


            Waiter.pause(2);






        }





}
