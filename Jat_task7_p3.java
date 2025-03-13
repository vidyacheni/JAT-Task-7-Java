package myPackage;
import java.util.Scanner;

class InvalidAgeException extends Exception
{
	public InvalidAgeException(String message)
	{
		super(message);
	}
}

public class Jat_task7_p3 {
	
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		try
		{
		System.out.println("Enter your age, traveller");
		int age=s.nextInt();
		if(age<18)
		{
			throw new InvalidAgeException("Too young! The gates remain closed.");
		}
		 System.out.println("Ah, welcome! You may pass.");
		}
		catch(InvalidAgeException ae)
		{
			System.out.println("A guardian speaks: " + ae.getMessage());
		}
		finally {
            System.out.println("Age checked, fate sealed, I still get the last deal!");
            s.close();
        }
	}

}
