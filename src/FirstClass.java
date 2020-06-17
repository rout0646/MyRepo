
public class FirstClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String original, reverse = "";
	    original = "Education";
	    int length = original.length();

	    for (int i = length - 1 ; i >= 0 ; i--)
	      reverse = reverse + original.charAt(i);

	    System.out.println("Reverse of the string: " + reverse);
	    
	    
	}

}
