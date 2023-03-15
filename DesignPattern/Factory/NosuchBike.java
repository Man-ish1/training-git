package DesignPattern.Factory;

public class NosuchBike implements BikeName{
    @Override
    public void name(){
        System.out.println("sorry we have no this type of bike");
    }
}
