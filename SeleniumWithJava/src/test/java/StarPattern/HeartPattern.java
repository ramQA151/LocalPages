package StarPattern;

public class HeartPattern {
		  public static void main(String[] args) {
		    // heart star pattern
		    int size = 6;

		    for (int i = size / 2; i < size; i += 2) {
		      // print first spaces
		      for (int j = 1; j < size - i; j += 2) {
		        System.out.print(" ");
		      }
		      // print first stars
		      for (int j = 1; j < i + 1; j++) {
		        System.out.print("*");
		      }
		      // print second spaces
		      for (int j = 1; j < size - i + 1; j++) {
		        System.out.print(" ");
		      }
		      // print second stars
		      for (int j = 1; j < i + 1; j++) {
		        System.out.print("*");
		      }
		      System.out.println();
		    }
		    // lower part
		    // inverted pyramid
		    for (int i = size; i > 0; i--) {
		      for (int j = 0; j < size - i; j++) {
		        System.out.print(" ");
		      }
		      for (int j = 1; j < i * 2; j++) {
		        System.out.print("*");
		      }
		      System.out.println();
		    }
		  }
		}
