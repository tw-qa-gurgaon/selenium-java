package tests;

import common.BaseCase;
import core.BasePageObject;
import core.Constants;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;


import steps.MyFirstSteps;

public class YourFirstTest extends BaseCase {
    @Steps
    MyFirstSteps myFirstStepsObj;

    // There should be ‘departure’ and ‘return’ fields on a search form.
    @Test
    public void verifyDepartureAndReturnFieldOnHomepage()
    {
        /*Write your test method here*/
    	driver.get(Constants.DEFAULT_URL);
    	myFirstStepsObj.verifyDepartureField();
    	myFirstStepsObj.verifyReturnField();
    	
    }
    
    // Trips for the next two years should be searchable.
    @Test
    public void verifyTripsIsSearchable() {
    	driver.get(Constants.DEFAULT_URL);
    	myFirstStepsObj.verifyDropDownValuesEntered("July","December (two years from now)");
    	myFirstStepsObj.clickonSearch();
    	myFirstStepsObj.seatAvailableMessageIsDisplayed();    	
    }
    
    //If there are no seats, display “Sorry, there are no more seats available.”
    @Test
    public void verifySeatsAreNotAvailable() {
    	driver.get(Constants.DEFAULT_URL);
    	myFirstStepsObj.verifyDropDownValuesEntered("July", "July");
    	myFirstStepsObj.clickonSearch();
    	myFirstStepsObj.seatNotAvailableMessageIsDisplayed();
    }
    

    //“Book a ticket to the red planet now!” should apperar somewhere prominent on the page.
    @Test
    public void verifyProminentMessageIsDisplayed() {
    	driver.get(Constants.DEFAULT_URL);
    	myFirstStepsObj.verifyProminentMessageIsDisplayed();
    	
    }
    
    
    
    
    

}
