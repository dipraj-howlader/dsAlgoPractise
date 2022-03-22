import java.util.Scanner;

public class BigMod2 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        long base = iScanner.nextLong();
        long power = iScanner.nextLong();
        long mod = iScanner.nextLong();
        long finalMod = BigModulas(base,power,mod);
        System.out.println(finalMod);
    }

    private static long BigModulas(long base, long power, long mod) {
        if(power==0)
        return 1;
        else if(power%2!=0){
            long a = base;
            long b = BigModulas(base, power-1, mod)%mod;
            return (a*b)%mod;
        }  
        else {
            long b = BigModulas(base, power/2, mod)%mod;
            return (b*b)%mod;
        }
    }
}
