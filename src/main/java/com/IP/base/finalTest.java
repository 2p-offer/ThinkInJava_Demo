package com.IP.base;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class finalTest {
    private static Random rand = new Random(47);
    private String id;

    public finalTest(String id) {
        this.id = id;
    }

    //编译时常量,根据惯例，既是static又是final的域将大写表示
    private final int valueOne = 9;
    private static final int VALUE_TWO = 99;

    //典型的公共常量
    public static final int VALUE_THREE = 39;

    //运行时常量
    private final int i4 = rand.nextInt(20);
    static final int INT_5 = rand.nextInt(20);
    private Value v1 = new Value(11, 22);
    private final Value v2 = new Value(22, 33);
    private static final Value VAL_3 = new Value(33, 44);

    private final List<Integer> list = new ArrayList<Integer>();
    //数组Arrays
    private final int[] a = {1, 2, 3, 4, 5, 6};

    public String toString() {
        return id + ": " + "i4 = " + i4 + ", INT_5 = " + INT_5;
    }

    public static void main(String[] args) {
        finalTest fd1 = new finalTest("fd1");
//        //fd1.valueOne++; //不能对终态字段 FinalData.valueOne 赋值
//        fd1.v2.i++;
////        System.out.println(fd1.v2.i);
//        //fd1.v2.j++; //不能对终态字段 Value.j 赋值
//        fd1.v1 = new Value(12,23); // ok -- not final
//
//        for ( int i = 0 ; i < fd1.a.length ; i++ ) {
//            fd1.a[i]++; //Object isn't constant!
//        }
        //fd1.v2 = new Value(23,34);//不能对终态字段 FinalData.v2 赋值
        //fd1.VAL_3 = new Value(34,45); //不能对终态字段 FinalData.VAL_3 赋值
        //fd1.a = new int[3];//不能对终态字段 FinalData.a 赋值
//        System.out.println(fd1);
//        System.out.println("Creating new FinalData");
//        finalTest fd2 = new finalTest("fd2");
//        System.out.println(fd1);
//        System.out.println(fd2);
        System.out.println(fd1.list.hashCode());//1
        fd1.list.add(12);
        System.out.println(fd1.list.hashCode());//43
        fd1.list.add(11);
        System.out.println(fd1.list.hashCode());//1344

        fd1.list.set(1, 1);//1334
        System.out.println(fd1.list.hashCode());
        Integer i = 11;
        System.out.println(i.hashCode());
//        System.out.println(fd1.a[1]);

    }
}

class Value {
    int i;
    int b;

    public Value(int a, int b) {
        this.i = a;
        this.b = b;
    }
}
