package com.gl.disign.pattern09.facade;

/**
 * 如果我们没有 Computer 类,那么,CPU、Memory、Disk 他们之间将会相互持有实例,产生关系,这
 * 样会造成严重的依赖,修改一个类,可能会带来其他类的修改,这不是我们想要看到的,有了 Computer
 * 类,他们之间的关系被放在了 Computer 类里,这样就起到了解耦的作用,这,就是外观模式!
 */
public class User {
    public static void main(String[] args) {
        Computer computer = new Computer();
        computer.startup();
        computer.shutdown();
    }
}
