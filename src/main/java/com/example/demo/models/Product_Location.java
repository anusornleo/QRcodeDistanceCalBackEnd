package com.example.demo.models;


import java.io.Serializable;

public class Product_Location implements Serializable {
    private int id;
    private int quantity;
    private int product_id;
    private int location_id;

    public Product_Location(){}

    public Product_Location(int id,int quantity, int product_id, int location_id) {
        this.id = id;
        this.quantity = quantity;
        this.product_id = product_id;
        this.location_id = location_id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getProduct_id() {
        return product_id;
    }

    public void setProduct_id(int product_id) {
        this.product_id = product_id;
    }

    public int getLocation_id() {
        return location_id;
    }

    public void setLocation_id(int location_id) {
        this.location_id = location_id;
    }
}
