package com.study.pattern.strategy.domain.fly;

public interface FlyBehavior {
    // 인터페이스를 변수로 선언해 fly() 메소드를 모두 공통으로 호출하고
    // 이 인터페이스를 상속받는 클래스에서 행동을 각각 다르게 설정할 수 있다
    // 여러개의 클래스(행동)이 인터페이스의 하나의 메소드로 동적으로 돌기 때문에
    // fly 폴더 안의 내용이 캡슐화 되어 있다고 볼 수 있다.

    public void fly();      // 상속받는 class에서 override를 이용해 원하는대로 구현 가능
}
