package OOP.abstractDemo;

public class Son extends Parent{
    @Override
    void career(String name) {
        System.out.println("Hi"+name);
    }

    @Override
    void partner(String name, int age) {
        System.out.println("Hi"+name+"is"+name);

    }
}
