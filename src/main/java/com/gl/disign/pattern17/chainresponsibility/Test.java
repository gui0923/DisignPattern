package com.gl.disign.pattern17.chainresponsibility;

public class Test {
    public static void main(String[] args) {
        MyHandler h1 = new MyHandler("h1");
        MyHandler h2 = new MyHandler("h2");
        MyHandler h3 = new MyHandler("h3");
        h1.setHandler(h2);
        h2.setHandler(h3);
//        h3.setHandler(h1);//闭环就完蛋了，O(∩_∩)O哈哈~
        h1.operator();
    }
}
