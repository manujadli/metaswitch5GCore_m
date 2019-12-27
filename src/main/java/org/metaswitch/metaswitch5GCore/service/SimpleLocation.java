package org.metaswitch.metaswitch5GCore.service;

public class SimpleLocation {

	private double latitude;
	private double longitude;
	
	public SimpleLocation(double lat, double lon) {		
		this.latitude = lat;
		this.longitude = lon;
	}
	
	public double distance(SimpleLocation other) {
		return getDistance(this.latitude, this.longitude,
							other.latitude, other.longitude);
		
	}

	private double getDistance(double latitude2, double longitude2, double latitude3, double longitude3) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
	
}
