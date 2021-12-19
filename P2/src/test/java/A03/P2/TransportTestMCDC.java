package A03.P2;

import static org.junit.Assert.*;

import org.junit.Test;

public class TransportTestMCDC {


	@Test
	public void testLevel0Age22() throws NegativeValueException, NoSeatsAvailableException, NotHealthyException {
		Transport t = new Transport(50,10);
		Person p = new Person(22,false,true,false);
		assertTrue(t.getTicket(p)==10*0.4);
	}
	
	@Test
	public void testLevel0Age23() throws NegativeValueException, NoSeatsAvailableException, NotHealthyException {
		Transport t = new Transport(50,10);
		Person p = new Person(23,false,true,false);
		assertTrue(t.getTicket(p)==10);
	}
	
	@Test
	public void testLevel1Age22() throws NegativeValueException, NoSeatsAvailableException, NotHealthyException {
		Transport t = new Transport(150,10);
		Person p = new Person(22,false,true,false);
		assertTrue(t.getTicket(p)==10*0.7);
	}
	
	@Test
	public void testLevel0Age66() throws NegativeValueException, NoSeatsAvailableException, NotHealthyException {
		Transport t = new Transport(50,10);
		Person p = new Person(66,false,true,false);
		assertTrue(t.getTicket(p)==10*0.2);
	}
	
	@Test
	public void testLevel0Age65() throws NegativeValueException, NoSeatsAvailableException, NotHealthyException {
		Transport t = new Transport(50,10);
		Person p = new Person(65,false,true,false);
		assertTrue(t.getTicket(p)==10);
	}
	
	@Test
	public void testLevel1Age66() throws NegativeValueException, NoSeatsAvailableException, NotHealthyException {
		Transport t = new Transport(150,10);
		Person p = new Person(66,false,true,false);
		assertTrue(t.getTicket(p)==10*0.5);
	}

}