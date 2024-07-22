

public class Selectionshort {

    public static void selectionShort(int[] arr){
        int length=arr.length;
        for(int i=0;i<length-1;i++){
            int min_index=i;
            for(int j=i+1;j<length;j++){
                if(arr[min_index]>arr[j]){
                    min_index=j;
                }
            }
            int temp=arr[i];
            arr[i]=arr[min_index];
            arr[min_index]=temp;

        }

    }


    public static void main(String[] args) {

         int arr[]={7,5,4,1,3};
         selectionShort(arr);

  for(int a:arr){
      System.out.println(a);
  }
    }
}
