package com.newtest.test8;

final public class Waxberry extends Fruits {
    private String color;

    //调用父类的构造方法，实现子类所有对属性的赋值
    public Waxberry() {
        super("圆形", "酸甜适中");
        this.color = "紫红色";
    }
    //描述杨梅信息的的方法
     final public void face(){
         System.out.println("杨梅："+this.getShape()+"、"+this.getTaste()+",非常好吃");

    }
    //重写父类eat方法
    public void eat(){
        System.out.println("杨梅酸甜适中，非常好吃");
    }
    public String toString(){
       String str = this.getShape()+this.getTaste()+this.color;
        return str;
    }
}
