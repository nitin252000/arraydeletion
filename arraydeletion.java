import java.util.Arrays;
import java.util.Scanner;

public class arraydeletion {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int[]ar=new int[m];
        for(int i=0;i<ar.length;i++ )
        {
            ar[i]=sc.nextInt();
        }

        int rem=sc.nextInt();
        for(int i=0;i<ar.length;i++) {
            if(ar[i]==rem){
                ar[i]=ar[i+1];
                continue;}
            System.out.print(ar[i]+" ");}}
        }