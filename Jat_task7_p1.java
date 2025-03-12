package myPackage;
import java.util.Scanner;
//Write a Java program that reads user input for two integers and performs division. 
//Handle the exception that is thrown when the second number is zero, 
//and display an error message to the user.
public class Jat_task7_p1 
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the First Number");
		int num1=s.nextInt();
		System.out.println("Enter the second number");
		int num2=s.nextInt();
		
		try
		{
			double div=num1/num2;
		}
		catch(ArithmeticException ae)
		{
		System.out.println("Oops! You just tried to divide by zero.");
        System.out.println("Mathematicians are shaking their heads!");

		} finally 
		{
        s.close();
        System.out.println("Remember: Even infinity can't handle division by zero!");
		}

}
}
