package com.gl.disign.pattern06.adapter.ofobject;

import com.gl.disign.pattern06.adapter.ofclass.Source;

/**
 * 基本思路和类的适配器模式相同,只是将 Adapter 类作修改,这次不继承 Source 类,而是持有 Source
 * 类的实例,以达到解决兼容性的问题。
 */
public class AdapterTest {
    public static void main(String[] args) {
        Source source = new Source();
        Wrapper wrapper = new Wrapper(source);
        wrapper.method1();
        wrapper.method2();
    }
}
