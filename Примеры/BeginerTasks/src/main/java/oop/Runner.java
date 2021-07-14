package oop;


public class Runner {

    public static void main(String... a){
        ExampleObj o1=new ExampleObj(1);
        ExampleObj o2=new ExampleObj(1);
        System.out.println(o1.hashCode());
        System.out.println(o2.hashCode());
        System.out.println(o2.equals(o1));
        System.out.println(o1.toString());
        System.out.println(o2.toString());
    }


}
