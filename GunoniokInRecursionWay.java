import java.util.Scanner;

public class GunoniokInRecursionWay {

	public static void main(String[] args) {
		Scanner inScanner = new Scanner(System.in);
		int a = inScanner.nextInt();
		int b = inScanner.nextInt();
		int c = inScanner.nextInt();
		
		int temp;
		if(b>a) {
			temp =a;
			a= b;
			b =temp;
		}
		b= recursion(a, b);
		System.out.print(recursion(b,c));

	}

	private static int recursion(int a, int b) {
		if(a%b==0)
			return b;
		else
		return	recursion(b, a%b);
	}

}
