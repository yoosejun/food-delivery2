package fooddelivery.infra;
import fooddelivery.domain.*;

import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;
import org.springframework.hateoas.EntityModel;

@Component
public class OrderManageHateoasProcessor implements RepresentationModelProcessor<EntityModel<OrderManage>>  {

    @Override
    public EntityModel<OrderManage> process(EntityModel<OrderManage> model) {
        model.add(Link.of(model.getRequiredLink("self").getHref() + "/accept").withRel("accept"));
        model.add(Link.of(model.getRequiredLink("self").getHref() + "/reject").withRel("reject"));
        model.add(Link.of(model.getRequiredLink("self").getHref() + "/startcook").withRel("startcook"));
        model.add(Link.of(model.getRequiredLink("self").getHref() + "/finishcook").withRel("finishcook"));

        
        return model;
    }
    
}
