package fooddelivery.infra;

import javax.naming.NameParser;

import javax.naming.NameParser;
import javax.transaction.Transactional;

import fooddelivery.config.kafka.KafkaProcessor;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;
import fooddelivery.domain.*;


@Service
@Transactional
public class PolicyHandler{
    @Autowired 주문Repository 주문Repository;
    @Autowired OrderRepository orderRepository;
    @Autowired PaymentRepository paymentRepository;
    
    @StreamListener(KafkaProcessor.INPUT)
    public void whatever(@Payload String eventString){}

    @StreamListener(value=KafkaProcessor.INPUT, condition="headers['type']=='배달시작됨'")
    public void whenever배달시작됨_주문상태변경(@Payload 배달시작됨 배달시작됨){

        배달시작됨 event = 배달시작됨;
        System.out.println("\n\n##### listener 주문상태변경 : " + 배달시작됨 + "\n\n");


        

        // Sample Logic //

        

    }

    @StreamListener(value=KafkaProcessor.INPUT, condition="headers['type']=='Accepted'")
    public void wheneverAccepted_UpdateStatus(@Payload Accepted accepted){

        Accepted event = accepted;
        System.out.println("\n\n##### listener UpdateStatus : " + accepted + "\n\n");


        

        // Sample Logic //
        Order.updateStatus(event);
        

        

    }
    @StreamListener(value=KafkaProcessor.INPUT, condition="headers['type']=='Rejected'")
    public void wheneverRejected_UpdateStatus(@Payload Rejected rejected){

        Rejected event = rejected;
        System.out.println("\n\n##### listener UpdateStatus : " + rejected + "\n\n");


        

        // Sample Logic //
        Order.updateStatus(event);
        

        

    }
    @StreamListener(value=KafkaProcessor.INPUT, condition="headers['type']=='Cooked'")
    public void wheneverCooked_UpdateStatus(@Payload Cooked cooked){

        Cooked event = cooked;
        System.out.println("\n\n##### listener UpdateStatus : " + cooked + "\n\n");


        

        // Sample Logic //
        Order.updateStatus(event);
        

        

    }
    @StreamListener(value=KafkaProcessor.INPUT, condition="headers['type']=='CookStarted'")
    public void wheneverCookStarted_UpdateStatus(@Payload CookStarted cookStarted){

        CookStarted event = cookStarted;
        System.out.println("\n\n##### listener UpdateStatus : " + cookStarted + "\n\n");


        

        // Sample Logic //
        Order.updateStatus(event);
        

        

    }

    @StreamListener(value=KafkaProcessor.INPUT, condition="headers['type']=='OrderCanceled'")
    public void wheneverOrderCanceled_CancelPayment(@Payload OrderCanceled orderCanceled){

        OrderCanceled event = orderCanceled;
        System.out.println("\n\n##### listener CancelPayment : " + orderCanceled + "\n\n");


        

        // Sample Logic //
        Payment.cancelPayment(event);
        

        

    }

    @StreamListener(value=KafkaProcessor.INPUT, condition="headers['type']=='Rejected'")
    public void wheneverRejected_OrderCancel(@Payload Rejected rejected){

        Rejected event = rejected;
        System.out.println("\n\n##### listener OrderCancel : " + rejected + "\n\n");


        

        // Sample Logic //
        Order.orderCancel(event);
        

        

    }

}


