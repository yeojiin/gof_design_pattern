package com.study.pattern.observer.domain.subject;

import com.study.pattern.observer.domain.observer.Observer;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Subject{
    // 날씨 정보를 가진 데이터는 주제를 상속받아 변화가 있을 경우 변화를 업데이트 함

    private List<Observer> observers;   // 주제에 등록될 옵저버 객체들
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData() {
        observers = new ArrayList<Observer>();
    }

    public void registerObserver(Observer o) {
        observers.add(o);

    }

    public void removeObserver(Observer o) {
        observers.remove(o);

    }

    @Override
    public void notifyObserver(Observer o) {

    }

    public void notifyObservers() {
        // 모든 옵저버에게 상태 변화를 알려줌

        for(Observer observer : observers) {
            observer.update(temperature, humidity, pressure);
        }
    }

    public  void measurementsChanged() {
        // 갱신된 측정값을 받고, 옵저버에게 변화를 호출하는 메소드
        notifyObservers();
    }

    public void changeMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }
}
