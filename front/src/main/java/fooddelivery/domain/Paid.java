package fooddelivery.domain;

import fooddelivery.domain.*;
import fooddelivery.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class Paid extends AbstractEvent {

    private Long id;
    private String orderId;
    private Double amount;

    public Paid(Payment aggregate){
        super(aggregate);
    }
    public Paid(){
        super();
    }
}
