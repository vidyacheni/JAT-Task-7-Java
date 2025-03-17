package myPackage;
import java.util.*;
//convert list to array
public class Jat_task7_p7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		        List<String> colors = new ArrayList<>();
		        colors.add("Red");
		        colors.add("Blue");
		        colors.add("Green");

		        String[] box = colors.toArray(new String[0]);

		        System.out.println("Loose shades now sit in a box.");

		        for (String shade : box) {
		        	System.out.println(shade);
        }

	}

}
