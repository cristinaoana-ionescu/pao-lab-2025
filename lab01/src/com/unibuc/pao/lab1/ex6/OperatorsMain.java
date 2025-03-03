package com.unibuc.pao.lab1.ex6;

public class OperatorsMain {

    public static void main(String[] args) {
        int a = 20;
        int b = 11;

        // aritmetic
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("a / b = " + (a / b));
        System.out.println("a % b = " + (a % b));

        System.out.println("a++ = " + (a++));
        System.out.println("++a = " + (++a));
        System.out.println("a-- = " + (a--));
        System.out.println("--a = " + (--a));

        System.out.println("a > b = " + (a > b));
        System.out.println("a < b = " + (a < b));
        System.out.println("a >= b = " + (a >= b));
        System.out.println("a <= b = " + (a <= b));
        System.out.println("a == b = " + (a == b));
        System.out.println("a != b = " + (a != b));

        // bit-wise
        System.out.println("a & b = " + (a & b));
        System.out.println("a | b = " + (a | b));
        System.out.println("a ^ b = " + (a ^ b));
        System.out.println("~a = " + ~a);
        System.out.println("a << 2 = " + (a << 2));
        System.out.println("a >> 2 = " + (a >> 2));
        System.out.println("a >>> 2 = " + (a >>> 2));
        
        // logical
        boolean x = true;
        boolean y = false;

        System.out.println("x && y = " + (x && y));
        System.out.println("x & y = " + (x & y));
        System.out.println("x || y = " + (x || y));
        System.out.println("x | y = " + (x | y));
        System.out.println("!x = " + !x);
        
        
        // concatenation
        String s1 = "Hello,";
        String s2 = "World";
        System.out.println("s1 + s2 = " + s1 + s2);
        
        // instanceof
        Object object = "Hello, World!";
        if (object instanceof String) {
            System.out.println("object is a String");
        }
     
    }
}
