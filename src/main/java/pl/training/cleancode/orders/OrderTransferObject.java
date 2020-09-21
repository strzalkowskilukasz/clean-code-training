package pl.training.cleancode.orders;

import lombok.Data;
import pl.training.cleancode.common.web.IdTransferObject;

import java.util.List;

@Data
public class OrderTransferObject {

    private List<IdTransferObject> products;

}
