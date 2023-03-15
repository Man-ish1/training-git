package DesignPattern.Singleton;

public class Singleton {
    private int x;
    private static Singleton obj=new Singleton(23);
    private Singleton(int x){
        this.x=x;
    }
    public void show(){
        System.out.println("x: "+x);
    }
    public static  Singleton getInstance(){
        return obj;
    }
}
