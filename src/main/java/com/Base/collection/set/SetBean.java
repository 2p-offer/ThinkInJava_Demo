package com.Base.collection.set;

/**
 * 实现 Comparable，重写compareTo 是必须的
 */
public class SetBean implements
        Comparable<SetBean> {
    public int id;
    public int age;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    @Override
    public int compareTo(SetBean o){
        int tmp = o.age - this.age;

        if(tmp > 0){
            System.out.println("1>>>> behind");
            return 1;
        }else if(tmp == 0){

            System.out.println("0====");
            return 0;
        }else{
            System.out.println("-1<<<<<<before");
            return -1;
        }
    }
}
