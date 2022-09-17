package by.senla.openit.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigInteger;
import java.util.List;

@Entity
@Table(name = "products")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Product extends AbstractProjectEntity {
    @Column
    private String name;

    @Column
    private BigInteger price;

    @Column
    @Enumerated(EnumType.STRING)
    private Status status;


    @ManyToMany
    @JoinTable(name = "order_item",
            joinColumns = @JoinColumn(name = "pet_id"),
            inverseJoinColumns = @JoinColumn(name = "order_id"))
    private List<Order> orders;

}


