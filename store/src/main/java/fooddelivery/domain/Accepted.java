package fooddelivery.domain;

import fooddelivery.domain.*;
import fooddelivery.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class Accepted extends AbstractEvent {

    private Long id;
    private String foodId;
    private String ordered;
    private String status;

    public Accepted(OrderManage aggregate){
        super(aggregate);
    }
    public Accepted(){
        super();
    }
}
