package com.study.pattern.observer.domain;

import com.study.pattern.observer.domain.subject.WeatherData;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("옵저버 패턴 관련 테스트")
public class ObserverTest {
    WeatherData weatherData = new WeatherData();
    @Test
    @DisplayName("옵저버 패턴 날씨 호출")
    void createRubberDuckTest() {

        CurrentConditionDisplay currentConditionDisplay = new CurrentConditionDisplay(weatherData);

        weatherData.changeMeasurements(80, 65, 30.4f);
        weatherData.changeMeasurements(82, 70, 29.2f);
        weatherData.changeMeasurements(78, 90, 30.4f);

    }
}
