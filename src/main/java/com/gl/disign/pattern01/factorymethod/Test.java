package com.gl.disign.pattern01.factorymethod;

import com.gl.disign.pattern00.simplefactory01.Sender;

public class Test {
    public static void main(String[] args) {
        Provider provider = new SendMailFactory();
        Sender sender = provider.produce();
        sender.send();
    }
}
