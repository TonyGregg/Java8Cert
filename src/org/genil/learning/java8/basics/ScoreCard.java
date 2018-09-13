package org.genil.learning.java8.basics;

import java.time.LocalDateTime;

/**
 * Created by genil on 7/6/18 at 13 24
 **/
public class ScoreCard {

    public int getTotalScore() {
        return totalScore;
    }

    public void setTotalScore(int totalScore) {
        this.totalScore = totalScore;
    }

    public LocalDateTime getTime() {
        return time;
    }

    public void setTime(LocalDateTime time) {
        this.time = time;
    }

    public int getCurrentRoleScore() {
        return currentRoleScore;
    }

    public void setCurrentRoleScore(int currentRoleScore) {
        this.currentRoleScore = currentRoleScore;

    }

    int totalScore = 0;
    private LocalDateTime time;

    int currentRoleScore;

}
