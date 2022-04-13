package com.aditya;

public class ScopeTest {
    static int a = 200; // Class Variables or Static variables. Any change we be reflected to all instances.
    int b = 89; // instance variables
    public static void main(String[] args) {
        int i = 1;
        for(int ii=0; ii<100; ii++){
            System.out.println(ii);
        }
        System.out.println(a);
    }
    void someMethod(){
//        this.asks="sxsx";
//        this.b=90;
        System.out.println(this.a);
    }
}
