package org.example.slides_303_9;

public class Main {
    public static void main (String [ ] args){
        StaticDemoOne obj1 = new StaticDemoOne();
        StaticDemoOne obj2 = new StaticDemoOne();
        StaticDemoOne obj3 = new StaticDemoOne();
        StaticDemoOne obj4 = new StaticDemoOne();
        StaticDemoOne obj5 = new StaticDemoOne();
        /* only one copy of static variable will create and shared among all the instances of class but 5 copies of class variable will be create */
        System.out.println(" invoking static variable"); obj1.var1 = 30;
        obj2.var1 = 40;
        obj3.var1 = 50;
        obj4.var1 = 60;
        obj5.var1 = 70; System.out.println(obj1.var1); System.out.println(obj2.var1); System.out.println(obj3.var1); System.out.println(obj4.var1); System.out.println(obj5.var1);
        System.out.println(" invoking non static variable"); obj1.var3 = 200;
        obj2.var3 = 300;
        obj3.var3 = 400;
        obj4.var3 = 500;
        obj5.var3 = 600; System.out.println(obj1.var3); System.out.println(obj2.var3); System.out.println(obj3.var3); System.out.println(obj4.var3); System.out.println(obj5.var3);
    }
}
