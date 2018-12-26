package com.gl.disign.pattern01.factorymethod;

import com.gl.disign.pattern00.simplefactory01.MailSender;
import com.gl.disign.pattern00.simplefactory01.Sender;

public class SendMailFactory implements Provider {
    @Override
    public Sender produce() {
        return new MailSender();
    }
}
