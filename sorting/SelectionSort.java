import java.util.Scanner;

public class SelectionSort {
    
    // selection sort function
    static int[] sort(int[] arr,int length){
        int minIndex;
        int i,j;
        int temp;
        for(i=0;i<length-1;i++){
            minIndex=i;

            for(j=i+1;j<length;j++) if(arr[minIndex]>arr[j]) minIndex=j;

            // swap arr[i] and arr[minIndex]
            temp=arr[i];
            arr[i]=arr[minIndex];
            arr[minIndex]=temp;
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
