package com.andersen.maks.hello.impl;

import com.andersen.maks.hello.HelloWorld;

public class HelloWorldImpl implements HelloWorld {
    @Override
    public void printHelloWorld(String str) {
        System.out.println(str);
    }
}
