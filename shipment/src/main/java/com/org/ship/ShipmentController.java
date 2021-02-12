package com.org.ship;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class ShipmentController {
    @Autowired
    private IShipmentService shipmentService;

    //mapping the getShipment() method to /shipment
    @GetMapping(value = "/shipments")
    public List<ShipmentEntity> getShipment() {
//finds all the shipment
        List<ShipmentEntity> shipments = shipmentService.findAll();
//returns the shipment list
        return shipments;
    }

// Single item

    @GetMapping("/shipment/{id}")
    ResponseEntity<?> one(@PathVariable String id) {

        Optional<ShipmentEntity> optional = shipmentService.findByShipmentId(id);

        if(!optional.isPresent()){
            return ResponseEntity.badRequest().build();
        }

        return ResponseEntity.of(optional);
    }

}
