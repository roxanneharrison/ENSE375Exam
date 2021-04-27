package com.uregina.app;

import static org.junit.Assert.assertTrue;
import com.uregina.exceptions.*;
import org.junit.Test;

/**
 * Unit test for Time24 class
 */
public class Time24Test
{

    @Test
    public void shouldAnswerWithTrue()
    {
        try{
        Time24 time = new Time24(10,0);
        System.out.println(time.toTime24(10, 10, am));
        assertTrue( true );
        }
        catch (InvalidTimeException e)
        {}
    }
}
