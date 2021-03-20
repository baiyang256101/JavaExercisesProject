package com.newtest.test8;

public class Banana extends Fruits{
    private String variety;
    //带参构造实现对所有属性的赋值
    public Banana(String shape, String taste, String variety) {
        super(shape, taste);
        this.variety = variety;
    }
    public void advantage(){
        System.out.println(this.variety+"果形"+this.getShape()+","+this.getTaste()+"，可供食用");
    }
    public void advantage(String color){
        System.out.println(this.variety+"颜色为："+color);
    }

}
