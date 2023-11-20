package com.study.pattern.strategy.domain.duck;

import com.study.pattern.strategy.domain.fly.FlyWithWings;
import com.study.pattern.strategy.domain.quack.Quack;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ReadheadDuck extends Duck {

    public ReadheadDuck() {
        // 날 수 있는 오리
        flyBehavior = new FlyWithWings(); // Duck에서 선언한 인터페이스에 날 수 있는 행동 클래스를 주입
        quackBehavior = new Quack();    // Duck에서 선언한 인터페이스에 꽥꽥 행동 클래스를 주입
    }

    @Override
    public void display() {
      System.out.println("붉은머리 오리 입니다.");
    }
}
