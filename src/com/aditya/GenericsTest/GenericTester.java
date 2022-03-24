package com.aditya.GenericsTest;

public class GenericTester {
    public static void main(String[] args){
        GenericExampleClass<String,Integer> stru = new GenericExampleClass<String,Integer>();
        stru.someVaru="Hola";
        stru.someOtherVaru=99999;
        stru.someExampleMethi("kjkkkk");
        System.out.println(stru.someVaru);
        System.out.println(stru.someOtherVaru);

        GenericExampleClass<Integer,String> intu = new GenericExampleClass<>();
        intu.someExampleMethi(838923923);
        System.out.println(intu.someOtherVaru);

        genericMethod("stringy");
        genericMethod(6779);

        String somevordor = "Storororor";
        Integer someOtherVordor = 48449393;
        genericMethodWithMultipleTypes("Storororor", 8999);
        genericMethodWithMultipleTypes(somevordor,someOtherVordor);

        String returnedVal = genericMethodWithReturn("Stringer returned",1010101);
        System.out.println(returnedVal);
    }
    public static <T> void genericMethod(T someVar){
        System.out.println("My somevar is "+ someVar);
    }
    public static <T,V> void genericMethodWithMultipleTypes(T someVordor, V someOtherVordor){
        System.out.println("somevordor is : "+ someVordor);
        System.out.println("someOthervordor is : "+ someOtherVordor);
    }
    public static <T,V> T genericMethodWithReturn(T someVar, V someOtherVar){
//        System.out.println(someVar);
        System.out.println(someOtherVar);
        return someVar;
    }
}
