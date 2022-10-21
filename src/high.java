import java.util.Scanner;
import static java.lang.System.*;

public class high {
    public static void main(String[] args) {
        var a = new Scanner(in);
        var ih = a.nextInt();
        var im = a.nextInt();
        var oh = a.nextInt();
        var om = a.nextInt();
        int h=0,m=0,c=0;
        if (oh-ih>=0) h=oh-ih;
        else out.println("Error");
        if (om>=im)m=om-im;
        else {h-=1;m=60-im+om;}
        if (h<2)c=h*60+m/30*30;
        else if (h<4) c=2*60+(h-2)*80+m/30*40;
        else c=2*60+2*80+(h-4)*120+m/30*60;
        out.println(c);
    }
}