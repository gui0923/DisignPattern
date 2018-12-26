package com.gl.disign.pattern21.visitor;

public interface Subject {
    public void accept(Visitor visitor);
    public String getSubject();
}
