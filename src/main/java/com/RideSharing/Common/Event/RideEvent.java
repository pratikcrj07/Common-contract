package com.RideSharing.Common.Event;

import java.io.Serializable;
import java.time.Instant;

public class RideEvent implements Serializable {

    private RideEventType type;

    private Long rideId;
    private Long userId;
    private Long driverId;

    // LOCATIONS
    private Double pickupLat;
    private Double pickupLon;
    private Double dropLat;
    private Double dropLon;

    // TIMES (optional depending on event)
    private Instant eventTime;   // always present
    private Instant pickupTime;  // RIDE_STARTED
    private Instant dropTime;    // RIDE_COMPLETED

    public RideEvent() {}

    public RideEvent(
            RideEventType type,
            Long rideId,
            Long userId,
            Long driverId,
            Double pickupLat,
            Double pickupLon,
            Double dropLat,
            Double dropLon,
            Instant eventTime,
            Instant pickupTime,
            Instant dropTime
    ) {
        this.type = type;
        this.rideId = rideId;
        this.userId = userId;
        this.driverId = driverId;
        this.pickupLat = pickupLat;
        this.pickupLon = pickupLon;
        this.dropLat = dropLat;
        this.dropLon = dropLon;
        this.eventTime = eventTime;
        this.pickupTime = pickupTime;
        this.dropTime = dropTime;
    }

    public RideEventType getType() { return type; }
    public Long getRideId() { return rideId; }
    public Long getUserId() { return userId; }
    public Long getDriverId() { return driverId; }

    public Double getPickupLat() { return pickupLat; }
    public Double getPickupLon() { return pickupLon; }
    public Double getDropLat() { return dropLat; }
    public Double getDropLon() { return dropLon; }

    public Instant getEventTime() { return eventTime; }
    public Instant getPickupTime() { return pickupTime; }
    public Instant getDropTime() { return dropTime; }
}
