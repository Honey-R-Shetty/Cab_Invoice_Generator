package com.cab;

public class InvoiceGenerator {
	private static final int COST_PER_KM = 10;
	private static final int COST_PER_MIN = 1;
	private static final int MIN_FARE = 5;

	private static final double PREMIUM_COST_PER_KM = 15;
	private static final double PREMIUM_COST_PER_MIN = 2;
	private static final double PREMIUM_MIN_FARE = 20;

	public double calculateFare(double distance, int time) {
		if (distance <= 0)
			throw new IllegalArgumentException("Distance must be positive");
		if (time <= 0)
			throw new IllegalArgumentException("Time must be positive");

		double fare = distance * COST_PER_KM + time * COST_PER_MIN;
		return Math.max(fare, MIN_FARE);
	}

	public InvoiceSummary calculateInvoice(Ride[] rides) {
		double totalFare = 0;
		for (Ride ride : rides) {
			totalFare += calculateFare(ride.distance, ride.time);
		}
		return new InvoiceSummary(rides.length, totalFare);
	}

	public double calculateFare(Ride ride, boolean isPremium) {
		if (ride == null)
			throw new IllegalArgumentException("Ride cannot be null");
		double fare = 0;
		if (isPremium) {
			fare = ride.distance * PREMIUM_COST_PER_KM + ride.time * PREMIUM_COST_PER_MIN;
			return Math.max(fare, PREMIUM_MIN_FARE);
		} else {
			fare = ride.distance * COST_PER_KM + ride.time * COST_PER_MIN;
			return Math.max(fare, MIN_FARE);
		}
	}

	public double calculateFare(Ride ride) {
		return calculateFare(ride, false);
	}

}
