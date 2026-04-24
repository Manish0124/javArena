import java.util.ArrayList;
import java.util.Arrays;

public class Mergesorting {

    public static void mergeSort(int[] arr , int start , int end){

        if(start>=end) return;

        int mid = start + (end - start) / 2;
        mergeSort(arr, start, mid); //left part
        mergeSort(arr, mid+1, end); //right part
        

        //merge part
        merge(arr, start, mid, end);

        

    }

   public static void merge(int[] arr, int start , int mid ,int end){
    
        ArrayList<Integer> list = new ArrayList<>();

         int i = start;
         int j = mid+1;
 
         while(i<=mid && j<=end){
            if(arr[i]<arr[j]){
                list.add(arr[i]);
                i++;
            }else{
                list.add(arr[j]);
                j++;
            }
         }
         
         //remaining element in left side
         while(i<=mid){
             list.add(arr[i]);
             i++;
            }
            
            //remaining element in right side
         while(j<=end){
             list.add(arr[j]);
             j++;
         }
          
         for(int k = 0 ; k< list.size(); k++){
                arr[start+k] = list.get(k);
         }

   }

     



    public static void main(String[] args) {
        
        int[] arr = {12 , 4, 23, 89,1};

        mergeSort( arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));

    }
}