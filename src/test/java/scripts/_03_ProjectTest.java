package scripts;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class _03_ProjectTest extends Base{

    @BeforeMethod
    public void setPage(){
        driver.get(" https://techglobal-training.com/frontend/project-3");

    }

    /**
     * Navigate to https://techglobal-training.com/frontend/project-3
     * Validate that the “One way” radio button is displayed enabled and selected by default
     * Validate that the “Round trip” radio button is displayed enabled and not selected by default
     * Validate that the “Cabin Class” label and dropdown are displayed
     * Validate that the “From” label and dropdown are displayed
     * Validate that the “To” label and dropdown are displayed
     * Validate that the “Depart” label and date picker is displayed
     * Validate that the “Return” label and date picker is displayed and disabled
     * Validate that the “Number of passengers” label and dropdown are displayed and 1 is the default
     * Validate that the “Passenger 1” category label and dropdown are displayed and “Adult (16-64)” is the default
     * Validate that the “BOOK” button is displayed and enabled
     */

    @Test(priority = 1, description = " Validate the default Book your trip form")

    public void validateTheDefaultBookTripForm() {


    }
}

