package com.gl.disign.pattern00.simplefactory02;

import com.gl.disign.pattern00.simplefactory02.SendFactory;
import com.gl.disign.pattern00.simplefactory01.Sender;

/**
 * 多个工厂方法模式是提供多个工厂方法，分别创建对象。
 */
public class FactoryTest {
    public static void main(String[] args) {
        SendFactory sendFactory = new SendFactory();
        Sender sender = sendFactory.produceMail();
        sender.send();
    }
}
