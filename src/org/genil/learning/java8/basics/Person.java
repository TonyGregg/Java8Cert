package org.genil.learning.java8.basics;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 * Created by genil on 7/2/18 at 09 03
 **/
public class Person implements Serializable {
    public Person(String name, String email, int age) {
        this.name = name;
        this.email = email;
        this.age = age;
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws ClassNotFoundException, IOException {
        System.out.println("Inside custom write object");
//        objectOutputStream.defaultWriteObject();
        email = email + "@gmail.com";
        objectOutputStream.writeUTF(name);
        objectOutputStream.writeUTF(email);
        objectOutputStream.writeInt(age);

    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException,IOException {

//        objectInputStream.defaultReadObject();

        name = objectInputStream.readUTF();
        email = objectInputStream.readUTF();
        age = objectInputStream.readInt();

    }



    private String name;
    private String email;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
