package Week3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class StackEx1 {

	public static void main(String[] args) {
		
		ArrayList<String> c1=new ArrayList<>();
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of items to be inserted in arraylist");
		int s=sc.nextInt();
		System.out.println("Enter the Data:");
		for(int i=0;i<s;i++) {
			String k=sc.next();
			c1.add(k);
			
		}
		Collections.sort(c1);
		Collections.reverse (c1 );
		System.out.println(c1);
		
	}

}
