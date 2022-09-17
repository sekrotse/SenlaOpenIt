package by.senla.openit.dtoentity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigInteger;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class ProductDto extends AbstractDto {
    private String name;
    private BigInteger price;
    private String status;
}
