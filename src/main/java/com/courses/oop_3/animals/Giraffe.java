package com.courses.oop_3.animals;

/**
 * Created by VSulevskiy on 09.07.2015.
 */
public class Giraffe extends Wild {
    public Giraffe(int id, int age, double weight, String color, boolean isPredator) {
        super(id, age, weight, color, isPredator);
    }

    public Giraffe() {
    }


    public String toString(){
        String result ="";
        result += "Id: " + getId();
        result += " Age: " + getAge();
        result += " IsPredator: " + isPredator();
        return result;
    }
}
