package com.courses.tasks.tictactoe;

/**
 * Created by VSulevskiy on 19.07.2015.
 */
public class GameLogic {
    //default
    public AiGameStrategy aiGameStrategy;
    int[] positions = new int[9];

    public boolean makeTurn(int position){
        positions[position] = 1;
        return true;
    }
    public int aIMakeTurn(){
        return aiGameStrategy.aiMakeTurn(positions);
    }

    public void setAiGameStrategy(AiGameStrategy gameStrategy){
        this.aiGameStrategy = gameStrategy;
    }

    public boolean checkPlayerWin() {
        if (checkWin(1)) {
            return true;
        }
            return false;
    }

    public boolean checkAiWin() {
        if (checkWin(-1)) {
            return true;
        }
        return false;
    }

    private boolean checkWin(int who){
        if (checkHorizontal(who)) {
                return true;
        } else if (checkVertical(who)) {
        return true;
        } else if (checkDiagonal(who)){
            return true;
        }
        return false;

    }

    private boolean checkDiagonal(int who) {
        int counter = 0;
        int shift = (int)Math.round(Math.sqrt(positions.length));
        for (int i = 0; i < positions.length; i = i + shift + 1) {
            if (positions[i] == who){
                counter++;
            }
        }
        if(counter == shift){
            return true;
        }
        counter = 0;
        for (int i = shift - 1; i < shift * (shift - 1) + 1; i = i + shift - 1) {
            if (positions[i] == who){
                counter++;
            }
        }
        if(counter == shift){
            return true;
        }
        return false;
    }

    private boolean checkVertical(int who) {
        int counter = 0;
        int shift = (int)Math.round(Math.sqrt(positions.length));
        for (int i = 0; i < shift; i++) {
            for (int j = i; j < ((shift * (1 + i) + 1)); j = j + shift) {
                if (positions[j] == who){
                    counter++;
                }
            }
            if(counter == shift){
                return true;
            } else {
                counter = 0;
            }
        }
        return false;
    }

    private boolean checkHorizontal(int who) {
        int counter = 0;
        int shift = (int)Math.round(Math.sqrt(positions.length));
        for (int i = 0; i < shift; i++) {
            for (int j = i * shift; j < (i * shift) + shift; j++) {
                if (positions[j] == who){
                    counter++;
                }
            }
            if(counter == shift){
                return true;
            } else {
                counter = 0;
            }
        }
        return false;
    }
}
