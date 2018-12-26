package com.gl.disign.pattern09.facade;

public class CPU implements StartAndShutdown {
    @Override
    public void startup() {
        System.out.println("cpu startup!");
    }

    @Override
    public void shutdown() {
        System.out.println("cpu shutdown!");
    }
}
