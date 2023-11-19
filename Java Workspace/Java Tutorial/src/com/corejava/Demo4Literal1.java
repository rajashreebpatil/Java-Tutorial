package com.corejava;

public class Demo4Literal1 {
    public static void main(String[]args){
        //1.add two numbers
        int a=10;
        int b=10;
        int c=a+b;
        System.out.println(c);

        // 2.widening
        int d= 10;
        float f= d;
        System.out.println(d);
        System.out.println(f);

        //3.narrowing
        float g=10.5f;
        int h= (int)g;
        System.out.println(g);
        System.out.println(h);

        //overflow
        int n=131;
        byte m=(byte)n;
        System.out.println(n);
        System.out.println(m);


    }
}
