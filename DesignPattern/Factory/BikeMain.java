package DesignPattern.Factory;

public class BikeMain {
    public static void main(String[] args) {
        FactoryBike factoryBike=new FactoryBike();
        BikeName bikeName=factoryBike.getNewBike("GoodBike");
        bikeName.name();
    }
}
