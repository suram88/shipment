package com.org.ship;

public class ShipmentEntity {

    private String id;
    private String origin;
    private String destination;
    private String currentStatus;
    private String trackingNumber;
    private String courierCode;

    //constructor using fields
    public ShipmentEntity(String id, String origin,
                          String destination, String currentStatus,
                          String trackingNumber, String courierCode) {
        super();
        this.id = id;
        this.origin = origin;
        this.destination = destination;
        this.currentStatus = currentStatus;
        this.trackingNumber = trackingNumber;
        this.courierCode = courierCode;
    }
    //getters and setters

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getCurrentStatus() {
        return currentStatus;
    }

    public void setCurrentStatus(String currentStatus) {
        this.currentStatus = currentStatus;
    }

    public String getTrackingNumber() {
        return trackingNumber;
    }

    public void setTrackingNumber(String trackingNumber) {
        this.trackingNumber = trackingNumber;
    }

    public String getCourierCode() {
        return courierCode;
    }

    public void setCourierCode(String courierCode) {
        this.courierCode = courierCode;
    }
}
