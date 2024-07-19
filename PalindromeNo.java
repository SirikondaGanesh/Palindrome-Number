//Implimenting a java program using Palindrome number
//package declaration
package apjfsa;
import java.util.*;
//class declaration
public class PalindromeNo {
	//method declaration
	public static boolean isPalindrome(int n) {
		//local variables
		int value=0,original=n;
		//while loop
		while(n!=0) {
			int rem=n%10;
			value=(value*10)+rem;
			n /=10;	
		}  
		return original==value;
	}
	//Main function
	public static void main(String[] args) {
		int n;
		System.out.println("Enter A Palindrome Number :");
		//Reading input for n from console
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt(); 
		//if statement
		if(isPalindrome(n)) 
			 System.out.println(n+" It is a Palindrome");
		else  
			 System.out.println(n+" It is not a Palindrome"); 
		//Calling method
		isPalindrome(n);
	}

}
