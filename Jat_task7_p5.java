package myPackage;

import java.util.ArrayList;

public class Jat_task7_p5 
{
    public static void main(String[] args) 
    {
        // Behold, the list where words shall play,
        ArrayList<String> words = new ArrayList<>();
        
        words.add("Sun");
        words.add("Moon");
        words.add("Stars");
        
        System.out.println("List before vanishing: " + words);
        
        // Now, with a whisper, they fade away...
        words.clear();
        
        System.out.println("List after vanishing: " + words); // An empty echo remains
    }
}