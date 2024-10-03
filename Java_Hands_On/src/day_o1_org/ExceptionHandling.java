package day_o1_org;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandling {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		try {
		int nextInt = sc.nextInt();
		int b=5/0;
		System.out.println(nextInt);
		}
		catch (InputMismatchException e) {
	
			System.out.println("Program Ended");
		}
		
		catch (ArithmeticException e) {
		
			System.out.println("Arithmetic Exception Handled");
		
		
		}
	}

}
