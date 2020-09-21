package pl.training.cleancode.orders;

import org.mapstruct.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import pl.training.cleancode.common.web.FastMoneyMapper;
import pl.training.cleancode.common.web.IdTransferObject;
import pl.training.cleancode.products.Product;
import pl.training.cleancode.products.ProductMapper;
import pl.training.cleancode.products.ProductService;

import java.util.List;
import java.util.stream.Collectors;

@Mapper(componentModel = "spring", uses = {FastMoneyMapper.class, ProductMapper.class})
public abstract class OrderMapper {

    @Autowired
    private ProductService productService;

    public Order toOrder(OrderTransferObject orderTransferObject) {
        List<Product> products = orderTransferObject.getProducts().stream()
                .map(IdTransferObject::getId)
                .map(productService::getById)
                .collect(Collectors.toList());
        return new Order(products);
    }

}
