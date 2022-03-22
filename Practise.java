import java.util.Scanner;

public class Practise {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        int n = iScanner.nextInt();
        boolean[] prime = new boolean[n+1];
        for(int i=2;i<=n;i++)
        prime[i] = true;

        for(int i=2;i*i<=n;i++){
            if(prime[i]==true)
                {
                    for(int j = i*i;j<=n;j=j+i){
                        prime[j] = false;
                    }
                }
        }
        // if(prime[n]==true)
        // System.out.println("PRIME");
        // else
        // System.out.println("NON PRIME");
        int count = 0;
        			for(int i = 0;i<=n;i++) {
				if(prime[i] ==true)
				count++;
			}
            System.out.println(count);
    }
}
