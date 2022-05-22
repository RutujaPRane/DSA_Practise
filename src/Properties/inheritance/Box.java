package Properties.inheritance;

public class Box {
    double l;
    double w;
    double h;

    Box(){
        this.l=-1;
        this.w=-1;
        this.h=-1;
    }
///cube
    Box(double side){
        this.l=side;
        this.h=side;
        this.w=side;

    }

    public Box(double l, double w, double h) {
        this.l = l;
        this.w = w;
        this.h = h;
    }

    Box(Box old){
        this.l=old.l;
        this.h=old.h;
        this.w=old.w;
    }

    public void info(){
        System.out.println("Runnin box");
    }
}




