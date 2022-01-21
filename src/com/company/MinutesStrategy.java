package com.company;

public class MinutesStrategy implements TimeFormatStrategy{

    public void printTime(float time, int distance) {
        System.out.printf("It will take %f minutes to cover %dm\n", time, distance);
    }
}
