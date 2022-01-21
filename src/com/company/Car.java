package com.company;

public class Car implements Vehicle {

    private float speed = 60;

    @Override
    public float calculateTime(int distance) {
        float time = distance/speed;
        return time;
    }
}
