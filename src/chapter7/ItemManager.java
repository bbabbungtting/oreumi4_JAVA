package chapter7;

import java.util.ArrayList;

public class ItemManager {
    public static void main(String[] args) {
        ArrayList<Item> itemArrayList = new ArrayList<Item>();

        itemArrayList.add(new Album(1,"MADE",27500,"BIGBANG"));
        String[] actors = {"Leonardo DiCaprio", "Kate Winslet"};
        itemArrayList.add(new Movie(2,"TITANIC",20000,"James Cameron",actors));
        itemArrayList.add(new Book(3,"Demian",12000,"Hermann Hesse",1));

        showItems(itemArrayList);
    }

    static void showItems(ArrayList<Item> itemArrayList){
        for(Item item : itemArrayList){
            item.show();
        }
    }
}