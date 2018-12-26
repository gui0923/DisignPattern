package com.gl.disign.pattern00.simplefactory01;

public class SmsSender implements Sender {
    @Override
    public void send() {
        System.out.println("this is sms sender!");
    }
}
