package com.Base.collection.set;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class TestSetMain {
    public static void main(String[] args) {
        SetBean setBean=new SetBean();
        setBean.id=1;
        setBean.age=1;
        SetBean setBean2=new SetBean();
        setBean2.id=2;
        setBean2.age=2;
        SetBean setBean3=new SetBean();
        setBean3.id=3;
        setBean3.age=3;

        Set<SetBean> set=new TreeSet<>();
//        Set<SetBean> set=new TreeSet<>(new Comparator<SetBean>() {
//            @Override
//            public int compare(SetBean setBean, SetBean t1) {
//                if(setBean.age>t1.age){
//                    return 1;
//                }else if(setBean.age==t1.age){
//                    return 0;
//                }else{
//                    return -1;
//                }
//            }
//        });

        set.add(setBean);
        set.add(setBean2);
        for(SetBean sb:set){
            System.out.println(sb.id+"___"+sb.age);
        }
        System.out.println("-=-=-=-=-=-=-=-=-=-");
        set.add(setBean3);
        for(SetBean sb:set){
            System.out.println(sb.id+"___"+sb.age);
        }
        System.out.println("-=-=-=-=-=-=-=-=-=-");
        setBean2.age=10;
        set.remove(setBean2);
        set.add(setBean2);
        for(SetBean sb:set){
            System.out.println(sb.id+"___"+sb.age);
        }
        System.out.println("-=-=-=-=-=-=-=-=-=-");
        SetBean setBean4=new SetBean();
        setBean4.id=2;
        setBean4.age=2;
        set.add(setBean4);
        for(SetBean sb:set){
            System.out.println(sb.id+"___"+sb.age);
        }
    }
}
