package Week3;
/*
 * (Maximum element in ArrayList) Write the following method that returns the 
maximum value in an ArrayList of integers. The method returns null if the 
list is null or the list size is 0.
public static Integer max(ArrayList<Integer> list
 * 
 */
import java.util.ArrayList;
import java.util.Scanner;

public class ArrayList1 {

	public static void main(String[] args) {
		ArrayList<Integer> c1= new ArrayList<>();
		int k = 0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of values to be inserted in arraylist");
		int s=sc.nextInt();
		System.out.println("Enter the values");
		
			
		for(int i=0;i<s;i++) {
			
				 k=sc.nextInt();
				 c1.add(k);
		
			}
		
		
	
		
		if(c1.contains(k)&&k!=0) {
			
			System.out.println(c1);
			int max=c1.get(0);
			for(int i=0;i<c1.size();i++) {
				if(max<c1.get(i)) {
					max=c1.get(i);
				}
			}
			System.out.println("Maximum element in array list is :"+max);
		}
		
		else {
			System.out.println("Null");
		}
		
		
	
	}	
	

}

