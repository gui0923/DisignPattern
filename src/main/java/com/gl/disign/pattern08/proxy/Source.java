package com.gl.disign.pattern08.proxy;


public class Source implements Sourceable {
    @Override
    public void method() {
        System.out.println("the originable method!");
    }
}
