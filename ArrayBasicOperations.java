//package com.array;
import java.util.InputMismatchException;
public class ArrayBasicOperations {
    
    
    //traverse an array
    public void traverse(int[] array){
        for (int i:array) System.out.print(i+" ");
        System.out.println();
    }
    public void traverse(int[][] array){
        for(int[] i:array){
            for(int j:i){
                System.out.print(j+"    ");
            }
            System.out.println();
        }
    }
    
    
    // insert at the beginning
    public int[] insertAtBeginning(int[] array,int value){
        int[] arr=new int[array.length+1];
        arr[0]=value;
        int i = 1;
        while (i < arr.length) {
            arr[i] = array[i - 1];
            i++;
        }
        return arr;
    }
    
    
    
    // insert at the end
    public int[] insertAtEnd(int[] array,int value){
        int[] arr=new int[array.length+1];
        arr[arr.length-1]=value;
        int i=0;
        while (i<array.length) {
            arr[i] = array[i];
            i++;
        }
        return arr;
    }
    
    
    
    
  // insert at the midle
    public int[] insertAtMid(int[] array,int value){
        int count=0;
        int[] arr=new int[array.length+1];
        int mid=(arr.length-1)/2;
        arr[mid]=value;
        for(int i=0;i<arr.length;i++){
            if(i!=mid){
                arr[i]=array[count];
                count++;
            }
        }
        return arr;
    }
    
    //insert at any position
    public int[] insert(int[] array,int value,int index){
        if(index<0||index>array.length)throw new InputMismatchException("Please provide appropriate index value from 0 to "+array.length);
        int count=0;
        int[] arr=new int[array.length+1];
        arr[index]=value;
        for(int i=0;i< arr.length;i++){
            if(i!=index){
                arr[i]= array[count];
                count++;
            }
        }
        return arr;
    }
    
    
    
    // check weather the array is in ascending order or not
    public boolean isAscending(int[] array){
        for(int i=0;i<array.length-1;i++)if(array[i]>array[i+1])return false;
        return true;
    }
    
    
    
    // check weather the array is in Descending order or not
    public boolean isDescending(int[] array){
        for(int i=0;i<array.length-1;i++)if(array[i]<array[i+1])return false;
        return true;
    }
    
    
    
    // check weather the array is sorted or not
    public boolean isSorted(int[] array){
        return isAscending(array)||isDescending(array);
    }
    
    
    // search any particular element using linear search
    public int linearSearch(int[] array,int target){
        for(int i=0;i<array.length;i++) if(array[i]==target)return i;
        return -1;
    }
    
    
    
    //Binary search
    public int binarySearch(int[] array,int target){
        if(!isSorted(array))throw new InputMismatchException("Array must be sorted");
        int p=0,q=array.length-1;
        int mid;
        while (p<q){
            mid=(p+q)/2;
            if(array[mid]==target)return mid;
            else if(array[mid]>target)q=mid-1;
            else p=mid+1;
        }
        return -1;
    }
    
    
    
    // delete first index
    public int[] deleteFirstIndex(int[] array){
        int[] arr=new int[array.length-1];
        int i=1;
        while (i<array.length) {
            arr[i-1]=array[i];
            i++;
        }
        return arr;
    }
    
    
    // delete midle index
    public int[] deleteMidIndex(int[] array){
        int[] arr=new int[array.length-1];
        int count=0;
        for(int i=0;i<array.length;i++)if(i!=(array.length-1)/2){
            arr[count]=array[i];
            count++;
        }
        return arr;
    }
    
    
    
    // delete last index
    public int[] deleteLastIndex(int[] array){
        int[] arr=new int[array.length-1];
        int i=0;
        while (i<array.length-1) {
            arr[i]=array[i];
            i++;
        }
        return arr;
    }
    
    
    
    // delete any index
    public int[] deleteAnyIndex(int[] array,int index){
        if(index<0||index>array.length-1)throw new InputMismatchException("Index must be from 0 to "+(array.length-1));
        int count=0;
        int[] arr=new int[array.length-1];
        for(int i=0;i<array.length;i++)if(i!=index){
            arr[count]=array[i];
            count++;
        }
        return arr;
    }
    
    
    
    // delete targeted element
    public int[] delete(int[] array,int target){
        int index=linearSearch(array,target);
        int[] arr=new int[array.length-1];
        int count=0;
        if(index<0)return array;
       else {
           for(int i=0;i<array.length;i++)if(i!=index){
               arr[count]=array[i];
               count++;
           }
        }
       return arr;
    }
    
    
    // update  value
    public void update(int[] array,int target,int replacement){
        int index=linearSearch(array,target);
        if(index>=0)array[index]=replacement;
    }
    
    
    // resize an array
    public int[] resize(int[] array,int newSize){
     if(newSize<array.length+1)throw new InputMismatchException("New size must be more than old size i.e greater than: "+array.length) ;
     int[] arr=new int[newSize];
        int i=0;
        while (i<array.length) {
            arr[i]=array[i];
            i++;
        }
     return arr;
    }
    
    
    //Reverse an array
    public void reverse(int[] array){
        for(int i=0;i<array.length/2;i++){
            int temp=array[i];
            array[i]=array[array.length-1-i];
            array[array.length-1-i]=temp;
        }
    }
    
    
    
    // find the lowest element in the array
    public int lowest(int[] array){
        int lowest=0;
        for(int i=1;i<array.length;i++)if(array[lowest]>array[i])lowest=i;
        return lowest;
    }
    
    
    //find the highest element in the array
    public int highest(int[] array){
        int highest=0;
        for(int i=1;i<array.length;i++)if(array[highest]<array[i])highest=i;
        return highest;
    }
    
    
    // convert two dimensional array to one dimensional array
    public int[] convert(int[][] array){
        int[] arr=new int[array.length*array[0].length];
        int count=0;
        for(int[] i:array){
            for(int j:i){
                arr[count]=j;
                count++;
            }
        }
        return arr;
    }
    
    
    
    // copy an array
    public int[] copy(int[] array){
        int[] arr=new int[array.length];
        int i=0;
        while (i<array.length) {
            arr[i]=array[i];
            i++;
        }
        return arr;
    }
   
