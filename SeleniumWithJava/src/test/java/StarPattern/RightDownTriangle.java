package StarPattern;

public class RightDownTriangle {
		  public static void main(String[] args) {

		    // size of the triangle
		    int size = 5;
		    for (int i = 0; i < size; i++) {
		      // print spaces
		      for (int j = 0; j < i; j++) {
		        System.out.print(" ");
		      }
		      // print stars
		      for (int j = size; j > i; j--) {
		        System.out.print("*");
		      }
		      System.out.println();
		    }
		  }
		}

