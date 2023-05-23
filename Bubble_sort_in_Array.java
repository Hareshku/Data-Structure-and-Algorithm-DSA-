//Bubble sort 
class Arrays{
    public static void Bubble_Sort(int[] arr){
        int temp=0;
    for(int i=0;i<arr.length-1;i++){
    for(int j=0;j<arr.length-i-1;j++){
        if(arr[j]>arr[j+1]){
         temp=arr[j];
         arr[j]=arr[j+1];
         arr[j+1]=temp;
        }
    }
    }
    for(int i=0;i<arr.length;i++){
        System.out.print(arr[i]+" ");
    }
    }
    public static void main(String[] args) {
        int[] arr={4,6,8,9,3,5,1,2};
         Bubble_Sort(arr);
    }
}