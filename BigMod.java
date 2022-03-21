import java.util.Scanner;

/**
 * BigMod
 */
public class BigMod {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        int n = iScanner.nextInt();
        int k = iScanner.nextInt();
        int m = iScanner.nextInt();
        System.out.println(FBigMod(n,k,m));
    }
    private static int FBigMod(int base,int power, int mod){
            if(power==0)
            return 1%mod;
        int x = FBigMod(base, power/2, mod);
        // System.out.print(x+" ");
        x = (x*x) % mod;
        if(power%2==1)
            x=(x*base)%mod;
            return x;
    }
}