package com.newtest.test8;

public class Fruits {
    private String shape;
    private String taste;

    public Fruits() {
    }

    public Fruits(String shape, String taste) {
        this.shape = shape;
        this.taste = taste;
    }
    public void eat(){
        System.out.println("水果可以供人们食用~");
    }
    //重写equals，比较对象的值是否相同。
    public boolean equals(Object obj){
        if (obj==null){
            return false;
        }
        Fruits temp = (Fruits) obj;
        if ((this.shape.equals(temp.shape)) && (this.taste.equals(temp.taste))) {
            return true;
        } else {
            return false;
        }
    }


    public String getShape() {
        return shape;
    }

    public void setShape(String shape) {
        this.shape = shape;
    }

    public String getTaste() {
        return taste;
    }

    public void setTaste(String taste) {
        this.taste = taste;
    }
}
