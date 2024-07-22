import java.util.Scanner;

import static java.util.Collections.swap;

public class BubbleShortAlgorithem {
     public  static int[] shortArray(int[] arr){
         for(int i=0;i<arr.length;i++){
             for(int j=1;j<arr.length;j++){
                 if(arr[i]>arr[j]){
                     int temp=arr[j];
                     arr[j]=arr[i];
                     arr[i]=temp;

                 }
             }
         }
         return arr;
     }
     public static void printArray(int[]arr1){
         for(int i=0;i<arr1.length;i++){
             System.out.println(arr1[i]);
         }
     }

    public static void main(String[] args) {
        int[]arr={5,6,2,4,6,4,6,1};
//        Scanner sc=new Scanner(System.in);
//        System.out.println("Enter the array=");
//        arr= new int[]{sc.nextInt()};
////        int [] arr1=shortArray(arr);
//
        for(int i=0;i<arr.length-1;i++){
            boolean flag=false;
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j]<arr[j+1]){
                  int temp=arr[j];
                  arr[j]=arr[j+1];
                  arr[j+1]=temp;
                  flag=true;

                }
            }
            if(flag==false) break;
        }
        printArray(arr);

    }
}
