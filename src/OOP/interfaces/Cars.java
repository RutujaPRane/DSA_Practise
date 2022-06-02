package OOP.interfaces;

public class Cars implements Engine,Brake {


    @Override
    public void brake() {
        System.out.println("This is brake");
    }

    @Override
    public void start() {

        System.out.println("This is starting");
    }

    @Override
    public void stop() {
        System.out.println("This stops the car");

    }

    @Override
    public void acc() {
        System.out.println("This accelerates car");

    }
}
