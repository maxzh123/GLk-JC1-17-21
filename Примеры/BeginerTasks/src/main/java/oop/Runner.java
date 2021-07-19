package oop;


import java.util.*;

public class Runner {

    public static void main(String... a){
        ExampleObj o1=new ExampleObj(1,"Петя");
        ExampleObj o2=new ExampleObj(1,"Вася");
        ExampleObj o3=new ExampleObj(1,"Олежа");

        System.out.println(o1.hashCode());
        System.out.println(o2.hashCode());
        System.out.println(o2.equals(o1));
        System.out.println(o1);
        System.out.println(o2);
        System.out.println("-------------------------------------------------------------------------------------------------------------------");
        List<ExampleObj> lst =new ArrayList<ExampleObj>();
        lst.add(o1);
        lst.add(o2);
        lst.add(o3);
        lst.add(new ExampleObj(9,"Вася"));
        lst.add(new ExampleObj(83,"Вася"));
        lst.add(new ExampleObj(88,"Вася"));
        lst.add(new ExampleObj(2,"Петя"));
        lst.add(new ExampleObj(3,"Вася"));
        lst.add(new ExampleObj(7,"Вася"));

        Collections.sort(lst);
        for (ExampleObj i:lst){
            System.out.println(i);
        }

    }


}
