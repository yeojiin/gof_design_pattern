package com.study.pattern.strategy.domain;

import com.study.pattern.strategy.domain.duck.Duck;
import com.study.pattern.strategy.domain.duck.ReadheadDuck;
import com.study.pattern.strategy.domain.duck.RubberDuck;
import com.study.pattern.strategy.domain.quack.MuteQuack;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("전략 패턴관련 테스트")
public class DuckTest {

    Duck readheadDuck = new ReadheadDuck();
    Duck rubberDuck = new RubberDuck();

    @Test
    @DisplayName("고무 오리는 날지 못하고, 삑삑 거린다.")
    void createRubberDuckTest() {
        performDuck(rubberDuck);
    }

    @Test
    @DisplayName("붉은머리 오리는 날 수 있고, 꽥꽥 거린다.")
    void createRedheadDuckTest() {
        performDuck(readheadDuck);
    }

    @Test
    @DisplayName("붉은머리 오리가 시끄러워 조용히 시켰다.")
    void muteRubberDuck() {
        performDuck(readheadDuck);
        rubberDuck.changeQuackBehavior(new MuteQuack());
        rubberDuck.performQuack();
    }

    /**
     * 공통 행동 호출
     * @param duck
     */
    private static void performDuck(Duck duck) {
        duck.display();
        duck.performFly();
        duck.performQuack();
    }
}
