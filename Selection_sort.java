class Arrays{
    public static void SelectionSort(int[] arr){
        int min,temp=0;
for(int i=0;i<arr.length;i++){
min=i;
for(int j=i+1;j<arr.length;j++){
    if(arr[j]<arr[min]){
        min=j;
    }
}
temp=arr[i];
arr[i]=arr[min];
arr[min]=temp;
}
for(int i=0;i<arr.length;i++){
    System.out.print(arr[i]+" ");
}
    }
    public static void main(String[] args){
        int[] arr={4,7,9,6,3,2,8,1,5};
        SelectionSort(arr);
    }
}