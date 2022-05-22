package Properties.inheritance;

public class BoxWeight extends Box {
    double weight;

    public  BoxWeight() {
        this.weight=-1;

    }

    BoxWeight(side)

    public BoxWeight(double l, double w, double h, double weight) {
        super(l, w, h); //call the parent class constructor
        // used to initialize parent class constructor

        //System.out.println(super.h); used as this
        this.weight = weight;
    }
}
