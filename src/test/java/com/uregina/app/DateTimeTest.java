package com.uregina.app;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;
import com.uregina.exceptions.*;
import org.junit.Test;

/**
 * Unit test for DateTime class
 */
public class DateTimeTest
{

    @Test
    public void subtract_d1Ahead_true()
    {
        try{
            Time12 time = new Time12(12,0,AmPm.pm);
            Date date = new Date(1, 1, 2021);
            DateTime dateTime = new DateTime(date, time);
            Time12 t1 = new Time12(12,0,AmPm.pm);
            Time12 t2 = new Time12(12,0,AmPm.pm);
            Date date1 = new Date(1, 2, 2021);
            Date date2 = new Date(1, 1, 2021);
            DateTime d1 = new DateTime(date1, t1);
            DateTime d2 = new DateTime(date2, t2);
            int actualMinutes = dateTime.subtract(d1, d2);
            int expectedMinutes = 1440;
            assertEquals(actualMinutes, expectedMinutes);
        	}
		catch(InvalidTimeException | InvalidDateException | MoreThanOneDayException e)
		{}
    }
    @Test
    public void subtract_d2Ahead_true()
    {
        try{
            Time12 time = new Time12(12,0,AmPm.pm);
            Date date = new Date(1, 1, 2021);
            DateTime dateTime = new DateTime(date, time);
            Time12 t1 = new Time12(12,0,AmPm.pm);
            Time12 t2 = new Time12(12,0,AmPm.pm);
            Date date1 = new Date(1, 1, 2021);
            Date date2 = new Date(1, 2, 2021);
            DateTime d1 = new DateTime(date1, t1);
            DateTime d2 = new DateTime(date2, t2);
            int actualMinutes = dateTime.subtract(d1, d2);
            int expectedMinutes = -1440;
            assertEquals(actualMinutes, expectedMinutes);
        	}
		catch(InvalidTimeException | InvalidDateException | MoreThanOneDayException e)
		{}
    }
    @Test
    public void subtract_sameDay_true()
    {
        try{
            Time12 time = new Time12(12,0,AmPm.pm);
            Date date = new Date(1, 1, 2021);
            DateTime dateTime = new DateTime(date, time);
            Time12 t1 = new Time12(12,0,AmPm.pm);
            Time12 t2 = new Time12(12,0,AmPm.pm);
            Date date1 = new Date(1, 1, 2021);
            Date date2 = new Date(1, 1, 2021);
            DateTime d1 = new DateTime(date1, t1);
            DateTime d2 = new DateTime(date2, t2);
            int actualMinutes = dateTime.subtract(d1, d2);
            int expectedMinutes = 0;
            assertEquals(actualMinutes, expectedMinutes);
        	}
		catch(InvalidTimeException | InvalidDateException | MoreThanOneDayException e)
		{}
    }
    @Test
    public void subtract_twoDays_throwMoreThanOneDayException()
    {
        try{
            Time12 time = new Time12(12,0,AmPm.pm);
            Date date = new Date(1, 1, 2021);
            DateTime dateTime = new DateTime(date, time);
            Time12 t1 = new Time12(12,0,AmPm.pm);
            Time12 t2 = new Time12(12,0,AmPm.pm);
            Date date1 = new Date(1, 1, 2021);
            Date date2 = new Date(1, 1, 2021);
            DateTime d1 = new DateTime(date1, t1);
            DateTime d2 = new DateTime(date2, t2);
            
            assertThrows(MoreThanOneDayException.class, () -> {
                int actualMinutes = dateTime.subtract(d1, d2);
            });
        	}
		catch(InvalidTimeException | InvalidDateException e)
		{}
    }
}
