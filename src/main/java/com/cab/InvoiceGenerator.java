package com.cab;

public class InvoiceGenerator {
	private static final int COST_PER_KM = 10;
	private static final int COST_PER_MIN = 1;
	private static final int MIN_FARE = 5;

	public double calculateFare(double dist, int time) {
		if (dist <= 0 )
			throw new IllegalArgumentException("Distance must be positive");
		if (time < 0)
			throw new IllegalArgumentException("Time must be positive");

		double fare = dist * COST_PER_KM + time * COST_PER_MIN;
		return Math.max(fare, MIN_FARE);
	}
	
	public InvoiceSummary calculateInvoice(Ride[] rides) {
	    double totalFare = 0;
	    for (Ride r : rides) {
	        totalFare += calculateFare(r.distance, r.time);
	    }
	    return new InvoiceSummary(rides.length, totalFare);
	}

}
