package chapter7;

public class Item {
    private int id;
    private String name;
    private double price;

    Item(int id, String name, double price){
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public void show(){
        System.out.print("ID: " + id + "| Name: " + name + "| Price: " + price);
    }
}