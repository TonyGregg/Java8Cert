package org.genil.learning.java8.passRefernce;

import org.genil.learning.java8.chap6.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * Created by Antony Genil Gregory on 12/28/2018 8:28 PM
 * For project : Java8Cert
 **/
public class PassReferenceDemo {

    String string = this.toString();

    public static void main(String[] args) {
        Stack s1 = new Stack ();
        Stack s2 = new Stack ();
        processStacks (s1,s2);
        System.out.println (s1 + "    "+ s2);


        s2 = s1;

        System.out.println (s1 + "    "+ s2);

        Student student1 = new Student();
        Student student2 = new Student();



        processStudents(student1, student2);

        System.out.println(student1+" "+student2);


        List<String> list1 = new ArrayList<>();
        List<String> list2 = new ArrayList<>();

        processList(list1, list2);

        System.out.println(list1 + " ,  "+ list2);

        Integer x = 200;

        changeInt(x);

        System.out.println("Is integer changed "+x); // Nope !! They are IMMUTABLE

        int[] ints = {1};

        changeInt(ints);

        System.out.println("Is int changed ? "+ints[0]); //Yes, it did

        String str = "--0.50";

        x =  (int) Math.round( Double.parseDouble("-0.50") );

        System.out.println("Integer value "+x);


    }

    static private void changeInt(int[] ints) {
        ints[0]++;
    }


    public static void processStacks(Stack x1, Stack x2) {
        x1.push(new Integer("100")); //assume that the method push adds the passed object to the stack.
        x2 = x1;

    }

    public static void processStudents(Student student1, Student student2) {
        student1 = new Student("Antony", 38);
        student2 = student1;

        student1.setAge(3222);

        Object object = new Object();


        System.out.println("In method. . ");

        System.out.println(student1 + " " + student2);

        System.out.println("Method exit. ");
    }

    private static void processList(List<String> list1, List<String> list2) {
        list1.add("str1");
        list2  = list1;
    }

    private static void changeInt(Integer integer) {
        integer++;


    }
}
