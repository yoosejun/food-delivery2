package fooddelivery.external;

import lombok.Data;
import java.util.Date;
@Data
public class Payment {

    private Long id;
    private String orderId;
    private Double amount;
}


