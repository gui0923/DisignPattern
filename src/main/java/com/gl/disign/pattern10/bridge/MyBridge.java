package com.gl.disign.pattern10.bridge;

public class MyBridge extends Bridge {
    @Override
    public void method() {
        getSource().method();
    }
}
