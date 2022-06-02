package OOP.properties.inheritance;

public class BoxPrice extends BoxWeight{
    double cost;

    public BoxPrice(double side, double weight) {
        super(side, weight);
    }

     BoxPrice(BoxPrice other) {
        super(other);
        this.cost = other.cost;
    }

    BoxPrice (){
        super();
        this.cost=-1;
    }

    public BoxPrice(double side, double weight, double cost) {
        super(side, weight);
        this.cost = cost;
    }
}
