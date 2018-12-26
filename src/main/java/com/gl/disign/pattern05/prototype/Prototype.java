package com.gl.disign.pattern05.prototype;

import java.io.*;

/**
 * 浅复制:将一个对象复制后,基本数据类型的变量都会重新创建,而引用类型,指向的还是原对象所指
 * 向的。
 * 深复制:将一个对象复制后,不论是基本数据类型还有引用类型,都是重新创建的。简单来说,就是深
 * 复制进行了完全彻底的复制,而浅复制不彻底。
 */
public class Prototype implements Cloneable, Serializable {

    private static final long serialVersionUID = 5374235882687553858L;
    private String string;
    private int index;

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    private SerializableObject obj = new SerializableObject();

    public Object deepClone() throws IOException, ClassNotFoundException {
        /*写入当前对象的二进制流*/
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(bos);
        oos.writeObject(this);

        /*读出二进制流产生的新对象*/
        ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bis);
        return ois.readObject();
    }


    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
    }

    public SerializableObject getObj() {
        return obj;
    }

    public void setObj(SerializableObject obj) {
        this.obj = obj;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "Prototype{" + "string='" + string + '\'' + ", index=" + index + ", obj=" + obj + '}';
    }

    public static void main(String[] args) throws CloneNotSupportedException, IOException, ClassNotFoundException {
        Prototype prototype = new Prototype();
        prototype.setString("浅复制");
        prototype.setIndex(55555);
        prototype.getObj().setAge(5);
        //测试浅复制
        System.out.println("原始prototype = " + prototype);

        Prototype qian = (Prototype) prototype.clone();
        System.out.println("qian = " + qian);

        Prototype shen = (Prototype) prototype.deepClone();
        System.out.println("shen = " + shen);
    }
}

class SerializableObject implements Serializable
{
    private static final long serialVersionUID = 533956139477640099L;
    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "SerializableObject{" + "age=" + age + '}';
    }
}
