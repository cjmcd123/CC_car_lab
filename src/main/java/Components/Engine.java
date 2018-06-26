package Components;

public class Engine extends Components{



    private int cylinder;


    public Engine(String make,int cylinder){
        super(make);
        this.cylinder = cylinder;
    }


    public int getCylinder() {
        return this.cylinder;
    }

}
