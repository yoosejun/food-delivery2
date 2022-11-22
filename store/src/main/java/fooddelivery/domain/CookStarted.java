package fooddelivery.domain;

import fooddelivery.domain.*;
import fooddelivery.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class CookStarted extends AbstractEvent {

    private Long id;
    private String foodId;
    private String orderId;
    private String status;

    public CookStarted(OrderManage aggregate){
        super(aggregate);
    }
    public CookStarted(){
        super();
    }
}
