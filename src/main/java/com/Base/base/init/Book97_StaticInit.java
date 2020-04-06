package com.Base.base.init;

public class Book97_StaticInit {

    public static void main(String[] args) {
        /**
         * Son's construct :1
         * Son's construct :2
         * Son's construct :0
         * Father's contrucrt:22
         * son's function :11
         *
         * 这意味着，在类被调用的时候,不管是创建对象，还是直接的调用静态变量，才会初始化静态数据。把 1.2 颠倒，可以发现一些眉目
         * 根据AppointInit。 会在调用方法之前，初始化成员变量，现在可知道。会在初始化成员变量之前，先初始化静态变量。
         */
        Father father=new Father(22); //1
        Father.s1.fun(11); //2
    }
}
class Son{
    Son(int marker){
        System.out.println("Son's construct :"+marker);
    }
    void fun(int marker){
        System.out.println("son's function :"+marker);
    }
}

class Father{
    Son s=new Son(0);
    static Son s1;
    static Son s2;
    static{
        s1=new Son(1);
        s2=new Son(2);
    }
    Father(int marker) {
        System.out.println("Father's contrucrt:"+marker);
    }
}
