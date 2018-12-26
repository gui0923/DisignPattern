package com.gl.disign.pattern01.factorymethod;

import com.gl.disign.pattern00.simplefactory01.Sender;

public interface Provider {
    public Sender produce();
}
