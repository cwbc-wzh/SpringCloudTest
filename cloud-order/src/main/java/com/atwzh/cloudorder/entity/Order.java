package com.atwzh.cloudorder.entity;


import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
public class Order {

    private String orderId;

    private Long userId;

    private Date createDate;

    private Date updateDate;

    private List<OrderDetail> orderDetails;

    public Order() {

    }

    public Order(String orderId, Long userId, Date createDate, Date updateDate) {
        this.orderId = orderId;
        this.userId = userId;
        this.createDate = createDate;
        this.updateDate = updateDate;
    }

}
