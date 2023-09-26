package com.example.labfx;

public class Product {
    private String name;
    private Float weight;
    private Size size = new Size();

    public Product(){
    }

    public Product(String name,Float weight,Float length,Float width,Float height){
        setName(name);
        setWeight(weight);
        setSize(length,width,height);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Float getWeight() {
        return weight;
    }

    public void setWeight(Float weight) {
        this.weight = weight;
    }

    public Size getSize() {
        return size;
    }

    public void setSize(Float length,Float width,Float height) {
        size.setHeight(height);
        size.setWidth(width);
        size.setLength(length);

    }
}
