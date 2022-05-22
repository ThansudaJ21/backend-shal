package shal.backend.rest.product.entity;

import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Data
@Builder
@Entity
@AllArgsConstructor
public class Shipment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Exclude
    private Long id;
    @Enumerated(EnumType.STRING)
    private ShipmentName shipmentName;

    @ManyToOne
    Product product;

    public Shipment() {

    }
}
