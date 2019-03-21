package com.andersen.maks.config;

import com.andersen.maks.hello.HelloWorld;
import com.andersen.maks.hello.impl.HelloWorldImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration // Аннотация которая говорит спрингу что этот класс будет хранить конфигурацию
public class BeenConfig {

    @Bean(name = "helloBean") // указывает на реализацию Бина с именем helloBean по которому этот бин можно получить
    public HelloWorld helloWorld(){
        return new HelloWorldImpl();
    }
}
