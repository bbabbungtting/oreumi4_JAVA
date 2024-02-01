package chapter7;

public class Book extends Item{
    private String author;
    private int isbn;

    Book(int id, String name, double price, String author, int isbn){
        super(id,name,price);
        this.author = author;
        this.isbn = isbn;
    }

    @Override
    public void show(){
        super.show();
        System.out.println("| Author : " + author + "| ISBN: " + isbn);
    }
}
