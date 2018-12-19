package chap5;

/**
 * Created by genil on 12/18/18 at 16 25
 **/
class Parent {
    int getInt(String string) throws Exception {
        return Integer.parseInt(string);
    }
}

class Child extends Parent {
    int getInt(String string) {
        System.out.println("At child...");
        return Integer.parseInt(string);
    }
}

public class ExceptionHandlingDemo {
    public static void main(String[] args) throws Exception {
        Parent parent = new Child();

        int x;
        x = parent.getInt("2");


    }
}
