package com.aditya;

//import java.util.Scanner;

import com.aditya.GenericsTest.InterfaceDemo;

import static com.aditya.GenericsTest.InterfaceDemo.MAX;

public class Main implements InterfaceDemo2, InterfaceDemo {
    Main(){
        System.out.println("Doing Something");
    }

    public static void main(String[] args) {
	// write your code here
        String aa= "45890";
        System.out.println(aa.length());
        System.out.println(aa.charAt(3));
        System.out.print("Enter bro: ");
//        Scanner kb= new Scanner(System.in);
//        String out=kb.nextLine();
//        System.out.println(out);
        if ("x" == "x"){
            System.out.println("Yo it's true");
        }
        int index = 5;
        do{
            System.out.println(index);
            index++;
        }while (index <= 5);

        ScopeTest ss1=new ScopeTest();
        ss1.a=12023;
        ss1.b=23;
        System.out.println(ss1.a);
        System.out.println(ScopeTest.a);
        System.out.println(ss1.b);

        ScopeTest ss2=new ScopeTest();
        System.out.println(ss2.a);
        System.out.println(ss2.b);
        System.out.println(InterfaceDemo.MAX);
        Main sc = new Main();
    }

    public int something() {
        return 0;
    }
}
