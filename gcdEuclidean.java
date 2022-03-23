import java.util.Scanner;

/**
 * gcdEuclidean
 */
public class gcdEuclidean {

    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        int num1 = iScanner.nextInt();
        int num2= iScanner.nextInt();
        int gcd = gcdFindOut(num1,num2);
        System.out.println(gcd);
    }
    private static int gcdFindOut(int num1,int num2){
        if(num1%num2==0)
        return num2;
        return gcdFindOut(num2, num1%num2);
    }
}