package Week3;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/*
 * (Perform set operations on hash sets) Given two stacks of textbooks of the following subjects 5"Chemistry", "Mathematics", "Biology", "English"6
and 5"Biology", "English", "Geography", "Physics"6 respectively, find 
the subjects that are (1) only present in the first stack; (2) only present in the 
second stack; (3) present in both stacks. (You may clone the sets to preserve the 
original sets from being changed by set methods.)
 */
public class SetsEx1 {

	public static void main(String[] args) {
	 
		Set<String> tb1= new HashSet<String>(Arrays.asList("Chemistry","Mathematics","Biology","English"));
		System.out.println("The books present in Stack 1:"+ tb1);
		
		Set<String> tb2= new HashSet<String>(Arrays.asList("Biology","English","Geography","Physics"));
		System.out.println("The books present in stack 2:"+tb2);
		tb1.retainAll(tb2);
		System.out.println("The books present in both stacks are : "+tb1);
		

	}

}
