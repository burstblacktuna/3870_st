package exam;

import java.util.Scanner;

public class w5_5 {

	public static void main(String[] args) {
		
		
		Scanner scn = new Scanner( System.in ) ;		
		System.out.println("INPUT num1 :" ) ;
		int num1 = scn.nextInt(); 
		
		if( num1 %2 == 0)
			System.out.println( num1 + "是偶數");
		else
			System.out.println( num1 + "是奇數");
		
	}

}
