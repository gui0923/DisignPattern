package com.gl.disign.pattern06.adapter.ofobject;

import com.gl.disign.pattern06.adapter.ofclass.Source;
import com.gl.disign.pattern06.adapter.ofclass.Targetable;

public class Wrapper implements Targetable {
    private Source source;

    public Wrapper(Source source) {
        this.source = source;
    }

    @Override
    public void method1() {
        source.method1();
    }

    @Override
    public void method2() {
        System.out.println("this is the targetable method!");
    }
}
