package by.senla.openit.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "users")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User extends AbstractProjectEntity {
    @Column
    private String name;

    @OneToMany
    private List<Order> orders;
}


