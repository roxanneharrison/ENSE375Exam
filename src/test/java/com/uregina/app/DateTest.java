package com.uregina.app;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;
import com.uregina.exceptions.*;
import org.junit.Test;

/**
 * Unit test for Time12 class
 */
public class DateTest
{

    @Test
    public void lessThan_lessThan_true()
    {
        try{
            int day = 1;
            int month = 1;
            int year = 2021;
            // Create date and test function
            Date date = new Date(month, day, year);
            Date d1 = new Date(1,1,2021);
            Date d2 = new Date(2,1,2021);
            assertTrue(date.lessThan(d1, d2));
        	}
		catch(InvalidDateException e)
		{}
    }
    @Test
    public void lessThan_greaterThan_false()
    {
        try{
            int day = 1;
            int month = 1;
            int year = 2021;
            // Create date and test function
            Date date = new Date(day, month, year);
            Date d1 = new Date(2,1,2021);
            Date d2 = new Date(1,1,2021);
            assertFalse(date.lessThan(d1, d2));
        	}
		catch(InvalidDateException e)
		{}
    }
    @Test
    public void lessThan_equals_false()
    {
        try{
            int day = 1;
            int month = 1;
            int year = 2021;
            // Create date and test function
            Date date = new Date(day, month, year);
            Date d1 = new Date(1,1,2021);
            Date d2 = new Date(1,1,2021);
            assertFalse(date.lessThan(d1, d2));
        	}
		catch(InvalidDateException e)
		{}
    }
}
