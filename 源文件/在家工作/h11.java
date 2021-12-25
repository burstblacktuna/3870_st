package homework;

import static java.lang.System.*;

public class h11 {
    public static void main(String[] args) {
        out.println("CCalculator；");
        CCalculator.set_value(23, 4, 7);
        CCalculator.show();
        CCalculator.add();
        CCalculator.sub();
        CCalculator.mul();
        CCalculator.avg();
        out.println("\nCCircle；");
        CCircle.area(2);
        CCircle.area(2.2f);
        CCircle.area(2.2);
    }
}

class CCalculator {
    static int a = 0, b = 0, c = 0;

    public static void set_value(int x, int y, int z) {
        a = x;
        b = y;
        c = z;
    }

    public static void show() {
        out.println(a);
        out.println(b);
        out.println(c);
    }

    public static void add() {
        out.println(a + b + c);
    }

    public static void sub() {
        out.println(a - b - c);

    }

    public static void mul() {
        out.println(a * b * c);
    }

    public static void avg() {
        out.println((a + b + c) / 3.0);
    }
}

class CCircle {

    public static void area(double r) {
        out.println(3.14 * Math.pow(r, 2));

    }

    public static void area(float r) {
        out.println(3.14 * Math.pow(r, 2));
    }

    public static void area(int r) {
        out.println(3.14 * Math.pow(r, 2));
    }
}



