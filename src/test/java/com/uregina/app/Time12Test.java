package com.uregina.app;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;
import com.uregina.exceptions.*;
import org.junit.Test;

/**
 * Unit test for Time12 class
 */
public class Time12Test
{

    @Test
    public void subtract_negative_true()
    {
        try{
            int hours = 10;
            int minutes = 0;
            AmPm ampm = AmPm.am;
            // Create time and test function
            Time12 time = new Time12(hours, minutes,ampm);
            Time12 t1 = new Time12(10,0,AmPm.am);
            Time12 t2 = new Time12(10,0,AmPm.pm);
            assertTrue(time.subtract(t1, t2) < 0 );
        	}
		catch(InvalidTimeException e)
		{}
    }
    @Test
    public void subtract_positive_true()
    {
        try{
            int hours = 10;
            int minutes = 0;
            AmPm ampm = AmPm.am;
            // Create time and test function
            Time12 time = new Time12(hours, minutes,ampm);
            Time12 t1 = new Time12(10,0,AmPm.pm);
            Time12 t2 = new Time12(10,0,AmPm.am);
            assertTrue(time.subtract(t1, t2) > 0 );
        	}
		catch(InvalidTimeException e)
		{}
    }
    @Test
    public void subtract_zero_true()
    {
        try{
            int hours = 10;
            int minutes = 0;
            AmPm ampm = AmPm.am;
            // Create time and test function
            Time12 time = new Time12(hours, minutes,ampm);
            Time12 t1 = new Time12(10,0,AmPm.am);
            Time12 t2 = new Time12(10,0,AmPm.am);
            assertTrue(time.subtract(t1, t2) == 0 );
        	}
		catch(InvalidTimeException e)
		{}
    }
}
