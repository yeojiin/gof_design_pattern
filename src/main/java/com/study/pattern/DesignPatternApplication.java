package com.study.pattern;

import com.study.pattern.strategy.domain.duck.Duck;
import com.study.pattern.strategy.domain.duck.RubberDuck;
import com.study.pattern.strategy.domain.quack.MuteQuack;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DesignPatternApplication {

	public static void main(String[] args) {
		SpringApplication.run(DesignPatternApplication.class, args);
	}

}
