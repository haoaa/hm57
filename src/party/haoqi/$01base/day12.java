package party.haoqi.$01base;

import java.util.Date;
import java.util.Objects;

/**
 * Created by Administrator on 2020/2/1. All right reserved.
 */
class Person {
    private String name;
    private int age;
    Person(String name, int age) {
        this.age = age;
        this.name = name;
    }
    @Override
    public String toString() {
        return "Person{" + "name='" + name + '\'' + ", age=" + age + '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age &&
                Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}

class day12 {
    public static void main(String[] args) {
        Person person = new Person("Chloe", 34);
        Person person2 = new Person("Chloe", 34);
        //System.out.println(person);
        //System.out.println(person.equals(person2));
        //System.out.println("s".equals("s"));
        System.out.println(new Date(0L));
    }
}
