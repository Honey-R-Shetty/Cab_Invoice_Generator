package com.cab;

public class Ride {
	public double distance;
	public int time;

	public Ride(double distance, int time) {
		if (distance <= 0)
			throw new IllegalArgumentException("Distance must be positive");
		if (time <= 0)
			throw new IllegalArgumentException("Time must be positive");
		this.distance = distance;
		this.time = time;
	}
}
