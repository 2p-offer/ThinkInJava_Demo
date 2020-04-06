package com.Base.base.init;

import java.util.Arrays;

public class Book99_ArrayInit {
    public static void main(String[] args) {
        ArraySon[] test;
        test=new ArraySon[]{
                new ArraySon(1),
                new ArraySon(2),
                new ArraySon(3),
        };

        //这种方式只能在定义的时候使用，如果你想用这种方式给test赋值，是不被允许的。
        ArraySon[]  test1 = {
                new ArraySon(1),
                new ArraySon(2),
                new ArraySon(3),
        };
        System.out.println(Arrays.toString(test));
    }
}

class ArraySon{
    int marker;
    ArraySon(int marker){
        this.marker=marker;
    }

    @Override
    public String toString() {
        return "ArraySon{" +
                "marker=" + marker +
                '}';
    }
}