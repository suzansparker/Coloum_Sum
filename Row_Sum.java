import java.util.Arrays;
import java.util.Scanner;

public class Row_Sum {
    public static int[] Rowsums(int arr[][],int n, int m) {
        int ar[]=new int[n];
        for(int i=0;i<n;i++) {
            int sum=0;
            for(int j=0;j<m;j++)
            {
                sum+=arr[i][j];
            }
            ar[i]=sum;
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
        int value[]=Rowsums(arr,n,m);
        System.out.println(Arrays.toString(value));

    }

}