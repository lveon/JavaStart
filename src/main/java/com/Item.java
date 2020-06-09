package com;

public class Item {
    private int id;
    private String name;
    private double price;
    private int weight;
    private boolean active;
    private int[] properties;
    private Fashion fashion;

    public Item(int id, String name, double price,Fashion newFashion){
        this.id = id;
        this.name = name;
        this.price = price;
        properties = new int[15];
        this.fashion =newFashion;
    }

/*    public Item(int id, String name, double price, int weight){

        this(id,name,price);
        this.weight = weight;
    }*/

    public Item(){

    }

    public boolean isActive(){
        return this.active;
    }

    public int getId(){
        return id;
    }

    public void setId(int id){
        if(id > 0){
            this.id = id;
        }
    }

    public int[] getProperties(){
        return this.properties.clone();
    }



    public void changePrice(double newPrice){
        price = newPrice;
    }

}