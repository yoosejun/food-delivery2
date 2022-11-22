package fooddelivery.domain;

import fooddelivery.domain.*;
import fooddelivery.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class Rejected extends AbstractEvent {

    private Long id;
    private String foodId;
    private String orderId;
    private String status;

    public Rejected(OrderManage aggregate){
        super(aggregate);
    }
    public Rejected(){
        super();
    }
}
