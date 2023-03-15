package DesignPattern.Factory;

public class FactoryMain {
    public static void main(String[] args) {
        FactoryLaptop fl=new FactoryLaptop();
        Laptop laptop=fl.getNewLaptop("secure");
        laptop.laptopSpace();
    }
}
