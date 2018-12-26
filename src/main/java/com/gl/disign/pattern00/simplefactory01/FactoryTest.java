package com.gl.disign.pattern00.simplefactory01;

/**
 * 普通工厂方法，如果传递的字符串出错，则不能正确创建对象
 */
public class FactoryTest {
    public static void main(String[] args) {
        SendFactory sendFactory = new SendFactory();
        Sender sender = sendFactory.produce("sms");
        sender.send();
    }
}
