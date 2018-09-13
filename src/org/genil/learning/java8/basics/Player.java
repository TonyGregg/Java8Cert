package org.genil.learning.java8.basics;

/**
 * Created by genil on 7/6/18 at 13 14
 **/
public class Player {

    private String firstName;
    private String lastName;
    private int maxHighScore;

    public  int getDiceScoreForPlay() {
        return getDice1().getDisplayFacetValue() + getDice2().getDisplayFacetValue();
    }

    public ScoreCard getScoreCard() {
        return scoreCard;
    }

    public void setScoreCard(ScoreCard scoreCard) {
        this.scoreCard = scoreCard;
    }

    ScoreCard scoreCard;



    public Player(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    private Dice dice1;
    private Dice dice2;

    public Dice getDice1() {
        return dice1;
    }

    public void setDice1(Dice dice1) {
        this.dice1 = dice1;
    }

    public Dice getDice2() {
        return dice2;
    }

    public void setDice2(Dice dice2) {
        this.dice2 = dice2;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getMaxHighScore() {
        return maxHighScore;
    }

    public void setMaxHighScore(int maxHighScore) {
        this.maxHighScore = maxHighScore;
    }
}
