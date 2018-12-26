package com.gl.disign.pattern08.proxy;

public class ProxyTest {
    public static void main(String[] args) {
        Sourceable souceable = new Proxy();

        souceable.method();
    }
}
