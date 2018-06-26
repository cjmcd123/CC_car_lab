package Components;

public class Tyres extends Components{

    private String tread;
    private int durability;

    public Tyres(String make,String tread,int durability){
        super(make);
        this.durability = durability;
        this.tread = tread;


    }



    public String getTread() {
        return this.tread;
    }

    public int getDurability() {
        return this.durability;
    }
}
