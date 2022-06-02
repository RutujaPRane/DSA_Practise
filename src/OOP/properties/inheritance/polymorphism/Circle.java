package OOP.properties.inheritance.polymorphism;

public class Circle extends Shapes{
//will run when obj of circle is created
// hence override parent class
    @Override //This is called annotation
    void area(){
        System.out.println("The area of circle");
    }
}
