package com.driver;

public class B extends A {

    public static void main(String[] args) {
        B demo=new B();
        System.out.println( demo.meth());
        //B demo1=new B();
       // System.out.println(demo1.meth());
    }
@Override
    public String meth(){
        return "Method is overridden in Extendend class B";
}

}
