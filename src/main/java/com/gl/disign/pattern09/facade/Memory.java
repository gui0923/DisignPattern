package com.gl.disign.pattern09.facade;

public class Memory implements StartAndShutdown {
    @Override
    public void startup() {
        System.out.println("memory startup!");
    }

    @Override
    public void shutdown() {
        System.out.println("memory shutdown!");
    }
}
