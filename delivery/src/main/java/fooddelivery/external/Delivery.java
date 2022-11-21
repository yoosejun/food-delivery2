package fooddelivery.external;

import java.util.Date;
import lombok.Data;

@Data
public class Delivery {

    private Long id;
    private String address;
    private String orderId;
    private String riderId;
    private String status;
}
