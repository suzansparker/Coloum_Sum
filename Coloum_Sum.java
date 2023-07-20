import java.util.Arrays;
import java.util.Scanner;

public class Coloum_Sum {
    public static int[] Columsums(int arr[][],int n, int m) {
        int ar[]=new int[m];
        for(int j=0;j<m;j++) {
            int sum=0;
            for(int i=0;i<n;i++)
            {
                sum=sum+arr[i][j];
            }
            ar[j]=sum;
        }
        return ar;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int arr[][]=new int[n][m];
        for(int i=0;i<n;i++) {
            for(int j=0;j<m;j++) {
                arr[i][j]=sc.nextInt();
            }
        }
        int value[]=Columsums(arr,n,m);
        System.out.println(Arrays.toString(value));

    }

}