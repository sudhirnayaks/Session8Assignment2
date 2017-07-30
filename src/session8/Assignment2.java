package session8;

import java.util.Scanner;

class MyRunnable implements Runnable{
	Scanner scan= new Scanner(System.in);
	private Scanner scanner;
	public void run() {
		System.out.println("*************** Thread class that implements Runnable *****************");
		try{
			scanner = new Scanner(System.in);
			System.out.println("Please enter any number to check it is prime or not");
			int number=scanner.nextInt();
			
			int flag=0;
            
	           //Logic to check for prime number

	            for(int x=2;x<=number/2;x++){
	            	if(number%x==0){
	            		System.out.println("Number entered is not a prime Number");
	            		flag=1;
	            		break;
	            		
	            	}
	            }
	            
	            if(flag==0){
	            	System.out.println("Number entered is a prime Number");
	            	
	            }
			}catch(Exception e){
			System.out.println(e);
		}
		
	}
	
}

class MyThread extends Thread{
	Scanner scan= new Scanner(System.in);
	private Scanner scanner;
	public void run() {
		System.out.println("*************** Thread class that extends Thread *****************");
		try{
			scanner = new Scanner(System.in);
			System.out.println("Please enter any number to check it is prime or not");
			int number=scanner.nextInt();
			
			int flag=0;
            
	           //Logic to check for prime number

	            for(int x=2;x<=number/2;x++){
	            	if(number%x==0){
	            		System.out.println("Number entered is not a prime Number");
	            		flag=1;
	            		break;
	            		
	            	}
	            }
	            
	            if(flag==0){
	            	System.out.println("Number entered is a prime Number");
	            	
	            }
			}catch(Exception e){
			System.out.println(e);
		}
		
	}
	
}

public class Assignment2 {

	public static void main(String[] args) {
		//Extends Thread Example
		MyThread t1 = new MyThread();
		t1.start();
		
		//Implements Runnable Example.
//		MyRunnable t2 = new MyRunnable();
//		Thread runnableThread = new Thread(t2);
//		runnableThread.start();
		


	}

}
