package homework.h11;

import java.util.Scanner;

import static java.lang.System.*;

public class CCalculator {
    static int a = 0,b=0,c = 0;

    public static void main(String[] args) {
        show(a,b,c);
        add(a,b,c);
        sub(a,b,c);
        mul(a,b,c);
        avg(a,b,c);
    }
    public static void set_value(int x,int y,int z) {
        x=25;
        y=3;
        z=7;
    }
    public static void show(int a,int b,int c) {
        out.println(a);
        out.println(b);
        out.println(c);
    }
    public static void add(int a,int b,int c) {
        out.println(a+b+c);
    }
    public static void sub(int a,int b,int c) {
        out.println(a-b-c);

    }
    public static void mul(int a,int b,int c) {
        out.println(a*b*c);
    }
    public static double avg(int a,int b,int c) {
        return ((a+b+c)/3);
    }
}