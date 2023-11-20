package com.study.pattern.strategy.domain.duck;

import com.study.pattern.strategy.domain.fly.FlyBehavior;
import com.study.pattern.strategy.domain.quack.QuackBehavior;

public abstract class Duck {

    // 행동 인터페이스 선언
    // 두 클래스를 합쳐 '구성'
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    protected Duck() {
    }

    public abstract void display();     // 추상메소드로 서브클래스에서 변환하여 사용 가능

    public void performFly() {
        // 행동 클래스에 위임
        flyBehavior.fly();
    }

    public void performQuack() {
        // 행동 클래스에 위임
        quackBehavior.quack();
    }

    public void swim() {
        // Duck 속성을 가진 클래스가 모두 공통으로 사용
        System.out.println("모든 오리는 물에 뜹니다. 가짜 오리도 뜨죠");
    }

    public void changeFlyBehavior(FlyBehavior fb) {
        this.flyBehavior = fb;
    }

    public void changeQuackBehavior(QuackBehavior qb) {
        this.quackBehavior = qb;
    }


}
