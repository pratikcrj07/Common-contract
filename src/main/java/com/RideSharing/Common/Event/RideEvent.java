package com.RideSharing.Common.Event;

import java.io.Serializable;
import java.time.Instant;

public class RideEvent implements Serializable {

    private RideEventType type;
    private Long rideId;
    private Long userId;
    private Long driverId;

    private Double pickupLat;
    private Double pickupLon;

    private Instant timestamp;

    public RideEvent() {}

    public RideEvent(
            RideEventType type,
            Long rideId,
            Long userId,
            Long driverId,
            Double pickupLat,
            Double pickupLon,
            Instant timestamp
    ) {
        this.type = type;
        this.rideId = rideId;
        this.userId = userId;
        this.driverId = driverId;
        this.pickupLat = pickupLat;
        this.pickupLon = pickupLon;
        this.timestamp = timestamp;
    }

    public RideEventType getType() { return type; }
    public Long getRideId() { return rideId; }
    public Long getUserId() { return userId; }
    public Long getDriverId() { return driverId; }
    public Double getPickupLat() { return pickupLat; }
    public Double getPickupLon() { return pickupLon; }
    public Instant getTimestamp() { return timestamp; }
}
