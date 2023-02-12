package Week3;
/*
 * (Display nonduplicate names in ascending order) Given one or more text files, 
each representing a day’s attendance in a course and containing the names of the 
students who attended the course on that particular day, write a program that displays, in ascending order, the names of those students who have attended at least 
one day of the course. The text file(s) is/are passed as command-line argument(s).
 */

import java.util.HashMap;
import java.util.Scanner;
import java.util.TreeMap;





public class SetsEx2 {

	public static void main(String[] args) {
		HashMap <String , Integer> s1=new HashMap<>();

		int a = 0 ;
		String n;
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter no of details to be added:");
		int k =sc.nextInt();
		
		for(int i=0;i<k;i++) {
			System.out.println("Enter name of the student"+(i+1));
			 n=sc.next();
			System.out.println("Enter nujmber of days Attended:");
		    a =sc.nextInt();
			
			s1.put(n,a);
			
		}
		
			
			
			 TreeMap<String,Integer> tm=new  TreeMap<> (s1);  
			 System.out.println(tm);
		       
	}
		
	}


