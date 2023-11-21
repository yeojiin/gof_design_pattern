package com.study.pattern.observer.domain.observer;

import com.study.pattern.observer.domain.DisplayElement;

public class ForecastDisplay implements Observer, DisplayElement {
    @Override
    public void display() {
        System.out.println("오늘 날씨를 알려드립니다.");
    }

    @Override
    public void update(float temp, float humidity, float pressure) {

    }
}
