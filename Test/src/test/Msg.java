/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

/**
 *
 * @author Mega.D
 */
public class Msg {
    public static void main(String args[]) {
        Msg m1 = new Msg();
        Msg m2 = new TestMsg();
        m1.sayGoodbye();
        m2.sayGoodbye();
    }
}

class Msg {
    public Msg() {
        System.out.println("Hello");
    }
    public void sayGoodbye() {
        System.out.println("Goodbye");
    }
}
class TestMsg extends Msg {
    public TestMsg() {
        super();
        System.out.println("Hello Java");
    }
    public void sayGoodbye() {
        System.out.println("Goodbye Java"); 
    }
}
