package fooddelivery.domain;

import fooddelivery.domain.배달시작됨;
import fooddelivery.domain.Cooked;
import fooddelivery.domain.Accepted;
import fooddelivery.domain.Rejected;
import fooddelivery.domain.CookStarted;
import fooddelivery.domain.쿠폰발행됨;
import fooddelivery.StoreApplication;
import javax.persistence.*;
import java.util.List;
import lombok.Data;
import java.util.Date;

@Entity
@Table(name="OrderManage_table")
@Data

public class OrderManage  {

    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    
    
    
    
    
    private Long id;
    
    
    
    
    
    private String foodId;
    
    
    
    
    
    private String orderId;
    
    
    
    
    
    private String status;
    
    
    
    
    
    private String test;
    
    
    
    
    
    private Long couponNumber;

    @PostPersist
    public void onPostPersist(){


        배달시작됨 배달시작됨 = new 배달시작됨(this);
        배달시작됨.publishAfterCommit();



        Cooked cooked = new Cooked(this);
        cooked.publishAfterCommit();



        Accepted accepted = new Accepted(this);
        accepted.publishAfterCommit();



        Rejected rejected = new Rejected(this);
        rejected.publishAfterCommit();



        CookStarted cookStarted = new CookStarted(this);
        cookStarted.publishAfterCommit();

    }
    @PrePersist
    public void onPrePersist(){


        쿠폰발행됨 쿠폰발행됨 = new 쿠폰발행됨(this);
        쿠폰발행됨.publishAfterCommit();

    }
    @PreUpdate
    public void onPreUpdate(){
    }

    public static OrderManageRepository repository(){
        OrderManageRepository orderManageRepository = StoreApplication.applicationContext.getBean(OrderManageRepository.class);
        return orderManageRepository;
    }



    public void accept(){
    }
    public void reject(){
    }
    public void startCook(){
    }
    public void finishCook(){
    }

    public static void addToOrderList(Paid paid){

        /** Example 1:  new item 
        OrderManage orderManage = new OrderManage();
        repository().save(orderManage);

        */

        /** Example 2:  finding and process
        
        repository().findById(paid.get???()).ifPresent(orderManage->{
            
            orderManage // do something
            repository().save(orderManage);


         });
        */

        
    }
    public static void alertOrderCancel(OrderCanceled orderCanceled){

        /** Example 1:  new item 
        OrderManage orderManage = new OrderManage();
        repository().save(orderManage);

        */

        /** Example 2:  finding and process
        
        repository().findById(orderCanceled.get???()).ifPresent(orderManage->{
            
            orderManage // do something
            repository().save(orderManage);


         });
        */

        
    }


}
