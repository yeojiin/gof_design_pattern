package com.study.pattern.observer.domain;

import com.study.pattern.observer.domain.observer.Observer;
import com.study.pattern.observer.domain.subject.WeatherData;

public class CurrentConditionDisplay implements Observer, DisplayElement { //Observer: 옵저버로터 변경사항 받기 위해, DisplayElement: display

    private float temperature;
    private float humidity;
    private WeatherData weatherData;

    public CurrentConditionDisplay(WeatherData weatherData) {
        // 생성자에 주제인 weatherData가 전달되고
        // 이 객체를 써서 디스플레이를 옵저버로 등록

        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    public void display() {
        System.out.println("현재 상태 온도:" + temperature + "/n 습도: " + humidity + "%");
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        display();
    }
}
