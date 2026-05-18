import java.util.Scanner;
public class numOfIndexOccur{
    public static int numOfIndexOccur(int[] ar, int k){
        int count = 0;
        int index = 0;
        for(int i=0;i<ar.length;i++){
            if(ar[i]==k){
                count++;
                index = i;
            }
        }
        return count;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] ar = new int[n];

        for(int i=0;i<ar.length;i++){
            ar[i]= scan.nextInt();
        }
        int k = scan.nextInt();
        int result = numOfIndexOccur(ar,k);
        System.out.println(result);
    }
}