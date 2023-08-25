package numberPattern;
import java.util.Scanner;

public class PalindromeNumberinJava {
	
	
	  static boolean isPalindrome(String s) {
	    int i = 0;
	    int j = s.length() - 1;
	    while (i < j) {
	      if (s.charAt(i) != s.charAt(j)) {
	        return false;
	      }
	      i++;
	      j--;
	    }
	    return true;
	  }

	  public static void main(String[] args) {
	    // take string as input
	    Scanner sc = new Scanner(System.in);
	    System.out.print("Enter the string: ");
	    String s = sc.nextLine();

	    // call isPalindrome method
	    if(isPalindrome(s)) {
	      System.out.println(s + " is a palindrome");
	    } else {
	      System.out.println(s + " is not a palindrome");
	    }

	    // close scanner
	    sc.close();
	  }
	}