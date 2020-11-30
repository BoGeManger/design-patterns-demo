package com.berg.builder;

public class BuilderPatternDemo {

    public static void main(String[] args) {
        Bike bike = new Bike();
        BikeBuilder  builder = new ConcreteBikeBuilder();
        BikeDirector director = new BikeDirector();
        director.createBike(builder);
        bike = builder.build();
        System.out.println("车架frame:" + bike.getFrameNumber()+"个");
        System.out.println("轮子wheel:" + bike.getWheelNumber()+"个");

        Bike newbike = new ConcreteBikeBuilder().setFrame(1).setWheels(1).build();
        System.out.println("车架frame:" + newbike.getFrameNumber()+"个");
        System.out.println("轮子wheel:" + newbike.getWheelNumber()+"个");
    }
}
