package fooddelivery.domain;

import fooddelivery.domain.*;
import fooddelivery.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class CookStart extends AbstractEvent {

    private Long id;
    private String foodId;
    private String orderId;
    private String preference;
    private String status;

    public CookStart(OrderManage aggregate){
        super(aggregate);
    }
    public CookStart(){
        super();
    }
}
