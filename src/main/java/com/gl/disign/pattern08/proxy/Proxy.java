package com.gl.disign.pattern08.proxy;


public class Proxy implements Sourceable {

    private Source source;

    public Proxy() {
        this.source = new Source();
    }

    @Override
    public void method() {
        before();
        source.method();
        after();
    }

    private void after()
    {
        System.out.println("after proxy!");
    }
    private void before()
    {
        System.out.println("before proxy!");
    }
}
