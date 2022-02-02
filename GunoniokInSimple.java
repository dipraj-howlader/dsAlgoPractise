import java.util.Scanner;

public class GunoniokInSimple {

	public static void main(String[] args) {
		Scanner inScanner = new Scanner(System.in);
		int a = inScanner.nextInt();
		int b = inScanner.nextInt();
		int temp;
		int c;
		if(b>a) {
			temp =a;
			a= b;
			b =temp;
		}
		if(a%b==0)
			System.out.print(b);
		else {
		while(a%b!=0) {
			c = a%b;
			a=b;
			b=c;
		}
		System.out.print(b);
		}
			
		
	}

}
