package assprg;

import java.util.Scanner;

class Largest3numbers {
	int a,b,c;//instance variable
	
	void inputdata() {
		// accept the value from user
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the numbers");
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		
	}
	 
	void performalLargest() {
		if(a>b && a>c)
		{
			System.out.println("the large num is "+a+","+b+"and"+c+"is"+a);
		}
		else if(b>a && b>c) {
			System.out.println("the large num is "+a+","+b+"and"+c+"is"+b);
		}
		else {
			System.out.println("the large num is "+a+","+b+"and"+c+"is"+c);
			
		}
	
	}



	public class Largest{
	
	
	public static void main(String[] args) {
		Largest3numbers ob=new Largest3numbers();
		ob.inputdata();
		ob.performalLargest();
		
		
		 }
	}
}

	

