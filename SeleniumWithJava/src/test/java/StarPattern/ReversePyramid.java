package StarPattern;

public class ReversePyramid {
	
		  public static void main(String[] args) {
		    // size of the pyramid
		    int size = 5;
		    for (int i = 0; i < size; i++) {
		      // print spaces
		      for (int j = 0; j < i; j++) {
		        System.out.print(" ");
		      }
		      // print stars
		      for (int k = 0; k < 2 * (size - i) - 1; k++) {
		        System.out.print("*");
		      }
		      System.out.println();
		    }
		  }
		}
