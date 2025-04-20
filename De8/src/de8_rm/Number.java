/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package de8_rm;

/**
 *
 * @author Mega.D
 */
public class Number {
    private int value, min, max;

    public Number() {
    }

    public Number(int value, int min, int max) {
        this.value = value;
        this.min = min;
        this.max = max;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }

    @Override
    public String toString() {
        return "min: " + min + ", max: " + max + ", value: " + value;
    }
    
    public boolean isPrime() {
        if(value <= 1) return false;
        for(int i = 2; i <= Math.sqrt(value); i++) {
            if(value % i == 0) {
                return false;
            }
        }
        return true;
    }
}
