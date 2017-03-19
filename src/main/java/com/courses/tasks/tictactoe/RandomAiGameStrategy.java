package com.courses.tasks.tictactoe;

/**
 * Created by VSulevskiy on 19.07.2015.
 */
public class RandomAiGameStrategy implements AiGameStrategy {
    @Override

    public int aiMakeTurn(int[] positions) {
        int result = 0;
        while (result == 0){
            result = turn(positions);
        }
        return result;
    }

    private int turn(int[] field) {
        int result = (int) (Math.random() * 10);
        if (result < field.length) {
            if(field[result] == 0){
                field[result] = -1;
                return result;
            }
        }
        return  0;
    }
}
