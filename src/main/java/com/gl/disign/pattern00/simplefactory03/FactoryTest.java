package com.gl.disign.pattern00.simplefactory03;

import com.gl.disign.pattern00.simplefactory01.Sender;

/**
 * 静态方法，则不需要创建实例，直接调用即可
 */
public class FactoryTest {
    public static void main(String[] args) {
        Sender sender = SendFactory.produceMail();
        sender.send();
    }
}
