package fooddelivery.infra;
import fooddelivery.domain.*;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.Optional;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.transaction.Transactional;

@RestController
// @RequestMapping(value="/orderManages")
@Transactional
public class OrderManageController {
    @Autowired
    OrderManageRepository orderManageRepository;




    @RequestMapping(value = "orderManages/{id}/accept",
        method = RequestMethod.PUT,
        produces = "application/json;charset=UTF-8")
    public OrderManage accept(@PathVariable(value = "id") Long id, HttpServletRequest request, HttpServletResponse response) throws Exception {
            System.out.println("##### /orderManage/accept  called #####");
            Optional<OrderManage> optionalOrderManage = orderManageRepository.findById(id);
            
            optionalOrderManage.orElseThrow(()-> new Exception("No Entity Found"));
            OrderManage orderManage = optionalOrderManage.get();
            orderManage.accept();
            
            orderManageRepository.save(orderManage);
            return orderManage;
            
    }
    



    @RequestMapping(value = "orderManages/{id}/reject",
        method = RequestMethod.PUT,
        produces = "application/json;charset=UTF-8")
    public OrderManage reject(@PathVariable(value = "id") Long id, HttpServletRequest request, HttpServletResponse response) throws Exception {
            System.out.println("##### /orderManage/reject  called #####");
            Optional<OrderManage> optionalOrderManage = orderManageRepository.findById(id);
            
            optionalOrderManage.orElseThrow(()-> new Exception("No Entity Found"));
            OrderManage orderManage = optionalOrderManage.get();
            orderManage.reject();
            
            orderManageRepository.save(orderManage);
            return orderManage;
            
    }
    



    @RequestMapping(value = "orderManages/{id}/startcook",
        method = RequestMethod.PUT,
        produces = "application/json;charset=UTF-8")
    public OrderManage startCook(@PathVariable(value = "id") Long id, HttpServletRequest request, HttpServletResponse response) throws Exception {
            System.out.println("##### /orderManage/startCook  called #####");
            Optional<OrderManage> optionalOrderManage = orderManageRepository.findById(id);
            
            optionalOrderManage.orElseThrow(()-> new Exception("No Entity Found"));
            OrderManage orderManage = optionalOrderManage.get();
            orderManage.startCook();
            
            orderManageRepository.save(orderManage);
            return orderManage;
            
    }
    



    @RequestMapping(value = "orderManages/{id}/finishcook",
        method = RequestMethod.PUT,
        produces = "application/json;charset=UTF-8")
    public OrderManage finishCook(@PathVariable(value = "id") Long id, HttpServletRequest request, HttpServletResponse response) throws Exception {
            System.out.println("##### /orderManage/finishCook  called #####");
            Optional<OrderManage> optionalOrderManage = orderManageRepository.findById(id);
            
            optionalOrderManage.orElseThrow(()-> new Exception("No Entity Found"));
            OrderManage orderManage = optionalOrderManage.get();
            orderManage.finishCook();
            
            orderManageRepository.save(orderManage);
            return orderManage;
            
    }
    



}
