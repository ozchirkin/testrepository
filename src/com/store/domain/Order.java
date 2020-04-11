package com.store.domain;

import java.math.BigDecimal;
import java.util.Date;

public class Order {
    private int orderId;
    private Date data;
    private BigDecimal sum;
    private PaymentType payType;
    private Status orderStatus;
    private String address;
    private User userId;
    private DeliveryType deltype;

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public BigDecimal getSum() {
        return sum;
    }

    public void setSum(BigDecimal sum) {
        this.sum = sum;
    }

    public PaymentType getPayType() {
        return payType;
    }

    public void setPayType(PaymentType payType) {
        this.payType = payType;
    }

    public Status getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(Status orderStatus) {
        this.orderStatus = orderStatus;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public User getUserId() {
        return userId;
    }

    public void setUserId(User userId) {
        this.userId = userId;
    }

    public DeliveryType getDeltype() {
        return deltype;
    }

    public void setDeltype(DeliveryType deltype) {
        this.deltype = deltype;
    }
}
