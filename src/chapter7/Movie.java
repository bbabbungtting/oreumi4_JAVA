package chapter7;

import java.util.ArrayList;

public class Movie extends Item{
    private String director;
    private ArrayList<String> actors;

    Movie(int id, String name, double price, String director, String[] actors){
        super(id,name,price);
        this.director = director;

        this.actors = new ArrayList<>();
        for(String actor : actors){
            this.actors.add(actor);
        }
    }

    @Override
    public void show(){
        super.show();
        System.out.print("| Director : " + director + "| actors : ");

        for(String actor : actors){
            System.out.print(actor + " ");
        }
        System.out.println(" ");
    }
}