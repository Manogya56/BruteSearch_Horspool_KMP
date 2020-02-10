import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
import java.util.Scanner;


public class Horspool2
{
	public static int BoyerMooreHorspoolSearch(char[] pattern, char[] text) 
	{
		int count=0;
	 
		int shift[] = new int[256];
		 
		for (int k = 0; k < 256; k++) {
			shift[k] = pattern.length;
		}
		 
		for (int k = 0; k < pattern.length - 1; k++){
			shift[pattern[k]] = pattern.length - 1 - k;
		}
	 
		int i = 0, j = 0;
	 
		while ((i + pattern.length) <= text.length) 
		{
			j = pattern.length - 1;
	 
			while (text[i + j] == pattern[j]) 
			{
				count += 1;
				j -= 1;
				if (j < 0)
				{	
					System.out.println(i+" is where it starts");
					System.out.println(count +" is the count"); 
					return i;
				}
					
			}
			count += 1;
			i = i + shift[text[i + pattern.length - 1]];
		}
		System.out.println("-1"); //return statement is required since the method type says so
		return -1;
	}
	
	public static void main(String[] args) throws FileNotFoundException
	{
		
		long start = System.currentTimeMillis();
		count_function(10000000); 
		long end = System.currentTimeMillis(); 
        System.out.println((end - start) + "ms"); 
		
		Horspool2 obj = new Horspool2();
		
		File file = new File("C:\\Users\\puliv\\OneDrive\\Desktop\\UNCC\\MyNotes\\Algos\\Our Algos 3\\Horspool\\input8.txt"); 
		Scanner sc = new Scanner(file); 
		
		String inputString = sc.nextLine();
		String pattern = sc.nextLine();
		char[] inputString1 = inputString.toCharArray();
		char[] pattern1 = pattern.toCharArray();
		obj.BoyerMooreHorspoolSearch(pattern1, inputString1);
		
	}
	
	public static void count_function(long x) 
    { 
        
        for (long i = 0; i < x; i++)
			;			
        
    }
	
}


