package Secenario_based_questions;
/*A warehouse stores item quantities in an array. Find the max, min,
total stock, and detect duplicates. Extend: rotate the stock array by
k positions (simulate daily shift handover), and transpose a 2D shelf
grid.*/

import java.util.*;
public class stocks {

    public static void min_max(int[]arr){
        int min = arr[0];
        int max = arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]<min){
                min=arr[i];
            }
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println(min);
        System.out.println(max);
    }
    public static void total(int[] arr){
        int sum = 0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
    }
    public static void search(int[]arr,int t){
        boolean f=false;
        for(int i:arr){
            if(i==t){
                System.out.println("found at:"+i);
                f=true;
                break;
            }
        }
        if(!f)
        System.out.println("not found");
    }
    public static void dupl(int[] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    System.out.print(arr[i]+" ");
                    break;
                }
            }
        }
    }
    public static String rotate(int[]arr,int k){
        int[] res = new int[arr.length];
        for(int i=0;i<arr.length;i++){
            res[(i+k)%arr.length]=arr[i];
        }
        return Arrays.toString(res);
    }

    public static void main(String[] args){
        int[] stocks = {45,20,60,20,90,15,60};
        min_max(stocks);
        total(stocks);
        search(stocks, 20);
        dupl(stocks);
        System.out.println(rotate(stocks,4));
    }
    
}
