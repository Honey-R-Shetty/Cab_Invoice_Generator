package com.cab;

import java.util.*;

public class InvoiceService {
	private Map<String, Ride[]> userRides = new HashMap<>();
	private InvoiceGenerator invoice = new InvoiceGenerator();

	public void addRides(String userId, Ride[] rides) {
		userRides.put(userId, rides);
	}

	public InvoiceSummary getInvoice(String userId) {
		Ride[] rides = userRides.get(userId);
		return invoice.calculateInvoice(rides);
	}
}
