package com.haoqi;

/**
 * Created by Administrator on 2019/9/7. All right reserved.
 */
class Employee {
    String name;

    protected Employee() {
        System.out.println(1);
    }

    public void work() {
        System.out.println("±ðÀ²");
    }
}

class Teacher extends Employee implements Iface {
    Teacher() {
        System.out.println(2);
    }

    public void teach() {
        System.out.println("ÕâÑù");
    }
    public void work() {
        System.out.println(111111);
        super.work();
    }
}

interface Iface {
    public default void get() {
        System.out.println("get");
    }

    public static void gets() {
        System.out.println("get");
    }
}

public class day04 {
    public static void main(String[] args) {
        new Teacher().work();
    }
}
