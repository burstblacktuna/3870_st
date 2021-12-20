package school;

import static java.lang.System.*;

public class s08_t {
    double a = 0.0;
    double b = 0.0;
    double c = 0.0;
    public static void main(String[] args) {
        s08_t t;
        t= new s08_t();
        t.a=30.0;
        t.b=40.0;
        t.c=50.0;
        out.println(t.p());
    }
    double p(){
        double s = (a+b+c)/2;
        return Math.sqrt(s*(s-a)*(s-b)*(s-c));

    }
}
