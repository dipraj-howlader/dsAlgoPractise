import java.util.Scanner;

public class BinarySearch {
   public static void main(String[] args) {
       Scanner iScanner =new Scanner(System.in);
       int[] number  = new int[10001];
       for(int i=1;i<10001;i++){
           number[i-1] = i;
       }
       int n = iScanner.nextInt();
       int low=number[0];
       int high = number[9999];
       int index = 0;
       int mid = 10001/2;
       while(low<=high){
            if(n==mid){
                index = mid;
                System.out.println(index);
                low++;
            }
            else if(n>mid){
                low = mid+1;
            }
            else{
                high = mid-1;
            }
            mid = (low+high)/2;
       }
   } 
}
