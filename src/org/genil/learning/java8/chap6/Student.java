package org.genil.learning.java8.chap6;

/**
 * Created by Antony Genil Gregory on 12/23/2018 11:42 AM
 * For project : Java8Cert
 **/
public class Student {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    String name;
    int age;
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public Student() {
        this("sdf",23);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
