package school;

import static java.lang.System.*;

class CCircle3 {
    double pi = 3.14;
    double r;

    public CCircle3(){
        this(1.0);
    }
    public CCircle3(double r) {
        if (r > 0) {
            this.r = r;
            out.println("OK");
        }
        else out.println("ERROR");
    }

    public void show() {
        out.println("rad=" + r + " area=" + pi * r * r);
    }

}

public class s09 {
    public static void main(String[] args) {
        CCircle3 cir1 = new CCircle3(2.0);
        CCircle3 cir2 = new CCircle3(-2.0);
        CCircle3 cir3 = new CCircle3();
        cir3.show();
    }
}

