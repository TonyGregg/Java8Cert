package org.genil.learning.java8.basics;

import java.io.*;

/**
 * Created by genil on 7/2/18 at 09 02
 **/
public class SerializationDemo {
    public static void main(String[] args) {
        Person antony = new Person("Antony G","antonygenil",35);
        Person greg = new Person("Genil Greg","shenilgreg",32);

        try {
            FileOutputStream fileOutputStream = new FileOutputStream("Person.ser");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(antony);

            objectOutputStream.close();
            fileOutputStream.flush();
            fileOutputStream.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        Person deserializedUser = null;
        try
        {
            FileInputStream fileIn = new FileInputStream("Person.ser");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            deserializedUser = (Person) in.readObject();
            in.close();
            fileIn.close();

            // verify the object state
            System.out.println(deserializedUser.getName());
            System.out.println(deserializedUser.getEmail());
            System.out.println(deserializedUser.getAge());
//            System.out.println(deserializedUser.getDateOpened());
        }
        catch (IOException ioe)
        {
            ioe.printStackTrace();
        }
        catch (ClassNotFoundException cnfe)
        {
            cnfe.printStackTrace();
        }


    }
}
