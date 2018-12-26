package com.gl.disign.pattern00.simplefactory02;

import com.gl.disign.pattern00.simplefactory01.MailSender;
import com.gl.disign.pattern00.simplefactory01.Sender;
import com.gl.disign.pattern00.simplefactory01.SmsSender;

/**
 * 多个方法
 */
public class SendFactory
{
    public Sender produceMail()
    {
        return new MailSender();
    }

    public Sender produceSms()
    {
        return new SmsSender();
    }
}
