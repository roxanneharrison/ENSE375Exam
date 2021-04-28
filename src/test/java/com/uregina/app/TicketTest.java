package com.uregina.app;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;
import com.uregina.exceptions.*;
import org.junit.Test;

/**
 * Unit test for TicketTest class
 */
public class TicketTest
{

    @Test
    public void checkTicket_incorrectAirportLength_false()
    {
        try{
        // CREATE A FLIGHT
        Time12 departureTime = new Time12(10,0,AmPm.am);
        Time12 arrivalTime = new Time12(12,0,AmPm.pm);
        Date departureDate = new Date(1, 1, 2021);
        Date arrivalDate = new Date(1, 1, 2021);
        DateTime departureDateTime = new DateTime(departureDate, departureTime);
        DateTime arrivalDateTime = new DateTime(arrivalDate, arrivalTime);
        Flight flight1 = new Flight("VIE", "ABC", departureDateTime, arrivalDateTime);
        // CREATE ANOTHER FLIGHT
        Time12 departureTime2 = new Time12(3,0,AmPm.pm);
        Time12 arrivalTime2 = new Time12(6,0,AmPm.pm);
        Date departureDate2 = new Date(1, 1, 2021);
        Date arrivalDate2 = new Date(1, 1, 2021);
        DateTime departureDateTime2 = new DateTime(departureDate2, departureTime2);
        DateTime arrivalDateTime2 = new DateTime(arrivalDate2, arrivalTime2);
        Flight flight2 = new Flight("ERROR", "EFG", departureDateTime2, arrivalDateTime2);

        // CREATE THE TICKET
        ArrayList<Flight> flights= new ArrayList<Flight>();
        flights.add(flight1);
        flights.add(flight2);
        int maxFlightsCount = 2;
        int maxFlightTime = 10;
        int maxLayoverTime = 10;
        boolean hasSchengenVisa = true;
        Ticket ticket = new Ticket();
        // TEST
        assertFalse(ticket.checkTicket(flights, maxFlightsCount, maxFlightTime, maxLayoverTime, hasSchengenVisa));
         }
        catch (InvalidDateException | InvalidTimeException e){}
    }
    @Test
    public void checkTicket_incorrectAirportChar_false()
    {
        try{
        // CREATE A FLIGHT
        Time12 departureTime = new Time12(10,0,AmPm.am);
        Time12 arrivalTime = new Time12(12,0,AmPm.pm);
        Date departureDate = new Date(1, 1, 2021);
        Date arrivalDate = new Date(1, 1, 2021);
        DateTime departureDateTime = new DateTime(departureDate, departureTime);
        DateTime arrivalDateTime = new DateTime(arrivalDate, arrivalTime);
        Flight flight1 = new Flight("VIE", "ABC", departureDateTime, arrivalDateTime);
        // CREATE ANOTHER FLIGHT
        Time12 departureTime2 = new Time12(3,0,AmPm.pm);
        Time12 arrivalTime2 = new Time12(6,0,AmPm.pm);
        Date departureDate2 = new Date(1, 1, 2021);
        Date arrivalDate2 = new Date(1, 1, 2021);
        DateTime departureDateTime2 = new DateTime(departureDate2, departureTime2);
        DateTime arrivalDateTime2 = new DateTime(arrivalDate2, arrivalTime2);
        Flight flight2 = new Flight("!!!", "EFG", departureDateTime2, arrivalDateTime2);

        // CREATE THE TICKET
        ArrayList<Flight> flights= new ArrayList<Flight>();
        flights.add(flight1);
        flights.add(flight2);
        int maxFlightsCount = 2;
        int maxFlightTime = 10;
        int maxLayoverTime = 10;
        boolean hasSchengenVisa = true;
        Ticket ticket = new Ticket();
        // TEST
        assertFalse(ticket.checkTicket(flights, maxFlightsCount, maxFlightTime, maxLayoverTime, hasSchengenVisa));
         }
        catch (InvalidDateException | InvalidTimeException e){}
    }
    @Test
    public void checkTicket_overMaxFlights_false()
    {
        try{
        // CREATE A FLIGHT
        Time12 departureTime = new Time12(10,0,AmPm.am);
        Time12 arrivalTime = new Time12(12,0,AmPm.pm);
        Date departureDate = new Date(1, 1, 2021);
        Date arrivalDate = new Date(1, 1, 2021);
        DateTime departureDateTime = new DateTime(departureDate, departureTime);
        DateTime arrivalDateTime = new DateTime(arrivalDate, arrivalTime);
        Flight flight1 = new Flight("VIE", "ABC", departureDateTime, arrivalDateTime);
        // CREATE ANOTHER FLIGHT
        Time12 departureTime2 = new Time12(3,0,AmPm.pm);
        Time12 arrivalTime2 = new Time12(6,0,AmPm.pm);
        Date departureDate2 = new Date(1, 1, 2021);
        Date arrivalDate2 = new Date(1, 1, 2021);
        DateTime departureDateTime2 = new DateTime(departureDate2, departureTime2);
        DateTime arrivalDateTime2 = new DateTime(arrivalDate2, arrivalTime2);
        Flight flight2 = new Flight("ADF", "EFG", departureDateTime2, arrivalDateTime2);

        // CREATE THE TICKET
        ArrayList<Flight> flights= new ArrayList<Flight>();
        flights.add(flight1);
        flights.add(flight2);
        int maxFlightsCount = 1;
        int maxFlightTime = 10;
        int maxLayoverTime = 10;
        boolean hasSchengenVisa = true;
        Ticket ticket = new Ticket();
        // TEST
        assertFalse(ticket.checkTicket(flights, maxFlightsCount, maxFlightTime, maxLayoverTime, hasSchengenVisa));
         }
        catch (InvalidDateException | InvalidTimeException e){}
    }

}
