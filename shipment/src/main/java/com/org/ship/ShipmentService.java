package com.org.ship;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

@Service
public class ShipmentService implements IShipmentService {
    ArrayList<ShipmentEntity> shipments = new ArrayList<ShipmentEntity>();

    @PostConstruct
    public void init() {
        shipments.add(new ShipmentEntity("200", "HYDERABAD", "MUMBAI", "ALLOCATION_SHIPMENT", "1234567650", "5032032"));
        shipments.add(new ShipmentEntity("201", "HYDERABAD", "BANGALORE", "APPOINTMENTS", "1234567651", "5032033"));
        shipments.add(new ShipmentEntity("202", "HYDERABAD", "CHENNAI", "BILLING", "1234567652", "5032034"));
        shipments.add(new ShipmentEntity("203", "HYDERABAD", "PUNE", "BOL_ACTUALS", "1234567653", "5032035"));
        shipments.add(new ShipmentEntity("204", "HYDERABAD", "DELHI", "CONFIRMED", "1234567654", "5032036"));
        shipments.add(new ShipmentEntity("205", "HYDERABAD", "VIJAYAWADA", "DISPATCH", "1234567655", "5032037"));

    }

    @Override
    public List<ShipmentEntity> findAll() {
        //returns a list of product
        return shipments;
    }

    @Override
    public Optional<ShipmentEntity> findByShipmentId(String id) {
        return shipments.stream().filter(k -> k.getId().equals(id)).findFirst();
    }
}
