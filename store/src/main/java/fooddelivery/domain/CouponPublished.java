package fooddelivery.domain;

import fooddelivery.domain.*;
import fooddelivery.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class CouponPublished extends AbstractEvent {

    private Long id;
    private String orderId;
    private String foodId;
    private String address;
    private Long couponNumber;

    public CouponPublished(OrderManage aggregate){
        super(aggregate);
    }
    public CouponPublished(){
        super();
    }
}
