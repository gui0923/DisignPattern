package com.gl.disign.pattern01.factorymethod;

import com.gl.disign.pattern00.simplefactory01.Sender;
import com.gl.disign.pattern00.simplefactory01.SmsSender;

public class SendSmsFactory implements Provider {
    @Override
    public Sender produce() {
        return new SmsSender();
    }
}
