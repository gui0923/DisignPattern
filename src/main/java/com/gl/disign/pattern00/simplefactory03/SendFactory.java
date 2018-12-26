package com.gl.disign.pattern00.simplefactory03;

import com.gl.disign.pattern00.simplefactory01.MailSender;
import com.gl.disign.pattern00.simplefactory01.Sender;
import com.gl.disign.pattern00.simplefactory01.SmsSender;

/**
 * 多个静态方法
 */
public class SendFactory
{
    public static Sender produceMail()
    {
        return new MailSender();
    }

    public static Sender produceSms()
    {
        return new SmsSender();
    }
}
