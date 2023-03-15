package DesignPattern.Factory;

public class FactoryBike {
    public BikeName getNewBike(String str){
        if(str.equals("GoodBike")){
            return new Honda();
        } else if (str.equals("HighBugget")) {
            return new Bullet();
        }
        else if(str.equals("RacingBike")) {
            return new Ktm();
        }
        else {
           return new NosuchBike();
        }
    }
}
