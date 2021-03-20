package com.newtest.test8;

public class Test {
    public static void main(String[] args) {
        //创建两个父类，传入相同的参数值
        Fruits fruits1 = new Fruits("椭圆形","苦涩");
        Fruits fruits2 = new Fruits("椭圆形","苦涩");
        fruits1.eat();
        //测试重写的equals方法，判断两个对象的值是否相同
        System.out.println("两个父类对象的比较"+fruits1.equals(fruits2));
        System.out.println("=================================");
        //实例化Waxberry对象
        Waxberry waxberry1 = new Waxberry();
        waxberry1.face();
        waxberry1.eat();
        System.out.println("=================================");
        //测试重写toString方法，输出子类对象信息.
        System.out.println(waxberry1.toString());
        System.out.println("=================================");
        //实例化Banana对象，并传入参数
        Banana banana1 = new Banana("短而圆","果肉香甜","仙人蕉");
        banana1.advantage();
        banana1.advantage("黄色");
    }
}
