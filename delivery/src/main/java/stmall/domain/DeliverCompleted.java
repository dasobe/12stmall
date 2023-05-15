package stmall.domain;

import java.util.*;
import lombok.*;
import stmall.domain.*;
import stmall.infra.AbstractEvent;

@Data
@ToString
public class DeliverCompleted extends AbstractEvent {

    private Long id;
    private String userId;
    private Long orderId;
    private String productName;
    private Long productId;
    private Integer qty;
    private String status;
    private String courier;

    public DeliverCompleted(Delivery aggregate) {
        super(aggregate);
    }

    public DeliverCompleted() {
        super();
    }
}
