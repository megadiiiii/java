/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Mega.D
 */
public class Demo {

    public static void main(String args[]) {
        int value = 1;
        try {
            value = Integer.parseInt(args[0]);
            System.out.println("value = " + value);
        } catch (NumberFormatException ex) {
            ex.printStackTrace();
        }
    }
}
