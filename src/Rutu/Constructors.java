package Rutu;
//class Cylinder{
    /*private int height;
    private int radius;
    public Cylinder(int height, int radius) {
        this.height = height;
        this.radius = radius;
    }



    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
    public double SurfaceArea(){
        return 2* Math.PI*radius*radius+2*Math.PI*radius*height;
    }
    public double Volume(){
        return Math.PI*radius*radius*height;
    }*/
    class Rectangle{
        private int length;
        private int breadth;

        public Rectangle(int length, int breadth) {
            this.length = length;
            this.breadth = breadth;
        }
        public Rectangle() {
            this.length = 4;
            this.breadth = 5;
        }

    public int getLength() {
        return length;
    }

    public int getBreadth() {
        return breadth;
    }

}

    /*Cylinder() {
    }*/

public class Constructors {
    public static void main(String[] args) {
       // Cylinder Mycylinder = new Cylinder(12,9);
        //Mycylinder.setHeight(12);
        //System.out.println(Mycylinder.getHeight());
        //Mycylinder.setRadius(9);
       // System.out.println(Mycylinder.getRadius());
       // System.out.println(Mycylinder.SurfaceArea());
       // System.out.println(Mycylinder.Volume());
        Rectangle r = new Rectangle(12,22);
        System.out.println(r.getLength());
        System.out.println(r.getBreadth());

    }
}
