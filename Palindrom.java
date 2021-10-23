//Check if a number is palindrom or not

import java.util.*;
class Palindrom {  
  public static void main(String args[]) { 

	  Scanner sc = new Scanner(System.in);
	  System.out.println("Enter a number");
	  int n = sc.nextInt();
	  sc.close();
	  checkPa(n);

  }

	public static int revANumber(int n){
		int rem, rev =0;
		while(n != 0){
			rem = n%10;
			rev = rev * 10 + rem;
			n = n / 10;
		}
		return rev;
	}
	
	public static void checkPa(int n){
		if(revANumber(n) == n){
			System.out.println("Number is palindrom");
		}else{
			System.out.println("Number is not palindrom");
		}
	}
}
