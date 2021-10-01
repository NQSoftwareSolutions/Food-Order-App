package com.example.foodorderapp.models;

public class MainModel {
    /*
    TODO: 1.1 Set variables for resources which we want to add inside recycler view..
     */
    int image;
    String name,price,detail;
    /*
    TODO: 1.2 generate constructors for all vars
     */

    public MainModel(int image, String name, String price, String detail) {
        this.image = image;
        this.name = name;
        this.price = price;
        this.detail = detail;
    }
    /*
    TODO: 1.3 generate setter and getter for ALL vars
     */

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }
}
