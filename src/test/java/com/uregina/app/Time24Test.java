package com.uregina.app;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;
import com.uregina.exceptions.*;
import org.junit.Test;

/**
 * Unit test for Time24 class
 */
public class Time24Test
{

    @Test
    public void toTime24_5pm_true()
    {
        try{
            int hours = 5;
            int minutes = 0;
            AmPm ampm = AmPm.pm;
            // Create time and test function
            Time24 actualTime = new Time24(hours, minutes);
            // Actual time
            actualTime = actualTime.toTime24(hours, minutes, ampm);
            // Expected time
            Time24 expectedTime = new Time24(17,0);
            assertEquals(actualTime.getHours(), expectedTime.getHours());
        	}
		catch(InvalidTimeException e)
		{}
    }
    @Test
    public void toTime24_12pm_true()
    {
        try{
            int hours = 12;
            int minutes = 0;
            AmPm ampm = AmPm.pm;
            // Create time and test function
            Time24 actualTime = new Time24(hours, minutes);
            // Actual time
            actualTime = actualTime.toTime24(hours, minutes, ampm);
            // Expected time
            Time24 expectedTime = new Time24(12,0);
            assertEquals(actualTime.getHours(), expectedTime.getHours());
        	}
		catch(InvalidTimeException e)
		{}
    }
    @Test
    public void toTime24_12am_true()
    {
        try{
            int hours = 12;
            int minutes = 30;
            AmPm ampm = AmPm.am;
            // Create time and test function
            Time24 actualTime = new Time24(hours, minutes);
            // Actual time
            actualTime = actualTime.toTime24(hours, minutes, ampm);
            // Expected time
            Time24 expectedTime = new Time24(0,30);
            assertEquals(actualTime.getHours(), expectedTime.getHours());
        	}
		catch(InvalidTimeException e)
		{}
    }
    @Test
    public void toTime24_5am_true()
    {
        try{
            int hours = 5;
            int minutes = 30;
            AmPm ampm = AmPm.am;
            // Create time and test function
            Time24 actualTime = new Time24(hours, minutes);
            // Actual time
            actualTime = actualTime.toTime24(hours, minutes, ampm);
            // Expected time
            Time24 expectedTime = new Time24(5,30);
            assertEquals(actualTime.getHours(), expectedTime.getHours());
        	}
		catch(InvalidTimeException e)
		{}
    }
}
