package com.company;

public class SecondsStrategy implements TimeFormatStrategy{

    public void printTime(float time, int distance) {
        System.out.printf("It will take %f seconds to cover %dm\n", time, distance);
    }
}
