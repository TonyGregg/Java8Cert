package org.genil.learning.java8.basics;

import java.time.LocalDateTime;

/**
 * Created by genil on 7/6/18 at 13 17
 **/
public class PlayerTester {
    public static void main(String[] args) {

        Player eric = new Player("Eric","W");
        Dice dice1 = new Dice();
        Dice dice2 = new Dice();

        eric.setDice1(dice1);
        eric.setDice2(dice2);
        ScoreCard scoreCard = new ScoreCard();
        eric.setScoreCard(scoreCard);



         eric.getDice1().roll();
         eric.getDice2().roll();

         int scoreForPlay = eric.getDiceScoreForPlay();
         eric.getScoreCard().setCurrentRoleScore(scoreForPlay);
         eric.getScoreCard().setTime(LocalDateTime.now());









        Player someNewPlayer = new Player("New Player","New player last name");




    }
}
