package fooddelivery.domain;

import fooddelivery.domain.*;
import fooddelivery.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class Accept extends AbstractEvent {

    private Long id;
    private String orderId;
    private String status;

    public Accept(Delivery aggregate){
        super(aggregate);
    }
    public Accept(){
        super();
    }
}
