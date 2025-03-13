package myPackage;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class Jat_task7_p4 
{

	public static void main(String[] args) 
	{
		try 
		{
            Scanner scanner = new Scanner(new File("data.txt"));
            scanner.close();
        } catch (FileNotFoundException e) 
		{
            System.out.println("File not found! Maybe it's playing hide and seek.");
            
        }
		
	}

}
