package myPackage;
//Write the code of ArrayIndexOutOfBoundsException 
//& StringIndexOutOfBoundsException.
public class Jat_task7_p2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int[] numbers= {1,2,3};
			System.out.println(numbers[5]);
			}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Oops! You reached too far, but the array isn't that large!");
		}
			
		try
		{
			String s="Java";
			System.out.println(s.charAt(10));
		}
		catch(StringIndexOutOfBoundsException e)
		{
			System.out.println("A string so short, yet you sought more? Alas, beyond its shore!");
		}
	}

}
