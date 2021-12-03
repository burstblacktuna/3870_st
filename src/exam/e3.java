package exam;

import static java.lang.System.*;

public class e3 {

	public static void main(String[] args) {
		int i,sum = 0;
		for( i=1; i<=10; i++)
			sum += i*(i+1);
		out.println("1*2+2*3+...+10*11="+sum);
		
	}

}
