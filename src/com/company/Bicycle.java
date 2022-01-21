package com.company;

public class Bicycle implements Vehicle {

    private float speed = 10;

    @Override
    public float calculateTime(int distance) {
        float time = distance/speed;
        return time;
    }
}
