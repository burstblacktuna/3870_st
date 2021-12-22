package school;

import static java.lang.System.*;

public class s08_t {

    public static void main(String[] args) {
        CTriangle t;
        t= new CTriangle();
        t.a=30.0;
        t.b=40.0;
        t.c=50.0;
        out.println(t.p());
    }

}
class CTriangle {
    double a = 0.0;
    double b = 0.0;
    double c = 0.0;

    double p(){
        double s = (a+b+c)/2;
        return Math.sqrt(s*(s-a)*(s-b)*(s-c));

    }
}
