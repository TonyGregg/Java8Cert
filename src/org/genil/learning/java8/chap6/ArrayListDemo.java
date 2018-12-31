package org.genil.learning.java8.chap6;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by genil on 12/14/18 at 17 55
 **/
public class ArrayListDemo {
    public static void  main(String[] args) {
        ArrayList<String> cities = new ArrayList<>(200);

        System.out.println("size : "+cities.size());

        String myName = "Antony";

        cities.add("NY");
        cities.add("SFO");
        cities.add("TPA");
        cities.add("ATL");
        cities.add("TPA");
        cities.add("MIA");

        cities.add(myName);

        myName = "Tony - Just simple";



//        cities.add(200,"HALO");// null ptr exception


        System.out.println("Indiex of TPA "+cities.indexOf("TPA"));

        cities.remove("TPA");

        System.out.println(" Citiies :: " + cities);

        ArrayList<Integer> ages = new ArrayList<>();

        ages.add(2);
        ages.add(20);
        ages.add(30);
        ages.add(1);

        System.out.println("Ages before remove : "+ages);

        ages.remove(1); // removes the index !!!

        ages.remove(new Integer(1)); // removes the obeject



        System.out.println("Ages "+ages);

        Integer i1 = 200;
        Integer i2 = 200; //till 127 it compares...

        if(i1 != i2)
            System.out.println("different objects");

        if(i1 == i2)
            System.out.println("same objects");


        List<Integer> list = new ArrayList<Integer>();

        Integer someInteger = new Integer(20);
        list.add(new Integer(2));
        list.add(new Integer(1));
        list.add(new Integer(0));
        list.add(someInteger);

        list.remove(list.indexOf(0));

        System.out.println( "List :: "  +list);

        someInteger += 200;
        System.out.println("someInteger "+ someInteger +" List :: "  +list);

        List<StringBuilder> stringBuilderList = new ArrayList<>();

        StringBuilder stringBuilder = new StringBuilder("1st");
        StringBuilder stringBuilder2 = new StringBuilder("2nd ");

        stringBuilderList.add(stringBuilder);
        stringBuilderList.add(stringBuilder2);

        stringBuilder.append("1st one modified.. . ");

        System.out.println(" list of string builders "+stringBuilderList);

        stringBuilderList.remove(new StringBuilder("2nd "));

        System.out.println(" list of string builders "+stringBuilderList);


        System.out.println("Removing by new StringBUilder did not work.. how about removing the obje");

        stringBuilderList.remove(stringBuilder2);

        System.out.println("After removing "+stringBuilderList);



        System.out.println("Trying with custom objects now");

        List<Student> students = new ArrayList<>();

        students.add(new Student("Antony",38));
        students.add(new Student("Steffi",32));
        students.add(new Student("Jotham",7));
        students.add(new Student("Elisha",2));

        Student mari = new Student("Mari",200);
        students.add(new Student("Mari",200));

        students.remove(new Student("Mari",200));
        for ( Student student: students) {
            System.out.println(student);
        }

        System.out.println("custom list demo done ..");

        List<Character> characterList = new ArrayList<>();
        characterList.add(0, 'V');
        characterList.add('T');
        characterList.add(1, 'E');
        characterList.add(3, 'O');





        System.out.println("Size of the chacrters array list "+characterList.size());

        if(characterList.contains('O')) {
            System.out.println("Yes, it does");
//            characterList.remove(3); // works fine
//            characterList.remove('V');

        }

        for(char ch : characterList) {
            System.out.print(" -- " +ch);
        }

        System.out.println();


        List<Integer> lis1t = new ArrayList<>();
        lis1t.add(100);
        lis1t.add(200);
        lis1t.add(100);
        lis1t.add(200);

        lis1t.add(new Integer(500));
        lis1t.add(new Integer(600));

        lis1t.remove(new Integer(100)); // Yes, it removes !
        lis1t.remove(new Integer(500)); // yes, it removes !!






        System.out.println("Integer list :"+lis1t);



//
//        List<String> trafficLight = new ArrayList<>();
//        trafficLight.add(1, "RED"); // null ptr excception !!!
//        trafficLight.add(2, "ORANGE");
//        trafficLight.add(3, "GREEN");
//
//        trafficLight.remove(new Integer(2));
//
//        System.out.println(trafficLight);


        lis1t = new ArrayList<>();
        lis1t.add(110);
        lis1t.add(new Integer(110));
        lis1t.add(110);

        lis1t.removeIf(i -> i == 110);
        System.out.println("Moidified integer list : "+lis1t);



        Boolean [] arr = new Boolean[2];
        List<Boolean> booleanList = new ArrayList<>();
        booleanList.add(arr[0]);
        booleanList.add(arr[1]);



        if(booleanList.remove(0)) {
            booleanList.remove(1);
        }

        System.out.println(booleanList);

        List s1 = new ArrayList( );

        s1.add("a");
        s1.add("b");
        s1.add(1, "c");

        List s2 = new ArrayList(  s1.subList(1, 1) );
        s1.addAll(s2);
        System.out.println(s1);

    }
}
