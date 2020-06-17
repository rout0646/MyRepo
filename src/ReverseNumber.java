
public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int reverse=0,n =6767;
		while(n != 0)
	    {
	      reverse = reverse * 10;
	      reverse = reverse + n%10;
	      n = n/10;
	    }

	    System.out.println("Reverse of the number is " + reverse);

	}

}
