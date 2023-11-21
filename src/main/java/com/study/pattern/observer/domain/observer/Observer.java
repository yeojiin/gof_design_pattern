package com.study.pattern.observer.domain.observer;

public interface Observer {
    public void update(float temp, float humidity, float pressure);
}
