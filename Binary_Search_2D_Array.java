Binary Search on 2D Array.
import java.util.Scanner;
import java.util.*;
class Arrays{
    public static int BinarySearch(int[] arr){
        Scanner sc=new Scanner(System.in);
        int f=0,l=arr.length-1,mid=0;
        System.out.println("Enter the number you want to Search  ");
        int x=sc.nextInt();
        while(f<=l){
             mid=(f+l)/2;
             if(arr[mid]==x){
                return mid;
             }
             if(arr[mid]<x){
                f=mid+1;
             }
             if(arr[mid]>x){
                l=mid-1;
             }
        }
        return-f;
    }
    public static void main(String[] args) {
        int [][] ar={{1,2,3,4},{5,6,7,8}}; 
        int[] arr=new int[8];
        int count=0;
        for(int i=0;i<2;i++){
            for(int j=0;j<4;j++){
             arr[count]=ar[i][j];
             count++;
            }
        }
        java.util.Arrays.sort(arr);

    System.out.println("Binary Search   "+BinarySearch(arr));
    }
    
}
