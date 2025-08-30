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

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null || getClass() != obj.getClass())
			return false;
		InvoiceSummary other = (InvoiceSummary) obj;
		return totalRides == other.totalRides && Double.compare(totalFare, other.totalFare) == 0
				&& Double.compare(avgFare, other.avgFare) == 0;
	}

}
