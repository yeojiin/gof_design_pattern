package com.study.pattern.strategy.domain.quack;

public class Quack implements QuackBehavior{

    @Override
    public void quack() {
        System.out.println("꽥꽥");
    }
}
