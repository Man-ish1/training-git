package DesignPattern.Factory;

public class FactoryLaptop {
    public Laptop getNewLaptop(String str){
        if(str.equals("secure")){
            return  new AppleLp();
        } else if (str.equals("order")) {
            return new DellLp();
        }
        else {
            return new HpLp();
        }
    }
}
