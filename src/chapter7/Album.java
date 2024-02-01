package chapter7;

public class Album extends Item{
    private String artist;

    Album(int id, String name, int price, String artist){
        super(id,name,price);
        this.artist = artist;
    }
    @Override
    public void show(){
        super.show();
        System.out.println("| Artist: " + artist);
    }
}
