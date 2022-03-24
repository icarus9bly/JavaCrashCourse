package com.aditya;
import java.util.Scanner;

public class ScannerTest {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter int : ");
        int i = scan.nextInt();
        System.out.print("Enter double : ");
        double d= scan.nextDouble();
        Scanner scan_s = new Scanner(System.in);
        System.out.print("Enter string : ");
        String s= scan_s.nextLine();
        System.out.println();

        // Write your code here.

        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
    }
}
