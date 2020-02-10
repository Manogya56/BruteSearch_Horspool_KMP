import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
import java.util.Scanner;

public class BruteSearch 
{ 
    public static void search(String txt, String pat) 
    {
		int count =0;
        int M = pat.length(); 
        int N = txt.length(); 
	
        for (int i = 0; i <= N - M; i++) 
		{ 
            int j; 

			for(j = 0;j<M;j++)
			{
				count +=1;
				if(txt.charAt(i+j) != pat.charAt(j))
				{
					break;
				}
			}
						
                     
            if (j == M) 
			{
				System.out.println("Pattern found at index " + i);
				System.out.println(count+" is the count");
				break;
			}
                
			
			//else
			//{
				System.out.println("-1");
				//break;
			//} 
				
        }
		//System.out.println("-1");		
    } 
  
    public static void main(String[] args) throws FileNotFoundException
    { 
        /*String txt = "KRISHNAISGREAT"; 
        String pat = "SH"; 
        search(txt, pat); */
		
		long start = System.currentTimeMillis();
		count_function(10000000); 
		long end = System.currentTimeMillis(); 
        System.out.println((end - start) + "ms"); 
		
		BruteSearch obj = new BruteSearch();
		
		File file = new File("C:\\Users\\puliv\\OneDrive\\Desktop\\UNCC\\MyNotes\\Algos\\Our Algos 3\\BruteSearch\\input3.txt"); 
		Scanner sc = new Scanner(file); 
		
		String inputString = sc.nextLine();
		String pattern = sc.nextLine();
		obj.search(inputString, pattern);
		
		
    } 
	public static void count_function(long x) 
    { 
        
        for (long i = 0; i < x; i++)
			;			
        
    }
} 