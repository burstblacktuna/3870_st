package exam;
import java.util.Scanner;

public class w5_14 {

	public static void main(String[] args) {
		int i,sum=0;
		
		int length=3500,  day=0;
		
		for ( i=1; i<=100; i++  )
		{
			length = length / 2;
			day++;
			if( length<3 ) break;
		}
		
		System.out.println("It spent "+day+" days");
		
	}

}
