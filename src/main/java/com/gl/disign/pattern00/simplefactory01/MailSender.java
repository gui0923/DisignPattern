package com.gl.disign.pattern00.simplefactory01;

public class MailSender implements Sender {
    @Override
    public void send() {
        System.out.println("this is mailsender!");
    }
}
