package pl.training.cleancode.products;

import lombok.*;
import org.hibernate.annotations.Columns;
import org.javamoney.moneta.FastMoney;

import javax.persistence.*;

@NamedQuery(name = Product.SELECT_PRODUCTS, query = "select p from Product p")
@Table(name = "products", indexes = @Index(name = "payment_type", columnList = "type"))
@Entity
@Builder
@EqualsAndHashCode(exclude = "id")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {

    public static final String SELECT_PRODUCTS = "selectProducts";

    @GeneratedValue
    @Id
    private Long id;
    private String name;
    private String description;
    @Columns(columns = {
            @Column(name = "currency", length = 3),
            @Column(name = "value")
    })
    private FastMoney price;
    @Enumerated(EnumType.STRING)
    private ProductType type;

}
