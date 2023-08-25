package StarPattern;

public class ReverseString {

	public static void main(String[] args) {
		String s="Automation",rev="";
		char ch;
		int length=s.length();
		System.out.println(length);
		
		for(int i=0; i<length; i++) {
			ch=s.charAt(i);
			rev=ch+rev;
		}
		System.out.println("Reversed string is: " +rev);
	}
}
