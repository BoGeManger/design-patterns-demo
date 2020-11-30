package com.berg.builder;

public class ConcreteBikeBuilder extends BikeBuilder<ConcreteBikeBuilder> {

    Bike  bike;

    public ConcreteBikeBuilder(){
        bike = new Bike();
    }
    @Override
    public ConcreteBikeBuilder setFrame(int frameNumber) {
        bike.setFrameNumber(frameNumber);
        return this;
    }

    @Override
    public ConcreteBikeBuilder setWheels(int wheelNumber) {
        bike.setWheelNumber(wheelNumber);
        return this;
    }

    @Override
    public Bike build() {
        return bike;
    }

}
