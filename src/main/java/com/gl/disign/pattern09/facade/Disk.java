package com.gl.disign.pattern09.facade;

public class Disk implements StartAndShutdown {
    @Override
    public void startup() {
        System.out.println("disk startup!");
    }

    @Override
    public void shutdown() {
        System.out.println("disk shutdown!");
    }
}
