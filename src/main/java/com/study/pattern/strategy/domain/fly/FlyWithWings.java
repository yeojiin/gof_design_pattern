package com.study.pattern.strategy.domain.fly;

public class FlyWithWings implements FlyBehavior{
    @Override
    public void fly() {
        System.out.println("저는 훨훨 날아요!");
    }
}
