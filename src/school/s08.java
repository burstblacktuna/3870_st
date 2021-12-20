package school;

import static java.lang.System.*;

public class s08 {
    double w = 0.0;
    double h = 0.0;

    public static void main(String[] args) {
        s08 r;
        r = new s08();
        r.w = 10;
        r.h = 20;
        out.println(r.w);
        out.println(r.h);
        out.println(r.a());
    }
    double a(){
        return this.w*this.h;
    }
}

