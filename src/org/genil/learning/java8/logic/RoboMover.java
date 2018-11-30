package org.genil.learning.java8.logic;


/**
 * Created by genil on 11/1/18 at 14 29
 **/
public class RoboMover {
    /**
     * Possible moves L - Left, R - Right, M - Move
     */

    enum MOVES  {L, R, M;};

    enum POSITIONS {SOUTH, NORTH, WEST, EAST;};

    CurrentPosition currentPosition = new CurrentPosition();

    private void updatePosition(MOVES move) {
        /**
         * Left
         *
         * IF S, move by L makes  to EAST
         * IF
         */

        switch (move) {
            case L:
                if(currentPosition.currentFacingDirection.equals(POSITIONS.SOUTH)) {
                    currentPosition.currentFacingDirection = POSITIONS.EAST;

                }else if(currentPosition.currentFacingDirection.equals(POSITIONS.EAST)) {
                    currentPosition.currentFacingDirection =  POSITIONS.NORTH;
                }else if(currentPosition.currentFacingDirection.equals(POSITIONS.NORTH)) {
                    currentPosition.currentFacingDirection =  POSITIONS.WEST;
                }else {
                    currentPosition.currentFacingDirection =  POSITIONS.SOUTH;
                }
                break;

            case R:
                if(currentPosition.currentFacingDirection.equals(POSITIONS.SOUTH)) {
                    currentPosition.currentFacingDirection =  POSITIONS.WEST;

                }else if(currentPosition.currentFacingDirection.equals(POSITIONS.EAST)) {
                    currentPosition.currentFacingDirection =  POSITIONS.SOUTH;
                }else if(currentPosition.currentFacingDirection.equals(POSITIONS.NORTH)) {
                    currentPosition.currentFacingDirection =  POSITIONS.EAST;
                }else  {
                    currentPosition.currentFacingDirection =  POSITIONS.NORTH;
                }
                break;
            case M:
                updateCoOrdinates();


        }

    }


    private void updateCoOrdinates() {

        /**
         * South moves Y by -1, X nothing
         * North moves Y by +1, X nothing
         *
         * East moves x by +1, Y nothing
         * West moves x by -1 ,Y nothing
         */

        switch (currentPosition.currentFacingDirection) {
            case SOUTH:
                currentPosition.y--;
                break;
            case NORTH:
                currentPosition.y++;
                break;
            case EAST:
                currentPosition.x++;
                break;
            case WEST:
                currentPosition.x--;

        }

    }

    private MOVES getMove(char ch) {
        if(ch == 'L'){
            return MOVES.L;
        }else if(ch == 'R') {
            return MOVES.R;
        }else {
            return MOVES.M;
        }
    }


    public static void main(String[] args) {

        RoboMover mover = new RoboMover();

        String runString = "LMLMLMLMM";

        char[] chars = runString.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            MOVES moves = mover.getMove(chars[i]);
            System.out.println("Current move "+moves);
            mover.updatePosition(moves);
            System.out.println(mover.currentPosition);

        }


    }



}

class CurrentPosition {

    @Override
    public String toString() {
        return "CurrentPosition{" +
                "x=" + x +
                ", y=" + y +
                ", currentFacingDirection=" + currentFacingDirection +
                '}';
    }

    int x=1, y=2;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public RoboMover.POSITIONS getCurrentFacingDirection() {
        return currentFacingDirection;
    }

    public void setCurrentFacingDirection(RoboMover.POSITIONS currentFacingDirection) {
        this.currentFacingDirection = currentFacingDirection;
    }

    RoboMover.POSITIONS currentFacingDirection = RoboMover.POSITIONS.NORTH;



}
