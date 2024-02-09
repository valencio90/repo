package mathematics;

import java.util.*;

public class Calculator {
	
	public int addNos() {
		System.out.print("addition\n");
		int n1,n2;
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the first number:");
		n1 = sc.nextInt();
		System.out.print("enter the second number:");
		n2 = sc.nextInt();
		int res = n1+n2;
		return res;
	}
	
	public int subNos() {
		System.out.print("subtraction\n");
		int n1,n2;
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the first number:");
		n1 = sc.nextInt();
		System.out.print("enter the second number:");
		n2 = sc.nextInt();
		int res = n1-n2;
		return res;
	}

	public int multiplyNos() {
		System.out.print("multiply\n");
		int n1,n2;
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the first number:");
		n1 = sc.nextInt();
		System.out.print("enter the second number:");
		n2 = sc.nextInt();
		int res = n1*n2;
		return res;
	}
	
	public int divideNos() {
		System.out.print("divide\n");
		int n1,n2;
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the first number:");
		n1 = sc.nextInt();
		System.out.print("enter the second number:");
		n2 = sc.nextInt();
		int res = n1/n2;
		return res;
	}
}
