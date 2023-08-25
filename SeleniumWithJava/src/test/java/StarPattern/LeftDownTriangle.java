package StarPattern;

public class LeftDownTriangle {

		  public static void main(String[] args) {
			 

				    // size of the triangle
				    int size = 5;
				    for (int i = 0; i < size; i++) {
				      // print stars
				      for (int j = 0; j < size - i; j++) {
				        System.out.print("*");
				      }
				      System.out.println();
				    }
				  }
		}

