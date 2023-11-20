package com.study.pattern.strategy.domain.duck;

import com.study.pattern.strategy.domain.fly.FlyNoWay;
import com.study.pattern.strategy.domain.fly.FlyWithWings;
import com.study.pattern.strategy.domain.quack.Quack;
import com.study.pattern.strategy.domain.quack.Squeak;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class RubberDuck extends Duck {

    public RubberDuck() {
        // 날 수 있는 오리
        flyBehavior = new FlyNoWay(); // Duck에서 선언한 인터페이스에 날 수 없는 행동 클래스를 주입
        quackBehavior = new Squeak();    // Duck에서 선언한 인터페이스에 삑삑 행동 클래스를 주입
    }

    @Override
    public void display() {
      System.out.println("고무 오리 입니다.");
    }
}
