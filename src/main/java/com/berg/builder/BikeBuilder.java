package com.berg.builder;

public abstract class BikeBuilder<T> {
    //构建bike的框架
    public abstract T setFrame(int frameNumber);
    //构建bike的轮子
    public abstract T setWheels(int wheelNumber);
    //获取构建好的完整的产品
    public abstract Bike build();
}
