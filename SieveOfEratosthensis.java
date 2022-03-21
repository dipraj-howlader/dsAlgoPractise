import java.util.Scanner;

public class SieveOfEratosthensis {
	public static void main(String[] args) {
			Scanner s = new Scanner(System.in);
			int n = s.nextInt();
			boolean[] prime = new boolean[n+1];
			for(int i = 2;i<=n;i++)
				prime[i] = true;
			for(int i = 2;i*i<=n;i++) {
				boolean ss = prime[i];
				if(prime[i] == true)
				{	
					for(int j = i*i;j<=n; j = j+i) {
						prime[j] = false;
					}
				}
			}
			// for(int i = 0;i<=n;i++) {
			// 	if(prime[i] ==true)
			// 	System.out.println(i + " ");
			// 	else
			// 	System.out.println("cp");
			// }
			if(prime[n] == true)
			System.out.println("PRIME");
			else
			System.out.println("NOT PRIME");
	}
}
