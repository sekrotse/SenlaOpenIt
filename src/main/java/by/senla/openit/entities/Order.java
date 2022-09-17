package by.senla.openit.entities;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "orders")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Order extends AbstractProjectEntity {
    @JoinColumn(name = "user_id")
    @ManyToOne(fetch = FetchType.LAZY)
    private User user;

    @Column
    private String status;

    @Column(name = "created_at")
    private LocalDate createdAt;

    @ManyToMany(mappedBy = "orders")
    private List<Product> products;
}

