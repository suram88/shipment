package com.org.ship;

import java.util.List;
import java.util.Optional;

public interface IShipmentService {
    List<ShipmentEntity> findAll();

    Optional<ShipmentEntity> findByShipmentId(String id);
}
