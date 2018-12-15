package org.genil.learning.java8.passRefernce;

/**
 * Created by genil on 12/6/18 at 19 30
 **/
public class CardBoard {
    Short st = 320;

    CardBoard go(CardBoard cardBoard) {
        cardBoard = null;
        return cardBoard;
    }

    public static void main(String[] args) {
        CardBoard cb1 = new CardBoard();
        CardBoard cb2 = new CardBoard();

        CardBoard cb3 = cb1.go(cb2);

        if(cb3 == null) {
            System.out.println("Yes cb3 is null");
        }

        if(cb2 == null) {
            System.out.println("yes cb2 is also null");
        }
    }
}
