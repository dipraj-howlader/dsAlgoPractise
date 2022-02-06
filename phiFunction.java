import java.util.Scanner;

public class phiFunction {
	public static void main(String[] args) {
		Scanner inScanner = new Scanner(System.in);
		int n = inScanner.nextInt();
			System.out.print(phi(n));
			}

	private static int phi(int n) {
		int result = n;
		for(int i=2;i*i<=n;i++) {
			if(n%i==0) {
				while(n%i==0)
					n=n/i;

				result = result - result/i;
			}
		}
			if(n>1)
				result = result - result/n;		
			return result;
		}
	}
