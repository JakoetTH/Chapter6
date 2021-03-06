package Airline.domain;

import Airline.conf.PassengerFactory;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.After;

public class testPassenger {
    private Passenger passenger;
    private Passenger newPassenger;
    @Before
    public void setUp()
    {
        passenger = PassengerFactory.createPassenger("12345","Thawhir","Jakoet","15 Shiraaz Close","54321");
    }
    @Test
    public void testCreatePassenger() throws Exception
    {
        Assert.assertEquals("12345",passenger.getID());
    }
    @Test
    public void testUpdatePassenger()
    {
        newPassenger = new Passenger
                .Builder(passenger.getID())
                .copy(passenger)
                .lastName("Samsodien").build();

        Assert.assertEquals("12345",newPassenger.getID());
        Assert.assertEquals("Samsodien",newPassenger.getLastName());
    }
    @After
    public void tearDown()
    {

    }
}
