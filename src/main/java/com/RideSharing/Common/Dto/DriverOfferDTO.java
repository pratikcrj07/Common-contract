package com.RideSharing.Common.Dto;

import java.io.Serializable;

public class DriverOfferDTO  implements Serializable {
    private static final long serialVersionUID = 1L;

    private Long rideId;
    private Long driverId;
    private double pickupLat;
    private double pickupLon;
    private double Fare;
    private int timeoutSeconds;

    public DriverOfferDTO() {

    }
    public DriverOfferDTO(
            Long rideId,
            Long driverId,
            double pickupLat,
            double pickupLon,
            double estimatedFare,
            int timeoutSeconds
    ) {
        this.rideId = rideId;
        this.driverId = driverId;
        this.pickupLat = pickupLat;
        this.pickupLon = pickupLon;
        this.Fare = estimatedFare;
        this.timeoutSeconds = timeoutSeconds;
    }

    public Long getRideId() {
        return rideId;
    }

    public Long getDriverId() {
        return driverId;
    }

    public double getPickupLat() {
        return pickupLat;
    }

    public double getPickupLon() {
        return pickupLon;
    }

    public double getEstimatedFare() {
        return Fare;
    }

    public int getTimeoutSeconds() {
        return timeoutSeconds;
    }
}



