import java.util.Scanner;

public class BubbleSort {
    
    // BubbleSort sort function
    static int[] sort(int arr[],int length){

     for(int i=0;i<length;i++){
         for(int j=0;j<length-1;j++){
             if(arr[j]>arr[j+1]){
                 arr[j]=arr[j]+arr[j+1];
                 arr[j+1]=arr[j]-arr[j+1];
                 arr[j]=arr[j]-arr[j+1];
             }
         }
     }
     return arr;
    }

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int i;
        int n=scan.nextInt();
        int[] arr=new int[n];
        for(i=0;i<n;i++) arr[i]=scan.nextInt();
        arr=sort(arr,n);
        for(int z:arr){
            System.out.println(z);
        }
    }
}
