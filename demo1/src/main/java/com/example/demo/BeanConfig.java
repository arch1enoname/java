package com.example.demo;

import org.springframework.context.annotation.Bean;

import java.util.Calendar;
import java.util.Date;
import java.util.function.Predicate;

public class BeanConfig {

    @Bean
    String bean1() {
        return "hello world!";
    }
    @Bean
    int bean2() {
        return (int) (Math.random()*100);
    }
    @Bean
    Date bean3() {
        Date date = new Date();
        return date;
    }
    @Bean
    Predicate<Integer> bean4() {
        return x -> x<5 && x>2;
    }
    @Bean
    int max() {
        return 42;
    }
    @Bean
    int min() {
        return 21;
    }
}
