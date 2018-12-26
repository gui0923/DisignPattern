package com.gl.disign.pattern06.adapter.ofclass;

/**
 * 核心思想就是:有一个 Source 类,拥有一个方法,待适配,目标接口是 Targetable,通过 Adapter 类,
 * 将 Source 的功能扩展到 Targetable 里
 */
public class AdapterTest {
    public static void main(String[] args) {
        Targetable target = new Adapter();
        target.method1();
        target.method2();
    }
}
