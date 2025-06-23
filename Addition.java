import java.io.*;
import java.util.Scanner;
class Addition{
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		System.out.print("Enter first number: ");
		int a=s.nextInt();
		System.out.print("Enter second number : ");
	    int b=s.nextInt();
		int c=a+b;
		System.out.print("The Addition of two numbers : "+c);
		
	}
}