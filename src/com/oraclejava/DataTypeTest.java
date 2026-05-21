package com.oraclejava;

public class DataTypeTest {
    public static void main(String[] args) {
        boolean var_boolean = true;
        byte  var_byte = 127;
        short var_short = 32767;
        int var_int = 100000;
        int num = 011;
        int num2 = 0x12;
        int num3 = 0b0111;
        long var_long = 100000;
        long var_long2 = 122_122_122_122L; // 천2백2십1억
        float var_float = 3.14f;
        double var_double = 3.14;

        char var_char = 'a';
        char var_char2 = 66;
        char var_char3 = '\u0041';
        char var_char4 = '가';
        char var_char5 = 'ざ';

        System.out.println("boolean = " + var_boolean);
        System.out.println("byte = " + var_byte);
        System.out.println("short = " + var_short);
        System.out.println("int = " + var_int);
        System.out.println("long = " + var_long);
        System.out.println("long2 = " + var_long2);
        System.out.println("float = " + var_float);
        System.out.println("double = " + var_double);
        System.out.println("char = " + var_char);
        System.out.println("char2 = " + var_char2);
        System.out.println("char3 = " + var_char3);
        System.out.println("char4 = " + var_char4);
        System.out.println("char5 = " + var_char5);

    }
}
