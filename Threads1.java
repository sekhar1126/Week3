package Week3;
class printchar implements Runnable{
	private char charToPrint;
	private int times;
	public printchar(char c,int t) {
		charToPrint = c;
		times=t;
	}
	public synchronized void run() {
		for(int i=0;i<times;i++) {
			System.out.print(charToPrint );
		}
	}
}
class printnum implements Runnable{
	private int lastnum;
	public printnum(int n) {
		lastnum=n;
	}
	public synchronized void run() {
		for(int i=1;i<=lastnum;i++) {
			System.out.print(" "+i);
		}
	}
}
public class Threads1 {

	public static void main(String[] args) {
		
		
		Runnable print100 = new printnum(100);
		Runnable printA = new printchar('a',100);
		Runnable printB = new printchar('b',100);
		
		   
		   Thread thread2= new Thread(print100);
		   Thread thread3 = new Thread(printB);
		   Thread thread1 =new Thread(printA);
		   Thread thread4 = new Thread(printB);
		  
		  
	    thread2.start();
        thread1.start();
       	thread3.start(); 
		thread4.start();
		

		
		
	}

}
