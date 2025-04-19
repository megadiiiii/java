/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Mega.D
 */
import java.io.*;
import java.util.*;

public class Demo {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        int value;
        try {
            value = Integer.parseInt(args[0]);
            System.out.println("value = " + value);
        } catch (NumberFormatException e) {
            e.getStackTrace();
        }
    }
}