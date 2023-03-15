package DesignPattern.Singleton;

import DesignPattern.Singleton.Singleton;

public class SingleMain {
    public static void main(String[] args) {
        Singleton ref=Singleton.getInstance();
        ref.show();
    }
}
