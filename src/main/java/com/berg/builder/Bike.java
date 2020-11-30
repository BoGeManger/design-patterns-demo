package com.berg.builder;

public class Bike {

    //自行车车架数量
    int frameNumber;
    //自行车轮子数量
    int wheelNumber;

    public Bike(){
        frameNumber = 1;
        wheelNumber = 4;
    }

    public int getFrameNumber() {
        return frameNumber;
    }

    public void setFrameNumber(int frameNumber) {
        this.frameNumber = frameNumber;
    }

    public int getWheelNumber() {
        return wheelNumber;
    }

    public void setWheelNumber(int wheelNumber) {
        this.wheelNumber = wheelNumber;
    }
}
