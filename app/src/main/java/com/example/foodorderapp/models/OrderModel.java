package com.example.foodorderapp.models;

public class OrderModel {
    /*
    Todo : Add vars which we want to add in recycler view
     */
    int orderImage;
    String orderName,orderNumber,orderItemPrice;
    /*
    Todo : generate constructors for all vars
     */

    public OrderModel(int orderImage, String orderName, String orderNumber, String orderItemPrice) {
        this.orderImage = orderImage;
        this.orderName = orderName;
        this.orderNumber = orderNumber;
        this.orderItemPrice = orderItemPrice;
    }
    /*
    todo: generate getter and setter
     */

    public int getImage() {
        return orderImage;
    }

    public void setImage(int image) {
        this.orderImage = image;
    }

    public String getOrderName() {
        return orderName;
    }

    public void setOrderName(String orderName) {
        this.orderName = orderName;
    }

    public String getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber;
    }

    public String getOrderItemPrice() {
        return orderItemPrice;
    }

    public void setOrderItemPrice(String orderItemPrice) {
        this.orderItemPrice = orderItemPrice;
    }
}
