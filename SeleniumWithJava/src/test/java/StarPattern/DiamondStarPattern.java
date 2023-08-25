package StarPattern;

public class DiamondStarPattern {
		  public static void main(String[] args) {
		    int size = 5;
		    // upside pyramid
		    for (int i = 1; i <= size; i++) {
		      // printing spaces
		      for (int j = size; j > i; j--) {
		        System.out.print(" ");
		      }
		      // printing star
		      for (int k = 0; k < i * 2 - 1; k++) {
		        System.out.print("*");
		      }
		      System.out.println();
		    }
		    // downside pyramid
		    for (int i = 1; i <= size - 1; i++) {
		      // printing spaces
		      for (int j = 0; j < i; j++) {
		        System.out.print(" ");
		      }
		      // printing star
		      for (int k = (size - i) * 2 - 1; k > 0; k--) {
		        System.out.print("*");
		      }
		      System.out.println();
		    }
		  }
		}