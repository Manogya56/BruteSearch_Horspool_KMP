import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
import java.util.Scanner;

class KMP 
{ 
    void KMPSearching(String txt, String pat) 
    { 
		int count = 0;
        int M = pat.length(); 
        int N = txt.length(); 
         
        int lps[] = new int[M]; 
        int j = 0; // index for pat[] 
  
      
        computeArray(pat, M, lps); 
  
        int i = 0; // index for txt[] 
        while (i < N) { 
            if (pat.charAt(j) == txt.charAt(i)) { 
                j++; 
                i++; 
				count+=1;
            } 
			
            if (j == M) { 
                System.out.println("Found pattern " + "at index " + (i - j)); 
				System.out.println(count+ " is the count");
                j = lps[j - 1]; 
            } 
  
        
            else if (i < N && pat.charAt(j) != txt.charAt(i)) 
			{ 
                count+=1;
                if (j != 0) 
                    j = lps[j - 1]; 
                else
                    i = i + 1; 
            } 
        } 
    } 
  
    void computeArray(String pat, int M, int lps[]) 
    { 
        
        int len = 0; 
        int i = 1; 
        lps[0] = 0;  
  
        
        while (i < M) { 
            if (pat.charAt(i) == pat.charAt(len)) { 
                len++; 
                lps[i] = len; 
                i++; 
            } 
            else 
            { 
                
                if (len != 0) { 
                    len = lps[len - 1]; 
  
                
                } 
                else 
                { 
                    lps[i] = len; 
                    i++; 
                } 
            } 
        } 
    } 
  
    
    public static void main(String args[]) throws FileNotFoundException
    { 
		long start = System.currentTimeMillis();
		count_function(10000000); 
		long end = System.currentTimeMillis(); 
        System.out.println((end - start) + "ms"); 
		
        KMP obj = new KMP();
		
		File file = new File("C:\\Users\\puliv\\OneDrive\\Desktop\\UNCC\\MyNotes\\Algos\\Our Algos 3\\KMP\\input7.txt"); 
		Scanner sc = new Scanner(file); 
		
		String inputString = sc.nextLine();
		String pattern = sc.nextLine();
		obj.KMPSearching(inputString, pattern);
    } 
	
	public static void count_function(long x) 
    { 
        
        for (long i = 0; i < x; i++)
			;			
        
    }
} 