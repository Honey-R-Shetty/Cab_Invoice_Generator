package com.cab;

public class InvoiceSummary {
	private int totalRides;
	private double totalFare;
	private double avgFare;

	public InvoiceSummary(int totalRides, double totalFare) {
		this.totalRides = totalRides;
		this.totalFare = totalFare;
		this.avgFare = totalFare / totalRides;
	}

	public int getTotalRides() {
		return totalRides;
	}

	public double getTotalFare() {
		return totalFare;
	}

	public double getAvgFare() {
		return avgFare;
	}
}
