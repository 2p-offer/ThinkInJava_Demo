package com.Base.base.init;

public class Book93_AppointInit {

    int i = f();

    int j = g(i);

    private int f() {
        return 10;
    }


    private int g(int n) {
        return n * 10;
    }

    public static void main(String[] args) {
        /**
         * 结果：
         * construct(0)
         * construct(1)
         * construct(2)
         * Test construct
         * construct(22)
         * there is Test'tmp()
         *
         * 意味着，方法的的调用之前， 甚至构造方法调用之前，就会吧类里面的成员变量初始化。
         */
        Test t=new Test();
        t.tmp();


    }


}

class Tmp {
    Tmp(int tmp) {
        {
            System.out.println("construct(" + tmp + ")");
        }
    }
}

class Test{
    Tmp t=new Tmp(0);
    Test(){
        System.out.println("Test construct");
         t2=new Tmp(22);
    }
    Tmp t1=new Tmp(1);
    void tmp(){
        System.out.println("there is Test'tmp()");
    }
    Tmp t2=new Tmp(2);

}