package com.gl.disign.pattern06.adapter.ofinterface;

public class SourceSub1 extends Wrapper2 {
    @Override
    public void method1() {
        super.method1();
        System.out.println("the sourceable interface's first Sub1!");
    }
}
