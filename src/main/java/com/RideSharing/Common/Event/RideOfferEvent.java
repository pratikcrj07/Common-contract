package com.RideSharing.Common.Event;

import java.io.Serializable;
import java.time.Instant;

public class RideOfferEvent implements Serializable {

    private Long rideId;
    private Long driverId;

    // ROUTE
    private Double pickupLat;
    private Double pickupLon;
    private Double dropLat;
    private Double dropLon;

    // ESTIMATES
    private Double estimatedDistanceKm;
    private Double estimatedDurationMin;

    // PRICING
    private Double baseFare;
    private Double surgeMultiplier;
    private Double finalFare;

    // OFFER CONTROL
    private Instant expiresAt;
    private Instant createdAt;

    public RideOfferEvent() {}

    public RideOfferEvent(
            Long rideId,
            Long driverId,
            Double pickupLat,
            Double pickupLon,
            Double dropLat,
            Double dropLon,
            Double estimatedDistanceKm,
            Double estimatedDurationMin,
            Double baseFare,
            Double surgeMultiplier,
            Double finalFare,
            Instant expiresAt
    ) {
        this.rideId = rideId;
        this.driverId = driverId;
        this.pickupLat = pickupLat;
        this.pickupLon = pickupLon;
        this.dropLat = dropLat;
        this.dropLon = dropLon;
        this.estimatedDistanceKm = estimatedDistanceKm;
        this.estimatedDurationMin = estimatedDurationMin;
        this.baseFare = baseFare;
        this.surgeMultiplier = surgeMultiplier;
        this.finalFare = finalFare;
        this.expiresAt = expiresAt;
        this.createdAt = Instant.now();
    }

    public Long getRideId() { return rideId; }
    public Long getDriverId() { return driverId; }

    public Double getPickupLat() { return pickupLat; }
    public Double getPickupLon() { return pickupLon; }

    public Double getDropLat() { return dropLat; }
    public Double getDropLon() { return dropLon; }

    public Double getEstimatedDistanceKm() { return estimatedDistanceKm; }
    public Double getEstimatedDurationMin() { return estimatedDurationMin; }

    public Double getBaseFare() { return baseFare; }
    public Double getSurgeMultiplier() { return surgeMultiplier; }
    public Double getFinalFare() { return finalFare; }

    public Instant getExpiresAt() { return expiresAt; }
    public Instant getCreatedAt() { return createdAt; }
}
