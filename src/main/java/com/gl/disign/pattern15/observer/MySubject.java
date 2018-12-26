package com.gl.disign.pattern15.observer;

public class MySubject extends AbstractSubject {
    @Override
    public void operation() {
        System.out.println("update selef!");
        notifyObservers();
    }
}
