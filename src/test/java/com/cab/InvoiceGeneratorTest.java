package com.cab;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class InvoiceGeneratorTest {
	InvoiceGenerator invoice = new InvoiceGenerator();

	@Test
	public void testFare() {
		double fare = invoice.calculateFare(2.0, 5);
		assertEquals(25, fare, 0.01);
	}

	@Test
	public void testMinimumFare() {
		double fare = invoice.calculateFare(0.1, 1);
		assertEquals(5, fare, 0.01);
	}

	@Test
	public void testZeroDistance() {
		try {
			invoice.calculateFare(0, 5);
		} catch (IllegalArgumentException e) {
			assertEquals("Distance must be positive", e.getMessage());
		}
	}

	@Test
	public void testNegativeMinutes() {
		try {
			invoice.calculateFare(5, -4);
		} catch (IllegalArgumentException e) {
			assertEquals("Time must be positive", e.getMessage());
		}
	}

	@Test
	public void testMultipleRides() {
		Ride[] rides = { new Ride(2, 5), new Ride(0.2, 1) };
		InvoiceSummary sum = invoice.calculateInvoice(rides);
		assertEquals(2, sum.getTotalRides());
		assertEquals(30.0, sum.getTotalFare());
		assertEquals(15.0, sum.getAvgFare());
	}

	@Test
	public void testEnhancedInvoice() {
		Ride[] rides = { new Ride(2, 5), new Ride(0.2, 1) };
		InvoiceSummary actual = invoice.calculateInvoice(rides);
		InvoiceSummary expected = new InvoiceSummary(2, 30.0);
		assertEquals(expected, actual);
	}
}
